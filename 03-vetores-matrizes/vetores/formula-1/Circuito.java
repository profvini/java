public class Circuito {
    private String nome;
    private String grandePremio;
    private String pais;
    private String tipo;          // "Permanente", "Rua", "Hibrido"
    private double extensaoKm;
    private int numeroVoltas;
    private int numeroCurvas;

    // Construtor completo
    public Circuito(String nome, String grandePremio, String pais, String tipo,
                    double extensaoKm, int numeroVoltas, int numeroCurvas) {
        this.nome = nome;
        this.grandePremio = grandePremio;
        this.pais = pais;
        this.tipo = tipo;
        this.extensaoKm = extensaoKm;
        this.numeroVoltas = numeroVoltas;
        this.numeroCurvas = numeroCurvas;
    }

    // Regra de negócio: Distância total da prova
    public double calcularDistanciaTotalCorrida() {

        float dist = 0;
        /*
         *
         * SEU CÓDIGO AQUI
         *
         */
        return dist;
    }

    // Exibição formatada dos dados do circuito
    public void exibirResumo() {
        System.out.printf("[%s] %s (%s) | Tipo: %s | Extensão: %.3f km | Voltas: %d | Curvas: %d | Dist. Total: %.2f km%n",
                this.grandePremio, this.nome, this.pais, this.tipo,
                this.extensaoKm, this.numeroVoltas, this.numeroCurvas,
                this.calcularDistanciaTotalCorrida());
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getGrandePremio() { return grandePremio; }
    public void setGrandePremio(String grandePremio) { this.grandePremio = grandePremio; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getExtensaoKm() { return extensaoKm; }
    public void setExtensaoKm(double extensaoKm) { this.extensaoKm = extensaoKm; }

    public int getNumeroVoltas() { return numeroVoltas; }
    public void setNumeroVoltas(int numeroVoltas) { this.numeroVoltas = numeroVoltas; }

    public int getNumeroCurvas() { return numeroCurvas; }
    public void setNumeroCurvas(int numeroCurvas) { this.numeroCurvas = numeroCurvas; }
}