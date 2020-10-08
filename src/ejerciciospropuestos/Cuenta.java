
package ejerciciospropuestos;

public class Cuenta {
    private String titular;
    private double cantidad;

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void ingresar(double valor){
        if(valor>0){
            setCantidad(valor+getCantidad());
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    public void retirar(double valor){
        if(getCantidad()-valor>getCantidad()){
            cantidad = 0 ;
        }
        else {
            setCantidad(getCantidad()-valor);
        }
    }
    public void consultar(){
        System.out.println("Su saldo es de: "+getCantidad());
    }
}

