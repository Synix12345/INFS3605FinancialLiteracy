package com.example.infs3605financialliteracy.Quiz;

public class Questions {

    public String mQuestions[] = {
            "Sample test question, answer is b",
            "What is the superannuation concessional contribution cap for the 2019 financial year?"
    };

    private String mChoices[][] = {
            {"A","B","C","D"},
            {"$30,000","$25,500","$25,000","$30,500"}
    };

    private String mCorrectAnswers[] = {"B","$25,000"};

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
