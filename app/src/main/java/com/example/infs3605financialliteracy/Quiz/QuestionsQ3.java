package com.example.infs3605financialliteracy.Quiz;

public class QuestionsQ3 {

    public String mQuestions[] = {
            "What is Adjusted Gross Income?",
            "You do not have to pay any Income Tax if your income is below the following threshold.",
            "What is the term used to describe the tax paid on a person’s last dollar of income?",
            "What is not a taxable deduction?",
            "Who is in charge of handling and updating Tax Affairs in Australia?",
            "What is the typical deadline for lodgement of your Income Tax Return, if lodging yourself?"
    };

    private String mChoices[][] = {
            {"Your after-tax income","Your taxable income after deductions","Your taxable income before deductions","None of the above"},
            {"$30,100","$18,200","$15,200","$30,400"},
            {"Marginal tax rate","Adjusted gross tax rate","Average tax rate","Total tax rate"},
            {"Personal Groceries", "Work-related expenses", "Self-education expenses", "Cost of managing your Tax Affairs"},
            {"Aussie Affairs","Australian Taxable Board","Australian Taxation Office","Australian Tax Network"},
            {"31st July","31st October","30th September","15th May"}
    };

    private String mCorrectAnswers[] = {
            "Your taxable income before deductions",
            "$18,200",
            "Marginal tax rate",
            "Personal Groceries",
            "Australian Taxation Office",
            "31st October"
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
