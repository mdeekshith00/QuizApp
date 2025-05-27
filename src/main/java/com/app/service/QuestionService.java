package com.app.service;

import java.util.List;

import com.app.model.Question;

public interface QuestionService {
	
	 Question addQuestion(Question question);
	 List<Question> getAllQuestions();
	 List<Question> findByCategory(String category);

}
