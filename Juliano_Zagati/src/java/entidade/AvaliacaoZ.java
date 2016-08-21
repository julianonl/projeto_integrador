
package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AvaliacaoZ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    @Column(name = "comentario_j", length = 255, nullable = false)
    private String comentario;
   @Column(name = "status_j", length = 100, nullable = false)
    private String status;
   @Column(name = "notaAvaliacao_j", nullable = false)
   private Double notaAvaliacao;

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getComentario() {
        return comentario;
    }

    public String getStatus() {
        return status;
    }

    public Double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotaAvaliacao(Double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvaliacaoZ)) {
            return false;
        }
        AvaliacaoZ other = (AvaliacaoZ) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.AvaliacaoZ[ id=" + id + " ]";
    }
    
}
