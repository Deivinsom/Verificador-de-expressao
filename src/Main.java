public class Main {
    public static void main(String[] args) throws Exception {
        Expressao novaExpressao = new Expressao();

        System.out.println(novaExpressao.verificaExpressao("2+4*[5+(x/2)]"));

        System.out.println(novaExpressao.verificaExpressao("2+4*[5+(x/2]"));

        System.out.println(novaExpressao.verificaExpressao("2+4*[5+(x/2)"));
    }
}
