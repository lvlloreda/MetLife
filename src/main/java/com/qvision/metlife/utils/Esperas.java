package com.qvision.metlife.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.pages.PageObject;

public class Esperas extends PageObject {
	WebDriverWait esperaExp;

	public void esperaExpEleVisible(String idElemento, int tiempoEspera) {
		esperaExp = new WebDriverWait(getDriver(), tiempoEspera);
		esperaExp.until(ExpectedConditions.visibilityOfElementLocated(By.id(idElemento)));
	}

	public void esperaExpEleHabilitado(String idElemento, int tiempoEspera) {
		esperaExp = new WebDriverWait(getDriver(), tiempoEspera);
		esperaExp.until(ExpectedConditions.elementToBeClickable(By.id(idElemento)));

	}

	public void esperaSimple(int tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
