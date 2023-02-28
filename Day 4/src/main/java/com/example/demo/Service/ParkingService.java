package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Parking;
import com.example.demo.Repository.ParkingRepository;

@Service
public class ParkingService {
	
	@Autowired
	
	private ParkingRepository repo;
	
	public Parking addparking(Parking obj)
	{
		return repo.save(obj);
	}
	
	
	public List<Parking>getAllParking()
	{
		return repo.findAll();
	}
	
	public String delete(int Allot_No)
	{
		repo.deleteById(Allot_No);
		return"deleted";
	}
	
	public Parking update(int Allot_No,Parking obj)
	{
		return repo.saveAndFlush(obj);
	}	

}
