/* 
 *  Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, String placa, double valor, int numeroPortas) {
        super(marca, modelo, ano, placa, valor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    @Override
    public double calcularIpva() {
        return getValor() * 0.035;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas: " + numeroPortas + ", IPVA: R$" + calcularIpva();
    }
}

