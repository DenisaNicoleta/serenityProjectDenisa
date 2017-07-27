package com.madison.steps;

import com.emag.pages.CartPage;
import com.emag.pages.EmagHomePage;
import com.emag.pages.ProductPage;
import com.emag.pages.SearchResultsList;
import com.madison.pages.NewsLetterPage;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;


public class NewsLetterSteps extends ScenarioSteps{
	
	NewsLetterPage newsletter;
	
	@Step
	public void openMadisnIsland(String url) {
		newsletter.getDriver().get(url);
	}
	
	@Step
	public void clickOnNewsletter() {
		newsletter.clickOnNewsletter();
	}
	
	@Step
	public void enterEmail(String email) {
		newsletter.enterEmail(email);
	}
	
	@Step
	public void clickOnSubscribe() {
		newsletter.clickOnSubscribe();
	}
	
//	@Step
//	public void checkMessageSubscriptionSuccessful(String expectedMessage)
//	{
//		newsletter.checkSubscriptionSuccessfulMessage(expectedMessage);
//	}
//	
//	@Step
//	public void checkFailedSubscriptionMessage(String failedMessage){
//		newsletter.checkSubscriptionFailedMessage(failedMessage);
//	}
//	
	@Step
	public void checkSubscriptionMessage() {
		
		newsletter.checkSubscriptionMessage();
		
	}
	
}	
	
	

