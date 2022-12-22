package com.nangcho.prac.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nangcho.prac.entity.QuestionBoard;



public interface QBoardRepository extends JpaRepository<QuestionBoard, Integer> {

	public List<QuestionBoard> findBySubject(String subject);

}
