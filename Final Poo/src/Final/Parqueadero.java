package Final;

import java.util.Scanner;

public class Parqueadero {
    Scanner sc=new Scanner(System.in);
    int hentrada=0;
    int hsalida=0;
    int cupo=30;
    Vehiculo misVehiculos=new Vehiculo(); 
    public void ingresarvehiculo(String [] args){
        misVehiculos.ingresar();
        System.out.println("Ingrese la hora de entrada sin simbolos");
        hentrada=sc.nextInt();
    }
    public void retirarvehiculo(){
        misVehiculos.retirar();
        System.out.println("Ingrese la hora de salida sin simbolos");
        hsalida=sc.nextInt();
        System.out.println("El valor a pagar es de:");
        System.out.println(hsalida-hentrada*100);
    }
    public void consultarcupos(){
        System.out.println(cupo);
    }
}
