import br.com.bootcamp.desafio.oo.*;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Curso curso = new Curso();

    curso.setDescricao("Java");
    curso.setTitulo("Java");
    curso.setCargaHoraria(9);


    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Java");
    mentoria.setDescricao("Mentor Java");
    mentoria.setData(LocalDate.now());


    Bootcamp bootcamp = new Bootcamp();

    bootcamp.setNome("Bootcamp Java");
    bootcamp.setDescricao("Bootcamp Java Back-End");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(mentoria);

    Dev dev = new Dev();
    dev.inscreverBootcamp(bootcamp);
    dev.setNome("Mago");
    dev.progredir();
    System.out.println("XP: " + dev.calcularTotalXp());

    System.out.println("Bootcamp" + bootcamp);
    System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());

  }
}
