package com.nangcho.prac.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(name = "qboard00_seq_gen" , sequenceName ="qboard00_seq")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 200)
	private String subject;
	
	@Column(columnDefinition = "varchar(1000) default 'TEXT'")
	private String content;
	
	@CreationTimestamp
	@CreatedDate
	private LocalDateTime createdate;
	
	@OneToMany(mappedBy = "questionBoard", cascade = CascadeType.REMOVE) //cascade는 질문이 삭제되면 그와 관련된것 전부 삭제한다.
	private List<AnswerBoard> answerBoard; //질문 하나에 여러 답변이 달리기 대문에 onetomany로 annotation 해주고 답변은 여러개이기 떄문에
	//List로 받아줘야한다.
}
