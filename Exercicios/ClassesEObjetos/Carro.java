package ClassesEObjetos;

import org.graalvm.compiler.nodes.NodeView.Default;

public class Carro {
	private String nome, marca, cor;
	private int portas;
	private boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	private double precoBase;
	
	Public Carro (){}
	
	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico,  boolean arCondicionado,  boolean cambioAutomatico,  boolean direcaoEletrica, double precoBase  ) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	public Carro(String nome, String marca, int precoBase) {
		this(nome, marca, "Branco", 2, false, false, false, false, precoBase);
	}
	public double calculaPreco () {
		double precoFim = precoBase;
		
		switch (cor) {
		case "Branco":
			break;
		case "azul":
			break;
		case "Vermelho":
			break;
		case "Preto":
			break;
		default:
			precoFim += 1000;
		}
		
		if (vidroEletrico)
			precoFim += 1250;
		if (arCondicionado)
			precoFim += 1250;
		if (cambioAutomatico)
			precoFim += 1250;
		if (direcaoEletrica)
			precoFim += 1250;
		
		return precoFim;		
	}
	@Override
	public String toString() {
		String saida = "";
		saida +=  saida +"Nome: " + nome  + "\n";
		saida +=  "Marca: " + marca  + "\n";
		saida +=  "Cor: " + cor  + "\n";
		saida +=  "Quantidade de portas: " + portas  + "\n";
		saida +=  "Ar-Condicionado: " + arCondicionado  + "\n";
		saida +=  "Vidro Eletrica: " + vidroEletrico  + "\n";
		saida +=  "Cambio Automatico: " + cambioAutomatico  + "\n";
		saida +=  "Direção Eletrica: " + direcaoEletrica  + "\n";
		saida +=  "Preço: " + calculaPreco() + "\n";
		
		return saida;
	}
	
	
	
	
}
