package com.nangcho.prac.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.nangcho.prac.entity.AnswerBoard;
import com.nangcho.prac.entity.QuestionBoard;
import com.nangcho.prac.repository.ABoardRepository;
import com.nangcho.prac.repository.QBoardRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application_test.properties")
public class TestABoard {

	@Autowired
	private QBoardRepository qBRepository;

	@Autowired
	private ABoardRepository aBRepository;
	
	@Test
	@DisplayName("답변 저장 테스트")
	public void Test1() {
		
		Optional<QuestionBoard> oqb1= qBRepository.findById(6);
		assertTrue(oqb1.isPresent());
		
		QuestionBoard qb1= oqb1.get();
		
		AnswerBoard aBoard = new AnswerBoard();
		
		aBoard.setContent("글이 몇개야");
		aBoard.setQuestionBoard(qb1);
		
		aBRepository.save(aBoard);
		
		
	}
	@Test
	@DisplayName("답변 조회 테스트")
	public void Test2() {
	
		Optional<AnswerBoard> oAboard = aBRepository.findById(8);
		assertTrue(oAboard.isPresent());
		AnswerBoard aBoard = oAboard.get();
		
		assertEquals(2, aBoard.getQuestionBoard().getId());//질문글의 아이디를 가져와 확인
	}
	
}
