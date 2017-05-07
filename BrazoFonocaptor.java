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
public class BrazoFonocaptor {
        private String posicion;
        private boolean enposicion;

    public BrazoFonocaptor(String posicion) {
        this.posicion = posicion;
        this.enposicion = false;
    }
    
    public BrazoFonocaptor(){
        this("Inicial");
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String isEnposicion(){
        if(this.getPosicion() == "Captura"){
            this.enposicion = true;
            return "El Brazo Fonocaptor se encuentra en posición";
        }else{
            this.enposicion = false;
            return "El Brazo Fonocaptor no se encuentra en posición";
        }
    }
    
    public void posicionar(){
        this.posicion = "Captura";   
    }
    
    public String reiniciar(){
        this.posicion = "Inicial";
        return "El Brazo Fonocaptor ha regresado a su posición inicial";
    }

    
}
