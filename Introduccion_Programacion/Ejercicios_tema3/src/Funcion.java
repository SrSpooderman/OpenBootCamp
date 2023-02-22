public class Funcion {
    static int Suma(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 10;
        int resultado = Suma(x,y,z);
        System.out.println(resultado);
    }
}