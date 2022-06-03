public class EncomendaImpl implements Encomenda {
    public boolean encomenda(int idProduto){
        boolean pedidoAtendido=false;
        Produto produto =new Produto();
        produto.idProduto = idProduto;
        if(Estoque.disponivel(produto))
        {
            System.out.println("ID Produto: "+ produto.idProduto +" disponivel.");
            boolean PagOK= Pagamento.fazerPg();
            if(PagOK){
                System.out.println("Pagamento Confirmado");
                Entrega.entregaProduto(produto);
                System.out.println("Produto enviado");
                pedidoAtendido=true;
            }
        }
        return pedidoAtendido;
    }
}