package aluno;

import aluno.Models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public final class Cadastro {
    private static List<Pessoas> listaPessoas = new ArrayList<>();
    private static ArrayList<Disciplinas> listaDisciplinas = new ArrayList<>();
    private static ArrayList<Boletim> listaNotas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static String ocupacaoProfessor = "Professor";
    private static String ocupacaoAluno = "Aluno";

    public static void Menu() throws ParseException {
        int opcao = 0;
        System.out.println("Digite a opcao desejada");
        System.out.println("1 - Cadasto Professor");
        System.out.println("2 - Cadasto Aluno");
        System.out.println("3 - Cadasto Disciplinas");
        System.out.println("4 - Cadasto Notas");
        if (opcao == 1){
            CadastroProfessor();
        }else if(opcao == 2){
            CadastroAluno();
        }else if (opcao == 3){
            CadastroMaterias();
        }else if(opcao ==4){
            CadastroNotas();
        }else{
            System.out.println("Opcao invalida!!!");
        }
    }
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
        Aluno novoAluno = new Aluno(codAluno, nome, dataNascimentoDate, fone, cpf, email, ocupacaoAluno, listaDisciplinas);
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
        Professor novoProfessor = new Professor(codProfessor, nome, dataNascimentoDate, fone, cpf, email, ocupacaoProfessor, dataAdmissao, titulacao);
        listaPessoas.add(novoProfessor);
    }

    public static String CadastroMaterias() {
        System.out.println("Digite seu Código: ");
        int idProfessor = sc.nextInt();

        if (listaPessoas.isEmpty() && VerificaOcupacao(listaPessoas, idProfessor)) {
            String retorno = "=====ERRO=====/n";
            retorno += "Nenhum Professor Cadastrado ou /n";
            retorno += "Apenas professores podem Cadastrar Disciplinas/n";
            retorno += "================================================";
            return retorno;
        }


        System.out.print("Codigo da Disciplina: ");
        int codDisiplina = sc.nextInt();
        System.out.print("Nome da disciplina: ");
        String nomeDisciplina = sc.next();
        System.out.print("Quantidade de turmas Ofertadas: ");
        int qtdTurmas = sc.nextInt();
        Disciplinas novaDisciplina = new Disciplinas(codDisiplina, idProfessor, nomeDisciplina, qtdTurmas);
        listaDisciplinas.add(novaDisciplina);

        return "Disciplina Cadastrada";
    }

    public static String CadastroNotas() {
        int idAluno;
        int idProfessor;
        int idDisciplina;
        double[] notas = new double[3];

        System.out.println("Digite seu Código: ");
        idProfessor = sc.nextInt();
        if (listaDisciplinas.isEmpty() && VerificaOcupacao(listaPessoas, idProfessor)) {
            String retorno = "---ERRO---/n";
            retorno += "Apenas Profores podem cadastrar notas/n";
            retorno += "Nenhuma disciplina Cadastrada/n";
            retorno += "=======================================";
            return retorno;
        }
        System.out.println("Digite o codigo do aluno");
        idAluno = sc.nextInt();
        while (VerificaOcupacao(listaPessoas, idAluno)) {
            System.out.println("--Codigo de Aluno Invalido--");
            System.out.print("Digite Novamente:");
            idAluno = sc.nextInt();
        }
        System.out.println("Digite o Código da disciplina: ");
        idDisciplina = sc.nextInt();

        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite " + i + "° nota: ");
            notas[i] = sc.nextByte();
        }
        Boletim novoBoletim = new Boletim(idDisciplina, idProfessor, idAluno, notas);
        listaNotas.add(novoBoletim);

        return "Notas Cadastradas!!!";
    }

    public static boolean VerificaId(List<Pessoas> list, int cod) {
        Pessoas testePessoa = list.stream().filter(x -> x.getIdPessoa() == cod).findFirst().orElse(null);
        return testePessoa != null;
    }

    public static boolean VerificaOcupacao(List<Pessoas> list, int cod) {
        Pessoas localizarPessoa = list.stream().filter(x -> x.getIdPessoa() == cod).findFirst().orElse(null);
        if (localizarPessoa.getOcupacao() == "Aluno") {
            return true;
        }
        return false;
    }

    public static List<Pessoas> getListaPessoas() {
        return listaPessoas;
    }

    public static ArrayList<Disciplinas> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public static ArrayList<Boletim> getListaNotas() {
        return listaNotas;
    }
}


