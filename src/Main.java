public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        pilha.pop();

        pilha.display();
    }
}
