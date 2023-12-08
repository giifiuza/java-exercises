package DTO;

public class Lanche {
    private String nome;
    private double preco;
    private String restaurante;  // Adicione o atributo restaurante

    public Lanche(String nome, double preco, String restaurante) {
        this.nome = nome;
        this.preco = preco;
        this.restaurante = restaurante;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
