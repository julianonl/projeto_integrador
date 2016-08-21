package entidade;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "evento_z")
public class EventoZ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome_j", length = 255, nullable = false)
    private String nome;
    @Column(name = "descricao_j", length = 255, nullable = false)
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Calendar dataEvento;

    public Calendar getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Calendar dataEvento) {
        this.dataEvento = dataEvento;
    }
    
    
   
    

    public Long getId() {
        return id;
    }

    
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EventoZ)) {
            return false;
        }
        EventoZ other = (EventoZ) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.EventoZ[ id=" + id + " ]";
    }

}
