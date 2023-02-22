import clasecoche.coche;
public class Main {
    public static void main(String[] args){
        coche auto = new coche(3);
        auto.aumentar_puertas(1);
        int a = auto.cantidad_puertas();
        System.out.println(a);
    }
}
