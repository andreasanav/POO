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
public abstract class ReproductorDeAudio {
    protected boolean encendido;
    protected String tipoSonido;

    public ReproductorDeAudio(boolean encendido, String tipoSonido) {
        this.encendido = encendido;
        this.tipoSonido = tipoSonido;
    }
    
    public ReproductorDeAudio(){
        this(true, "Digital");
    }
    
    public abstract boolean reproducirSonido();

    public boolean isEncendido() {
        return encendido;
    }

    public void encender(){
        if(this.encendido){
            System.out.println("El reproductor ya está encendido...");
        }else{
            System.out.println("Encendiendo reproductor...");
            this.encendido = true;
        }
    }
    
    public void apagar(){
        if(!this.encendido){
            System.out.println("El reproductor ya está apagado...");
        }else{
            System.out.println("Apagando reproductor...");
            this.encendido = false;
        }
    }
    
    
    public String getTipoSonido() {
        return tipoSonido;
    }

    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    @Override
    public String toString() {
        return "Reproductor de Audio: " + 
               "\nEncendido=" + encendido + 
               "\nTipoSonido=" + tipoSonido;
    }
    
    
}
