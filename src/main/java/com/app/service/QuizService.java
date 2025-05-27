package com.app.service;

import java.util.List;
import com.app.model.Question;
import com.app.modeldto.QuestionDto;


public interface QuizService {
	List<QuestionDto>   getQuizQuestion(Integer id);

}
