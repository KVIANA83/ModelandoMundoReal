/* 
 *  Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, String placa, double valor, int cilindrada) {
        super(marca, modelo, ano, placa, valor);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    @Override
    public double calcularIpva() {
        return getValor() * 0.02;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + "cc, IPVA: R$" + calcularIpva();
    }
}
