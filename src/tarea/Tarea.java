package tarea;

import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
        int x, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Que algoritmo desea utilizar?");
        System.out.println("1.-Fibonacci");
        System.out.println("2.-Triangulo de pascal");
        System.out.println("3.-Padovan");

        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Ingresa limite de numeros a mostrar:");
                x = sc.nextInt();
                fibonacci(x);
                break;
            case 2:
                System.out.println("Ingresa limite de filas a mostrar:");
                x = sc.nextInt();
                pascal(x);
                break;
            case 3:
                System.out.println("ingresa numero");
                x = sc.nextInt();
                pad(x);
                break;
            default:
                System.out.println("opcion no valida");
        }

    }

    public static void fibonacci(int x) {
        int n1 = 0, n2 = 1, n3, i, count = x;
        System.out.print(n1 + " " + n2);    

        for (i = 2; i < count; ++i)  
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void pascal(int n) {
        int nfilas = n;
        int[] a = new int[1];
        for (int i = 1; i <= nfilas; i++) {
            int[] x = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i - 1)) {
                    x[j] = 1;
                } else {
                    x[j] = a[j] + a[j - 1];
                }
                System.out.print(x[j] + " ");
            }
            a = x;
            System.out.println();
        }
    }

    static void pad(int n) {
        
        int pPrevPrev = 1, pPrev = 1,
                pCurr = 1, pNext = 1;
        System.out.println(pPrev);
        System.out.println(pCurr);
        System.out.println(pNext);

        for (int i = 3; i <= n; i++) {
            pNext = pPrevPrev + pPrev;
            pPrevPrev = pPrev;
            pPrev = pCurr;
            pCurr = pNext;
            System.out.println(pCurr);
        }

    }

}
