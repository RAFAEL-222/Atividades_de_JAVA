import entidades.Roupa;

public class Main {
    public static void main(String[] args) {
        Roupa[] roupas = new Roupa[10];
        int total = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n1. Cadastrar Roupa");
            System.out.println("2. Ver Roupas");
            System.out.println("3. Add Estoque");
            System.out.println("4. Remover Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            int op = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (op == 5) break;

            if (op == 1) {
                System.out.print("Marca: ");
                String marca = scanner.nextLine();

                System.out.print("Tipo: ");
                String tipo = scanner.nextLine();

                System.out.print("Tamanho: ");
                String tamanho = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quant = scanner.nextInt();

                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine(); // limpar buffer

                roupas[total] = new Roupa(marca, tipo, tamanho, quant, valor);
                total++;
                System.out.println("Cadastrado!");
            }

            else if (op == 2) {
                if (total == 0) {
                    System.out.println("Nenhuma roupa!");
                    continue;
                }

                for (int i = 0; i < total; i++) {
                    System.out.println((i+1) + ". " + roupas[i].toString());
                }
            }

            else if (op == 3) {
                if (total == 0) {
                    System.out.println("Nenhuma roupa!");
                    continue;
                }

                for (int i = 0; i < total; i++) {
                    System.out.println((i+1) + ". " + roupas[i].marca + " " + roupas[i].tipo);
                }

                System.out.print("Escolha: ");
                int escolha = scanner.nextInt() - 1;
                scanner.nextLine(); // limpar buffer

                System.out.print("Quantidade para add: ");
                int qtd = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                roupas[escolha].adicionaEstoque(qtd);
                System.out.println("Estoque atualizado!");
            }

            else if (op == 4) {
                if (total == 0) {
                    System.out.println("Nenhuma roupa!");
                    continue;
                }

                for (int i = 0; i < total; i++) {
                    System.out.println((i+1) + ". " + roupas[i].marca + " " + roupas[i].tipo);
                }

                System.out.print("Escolha: ");
                int escolha = scanner.nextInt() - 1;
                scanner.nextLine(); // limpar buffer

                System.out.print("Quantidade para remover: ");
                int qtd = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                roupas[escolha].removeEstoque(qtd);
            }
        }
        scanner.close();
    }
}