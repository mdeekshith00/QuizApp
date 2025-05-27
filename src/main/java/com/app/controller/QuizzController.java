package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Question;
import com.app.modeldto.QuestionDto;
import com.app.serviceImpl.QuizServiceImpl;

@RestController
@RequestMapping("/quiz")
public class QuizzController {
	
	@Autowired
	private QuizServiceImpl quizService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createQuizz(@RequestParam String category , @RequestParam int numQ , @RequestParam String title) {
		return new ResponseEntity<>(quizService.createQuiz(category, numQ, title) , HttpStatus.FOUND);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<QuestionDto>> getQuizQuestion(@PathVariable Integer id) {
		return new ResponseEntity<List<QuestionDto>>(quizService.getQuizQuestion(id) , HttpStatus.OK);
		
	}

}
