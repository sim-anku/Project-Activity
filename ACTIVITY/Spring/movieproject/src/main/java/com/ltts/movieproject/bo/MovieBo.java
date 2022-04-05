package com.ltts.movieproject.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.movieproject.model.Movie;
@Repository
public interface MovieBo extends JpaRepository<Movie,Integer>{

}
