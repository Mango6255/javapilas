package pakete;

import java.util.Scanner;

class juegoTorres {
    public static void main(String[] args) {
        pilaordenada A = new pilaordenada();
        pilaordenada B = new pilaordenada();
        pilaordenada C = new pilaordenada();
        pilaordenada pila = new pilaordenada();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tamaño");
        int n = sc.nextInt();
        int b;
        pila.creapartida(A, B, C, n);
        pila.mostrar(A, B, C);
        boolean end = false;
        while (end == false) {
            System.out.println("Elija primero la pieza a sacar, y luegp la pieza a meter ");
            System.out.println("1-A");
            System.out.println("2-B");
            System.out.println("3-C");
            System.out.println("4- salir");
            b=sc.nextInt();
            n=sc.nextInt();
            if(n==4 || b==4){
                end=true;
            }else{
                pila.podermeter(A, B, C, b, n,pila);
                pila.mostrar(A, B, C);
            }
            

        }
        sc.close();
    }
}
