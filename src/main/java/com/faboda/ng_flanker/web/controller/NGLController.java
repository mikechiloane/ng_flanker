package com.faboda.ng_flanker.web.controller;


import com.faboda.ng_flanker.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/ngl")
public class NGLController {

    final QuestionService questionService;

    public NGLController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/{username}")
    public String submit(@PathVariable String username) {
        questionService.sendRequest(username);
        return "Request sent to " + username;
    }
}
