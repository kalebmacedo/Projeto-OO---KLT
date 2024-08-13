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

## 🖥️ Exemplos de execução

### Imagens de funcionamento do programa:

| Menu Principal | Menu Aluno | Resultado de Cadastramento | Aluno Removido | Aluno Atualizado |
| :-----------------------------: | :------------: | :----------------------------: | :--------------------------: |:--------------------------: |
| ![Menu Principal](https://github.com/user-attachments/assets/82d63df1-eac7-4525-b720-e41b4585a865) | ![Menu Aluno](https://github.com/user-attachments/assets/d130e3f2-9cfe-4a8c-b3dc-a78863bf15ba) | ![Resultado Cadastro](https://github.com/user-attachments/assets/dfac3833-2722-400c-977b-6c3dea1e4f54) | ![Aluno removido](https://github.com/user-attachments/assets/56f75a5f-b7e7-43f2-8cd8-418d3b609b84) | ![Aluno Atualizado](https://github.com/user-attachments/assets/189a7091-836c-41ff-9404-29eddc5c3a76) |

| Menu Professor | Resultado do Cadastramento | Professor Removido | Professor Atualizado |
| :-----------------------------: | :------------: | :----------------------------: | :--------------------------: |
| ![Menu Professor](https://github.com/user-attachments/assets/805d3b26-80b0-44b5-947d-a85f1eaa05ec) | ![Resultado Cadastramento](https://github.com/user-attachments/assets/c0ea9698-771a-459f-896d-2e66b7f46dbd) | ![Professor Removido](https://github.com/user-attachments/assets/65595613-866c-48b7-b619-0613d150a9ab) | ![Professor Atualizado](https://github.com/user-attachments/assets/4a690d15-b3d6-432e-a574-57e594819219) |

| Menu Disciplina | Resultado do Cadastramento | Disciplina Removida | Disciplina Atualizada |
| :-----------------------------: | :------------: | :----------------------------: | :--------------------------: |
| ![Menu Disciplina](https://github.com/user-attachments/assets/e47dfed6-ce93-4892-ace4-c6ce36476abc) | ![Resultado Cadastramento](https://github.com/user-attachments/assets/21bcc60c-7dfa-4619-9385-2632c566361a) | ![Disciplina Removida](https://github.com/user-attachments/assets/ac079480-9721-4812-8f0c-6c4d9e323709) | ![Disciplina Atualizada](https://github.com/user-attachments/assets/64f64a39-61d1-4a62-8cff-684169c23f56) |

| Menu Turma | Resultado do Cadastramento | Turma Removida | Turma Atualizada | Aluno Adicionado | Chamada da Turma |
| :-----------------------------: | :------------: | :----------------------------: | :--------------------------: | :--------------------------: | :--------------------------: |
| ![Menu Turma](https://github.com/user-attachments/assets/9c9087ca-beb0-472c-99e7-064cc16757b4) | ![Resultado Cadastramento](https://github.com/user-attachments/assets/4dae1750-d654-4f00-ad3c-0776ad323343) | ![Turma Removida](https://github.com/user-attachments/assets/38f8c3de-7054-43b3-a14e-a58bce862221) | ![Turma Atualizada](https://github.com/user-attachments/assets/11828da9-0895-4fda-b315-b452d16a45f5) | ![Aluno Adicionado](https://github.com/user-attachments/assets/750a812b-6985-43fb-b335-ee03f35a2499) | ![Chamada da Turma](https://github.com/user-attachments/assets/2054ec07-e4ec-4773-b04f-fb3c9e1ce51d) |

| Exceção Campo em Branco | Exceção sem Professor | Exceção Sem Disciplina |
| :-----------------------------: | :------------: | :----------------------------: |
| ![Campo em Branco](https://github.com/user-attachments/assets/2544cb7c-fa38-4b5d-b6aa-888b31733549) | ![Sem Professor](https://github.com/user-attachments/assets/54f0fdc2-651b-4cdb-9fd7-f3a3ca5475e8) | ![Sem Disciplina](https://github.com/user-attachments/assets/70342811-33d4-4a53-9fe5-c48a5744f18f) |

***Tecnologias Utilizadas <br>
Java SE: Linguagem de programação principal. <br>
Swing: Para a criação da interface gráfica com JOptionPane. <br>
Coleções do Java: Uso de ArrayList para armazenar alunos, professores, disciplinas e turmas.*** <br>
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**UML do Projeto:** <br>
![Trabalho Final UML](https://github.com/user-attachments/assets/65ab2481-f1bf-4547-b8f7-e938afb156c4)
