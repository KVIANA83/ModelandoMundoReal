/* 
    Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */


public class Veiculo {
    private String placa;
    private String marca;
    private String modelo; 
    private int ano;
    private String cor;
    private double valor;

    // Construtor
    public Veiculo(String placa, String marca, String modelo, int ano, String cor, double valor) {
        this.placa = placa;
        this.marca  = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valor = valor;
    }
}

// Getters e Setters
public String getPlaca () {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public String getMarca() {
    return marca;
} 

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public double getValor() {
    return valor;
}   

public void setValor(double valor) {
    this.valor = valor;
}

// Método calcular IPVA 
public double calcularIPVA() {
    return valor * 0.04; // Supondo uma alíquota de 4%
}

@Override
public String toString() {
    return "Placa: " + placa + 
           ", Marca: " + marca + 
           ", Modelo: " + modelo + 
           ", Ano: " + ano + 
           ", Cor: " + cor + 
           ", Valor: R$ " + valor;
}
