import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dificuldade, contador[], acertos;
		acertos = 0;
		contador = new int[6];

		System.out.println("	QUIZ NUMERAÇÃO  \n");
		System.out.println("Digite sempre o número referente a sua resposta!\n");
		System.out.println("Escolha a dificuldade:\r\n" + "1. Fácil\r\n" + "2. Médio\r\n" + "3. Difícil\n");
		dificuldade = sc.nextInt();

		if (dificuldade == 1) {
			System.out.println("QUIZ - FÁCIL\n");
			System.out.println("Questão 1: Quantos dígitos diferentes estão presentes no sistema octal?\n");
			System.out.println("1. 10 dígitos\r\n" + "2. 9 dígitos\r\n" + "3. 8 dígitos\r\n" + "4. 7 dígitos");

			int resposta = sc.nextInt();
			if (resposta == 3) {
				contador[1]++;
				acertos++;
			}
			System.out.println("Questão 2: Qual é o sistema de numeração mais comumente utilizado por computadores?\n");
			System.out.println("1. Binário\r\n" + "2. Decimal\r\n" + "3. Hexadecimal\r\n" + "4. Octal");

			resposta = sc.nextInt();

			if (resposta == 1) {
				contador[2] = 2;
				acertos++;
			}

			System.out.println(
					"Questão 3: Quantos bits são necessários para representar 8 caracteres ASCII em um computador?\n");
			System.out.println("1. 8 bits\r\n" + "2. 16 bits\r\n" + "3. 64 bits\r\n" + "4. 128 bits");
			resposta = sc.nextInt();

			if (resposta == 2) {
				contador[3] = 3;
				acertos++;
			}
			System.out.println(
					"Questão 4: No sistema hexadecimal, cada dígito pode ser representado por um único byte?\n");
			System.out.println("1. Sim, cada digito é representado por 8 bits.\r\n"
					+ "2. Não, cada digito é representado por 4 bits.");
			resposta = sc.nextInt();

			if (resposta == 2) {
				contador[4] = 4;
				acertos++;
			}

			System.out.println(
					"Questão 5: Qual é o fenômeno que ocorre quando o resultado de uma operação aritmética em números binários\r\n"
							+ " explode a capacidade de bits do sistema?\n");
			System.out.println("1. Subfluxo\r\n" + "2. Inversão\r\n" + "3. Complemento\r\n" + "4. Overflow");

			resposta = sc.nextInt();

			if (resposta == 4) {
				contador[5] = 5;
				acertos++;
			}

			if ((acertos == 1) || (acertos == 2)) {
				System.out.printf("Parabéns, você acertou %d de 5 questões! Mas ainda tem muito o que melhorar...%n",
						acertos);

			} else if ((acertos == 3) || (acertos == 4)) {
				System.out.printf("Parabéns, você QUASE gabaritou! Acertou %d de 5 questões.%n", acertos);

			} else if (acertos == 5) {
				System.out.printf("PARABÉNS, VOCÊ GABARITOU! Acertou %d de 5 questões!%n", acertos);
			}

			if (acertos > 0) {
				System.out.println();
				System.out.println("Você acertou as seguintes questões:");
				for (int i = 1; i <= 5; i++) {
					if (contador[i] != 0) {
						System.out.println(contador[i]);
					}
				}
			} else {
				System.out
						.println("Poxa! Parece que você não acertou nenhuma questão, estude mais na próxima vez :/\n");
			}

		} else if (dificuldade == 2) {
			System.out.println("QUIZ - MÉDIO\n");
			System.out.println(
					"Questão 1: Qual é o método mais comumente usado para representar números negativos em binário?\n");
			System.out.println("1. Complemento de um\r\n" + "2. Complemento de dois\r\n" + "3. Complemento de três\r\n"
					+ "4. Notação de sinal e magnitude");

			int resposta = sc.nextInt();
			if (resposta == 2) {
				contador[1]++;
				acertos++;
			}
			System.out.println(
					"Questão 2: Marcos possui uma renda de R$3.250,00, sabendo que desse valor ele gasta 1/5 com compras do mês.\r\n"
							+ "Qual o valor que restará do salário de Marcos para o resto do mês?\r\n"
							+ "Converta esse mesmo número para binário.\n");
			System.out.println("1. R$1625,00 - 1110110110\r\n" + "2. R$2600,00 -10100010100\r\n"
					+ "3. R$1625,00 - 11001011001\r\n" + "4. R$2600,00 - 101000101000");

			resposta = sc.nextInt();

			if (resposta == 4) {
				contador[2] = 2;
				acertos++;
			}

			System.out.println("Questão 3: Um determinado número possui seus 15% igual a 9, qual é esse número?\r\n"
					+ "Converta o mesmo para números binários\n");
			System.out.println("1. 89 - 111010\r\n" + "2. 60 - 111100\r\n" + "3. 60 - 1001001\r\n" + "4. 89 - 1011001");

			resposta = sc.nextInt();

			if (resposta == 2) {
				contador[3] = 3;
				acertos++;
			}
			System.out.println("Questão 4: Encontre o valor de 25% de 2.500 e converta em binário.\n ");
			System.out.println("1. 625 - 1001110001\r\n" + "2. 630 - 1001110110\r\n" + "3. 680 - 1010101000\r\n"
					+ "4. 625 - 1010000101");
			resposta = sc.nextInt();

			if (resposta == 1) {
				contador[4] = 4;
				acertos++;
			}

			System.out.println("Questão 5: Em um supermercado uma peça de filé de Boi de 1,5 Kg custa R$ 60,00.\r\n"
					+ "Se um pessoa comprar 2 Kg da mesma peça qual será o valor dela?\r\n"
					+ "Converta para binário o resultado.\n");
			System.out.println("1. R$75,00 - 101101\r\n" + "2. R$75,00 - 111001\r\n" + "3. R$80,00 - 111100\r\n"
					+ "4. R$80,00 - 1010000");

			resposta = sc.nextInt();

			if (resposta == 4) {
				contador[5] = 5;
				acertos++;
			}

			if ((acertos == 1) || (acertos == 2)) {
				System.out.printf("Parabéns, você acertou %d de 5 questões! Mas ainda tem muito o que melhorar...%n",
						acertos);

			} else if ((acertos == 3) || (acertos == 4)) {
				System.out.printf("Parabéns, você QUASE gabaritou! Acertou %d de 5 questões.%n", acertos);

			} else if (acertos == 5) {
				System.out.printf("PARABÉNS, VOCÊ GABARITOU! Acertou %d de 5 questões!%n", acertos);
			}

			if (acertos > 0) {
				System.out.println();
				System.out.println("Você acertou as seguintes questões:");
				for (int i = 1; i <= 5; i++) {
					if (contador[i] != 0) {
						System.out.println(contador[i]);
					}
				}
			} else {
				System.out
						.println("Poxa! Parece que você não acertou nenhuma questão, estude mais na próxima vez :/\n");
			}

		} else if (dificuldade == 3) {
			System.out.println("QUIZ - DIFÍCIL\n");
			System.out.println("Questão 1: Qual é o propósito principal dos operadores de mudança de bits em C?\n");
			System.out.println("1. Realizar operações aritméticas complexas\r\n"
					+ "2. Realizar manipulações eficientes de bits em dados\r\n"
					+ "3. Facilitar a declaração de variáveis\r\n" + "4. Realizar comparações entre variáveis");
			int resposta = sc.nextInt();
			if (resposta == 2) {
				contador[1]++;
				acertos++;
			}
			System.out.println(
					"Questão 2: Uma empresa fabricante de carros elétricos está desenvolvendo um novo modelo,\r\n"
					+ "as placas dos carros serão identificadas por meio de código hexadecimal exclusivo.\r\n"
							+ "O código de um dos carros é E5B9, convertendo para binário e seguida para decimal,\r\n"
							+ "o valor será a potência máxima do veículo.\n\n"
							+ "A potência máxima do carro é:\n");
			System.out.println("1. 5793\r\n" + "2. 14925\r\n" + "3. 58809\r\n" + "4. 43001");

			resposta = sc.nextInt();

			if (resposta == 3) {
				contador[2] = 2;
				acertos++;
			}

			System.out.println(
					"Questão 3: Como é possível eliminar partes indesejadas\r\n"
					+ "de um número utilizando operadores de deslocamento de bits e AND (E bit a bit)?\n");
			System.out.println("1. Combinando os valores de dois números\r\n"
					+ "2. Comparando os bits mais significativos de dois números\r\n"
					+ "3. Comparando os bits menos significativos de dois números\r\n"
					+ "4. Zerando os bits indesejados ao aplicar uma máscara de bits com o operador AND");
			resposta = sc.nextInt();

			if (resposta == 4) {
				contador[3] = 3;
				acertos++;
			}
			System.out.println(
					"Questão 4: Para que serve a operação XOR (OU exclusivo) quando aplicada a um bit por 1 em um número binário?\n");
			System.out.println("1. Define o bit como 1\r\n" + "2. Inverte o bit\r\n" + "3. Mantém o bit inalterado\r\n"
					+ "4. Transforma o bit em 0");
			resposta = sc.nextInt();

			if (resposta == 2) {
				contador[4] = 4;
				acertos++;
			}

			System.out.println(
					"Questão 5: 10 anos antes da guerra dos clones, o mestre Jedi Zaifo Vias encomendou um exército do povo kaminoano,\r\n"
					+ "pois a república precisaria de poder bélico.\r\n"
							+ "Após sua morte, os Sith tomaram posse dos 124F80 clones. \r\n\n"
							+ "O exército de clones tinha quantos soldados?\n");
			System.out.println("1. 2.400.000\r\n" + "2. 1.170.000\r\n" + "3. 1.200.000\r\n" + "4. 1.400.000");
			resposta = sc.nextInt();

			if (resposta == 3) {
				contador[5] = 5;
				acertos++;
			}

			if ((acertos == 1) || (acertos == 2)) {
				System.out.printf("Parabéns, você acertou %d de 5 questões! Mas ainda tem muito o que melhorar...%n",
						acertos);

			} else if ((acertos == 3) || (acertos == 4)) {
				System.out.printf("Parabéns, você QUASE gabaritou! Acertou %d de 5 questões.%n", acertos);

			} else if (acertos == 5) {
				System.out.printf("PARABÉNS, VOCÊ GABARITOU! Acertou %d de 5 questões!%n", acertos);
			}

			if (acertos > 0) {
				System.out.println();
				System.out.println("Você acertou as seguintes questões:");
				for (int i = 1; i <= 5; i++) {
					if (contador[i] != 0) {
						System.out.println(contador[i]);
					}
				}
			} else {
				System.out
						.println("Poxa! Parece que você não acertou nenhuma questão, estude mais na próxima vez :/\n");
			}

		} else {
			System.out.println("Por favor, digite um número válido!");
		}
		sc.close();
	}

}
