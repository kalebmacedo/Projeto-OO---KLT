UnB - Universidade de Brasilia <br>
FGA - Faculdade do Gama <br>
OO - Orientação por Objetos <br>
Prof. André Luiz Peron Martins Lanna <br>

Trabalho Prático de Orientação por Objetos
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Componentes do Grupo:**
- Kaleb de Souza Macedo || 231026975
- Lucas Alves Oliveira dos Santos || 231027159
- Thiago Viriato Accioly || 231029340

**Sistema de Faculdade** <br>

**Descrição do Projeto** <br>
Este projeto em Java é uma simulação de um sistema de gerenciamento de uma faculdade. Ele permite a criação, consulta, atualização e remoção de registros de alunos, professores, disciplinas e turmas, além de realizar a chamada de alunos inscritos em uma turma específica. 

**Funcionalidades Principais**
1. Cadastro de Alunos <br>
-> Classe Aluno: Representa um aluno, contendo informações como nome, CPF, e-mail, matrícula e curso. <br>
-> Cadastro de Alunos: Utiliza a classe CadastroAluno para armazenar e gerenciar uma lista de alunos. <br>
-> Interface Gráfica: A classe MenuAluno oferece uma interface gráfica usando JOptionPane para cadastrar, pesquisar, atualizar e remover alunos. <br>
   
2. Cadastro de Professores <br>
-> Classe Professor: Representa um professor, contendo informações como nome, CPF, e-mail, área de formação e matrícula FUB. <br>
-> Cadastro de Professores: Utiliza a classe CadastroProfessor para gerenciar o cadastro de professores. <br>
-> Validação de Dados: A criação de um professor envolve a verificação de que nenhum campo essencial está em branco. <br>
   
3. Cadastro de Disciplinas <br>
-> Classe Disciplina: Representa uma disciplina, com nome e código. <br>
-> Cadastro de Disciplinas: A classe CadastroDisciplina gerencia as disciplinas, permitindo cadastrar, pesquisar, atualizar e remover registros. <br>
   
4. Gestão de Turmas <br>
-> Classe Turma: Representa uma turma, associando um professor e uma disciplina a um conjunto de alunos. <br>
-> Cadastro de Turmas: A classe CadastroTurma permite criar e gerenciar turmas, verificando se os campos obrigatórios foram preenchidos corretamente. <br>
-> Chamada de Alunos: A funcionalidade de chamada de alunos permite listar os alunos matriculados em uma turma em ordem alfabética, exibindo a matrícula e o nome de cada aluno, junto com a disciplina, a data e o professor responsável. <br>
   
5. Interface Principal <br>
-> Classe Principal: É o ponto de entrada do sistema. Utiliza menus para acessar as funcionalidades de cadastro e gestão de alunos, professores, disciplinas e turmas. <br>
-> Menu de Turmas: A classe MenuTurma permite ao usuário criar turmas, pesquisar, atualizar, remover turmas e adicionar alunos a elas. <br>
   
6. Tratamento de Exceções <br>
-> Exceções Personalizadas: O sistema inclui tratamento de exceções personalizadas, como CampoEmBrancoException, ProfessorNaoAtribuidoException, e DisciplinaNaoAtribuidaException, para garantir a consistência dos dados. <br>
   
**Exemplo de Uso** <br>
Durante a execução do programa, o usuário pode, por exemplo, criar uma nova turma atribuindo um professor e uma disciplina, adicionar alunos a essa turma, e realizar a chamada dos alunos em uma data específica. O resultado da chamada será exibido em uma janela gráfica, mostrando a lista de alunos em ordem alfabética com suas respectivas matrículas. <br>

**Imagens do Funcionamento:** <br>







***Tecnologias Utilizadas <br>
Java SE: Linguagem de programação principal. <br>
Swing: Para a criação da interface gráfica com JOptionPane. <br>
Coleções do Java: Uso de ArrayList para armazenar alunos, professores, disciplinas e turmas.*** <br>
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**UML do Projeto:** <br>
![Trabalho Final UML](https://github.com/user-attachments/assets/65ab2481-f1bf-4547-b8f7-e938afb156c4)
