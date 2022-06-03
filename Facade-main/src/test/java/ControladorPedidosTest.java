import org.junit.Test;

import static org.junit.Assert.*;

public class ControladorPedidosTest {
    @Test
    public void Test() throws Exception{
        ControladorPedidos controller = new ControladorPedidos();
        controller.facade=new EncomendaImpl();
        controller.encomendarPedido(20);
        boolean reslt = controller.preencherPedido;
        assertTrue(reslt);

    }

}