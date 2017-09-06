package com.jh.application.cucumber.stepdefs;

import com.jh.application.JhApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
