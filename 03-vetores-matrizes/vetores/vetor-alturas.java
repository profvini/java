void main() {
    /*
    E N A D E   2 0 2 1

    Considere a realização de uma pesquisa com 1 000 pessoas para obtenção das seguintes informações:
    - o valor da maior altura; o valor da menor altura;
    - a média das alturas;
    - quantas pessoas têm altura inferior à média das alturas.

    Considere, ainda, que um programador foi selecionado para desenvolver um modelo de código que soluciona o problema
    automatizando a coleta das alturas e a geração das informações.

    Com base nas informações apresentadas, desenvolva o código adequado para resolver o problema usando pseudocódigo ou
    uma linguagem de programação. (valor: 10,0 pontos)
     */

    //Vetor para armazenar a altura de 1000 pessoas
    float [] alturas = new float [1000];

    //Demais Variáveis
    float maiorAltura = 0;
    float menorAltura = 0;
    float mediaDasAlturas = 0;
    int quantidadeMenorMedia = 0;
    float somaDasAlturas = 0; // auxiliar para somar as alturas e em seguida fazer a media

    // Ler e Armazenar as 1000 alturas
    Scanner ler = new Scanner(System.in);
    for(int i = 0; i < alturas.length; i++){
        System.out.println("Digite a altura da pessoa  " + (i+1) +": ");
        alturas[i] = ler.nextFloat();
        somaDasAlturas += alturas[i];
    }

    // Calcular a média das alturas
    mediaDasAlturas = somaDasAlturas / alturas.length;

    maiorAltura = alturas[0];
    menorAltura = alturas[0];

    // Contar quantas alturas são menores que a média
    for (int i = 0; i < alturas.length; i++) {
        if(alturas[i] < mediaDasAlturas)
            quantidadeMenorMedia++;

        // Encontrar a maior altura
        if (alturas[i] > maiorAltura)
            maiorAltura = alturas[i];

        // Encontrar a menorAltura
        if(alturas[i] < menorAltura)
            menorAltura = alturas[i];
    }
    System.out.println("MAIOR ALTURA: " + maiorAltura);
    System.out.println("MENOR ALTURA: " + menorAltura);
    System.out.printf("MEDIA ALTURA: %.2f \n" , mediaDasAlturas);
    System.out.println("PESSOAS COM ALTURA MENOR QUE A MEDIA: " + quantidadeMenorMedia);
}
