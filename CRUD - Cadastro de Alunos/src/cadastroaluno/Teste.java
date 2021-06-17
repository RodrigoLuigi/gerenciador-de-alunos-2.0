package cadastroaluno;

import javax.swing.JOptionPane;

public class Teste {

    private Aluno aluno;
    private float nota;
    private boolean aprovado;

    public void fazerTeste(Aluno alun) {
        this.setAluno(alun);
        this.nota = 0.0f;
        this.aprovado = false;
        System.out.println("____________________________________________________");
        System.out.println("#####Teste de Conhecimentos Gerais!##### \n"
                + "Aluno: " + this.aluno.getNome()
                + "/ Idade: " + this.aluno.getIdade()
                + "/ Turma: " + this.aluno.getTurma() + "\n");

        JOptionPane.showMessageDialog(null, "Teste de Conhecimentos Gerais!"
                + "\nAluno: " + this.aluno.getNome()
                + "\n Idade: " + this.aluno.getIdade()
                + "\n Turma: " + this.aluno.getTurma());
        System.out.println("-------------------------------------------");
        System.out.println("1 - Quanto é 9*9? \n a:64    b:76   c:81");

        Object[] options = {"A: 64 ", " B: 76 ", "C: 81"};
        int op = JOptionPane.showOptionDialog(null, "Quanto é 9*9?", "Teste de Conhecimentos Gerais!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        System.out.println("Opção " + (op + 1));

        if (op == 2) {
            this.nota += 5.0;
            this.aluno.setNota(this.getNota());
            System.out.println("Nota: 5.0 pts ");
        } else {
            this.nota += 0;
            this.aluno.setNota(this.getNota());
            System.out.println("Nota: 0.0 pts");
        }

        System.out.println("-------------------------------------------");
        System.out.println("2 - Quais os três pilares da P.O.O? \n a:PHP    b:HPP   c:EHP");

        Object[] options2 = {"A: PHP ", " B: HPP ", "C: EHP"};
        int op2 = JOptionPane.showOptionDialog(null, "Quais os três pilares da P.O.O?", "Teste de Conhecimentos Gerais!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options2, options2[0]);

        System.out.println("Opção " + (op2 + 1));

        if (op2 == 2) {
            this.nota += 5.0;
            this.aluno.setNota(this.getNota());
            System.out.println("Nota: 5.0 pts");
        } else {
            this.nota += 0;
            this.aluno.setNota(this.getNota());
            System.out.println("Nota: 0.0 pts");
        }

        System.out.println("-------------------------------------------");

        if (this.getNota() >= 5.0) {
            this.aprovado = true;
            this.aluno.setAprovado(true);
            System.out.println("O aluno " + this.aluno.getNome() + " passou no teste!!");
            System.out.println("NOTA FINAL: " + this.getNota());
            JOptionPane.showMessageDialog(null, "O(a) aluno(a) " + this.aluno.getNome() + " passou no teste!! "
                    + "\nNOTA FINAL: " + this.getNota());

        } else {
            System.out.println("NOTA FINAL: " + this.getNota());
            System.out.println(">> REPROVADO!! <<");
            JOptionPane.showMessageDialog(null, "REPROVADO!!");
        }
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
