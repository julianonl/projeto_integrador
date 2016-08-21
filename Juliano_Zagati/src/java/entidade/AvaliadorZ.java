
package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="avaliador_z")
public class AvaliadorZ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
     @Column(name = "nome_j", length = 255, nullable = false)
    private String nome;
    @Column(name = "cpf_j", unique = true, length = 11, nullable = false)
    private String cpf;
    @Column(name = "email_j", length = 100, nullable = true)
    private String email;
    @Column(name = "telefone_j", length = 11, nullable = true)
    private String telefone;
    @Column(name = "endereco_j", length = 150, nullable = true)
    private String endereco;
    @ManyToOne
    private CidadeZ cidade;
    @ManyToOne
    private FormacaoZ formacao;

    @Column(name="especializacao_j", length = 255, nullable = false)
    private String especializacao;
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public CidadeZ getCidade() {
        return cidade;
    }

    public FormacaoZ getFormacao() {
        return formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(CidadeZ cidade) {
        this.cidade = cidade;
    }

    public void setFormacao(FormacaoZ formacao) {
        this.formacao = formacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
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
        if (!(object instanceof AvaliadorZ)) {
            return false;
        }
        AvaliadorZ other = (AvaliadorZ) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.AvaliadorZ[ id=" + id + " ]";
    }
    
}
