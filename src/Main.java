import br.com.bootcamp.desafio.oo.Curso;
import br.com.bootcamp.desafio.oo.Mentoria;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Curso curso = new Curso();

    curso.setDescricao("Java");
    curso.setTitulo("Java");
    curso.setCargaHoraria(9);
    System.out.println(curso);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Java");
    mentoria.setDescricao("Mentor Java");
    mentoria.setData(LocalDate.now());
    System.out.println(mentoria);

  }
}
