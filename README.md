# Desafio: Componentes e Injeção de Dependência

Este projeto é uma aplicação **Java Spring Boot** desenvolvida para consolidar conceitos fundamentais de **Composição** e **Injeção de Dependência**. 

## 🎯 Objetivo
O sistema calcula o valor total de um pedido a partir de um valor básico, aplicando uma porcentagem de desconto e somando o valor do frete conforme regras específicas.

## 🏗️ Estrutura do Projeto
A solução foi desenhada seguindo o princípio de separação de responsabilidades, dividindo a lógica em diferentes serviços registrados como componentes do Spring (`@Service`):

* **OrderService**: Responsável pelo cálculo do valor líquido (aplicação do desconto) e integração com o serviço de frete.
* **ShippingService**: Concentra as regras de negócio referentes aos custos de envio.
* **Order (Entity)**: Representa o modelo de dados do pedido.

## 📝 Regras de Negócio (Frete)
O cálculo do frete é baseado no valor básico do pedido (antes do desconto):
| Valor Básico do Pedido | Frete |
| :--- | :--- |
| Abaixo de R$ 100,00 | R$ 20,00 |
| De R$ 100,00 até R$ 200,00 (exclusive) | R$ 12,00 |
| R$ 200,00 ou mais | Grátis |

## 🛠️ Tecnologias Utilizadas
* **Java 17**
* **Spring Boot**
* **Maven** para gerenciamento de dependências

## 🚀 Como executar
1. Clone o repositório.
2. Abra o projeto no IntelliJ.
3. Configure o Project Structure para usar o Java 17.
4. Insira os dados (Código, Valor Básico, Porcentagem de Desconto) quando solicitado no console.

## 🧠 Aprendizados
Neste desafio, pude aplicar na prática:
* Configuração de componentes com a anotação `@Service`.
* Injeção de dependência automática via `@Autowired`.
* Utilização da interface `CommandLineRunner` para execução de lógica no console após a inicialização do contexto Spring.
