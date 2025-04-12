
package parcialpro2;

public class arma {
    private String nombre;
    private int daño;
    
    public arma(String nombre, int daño){
        this.nombre = nombre;
        this.daño = daño;
    }
    
    public String atacar(){
        return "atacando con "+ nombre +"( + " + daño + " daño";
    }
    public int getdaño(){
        return daño;
    }
    public String getnombre(){
        return nombre
    }
}
