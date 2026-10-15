public class Main {
    public static void main(String[] args) {
        // Base de dados estática
        Circuito[] listaFixa = {
            new Circuito("Circuito de Albert Park", "GP da Austrália", "Austrália", "Rua", 5.278, 58, 14),
            new Circuito("Circuito Internacional de Xangai", "GP da China", "China", "Permanente", 5.451, 56, 16),
            new Circuito("Circuito de Suzuka", "GP do Japão", "Japão", "Permanente", 5.807, 53, 18),
            new Circuito("Circuito Internacional do Bahrein", "GP do Bahrein", "Bahrein", "Permanente", 5.412, 57, 15),
            new Circuito("Jeddah Corniche Circuit", "GP da Arábia Saudita", "Arábia Saudita", "Rua", 6.174, 50, 27),
            new Circuito("Autódromo Internacional de Miami", "GP de Miami", "Estados Unidos", "Rua", 5.412, 57, 19),
            new Circuito("Autódromo Enzo e Dino Ferrari", "GP da Emília-Romanha", "Itália", "Permanente", 4.909, 63, 19),
            new Circuito("Circuito de Monte Carlo", "GP de Mônaco", "Mônaco", "Rua", 3.337, 78, 19),
            new Circuito("Circuito IFEMA Madrid", "GP da Espanha", "Espanha", "Hibrido", 5.474, 56, 20),
            new Circuito("Circuito Gilles Villeneuve", "GP do Canadá", "Canadá", "Rua", 4.361, 70, 14),
            new Circuito("Red Bull Ring", "GP da Áustria", "Áustria", "Permanente", 4.318, 71, 10),
            new Circuito("Circuito de Silverstone", "GP da Grã-Bretanha", "Reino Unido", "Permanente", 5.891, 52, 18),
            new Circuito("Spa-Francorchamps", "GP da Bélgica", "Bélgica", "Permanente", 7.004, 44, 19),
            new Circuito("Hungaroring", "GP da Hungria", "Hungria", "Permanente", 4.381, 70, 14),
            new Circuito("Circuito de Zandvoort", "GP dos Países Baixos", "Países Baixos", "Permanente", 4.259, 72, 14),
            new Circuito("Autodromo Nazionale Monza", "GP da Itália", "Itália", "Permanente", 5.793, 53, 11),
            new Circuito("Circuito Urbano de Baku", "GP do Azerbaijão", "Azerbaijão", "Rua", 6.003, 51, 20),
            new Circuito("Marina Bay Street Circuit", "GP de Singapura", "Singapura", "Rua", 4.940, 62, 19),
            new Circuito("Circuito das Américas", "GP dos Estados Unidos", "Estados Unidos", "Permanente", 5.513, 56, 20),
            new Circuito("Autódromo Hermanos Rodríguez", "GP do México", "México", "Permanente", 4.304, 71, 17),
            new Circuito("Autódromo de Interlagos", "GP de São Paulo", "Brasil", "Permanente", 4.309, 71, 15),
            new Circuito("Las Vegas Strip Circuit", "GP de Las Vegas", "Estados Unidos", "Rua", 6.201, 50, 17),
            new Circuito("Circuito Internacional de Lusail", "GP do Catar", "Catar", "Permanente", 5.419, 57, 16),
            new Circuito("Circuito de Yas Marina", "GP de Abu Dhabi", "Emirados Árabes", "Permanente", 5.281, 58, 16)
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
