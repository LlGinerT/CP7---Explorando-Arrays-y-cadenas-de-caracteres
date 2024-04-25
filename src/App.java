import java.util.Scanner;

import Plantilla.GestorEmpleados;

public class App {
    public static void main(String[] args) throws Exception {

        // iniciamos el gestorEmpleados
        GestorEmpleados gestor = new GestorEmpleados();

        // Accedemos al tercer nombre de empleado
        System.out.println("Tercer empleado de la lista:");
        System.out.print("Nombre: ");
        System.out.println(gestor.mostrarNombreEmpleado(2));
        // Accedemos al segundo empleado de la lista y mostramos las horas trabajadas el
        // martes
        System.out.println("--------------------------------------");
        System.out.println("Segundo empleado de la lista:");
        System.out.print("Nombre: ");
        System.out.println(gestor.mostrarNombreEmpleado(1));
        System.out.print("Horas Martes: ");
        System.out.println(gestor.mostrarHorasDia(1, 1));
        System.out.println("--------------------------------------");
        // Recorremos el array de empleados e imprimimos sus nombres en una nueva linea
        gestor.mostrarListaEmpleados();
        System.out.println("--------------------------------------");
        // inicializamos un Scanner parara permitir al usuario introducir el nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre a comprobar: ");
        String nombreEmpleado = scanner.nextLine();
        if (gestor.comprobarNombre(nombreEmpleado)) {
            System.out.println(nombreEmpleado + " esta en la lista de empleados");
        } else {
            System.out.println(nombreEmpleado + " no esta en la lista de empleados");
        }
        // Finalizamos el scanner
        scanner.close();
        System.out.println("--------------------------------------");
        // Ordenamos la lista en orden alfabético
        gestor.ordenarAlfabeticamente();
        // Volvemos a mostrar la lista para comprobar que el orden es correcto
        System.out.println("Listado en orden alfabético:");
        gestor.mostrarListaEmpleados();
        // y volvemos a mostrar las horas de Antonio para comprobar que han cambiado de
        // posición con el.
        System.out.println("--------------------------------------");
        System.out.println("Comprobamos que las horas siguen siendo correctas:");
        System.out.print("Nombre: ");
        System.out.println(gestor.mostrarNombreEmpleado(0));
        System.out.print("Horas Martes: ");
        System.out.println(gestor.mostrarHorasDia(0, 1));

        // Ordenamos el array bidimensional y el array de nombres por el total de horas
        // trabajadas en orden ascendente
        gestor.ordenarPorHoras();
        System.out.println("--------------------------------------");
        System.out.println("Listado en orden de horas trabajadas:");
        gestor.mostrarListaEmpleados();
        System.out.println("--------------------------------------");
        System.out.println("Comprobamos que las horas siguen siendo correctas:");
        System.out.print("Nombre: ");
        System.out.println(gestor.mostrarNombreEmpleado(0));
        System.out.print("Horas Martes: ");
        System.out.println(gestor.mostrarHorasDia(0, 1));

    }
}
