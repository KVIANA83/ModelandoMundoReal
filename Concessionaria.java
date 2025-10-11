/* 
 *  Equipe: 

   - José Paulo Cauás Tenório 
   - Juliana Dias da Silva 
   - Karine Viana Caldas da Silva 
   - Petrus Oliveira de Andrade Cruz 
   - Thiago Nicolas Ananias da Silva
 */

import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // Criando carros
        veiculos.add(new Carro("Toyota", "Corolla", 2020, "ABC1234", 100000, 4));
        veiculos.add(new Carro("Honda", "Civic", 2021, "DEF5678", 95000, 4));
        veiculos.add(new Carro("Ford", "Focus", 2019, "GHI9012", 80000, 4));

        // Criando motos
        veiculos.add(new Moto("Yamaha", "YZF-R3", 2022, "JKL3456", 25000, 321));
        veiculos.add(new Moto("Honda", "CB500", 2021, "MNO7890", 30000, 500));

        // Criando caminhões
        veiculos.add(new Caminhao("Mercedes", "Actros", 2020, "PQR2345", 300000, 4.5));
        veiculos.add(new Caminhao("Volvo", "FH", 2021, "STU6789", 400000, 6));

        // Exibir informações de todos os veículos
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }
}
