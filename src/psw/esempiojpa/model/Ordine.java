package psw.esempiojpa.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Ordine {
    private long id;

    @GeneratedValue
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Cliente cliente;

    @ManyToOne(optional = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private Collection<dettaglioOrdine> dettagli;

    @OneToMany(fetch = FetchType.EAGER)
    public Collection<dettaglioOrdine> getDettagli() {
        return dettagli;
    }

    public void setDettagli(Collection<dettaglioOrdine> dettagli) {
        this.dettagli = dettagli;
    }

    private Date data;

    @Basic
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
