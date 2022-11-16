public class Main {

    public static void main1(String[] args) {
        int param1 = 10;
        int param2 = 20;
        int param3 = 30;

        var valor = suma(param1, param2, param3);

        System.out.println(valor);

    }

    public static int suma( int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.aumentarpuertas();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 0;

    public void aumentarpuertas () {
        this.puertas++;
    }
}

