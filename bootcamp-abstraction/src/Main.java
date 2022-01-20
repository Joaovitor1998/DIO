import java.time.LocalDate;

import domain.Bootcamp;
import domain.Course;
import domain.Developer;
import domain.Mentorship;
import domain.Question;

public class Main {
    public static void main(String[] args) {
        Course courseJava = new Course();
        courseJava.setTitle("Curso de Java");
        courseJava.setDescription("Descrição do curso de Java");
        courseJava.setWorkload(89);

        Course courseSpring = new Course();
        courseSpring.setTitle("Curso de Spring Boot");
        courseSpring.setDescription("Descrição do curso de Spring Boot");
        courseSpring.setWorkload(57);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentoria Java");
        mentorship.setDescription("Descrição da mentoria de Java");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Descrição do bootcamp");
        bootcamp.getContents().add(courseJava);
        bootcamp.getContents().add(courseSpring);
        bootcamp.getContents().add(mentorship);

        Developer myself = new Developer();
        myself.setName("João");
        myself.subscribeToBootcamp(bootcamp);

        Developer maria = new Developer();
        maria.setName("Maria");
        maria.subscribeToBootcamp(bootcamp);

        System.out.println(bootcamp.getQuestions());

        Question question1 = new Question();
        question1.makeQuestion(bootcamp, myself);

        Question question2 = new Question();
        question2.makeQuestion(bootcamp, myself);

    }
}
