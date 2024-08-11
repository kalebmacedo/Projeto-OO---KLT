UnB - Universidade de Brasilia
FGA - Faculdade do Gama
OO - Orientação por Objetos
Prof. André Luiz Peron Martins Lanna

Trabalho Prático de Orientação por Objetos
--------------------------------------------------------------------------------------------------------------------------------------------------
**Componentes do Grupo:**
- Kaleb de Souza Macedo || 231026975
- Lucas Alves Oliveira dos Santos || 231027159
- Thiago Viriato Accioly || 231029340

**Sistema de Faculdade**
Descrição do Projeto
Este projeto em Java é uma simulação de um sistema de gerenciamento de uma faculdade. Ele permite a criação, consulta, atualização e remoção de registros de alunos, professores, disciplinas e turmas, além de realizar a chamada de alunos inscritos em uma turma específica.

Funcionalidades Principais
1. Cadastro de Alunos
-> Classe Aluno: Representa um aluno, contendo informações como nome, CPF, e-mail, matrícula e curso. \n
-> Cadastro de Alunos: Utiliza a classe CadastroAluno para armazenar e gerenciar uma lista de alunos.
-> Interface Gráfica: A classe MenuAluno oferece uma interface gráfica usando JOptionPane para cadastrar, pesquisar, atualizar e remover alunos.
   
2. Cadastro de Professores
-> Classe Professor: Representa um professor, contendo informações como nome, CPF, e-mail, área de formação e matrícula FUB.
-> Cadastro de Professores: Utiliza a classe CadastroProfessor para gerenciar o cadastro de professores.
-> Validação de Dados: A criação de um professor envolve a verificação de que nenhum campo essencial está em branco.
   
3. Cadastro de Disciplinas
-> Classe Disciplina: Representa uma disciplina, com nome e código.
-> Cadastro de Disciplinas: A classe CadastroDisciplina gerencia as disciplinas, permitindo cadastrar, pesquisar, atualizar e remover registros.
   
4. Gestão de Turmas
-> Classe Turma: Representa uma turma, associando um professor e uma disciplina a um conjunto de alunos.
-> Cadastro de Turmas: A classe CadastroTurma permite criar e gerenciar turmas, verificando se os campos obrigatórios foram preenchidos corretamente.
-> Chamada de Alunos: A funcionalidade de chamada de alunos permite listar os alunos matriculados em uma turma em ordem alfabética, exibindo a matrícula e o nome de cada aluno, junto com a disciplina, a data e o professor responsável.
   
5. Interface Principal
-> Classe Principal: É o ponto de entrada do sistema. Utiliza menus para acessar as funcionalidades de cadastro e gestão de alunos, professores, disciplinas e turmas.
-> Menu de Turmas: A classe MenuTurma permite ao usuário criar turmas, pesquisar, atualizar, remover turmas e adicionar alunos a elas.
   
6. Tratamento de Exceções
-> Exceções Personalizadas: O sistema inclui tratamento de exceções personalizadas, como CampoEmBrancoException, ProfessorNaoAtribuidoException, e DisciplinaNaoAtribuidaException, para garantir a consistência dos dados.
   
**Exemplo de Uso**
-> Durante a execução do programa, o usuário pode, por exemplo, criar uma nova turma atribuindo um professor e uma disciplina, adicionar alunos a essa turma, e realizar a chamada dos alunos em uma data específica. O resultado da chamada será exibido em uma janela gráfica, mostrando a lista de alunos em ordem alfabética com suas respectivas matrículas.

***Tecnologias Utilizadas
Java SE: Linguagem de programação principal.
Swing: Para a criação da interface gráfica com JOptionPane.
Coleções do Java: Uso de ArrayList para armazenar alunos, professores, disciplinas e turmas.***

**UML do Projeto:**
![Trabalho Final UML](https://github.com/user-attachments/assets/65ab2481-f1bf-4547-b8f7-e938afb156c4)
