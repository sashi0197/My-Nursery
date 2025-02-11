package com.sprint1.plantnursery.service;

import com.sprint1.plantnursery.entity.Plant;
import com.sprint1.plantnursery.entity.Seed;
//import com.sprint.onlineplantnursery.exception.SeedIdNotFoundException;

import java.util.List;
import java.util.Map;

/*Controller Class for Seed Controller*/

public interface ISeedService {

	Seed addSeed(Seed seed);
	Seed updateSeed(Seed seed, int id);
	Seed deleteSeedById(int id);
	Seed getSeed(int id);
	List<Seed> getAllSeeds();
	
	
}
