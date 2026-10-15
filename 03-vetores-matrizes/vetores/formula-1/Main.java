public class Main {
    public static void main(String[] args) {
        // Base de dados estática
        Circuito[] listaFixa = {
                new Circuito("Circuito de Monte Carlo", "GP de Mônaco", "Mônaco", "Rua", 3.337, 78, 19),
                new Circuito("Spa-Francorchamps", "GP da Bélgica", "Bélgica", "Permanente", 7.004, 44, 19),
                new Circuito("Interlagos", "GP de São Paulo", "Brasil", "Permanente", 4.309, 71, 15),
                new Circuito("Autodromo Nazionale Monza", "GP da Itália", "Itália", "Permanente", 5.793, 53, 11),
                new Circuito("Las Vegas Strip Circuit", "GP de Las Vegas", "Estados Unidos", "Rua", 6.201, 50, 17),
                new Circuito("Circuito IFEMA Madrid", "GP da Espanha", "Espanha", "Hibrido", 5.474, 56, 20),
                new Circuito("Circuito Urbano de Baku", "GP do Azerbaijão", "Azerbaijão", "Rua", 6.003, 51, 20),
                new Circuito("Red Bull Ring", "GP da Áustria", "Áustria", "Permanente", 4.318, 71, 10)
        };

        // Instanciando o gerenciador com os dados
        CalendarioF1 calendario = new CalendarioF1(listaFixa);

        // 1. Listagem completa
        calendario.listarTodos();

        System.out.println("\n------------------------------------------------------------");

        // 2. Maior e menor pista
        Circuito maior = calendario.obterMaiorPista();
        Circuito menor = calendario.obterMenorPista();

        System.out.printf("Pista mais longa: %s (%s) com %.3f km por volta%n",
                maior.getNome(), maior.getGrandePremio(), maior.getExtensaoKm());

        System.out.printf(" Pista mais curta: %s (%s) com %.3f km por volta%n",
                menor.getNome(), menor.getGrandePremio(), menor.getExtensaoKm());

        // 3. Média de extensão
        System.out.printf(" Extensão média das pistas: %.3f km%n", calendario.calcularMediaExtensao());

        // 4. Pista mais sinuosa (mais curvas)
        Circuito maisCurvas = calendario.circuitoComMaisCurvas();
        System.out.printf(" Pista com mais curvas: %s com %d curvas%n",
                maisCurvas.getNome(), maisCurvas.getNumeroCurvas());

        // 5. Filtro por tipo
        calendario.listarPorTipo("Rua");
    }
}