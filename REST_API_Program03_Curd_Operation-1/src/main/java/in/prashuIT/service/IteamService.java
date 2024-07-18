package in.prashuIT.service;

import java.util.List;

import in.prashuIT.binding.Iteam;

public interface IteamService {
	
	public String upsert(Iteam iteam); 
	
	public Iteam getById(Integer id);
	
	public List<Iteam> getAllIteams();
	
	public String deleteById( Integer id);


	

	
	
}
