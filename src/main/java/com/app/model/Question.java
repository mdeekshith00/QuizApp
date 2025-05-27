package com.app.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String questionTitle;
	@Column
	private String option1;
	@Column
	private String option2;
	@Column	
	private String option3;
	@Column
	private String option4;
	@Column
	private String rightAnswer;
	@Column
	private String diffucultyLevel;
	@Column
	private String category;
	
	@ManyToMany(mappedBy = "questions")
	private List<Quiz> quiz;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Integer id, String questionTitle, String option1, String option2, String option3, String option4,
			String rightAnswer, String diffucultyLevel, String category, List<Quiz> quiz) {
		super();
		this.id = id;
		this.questionTitle = questionTitle;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightAnswer = rightAnswer;
		this.diffucultyLevel = diffucultyLevel;
		this.category = category;
		this.quiz = quiz;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public String getDiffucultyLevel() {
		return diffucultyLevel;
	}

	public void setDiffucultyLevel(String diffucultyLevel) {
		this.diffucultyLevel = diffucultyLevel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Quiz> getQuiz() {
		return quiz;
	}

	public void setQuiz(List<Quiz> quiz) {
		this.quiz = quiz;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", questionTitle=" + questionTitle + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", rightAnswer=" + rightAnswer
				+ ", diffucultyLevel=" + diffucultyLevel + ", category=" + category + ", quiz=" + quiz + "]";
	}
	

	
	
	

}
