# PCMania - Sistema de Compras de Computadores

👩‍🎓 Informações do Aluno
- Nome: Mariana
- Curso: Engenharia de Produção
- Matrícula: 152

---

## 📌 Descrição do Projeto

O projeto **PCMania** consiste no desenvolvimento de um sistema simples de compra de computadores, utilizando os
conceitos de **Programação Orientada a Objetos (POO)** em Java.

O sistema permite que um cliente selecione diferentes promoções de computadores e, ao final, apresenta um resumo 
com os produtos adquiridos e o valor total da compra.

---

## 🎯 Objetivos

- Aplicar conceitos de orientação a objetos:
  - Encapsulamento
  - Composição e agregação
  - Uso de classes e objetos
- Trabalhar com arrays de objetos
- Implementar interação com o usuário via terminal

---

## 🖥️ Funcionalidades

- Seleção de computadores por meio de um menu interativo
- Escolha entre três promoções disponíveis
- Adição de múltiplos computadores à compra
- Exibição das configurações de cada computador
- Cálculo do valor total da compra
- Processamento do pedido com mensagem final

---

## 💻 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- `Main` → Classe principal com interação com o usuário
- `Cliente` → Armazena dados do cliente e suas compras
- `Computador` → Representa um computador com seus componentes
- `HardwareBasico` → Representa CPU, RAM e HD
- `SistemaOperacional` → Define o sistema operacional do computador
- `MemoriaUSB` → Representa dispositivos adicionais (pen-drive ou HD externo)
- `ProcessarPedido` → Classe utilitária para finalização do pedido

---

## 🧩 Promoções Disponíveis

### Promoção 1
- Marca: Apple  
- Preço: R$ 152  
- Processador: Pentium Core i3 (2200 MHz)  
- Memória RAM: 8GB  
- HD: 500GB  
- Sistema Operacional: macOS Sequoia (64 bits)  
- Acompanha: Pen-drive de 16GB  

### Promoção 2
- Marca: Samsung  
- Preço: R$ 1386  
- Processador: Pentium Core i5 (3370 MHz)  
- Memória RAM: 16GB  
- HD: 1TB  
- Sistema Operacional: Windows 8 (64 bits)  
- Acompanha: Pen-drive de 32GB  

### Promoção 3
- Marca: Dell  
- Preço: R$ 5830  
- Processador: Pentium Core i7 (4500 MHz)  
- Memória RAM: 32GB  
- HD: 2TB  
- Sistema Operacional: Windows 10 (64 bits)  
- Acompanha: HD Externo de 1TB  

---

## ▶️ Como Executar

1. Abrir o projeto na IDE (IntelliJ, Eclipse, etc.)
2. Certificar-se de que a pasta `src` está configurada como **Source Root**
3. Executar a classe `Main`
4. Escolher as promoções desejadas via terminal
5. Digitar `0` para finalizar a compra

---

## 📌 Observações

- O sistema utiliza **arrays** para armazenamento dos objetos (sem uso de ArrayList)
- Todos os atributos das classes são **privados (encapsulamento)**
- Getters foram utilizados apenas quando necessário
- A classe `ProcessarPedido` foi implementada conforme solicitado no enunciado

---
## 🤖 Uso de Inteligência Artificial

Durante o desenvolvimento deste projeto, foi utilizada Inteligência Artificial (ChatGPT - GPT-5.3, OpenAI) como ferramenta de apoio para estruturação e revisão do código.

A IA auxiliou na aplicação dos conceitos de Programação Orientada a Objetos, organização das classes, correção de erros e validação dos requisitos do enunciado.

### 🧾 Prompt utilizado

Crie um projeto completo em Java utilizando Programação Orientada a Objetos, seguindo exatamente um enunciado. O sistema deve ser organizado em múltiplas classes, com código pronto para compilar e executar.

Requisitos:

* Utilizar o pacote br.inatel.cdg.poo.
* Criar todas as classes exigidas pelo enunciado.
* Usar construtores em todas as classes.
* Declarar todos os atributos como private.
* Criar getters e setters apenas quando realmente necessários.
* Não utilizar ArrayList nem bibliotecas prontas para coleções.
* Utilizar arrays quando necessário.
* Implementar a classe principal Main com interação via Scanner.
* Seguir exatamente as regras de negócio, nomes das classes, atributos, métodos e relacionamentos do diagrama UML que eu fornecer.
* Criar uma classe utilitária/helper, se o enunciado pedir.
* Entregar o código separado por arquivos, com o nome de cada classe.
* Garantir que o código esteja consistente com o pacote e com a estrutura de pastas.
* Explicar ao final os principais pontos do código e alertar sobre possíveis erros de execução na IDE.

Contexto do exercício:
<img width="905" height="453" alt="image" src="https://github.com/user-attachments/assets/e76fed58-0823-4305-b1c2-4556198d6001" />
<img width="917" height="360" alt="image" src="https://github.com/user-attachments/assets/811ba2be-6562-4d5c-8eee-ec52594b48e9" />


Diagrama UML:
<img width="902" height="595" alt="image" src="https://github.com/user-attachments/assets/2749840b-996f-42df-9c22-92c782f9fa33" />


Além da implementação, gostaria que você:

* Verificasse se o código atende completamente ao enunciado e ao diagrama.
* Apontasse possíveis erros ou problemas que poderiam ocorrer durante a execução.
* Explicasse brevemente as principais decisões tomadas na implementação.

### 📊 Resultado

O modelo utilizado foi o ChatGPT baseado no GPT-5.3 (OpenAI).

O resultado obtido foi satisfatório, pois o código gerado atendeu aos requisitos do enunciado, funcionando corretamente e seguindo os princípios de orientação a objetos.
