package com.class5;

public class NestedIfRecap {
	public static void main(String[] args) {
		/*
		 * Verify is button is displayed on the page if button is displayed then we need
		 * to verify text on if text equal to sign in --> Test case otherwise --> Wrong
		 * text is displayed
		 */
		boolean isDisplayed = true;
		String buttonText = "Sin=gn In";
		if (isDisplayed) {
			System.out.println("Button is displayed");

			if (buttonText.contentEquals("Sign In")) {

				System.out.println("Wrong text is displayed");
			} else {
				System.out.println("Test case pass");
			}
		} else {
			System.out.println("Button is not displayed");

		}
	}
}
