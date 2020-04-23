package com.example.infs3605financialliteracy.Quiz;

public class QuestionsQ2 {

    public String mQuestions[] = {
            "Instead of borrowing money for large purchases, you should set money aside in a _______ over time and pay with cash",
            "What does it mean to have a negative savings rate?",
            "For which of the following should you save?",
            "Which of these is NOT a key to saving money?",
            "Which of the following is a reason that people don't save money?",
            "Which of the following is NOT one of the three basic reasons for saving money?"
    };

    private String mChoices[][] = {
            {"Emergency fund","Sinking fund","Credit card fund","None of the above"},
            {"Spending more money than you make and acquiring debt","Having no savings at all","Both of the above","None of the above"},
            {"Purchases","Emergency Fund","Wealth building","All of the above"},
            {"Focus", "Your Income", "Making saving a habit and a priority", "Discipline"},
            {"They lack discipline","They do not live on a budget","They lack focus","All of the above"},
            {"Emergency fund","Large purchases","Have money available to lend to friends","build wealth"}
    };

    private String mCorrectAnswers[] = {
            "Sinking fund",
            "Spending more money than you make and acquiring debt",
            "All of the above",
            "Your Income",
            "All of the above",
            "Have money available to lend to friends"
    };

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
