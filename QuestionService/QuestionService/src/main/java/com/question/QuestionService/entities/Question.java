package com.question.QuestionService.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @Column(name = "question")
    private String question;

    private Long quizId;


    public Question() {

    }


    public Long getQuestionId() {
        return questionId;
    }


    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", quizId=" + quizId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(questionId, question1.questionId) && Objects.equals(question, question1.question) && Objects.equals(quizId, question1.quizId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, question, quizId);
    }

    public Question(Long questionId, String question, Long quizId) {
        this.questionId = questionId;
        this.question = question;
        this.quizId = quizId;
    }

}
