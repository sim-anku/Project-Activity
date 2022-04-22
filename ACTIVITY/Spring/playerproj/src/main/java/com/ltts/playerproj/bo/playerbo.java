package com.ltts.playerproj.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.playerproj.model.player;

@Repository
public interface playerbo extends JpaRepository<player,Integer>{
	
}
