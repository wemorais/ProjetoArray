# 💳 Sistema de Compras com Cartão de Crédito (Java)

Um projeto simples em **Java** desenvolvido com base em **Programação Orientada a Objetos (POO)**, simulando o uso de um **cartão de crédito** para registrar compras, validar saldo e exibir o histórico de transações.

---

## 🚀 **Objetivo do Projeto**

Este projeto tem como finalidade demonstrar na prática os principais **conceitos de POO**, como:

- **Encapsulamento**
- **Abstração**
- **Composição**
- **Responsabilidade Única (SRP)**
- **Uso de coleções e comparações (`List`, `Comparable`)**

---

## 🧠 **Conceitos de POO Aplicados**

| Conceito | Onde foi aplicado |
|-----------|-------------------|
| **Encapsulamento** | Todos os atributos das classes estão privados, acessados apenas por métodos públicos (getters). |
| **Abstração** | Cada classe representa uma entidade do mundo real: `Cliente`, `CartaoCredito`, `Compra`. |
| **Composição** | O `CartaoCredito` possui um `Cliente` e uma lista de `Compra`. |
| **Responsabilidade Única (SRP)** | Cada classe tem uma função bem definida (modelo, serviço ou aplicação). |
| **Polimorfismo/Interfaces** | A classe `Compra` implementa `Comparable` para ordenação por valor. |

---

## 🏗️ **Estrutura do Projeto**

```
src/
 ├── app/
 │    └── Principal.java         # Classe principal (ponto de entrada)
 ├── model/
 │    ├── CartaoCredito.java     # Representa o cartão de crédito
 │    ├── Cliente.java           # Representa o titular do cartão
 │    └── Compra.java            # Representa uma compra
 └── service/
      └── MenuCompra.java        # Gerencia a interação do usuário e o menu de compras
```

---

## ⚙️ **Funcionalidades**

✅ Registrar o nome do cliente e o limite inicial do cartão  
✅ Realizar compras (informando produto e valor)  
✅ Validar automaticamente se há saldo suficiente  
✅ Exibir lista de compras ordenadas por valor  
✅ Mostrar o saldo restante do cartão  

---

## 💡 **Fluxo de Execução**

1. O programa solicita o **nome do cliente** e o **limite do cartão**.  
2. O usuário pode digitar o **produto** e o **valor da compra**.  
3. O sistema valida o saldo antes de confirmar a compra.  
4. Quando o usuário digita `0`, o programa encerra e mostra:  
   - Todas as compras realizadas  
   - O saldo restante  

---

## 🖥️ **Exemplo de Execução**

```
====== MENU DE COMPRAS ======

Digite seu nome: Wellington
Informe o limite do seu cartão: 1000

Bem-vindo(a) Wellington! Seu saldo inicial é de R$ 1000.00

Digite o produto que deseja comprar: Notebook
Informe o valor total do produto: 800
✅ Compra realizada com sucesso!

Digite 0 para sair ou 1 para continuar: 1

Digite o produto que deseja comprar: Mouse
Informe o valor total do produto: 200
✅ Compra realizada com sucesso!

Digite 0 para sair ou 1 para continuar: 0

====================================
COMPRAS REALIZADAS:

Mouse - R$ 200.00
Notebook - R$ 800.00

====================================
Saldo restante do cartão: R$ 0.00
```

---

## 🧩 **Classes Principais**

### 🧾 `CartaoCredito`
- Controla o limite e o saldo.
- Armazena as compras realizadas.
- Exibe o extrato e valida o saldo.

### 🧾 `Compra`
- Representa uma compra com **produto** e **valor**.
- Implementa `Comparable` para permitir ordenação pelo valor.

### 🧾 `Cliente`
- Representa o titular do cartão, armazenando o nome.

### 🧾 `MenuCompra`
- Gerencia a **interface de console**.
- Responsável pelo loop principal do menu.

---

## 🧰 **Tecnologias Utilizadas**

- ☕ **Java 17+**
- 🧩 **Paradigma Orientado a Objetos**
- 📚 **Coleções (`ArrayList`, `Collections.sort`)**
- 🧮 **Formatadores e tratamento de exceções**

---

## 🧑‍💻 **Como Executar o Projeto**

### 🔹 **No IntelliJ IDEA ou Eclipse**
1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/NOME_DO_PROJETO.git
   ```
2. Importe o projeto como um **projeto Java**.
3. Certifique-se de que o SDK está configurado (Java 17 ou superior).
4. Execute o arquivo:
   ```
   src/app/Principal.java
   ```

### 🔹 **Via Terminal**
1. Compile:
   ```bash
   javac -d bin src/**/*.java
   ```
2. Execute:
   ```bash
   java -cp bin app.Principal
   ```

---

## 🧱 **Possíveis Melhorias Futuras**

- 💾 Persistência dos dados (salvar compras em arquivo ou banco de dados)
- 🌐 Interface gráfica com JavaFX ou Swing
- 📊 Relatórios de gastos por categoria
- 💬 Exibir mensagens formatadas com cores no terminal

---

## ✨ **Autor**

**Wellington de Morais**  
📍 Desenvolvedor Java | [Linkedin] (https://www.linkedin.com/in/wellington-de-morais-65aba6158/)
🔗 [GitHub](https://github.com/wemorais)

---

## 📜 **Licença**

Este projeto é de código aberto e pode ser utilizado para fins de estudo e aprendizado.
