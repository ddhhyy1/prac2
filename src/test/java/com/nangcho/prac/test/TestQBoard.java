package com.nangcho.prac.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
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



//@SpringBootTest
//@TestPropertySource(locations = "classpath:application_test.properties")
//public class TestQBoard {
//
//	@Autowired
//	QBoardRepository qBoardRepository;
//	
//	@Test
//	@DisplayName("저장 테스트")
//	public void createQuestion() {
//		
//		
//		QuestionBoard qBoard = new QuestionBoard();
//		
//		qBoard.setSubject("원붕이 강림");
//		qBoard.setContent("원붕이 불금킷타");
//	
//		qBoardRepository.save(qBoard);
//	}

@SpringBootTest
@TestPropertySource(locations = "classpath:application_test.properties")
public class TestQBoard {

	@Autowired
	QBoardRepository qBoardRepository;
	
	@Autowired
	private ABoardRepository aBRepository;
	
	@Test
	@DisplayName("저장 테스트")
	public void createQuestion() {
		
		
		QuestionBoard qBoard = new QuestionBoard();
		
		qBoard.setSubject("SnowFlakesMemories");
		qBoard.setContent("시로이 유키오 하즈마세테~~");
	
		qBoardRepository.save(qBoard);
	}
//	@Test
//	@DisplayName("조회")
//	public void searchQuestion() {
//		
//		
//		List<QuestionBoard> qAll= qBoardRepository.findAll();
//		assertEquals(2, qAll.size());//실제 모든 글의 개수와 기대한 값인 2개가 일치하는지 여부
//		
//		QuestionBoard q1= qAll.get(1);
//		assertEquals("원붕이 불금킷타", q1.getSubject());
//		
//		
//		
//	}
//	@Test
//	@DisplayName("조회2")
//	public void searchQuestion2() {
//		
//		
//		Optional<QuestionBoard> qBoard= qBoardRepository.findById(1);
//		
//		if(qBoard.isPresent()) {
//		QuestionBoard q1= qBoard.get();
//		
//		assertEquals("원붕이 불금킷타", q1.getSubject());
//		
//		
//		}
//		}
	
//	@Test
//	@DisplayName("조회2")
//	public void searchQuestion3() {
//		
//		
//		List<QuestionBoard> qBoards= qBoardRepository.findBySubject("ahoy"); //ahoy라는 제목인 글을 전부 가져온다
//		QuestionBoard q1= qBoards.get(0);  //그중 0번쨰 녀석을 받아와 q1에 저장
//		
//		
//		assertEquals(2, q1.getId());//q1의 아이디가 2와 같은지 확인.
//		
//		
//	
//		}
//	@Test
//	@DisplayName("조회3")
//	public void searchQuestion4() {
//		
//		
//		List<QuestionBoard> qAll= qBoardRepository.findBySubject("ahoy");
//		assertEquals(3, qAll.size());//실제 모든 글의 개수와 기대한 값인 2개가 일치하는지 여부
//		
//		
//		
//	
//		}
	
//	@Test
//	@DisplayName("조회4")
//	public void searchQuestion5() {
//		
//		
//		Optional<QuestionBoard> qAll= qBoardRepository.findById(2); //2번인 아이디의 글을 객체로서 가져옴
//		QuestionBoard q1=qAll.get(); //객체 상태의 녀석을 겟해서 q1에 저장
//	
//		q1.setContent("오도레 사케베 요호~ 사 ~ 이마 "); //q1의 내용을 수정
//		
//		qBoardRepository.save(q1); //수정한 내용을 저장
//	
//		}
	
//	@Test
//	@DisplayName("조회5")
//	public void searchQuestion6() {
//		
//		
//		Optional<QuestionBoard> qAll= qBoardRepository.findById(3); //3번인 아이디의 글을 객체로서 가져옴
//		
//	
//		if(qAll.isPresent()) {	
//			QuestionBoard q3=qAll.get(); //객체 상태의 녀석을 겟해서 q3에 저장
//			qBoardRepository.deleteById(3);
//			List<QuestionBoard> qAll2= qBoardRepository.findAll();
//			assertEquals(2, qAll2.size());//실제 모든 글의 개수와 기대한 값인 2개가 일치하는지 여부
//		}
//		}
//	@Test
//	@DisplayName("수정테스트")
//	public void searchQuestion7() {
//		
//		
//		Optional<QuestionBoard> qAll= qBoardRepository.findById(2); //3번인 아이디의 글을 객체로서 가져옴
//		
//	
//		if(qAll.isPresent()) {	
//			QuestionBoard q2=qAll.get(); //객체 상태의 녀석을 겟해서 q3에 저장
//			q2.setSubject("2번글로 되버렷");
//			QuestionBoard qrfinal = qBoardRepository.save(q2);
//			assertEquals("2번글로 되버렷", q2.getSubject());

//			qBoardRepository.deleteById(3);
//			List<QuestionBoard> qAll2= qBoardRepository.findAll();
//			assertEquals(2, qAll2.size());//실제 모든 글의 개수와 기대한 값인 2개가 일치하는지 여부
//		
		
		
//	@Test
//	@DisplayName("삭제테스트")
//	public void searchQuestion8() {
//		
//		
//		Optional<QuestionBoard> qAll= qBoardRepository.findById(4); //3번인 아이디의 글을 객체로서 가져옴
//		
//	
//		if(qAll.isPresent()) {	
//			QuestionBoard q3=qAll.get(); //객체 상태의 녀석을 겟해서 q3에 저장
//			
//			qBoardRepository.delete(q3); //delete는 q3에 저장된 id를 찾아서 지우는 것
////			qBoardRepository.deleteById(3);//반면 deleteById는 3이라는 id를 특정해낸 뒤 지우는 것
//			List<QuestionBoard> qAll2= qBoardRepository.findAll();
//			assertEquals(3, qAll2.size());
//	
//}
//	}
	
}
