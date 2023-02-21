package pakete;

public class mainjava {
    public static void main(String[] args) {
        pilaordenada pila1 = new pilaordenada();

        System.out.println(pila1.cima());
        pila1.meter(10);
        System.out.println(pila1.cima());

        pila1.meter(9);
        System.out.println(pila1.cima());
        pila1.meter(19);
        System.out.println(pila1.cima());
        pila1.sacar();
        System.out.println(pila1.cima());
    }

}
