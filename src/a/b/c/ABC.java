package a.b.c;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ABC {
    
    static Scanner leer = new Scanner(System.in);
        
    public static void main(String[] args){

        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader (System.in));
            
            menu();
            String lectura = teclado.readLine();
            int opcion = Integer.parseInt(lectura);
            
            switch(opcion){
                
                case 1: mostrarNombre(); break ; 
                case 2: mayorQue(); break ;
                case 3: operMat(); break ;
                case 4: numerosH100while(); break ;
                case 5: numerosH100for(); break ;
                case 6: sumaImpares(); break ;
                case 7: sumaPares(); break ;
                case 8: media(); break ;
                
                default : System.out.println("Ingrese una opción válida"); 

            }   } catch (IOException ex) {
            Logger.getLogger(ABC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void menu(){
           
           System.out.println("---------------------------");
           System.out.println("[1] Mostrar Nombre");
           System.out.println("[2] Mayor Que"); 
           System.out.println("[3] Operaciones Matemáticas"); 
           System.out.println("[4] Numeros 1 al 100 While");
           System.out.println("[5] Numeros 1 al 100 For");
           System.out.println("[6] Suma Impares");
           System.out.println("[7] Suma Pares");  
           System.out.println("[8] Media Numeros");

       }
    
    public static void operMat(){

    int a = 8;
    int b = 3;
    int c = -5;
    int suma = (a+b+c);
    int resta = (a-b-c);
    int mult = (a*b*c);
    float op1 = ((float)a/c);
    float op2 = ((float)a*(b/(float)c));
    float op3 = ((float)a*b/c);
    float op4 = ((float)a-b-c*2);

    System.out.println("Suma: " +suma);
    System.out.println("Resta: " +resta);
    System.out.println("Multi: " +mult);

    System.out.println("Operación 1: " +op1);
    System.out.println("Operación 2: " +op2);
    System.out.println("Operación 3: " +op3);
    System.out.println("Operación 4: " +op4);
    }//////////////////////////////////////

    public static void mayorQue(){

    int a = 8;
    int b = 3;

   if (a>b){
       System.out.println("A es mayor que B");
   } else {
       System.out.println("B es mayor que A");
   }

   }

    public static void mostrarNombre(){

       String nombre = "Angel";
       System.out.println("Bienvenido " +nombre);
   }

    public static void numerosH100while(){
    int i = 0;
       while (i<100){
           i++;
           System.out.print(i+", ");
       }
   }

    public static void numerosH100for(){
    int i;
       for(i=1; i<=100;i++){
       System.out.print(i+", ");   
       }
   }

    public static void sumaImpares(){
       int total = 0;
       System.out.print("Los números impares son: ");
            for (int i = 1; i <= 50; i++) {
                    if (i % 2 != 0) {
                    System.out.print(i + ", ");
                    total += i;
                    }

            }
   System.out.println();
   System.out.println("La suma de los impares es: "+total);
   }

    public static void sumaPares(){
           int total = 0;
           System.out.print("Los números pares son: ");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
			System.out.print(i + ", ");
                        total += i;
			}
                        
		}
       System.out.println();
       System.out.println("La suma de los pares es: "+total);
       }
   
    public static void media(){
        
        int num;
        int cont=0;
        int suma=0;
        
        do {
                System.out.println("Ingresar Nro entero: ");
                num = leer.nextInt();
                suma = suma + num;
                cont++;
    
        } while (num != -1);
        
        System.out.println("La media es: " +(float)suma/cont);
        
    }


       
}