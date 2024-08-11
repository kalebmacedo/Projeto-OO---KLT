package principal;

import javax.swing.JOptionPane;
import cadastros.*;
import view.*;

public class Principal {

    static CadastroAluno cadAluno;
    static CadastroProfessores cadProfessor;
    static CadastroDisciplina cadDisciplina;
    static CadastroTurma cadTurma;

    public static void main(String[] args) {
        cadAluno = new CadastroAluno();
        cadProfessor = new CadastroProfessores();
        cadDisciplina = new CadastroDisciplina();
        cadTurma = new CadastroTurma();    

        int opcao = 0; 

        do {
            opcao = MenuPrincipal.menuOpcoes(); 
            switch (opcao) {
                case 1: 
                    MenuAluno.menuAluno(cadAluno); 
                    break;
                case 2: 
                    MenuProfessor.menuProfessor(cadProfessor);
                    break;
                case 3: 
                    MenuDisciplina.menuDisciplina(cadDisciplina);
                    break;
                case 4: 
                    MenuTurma.menuTurma(cadTurma, cadAluno, cadProfessor, cadDisciplina);
                    break;
                case 0: 
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    opcao = -1;
                    break;
            }
        } while (opcao != 0);
    }
}
