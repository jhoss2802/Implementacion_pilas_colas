package Pila_PlatoSucios;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Stack;
public class Pila_PlatoSucios {
	
	public static void main (String[] args) {
		Stack <String> pilaPlatos = new Stack<>();//Crear una nueva pila utilizando la clase Stack de Java para almacenar los platos sucios
		Scanner scanner = new Scanner (System.in);//Crear un objeto Scanner para leer la entrada del usuario
	    boolean salir = false; //Varible para controlar la salida del bucle while
		
		
		while (!salir) { //Inicio del bucle while, se ejecuta mientras salir sea falso
			System.out.println ("1. Agregar un plato sucio a la pila");//Mostrar opcion para agregar un plato sucio a la pila
			System.out.println ("2. lavar el plato superior de la pila");//Mostrar opcion para lavar el plato superior de la pila
			System.out.println ("3. ver el plato superior de la pila");//Mostrar opcion para ver el plato superior de la pila sin limpiar
			System.out.println ("4. verificar si la pila está vacía");// Mostrar opcion para verificar si la pila de platos esta vacia
			System.out.println ("5. buscar plato en la pila");//Mostrar opcion para buscar un plato especifico en la pila
			System.out.println ("6. salir");//Mostrar opcion para salir del programa
			System.out.println ("7. ingrese una opción");//solicitar al usuario que ingrese una opcion
			int opcion = scanner.nextInt();//Leer la opcion ingresada por el usuario
			scanner.nextLine();//Consumir el salto de linea despues de leer la opcion
			
			
			switch (opcion){//Inicio del bloque switch, se evalúa el valor de la variable opcion
				case 1:
					System.out.print("Ingrese el plato a agregar a la pila: ");//solicitar al usuario que ingrese el plato a agregar a la pila
			        String plato = scanner.nextLine();	//leer el plato ingresado por el usuario
					pilaPlatos.push(plato);//Agregar el plato a la pila utilizando el metodo push ()
					System.out.println ("Plato agregado a la pila");//Mostrar mensaje indicando que el plato ha sido agregado a la pila 
					break;//salir del bloque switch
					
				case 2:
	                if (!pilaPlatos.isEmpty()) { //Verificar si la pila de platos no esta vacía
					String platoLimpio = pilaPlatos.pop();	//Limpiar el plato superior de la pila utilizando el metodo pop()
				    System.out.println("Se ha limpiado el plato: " + platoLimpio);//Mostrar el plato que ha sido limpiado
					}else {
						System.out.println("la pila de platos esta vacia, No se puede limpiar ningun plato");//Mostrar un mensaje indicando que la pila de platos esta vacia
					}
					break; //Salir del bloque switch
					
				case 3:
					if (!pilaPlatos.isEmpty()) {//verificar si la pila de platos  no está vacía
					String platoSuperior = pilaPlatos.peek();	//Obtener el plato superior de la pila sin limpiarlo utilizando el metodo peek()
				    System.out.println("El plato superior de la pila es: " + platoSuperior); //Mostrar el plato superior de la pila
					}else {
					System.out.println("la pila de platos esta vacía");// Mostrar un mensaje indicando que la pila de platos esta vacia
					}
					break; //Salir del bloque switch
					
				case 4:
					boolean estaVacia = pilaPlatos.isEmpty();//Verificar si la pila de platos esta vacia utilizando el metodo isEmpty ()
					System.out.println("La pila de platos esta vacia: " + estaVacia); //Mostrar si la pila de platos está vacía o no
					break;  //Salir del bloque switch
					
				case 5:
					System.out.println ("Ingrese el plato que desea buscar en la pila: "); // solicitar al usuario que ingrese el plato a buscar en la pila
					String platoBuscar = scanner.nextLine();//leer el plato a buscar inbresado por el usuario
					int distanciaDesdeSuperior = pilaPlatos.search(platoBuscar);//Buscar el plato en la pila utilizando el metodo search()
					if (distanciaDesdeSuperior != -1) {//verifica si el plato se encuentra en la pila (search() devuelve -1 si no se encuentra)
						//Mostrar un mensaje indicando la posicion del plato en la pila
					    System.out.println ("El plato '" + platoBuscar + "' se encuentra a una distancia de " + distanciaDesdeSuperior + "desde la parte supeior de la pila. ");
					}else {
						System.out.println ("El plato '"+ platoBuscar + "' no se encuentra en la pila");//Mostrar un mensaje indicando que el plato no se encuentra en la pila
					}
					break; //Salir del bloque switch
					
				case 6:
					salir = true; // Establecer la variable salir a true para salir del bucke while
					break; //Salir del bloque Switch
					
				default:
					System.out.println("opcion invalida, intente nuevamente. "); //Mostrar un mensaje indicando que la opcion ingresada es invalida
					break; //Salir del bloque switch
			}
			System.out.println (); //Imprimir una linea en blanco para separar las iteraciones del bucle while
		}
		    System.out.println("Hasta luego "); // Mostrar un mensaje de despedida al salir del programa
	}

}

