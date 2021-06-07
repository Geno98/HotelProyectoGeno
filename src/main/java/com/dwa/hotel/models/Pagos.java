// Generated with g9.

package com.dwa.hotel.models;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="pagos")
public class Pagos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id", unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="TipoPago", nullable=false, length=10)
    private String tipoPago;
    @Column(name="NumSeguridad", nullable=false, precision=10)
    private int numSeguridad;
    @Column(name="FechaVencimiento", nullable=false, length=10)
    private String fechaVencimiento;
    @Column(name="NumTarjeta", nullable=false, length=16)
    private String numTarjeta;
    @ManyToOne(optional=false)
    @JoinColumn(name="idusuario", nullable=false)
    private Usuarios usuarios;

    /** Default constructor. */
    public Pagos() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for tipoPago.
     *
     * @return the current value of tipoPago
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Setter method for tipoPago.
     *
     * @param aTipoPago the new value for tipoPago
     */
    public void setTipoPago(String aTipoPago) {
        tipoPago = aTipoPago;
    }

    /**
     * Access method for numSeguridad.
     *
     * @return the current value of numSeguridad
     */
    public int getNumSeguridad() {
        return numSeguridad;
    }

    /**
     * Setter method for numSeguridad.
     *
     * @param aNumSeguridad the new value for numSeguridad
     */
    public void setNumSeguridad(int aNumSeguridad) {
        numSeguridad = aNumSeguridad;
    }

    /**
     * Access method for fechaVencimiento.
     *
     * @return the current value of fechaVencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Setter method for fechaVencimiento.
     *
     * @param aFechaVencimiento the new value for fechaVencimiento
     */
    public void setFechaVencimiento(String aFechaVencimiento) {
        fechaVencimiento = aFechaVencimiento;
    }

    /**
     * Access method for numTarjeta.
     *
     * @return the current value of numTarjeta
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Setter method for numTarjeta.
     *
     * @param aNumTarjeta the new value for numTarjeta
     */
    public void setNumTarjeta(String aNumTarjeta) {
        numTarjeta = aNumTarjeta;
    }

    /**
     * Access method for usuarios.
     *
     * @return the current value of usuarios
     */
    public Usuarios getUsuarios() {
        return usuarios;
    }

    /**
     * Setter method for usuarios.
     *
     * @param aUsuarios the new value for usuarios
     */
    public void setUsuarios(Usuarios aUsuarios) {
        usuarios = aUsuarios;
    }

    /**
     * Compares the key for this instance with another Pagos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Pagos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Pagos)) {
            return false;
        }
        Pagos that = (Pagos) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Pagos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Pagos)) return false;
        return this.equalKeys(other) && ((Pagos)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Pagos |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
