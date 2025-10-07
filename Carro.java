/* 
 *  Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */

public class Carro {
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
        super(placa, marca, modelo, ano, valor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    @Override
    public double calcularIpva() {
        return getValor() * 0.035; // 3,5%
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Portas: " + numeroPortas + ", IPVA: " + calcularIpva();
    }
}
