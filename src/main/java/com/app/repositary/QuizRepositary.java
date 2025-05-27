package com.app.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Quiz;
import com.app.modeldto.QuestionDto;

public interface QuizRepositary extends JpaRepository<Quiz, Integer>{

	List<QuestionDto> findAllById(int id);

}
