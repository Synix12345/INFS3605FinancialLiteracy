package com.example.infs3605financialliteracy.Quiz;

public class QuestionsQ1 {

    public String mQuestions[] = {
            "Which of the following statements is correct?",
            "What is the superannuation concessional contribution cap for the 2019 financial year?",
            "What is the easiest way to consolidate multiple super accounts to avoid paying multiple fees?",
            "Which of the following statements is correct?",
            "Which of the following is a benefit of super?",
            "Which of the following conditions of release allows super to be accessed?",
            "There are two phases of Superannuation, these are:",
            "What are three examples of the types of Super Funds that are available to you:",
            "Salary Sacrificing to Superannuation can be summarised as:",
            "If you were eligible for the full government co-contribution what would your co-contribution be if you contributed $500 into super from your own cash?",
            "The tax rate on earnings within an Account Based Pension is:"
    };

    private String mChoices[][] = {
            {"The Superannuation Guarantee must be paid by employers to employees who are aged over 18 who earn more than $450 in a month","You can only access your super once you have met a condition of release","Concessional contributions that you make to super are generally taxed at 15%","All of the above"},
            {"$30,000","$25,500","$25,000","$30,500"},
            {"Creating a myGov account, linking it to the Australian Taxation Office, and consolidating your accounts","There is no easy way","You cannot consolidate multiple super accounts","None of the above"},
            {"All super funds charge the same fees", "Super funds are required to disclose their total fees and charges in their product disclosure statement (PDS) and in your annual member statement", "Super funds do not charge fees", "None of the above"},
            {"Everyone who contributes to super is eligible for a government co-contribution of the same amount","Once you retire on or after your 60th birthday, you can generally withdraw your super funds tax-free","Both of the above","None of the above"},
            {"The First Home Super Saver Scheme","Severe financial hardship","Retirement after reaching your preservation age","All of the above"},
            {"Working and Non-Working", "Industry Fund and Pension Fund", "Accumulation and Pension", "Concessional and Non-Concessional"},
            {"Industry Fund, Retail Fund and Lump Sum Fund", "Industry Fund, Retail Fund and Corporate Fund", "Self Managed Super Fund, Pension Fund and Accumulation Fund", "Australian Share Fund, Property Fund and Corporate Fund"},
            {"Sacrificing fees to gain better performance", "Using your salary to find the appropriate super fund", "Contributing money to your super from your bank account after tax has been deducted.", "Where you reduce your salary by a certain amount and the amount is contributed to superannuation, before income tax is deducted."},
            {"$250", "$500", "$1,000", "$2,000"},
            {"15%", "10%", "31.5%", "0%"}

    };

    private String mCorrectAnswers[] = {
            "All of the above",
            "$25,000",
            "Creating a myGov account, linking it to the Australian Taxation Office, and consolidating your accounts",
            "Super funds are required to disclose their total fees and charges in their product disclosure statement (PDS) and in your annual member statement",
            "Once you retire on or after your 60th birthday, you can generally withdraw your super funds tax-free",
            "All of the above",
            "Accumulation and Pension",
            "Industry Fund, Retail Fund and Corporate Fund",
            "Where you reduce your salary by a certain amount and the amount is contributed to superannuation, before income tax is deducted.",
            "$250",
            "0%"
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
