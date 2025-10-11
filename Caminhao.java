/* 
 *  Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, String placa, double valor, double capacidadeCarga) {
        super(marca, modelo, ano, placa, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }

    @Override
    public double calcularIpva() {
        return (capacidadeCarga <= 5) ? getValor() * 0.02 : getValor() * 0.03;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidade: " + capacidadeCarga + "t, IPVA: R$" + calcularIpva();
    }
}
