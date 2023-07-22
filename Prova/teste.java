public class testeAda {

    public static void main(String[] args) {
        final testeAda calculos = new testeAda(); //instancia
        calculos.calculando();


    }

    public void calculando() {

        //array comdados de pessoas
        String[][] dadosPessoas = new String[][]{
                {"Ana", "Paulo", "Márcia", "Pedro", "Beatriz"},
                {"1.70", "1.72", "1.62", "1.90", "1.53"},
                {"80", "90", "61", "84", "49"}};


        // CALCULANDO A MÉDIA DA ALTURA

        double soma = 0; //soma da altura
        int quantidade = dadosPessoas[1].length; //quantidade de pessoas

        // Calculando a soma das alturas
        for (int i = 0; i < quantidade; i++) {
            double altura = Double.parseDouble(dadosPessoas[1][i]);
            soma += altura;
        }

        double media = soma / quantidade; // Calcula a média das alturas
        System.out.println("A média de altura é: " + media);


        //CALCULANDO A MÉDIA DO PESO

        double somaPeso = 0; //soma da altura
        int quantidadeDePessoas = dadosPessoas[2].length; //quantidade de pessoas

        // Calculando a soma das pesos
        for (int i = 0; i < quantidade; i++) {
            double peso = Double.parseDouble(dadosPessoas[2][i]);
            soma += peso;
        }
        double media1 = soma / quantidadeDePessoas; // Calcula a média dos pesos

        System.out.println("A média dos pesos é: " + media1);


        // O NOME E IMC DAS PESSOAS

        // Calculando o IMC e exibindo o nome das pessoa
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome = dadosPessoas[0][i];
            double altura = Double.parseDouble(dadosPessoas[1][i]);// altura das pessoas
            double peso = Double.parseDouble(dadosPessoas[2][i]); //peso das pessoas

            double media2 = peso / (altura * altura);


            System.out.printf("O IMC de " + dadosPessoas[0][i] + " é de: " + "%.2f", media2);
        }
        System.out.println(" ");


        //NOME DA PESSOA MAIS ALTA E A SUA ALTURA

        double alturaDaMaisAlta = 0;
        String nomeDoMaisAlto = "";

        // calculando a pessoa mais alta
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome = dadosPessoas[0][i];
            double altura = Double.parseDouble(dadosPessoas[1][i]);

            if (altura > alturaDaMaisAlta) {
                alturaDaMaisAlta = altura;
                nomeDoMaisAlto = nome;
            }
        }

        System.out.printf("A pessoa mais alta é: " + nomeDoMaisAlto +
                " e a sua altura é de: " + "%.2f", alturaDaMaisAlta);

        System.out.println(" ");

        //NOME DA PESSOA MAIS BAIXA E A SUA ALTURA

        double alturaDAMaisBaixa = Double.MAX_VALUE;
        String nomeDoMaisBaixo = "";

        // calculando a pessoa mais baixa
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome1 = dadosPessoas[0][i];
            double altura1 = Double.parseDouble(dadosPessoas[1][i]);

            // a altura é menor que a alturaDaMaisBaixa
            if (altura1 < alturaDAMaisBaixa) {
                alturaDAMaisBaixa = altura1;
                nomeDoMaisBaixo = nome1;
            }
        }

        System.out.printf("A pessoa mais baixa é: " + nomeDoMaisBaixo +
                " e a sua altura é de: " + "%.2f", alturaDAMaisBaixa);

        System.out.println(" ");

        //NOME DA PESSOA MAIS PESADA E O SEU PESO


        double pessoaMaiorPeso = 0; //maior peso
        String nomeMaiorPeso = ""; //nome da pessoa com o maior peso

        // calculando a pessoa com maior peso
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome2 = dadosPessoas[0][i];
            double peso2 = Double.parseDouble(dadosPessoas[2][i]);

            if (peso2 > pessoaMaiorPeso) {
                pessoaMaiorPeso = peso2;
                nomeMaiorPeso = nome2;

            }
        }

        System.out.printf("A pessoa com maior peso é: " + nomeMaiorPeso +
                " e o seu peso é de: " + "%.2f", pessoaMaiorPeso);


        System.out.println(" ");


        //NOME PESSOA MAIS LEVE E SEU PESO

        double pesoMaisLeve = Double.MAX_VALUE;
        String nomeDoPesoMaisLeve = "";

        // calculando a pessoa com menor peso
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome3 = dadosPessoas[0][i];
            double peso3 = Double.parseDouble(dadosPessoas[2][i]);

            if (peso3 < pesoMaisLeve) {
                pesoMaisLeve = peso3;
                nomeDoPesoMaisLeve = nome3;

            }
        }

        System.out.printf("A pessoa com menor peso é: " + nomeDoPesoMaisLeve +
                " e o seu peso é de: " + "%.2f", pesoMaisLeve);


        System.out.println(" ");


        //NOME DA PESSOA COM MAIS IMC E SEU VALOR

        double maiorIMC1 = 0; //valor do maior IMC
        String pessoaMaiorIMC = ""; //Nome da pessoa com o maior IMC

        // calculando a pessoa com maior IMC
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome = dadosPessoas[0][i];
            double altura5 = Double.parseDouble(dadosPessoas[1][i]);
            double peso5 = Double.parseDouble(dadosPessoas[2][i]);

            double imc = peso5 / (altura5 * altura5);

            if (imc > maiorIMC1) {
                maiorIMC1 = imc;
                pessoaMaiorIMC = nome;
            }
        }

        System.out.printf("A pessoa com maior IMC é: " + pessoaMaiorIMC + " e o seu IMC é de " + "%.2f", maiorIMC1);

        System.out.println("");


        //PESSOA COM MENOR IMC E O SEU VALOR

        double menorIMC = Double.MAX_VALUE;
        String pessoamenorIMC = "";

        // calculando a pessoa com MENOR IMC
        for (int i = 0; i < dadosPessoas[0].length; i++) {
            String nome6 = dadosPessoas[0][i];
            double altura6 = Double.parseDouble(dadosPessoas[1][i]);
            double peso6 = Double.parseDouble(dadosPessoas[2][i]);

            double imc = peso6 / (altura6 * altura6);

            if (imc < menorIMC) {
                menorIMC = imc;
                pessoamenorIMC = nome6;
            }

        }
        System.out.printf("A pessoa com menor IMC é: " + pessoamenorIMC +
                " e o seu IMC é de " + "%.2f", menorIMC);
    }
}
