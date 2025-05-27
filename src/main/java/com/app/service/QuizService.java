package com.app.service;

import java.util.List;

import com.app.dto.QuestionDto;
import com.app.model.Question;


public interface QuizService {
	List<QuestionDto>   getQuizQuestion(Integer id);

}
