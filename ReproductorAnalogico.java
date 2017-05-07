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
public abstract class ReproductorAnalogico extends ReproductorDeAudio{
    protected int[] RPM;
    protected String formato;

    public ReproductorAnalogico(int[] RPM, String formato, boolean encendido, String tipoSonido) {
        super(encendido, tipoSonido);
        this.RPM = RPM;
        this.formato = formato;
    }
    
    public ReproductorAnalogico(){
        super();
        this.RPM = new int[] {16, 32, 45};
        this.formato = "Disco de Vinilo";
    }
    
    @Override
    public abstract boolean reproducirSonido();
    
    public abstract boolean reproducirEntrada(int RPM, String Nombre);

    public int[] getRPM() {
        return RPM;
    }

    public void setRPM(int[] RPM) {
        this.RPM = RPM;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Reproductor Analógico: " + 
               "\nRPM=" + RPM + 
               "\nFormato=" + formato;
    }

    

    
}
