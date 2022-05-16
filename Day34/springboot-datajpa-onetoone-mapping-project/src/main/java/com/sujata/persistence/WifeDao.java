package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Wife;

@Repository
public interface WifeDao extends JpaRepository<Wife, String> {

}
