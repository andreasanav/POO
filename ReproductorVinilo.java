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
public class ReproductorVinilo extends ReproductorAnalogico {
    private String volumen;
    private Fonochasis fonochasis;

    public ReproductorVinilo(String volumen, Fonochasis fonochasis, int[] RPM, String formato, boolean encendido, String tipoSonido) {
        super(RPM, formato, encendido, tipoSonido);
        this.volumen = volumen;
        this.fonochasis = fonochasis;
    }
    
    public ReproductorVinilo(){
        super();
        this.volumen = "Medio";
        this.fonochasis = 
    }
    
    @Override
    public boolean reproducirSonido(){
        if(fonochasis.estadoComponentes() == "Componentes Listos" &&this.isEncendido){
            return true;
        }else if(!this.isEncendido()) {
            System.out.println("Reproductor apagado");
            return false;
        }else if(fonochasis.estadoComponentes != "Componentes Listos")
            System.out.println(fonochasis.estadoComponentes());
            return false;
    }
    
    @Override
    public boolean reproducirEntrada(int RPM, String nombre){
        if(this.reproducirSonido() && super.RPM == RPM){
            System.out.println("Reproduciendo " + nombre + " a volúmen " + volumen);
            return true;
        }else if(!this.reproducirSonido()){
            System.out.println("Imposible reproducir sonido, es necesario revisar los componentes.");
            return false;
        }else{ 
            System.out.println("Revoluciones por minuto incompatibles, el reproductor ");
        
        
    public void subirVolumen(){
      if(this.volumen == "Silenciado"){
          this.volumen = "Bajo";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Bajo"){
          this.volumen = "Medio";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Medio"){
          this.volumen = "Alto";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Alto"){
          this.volumen = "Máximo";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Máximo"){
          System.out.println("El volúmen ya está al máximo!");
      }
    }
    
    
    
    public void bajarVolumen(){
      if(this.volumen == "Máximo"){
          this.volumen = "Alto";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Alto"){
          this.volumen = "Medio";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Medio"){
          this.volumen = "Bajo";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Bajo"){
          this.volumen = "Silenciado";
          System.out.println("Nuevo volúmen: " + this.volumen);
      }else if(this.volumen == "Silenciado"){
          System.out.println("El reproductor ya está silenciado!");
      }
    }
    
   
    
        

} 


    
    
    
