package entities;
// Generated Dec 30, 2020 2:22:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departamento generated by hbm2java
 */
@Entity
@Table(name="departamento"
    ,catalog="institucion_financiera"
)
public class Departamento  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String codigo;
     private Set<Activofijo> activofijos = new HashSet<Activofijo>(0);

    public Departamento() {
    }

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Departamento(int id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public Departamento(int id, String nombre, String codigo, Set<Activofijo> activofijos) {
       this.id = id;
       this.nombre = nombre;
       this.codigo = codigo;
       this.activofijos = activofijos;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre", nullable=false, length=25)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="codigo", nullable=false, length=5)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Activofijo> getActivofijos() {
        return this.activofijos;
    }
    
    public void setActivofijos(Set<Activofijo> activofijos) {
        this.activofijos = activofijos;
    }




}


