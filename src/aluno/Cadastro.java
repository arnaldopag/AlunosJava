package aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public final class Cadastro {
    private static List<Pessoas> listaPessoas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void CadastroAluno() throws ParseException {
            System.out.print("Codigo Aluno: ");
            int codAluno = sc.nextInt();
            while (VerificaId(listaPessoas, codAluno)) {
                System.out.print("Código existente, digite outro: ");
                codAluno = sc.nextInt();
            }
            System.out.print("Nome Aluno: ");
            String nome = sc.next();
            System.out.print("Data Nascimento: ");
            String dataNascimentoString = sc.next();
            System.out.print("Fone Aluno: ");
            String fone = sc.next();
            System.out.print("Cpf Aluno: ");
            String cpf = sc.next();
            System.out.print("Email Aluno: ");
            String email = sc.next();
            Date dataNascimentoDate = new SimpleDateFormat("dd/MM/yyy").parse(dataNascimentoString);
            Aluno novoAluno = new Aluno(codAluno, nome, dataNascimentoDate, fone, cpf, email);
            listaPessoas.add(novoAluno);
        }
        public static void CadastroProfessor() throws ParseException {
            System.out.print("Codigo Professor: ");
            int codProfessor = sc.nextInt();
            while (VerificaId(listaPessoas, codProfessor)) {
                System.out.print("Código existente, digite outro: ");
                codProfessor = sc.nextInt();
            }
            System.out.print("Nome Professor: ");
            String nome = sc.next();
            System.out.print("Data Nascimento: ");
            String dataNascimentoString = sc.next();
            System.out.print("Fone: ");
            String fone = sc.next();
            System.out.print("Cpf: ");
            String cpf = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.println("Data de admissão: ");
            String dataAdmissaoString = sc.next();
            System.out.println("Titulação: ");
            String titulacao = sc.next();
            Date dataNascimentoDate = new SimpleDateFormat("dd/MM/yyy").parse(dataNascimentoString);
            Date dataAdmissao = new SimpleDateFormat("dd/MM/yyy").parse(dataAdmissaoString);

            Professor novoProfessor = new Professor(codProfessor,nome,dataNascimentoDate,fone,cpf,email,dataAdmissao,titulacao);
            listaPessoas.add(novoProfessor);
        }

     public static boolean VerificaId(List<Pessoas> list, int cod) {
        Pessoas testePessoa = list.stream().filter(x -> x.getIdPessoa() == cod).findFirst().orElse(null);
        return testePessoa != null;
    }
}


