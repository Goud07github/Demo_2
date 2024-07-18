package in.prashuIT.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.prashuIT.binding.Iteam;
import in.prashuIT.service.IteamService;

@RestController
public class IteamRestController {
	
	@Autowired
	private IteamService iteamService;
	
	@PostMapping(
			value = "/Iteam",
			produces = "application/json"
	)
	public ResponseEntity<String> createIteam( @RequestBody Iteam iteam) {
		String st= iteamService.upsert(iteam);
		return new ResponseEntity<>("record is save",HttpStatus.CREATED);
		
	}
	@GetMapping(value = "/Iteam/{id}")
	public ResponseEntity<Iteam> getIteam(@PathVariable Integer id){
		Iteam iteam = iteamService.getById(id);
		return new ResponseEntity<>(iteam,HttpStatus.OK);
		
	}
	@GetMapping(value = "/Iteams")
	public ResponseEntity<List<Iteam>> getAllIteams(Iteam iteam){
		List<Iteam> list= iteamService.getAllIteams();
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	@DeleteMapping(value = "/Iteam/{id}")
	public ResponseEntity<String> deleteById( @PathVariable("id") Integer id){
		String st = iteamService.deleteById(id);
		return new ResponseEntity<>("iteam is deleted",HttpStatus.OK);
		
	}
	@PutMapping("/Iteam")
	public ResponseEntity<String> upsertIteam( @RequestBody Iteam iteam){
		String st = iteamService.upsert(iteam);
		return new ResponseEntity<>("iteam is updated",HttpStatus.OK);
		
	}

}
