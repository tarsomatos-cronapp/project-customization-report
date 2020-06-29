package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import cronapi.database.VersionConverter;


/**
* Classe que representa a tabela role_securable
* @generated
*/
@Entity
@Table(name = "\"role_securable\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.RoleSecurable")
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class RoleSecurable implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
    private java.lang.String id;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="role_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
    
    private Role role;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="securable_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
    
    private Securable securable;

    /**
    * Construtor
    * @generated
    */
    public RoleSecurable(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public RoleSecurable setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém role
    * return role
    * @generated
    */
    
    public Role getRole(){
        return this.role;
    }

    /**
    * Define role
    * @param role role
    * @generated
    */
    public RoleSecurable setRole(Role role){
        this.role = role;
        return this;
    }
    /**
    * Obtém securable
    * return securable
    * @generated
    */
    
    public Securable getSecurable(){
        return this.securable;
    }

    /**
    * Define securable
    * @param securable securable
    * @generated
    */
    public RoleSecurable setSecurable(Securable securable){
        this.securable = securable;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RoleSecurable object = (RoleSecurable)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}