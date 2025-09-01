package Quiz;

import java.util.Scanner;

public class QuesService {
    Questions[] questions = new Questions[5]; // this is just an array initialised for ref variables, we still need to initialise the objects
    String[] ans = new String[5];

    public QuesService(){
        questions[0] = new Questions(1,"2*2","4","8","16","12","4");
        questions[1] = new Questions(2,"2+2","4","8","16","12","4");
        questions[2] = new Questions(3,"2*6","4","8","16","12","12");
        questions[3] = new Questions(4,"2-2","4","8","0","12","0");
        questions[4] = new Questions(5,"2/2","4","8","1","2","1");
    }

    public void playQuiz(){
        int i=0;
        Scanner in = new Scanner(System.in);
        for(Questions q: questions){
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            
            System.out.print("Enter your ans: ");
            ans[i]=in.nextLine();
            i++;
            
        }
        in.close();
    }

    public void printScore(){
        int score=0;
        for(int i=0;i<5;++i){
            if(questions[i].getAns().equals(ans[i])) score++;
        }
        System.out.println("Score: "+score);
    }
}
