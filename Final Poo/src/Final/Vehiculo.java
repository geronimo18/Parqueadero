package Final;
public class Vehiculo implements IVehiculo {
    private String placa=null;
    private String propietario=null;
    private float cilindraje=0;    

    public String getPlaca() {
        return placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }
    

    @Override
    public void ingresar() {
                
    }

    @Override
    public void retirar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
