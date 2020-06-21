import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.IIOException;


public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);	
		File MegaSena = new File("D:\\MegaSena1.csv");
		File Quina = new File("D:\\Quina.csv");
		File Lotofacil = new File("D:\\Lotofacil.csv");
		Scanner scanner = new Scanner(MegaSena);
		String numeroDaSena = new String();
		Scanner scanner2 = new Scanner(Quina);
		String numeroDaQuina = new String();
		Scanner scanner3 = new Scanner(Lotofacil);
		String numeroDaLoto = new String();
		while(scanner.hasNext()) {
		
		numeroDaSena = scanner.nextLine();
		System.out.println("Numeros da Sena" + numeroDaSena);
		
		}
		while(scanner2.hasNext()) {
		
		numeroDaQuina = scanner2.nextLine();
		System.out.println("Número da Quina" + numeroDaQuina);
		}
		while(scanner3.hasNext()) {
			
		numeroDaLoto = scanner3.nextLine();
		System.out.println("Número da Loto" + numeroDaLoto);
		}
		Random gerador = new Random();
		int result = numeroDaSena.length();	
		int option = 0;
		int count = 0;
		int sort = 0;
		
		do {
			System.out.println("****Lotería****");
			System.out.println("1 - Mega Sena");
			System.out.println("2 - Quina");
			System.out.println("3 - Lotofácil");
			System.out.println("9 - Sair");
			option = leitor.nextInt();
			leitor.nextLine();
			
				if(option == 1) {
				System.out.println("1 - 5 números que mais sairam");
				System.out.println("2 - 5 números que menos sairam");
				System.out.println("3 - Gerar números randomicos");
				System.out.println("4 - Verificar meu jogo");
				option = leitor.nextInt();
				leitor.nextLine();
				
					if(option == 1) {
						for(int i = 0; i <= numeroDaSena.length(); i++) {
							result++;
						}
						for(int i = 0; i <= result; i++) {
							if (result>count) {
								count = result;
					            sort = result;
							}
						}
						System.out.println(sort);
					}
					if(option == 2) {
						
					}
					if(option == 3) {
						for (int i = 0; i <= 5; i++) {
							System.out.println(gerador.nextInt(60));
						}
					}
				}
				if(option == 2) {
				System.out.println("1 - 5 números que mais sairam");
				System.out.println("2 - 5 números que menos sairam");
				System.out.println("3 - Gerar números randomicos");
				System.out.println("4 - Verificar meu jogo");
				option = leitor.nextInt();
				leitor.nextLine();
				
					if(option == 1) {
					
					}
					if(option == 2) {
						
					}
					if(option == 3) {
						for (int i = 0; i <= 4; i++) {
							System.out.println(gerador.nextInt(60));
						}					
					}
					if(option == 4) {
						
					}
				}
				if(option == 3) {
				System.out.println("1 - 5 números que mais sairam");
				System.out.println("2 - 5 números que menos sairam");
				System.out.println("3 - Gerar números randomicos");
				System.out.println("4 - Verificar meu jogo");
				option = leitor.nextInt();
				leitor.nextLine();

				if(option == 1) {
				
				}
				if(option == 2) {
					
				}
				if(option == 3) {
					for (int i = 0; i <= 14; i++) {
						System.out.println(gerador.nextInt(25));
					}					
				}
				if(option == 4) {
					
				}
				}
				
		}while(option != 9);
		
		}
}
