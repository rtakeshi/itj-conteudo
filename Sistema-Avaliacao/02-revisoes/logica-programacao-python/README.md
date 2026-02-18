# Aulão de Revisão -- Fundamentos até Funções (Python)

## Contexto

Turma do 3º ano do Técnico em Informática.\
Sala com nível heterogêneo.\
Objetivo: sair do básico de lógica e chegar ao entendimento sólido de
funções como preparação para Programação Orientada a Objetos.

------------------------------------------------------------------------

# Objetivo Geral

Levar o aluno de:

> Execução linear e confusa de código

Para:

> Organização de lógica através de funções, preparando a transição para
> métodos e classes.

------------------------------------------------------------------------

# Estrutura Geral (3 Aulas)

-   Aula 1 -- Fundamentos da programação em Python
-   Aula 2 -- Funções e organização de código
-   Aula 3 -- Ponte para Programação Orientada a Objetos

------------------------------------------------------------------------

# Aula 1 -- Fundamentos em Python

## Objetivos

-   Revisar lógica de programação
-   Trabalhar variáveis e tipos
-   Trabalhar entrada e saída
-   Aplicar estruturas condicionais
-   Aplicar estruturas de repetição

------------------------------------------------------------------------

## 1. O que é um programa?

Programa é uma sequência de instruções executadas de cima para baixo.

------------------------------------------------------------------------

## 2. Variáveis e Tipos

``` python
nome = "Maria"
idade = 17
altura = 1.65
aprovado = True
```

------------------------------------------------------------------------

## 3. Entrada e Saída

``` python
nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))
print("Olá", nome)
```

------------------------------------------------------------------------

## 4. Estruturas Condicionais

``` python
if idade >= 18:
    print("Maior de idade")
else:
    print("Menor de idade")
```

------------------------------------------------------------------------

## 5. Estruturas de Repetição

``` python
for i in range(1, 6):
    print(i)
```

------------------------------------------------------------------------

# Aula 2 -- Funções

## O que é uma função?

Função é um bloco de código que executa uma tarefa específica.

------------------------------------------------------------------------

## Função Simples

``` python
def mensagem():
    print("Olá mundo")

mensagem()
```

------------------------------------------------------------------------

## Função com Parâmetro

``` python
def saudacao(nome):
    print("Olá,", nome)
```

------------------------------------------------------------------------

## Função com Retorno

``` python
def soma(a, b):
    return a + b

resultado = soma(5, 3)
print(resultado)
```

------------------------------------------------------------------------

## Exemplo Aplicado -- Média

``` python
def calcular_media(n1, n2):
    return (n1 + n2) / 2
```

------------------------------------------------------------------------

# Aula 3 -- Ponte para Programação Orientada a Objetos

## Criando Primeira Classe

``` python
class Aluno:

    def __init__(self, nome, nota1, nota2):
        self.nome = nome
        self.nota1 = nota1
        self.nota2 = nota2

    def calcular_media(self):
        return (self.nota1 + self.nota2) / 2
```

## Criando Objeto

``` python
aluno1 = Aluno("João", 7, 8)
media = aluno1.calcular_media()
print("Média:", media)
```

------------------------------------------------------------------------

# Resumo Final

| Conceito | Definição |
|----------|-----------|
| Variável | Armazena dados |
| Função | Organiza comportamento |
| Classe | Organiza dados e comportamentos |
| Método | Função dentro da classe |
| Objeto | Instância de uma classe |

# Resultado Esperado

-   Entender execução sequencial
-   Criar estruturas condicionais e laços
-   Criar funções com parâmetros e retorno
-   Entender base conceitual para POO
