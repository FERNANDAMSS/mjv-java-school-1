package com.mjv.agualuz.notification.util;

public class TextoUtil {
	public static String cortar(String texto, int tamanhoMaximo) {
		//aqui já podemos ter um erro
		String novoTexto = texto.substring(0, tamanhoMaximo);
		return novoTexto; 
	}
	public static String completar(String texto, int tamanhoMaximo) {
		String formato = "%-"+tamanhoMaximo;
		String novoTexto = String.format(formato, texto);
		return novoTexto; 
	}
}
