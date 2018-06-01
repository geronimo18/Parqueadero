package Final;

import java.util.Scanner;

public class Vehiculo implements IVehiculo {
    
    Scanner sc=new Scanner(System.in);
    
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
        System.out.println("Ingrese la placa de su vehículo");
        placa=sc.nextLine();
        System.out.println("Ingrese el nombre del propietario");
        propietario=sc.nextLine();
        System.out.println("Ingrese el cilindraje del vehiculo");
        cilindraje=sc.nextInt();
    }

    @Override
    public void retirar() {
        placa=null;
        propietario=null;
        cilindraje=0;
    }
}
