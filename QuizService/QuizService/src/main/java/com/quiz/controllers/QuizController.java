package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //create
    @PostMapping
    public ResponseEntity<Quiz> create(@RequestBody  Quiz quiz) {
        Quiz savequiz=quizService.add(quiz);
        return new ResponseEntity<>(savequiz, HttpStatus.CREATED);
    }

    //get all
    @GetMapping
    public List<Quiz> get() {
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id) {
        return quizService.get(id);
    }

}
