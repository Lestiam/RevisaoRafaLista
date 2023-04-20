import entidades.Cliente;
import entidades.Ingresso;
import entidades.Pedido;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LojaJogos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Ingresso ingresso = new Ingresso();
        List<Ingresso> list = new ArrayList<>();
        Pedido pedido = new Pedido();
        List<Pedido> pedidos = new ArrayList<>();

        int n = 0;
        pedido.setIngressos(new ArrayList<>()); //fazer isso com pedido
        double valorF = 0.00;

        for (int i = 0; i <= n; i++) {
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente: ", "Nome"
                    , JOptionPane.PLAIN_MESSAGE);
            cliente.setNome(nome);

            String jogo = JOptionPane.showInputDialog(null, "Informe o nome do jogo: ", "Jogo"
                    , JOptionPane.PLAIN_MESSAGE);
            ingresso.setNomeJogo(jogo);

            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe o valor do jogo: ", "Valor"
                    , JOptionPane.PLAIN_MESSAGE));
            ingresso.setValor(valor);
            int quantidade = Integer.parseInt((JOptionPane.showInputDialog(null, " Informe a quantidade de ingresssos: ", "Quantidade"
                    , JOptionPane.PLAIN_MESSAGE)));
            list.add(new Ingresso(jogo, valor, quantidade));
            pedido = (new Pedido(jogo, valor, quantidade, cliente, list));
            pedidos.add(pedido);
            pedido.calcula();
            valorF += pedido.getValorF();
            char ch = JOptionPane.showInputDialog(null, "Deseja o ingresso de outro jogo além do jogo atual? (S/N)", "Jogo"
                    , JOptionPane.PLAIN_MESSAGE).toUpperCase().charAt(0);
            if (ch == 'S') {
                n++;
            }
        }
        for (Ingresso i : pedido.getIngressos()) {
                //int i = 0;
            String mensagem = "Pedido feito para " + cliente.getNome() + "\n"
                    + i.getQuantidade() + " Ingressos: " + i.getNomeJogo()
                    + "\nValor: " + String.format("%.2f", pedido.getValorF());
            JOptionPane.showMessageDialog(null, mensagem, "Valor do pedido:", JOptionPane.PLAIN_MESSAGE);
        }
        sc.close();
    }
}