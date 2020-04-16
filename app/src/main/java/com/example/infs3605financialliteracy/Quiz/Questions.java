package com.example.infs3605financialliteracy.Quiz;

public class Questions {

    public String mQuestions[] = {
            "Which of the following statements is correct?",
            "What is the superannuation concessional contribution cap for the 2019 financial year?",
            "What is the easiest way to consolidate multiple super accounts to avoid paying multiple fees?"
    };

    private String mChoices[][] = {
            {"The Superannuation Guarantee must be paid by employers to employees who are aged over 18 who earn more than $450 in a month","You can only access your super once you have met a condition of release","Concessional contributions that you make to super are generally taxed at 15%","All of the above"},
            {"$30,000","$25,500","$25,000","$30,500"},
            {"Creating a myGov account, linking it to the Australian Taxation Office, and consolidating your accounts","There is no easy way","You cannot consolidate multiple super accounts","None of the above"}
    };

    private String mCorrectAnswers[] = {"All of the above","$25,000","Creating a myGov account, linking it to the Australian Taxation Office, and consolidating your accounts"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
