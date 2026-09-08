# Boas Práticas e Controle de Versão

## Sobre o projeto

Este projeto foi desenvolvido para a atividade prática da disciplina **Manutenção e Configuração de Software**. O objetivo é demonstrar a melhoria de um código Java inicialmente funcional, mas com problemas de organização, legibilidade e manutenção, utilizando boas práticas de programação e Git/GitHub.

## Estrutura do projeto

```text
boas-praticas-software/
├── src/
│   └── Sistema.java
└── README.md
```

## Como executar

1. Tenha o Java JDK instalado.
2. Abra um terminal na pasta do projeto.
3. Compile o arquivo:

```bash
javac src/Sistema.java
```

4. Execute:

```bash
java -cp src Sistema
```

## 1. Qual era o principal problema do código original?

O código original funcionava, porém utilizava nomes pouco descritivos, como `n`, `a`, `b` e `c`, concentrava todas as responsabilidades dentro do método `main` e apresentava pouca organização. Isso dificultava a leitura, a compreensão e futuras alterações no sistema.

## 2. Quais melhorias foram realizadas?

Foram realizadas as seguintes melhorias:

- Substituição de nomes genéricos por nomes descritivos, como `nomeAluno`, `primeiraNota`, `segundaNota` e `media`.
- Separação das responsabilidades em métodos específicos.
- Criação do método `calcularMedia()` para realizar o cálculo da média.
- Criação do método `verificarSituacao()` para determinar se o aluno foi aprovado ou reprovado.
- Criação do método `apresentarResultado()` para exibir os resultados.
- Organização da indentação e da estrutura do código.
- Redução da necessidade de comentários, utilizando código autoexplicativo.

## 3. Como a modularização ajudou?

A modularização dividiu o sistema em pequenas responsabilidades. Cada método passou a realizar uma tarefa específica, tornando o código mais fácil de entender, testar, manter e modificar. Por exemplo, uma alteração na regra de cálculo da média pode ser feita diretamente no método `calcularMedia()` sem precisar alterar toda a lógica do programa.

## 4. Como o Git ajudou no controle das mudanças?

O Git permitiu registrar a evolução do projeto de forma organizada. Primeiro foi armazenada a versão original do sistema na branch `main`. Em seguida, foi criada a branch `melhoria-boas-praticas`, onde as alterações foram realizadas e registradas em um novo commit.

Dessa forma, é possível comparar a versão original com a versão aprimorada, identificar quais alterações foram realizadas e manter um histórico das mudanças. O GitHub também permite utilizar um Pull Request para revisar as melhorias antes de incorporá-las à branch principal.

## Histórico da atividade

- **Versão inicial:** código original disponibilizado para a atividade.
- **Branch de melhoria:** `melhoria-boas-praticas`.
- **Melhoria:** aplicação de boas práticas de nomenclatura, organização e modularização.
- **Próxima etapa:** Pull Request da branch `melhoria-boas-praticas` para `main` e merge após a revisão.
