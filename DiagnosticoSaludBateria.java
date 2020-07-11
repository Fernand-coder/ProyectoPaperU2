/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticosaludbateria;

/**
 *
 * @author FERNANDO PADILL
 */
import java.util.*;
import java.util.Scanner;
public class DiagnosticoSaludBateria {
    
    public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE ");
        System.out.println("Diagnostico de salud de bateria");
    }
    
    public static void Identificar_salud_bateria(){
        int codigo_bateria;
        String tipo_bateria;
        float valor_voltaje;
        
        Scanner bateria1=new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese codigo bateria: ");
        codigo_bateria=bateria1.nextInt();
        System.out.println("Ingrese tipo de bateria: ");
        tipo_bateria=bateria1.next();
        System.out.println("Ingese el valor del voltaje: ");
        valor_voltaje=bateria1.nextFloat();  
    }
    
    public static float Verificar_rangos_bateria(){
        float codigo_bateria,valor_voltaje,valor_corriente;
        Scanner rango1=new Scanner(System.in);
        System.out.println("La bateria con codigo");
        codigo_bateria=rango1.nextInt();
        System.out.println("Valor voltaje: ");
        codigo_bateria=rango1.nextInt();
        System.out.println("Valor corriete: ");
        valor_corriente=rango1.nextFloat();
        return valor_corriente;
    }
    
    public static float Realizar_diagnostico_capacidad_incremental(){
        float codigo_bateria,capacidad_bateria, amperaje,tiempo_duracion;
        Scanner capacidad1=new Scanner(System.in);
        Scanner amp1=new Scanner(System.in);
        Scanner tiempo1=new Scanner(System.in);
        System.out.println("La bateria con codigo: ");
        codigo_bateria=capacidad1.nextFloat();
        System.out.println("El amperaje de la bateria es: ");
        amperaje=amp1.nextFloat();
        System.out.println("El tiempo que dura la bateria en horas: ");
        tiempo_duracion=tiempo1.nextFloat();
        capacidad_bateria= amperaje*tiempo_duracion;
        System.out.println("La capadidad de la bateria es: "+capacidad_bateria+"Amperio*hora");
        return capacidad_bateria;
        
    }  
    
    public static void Verificar_estado_bateria(){
        String tipo_bateria;
        String estado_bateria;
        float voltaje;
        Scanner estado1=new Scanner(System.in);
        System.out.println("La bateria de tipo: ");
        tipo_bateria=estado1.next();
        System.out.println("La bateria tiene un voltaje de: ");
        voltaje=estado1.nextFloat();
        
        if(voltaje<10){
            System.out.println("La bateria "+tipo_bateria+" esta en mal estado");
        }else{
            System.out.println("La bateria "+tipo_bateria+" esta en buen estado");
        }
        
    }
    
    public static float Comparar_rangos_bateria(){
        float codigo; 
        float capacidad_bateria, amperaje, tiempo_duracion_bateria;
        Scanner rangos2=new Scanner(System.in);
        System.out.println("El amperaje de la bateria es: ");
        amperaje=rangos2.nextFloat();
        System.out.println("La duracion que tiene la bateria es: ");
        tiempo_duracion_bateria=rangos2.nextFloat();
        
        capacidad_bateria= amperaje*tiempo_duracion_bateria;
        System.out.println("La capacidad de la bateria es: "+capacidad_bateria+" Amperio*hora");
        
        if(capacidad_bateria<36){
            System.out.println("La bateria esta en mal estado su capacidad es: "+capacidad_bateria+"Amperio*hora");
        }else{
            System.out.println("La baterua esta en buen estado su capacidad es: "+capacidad_bateria+"Amperios*hora");
        }
        return capacidad_bateria;
    }
    
    public static void Informar_diagnostico_bateria(){
        float codigo_bateria,capacidad_carga_bateria;
        String tipo_bateria, estado_bateria;
        Scanner informe1=new Scanner(System.in);
        
        System.out.println("La bateria de tipo: ");
        tipo_bateria=informe1.next();
        System.out.println("La bateria que tiene el codigo: ");
        codigo_bateria=informe1.nextFloat();
        System.out.println("Tiene una Capacidad de carga es: ");
        capacidad_carga_bateria=informe1.nextFloat();
        System.out.println("La bateria de tipo: "+tipo_bateria+"esta en: ");  
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encabezado();
        Identificar_salud_bateria();
        Verificar_rangos_bateria();
        Realizar_diagnostico_capacidad_incremental();
        Verificar_estado_bateria();
        Comparar_rangos_bateria();
        Informar_diagnostico_bateria();
    }
    
}
