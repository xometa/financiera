package entities;
// Generated Dec 30, 2020 2:22:52 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contrato generated by hbm2java
 */
@Entity
@Table(name="contrato"
    ,catalog="institucion_financiera"
)
public class Contrato  implements java.io.Serializable {


     private int id;
     private Prestamo prestamo;
     private Date fecha;
     private String imagen;

    public Contrato() {
    }

    public Contrato(int id, Prestamo prestamo, Date fecha, String imagen) {
       this.id = id;
       this.prestamo = prestamo;
       this.fecha = fecha;
       this.imagen = imagen;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idprestamo", nullable=false)
    public Prestamo getPrestamo() {
        return this.prestamo;
    }
    
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", nullable=false, length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="imagen", nullable=false, length=300)
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }




}


