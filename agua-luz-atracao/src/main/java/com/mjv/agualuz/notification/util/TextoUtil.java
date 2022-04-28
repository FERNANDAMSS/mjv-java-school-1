package com.mjv.agualuz.notification.util;

public class TextoUtil {
	public static String cortar(String textoOriginal, int tamanhoMaximo) {
		//aqui já podemos ter um erro
		String novoTexto = textoOriginal.substring(0, tamanhoMaximo);
		return novoTexto; 
	}
	public static String completar(String textoOriginal, int tamanhoMaximo) {
		String formato = "%-"+tamanhoMaximo;
		String novoTexto = String.format(formato, textoOriginal);
		return novoTexto; 
	}
	public static String ajustar(String textoOriginal, int tamanhoMaximo) {
		String textoAjustado = cortar(textoOriginal, tamanhoMaximo);
		textoAjustado = completar(textoAjustado, tamanhoMaximo);
		return textoAjustado;
	}
	public static String zeroEsquerda(String textoOriginal, int tamanhoMaximo) {
		//removendo caratecteres especiais no texto Original
		textoOriginal = textoOriginal.replaceAll("\\D", "");
		//convertendo o texto em numero para formatar com zero a esquerda
		Long numero = Long.valueOf(textoOriginal);
		//definindo o formato
		String formato = "%0"+tamanhoMaximo+"d";
		//formatando
		String textoAjustado = String.format(formato, numero);
		return textoAjustado;
		
	}
}
