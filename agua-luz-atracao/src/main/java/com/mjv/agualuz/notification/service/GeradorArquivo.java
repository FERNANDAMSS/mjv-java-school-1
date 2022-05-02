package com.mjv.agualuz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.mjv.agualuz.notification.model.Contrato;

public class GeradorArquivo {
	public void csv(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		//montar conteudo
		
		System.out.println(sb.toString());
		escrever(sb.toString(), "agua-luz-contratos.csv");
		
	}

	public void txt(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		//montar conteudo
		
		System.out.println(sb.toString());
		escrever(sb.toString(), "agua-luz-contratos.txt");
		
	}
	private void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("/estudo/mjv-java-school/agua-luz-output");
		dir.mkdirs();
		
		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
