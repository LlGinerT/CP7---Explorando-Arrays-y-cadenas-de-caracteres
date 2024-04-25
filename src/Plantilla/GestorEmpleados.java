package Plantilla;

public class GestorEmpleados {

    // Los arrays declarados
    private Empleado[] listaEmpleados;
    private int[][] horasTrabajadasDia;

    private void inicializarEmpleados() {

        // Metodo para inicializar los arrays con datos de ejemplo
        listaEmpleados[0] = new Empleado("Jose");
        listaEmpleados[1] = new Empleado("Antonio");
        listaEmpleados[2] = new Empleado("Juan");
        listaEmpleados[3] = new Empleado("Carlos");
        listaEmpleados[4] = new Empleado("David");

        // primer int indica el indice del empleado y el segundo indica el
        // numero correspondiente al dia de la semana empezando por el
        // lunes(0), hasta el domingo(6)
        horasTrabajadasDia[0] = new int[] { 7, 8, 6, 5, 6, 0, 0 }; // Jose(0)
        horasTrabajadasDia[1] = new int[] { 4, 7, 3, 4, 4, 4, 0 }; // Antonio(1)
        horasTrabajadasDia[2] = new int[] { 6, 7, 8, 5, 6, 3, 0 }; // Juan(2)
        horasTrabajadasDia[3] = new int[] { 5, 6, 7, 5, 9, 0, 2 }; // Carlos(3)
        horasTrabajadasDia[4] = new int[] { 9, 8, 7, 5, 6, 0, 0 }; // David(4)
    }

    public GestorEmpleados() {

        // Constructor de la clase GestorEmpleados
        // que crea los arrays que vamos a usar y
        // los inicializa con datos de ejemplo del metodo
        // inicializarEmpleados
        this.listaEmpleados = new Empleado[5];
        this.horasTrabajadasDia = new int[5][7];
        inicializarEmpleados();
    }

    public String mostrarNombreEmpleado(int indiceEmpleado) {
        // Método para acceder al nombre del empleado a traves de su getter
        return listaEmpleados[indiceEmpleado].getNombre();
    }

    public int mostrarHorasDia(int indiceEmpleado, int indiceDia) {

        // Método para acceder a las horas de un trabajador y dia concreto
        // del array bidimensional
        return horasTrabajadasDia[indiceEmpleado][indiceDia];
    }

    public void mostrarListaEmpleados() {

        // Método que imprime los nombres del array de empleados
        System.out.println("Listado de empleados:");
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println(listaEmpleados[i].getNombre());
        }
    }

    public boolean comprobarNombre(String nombre) {

        // Método que busca si un nombre existe o no en la lista de empleados
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public void ordenarAlfabeticamente() {

        // Usamos una ordenación de burbuja para ordenar tanto la lista de empleados
        // como sus horas trabajadas, para que sigan "sincronizados"
        for (int i = 0; i < listaEmpleados.length - 1; i++) {
            for (int j = i + 1; j < listaEmpleados.length; j++) {
                if (listaEmpleados[i].getNombre().compareTo(listaEmpleados[j].getNombre()) > 0) {
                    Empleado tempEmpleado = listaEmpleados[i];
                    int[] tempHoras = horasTrabajadasDia[i];
                    listaEmpleados[i] = listaEmpleados[j];
                    listaEmpleados[j] = tempEmpleado;
                    horasTrabajadasDia[i] = horasTrabajadasDia[j];
                    horasTrabajadasDia[j] = tempHoras;
                }
            }
        }
    }

    public void ordenarPorHoras() {

        // Primero creamos un array que guardara las horas totales de cada trabajador
        int[] horasTotales = new int[5];

        for (int i = 0; i < horasTrabajadasDia.length; i++) {
            for (int j = 0; j < horasTrabajadasDia[i].length; j++) {
                horasTotales[i] += horasTrabajadasDia[i][j];
            }
        }

        // Usamos una ordenación de burbuja para ordenar tanto la lista de empleados
        // como sus horas trabajadas, para que sigan "sincronizados"
        for (int i = 0; i < listaEmpleados.length - 1; i++) {
            for (int j = i + 1; j < listaEmpleados.length; j++) {
                if (horasTotales[i] > horasTotales[j]) {
                    Empleado tempEmpleado = listaEmpleados[i];
                    int[] tempHoras = horasTrabajadasDia[i];
                    listaEmpleados[i] = listaEmpleados[j];
                    listaEmpleados[j] = tempEmpleado;
                    horasTrabajadasDia[i] = horasTrabajadasDia[j];
                    horasTrabajadasDia[j] = tempHoras;
                }
            }
        }
    }
}
