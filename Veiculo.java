/* 
    Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */


public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(String marca, String modelo, int ano, String placa, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    // Getters e setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    // Método abstrato que cada classe filha implementa
    public abstract double calcularIpva();

    // Método para exibir informações básicas
    public void exibirInfo() {
        System.out.println(marca + " " + modelo + " (" + ano + ")");
        System.out.println("Placa: " + placa);
        System.out.println("Valor: R$" + valor);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + "), Placa: " + placa + ", Valor: R$" + valor;
    }
}
