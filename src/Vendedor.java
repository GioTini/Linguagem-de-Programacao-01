public class Vendedor extends Empregado {
    private double valorVendas;
    private int comissao;

    public Vendedor(String nome, String telefone, String endereco, int codigoSetor,
                    double salarioBase, double imposto, double valorVendas, int comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + valorVendas + comissao;
    }
}
