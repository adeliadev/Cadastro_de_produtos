import java.util.*;

public class ProdutosMain {
    private static List<Produto> listaDeProdutos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        try {
            do {
                System.out.println("\n=== Menu de opções ===");
                System.out.println("[1] Cadastrar produto");
                System.out.println("[2] Listar produtos");
                System.out.println("[3] Sair");
                System.out.print("Digite a sua escolha: ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        cadastrarProduto(sc);
                        break;
                    case 2:
                        listarProdutos();
                        break;
                    case 3:
                        System.out.println("Programa finalizado!");
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!");
                }
            } while (escolha != 3);

        } catch (InputMismatchException e) {
            System.out.println("ERRO: dado esperado é de outro tipo. Tente novamente!");
        } finally {
            sc.close();
        }

    }

    private static void cadastrarProduto(Scanner sc){
        System.out.println("Nome do produto:");
        String nome = sc.next();
        System.out.println("Descrição do produto:");
        String descricao = sc.next();
        System.out.println("Valor do produto:");
        int valor = sc.nextInt();

        // VERIFICAÇÃO DA DISPONIBILIDADE DO PRODUTO
        String disponivel;
        boolean entradaValida = false;

        do {
            System.out.println("O produto está disponível para venda? [sim] ou [não]:");
            disponivel = sc.next().toLowerCase();

            if (disponivel.equals("sim") || disponivel.equals("não")) {
                entradaValida = true;
            } else {
                System.out.println("ERRO: Responda apenas com 'sim' ou 'não'.");
            }
        } while (!entradaValida);

        Produto produto = new Produto(nome, descricao, valor, disponivel);
        listaDeProdutos.add(produto);
        System.out.println(listaDeProdutos);
    }

    private static void listarProdutos(){
        if (listaDeProdutos.isEmpty()){
            System.out.println("A lista está vazia");
        } else {
            listaDeProdutos.sort(Comparator.comparingDouble(Produto::getValor));
            System.out.println("\n== Lista de produtos ==");
            for (Produto item:listaDeProdutos){
                System.out.println("Nome: " + item.getNome() + ", Valor: " + item.getValor());
            }
        }
    }
}
