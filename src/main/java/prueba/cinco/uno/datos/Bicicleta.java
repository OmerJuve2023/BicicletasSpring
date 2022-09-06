package prueba.cinco.uno.datos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBici;
    private String Aro;
    private String Cuadro;
    private String Manubrio;
    private String transmision;
    private String pedal;
    private String ruedas;
    private String asiento;

    public Bicicleta(String aro, String cuadro, String manubrio, String transmision, String pedal
            , String ruedas, String asiento) {
        Aro = aro;
        Cuadro = cuadro;
        Manubrio = manubrio;
        this.transmision = transmision;
        this.pedal = pedal;
        this.ruedas = ruedas;
        this.asiento = asiento;
    }

    public Bicicleta() {

    }

    public Long getIdBici() {
        return idBici;
    }

    public void setIdBici(Long idBici) {
        this.idBici = idBici;
    }

    public String getAro() {
        return Aro;
    }

    public void setAro(String aro) {
        Aro = aro;
    }

    public String getCuadro() {
        return Cuadro;
    }

    public void setCuadro(String cuadro) {
        Cuadro = cuadro;
    }

    public String getManubrio() {
        return Manubrio;
    }

    public void setManubrio(String manubrio) {
        Manubrio = manubrio;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getPedal() {
        return pedal;
    }

    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "idBici='" + idBici + '\'' +
                ", Aro='" + Aro + '\'' +
                ", Cuadro='" + Cuadro + '\'' +
                ", Manubrio='" + Manubrio + '\'' +
                ", transmision='" + transmision + '\'' +
                ", pedal='" + pedal + '\'' +
                ", ruedas='" + ruedas + '\'' +
                ", asiento='" + asiento + '\'' +
                '}';
    }
}
