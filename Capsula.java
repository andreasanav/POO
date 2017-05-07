/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author Andrea
 */
public class Capsula {
    private boolean recibeSenal;
    private boolean convertir;
    private boolean enviaSenal;
    
    public Capsula(){
        this.recibeSenal = false;
        this.enviaSenal = false;
        this.convertir = false;
    }

    public boolean isRecibeSenal() {
        return recibeSenal;
    }

    public boolean isEnviaSenal() {
        return enviaSenal;
    }

    public boolean isConvertir() {
        return convertir;
    }
    
    
    
    public void recibirSenal() {
        System.out.println("Cápsula Fonocaptora recibiendo señales de energía mecánica...");
        this.recibeSenal = true;
        this.convertirSenal();
    }
    
    public void convertirSenal() {
        if(this.isRecibeSenal()) {
            System.out.println("Cápsula convirtiendo energía mecánica a ondas sonoras...");
            this.convertir = true;
            this.enviarSenal();
        }else{
            System.out.println("La cápsula no ha recibido ninguna señal...");
        }
    }
    
    public void enviarSenal(){
        if(this.isConvertir()){
            System.out.println("Cápsula enviando ondas sonoras...");
        }
        
    }
}
