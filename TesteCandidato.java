import java.util.ArrayList;
import java.util.Scanner;

public class TesteCandidato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidato> candidatos = new ArrayList<>();

        //input p qts candidatos vao ser cadastrados
        System.out.print("Quantos candidatos serão cadastrados?");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // quebra de linha

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Cadastrando candidato " + (i + 1) + ":");
            System.out.print("Número do candidato: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // quebra de linha
            System.out.print("Nome do candidato: ");
            String nome = scanner.nextLine();

            Candidato candidato = new Candidato(numero, nome);
            candidatos.add(candidato); //adc candidato a lista
        }
        
        //perguntar quantos votos vao ser adc
        System.out.print("Quantos votos deseja adicionar? ");
        int votos = scanner.nextInt();

        //processar os votos
        for (int i = 0; i < votos; i++){
            System.out.print("Digite o número do candidato que recebe o voto: ");
            int numeroCandidato = scanner.nextInt();

            for (Candidato candidato : candidatos) {
                if (candidato.getNumero() == numeroCandidato) {
                    candidato.incrementarVotos(); 
                    break;
            }
        }
    }

    System.out.println("\nResultados:");
    for (Candidato candidato : candidatos) {
        System.out.println("Número " + candidato.getNumero() + " - Nome: " + candidato.getNome() + " - Total de votos: " + candidato.getVotos());
    }

    scanner.close();
    }
}