public class Candidato {
    private int numero; // Número do candidato
    private String nome; // Nome do candidato
    private int votos; // Quantidade de votos

    // Construtor para receber o número e o nome do candidato
    public Candidato(int numero, String nomeCandidato) {
        this.numero = numero; // Atribui o número do candidato
        this.nome = nomeCandidato; // Atribui o nome do candidato
        this.votos = 0; // Começar com zero votos
    }

    public int getNumero() {
        return numero; // Retorna o número do candidato
    }

    public String getNome() {
        return nome; // Retorna o nome do candidato
    }

    public int getVotos() {
        return votos; // Retorna a quantidade de votos
    }

    // Método para incrementar o número de votos
    public void incrementarVotos() {
        votos++; // Adiciona 1 ao total de votos
    }
}
