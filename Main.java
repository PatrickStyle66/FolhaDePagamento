package com.company;

import java.util.Scanner;

public class Main {
	public static int add_emp(String[][] tabela, int indice){
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite as informações do empregado.\n");
		System.out.printf("Nome: ");
		tabela[indice][0] = input.nextLine();
		System.out.printf("Endereço: ");
		tabela[indice][1] = input.nextLine();
		System.out.printf("Tipo: ");
		tabela[indice][2] = input.nextLine();
		System.out.printf("Salário/Comissão: ");
		tabela[indice][3] = input.nextLine();
		System.out.printf("Método de Pagamento: ");
		tabela[indice][4] = input.nextLine();
		System.out.printf("Pertence ao sindicato?: ");
		tabela[indice][5] = input.nextLine();
		System.out.printf("Usuário adicionado com sucesso!\n");
		return indice + 1;
	}

	public static void edit_emp(String[][] tabela,int indice){
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite as novas informações do empregado.\n");
		System.out.printf("Nome: ");
		tabela[indice][0] = input.nextLine();
		System.out.printf("Endereço: ");
		tabela[indice][1] = input.nextLine();
		System.out.printf("Tipo: ");
		tabela[indice][2] = input.nextLine();
		System.out.printf("Salário/Comissão: ");
		tabela[indice][3] = input.nextLine();
		System.out.printf("Método de Pagamento: ");
		tabela[indice][4] = input.nextLine();
		System.out.printf("Pertence ao sindicato?: ");
		tabela[indice][5] = input.nextLine();
		System.out.printf("Usuário editado com sucesso!\n");
	}
	public static int remov_emp(String[][] tabela,int id,int indice){
		if(tabela[id][0].equals('\0')) {
			System.out.printf("Usuário Inexistente!\n");
			return indice;
		}
		tabela[id][0] = "\0";
		System.out.printf("Usuário Removido com sucesso!\n");
		if(id == indice - 1) return indice - 1;
		return indice;
	}

	public static void print_tab(String[][] tabela,int indice){
		System.out.printf("ID\t\t\t\tNome\t\t\t\tEndereço\t\t\t\tTipo\t\t\t\tSalário/Comissão\t\t\t\tPagamento\t\t\t\tSindicato\n\n");
		for (int i = 0;i<indice;i++){
			if(!tabela[i][0].equals("\0")){
				System.out.printf("%d\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\n\n",i,tabela[i][0],tabela[i][1],tabela[i][2],tabela[i][3],tabela[i][4],tabela[i][5]);
			}
		}
	}

	public static int emp(String [][] tabela,int indice) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("  ___                      _                             _            \n" +
					" | __|  _  _   _ _    __  (_)  ___   _ _    __ _   _ _  (_)  ___   ___\n" +
					" | _|  | || | | ' \\  / _| | | / _ \\ | ' \\  / _` | | '_| | | / _ \\ (_-<\n" +
					" |_|    \\_,_| |_||_| \\__| |_| \\___/ |_||_| \\__,_| |_|   |_| \\___/ /__/\n" +
					"                                                                      ");
			System.out.println("Escolha uma opção:\n");
			System.out.println("(01)-Adicionar Funcionário\n(02)-Remover Funcionário\n(03)-Visualizar tabela de Funcionários\n(04)-Editar Funcionário\n(05)-Voltar");
			System.out.print("Operação:");
			int op = input.nextInt();
			int flag = 0;
			int id;
			switch (op) {
				case 1:
					indice = add_emp(tabela, indice);
					break;
				case 2:
					System.out.print("Digite o ID do Funcionário a ser removido:\n");
					id = input.nextInt();
					indice = remov_emp(tabela, id, indice);
					break;
				case 3:
					print_tab(tabela, indice);
					break;
				case 4:
					System.out.print("Digite o ID do Funcionário a ser editado:\n");
					id = input.nextInt();
					edit_emp(tabela, id);
					break;
				case 5:
					flag = 1;
					break;
			}
			if(flag > 0) break;
		}
		return indice;
	}



	public static int bater_ponto(String [][] tabela,int indice){
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite as informações do ponto:\n");
		System.out.printf("Data: ");
		tabela[indice][0] = input.nextLine();
		System.out.printf("ID: ");
		tabela[indice][1] = input.nextLine();
		System.out.printf("Horário de entrada: ");
        tabela[indice][2] = input.nextLine();
        System.out.printf("Horário de saída: ");
        tabela[indice][3] = input.nextLine();
        System.out.printf("Ponto registrado com sucesso!\n");
        return indice + 1;
	}

	public static void print_ponto(String [][]tabela,int indice){
		for(int i = 0;i < indice;i++){
			System.out.printf("%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s",tabela[indice][0],tabela[indice][1],tabela[indice][2],tabela[indice][3]);
		}
	}

	public static int ponto (String[][] tabela, int indice){
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.println(" ___                _         \n" +
					" | _ \\  ___   _ _   | |_   ___ \n" +
					" |  _/ / _ \\ | ' \\  |  _| / _ \\\n" +
					" |_|   \\___/ |_||_|  \\__| \\___/");
			System.out.print("Escolha uma opção:\n");
			System.out.print("(01)-Bater Ponto\n(02)-Visualizar tabela de ponto\n(03)-voltar");
			int op = input.nextInt();
			int flag = 0;
			switch (op){
				case 1:
					indice = bater_ponto(tabela,indice);
					break;
				case 2:
					print_ponto(tabela,indice);
					break;
				case 3:
					flag = 1;
					break;
			}
			if(flag > 0) break;
		}
		return indice;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[][] empregados = new String[1000][6];
		String[][] ponto = new String[1000][4];
	    String[][] vendas = new String[1000][2];
		int indice = 0;
	    int p_indice = 0;
	    int flag = 0;
		while (true){
			System.out.printf("\t ___         _   _                  _       \n" +
					"\t | __|  ___  | | | |_    __ _     __| |  ___ \n" +
					"\t | _|  / _ \\ | | | ' \\  / _` |   / _` | / -_)\n" +
					"\t |_|   \\___/ |_| |_||_| \\__,_|   \\__,_| \\___|\n" +
					" \t                                            \n");
			System.out.printf("  ___                                             _         \n" +
					" | _ \\  __ _   __ _   __ _   _ __    ___   _ _   | |_   ___ \n" +
					" |  _/ / _` | / _` | / _` | | '  \\  / -_) | ' \\  |  _| / _ \\\n" +
					" |_|   \\__,_| \\__, | \\__,_| |_|_|_| \\___| |_||_|  \\__| \\___/\n" +
					"              |___/                                         \n");
			System.out.println("Bem Vindo! Escolha uma opção:");
			System.out.printf("(01)-Funcionários\n(02)-Lançar um cartão de ponto\n(03)-Lançar resultado de venda\n(09)-Sair\n");
			System.out.printf("Operação:");
			int op = input.nextInt();
			switch (op){
				case 1:
					indice = emp(empregados,indice);
					break;
				case 2:
					p_indice = ponto(ponto,p_indice);
					break;
				case 3:

					break;
                case 4:

                    break;
				case 9:
					flag = 1;
					break;
				default:
					System.out.printf("Operação Inválida!\n");
			}
			if (flag > 0)
				break;
		}




    }
}
