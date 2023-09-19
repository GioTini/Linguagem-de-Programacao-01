public class Operario extends Empregado {
    private int valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, String endereco, int codigoSetor,
                    double salarioBase, double imposto, int valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public int getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comissao + valorProducao;
    }
}
