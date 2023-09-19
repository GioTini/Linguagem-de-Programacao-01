public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Giordana",
                "996636304",
                "Rua Morango, 16");

        Fornecedor fornecedor = new Fornecedor("Joao",
                "99999999",
                "Rua Morango, 16",
                1200.00, 1000.00);

        System.out.println("Seja bem-vindo " + fornecedor.getNome());
        System.out.println("Seu credito é de: " + fornecedor.getValorCredito());
        System.out.println("Sua divida é de: " + fornecedor.getValorDivida());
        System.out.println("Seu salto atual é: " + fornecedor.obterSaldo());
        System.out.println(" ");



        Empregado empregado = new Empregado("Luiz",
                "874846284",
                "Rua Merengue 345",
                842,
                2000,
                9.0);

        System.out.println("Seja bem-vindo " + empregado.getNome());
        System.out.println("Seu salario base é de " + empregado.getSalarioBase());
        System.out.println("O imposto em cima do seu salario é de " + empregado.getImposto());
        System.out.println("Seu salario liquido ficou de " + empregado.calcularSalario());
        System.out.println(" ");

        Administrador administrador = new Administrador("Rakin",
                "87423469",
                "Rua Pessego 98",
                879,
                2000,
                9.0,
                700);

        System.out.println("Seja brm-vindo " + administrador.getNome());
        System.out.println("Seu salario base é de " + administrador.getSalarioBase());
        System.out.println("Sua ajuda de custo é de " + administrador.getAjudaDeCusto());
        System.out.println("Seu importo é de " + administrador.getImposto());
        System.out.println("No final, seu salario liquido ficou de " + administrador.calcularSalario());
        System.out.println(" ");

        Operario operario = new Operario("Bagi",
                "686261493",
                "Rua Cruel Summer 13",
                876,
                2000,
                9.0,
                500,
                350.0);

        System.out.println("Seja bem-vindo " + operario.getNome());
        System.out.println("Seu salario ao total ficou de: " + operario.calcularSalario());
        System.out.println(" ");

        Vendedor vendedor = new Vendedor("Cellbit",
                "746643983",
                "Rua AOP 20",
                666,
                2000,
                9.0,
                1000,
                600);

        System.out.println("Seja bem-vindo " + vendedor.getNome());
        System.out.println("Seu salario ao total ficou de: " + vendedor.calcularSalario());

    }
}