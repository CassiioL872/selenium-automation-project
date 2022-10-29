package br.ce.wcaquino.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotaoPorTexto("Entrar");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

	public void resetApp() throws InterruptedException {
		clicarBotao(By.xpath("//a[@style='color: white']"));
		assertEquals("Dados resetados com sucesso!", obterTexto(By.xpath("//div[@class='alert alert-success']")));
	}

}
