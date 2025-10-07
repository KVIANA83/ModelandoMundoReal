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
        veiculos.add(new Carro("ABC1234", "Toyota", "Corolla", 2020, 100000, 4));
        veiculos.add(new Carro("DEF5678", "Honda", "Civic", 2021, 95000, 4));
        veiculos.add(new Carro("GHI9012", "Ford", "Focus", 2019, 80000, 4));

        // Criando motos
        veiculos.add(new Moto("JKL3456", "Yamaha", "YZF-R3", 2022, 25000, 321));
        veiculos.add(new Moto("MNO7890", "Honda", "CB500", 2021, 30000, 500));

        // Criando caminhões
        veiculos.add(new Caminhao("PQR2345", "Mercedes", "Actros", 2020, 300000, 4.5));
        veiculos.add(new Caminhao("STU6789", "Volvo", "FH", 2021, 400000, 6));

        // Exibir informações de todos os veículos
        for (Veiculo v : veiculos) {
            System.out.println(v.toString());
        }
    }
}
