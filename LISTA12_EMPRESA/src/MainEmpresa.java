import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MainEmpresa {
    public static void main(String[] args) {
        // Variáveis auxiliares
        int quant;
        double valor;
        String nomeEmpresaMenorFuncionarios = null, nomeEmpresaMaiorCapital = null;

        // List para armazenar as empresas
        List<Empresa> empresas = new ArrayList<>();

        // Carregando as empresas (5 empresas, conforme enunciado)
        for (int i = 0; i < 2; i++) {
            String nome = JOptionPane.showInputDialog("Informe o nome da Empresa:");
            double capital = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Capital da Empresa:"));
            int nFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de funcionários da Empresa:"));

            // Adicionando a empresa na lista
            empresas.add(new Empresa(nome, capital, nFuncionarios));
        }

        // Aumentar o capital da empresa localizada no índice 4
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para acrescentar ao Capital da Empresa no índice 4:"));
        empresas.get(4).aumentarCapital(valor);
        System.out.println("Dados da empresa após aumento do capital: ");
        System.out.println(empresas.get(4).toString());

        // Diminuir o capital da empresa no índice 2
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para diminuir do Capital da Empresa no índice 2:"));
        if (empresas.get(2).diminuirCapital(valor)) {
            System.out.println("Dados da empresa após diminuição do capital: ");
            System.out.println(empresas.get(2).toString());
        } else {
            System.out.println("Valor não pode ser maior do que o Capital!");
        }

        // Demissão de funcionários da empresa no índice 1
        quant = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de funcionários a serem demitidos da Empresa no índice 1:"));
        if (empresas.get(1).demitir(quant)) {
            System.out.println("Dados da empresa após demissão: ");
            System.out.println(empresas.get(1).toString());
        } else {
            System.out.println("Número de demitidos não pode ser maior do que o número de funcionários!");
        }

        // Admitir funcionários na empresa no índice 0
        quant = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de funcionários a serem admitidos na Empresa no índice 0:"));
        empresas.get(0).admitir(quant);
        System.out.println("Dados da empresa após admissão de funcionários: ");
        System.out.println(empresas.get(0).toString());

        // Encontrar empresa com menor número de funcionários e maior capital
        int menorFuncionarios = Integer.MAX_VALUE;
        double maiorCapital = 0.0;

        for (Empresa emp : empresas) {
            if (emp.getnFuncionarios() < menorFuncionarios) {
                menorFuncionarios = emp.getnFuncionarios();
                nomeEmpresaMenorFuncionarios = emp.getNome();
            }

            if (emp.getCapital() > maiorCapital) {
                maiorCapital = emp.getCapital();
                nomeEmpresaMaiorCapital = emp.getNome();
            }
        }

        // Exibir resultados
        System.out.println("Empresa com menor número de funcionários: " + nomeEmpresaMenorFuncionarios);
        System.out.println("Empresa com maior capital: " + nomeEmpresaMaiorCapital);
    }
}
