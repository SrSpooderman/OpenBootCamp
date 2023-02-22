package clasecoche;
public class coche {
    private int puertas;

    public coche(
            int puertass){puertas = puertass;
    }
    public void aumentar_puertas(int cantidad){
        puertas += cantidad;
    }
    public int cantidad_puertas(){
        return puertas;
    }
}
