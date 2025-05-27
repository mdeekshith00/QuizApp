package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.model.Question;
import com.app.repositary.QuestionRepositary;
import com.app.service.QuestionService;

@Service
public class QuestionServiceImpl  implements QuestionService{
	
	@Autowired
	private QuestionRepositary questionRepositary;

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepositary.findAll();
	}

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepositary.save(question);
	}

	@Override
	public List<Question> findByCategory(String category) {
		// TODO Auto-generated method stub
		return questionRepositary.findByCategory(category);
	}

}
