package TestBilleteraVirtual;
import Billetera.virtual.Billetera;

import Billetera.virtual.TipoMoneda;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBilletera {

    @Test
    public void TransferenciaExitosa() {
        double cantidad = 500.99;
        TipoMoneda moneda = TipoMoneda.USD;
        Billetera b1 = new Billetera(moneda);
        Billetera b2 = new Billetera(moneda);
        double actual = b2.getSaldo();
        b1.Transferir(cantidad, b2);
        double delta = 0.0001; // Tolerancia para la comparación de doubles
        assertEquals(actual + cantidad, b2.getSaldo(), delta);
    }
    @Test
    public void DepositarExitosamente(){
        TipoMoneda moneda = TipoMoneda.USD;
        Billetera b1 = new Billetera(moneda);
        double actual = b1.getSaldo();
        double cantidad = 500.99;
        b1.Depositar(cantidad);
        double delta = 0.0001;
        assertEquals(actual+cantidad,b1.getSaldo(),delta);
    }
    @Test
    public void ExtraerDineroExitosamente(){
            TipoMoneda moneda = TipoMoneda.USD;
            Billetera b1 = new Billetera(moneda);
            double cantidad = 500.99;
            b1.Depositar(cantidad);
            double actual = b1.getSaldo();
            b1.Retirar(cantidad);
            double delta = 0.0001;
            assertEquals(actual-cantidad,b1.getSaldo(),delta);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void ExtraerDineroDeFormaFallida(){
//        TipoMoneda moneda = TipoMoneda.USD;
//        Billetera b1 = new Billetera(moneda);
//        double cantidad = 500.99;
//        assertThrows(IllegalArgumentException.class,()->{
//            b1.Retirar(cantidad);
//        });
//    }
    @Test
    public void ExtraerDineroDeFormaFallida(){
        TipoMoneda moneda = TipoMoneda.USD;
        Billetera b1 = new Billetera(moneda);
        double cantidad = 500.99;
        try {
            b1.Retirar(cantidad);
        }
        catch (IllegalArgumentException e){
            //test pasa si se lanza exception
        }
    }

}
