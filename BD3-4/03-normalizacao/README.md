# Normalização e Formas Normais

## 1. Contexto Histórico da Normalização

Nos primórdios da computação, o armazenamento de dados era um recurso
extremamente caro. Discos rígidos tinham pouca capacidade e sistemas de
banco de dados precisavam ser projetados com grande eficiência para
evitar desperdício de espaço.

Durante as décadas de 1960 e 1970, pesquisadores começaram a estudar
formas de organizar dados de maneira mais eficiente. Um dos principais
nomes nesse processo foi Edgar F. Codd, criador do modelo relacional de
banco de dados.

A partir desses estudos surgiu o conceito de normalização, um conjunto
de regras utilizadas para organizar os dados em tabelas de forma que:

-   haja menos redundância
-   se evitem inconsistências
-   os dados possam ser mantidos e atualizados com segurança

Na época, o objetivo principal era economizar espaço de armazenamento e
evitar duplicação de dados, pois hardware era caro e limitado.

Hoje a realidade é diferente. Armazenamento é relativamente barato e
abundante. Mesmo assim, os princípios de normalização continuam sendo
importantes porque ajudam a:

-   manter a consistência dos dados
-   evitar anomalias de inserção, atualização e exclusão
-   melhorar a organização lógica do banco de dados

Em muitos cenários modernos, principalmente em Data Warehouses e
análises de dados, é comum utilizar modelos menos normalizados (como
modelagem dimensional). Ainda assim, entender normalização continua
sendo essencial para o projeto de sistemas transacionais.

------------------------------------------------------------------------

# O que é Normalização

Normalização é o processo de organizar dados em tabelas de forma
estruturada, dividindo informações em entidades relacionadas para
reduzir redundância e melhorar a integridade dos dados.

Esse processo é guiado por um conjunto de regras chamadas Formas
Normais.

Cada forma normal define um conjunto de critérios que a estrutura de
dados deve respeitar.

------------------------------------------------------------------------

# Problema da Redundância

Considere uma tabela mal estruturada:

Tabela: Pedidos

  PedidoID   ClienteNome   ClienteTelefone   Produto   Preço
  ---------- ------------- ----------------- --------- -------
  1          João          1199999           Mouse     50
  2          João          1199999           Teclado   120
  3          Maria         1188888           Monitor   900

Problemas dessa estrutura:

-   Redundância: dados do cliente repetidos várias vezes
-   Atualização difícil: se o telefone mudar, deve ser alterado em
    várias linhas
-   Risco de inconsistência

Exemplo de solução:

Tabela Clientes

  ClienteID   Nome    Telefone
  ----------- ------- ----------
  1           João    1199999
  2           Maria   1188888

Tabela Pedidos

  PedidoID   ClienteID   Produto   Preço
  ---------- ----------- --------- -------
  1          1           Mouse     50
  2          1           Teclado   120
  3          2           Monitor   900

Agora os dados ficam organizados e relacionados.

------------------------------------------------------------------------

# Formas Normais

As formas normais são níveis progressivos de organização dos dados.

As mais utilizadas são:

-   Primeira Forma Normal (1FN)
-   Segunda Forma Normal (2FN)
-   Terceira Forma Normal (3FN)

Existem formas adicionais (BCNF, 4FN, 5FN), mas geralmente não são
necessárias na maioria dos sistemas.

------------------------------------------------------------------------

# Primeira Forma Normal (1FN)

A Primeira Forma Normal estabelece que:

1.  Cada campo deve possuir valores atômicos
2.  Não devem existir listas ou grupos repetidos
3.  Cada coluna deve representar um único tipo de informação

Tabela não normalizada:

  AlunoID   Nome   Telefones
  --------- ------ ------------
  1         Ana    1111, 2222

Problema:

O campo telefone contém mais de um valor.

Tabela corrigida:

Tabela Alunos

  AlunoID   Nome
  --------- ------
  1         Ana

Tabela Telefones

  TelefoneID   AlunoID   Telefone
  ------------ --------- ----------
  1            1         1111
  2            1         2222

Agora cada campo contém apenas um valor por célula.

------------------------------------------------------------------------

# Segunda Forma Normal (2FN)

Para estar na Segunda Forma Normal, a tabela deve:

1.  Estar na Primeira Forma Normal
2.  Todos os atributos devem depender totalmente da chave primária

Isso significa que não pode existir dependência parcial da chave.

Exemplo:

Tabela Matrículas

  AlunoID   DisciplinaID   NomeAluno   NomeDisciplina   Nota
  --------- -------------- ----------- ---------------- ------

Chave primária composta:

AlunoID + DisciplinaID

Problema:

-   NomeAluno depende apenas de AlunoID
-   NomeDisciplina depende apenas de DisciplinaID

Solução:

Tabela Alunos

| AlunoID \| NomeAluno \|

Tabela Disciplinas

| DisciplinaID \| NomeDisciplina \|

Tabela Matrículas

| AlunoID \| DisciplinaID \| Nota \|

Agora cada atributo depende da chave correta.

------------------------------------------------------------------------

# Terceira Forma Normal (3FN)

Para estar na Terceira Forma Normal, a tabela deve:

1.  Estar na Segunda Forma Normal
2.  Não possuir dependências transitivas

Dependência transitiva ocorre quando um atributo depende de outro
atributo que não é chave.

Exemplo:

Tabela Funcionários

  FuncionarioID   Nome   Departamento   GerenteDepartamento
  --------------- ------ -------------- ---------------------

Problema:

FuncionarioID → Departamento\
Departamento → GerenteDepartamento

Logo:

FuncionarioID → GerenteDepartamento (dependência transitiva)

Solução:

Tabela Departamentos

| DepartamentoID \| NomeDepartamento \| Gerente \|

Tabela Funcionários

| FuncionarioID \| Nome \| DepartamentoID \|

Assim cada informação fica armazenada apenas uma vez.

------------------------------------------------------------------------

# Anomalias de Banco de Dados

A normalização evita três tipos de problemas conhecidos como anomalias.

## Anomalia de Inserção

Não é possível inserir um dado sem inserir outro.

Exemplo: não conseguir cadastrar um cliente sem um pedido.

## Anomalia de Atualização

O mesmo dado precisa ser alterado em vários lugares.

Exemplo: atualizar o telefone de um cliente em várias linhas.

## Anomalia de Exclusão

Ao remover um registro, outras informações importantes são perdidas.

Exemplo: excluir um pedido e perder os dados do cliente.

------------------------------------------------------------------------

# Normalização no Contexto Atual

Em sistemas transacionais (OLTP), como:

-   sistemas bancários
-   ERPs
-   sistemas web
-   sistemas de cadastro

é comum utilizar até a Terceira Forma Normal (3FN) para garantir
integridade dos dados.

Por outro lado, em ambientes de análise de dados (Data Warehouses) é
comum utilizar modelos menos normalizados, como:

-   modelagem dimensional
-   Star Schema
-   Snowflake Schema

Nesses casos, a redundância é aceita porque melhora a performance de
leitura e análise.

Muitas vezes, nesses ambientes, o modelo fica próximo da Segunda Forma
Normal, equilibrando organização e performance.

------------------------------------------------------------------------

# Conclusão

A normalização é um dos conceitos fundamentais do projeto de bancos de
dados relacionais.

Mesmo em um cenário onde armazenamento é barato e tecnologias evoluíram,
a normalização continua sendo uma ferramenta essencial para:

-   organizar dados
-   evitar redundâncias
-   garantir consistência
-   facilitar manutenção de sistemas

Compreender as formas normais permite projetar bancos de dados mais
robustos e preparados para crescer junto com as aplicações.
