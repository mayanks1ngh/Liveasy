package com.Liveasy.Liveasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Liveasy.Liveasy.entity.loads;
@Repository
public interface loadsDao  extends JpaRepository<loads, Long>
{

}
