import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            String line;
            // Leer cada línea del archivo de pacientes
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                // Verificar si la línea tiene el formato correcto
                if (parts.length == 3) {
                    String nombre = parts[0].trim();
                    String sintoma = parts[1].trim();
                    char codigoEmergencia = parts[2].trim().charAt(0); // Obtener el primer carácter
                    Paciente paciente = new Paciente(nombre, sintoma);
                    priorityQueue.insert(Character.toString(codigoEmergencia), paciente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir los pacientes en orden de prioridad
        System.out.println("Lista de pacientes en orden de prioridad:");
        priorityQueue.printPatientsInPriorityOrder();
    }
}
