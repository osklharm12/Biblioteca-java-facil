package com.aed.soft.EaseCalculo;


import java.util.ArrayList;

public class EasePercCalc {

	/**
	 * Esta classe é reponsavel por configurar as medidas nos layouts do sistema
	 * atraves da porcentagem, fazendo com que o programa assuma tamanhos
	 * proporcionais em qualquer tamanho de tela
	 */
	static ArrayList<Character> ValorEmCaracter;
	static int Resultado;

	/**
	 * metodo calcula a porcentagem de qualquer valor dado, retorna apenas valores
	 * inteiros
	 */
	public static int CalculaPorcentagem(double valor, double percentual) {
		/*
		 * VAi receber cada um dos caracteres da String advinda do doubleResult
		 */
		ValorEmCaracter = new ArrayList<>();
		/* aqui a conta propiamente dita eceita valores double */
		double doubleResult = percentual / 100 * valor;
		/* converte o resultado em String */
		String StringResult = String.valueOf(doubleResult);
		/*
		 * ultilizamos o for para percorrer cada um dos caracteres do StringResult cada
		 * caracter encontrado vai sendo adcionado ao array de caracteres
		 */
		for (int i = 0; i < StringResult.length(); i++) {
			char c = StringResult.charAt(i);
			ValorEmCaracter.add(c);
			/*
			 * geralmente porcentagem retorna valores com decimais queremos apenas valores
			 * inteiros por isso, toda vez que o programa encontra o ponto('.') ele da um
			 * break no for
			 */
			if (c == '.') {
				/*
				 * remove o ultimo caracter adcionado que é por consequencia o ponto('.')
				 */
				ValorEmCaracter.remove(i);
				/*
				 * forma uma string com a substring comecando por zero e indo // * até o indice
				 * encontrado no for
				 */
				String Result = StringResult.substring(0, i);
				/* convertemos o Result em um inteiro */
				Resultado = Integer.parseInt(Result);

				break;
			}
		}
		/* retornamos o valor */
		return Resultado;
	}

	/**
	 * Metodo retorna percentual quando se tem o valor toatal e o valor obtido onde
	 * valor e valor obtido de uma porcentagem, e VT = valor integral antes da
	 * porcentagem
	 */

	public static int CalculaPercentual(double valorTotal, double valor) {

		/*
		 * VAi receber cada um dos caracteres da String advinda do doubleResult
		 */
		ValorEmCaracter = new ArrayList<>();
		/* aqui a conta propiamente dita eceita valores double */
		double doubleResult = 100 / valorTotal * valor;
		String StringResult = String.valueOf(doubleResult);
		/*
		 * ultilizamos o for para percorrer cada um dos caracteres do StringResult cada
		 * caracter encontrado vai sendo adcionado ao array de caracteres
		 */
		for (int i = 0; i < StringResult.length(); i++) {
			char c = StringResult.charAt(i);
			ValorEmCaracter.add(c);
			/*
			 * geralmente porcentagem retorna valores com decimais queremos apenas valores
			 * inteiros por isso, toda vez que o programa encontra o ponto('.') ele da um
			 * break no for
			 */
			if (c == '.') {
				/*
				 * remove o ultimo caracter adcionado que é por consequencia o ponto('.')
				 */
				ValorEmCaracter.remove(i);
				/*
				 * forma uma string com a substring comecando por zero e indo // * até o indice
				 * encontrado no for
				 */
				String Result = StringResult.substring(0, i);
				/* convertemos o Result em um inteiro */
				Resultado = Integer.parseInt(Result);

				break;
			}
		}
		/* retornamos o valor */
		return Resultado;

	}

	/**
	 * metodo abaixo retorna o valor total integral antes das operações de
	 * porcentagem, onde se tem o valor percentual usado em uma conversao, e o valor
	 * resultante do calculo dessa porcentagem
	 */

	public static int calculaValorTotal(double percentual, double valor) {
		/*
		 * VAi receber cada um dos caracteres da String advinda do doubleResult
		 */
		ValorEmCaracter = new ArrayList<>();
		/* aqui a conta propiamente dita eceita valores double */
		double doubleResult = percentual * 100 / valor;
		String StringResult = String.valueOf(doubleResult);
		/*
		 * ultilizamos o for para percorrer cada um dos caracteres do StringResult cada
		 * caracter encontrado vai sendo adcionado ao array de caracteres
		 */
		for (int i = 0; i < StringResult.length(); i++) {
			char c = StringResult.charAt(i);
			ValorEmCaracter.add(c);
			/*
			 * geralmente porcentagem retorna valores com decimais queremos apenas valores
			 * inteiros por isso, toda vez que o programa encontra o ponto('.') ele da um
			 * break no for
			 */
			if (c == '.') {
				/*
				 * remove o ultimo caracter adcionado que é por consequencia o ponto('.')
				 */
				ValorEmCaracter.remove(i);
				/*
				 * forma uma string com a substring comecando por zero e indo // * até o indice
				 * encontrado no for
				 */
				String Result = StringResult.substring(0, i);
				/* convertemos o Result em um inteiro */
				Resultado = Integer.parseInt(Result);

				break;
			}
		}
		/* retornamos o valor */
		return Resultado;

	}

	
}
