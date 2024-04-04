import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class PriorityQueueTest {
    
    @Test
    public void testInsert() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Paciente paciente1 = new Paciente("Juan", "Fiebre alta");
        Paciente paciente2 = new Paciente("María", "Dolor de cabeza");
        
        priorityQueue.insert("A", paciente1);
        priorityQueue.insert("B", paciente2);
        
        assertEquals(paciente1, priorityQueue.search("A"));
        assertEquals(paciente2, priorityQueue.search("B"));
    }
    
    @Test
    public void testSearch() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Paciente paciente1 = new Paciente("Juan", "Fiebre alta");
        Paciente paciente2 = new Paciente("María", "Dolor de cabeza");
        
        priorityQueue.insert("A", paciente1);
        priorityQueue.insert("B", paciente2);
        
        assertEquals(paciente1, priorityQueue.search("A"));
        assertEquals(paciente2, priorityQueue.search("B"));
        assertEquals(null, priorityQueue.search("C")); // Aseguramos que devuelve null cuando la clave no existe
    }
    
    // Podrías escribir pruebas adicionales para otros métodos si lo deseas
}