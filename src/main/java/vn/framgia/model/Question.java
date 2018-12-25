package vn.framgia.model;
// Generated Dec 7, 2018 9:59:06 AM by Hibernate Tools 5.3.6.Final

import java.util.ArrayList;
import java.util.List;

/**
 * Questions generated by hbm2java
 */
public class Question implements java.io.Serializable {

	private Integer id;
	private Level level;
	private Subject subject;
	private String question;
	private Integer typeQuestion;
	private String mp3Question;
	private String imgQuestion;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private Integer correctAnswer;
	private Boolean deleted;
	private List<ExerciseDetail> exerciseDetails = new ArrayList<ExerciseDetail>();

	public Question() {
	}

	public Question(Level level, Subject subject, String question, Integer typeQuestion, String mp3Question,
			String imgQuestion, String option1, String option2, String option3, String option4, Integer correctAnswer,
			Boolean deleted, List<ExerciseDetail> exercieDetails) {
		this.level = level;
		this.subject = subject;
		this.question = question;
		this.typeQuestion = typeQuestion;
		this.mp3Question = mp3Question;
		this.imgQuestion = imgQuestion;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.deleted = deleted;
		this.exerciseDetails = exercieDetails;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getTypeQuestion() {
		return this.typeQuestion;
	}

	public void setTypeQuestion(Integer typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public String getMp3Question() {
		return this.mp3Question;
	}

	public void setMp3Question(String mp3Question) {
		this.mp3Question = mp3Question;
	}

	public String getImgQuestion() {
		return this.imgQuestion;
	}

	public void setImgQuestion(String imgQuestion) {
		this.imgQuestion = imgQuestion;
	}

	public String getOption1() {
		return this.option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return this.option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return this.option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return this.option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Integer getCorrectAnswer() {
		return this.correctAnswer;
	}

	public void setCorrectAnswer(Integer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public List<ExerciseDetail> getExerciseDetails() {
		return exerciseDetails;
	}

	public void setExerciseDetails(List<ExerciseDetail> exerciseDetails) {
		this.exerciseDetails = exerciseDetails;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", level=" + level + ", subject=" + subject + ", question=" + question
				+ ", typeQuestion=" + typeQuestion + ", mp3Question=" + mp3Question + ", imgQuestion=" + imgQuestion
				+ ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4
				+ ", correctAnswer=" + correctAnswer + ", deleted=" + deleted + ", exerciseDetails=" + exerciseDetails
				+ "]";
	}

}
