package psw.esempiojpa.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Categoria {
    private long id;

    @GeneratedValue
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String nome;

    @Basic
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Collection<Prodotto> prodotti;

    @OneToMany(mappedBy = "categoria")
    public Collection<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(Collection<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }
}
