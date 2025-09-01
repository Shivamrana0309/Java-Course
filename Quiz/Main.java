package Quiz;

public class Main {
    public static void main(String[] args) {

        QuesService qs = new QuesService();
        qs.playQuiz();
        qs.printScore();
    }
}
