import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(90);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso Spring");
        curso2.setDescricao("Aprendendo Spring");
        curso2.setCargaHoraria(60);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("mentoria de JAVA");
        mentoria1.setData(LocalDate.now());

        //Conteudo conteudo = new Curso();

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java developer");
        bootCamp.setDescricao("Descrição do Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        String conteudosInscritos = "Coteudos Inscritos ";
        String conteudosConcluidos = "Coteudos Concluídos ";

        Dev devJonas = new Dev();
        devJonas.setNome("Jonas");
        devJonas.inscreverBootcamp(bootCamp);

        conteudosInscritos += devJonas.getConteudosInscritos();

        conteudosConcluidos += devJonas.getConteudosConcluidos();

        System.out.println(conteudosInscritos);
        devJonas.progredir();
        System.out.println(conteudosInscritos);
        System.out.println(conteudosConcluidos);

        System.out.println();

        conteudosInscritos = "Coteudos Inscritos ";
        conteudosConcluidos = "Coteudos Concluídos ";


        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootCamp);
        conteudosInscritos += devLucas.getConteudosInscritos();
        conteudosConcluidos += devLucas.getConteudosConcluidos();
        devLucas.inscreverBootcamp(bootCamp);
        System.out.println(conteudosInscritos);
        System.out.println(conteudosInscritos);



    }
}
