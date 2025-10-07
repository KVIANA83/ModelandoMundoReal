# WebQuest 2 - Modelando o Mundo Real: Fundamentos da Orientação a Objetos com Java

## Integrantes da equipe
- José Paulo Cauás Tenório 
- Juliana Dias da Silva 
- Karine Viana Caldas da Silva 
- Petrus Oliveira de Andrade Cruz 
- Thiago Nicolas Ananias da Silva

## Introdução
Nesta WebQuest, fomos desafiados a desenvolver um sistema para uma concessionária de veículos utilizando Java, aplicando os conceitos fundamentais da Orientação a Objetos, como encapsulamento, herança e polimorfismo. O objetivo foi criar classes que representem diferentes tipos de veículos e calcular o IPVA de cada um, garantindo um sistema organizado e reutilizável.

## Objetivos
- Implementar classes com encapsulamento adequado.
- Utilizar herança para especialização de classes.
- Sobrescrever métodos para aplicar polimorfismo.
- Manipular arrays de objetos.
- Aplicar conceitos de abstração na modelagem do mundo real.

## Estrutura do Projeto
- **Veiculo.java**: Classe base com atributos privados, getters/setters e método `calcularIpva()`.
- **Carro.java**: Herda de `Veiculo`, adiciona `numeroPortas` e sobrescreve `calcularIpva()`.
- **Moto.java**: Herda de `Veiculo`, adiciona `cilindradas` e sobrescreve `calcularIpva()`.
- **Caminhao.java**: Herda de `Veiculo`, adiciona `capacidadeCarga` e sobrescreve `calcularIpva()` com regra de toneladas.
- **Concessionaria.java**: Contém o `main()` com a lista de veículos e exibição de informações.
- **README.md**: Documentação do projeto.

## Funcionamento
O programa cria veículos (carros, motos e caminhões), armazena-os em um array ou ArrayList e exibe todas as informações, incluindo o cálculo do IPVA de cada veículo. O IPVA é calculado de acordo com a classe do veículo:

- Carro: 3,5% do valor
- Moto: 2,5% do valor
- Caminhão: 2% se capacidade ≤ 5 toneladas, 3% se > 5 toneladas

## Referências
- TURINI, Rodrigo. *Desbravando Java e Orientação a Objetos*. São Paulo: Casa do Código, 2014.  
- CARVALHO, Thiago Leite e. *Orientação a Objetos: aprenda seus conceitos e suas aplicabilidades de forma efetiva*. São Paulo: Casa do Código, 2016.  
- DEITEL, Paul; DEITEL, Harvey. *Java: como programar*. 10. ed. São Paulo: Pearson Education do Brasil, 2017.  
- CAELUM. *Java e orientação a objetos*. Apostila. [S.l.]: Caelum.  
- LEWIS, John; LOFTUS, William. *Java Software Solutions: foundations of program design*. 7. ed. Boston: Addison Wesley, 2011.  
- CORNELL, Gary; HORSTMANN, Cay S. *Core Java, volume I – Fundamentals*. 8. ed. Upper Saddle River: Prentice Hall, 2009.
