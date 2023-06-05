public class Expressao {
    public boolean verificaFechamento(char comeco, char termino) {
        if(comeco == '(' && termino == ')') {
            return true;
        } else if(comeco == '[' && termino == ']') {
            return true;
        } else if(comeco == '{' && termino == '}') {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean verificaExpressao(String expressao) throws Exception {
        Stack<Character> pilha = new Stack<>();

        for(int i = 0; i < expressao.length(); i++) {
            char simbolo = expressao.charAt(i);

            if(simbolo == '(' || simbolo == '[' || simbolo == '{') {
                pilha.push(simbolo);
            } else if(simbolo == ')' || simbolo == ']' || simbolo == '}') {
                if(pilha.isEmpty() || !verificaFechamento(pilha.pop(), simbolo)) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}