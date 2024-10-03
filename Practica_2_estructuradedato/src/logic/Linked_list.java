package logic;
import java.util.Random;
import java.util.Scanner;

class estudiante {
    int id;
    String nombre;
    double indiceacademico;

    public estudiante(int id, String nombre, double indiceacademico) {
        this.id = id;
        this.nombre = nombre;
        this.indiceacademico = indiceacademico;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", nombre: " + nombre + ", indice academico: " + indiceacademico;
    }
}

public class Linked_list {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("ingresa el numero de estudiantes a generar:");
			int N = scanner.nextInt();
			
			System.out.println("en que orden (asc/des):");
			String order = scanner.next();

			estudiante[] estudiantes = generarestudiantes(N);

			sortestudiantes(estudiantes, order);

			System.out.println("estudiantes organizados:");
			for (estudiante estudiante : estudiantes) {
			    System.out.println(estudiante);
			}
		}
    }

    public static estudiante[] generarestudiantes(int N) {
        estudiante[] estudiantes = new estudiante[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int id = random.nextInt(1000);  
            double indiceacademico = 1.0 + (4.0 - 1.0) * random.nextDouble(); 
            estudiantes[i] = new estudiante(id, "estudiante #" + (i + 1), indiceacademico);
        }

        return estudiantes;
    }

    public static void sortestudiantes(estudiante[] estudiantes, String order) {
        boolean isAscending = order.equalsIgnoreCase("asc");
        
        for (int i = 0; i < estudiantes.length - 1; i++) {
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                if (isAscending) {
                    if (estudiantes[j].indiceacademico > estudiantes[j + 1].indiceacademico) {
                        estudiante temp = estudiantes[j];
                        estudiantes[j] = estudiantes[j + 1];
                        estudiantes[j + 1] = temp;
                    }
                } else {
                    if (estudiantes[j].indiceacademico < estudiantes[j + 1].indiceacademico) {
                        estudiante temp = estudiantes[j];
                        estudiantes[j] = estudiantes[j + 1];
                        estudiantes[j + 1] = temp;
                    }
                }
            }
        }
    }
}
