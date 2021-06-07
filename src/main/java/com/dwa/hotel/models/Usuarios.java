// Generated with g9.

package com.dwa.hotel.models;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name="usuarios")
public class Usuarios implements Serializable {

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
    @Column(name="CorreoE", nullable=false, length=100)
    private String correoE;
    @Column(name="Nombre", nullable=false, length=50)
    private String nombre;
    @Column(name="ClaveAcceso", nullable=false, length=20)
    private byte[] claveAcceso;
    @OneToMany(mappedBy="usuarios")
    private Set<Pagos> pagos;
    @OneToMany(mappedBy="usuarios")
    private Set<Reservacion> reservacion;

    /** Default constructor. */
    public Usuarios() {
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
     * Access method for correoE.
     *
     * @return the current value of correoE
     */
    public String getCorreoE() {
        return correoE;
    }

    /**
     * Setter method for correoE.
     *
     * @param aCorreoE the new value for correoE
     */
    public void setCorreoE(String aCorreoE) {
        correoE = aCorreoE;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for claveAcceso.
     *
     * @return the current value of claveAcceso
     */
    public byte[] getClaveAcceso() {
        return claveAcceso;
    }

    /**
     * Setter method for claveAcceso.
     *
     * @param aClaveAcceso the new value for claveAcceso
     */
    public void setClaveAcceso(byte[] aClaveAcceso) {
        claveAcceso = aClaveAcceso;
    }

    /**
     * Access method for pagos.
     *
     * @return the current value of pagos
     */
    public Set<Pagos> getPagos() {
        return pagos;
    }

    /**
     * Setter method for pagos.
     *
     * @param aPagos the new value for pagos
     */
    public void setPagos(Set<Pagos> aPagos) {
        pagos = aPagos;
    }

    /**
     * Access method for reservacion.
     *
     * @return the current value of reservacion
     */
    public Set<Reservacion> getReservacion() {
        return reservacion;
    }

    /**
     * Setter method for reservacion.
     *
     * @param aReservacion the new value for reservacion
     */
    public void setReservacion(Set<Reservacion> aReservacion) {
        reservacion = aReservacion;
    }

    /**
     * Compares the key for this instance with another Usuarios.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuarios and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuarios)) {
            return false;
        }
        Usuarios that = (Usuarios) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuarios.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuarios)) return false;
        return this.equalKeys(other) && ((Usuarios)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Usuarios |");
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
