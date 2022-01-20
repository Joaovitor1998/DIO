package domain;

import java.util.Scanner;

public class Question {

    private Developer developer;
    private String title;
    private String message;
    private Bootcamp bootcamp;
    private Scanner sc;

    public Question() {
        this.sc = new Scanner(System.in);
    }

    public void makeQuestion(Bootcamp bootcamp, Developer developer) {
        Scanner sc = new Scanner(System.in);
        this.developer = developer;
        setTitle();
        setMessage();
        bootcamp.getQuestions().add(this);
        this.bootcamp = bootcamp;
        sc.close();
    }

    public String getTitle() {
        return this.title;
    }

    public String getMessage() {
        return this.message;
    }

    private void setTitle() {
        System.out.println("Digite o título: ");
        this.title = sc.nextLine();
    }

    private void setMessage() {
        System.out.println("Digite a mensagem: ");
        this.message = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Question [bootcamp=" + bootcamp + ", developer=" + developer + ", message=" + message + ", title="
                + title + "]";
    }

}
