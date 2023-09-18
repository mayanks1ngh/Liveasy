package com.Liveasy.Liveasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Liveasy.Liveasy.dao.loadsDao;
import com.Liveasy.Liveasy.entity.loads;

@Service
public class LoadserviesImpl implements LoadService
{
	@Autowired
	private loadsDao Dao;
	public LoadserviesImpl()
	{
		}

	@Override
	public List<loads> getloads()
	{
	
		return Dao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public loads getloads(long ShipperId)
	{
	
		   return Dao.getOne(ShipperId);
	
	}

	@Override
	public loads addloads(loads loads) 
	{
		//list.add(loads);
	    Dao.save(loads);
		return loads;
	}
	@Override
	public loads updateloads(loads loads)
	{
	
		Dao.save(loads);
		return loads;
		}
		
	@Override
	public void deleteloads(long parseLong)
	{
	Dao.deleteById(parseLong);
	}
	
	}


