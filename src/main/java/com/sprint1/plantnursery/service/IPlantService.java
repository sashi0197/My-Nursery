package com.sprint1.plantnursery.service;

import java.util.List;

import com.sprint1.plantnursery.entity.Plant;

/*Service Interface for Plant*/

public interface IPlantService {
	
	Plant addNewPlant(Plant plant);
	
	Plant updatePlant(Plant plant, int id);
	
	Plant deletePlant(int plantId);
	
	Plant getPlant(int plantId);
	
	
	
	List<Plant> getAllPlants();
	
	

}
