package com.covid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.IdCard;

public interface IdCardRepository extends JpaRepository<IdCard, Integer>{

}
