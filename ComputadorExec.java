package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Computador;

public class ComputadorExec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Computador> lista = new ArrayList<>();
		
		for(int i = 1; i<=4; i++) {
			//objeto computador
			Computador comp = new Computador();
			
			System.out.println("Informe o Processador");
			String processador = sc.nextLine();
			comp.setProcessador(processador);
			
			System.out.println("Informe a memória");
			String mem = sc.nextLine();
			comp.setMemoria(mem);
			
			System.out.println("Informe o Preço");
			Float preco = Float.parseFloat(sc.nextLine());
			comp.setPreco(preco);
			
			lista.add(comp);
		}
		
		sc.close();
		
		//imprimir os objetos (computadores)
		System.out.println();
		System.out.println("--__ Computadores Cadastrados __--");
		
		for (Computador pc : lista) {
			//System.out.println("Processador: " + pc.getProcessador());
			//System.out.println("Memoria: " + pc.getMemoria());
			//System.out.println("Preço: " + pc.getPreco());
			
			String dados = pc.getDados();
			System.out.println(dados);
		}
		
	}

}
