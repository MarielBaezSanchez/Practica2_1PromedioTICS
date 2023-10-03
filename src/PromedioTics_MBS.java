import java.util.Scanner;;


public class PromedioTics_MBS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arreglo1A = ingresarProm("1A");
        double[] arreglo1B = ingresarProm("1B");
        double[] arreglo4A = ingresarProm("4A");
        double[] arreglo4B = ingresarProm("4B");
        double[] arreglo4C = ingresarProm("4C");

        double[] grupos = new double[5];

        grupos[0] = calcuProm(arreglo1A);
        grupos[1] = calcuProm(arreglo1B);
        grupos[2] = calcuProm(arreglo4A);
        grupos[3] = calcuProm(arreglo4B);
        grupos[4] = calcuProm(arreglo4C);

        mostrarPromGrup(grupos);
        double promedioGeneral = calcuProm(grupos);

        System.out.println("El promedio general de la carrera de TICS es: " + promedioGeneral);
    }

    public static double calcuProm(double[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static double[] ingresarProm(String grupoNom) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese la cantidad de alumnos para el grupo" + grupoNom + ":");
        int numAlumnos = scanner.nextInt();

        double[] promedios = new double[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese el promedio del alumno " + (i+1) + " del grupo " + grupoNom + ":");
            promedios[i] = scanner.nextDouble();

        }
        return promedios;
    }
    public static void mostrarPromGrup(double[] promediosGrupos) {
        String[] nombresGrupos = {"1A", "1B", "4A", "4B", "4C"};
        for (int i = 0; i < promediosGrupos.length; i++) {
            System.out.println("El promedio del grupo " + nombresGrupos[i] + " es: " + promediosGrupos[i]);
        }

    }
}