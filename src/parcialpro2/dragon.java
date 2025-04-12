
package parcialpro2;

public class dragon extends criatura implements volador{
    private boolean estavolando;
    private arma arma;
    
    public dragon(String nombre, int salud, int fuerza){
        super(nombre, salud, fuerza);
        this.estavolando = false;
        this.arma = null;
    }
}
