# Sistema de Controle de Versão (git)
Foi dado em sala!

## Introdução rápida

Git é um sistema de controle de versão distribuído usado para registrar mudanças em arquivos e coordenar trabalho entre várias pessoas. Ele permite histórico completo do projeto, ramificações (branches) leves, fusões (merges) e colaboração offline antes de enviar alterações para um repositório remoto.

## Provedores populares

- **GitHub**: Plataforma social de hospedagem de repositórios Git com pull requests, revisão de código, GitHub Actions (CI/CD) e ampla integração com ferramentas de desenvolvimento. Muito utilizada para projetos open source.
- **GitLab**: Oferece hospedagem Git com CI/CD integrado, pipelines poderosos e opção de self-hosting (instalar no próprio servidor). Tem foco em DevOps e ciclo completo de entrega.
- **Bitbucket**: Plataforma da Atlassian que integra bem com Jira e outros produtos Atlassian; oferece Bitbucket Pipelines para CI/CD e suporte a repositórios privados voltados para equipes.

## Comandos essenciais

- `git init`: Inicializa um novo repositório Git local.
- `git clone <url>`: Clona um repositório remoto para o ambiente local.
- `git status`: Mostra o estado atual do diretório de trabalho e a área de stage.
- `git add <arquivo>`: Adiciona arquivos à área de stage para o próximo commit.
- `git commit -m "mensagem"`: Cria um commit com as mudanças staged e uma mensagem descritiva.
- `git log`: Exibe o histórico de commits.
- `git diff`: Mostra diferenças entre commits, branches, ou entre working tree e stage.
- `git branch`: Lista branches locais ou cria uma nova (`git branch <nome>`).
- `git checkout <branch>`: Muda para a branch especificada (ou `git checkout -b <novo>` para criar e mudar).
- `git switch <branch>`: Alternativa moderna a `checkout` para trocar de branch.
- `git merge <branch>`: Une outra branch na branch atual.
- `git rebase <branch>`: Reaplica commits em cima de outra base — usado para histórico mais linear.
- `git remote add origin <url>`: Adiciona um repositório remoto chamado `origin`.
- `git fetch`: Baixa objetos e refs do remoto sem mesclar automaticamente.
- `git pull`: `fetch` + `merge` — atualiza a branch local com mudanças do remoto.
- `git push`: Envia commits locais para o repositório remoto.
- `git stash`: Salva temporariamente mudanças não commitadas e limpa o working tree.
- `git reset --soft|--mixed|--hard <commit>`: Move o ponteiro de branch e opcionalmente altera stage/working tree (cuidado com `--hard`).
- `git revert <commit>`: Cria um novo commit que desfaz as alterações de um commit anterior (mais seguro que reset para histórico compartilhado).
- `git tag <nome>`: Marca um ponto no histórico (útil para versões/releases).
- `git config --global user.name "Nome"` e `git config --global user.email "email@ex.com"`: Configura usuário para commits.


