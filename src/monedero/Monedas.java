package monedero;

public class Monedas {

    public int monedas;

   /**
    * Constructor de la clase Monedas que inicializa la cantidad de monedas.
    *
    * @param monedas La cantidad inicial de monedas en el monedero.
    */
    public Monedas(int monedas) {
        this.monedas = monedas;
    }

    
   /**
    * Obtiene la cantidad de monedas en el monedero.
    *
    * @return La cantidad de monedas actual en el monedero.
    */
    public int getMonedas() {
        return monedas;
    }

    
   /**
    * Establece la cantidad de monedas en el monedero.
    *
    * @param monedas La nueva cantidad de monedas a establecer en el monedero.
    */
    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    
   /**
    * Verifica si hay suficientes monedas en el monedero para realizar una compra.
    *
    * @param coste El costo de la compra que se desea realizar.
    * @return true si hay suficientes monedas para la compra, false en caso contrario.
    */
    public boolean monedero (int coste){
        
        if(this.monedas>= coste){
            return true;
        }else{
            return false;
        }
    }
}
