# Sistema de Votação de Candidatos

## Objetivo
Criar um sistema simples de votação onde usuários podem cadastrar candidatos e votar neles.

## Tecnologia Usada
- Java

## Estrutura do Projeto

### Classes Utilizadas
- **Candidato**: Representa um candidato com atributos para número, nome e votos.
- **TesteCandidato**: Classe principal que gerencia a interação com o usuário.

### Classe Candidato
- **Atributos**:
  - `private int numero`: Número do candidato.
  - `private String nome`: Nome do candidato.
  - `private int votos`: Quantidade de votos.
  
- **Métodos**:
  - `incrementarVotos()`: Incrementa o total de votos.
  - `getNumero()`: Retorna o número do candidato.
  - `getNome()`: Retorna o nome do candidato.
  - `getVotos()`: Retorna o total de votos.

### Classe TesteCandidato
- **Funcionalidades**:
  - Cadastrar vários candidatos.
  - Permitir que o usuário vote em candidatos cadastrados.
  - Exibir resultados ao final da votação.
  
- **Fluxo**:
  1. Pergunta quantos candidatos cadastrar.
  2. Solicita número e nome para cada candidato.
  3. Permite a adição de votos.
  4. Exibe o total de votos para cada candidato.

## Demonstração
- **Capturas de Tela do Programa**:
  - Cadastro de candidatos.
  - Processo de votação.
  - Resultados exibidos.

## Resultados
- **Exemplo de Resultado**:
  - Número: 1 - Nome: Ana - Total de votos: 2
  - Número: 2 - Nome: Maria - Total de votos: 5
  - Número: 3 - Nome: Micael - Total de votos: 3

## Conclusão
- **Resultados Obtidos**: 
  - Sistema funcional para cadastro de candidatos e votação.
  - Experiência prática em programação orientada a objetos em Java.
  
- **Próximos Passos**: Manutenção do sistema conforme necessidade, sem planos imediatos de evolução.

## Perguntas
- Espaço para perguntas e discussão.
