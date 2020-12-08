package com.srpint2_Orange;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature_file"
		,glue={"com.Orange_steps"}
		,tags={"@Add_Employee, @Employee_login"}
		)

public class Test_Runner {

}
