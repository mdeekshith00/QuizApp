package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Question;
import com.app.serviceImpl.QuestionServiceImpl;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionServiceImpl questionService;
	
	@GetMapping("/allquestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return new ResponseEntity<List<Question>>( questionService.getAllQuestions(), HttpStatus.CREATED);
		
	}
	@PostMapping("/add")
	public  ResponseEntity<Question> addQuestion(@RequestBody Question question) {
		return new ResponseEntity<Question>(questionService.addQuestion(question), HttpStatus.CREATED);
	}
	@GetMapping("/{category}")
	public  ResponseEntity<List<Question>> findByCategory(@PathVariable String category){
		return new ResponseEntity<>(questionService.findByCategory(category), HttpStatus.FOUND); 
	}


}
