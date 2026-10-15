public class CalendarioF1 {
    private Circuito[] circuitos;

    // Recebe o vetor preenchido
    public CalendarioF1(Circuito[] circuitos) {
        this.circuitos = circuitos;
    }

    // 1. Percorre o vetor exibindo todos os circuitos
    public void listarTodos() {
        System.out.println("=== CALENDÁRIO COMPLETO F1 2026 ===");
        for (Circuito c : this.circuitos) {
            c.exibirResumo();
        }
    }

    // 2. Busca a maior pista em extensão por volta
    public Circuito obterMaiorPista() {
        if (circuitos == null || circuitos.length == 0) return null;

        Circuito maior = null;
        /*
         *
         * SEU CÓDIGO AQUI
         *
         */
        return maior;
    }

    // 3. Busca a menor pista em extensão por volta
    public Circuito obterMenorPista() {
        if (circuitos == null || circuitos.length == 0) return null;

        Circuito menor = null;
        /*
         *
         * SEU CÓDIGO AQUI
         *
         */
        return menor;
    }

    // 4. Calcula a média de quilometragem por volta
    public double calcularMediaExtensao() {
        if (circuitos == null || circuitos.length == 0) return 0.0;

        double media = 0.0;
        /*
         *
         * SEU CÓDIGO AQUI
         *
         */
        return media;
    }

    // 5. Filtra e exibe pistas por tipo (ex: "Rua")
    public void listarPorTipo(String tipoBuscado) {
        System.out.println("\n=== CIRCUITOS DO TIPO: " + tipoBuscado.toUpperCase() + " ===");
        boolean encontrou = false;
        /*
         *
         * SEU CÓDIGO AQUI
         *
         */
        if (!encontrou) {
            System.out.println("Nenhum circuito encontrado para o tipo informado.");
        }
    }

    // 6. Encontra o circuito com o maior número de curvas
    public Circuito circuitoComMaisCurvas() {
        if (circuitos == null || circuitos.length == 0) return null;

        Circuito maisSinuoso = null;
        /*
         *
         * SEU CÓDIGO AQUI
         *
         */

        return maisSinuoso;
    }
}