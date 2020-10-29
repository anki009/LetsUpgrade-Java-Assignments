

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"“Parliamentary Government” is also known as....",
    "Which of the following characteristics is not related to Parliamentary Government?",
    "Which of the following is not the merit of the Presidential System?"};

    String[] options1={"Cabinet Government”","Resolution of lower house","Permanent Government"};

    String[] options2={"Resposible Government”","Collective liability","Confirmation in policies"};

    String[] options3={"Westminster forms of government","Leadership of the Prime Minister","Limited Representation"};

    String[] options4={"All of the above","Single Executive","Government by experts"};
    int[] answers={4,4,3};


    public void initiateGame()
    {

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }


        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }

    }

    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("You're correct. Excellent!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Sorry :( your answer is incorrect.");
              }
          }

        System.out.println(player.name + " your score is " + player.score+" Out of 15");

    }

}