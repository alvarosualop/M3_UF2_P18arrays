/*
 Arrays

 */
package p18.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P18Arrays {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int option = -1;

        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    //Declara un array  con los valores iniciales: 7, 12, 13, 16, 18  
                    int[] arrayNumbers = new int[]{7, 12, 13, 16, 18};
                    viewArrayInt(arrayNumbers);
                    break;
                case 2:
                    //Declara un array  con los valores iniciales: 7, 12, 13, 16, 18  
                    int[] arrayIva;//solo declaracion
                    arrayIva = new int[]{0, 4, 10, 21};//dimensionar y dar valores
                    viewArrayInt(arrayIva);
                    break;
                case 3:
                    //Array(dimensionar y dar valores posteriormente, uno por uno)
                    int[] arrayIva2 = new int[4];
                    arrayIva2[0] = 0;
                    arrayIva2[1] = 4;
                    arrayIva2[2] = 10;
                    arrayIva2[3] = 21;
                    viewArrayInt(arrayIva2);
                    break;
                case 4:
                    //preparar array pide una String para calcular los nombres
                    String[] arrayname;//= new String [ej:4] si ya sabemos la cantidad que necesitamos
                    float[] arrayheight;
                    int Nmaxstudents;
                    System.out.println("How many students are in the class?:");
                    Nmaxstudents = keyboard.nextInt();
                    //dar tamaño a los arrays (en funcion de lo que ha puesto usuario)
                    arrayname = new String[Nmaxstudents];
                    arrayheight = new float[Nmaxstudents];
                    //rellenar arrays. Se va rellenando en bucle
                    for (int i = 0; i < arrayname.length; i++) {
                        System.out.println("Name[" + i + "]:");
                        arrayname[i] = keyboard.next();
                        System.out.println("Height[" + i + "]:");
                        arrayheight[i] = keyboard.nextFloat();
                    }
                    //visualiza arrays
                    viewStudent(arrayname, arrayheight);
                    break;
                case 5:
                    String[] arrayproducts;
                    float[] arrayprice;
                    int numberproducts;
                    System.out.println("How many products do you have?: ");
                    numberproducts = keyboard.nextInt();
                    arrayproducts = new String[numberproducts];
                    arrayprice = new float[numberproducts];
                    for (int i = 0; i < arrayproducts.length; i++) {
                        System.out.println("Product[" + i + "]:");
                        arrayproducts[i] = keyboard.next();
                        System.out.println("How much price has the product[" + i + "]?:");
                        arrayprice[i] = keyboard.nextFloat();
                    }
                    viewProduct(arrayproducts, arrayprice);

                    break;

                case 6:
                    String[] arraystudents;
                    float[] arraytall;
                    int numberstudents;
                    System.out.println("How many students are in your class?: ");
                    numberstudents = keyboard.nextInt();
                    arraystudents = new String[numberstudents];
                    arraytall = new float[numberstudents];
                    for (int i = 0; i < arraystudents.length; i++) {
                        System.out.println("Student[" + i + "]name is: ");
                        arraystudents[i] = keyboard.next();
                        System.out.println("How heigth is [" + i + "]: ");
                        arraytall[i] = keyboard.nextFloat();
                    }

                    System.out.println("The tallest student in the class is: " + viewTallest(arraystudents, arraytall) + " m.");
                    System.out.println("The lowest student in the class is: " + viewEnano(arraystudents, arraytall) + " m.");
                    System.out.println("The average of the class is: " + viewAverage(arraystudents, arraytall)+ " m.");
                    
                    
                    float studenttall = arraytall [0];
                    float average = 0;
                    
                    for (int t = 0; t<arraystudents.length; t++){
                        if (arraytall [t]< average)
                        studenttall = arraytall[t]; {
                            System.out.println("The student "+arraystudents[t]+" is above the average.");
                        }
                    }
                    

                    break;

                case 7:

                    System.out.println("Input the number of the day: ");
                    int day = keyboard.nextByte();
                    String[] arrayday = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                    System.out.println("The number " + day + " is " + arrayday[day - 1]);
                    break;

                case 8:
                    System.out.println("DNI without letter: ");
                    int dni = keyboard.nextInt();

                    char letter = functionDNI(dni);
                    System.out.println(dni + " " + letter);

                    break;

                case 10:
                    System.out.println("Do you want exit?  yes/no");
                    String res = keyboard.next();
                    if (res.equals("yes")) {
                        System.out.println("Thanks for use my program. See you soon.");
                    } else {
                        option = 90;
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }//fin switch
        } while (option != 10);
    }

    private static void userMenu() {
        System.out.println("Option 1: ");
        System.out.println("Option 2: ");
        System.out.println("Option 3: ");
        System.out.println("Option 4: ");
        System.out.println("Option 5: ");
        System.out.println("Option 6: ");
        System.out.println("Option 7: ");
        System.out.println("Option 8: ");
        System.out.println("Option 10: ");

        System.out.print("Choose your option: ");
    }

    private static void viewArrayInt(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Array[" + i + "]:" + arrayNumbers[i]);
        }
        //-----  
        System.out.println(Arrays.toString(arrayNumbers));
    }

    private static void viewStudent(String[] arrayname, float[] arrayheight) {
        for (int i = 0; i < arrayname.length; i++) {
            System.out.println("The student " + arrayname[i] + " is " + arrayheight[i] + " height");
        }
    }

    private static void viewProduct(String[] arrayproducts, float[] arrayprice) {
        for (int i = 0; i < arrayproducts.length; i++) {
            System.out.println("The product " + arrayproducts[i] + " costs " + arrayprice[i] + " €");
        }
    }

    private static float viewTallest(String[] arraystudents, float[] arraytall) {

        float tallest = arraytall[0];

        for (int i = 0; i < arraystudents.length && i < arraytall.length; i++) {

            if (arraytall[i] > tallest) {
                tallest = arraytall[i];
            }
        }
        return tallest;
    }

    private static float viewEnano(String[] arraystudents, float[] arraytall) {
        float enano = arraytall[0];

        for (int i = 0; i < arraystudents.length && i < arraytall.length; i++) {

            if (arraytall[i] < enano) {
                enano = arraytall[i];
                
            }

        }
        return enano;
    }

    private static float viewAverage(String[] arraystudents, float[] arraytall) {

        float average = arraytall[0];

        for (int i = 0; i < arraystudents.length; i++) {
            average += arraytall[i];
        }
        average = (average/arraystudents.length);
        return average;
    }

   
    private static char functionDNI(int dni) {
        char letter = ' ';
        String stringDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int residuo = dni % 23;
        letter = stringDNI.charAt(residuo);
        return letter;

    }
}
