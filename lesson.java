import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
//import java.util.*;

public class Main {



    public static void main(String[] args) {
        choose();
    }
    
	static void choose (){
		byte x;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\tChoose One:\n\t 1)Calculator\n\t 2)Longest Word in mass\n\t 3)Random mass\n\t 4)Christmas Gifts\n\n\t > ");
		x = scan.nextByte();
		switch (x) {
        case 1:
            calc();
            break;
        case 2:
            arrWord();
            break;
        case 3:
            randMass();
            break;
        case 4:
            System.out.print("\t4--\n");
            break;
        default:
            choose ();
        }
    }
    
    static void calc (){
        float a, b;
        String opr;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\tCalculator:\n\n\tput first number\n\t > ");
        a = scan.nextInt();
        System.out.print("\tput second number\n\t > ");
        b = scan.nextInt();
        System.out.print("\n\tChoose operation or 'exit' \n\t > ");
        //String 
        opr = scan.next(); //.charAt(0);
        switch (opr) {
        case "+":
            System.out.printf("\n\t%.1f \n",(a+b));
            calc();
        case "-":
            System.out.printf("\n\t%.1f \n",(a-b));
            calc();
        case "*":
            System.out.printf("\n\t%.1f \n",(a*b));
            calc();
        case "/":
            System.out.printf("\n\t%.1f \n",(a/b));
            calc();
        case "exit":
            System.out.println("\n\texit to main");
            break;
        default:
            choose ();
            break;    
        
        }
    }

    static void arrWord(){
        
        int x, i, lng;
        String wrd = null;
        String[] arr;
        
        lng = 1;
        System.out.print ("\tType arrey length > ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        arr = new String[x];
        //System.out.println(arr.length);
        
        for ( i=0; i < arr.length; i++){
            System.out.print("\n\tType word: ");
            arr[i] = scan.next();
            if (arr[i].length() > lng) {
              lng = arr[i].length();
              wrd = (arr[i]);
            }
            }
        System.out.printf("\n\t%s\n",wrd);
        }
    
    static void randMass(){
        
        int[] rand;
        byte x, i;
        int max, min, buf;
        
        
        rand = new int [20];
        for (i=0; i < rand.length; i++){
            rand[i] = (int) (Math.random() * 15);
            //System.out.println("\n\t"+rand[i]);
        }
        max = 0;
        min = 0;
          for ( i = 0; i < rand.length; i++){
              if (rand[i] > rand[max]) max = i;
              if (rand[i] < rand[min]) min = i;
          }
        System.out.print("\n\tNumbers in array:");
        System.out.print("\n\t" + Arrays.toString(rand));
        System.out.print("\n\tMax number: " + rand[max]);
        System.out.print("\n\tMin number: " + rand[min]);
       // System.out.println(rand[mi]);

        buf = rand[max];
        rand[max] = rand[min];
        rand[min] = buf;
        System.out.print("\n\tNumbers in array:");
        System.out.println("\n\t" + Arrays.toString(rand));
        choose();
    }
  
    }
