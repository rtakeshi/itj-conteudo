# Introdução ao Paradigma da Orientação a Objetos e a Linguagem Java

------------------------------------------------------------------------

## 1. Antes de tudo: o que é Java?

Java é um ecossistema

Para entender Java, precisamos entender dois elementos fundamentais:

-   JDK
-   JVM

### JDK (Java Development Kit)

É o kit de desenvolvimento. Contém compilador, bibliotecas e ferramentas
necessárias para criar programas em Java.

Sem JDK, você não desenvolve.

### JVM (Java Virtual Machine)

É a máquina virtual que executa o código Java.

O código não roda direto no sistema operacional. Ele roda dentro da JVM.

Isso permite portabilidade.

Escreva uma vez. Execute em qualquer lugar.

Esse conceito explica por que Java está presente em bilhões de
dispositivos ao redor do mundo.

------------------------------------------------------------------------

## 2. Como a portabilidade funciona

Fluxo simplificado:

Código .java → Compilador (JDK) → Bytecode (.class) → JVM → Execução

Cada sistema operacional possui sua própria JVM. O bytecode é o mesmo.

Por isso o mesmo programa pode rodar em Windows, Linux, Mac e outros
ambientes.

------------------------------------------------------------------------

## 3. O Paradigma da Orientação a Objetos

Orientação a Objetos é um paradigma de organização de sistemas.

Ela se baseia em representar o mundo através de:

-   Classes
-   Objetos
-   Atributos
-   Métodos

Esses termos precisam estar completamente claros.

Sem entender profundamente esses conceitos, não há evolução consistente
em POO.

------------------------------------------------------------------------

## 4. Conceitos Fundamentais (Decoração Obrigatória)

### Classe

É um molde. Define estrutura e comportamento.

Exemplo:

Uma classe "Carro" define o que todo carro deve ter e fazer.

### Objeto

É a instância de uma classe. É algo concreto criado a partir do molde, é o pedacinho da memória RAM dedicada à representação da classe.

Se "Carro" é a classe, "meuCarro" é um objeto.

### Atributo

É uma característica da classe. Representa estado.

Exemplo:

cor ano modelo

### Método

É uma ação. Representa comportamento.

Exemplo:

acelerar() frear() ligar()

------------------------------------------------------------------------

## 5. Relacionando com Modelagem

No Banco de Dados falamos em:

-   Entidades
-   Relacionamentos

Na POO falamos em:

-   Classes
-   Associações

Ambos representam a mesma realidade. A diferença está na camada.

Banco organiza dados. POO organiza comportamento e regras de negócio.

------------------------------------------------------------------------

## 6. Primeiro Projeto: Hello World

Ferramentas utilizadas:

-   IDE: VSCode
-   Extensão: Extension Pack for Java (Microsoft)
-   JDK: versão 25

Passos realizados:

1.  Instalação da JDK
2.  Instalação da extensão Java no VSCode
3.  Criação de um novo projeto Java
4.  Criação da classe principal
5.  Execução do programa

Exemplo de código:

``` java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

------------------------------------------------------------------------

## 7. Estrutura mínima que precisa ser entendida (Palavras reservadas do Java)

public → modificador de acesso\
class → define uma classe\
static → pertence à classe\
void → não retorna valor\
main → ponto de entrada do programa\
String\[\] args → parâmetros de execução

Cada palavra tem significado técnico. Nada está ali por acaso.

------------------------------------------------------------------------

## 8. Mentalidade correta para aprender POO

1.  Entender profundamente os conceitos básicos.
2.  Praticar criando pequenas classes.
3.  Pensar sempre em responsabilidade.
4.  Separar estado de comportamento.
5.  Modelar antes de codificar.

------------------------------------------------------------------------

## 9. Conclusão

Orientação a Objetos é a base para:

-   Desenvolvimento de sistemas
-   Arquitetura de software
-   Integração com banco de dados
-   Aplicações empresariais

O aprendizado se direciona à formação do senso crítico em Programação Orientada a Objetos.
