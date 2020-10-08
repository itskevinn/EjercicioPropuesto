package ejerciciospropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos {
    public static void main(String[] args) {
        String nombre;
        int op;
        double valor;
       Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.println("Digite su nombre");
        cuenta.setTitular(nombre=leer.nextLine());
        System.out.println("Desea ingresar un valor 1. si, 2. no");
        op=leer.nextInt();
        if(op==1){
            System.out.println("Digite el valor inicial");
            cuenta.setCantidad(valor=leer.nextDouble());
        }
        else System.out.println("Cuenta creada");
        System.out.println("Titular:    "+cuenta.getTitular());
        System.out.println("1. CONSIGNAR     2. RETIRAR    3. CONSULTAR");
        op = leer.nextInt();
        if(op == 1){
            System.out.println("DIGITE EL VALOR A CONSIGNAR");
            valor = leer.nextDouble();
            cuenta.ingresar(valor);
        }
        else{ System.out.println("DIGITE EL VALOR A RETIRAR");
        valor = leer.nextDouble();
        cuenta.retirar(valor);
        }
        if(op==3){
                cuenta.consultar();
                }
        
    }
    
}
