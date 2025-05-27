package com.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.dto.QuestionDto;
import com.app.exception.DeatilsNotFound;
import com.app.model.Question;
import com.app.model.Quiz;
import com.app.model.Response;
import com.app.repositary.QuestionRepositary;
import com.app.repositary.QuizRepositary;
import com.app.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepositary quizRepositary;
	@Autowired
	private QuestionRepositary quizQuesRespositary;
	
	public ResponseEntity<String> createQuiz(String category , int numQ , String title)  {
		List<Question> questions = quizQuesRespositary.findRandomQuestionsByCategory(category,numQ);
		Quiz quiz = new Quiz();
		
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizRepositary.save(quiz);
		
		return new ResponseEntity<String>("sucesss:" , HttpStatus.CREATED);
	}

	@Override
	public List<QuestionDto> getQuizQuestion(Integer id) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepositary.findById(id).orElseThrow(() -> 
		new DeatilsNotFound("Quizz details not found On this ID :" + id));
		
		List<Question> questionFromDb = quiz.getQuestions();
		List<QuestionDto> questionFromUsers = new ArrayList<>();
		
		for(Question q : questionFromDb) {
			QuestionDto questionD = new QuestionDto(q.getId() , q.getQuestionTitle() , q.getOption1() , q.getOption2(), q.getOption3(), q.getOption4());
			questionFromUsers.add(questionD);
		}
		
		return questionFromUsers ;
	}

	public Integer calculateResult(Integer id, List<Response> reponses) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepositary.findById(id).orElseThrow(() -> 
		new DeatilsNotFound("Quizz details not found On this ID :" + id));
		
		List<Question> questions = quiz.getQuestions();
		int right =0;
		int i=0;
		for(Response reponse : reponses)  {
			if(reponse.getResponses().equals(questions.get(i).getRightAnswer()))
				right++;
		i++;
		}
		return right; 
	}

}
