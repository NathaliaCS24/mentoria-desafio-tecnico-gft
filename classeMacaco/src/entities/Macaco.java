package entities;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
	
	private String nome;
	private List<String> bucho = new ArrayList<>();
	
	
	public Macaco() {
	}
	
	public Macaco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getBucho() {
		return bucho;
	}

	public void comer(String alimento) {
		if (bucho.size() >= 3) {
			System.out.println("Bucho cheio!");
		}
		else {
			bucho.add(alimento);
		}
		System.out.println(nome + ": " + bucho);
	}
	
	public void verBucho() {
		System.out.println(nome + ": " + bucho);
	}
	
	public void digerir() {
		if (bucho.isEmpty()) {
			System.out.println("O bucho esta vazio!");
		} 
		else {
			bucho.remove(bucho.get(0));
		}
		
		System.out.println(nome + ": " + bucho);

	}
	
}
