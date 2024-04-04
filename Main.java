public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Insertar algunos pacientes en la cola de prioridad
        priorityQueue.insert("A", new Paciente("Juan", "Fiebre alta"));
        priorityQueue.insert("B", new Paciente("María", "Dolor de cabeza"));
        priorityQueue.insert("C", new Paciente("Pedro", "Fractura de pierna"));
        priorityQueue.insert("D", new Paciente("Ana", "Ataque de asma"));
        priorityQueue.insert("E", new Paciente("Carlos", "Dolor abdominal"));
        priorityQueue.insert("F", new Paciente("Laura", "Resfriado"));

        // Imprimir la lista de pacientes en orden de prioridad
        System.out.println("Lista de pacientes en orden de prioridad:");
        priorityQueue.printPatientsInPriorityOrder();
    }
}
