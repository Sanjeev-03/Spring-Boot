package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Parking;
import com.example.demo.Service.ParkingService;

@RestController
public class ParkingController {
	@Autowired
	
	private ParkingService parkserv;
	
	@PostMapping("/add")
	public Parking addPark(@RequestBody Parking obj)
	{
		return parkserv.addparking(obj);
	}
	
	@GetMapping("/show")
	public List<Parking> getParking()
	{
		List<Parking>arr=new ArrayList<>();
		arr=parkserv.getAllParking();
		return arr;
	}
	
	@DeleteMapping("/delete/{Allot_No}")
	public void delete(@PathVariable int Allot_No)
	{
		parkserv.delete(Allot_No);
	}
	
	@PutMapping("/update/{Allot_No}")
	public Parking update(@PathVariable int Allot_No,@RequestBody Parking obj)
	{
		return parkserv.update(Allot_No, obj);
	}

}
