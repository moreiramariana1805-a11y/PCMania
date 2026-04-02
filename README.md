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

Este projeto contou com o apoio de ferramentas de Inteligência Artificial (ChatGPT) para:
- Esclarecimento de dúvidas conceituais
- Revisão de código
- Sugestões de melhorias estruturais

Todo o código foi compreendido e validado manualmente.

---

## 📎 Prompt utilizado
Crie um projeto em Java completo, orientado a objetos, seguindo exatamente um enunciado de exercício acadêmico. O sistema deve ser organizado em múltiplas classes, com código pronto para compilar e executar.

Requisitos:

* Utilizar pacote definido por mim.
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

---

Dados específicos:
Nome do aluno: Mariana Moreira Souza
Matrícula: 152
Curso: Engenharia de Produção
