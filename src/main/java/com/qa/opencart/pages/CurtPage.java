package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CurtPage {

	private By cartBy = By.id("cart");

	public void cart() {
		System.out.println("Cart item added in group");
		System.out.println("Cart item is in checkout");

	}
}
