public class Main6 {

    public static void main(String[] args) {
        var estacion = "INVIERNO";

        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("estoy en default");
        }
    }
}
