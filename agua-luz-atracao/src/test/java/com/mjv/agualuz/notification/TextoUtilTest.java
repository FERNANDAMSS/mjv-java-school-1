package com.mjv.agualuz.notification;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.mjv.agualuz.notification.util.TextoUtil;

//https://www.baeldung.com/junit-5
public class TextoUtilTest {
	static final Logger LOG = Logger.getLogger("TextoUtilTest");
	@DisplayName("cortarTest: Teste do método que corta palavra a partir de um tamanho máximo")
	@Test
	public void cortarTest() {
		String textoOriginal = "GLEYSON SAMPAIO";
		int tamanhoTaximo = 10;
		
		String resultado = TextoUtil.cortar(textoOriginal, tamanhoTaximo);
		String expectativa = "GLEYSON SA";
		Assertions.assertEquals(expectativa,resultado );
	}
	@DisplayName("zeroEsquerdaTest: Teste do método adiciona zeros a esquerda de um número")
	@Test
	public void zeroEsquerdaTest() {
		String textoOriginal = "123";
		int tamanhoTaximo = 6;
		
		String resultado = TextoUtil.zeroEsquerda(textoOriginal, tamanhoTaximo);
		String expectativa = "000123";
		Assertions.assertEquals(expectativa,resultado );
	}
}
