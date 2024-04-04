package ColaBanco;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaBanco {
	
	public static void main(String[] args) {
		Queue<String> colaAtencion = new LinkedList<>(); //Crear una nueva cola utilizando la clase LinkedList de Java
		Scanner scanner = new Scanner(System.in); // Crear un objeto scanner para leer la entrada del usuario
		boolean salir = false; // Variable para controlar la salida del bucle while
		
		while (!salir){ //Inicio del bucle while, se ejecuta mientras salir sea falso
		   System.out.println("1. Agregar cliente a la cola de atencion ");	//Mostrar opcion para agregar un cliente a la cola de atención
		   System.out.println("2. Atender al proximo cliente de la cola "); //Mostrar opcion para atender al próximo cliente de la cola 
		   System.out.println("3. Ver al próximo cliente de la cola");//Mostrar opcion para ver al próximo cliente de la cola sin atenderlo
		   System.out.println("4. Verificar si la cola de atención está vacía");//Mostrar opcion para verificar si la cola de atencion está vacía
		   System.out.println("5. Salir ");//Mostrar opcion para salir
		   System.out.println("Ingrese una opción: "); //Solicitar al usuario que ingrese una opción
		   int opcion = scanner.nextInt(); //Leer la opción ingresada por el usuario
		   scanner.nextLine(); //Consumir el salto de linea después de leer la opcion
		   
		   switch (opcion) { //Inicio del bloque switch, se evalúa el valor de la variable opcion
		   case 1:
			   System.out.println("Ingrese el nombre del cliente a agregar a la cola: "); //Solicitar al usuario que ingrese el nombre del cliente a agregar a la cola
			   String cliente = scanner.nextLine(); //Leer el nombre del cliente ingresado por el usuario
			   colaAtencion.add(cliente); // Agregar el cliente a la cola utilizando el metodo add()
			   System.out.println("Cliente agregado a la cola de atencion. "); //Mostrar un mensaje indicando que el cliente ha sido agregado a la cola
			   break; //Salir del bloque switch
			   
		   case 2:
			   if (!colaAtencion.isEmpty()) { // Verificar si la cola de atencion no está vacia
				   String clienteAtendido = colaAtencion.poll(); // Atender al proximo cliente de la cola utilizando el metodo poll()
				   System.out.println("Cliente atendido: " + clienteAtendido); //Mostrar el nombre del cliente que ha sido atendido
			   }else {
				   System.out.println("La cola de atencion está vacia, No hay clientes para atender."); //Mostrar un mensaje indicando que la cola de atencionesta vacia
			   }
			   break; //Salir del bloque switch
			   
		   case 3:
			   if (!colaAtencion.isEmpty()) { // Verificar si la cola de atencion no está vacia
				   String proximoCliente = colaAtencion.peek(); // Obtener el proximo cliente de la cola sin atenderlo utilizando el metodo peek()
				   System.out.println("Próximo cliente en la cola: " + proximoCliente); //Mostrar el nombre del próximo cliente en la cola
			   }else {
				   System.out.println("La cola de atencion está vacia."); //Mostrar un mensaje indicando que la cola de atencion esta vacia
			   }
			   break; //Salir del bloque switch
			   
		   case 4:
			   boolean estaVacia = colaAtencion.isEmpty(); //Verificar si la cola de atencion esta vacia utilizando el metodo isEmpty()
			   System.out.println("La cola de atencion esta vacia: " + estaVacia); //Mostrar si la cola de atencio esta vacia o no
			   break; // Salir del bloque switch
			   
		   case 5:
			   salir = true; //Estrablecer la variable salir a true para salir del bucle while
			   break; // Salir del bloque switch
			   
		   default:
		       System.out.println("Opcion inválida, Intente nuevamente. ");//Mostrar un mensaje indicando que la opcion ingresada es inválida
		       break; //Salir del bloque switch
		    
	    }
		
		System.out.println(); //Imprimir una linea en blanco para separar las iteraciones del bucle while
		
     }
	 System.out.println("¡Hasta Luego!"); //Mostrar un mensaje de despedida al salir del programa
   }

}
