package sistemaLavadora;

//import java.io.*;
import java.util.Scanner;
import java.lang.Thread;
 

public class lavadora {

public static void main(String[] args) throws InterruptedException {
		
		Scanner teclado = new Scanner(System.in);
		
//		String modeloMaq = "h234f", nomeMaq5 = "Top 5kg", nomeMaq7 = "Top 7kg", nomeMaq10 = "Top 10kg", nomeMaq15 = "Top 15kg";
//		String volt110 = "110V", volt220 = "220V", cap5 = "5 Kg", cap7 = "7 Kg", cap10 = "10 Kg", cap15 = "15 Kg";
		String voltSelec = "", capSelec = "", nomeSelec = "", modelSelec = "";
		double lavaPesada = 0, lavaNormal = 0, lavaRapida = 0, enxague = 0, centrifug = 0;
		int opcao = 0, opcaoCap = 0, opcaoVolt = 0, opcaoEstagio = 0, i = 0, opMenuSimula = 0;
		int tempoEstagio1 = 0, tempoEstagio2 = 0, tempoEstagio3 = 0, tempoEstagio4 = 0, tempoEstagio5 = 0;
		
		do {
			System.out.println("===================================================");
			System.out.println("                 MENU DE SIMULACAO");
			System.out.println("===================================================");
			System.out.println("");
			System.out.println("1  -  CONFIGURAR MAQUINA DE LAVAR");
			System.out.println("2  -  SIMULAR MAQUINA DE LAVAR");
			System.out.println("0  -  SAIR");
			System.out.println("---------------------------------------------------");
			System.out.println("Digite o codigo: ");
			opcao = teclado.nextInt();
			teclado.nextLine();
			if (opcao == 0) {
				break;
			}
			if ((opcao != 1) && (opcao != 0)) {
				
					System.out.println("***** CONFIGURE UMA MAQUINA  ANTES DE SIMULAR *****");
					System.out.println("===================================================");
					System.out.println("                 MENU DE SIMULACAO");
					System.out.println("===================================================");
					System.out.println("");
					System.out.println("1  -  CONFIGURAR MAQUINA DE LAVAR");
					System.out.println("2  -  SIMULAR MAQUINA DE LAVAR");
					System.out.println("0  -  SAIR");
					System.out.println("---------------------------------------------------");
					System.out.println("Digite o codigo: ");
					opMenuSimula = teclado.nextInt();
					teclado.nextLine();
					
					
				} while ((opMenuSimula != 1) && (opMenuSimula != 0));
			
			if ((opcao == 1) || (opMenuSimula == 1)) {
				do {
				System.out.println("================================================");
				System.out.println("        CONFIGURACAO DA MAQUINA DE LAVAR"        );
				System.out.println("================================================");
				System.out.println("Insira o modelo da Maquina: ");
				nomeSelec = teclado.nextLine();
				System.out.println("Insira o nome da Maquina: ");
				modelSelec = teclado.nextLine();
				System.out.println("Selecione a capacidade da Maquina: ");
				System.out.println("1 - 5kg");
				System.out.println("2 - 7kg");
				System.out.println("3 - 10kg");
				System.out.println("4 - 15kg");
				System.out.println("Digite o codigo correspondente:");
				opcaoCap = teclado.nextInt();
				switch (opcaoCap) {
				case 1:
					capSelec = " 5kg";
					break;
				case 2:
					capSelec = " 7kg";
					break;
				case 3:
					capSelec = " 10kg";
					break;
				case 4 :
					capSelec = " 15kg";
					break;
				}					
				System.out.println("Selecione a voltagem da maquina:");
				System.out.println("1  -  110V");
				System.out.println("2  -  220V");
				opcaoVolt = teclado.nextInt();
				switch (opcaoVolt) {
				case 1: 
					voltSelec = " 110V";
					break;
				case 2:
					voltSelec = " 220V";
					break;
				}
				
				System.out.println("Selecione a duracao do Estagio 1 - Lavacao Pesada: ");
				tempoEstagio1 = teclado.nextInt();
				System.out.println("Selecione a duracao do Estagio 2 - Lavacao Normal: ");
				tempoEstagio2 = teclado.nextInt();
				System.out.println("Selecione a duracao do Estagio 3 - Lavacao Rapida: ");
				tempoEstagio3 = teclado.nextInt();
				System.out.println("Selecione a duracao do Estagio 4 - Enxague: ");
				tempoEstagio4 = teclado.nextInt();
				System.out.println("Selecione a duracao do Estagio 5 - Centrifugar: ");
				tempoEstagio5 = teclado.nextInt();
				System.out.println("");
			
					
				System.out.println("================================================");
				System.out.println("        CONFIGURACAO DA MAQUINA DE LAVAR"        );
				System.out.println("================================================");
				System.out.println("");
				System.out.println("Modelo: " + modelSelec);
				System.out.println("Nome: " + nomeSelec);
				System.out.println("Voltagem: " + voltSelec );
				System.out.println("Capacidade: " + capSelec);
				System.out.println("Duracao do Estagio 1 - Lavacao Pesada: " + tempoEstagio1 + " minutos");
				System.out.println("Duracao do Estagio 2 - Lavacao Normal: " + tempoEstagio2 + " minutos");
				System.out.println("Duracao do Estagio 3 - Lavacao Rapida: " + tempoEstagio3 + " minutos");
				System.out.println("Duracao do Estagio 4 - Enxague: " + tempoEstagio4 + " minutos");
				System.out.println("Duracao do Estagio 5 - Lavacao Pesada: " + tempoEstagio5 + " minutos");
				System.out.println("");
				System.out.println("");	
				System.out.println("Digite 1 para reconfigurar, ou 2 para prosseguir: ");
				opcao = teclado.nextInt();
				teclado.nextLine();
				} while (opcao == 1);
				}
			
				System.out.println("===================================================");
				System.out.println("            SIMULACAO DA MAQUINA DE LAVAR"          );
				System.out.println("===================================================");
				System.out.println("");
				System.out.println("Simulando o modelo: " + modelSelec + " - " + nomeSelec + " - " + capSelec + " -" + voltSelec);
				System.out.println("");
				System.out.println("===================================================");
				System.out.println("           QUAL ESTAGIO VC DESEJA COMECAR?"         );
				System.out.println("===================================================");
				System.out.println("1  -  LAVACAO PESADA");
				System.out.println("2  -  LAVACAO NORMAL");
				System.out.println("3  -  LAVACAO RAPIDA");
				System.out.println("4  -  ENXAGUE");
				System.out.println("5  -  CENTRIFUGAR");
				System.out.println("Selecione o estagio inicial:");
				opcaoEstagio = teclado.nextInt();
				
				switch (opcaoEstagio) {
				case 1: 
					for (i = 0; i < 5; i++) {
						lavaPesada = lavaPesada + 20;
						System.out.println("Estagio 1  -  Em Lavacao Pesada: " + lavaPesada + "%");
						Thread.sleep((tempoEstagio1 / 5)*1000);
					}
					System.out.println("");
				case 2:
					for (i = 0; i < 5; i++) {
						lavaNormal = lavaNormal + 20;
						System.out.println("Estagio 2  -  Em Lavacao Normal: " + lavaNormal + "%");
						Thread.sleep((tempoEstagio2 / 5)*1000);
					}
					System.out.println("");
				case 3:
					for (i = 0; i < 5; i++) {
						lavaRapida = lavaRapida + 20;
						System.out.println("Estagio 3  -  Em Lavacao Rapida: " + lavaRapida + "%");
						Thread.sleep((tempoEstagio3 / 5)*1000);
					}
					System.out.println("");
				case 4:
					for (i = 0; i < 5; i++) {
						enxague = enxague + 20;
						System.out.println("Estagio 4  -  Em Enxague: " + enxague + "%");
						Thread.sleep((tempoEstagio4 / 5)*1000);
					}
					System.out.println("");
				case 5:
					for (i = 0; i < 5; i++) {
						centrifug = centrifug + 20;
						System.out.println("Estagio 5  -  Em Centrifugacao: " + centrifug + "%");
						Thread.sleep((tempoEstagio5 / 5)*1000);
					}
					System.out.println("");
					break;
				
				}
				lavaPesada = 0;
				lavaNormal = 0;
				lavaRapida = 0;
				enxague = 0;
				centrifug = 0;
				System.out.println("Deseja encerrar simulacao? (0 - SIM / 2 - NAO):");
				opcao = teclado.nextInt();
				
							
		} while (opcao != 0);			
		
		if (opcao == 0) {
			System.out.println("===================================================");
			System.out.println("         SISTEMA ENCERRADO - ATE LOGO"              );
			System.out.println("===================================================");
		}
		
		teclado.close();
	}


}
