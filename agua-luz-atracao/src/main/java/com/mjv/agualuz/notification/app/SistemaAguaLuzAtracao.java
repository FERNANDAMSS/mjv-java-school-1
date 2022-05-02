package com.mjv.agualuz.notification.app;

import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.repository.ContratoRepository;
import com.mjv.agualuz.notification.service.GeradorArquivo;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		ContratoRepository rep = new ContratoRepository();
		Contrato contrato = rep.pegarUnicoContrato();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.txt(contrato);
		
	}
}
