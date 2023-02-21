package pakete;
import java.util.*;

class pilaordenada extends ArrayList{
    ArrayList<Integer> pila = new ArrayList<Integer>();
    
    public int cima(){
        int a=pila.size();
        int b;
        if(a==0){
            b=-1;
        }else{
            b=pila.get(a-1);
        }
        return b;
    }
    public void meter(int objeto){
        if(cima()==-1){
            pila.add(objeto);
        }else{
            if(cima()>objeto){
                pila.add(objeto);
            }else{
                System.out.println("Error, tamaño inadecuado");
            }
        }
    }
    public void sacar(){
        int a=pila.size();
        if(a==0){
            System.out.println("no puedes sacarle a una pila vacia");
        }else{
            pila.remove(pila.size()-1);
        }
    }
    public void construir(pilaordenada pila,int tam){
        while(0<tam){
            pila.meter(tam);
            tam--;
        }
    }
    public void movimiento(pilaordenada pilasacar, pilaordenada  pilameter){
        if(pilasacar.cima)
        
    }
    public void  mueve(pilaordenada pilasacar, pilaordenada  pilameter){
        int a=pilasacar.cima();
        pilasacar.sacar();
        pilameter.meter(a);
    } 
    public void mostrar(pilaordenada a,pilaordenada b,pilaordenada c){
        System.out.println("la pila A: "+a.pila);
        System.out.println("la pila B: "+b.pila);
        System.out.println("la pila C: "+c.pila);
    }
    public void creapartida(pilaordenada a,pilaordenada b,pilaordenada c, int tam){
        int numero = (int)(Math.random()*3+1);
        while(0<tam){
            if(numero==1){
                a.meter(tam);
            }else if(numero==2){
                b.meter(tam);
            }else if(numero==3){
                c.meter(tam);
            }
            numero = (int)(Math.random()*3+1);
            tam--;
        }
    }
    public void podermeter(pilaordenada a,pilaordenada b,pilaordenada c, int num1,int num2, pilaordenada funciones){
        if(num1==1 && num2==1){
            System.out.println("no valido");
        }else if(num1==1 && num2==2){
            funciones.mueve(a, b);
        }else if(num1==1 && num2==3){
            funciones.mueve(a, c);
        }else if(num1==2 && num2==1){
            funciones.mueve(b, a);
        }else if(num1==2 && num2==2){
            System.out.println("no valido");
        }else if(num1==2 && num2==3){
            funciones.mueve(b, c);
        }else if(num1==3 && num2==1){
            funciones.mueve(c, a);
        }else if(num1==3 && num2==2){
            funciones.mueve(c, b);
        }else if(num1==3 && num2==3){
            System.out.println("no valido");
        }

    }

    
}