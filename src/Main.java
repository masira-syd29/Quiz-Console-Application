public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();  //Question[] questions in constructor
        service.playQuiz();
        service.printScore();

    }
}