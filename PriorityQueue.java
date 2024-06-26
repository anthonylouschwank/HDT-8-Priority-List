public class PriorityQueue<K extends Comparable<K>> {
    private Node<K, Paciente> root;

    public void insert(K key, Paciente value) {
        root = insertRecursive(root, key, value);
    }
    
    private Node<K, Paciente> insertRecursive(Node<K, Paciente> node, K key, Paciente value) {
        if (node == null) {
            return new Node<K, Paciente>(key, value);
        }
    
        if (key.compareTo(node.key) < 0) {
            node.left = insertRecursive(node.left, key, value);
        } else if (key.compareTo(node.key) > 0) {
            node.right = insertRecursive(node.right, key, value);
        } else {
            
        }
    
        return node;
    }

    public Paciente search(K key) {
        Node<K, Paciente> node = searchRecursive(root, key);
        if (node != null) {
            return node.value;
        }
        return null; 
    }
    
    private Node<K, Paciente> searchRecursive(Node<K, Paciente> node, K key) {
        if (node == null || node.key.equals(key)) {
            return node;
        }
    
        if (key.compareTo(node.key) < 0) {
            return searchRecursive(node.left, key);
        }
    
        return searchRecursive(node.right, key);
    }

   public void printPatientsInPriorityOrder() {
    printPatientsInPriorityOrderRecursive(root);
    }

    private void printPatientsInPriorityOrderRecursive(Node<K, Paciente> node) {
        if (node != null) {
            printPatientsInPriorityOrderRecursive(node.left); 
            System.out.println("Nombre: " + node.value.getNombre() + ", Síntoma: " + node.value.getAfliccion()); 
            printPatientsInPriorityOrderRecursive(node.right); 
        }
    }
}