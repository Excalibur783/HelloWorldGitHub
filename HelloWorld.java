public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
        System.out.println(sumar(10,5));
        System.out.println(restar(10,5));
    }

    public static int sumar(int x, int y){
        return x + y;
    }

    public static int restar(int x, int y){
        return x - y;
    }
}

