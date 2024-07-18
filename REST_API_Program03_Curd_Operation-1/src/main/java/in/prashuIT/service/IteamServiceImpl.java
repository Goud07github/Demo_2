package in.prashuIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prashuIT.binding.Iteam;
import in.prashuIT.repo.IteamRepo;

@Service
public class IteamServiceImpl implements IteamService {

	@Autowired
	private IteamRepo iteamRepo;
	
	@Override
	public String upsert(Iteam iteam) {
		iteamRepo.save(iteam);
		return "iteam is save";
	}

	@Override
	public Iteam getById(Integer id) {
		Optional<Iteam> findByid = iteamRepo.findById(id);
		
		if( findByid.isPresent()) {
		   return findByid.get();
	     }
		return null;
	}
	@Override
	public List<Iteam> getAllIteams() {
		return iteamRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if( iteamRepo.existsById(id)) {
			iteamRepo.deleteById(id);
			return "iteam Delete Sucessfully";
	    }else {
	    	return "iteam is not deleted";
	    }
		
	}

}
