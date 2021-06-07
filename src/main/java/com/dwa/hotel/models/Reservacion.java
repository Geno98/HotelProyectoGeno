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


@Entity(name="reservacion")
public class Reservacion implements Serializable {

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
    @Column(name="NumAdultos", nullable=false, precision=10)
    private int numAdultos;
    @Column(name="NumNinios", nullable=false, precision=10)
    private int numNinios;
    @Column(name="NumMascotas", nullable=false, precision=10)
    private int numMascotas;
    @Column(name="TipoHabitacion", nullable=false, length=15)
    private String tipoHabitacion;
    @Column(name="NumHabitacion", nullable=false, precision=10)
    private int numHabitacion;
    @Column(name="Telefono", nullable=false, length=10)
    private String telefono;
    @Column(name="FechaEntrada", nullable=false, length=10)
    private String fechaEntrada;
    @Column(name="FechaSalida", nullable=false, length=10)
    private String fechaSalida;
    @ManyToOne(optional=false)
    @JoinColumn(name="idUsuario", nullable=false)
    private Usuarios usuarios;

    /** Default constructor. */
    public Reservacion() {
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
     * Access method for numAdultos.
     *
     * @return the current value of numAdultos
     */
    public int getNumAdultos() {
        return numAdultos;
    }

    /**
     * Setter method for numAdultos.
     *
     * @param aNumAdultos the new value for numAdultos
     */
    public void setNumAdultos(int aNumAdultos) {
        numAdultos = aNumAdultos;
    }

    /**
     * Access method for numNinios.
     *
     * @return the current value of numNinios
     */
    public int getNumNinios() {
        return numNinios;
    }

    /**
     * Setter method for numNinios.
     *
     * @param aNumNinios the new value for numNinios
     */
    public void setNumNinios(int aNumNinios) {
        numNinios = aNumNinios;
    }

    /**
     * Access method for numMascotas.
     *
     * @return the current value of numMascotas
     */
    public int getNumMascotas() {
        return numMascotas;
    }

    /**
     * Setter method for numMascotas.
     *
     * @param aNumMascotas the new value for numMascotas
     */
    public void setNumMascotas(int aNumMascotas) {
        numMascotas = aNumMascotas;
    }

    /**
     * Access method for tipoHabitacion.
     *
     * @return the current value of tipoHabitacion
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Setter method for tipoHabitacion.
     *
     * @param aTipoHabitacion the new value for tipoHabitacion
     */
    public void setTipoHabitacion(String aTipoHabitacion) {
        tipoHabitacion = aTipoHabitacion;
    }

    /**
     * Access method for numHabitacion.
     *
     * @return the current value of numHabitacion
     */
    public int getNumHabitacion() {
        return numHabitacion;
    }

    /**
     * Setter method for numHabitacion.
     *
     * @param aNumHabitacion the new value for numHabitacion
     */
    public void setNumHabitacion(int aNumHabitacion) {
        numHabitacion = aNumHabitacion;
    }

    /**
     * Access method for telefono.
     *
     * @return the current value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter method for telefono.
     *
     * @param aTelefono the new value for telefono
     */
    public void setTelefono(String aTelefono) {
        telefono = aTelefono;
    }

    /**
     * Access method for fechaEntrada.
     *
     * @return the current value of fechaEntrada
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Setter method for fechaEntrada.
     *
     * @param aFechaEntrada the new value for fechaEntrada
     */
    public void setFechaEntrada(String aFechaEntrada) {
        fechaEntrada = aFechaEntrada;
    }

    /**
     * Access method for fechaSalida.
     *
     * @return the current value of fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Setter method for fechaSalida.
     *
     * @param aFechaSalida the new value for fechaSalida
     */
    public void setFechaSalida(String aFechaSalida) {
        fechaSalida = aFechaSalida;
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
     * Compares the key for this instance with another Reservacion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reservacion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reservacion)) {
            return false;
        }
        Reservacion that = (Reservacion) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reservacion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reservacion)) return false;
        return this.equalKeys(other) && ((Reservacion)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Reservacion |");
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
