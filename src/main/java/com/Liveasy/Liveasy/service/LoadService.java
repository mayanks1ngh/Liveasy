package com.Liveasy.Liveasy.service;

import java.util.List;
import com.Liveasy.Liveasy.entity.loads;
public interface LoadService {
	
   public List<loads> getloads();
   public loads getloads( long ShipperId);
   public loads addloads(loads loads);
public loads updateloads(loads loads);
public void deleteloads(long parseLong);
}
