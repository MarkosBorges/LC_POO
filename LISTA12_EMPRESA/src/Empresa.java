import java.util.Locale;
import java.text.NumberFormat;

public class Empresa {
    // Atributos
    private String nome;
    private double capital;
    private int nFuncionarios;

    // Construtor
    public Empresa(String nome, double capital, int numfunc) {
        this.nome = nome;
        this.capital = capital;
        this.nFuncionarios = numfunc;
    }

    // Métodos
    public void aumentarCapital(double valor) {
        this.capital += valor;
    }

    public boolean diminuirCapital(double valor) {
        if (valor <= capital) {
            this.capital -= valor;
            return true;
        }
        return false;
    }

    public void admitir(int quantidade) {
        this.nFuncionarios += quantidade;
    }

    public boolean demitir(int quantidade) {
        if (quantidade <= nFuncionarios) {
            this.nFuncionarios -= quantidade;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public double getCapital() {
        return capital;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }

    @Override
    public String toString() {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat nroFormatado = NumberFormat.getNumberInstance(localeBR);
        return "Empresa: " + nome +
                "\nCapital R$: " + nroFormatado.format(capital) +
                "\nNumero de Funcionarios: " + nFuncionarios;
    }
}
