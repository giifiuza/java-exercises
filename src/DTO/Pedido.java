package DTO;

import java.util.List;
public class Pedido {
    private int id;
    private Usuario usuario;
    private Restaurante restaurante;
    private List<Lanche> itens;

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public List<Lanche> getItens() {
        return itens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void setItens(List<Lanche> itens) {
        this.itens = itens;
    }
}
