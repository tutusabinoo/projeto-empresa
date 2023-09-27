# Projeto Java - Gerenciamento Empresarial

Este projeto consiste em um aplicativo Java para gerenciamento de uma empresa, envolvendo operações com clientes, produtos, funcionários, receita anual e pedidos.

## Configuração e Execução

1. **Pré-requisitos:**
   Certifique-se de ter o JDK (Java Development Kit) e o MySQL instalados em seu sistema.

2. **Configuração do Banco de Dados:**
   - Crie um banco de dados chamado `empresa` no MySQL.
   - Crie uma tabela `Cliente` com as colunas `Nome`, `CPF` e `Cidade`.
   - Executar os INSERTS presentes no arquivo empresa.sql

3. **Compilação e Execução:**
   - Compile os arquivos `.java` usando o comando `javac`:
     ```bash
     javac Cliente.java Produtos.java Funcionarios.java Receita.java Pedidos.java Main.java
     ```
   - Execute o programa com o comando `java`:
     ```bash
     java Main
     ```

## Funcionalidades

O programa oferece as seguintes funcionalidades:

1. **Imprimir clientes do banco de dados:**
   - Conecta-se ao banco de dados MySQL e imprime os dados dos clientes.

2. **Imprimir produtos do arquivo CSV:**
   - Lê o arquivo 'produtos.csv' e imprime os dados dos produtos.

3. **Imprimir dados dos funcionários cadastrados:**
   - Cria 5 funcionários fictícios e imprime seus dados.

4. **Calcular receita anual:**
   - Permite ao usuário inserir o valor ganho em um mês e calcula a receita anual com base nesse valor.

5. **Inserir pedido:**
   - Permite ao usuário criar um pedido inserindo informações sobre o produto.
6. **Imprimir lista de pedidos:**
- Permite ao usuário imprimir a lista de pedidos já realizada.
  
Escolha a opção desejada ao executar o programa e siga as instruções para cada funcionalidade.
