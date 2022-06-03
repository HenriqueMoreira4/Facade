public class ControladorPedidos {
    Encomenda facade;
    boolean preencherPedido =false;
    public void encomendarPedido(int idProduto) {
        preencherPedido =facade.encomenda(idProduto);
        System.out.println("Atendimento concluído. ");
    }
}


