package com.Liveasy.Liveasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import com.Liveasy.Liveasy.entity.loads;
import com.Liveasy.Liveasy.service.LoadService;

@RestController
public class MyController 

{
	@Autowired
	private LoadService loadservies;

       //get the loads
	@GetMapping("/loads")
	public List<loads> getloads()
	{
		return this.loadservies.getloads();
	}
	@GetMapping("/loads/{ShipperId}")
	public loads getloads(@PathVariable String ShipperId)
	{
		return this.loadservies.getloads(Long.parseLong(ShipperId));
	}
	@PostMapping("/loads")
	public loads addloads(@RequestBody loads loads)
	{
		return this.loadservies.addloads(loads);
	}
	@PutMapping("/loads")
		public loads updateloads(@RequestBody loads loads)
		{
		return this.loadservies.updateloads(loads);
	}
	
	@DeleteMapping("/loads/{ShipperId}")
	public ResponseEntity<HttpStatus> deleteloads(@PathVariable String  ShipperId)
	{
		try {
			((LoadService) this.loadservies).deleteloads(Long.parseLong(ShipperId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception load)
		{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

