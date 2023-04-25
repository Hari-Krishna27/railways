package com.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.review.model.RailWay;
import com.review.repository.RailWayRepository;

@Service
public class RailWayService 
{


	@Autowired
	RailWayRepository rr;
	public List<RailWay> getAllDetails()
	{
		return rr.findAll();
	}
	
	public RailWay postDetails(@RequestBody RailWay id) {
		
		return rr.save(id);
	}
	public RailWay putDetails(@RequestBody RailWay iid) {
		
		return rr.save(iid);
	}
	
	public RailWay getDetailsById(@PathVariable int id) {
		
		return rr.findById(id).orElse(null);
	}
	
	public void deleteById(@PathVariable int id) {
		
		rr.deleteById(id);
	}
}
