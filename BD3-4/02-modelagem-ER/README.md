# Modelagem Entidade-Relacionamento

## Pensamento Relacional e Visão Sistêmica

------------------------------------------------------------------------

## 1. Muito além do Banco de Dados

Modelagem Entidade-Relacionamento (MER) não é apenas uma técnica para
criar tabelas. Ela é uma forma de estruturar o pensamento.

Quando modelamos, estamos perguntando:

-   O que existe nesse contexto?
-   Como essas coisas se relacionam?
-   Quais regras organizam essas relações?
-   Onde estão os limites e responsabilidades?

Um sistema não é apenas um conjunto de coisas. É um conjunto de relações
organizadas.

Isso é visão sistêmica.

------------------------------------------------------------------------

## 2. Pensamento Relacional

Pensar de forma relacional significa:

-   Identificar entidades
-   Entender dependências
-   Definir papéis
-   Separar responsabilidades
-   Enxergar regras do negócio

### Exemplo: Escola

-   Aluno
-   Professor
-   Disciplina
-   Turma
-   Coordenação

Aluno pertence a uma turma.\
Professor leciona uma disciplina.\
Disciplina está associada a uma turma.

Sem relações, só existem elementos isolados.

------------------------------------------------------------------------

## 3. Entidade

Uma entidade representa algo do mundo real que:

-   Possui identidade própria
-   Pode ser distinguido de outros
-   Possui atributos

### Exemplo

    Aluno
    - id
    - nome
    - email

    Professor
    - id
    - nome
    - formacao

------------------------------------------------------------------------

## 4. Relacionamento

Relacionamento é a ligação lógica entre entidades.

Exemplo:

  Turma (1) ------ (N) Aluno

-   Um aluno pode estar vinculado somente a uma turma (3ªA).
-   A turma 3ªA contém N alunos.

------------------------------------------------------------------------

# Exemplo Pratico: Sistema Educacional com Roles

## Entidade: Role

    Role
    - id
    - nome

Exemplos:

-   1 → Aluno
-   2 → Professor
-   3 → Admin

------------------------------------------------------------------------

## Entidade: User

    User
    - id
    - nome
    - email
    - role_id (FK)

------------------------------------------------------------------------

## Relacao 1:N

Role (1) -------- (N) User

-   Uma role pode ter varios usuarios.
-   Um usuario possui apenas uma role (modelo simplificado).

------------------------------------------------------------------------

# Conexao com Programacao Orientada a Objetos (Java)

## No Banco de Dados

-   Tabela roles
-   Tabela users
-   Chave estrangeira role_id

## Em Java

``` java
public class Role {
    private int id;
    private String nome;
}

public class User {
    private int id;
    private String nome;
    private String email;
    private Role role;
}
```

O banco modela a estrutura relacional. A POO modela a estrutura
comportamental.

MER organiza dados. POO organiza responsabilidades e comportamentos.

Ambos representam a mesma realidade em camadas diferentes.

------------------------------------------------------------------------

# Pensamento Sistemico Aplicado

Ao modelar um sistema, pergunte:

1.  Qual e o dominio do problema (games, educação, economia, saúde)?
2.  Quais sao as entidades principais?
3.  Como elas se conectam?
4.  Qual e a cardinalidade dessas relacoes (1:1, 1:N, N;N)?
5.  Quais regras existem nessas conexoes?

------------------------------------------------------------------------

## Evolucao do Modelo

E se um usuario puder ter mais de uma role?

Agora o modelo muda:

User (N) ------ (N) Role

Sera necessario criar uma tabela intermediaria:

    user_role
    - user_id
    - role_id

Isso e pensamento sistemico. Mudou a regra, muda o modelo.

------------------------------------------------------------------------

# Conexao com o que ja foi visto no curso

No segundo ano, foram estudados:

-   Modelo entidade-relacionamento
-   Modelo relacional
-   Projeto conceitual e logico
-   Primary Key e Foreign Key
-   SQL basico

Agora o foco e elevar o nivel:

Antes: criar tabelas.\
Agora: estruturar sistemas coerentes.

------------------------------------------------------------------------

# Conclusao

Modelagem Entidade-Relacionamento é:

-   Organizacao logica
-   Estruturacao de pensamento
-   Base para banco de dados
-   Base para orientacao a objetos
-   Base para arquitetura de sistemas

Modelagem Entidade Relacionamento (MER) vai além do desenho técnico. É uma forma estruturada de pensar problemas
complexos.
