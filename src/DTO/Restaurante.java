package DTO;
import java.util.List;
public class Restaurante {

    private int id;
    private String nome;
    private String cnpj;
    private List<Lanche> cardapio;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Lanche> getCardapio() {
        return cardapio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
