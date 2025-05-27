package com.app.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dto.QuestionDto;
import com.app.model.Quiz;

public interface QuizRepositary extends JpaRepository<Quiz, Integer>{

	List<QuestionDto> findAllById(int id);

}
