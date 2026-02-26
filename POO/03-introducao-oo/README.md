# Introducao ao Paradigma da Orientacao a Objetos e a Linguagem Java

------------------------------------------------------------------------

## 1. Antes de tudo: o que e Java?

Java é um ecossistema

Para entender Java, precisamos entender dois elementos fundamentais:

-   JDK
-   JVM

### JDK (Java Development Kit)

E o kit de desenvolvimento. Contem compilador, bibliotecas e ferramentas
necessarias para criar programas em Java.

Sem JDK, voce nao desenvolve.

### JVM (Java Virtual Machine)

E a maquina virtual que executa o codigo Java.

O codigo nao roda direto no sistema operacional. Ele roda dentro da JVM.

Isso permite portabilidade.

Escreva uma vez. Execute em qualquer lugar.

Esse conceito explica por que Java esta presente em bilhoes de
dispositivos ao redor do mundo.

------------------------------------------------------------------------

## 2. Como a portabilidade funciona

Fluxo simplificado:

Codigo .java → Compilador (JDK) → Bytecode (.class) → JVM → Execucao

Cada sistema operacional possui sua propria JVM. O bytecode e o mesmo.

Por isso o mesmo programa pode rodar em Windows, Linux, Mac e outros
ambientes.

------------------------------------------------------------------------

## 3. O Paradigma da Orientacao a Objetos

Orientacao a Objetos é um paradigma de organização de sistemas.

Ela se baseia em representar o mundo atraves de:

-   Classes
-   Objetos
-   Atributos
-   Metodos

Esses termos precisam estar completamente claros.

Sem entender profundamente esses conceitos, nao ha evolucao consistente
em POO.

------------------------------------------------------------------------

## 4. Conceitos Fundamentais (Decoracao Obrigatoria)

### Classe

E um molde. Define estrutura e comportamento.

Exemplo:

Uma classe "Carro" define o que todo carro deve ter e fazer.

### Objeto

E a instancia de uma classe. E algo concreto criado a partir do molde, é o pedacinho da memória RAM dedicada a representação da classe.

Se "Carro" e a classe, "meuCarro" e um objeto.

### Atributo

E uma caracteristica da classe. Representa estado.

Exemplo:

cor ano modelo

### Metodo

E uma acao. Representa comportamento.

Exemplo:

acelerar() frear() ligar()

------------------------------------------------------------------------

## 5. Relacionando com Modelagem

No Banco de Dados falamos em:

-   Entidades
-   Relacionamentos

Na POO falamos em:

-   Classes
-   Associacoes

Ambos representam a mesma realidade. A diferenca esta na camada.

Banco organiza dados. POO organiza comportamento e regras de negócio.

------------------------------------------------------------------------

## 6. Primeiro Projeto: Hello World

Ferramentas utilizadas:

-   IDE: VSCode
-   Extensao: Extension Pack for Java (Microsoft)
-   JDK: versao 25

Passos realizados:

1.  Instalacao da JDK
2.  Instalacao da extensao Java no VSCode
3.  Criacao de um novo projeto Java
4.  Criacao da classe principal
5.  Execucao do programa

Exemplo de codigo:

``` java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

------------------------------------------------------------------------

## 7. Estrutura minima que precisa ser entendida (Palavras reservadas do Java)

public → modificador de acesso\
class → define uma classe\
static → pertence a classe\
void → nao retorna valor\
main → ponto de entrada do programa\
String\[\] args → parametros de execucao

Cada palavra tem significado tecnico. Nada esta ali por acaso.

------------------------------------------------------------------------

## 8. Mentalidade correta para aprender POO

1.  Entender profundamente os conceitos basicos.
2.  Praticar criando pequenas classes.
3.  Pensar sempre em responsabilidade.
4.  Separar estado de comportamento.
5.  Modelar antes de codificar.

------------------------------------------------------------------------

## 9. Conclusao

Orientacao a Objetos e a base para:

-   Desenvolvimento de sistemas
-   Arquitetura de software
-   Integracao com banco de dados
-   Aplicacoes empresariais

O aprendizado se direciona a formação do senso crítico em Programação Orientada a Objetos.

