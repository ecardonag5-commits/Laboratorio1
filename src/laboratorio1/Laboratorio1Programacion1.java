package laboratorio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Laboratorio1Programacion1 {
	
	 static List<String> estudiantes = new ArrayList<>();
	 static List<Double> calificaciones = new ArrayList<>();
	 static Scanner entrada= new Scanner(System.in);

	
	
	public static void main(String[] args) {
		
		 int opcion;
		 

	        do {
	            mostrarMenu();
	            opcion = leerEntero(entrada);

	            switch (opcion) {
	                case 1:
	                    agregarEstudiante(entrada);
	                    break;
	                case 2:
	                    mostrarEstudiantes();
	                    break;
	                case 3:
	                    calcularPromedio();
	                    break;
	                case 4:
	                    mostrarMayorCalificacion();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del sistema...");
	                    break;
	                default:
	                    System.out.println("ERROR, Opción no válida.");
	            }

	        } while (opcion != 5);

	

}
	
	


    // MENU PORGRAMA
    public static void mostrarMenu() {
    	
    	System.out.println("............MENU...........");
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio");
        System.out.println("4. Mostrar mayor calificación");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    
    
    
    // AGREGAR ESTUDIANTE
    public static void agregarEstudiante(Scanner scanner) {
    	
    	System.out.println("...AGREGAR ESTUDIANTE...");
        System.out.print("Ingrese su Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su Calificación: ");
        double calificacion = leerDouble(scanner);

        estudiantes.add(nombre);
        calificaciones.add(calificacion);

        System.out.println("Estudiante agregado correctamente.");
    }

    
    
    
    // MOSTRAR ESTUDIANTES
    public static void mostrarEstudiantes() {
    	
    	System.out.println("..MOSTRAR ESTUDIANTES..");
    	
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i) + 
                    " - " + calificaciones.get(i));
        }
    }

    
    
    // CALCULAR PROMEDIO
    public static void calcularPromedio() {
    	
    	System.out.println("..CALCULAR PROMEDIO..");
    	
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones.");
            return;
        }

        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Promedio: " + promedio);
    }
    
    

    // MOSTRAR MAYOR CALIFICACION
    public static void mostrarMayorCalificacion() {
    	
    	System.out.println("...MOSTRAR MAYOR CALIFICACIÓN...");
    	
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones.");
            return;
        }

        double max = calificaciones.get(0);
        String nombre = estudiantes.get(0);

        for (int i = 1; i < calificaciones.size(); i++) {
            if (calificaciones.get(i) > max) {
                max = calificaciones.get(i);
                nombre = estudiantes.get(i);
            }
        }

        System.out.println("Mayor calificación: " + nombre + " - " + max);
    }

    
    
    
    
    // VALIDACIONES
    public static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }

    
    
    
    public static double leerDouble(Scanner scanner) {
        while (true) {
            try {
                double nota = Double.parseDouble(scanner.nextLine());

                if (nota >= 0 && nota <= 100) {
                    return nota;
                } else {
                    System.out.print("Ingrese nota entre 0 y 100: ");
                }

            } catch (Exception e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }
    
    
}
