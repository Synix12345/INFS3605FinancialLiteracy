package com.example.infs3605financialliteracy.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.infs3605financialliteracy.R;
import com.example.infs3605financialliteracy.Activities.YouTubeActivity;

import androidx.appcompat.app.AppCompatActivity;


public class LessonActivity extends AppCompatActivity {

    TextView textView;
    Button btnVid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        Intent intent = getIntent();
        int lessonnumber = intent.getIntExtra("lessonnumber", 0);


        textView = findViewById(R.id.tv_info);
        textView.setMovementMethod(new ScrollingMovementMethod());
        btnVid = findViewById(R.id.btn_vid);

        switch (lessonnumber){
            case 0:
                textView.setText("Most people can choose which super fund they'd like their super contributions paid into. You can go with your employer's fund or choose your own.\n" +
                        "\n" +
                        "To find out if you can choose your super fund, check with your employer. Your employer will give you a 'standard choice form' when you start a new job. This sets out your options.\n" +
                        "\n" +
                        "What to look for in a super fund\n" +
                        "When you're comparing super funds, weigh up fund performance and the fees you'll pay against other factors such as risk, investment returns, services and insurance.\n" +
                        "\n" +
                        "Performance\n" +
                        "Compare your fund's investment performance over at least five years. Consider the impact of fees and tax.\n" +
                        "\n" +
                        "Compare like with like. For example, only compare a balanced option with another balanced option, and try to use the same time period.\n");
                YouTubeActivity.YOUTUBE_VIDEO = "2xYq9CDqiXE";
                break;
            case 1:
                textView.setText("Interest rates on savings accounts are at record lows these days, so you’ll be hard pressed to find an interest rate that’s permanently above 3% per annum.\n" +
                        "\n" +
                        "There are two types of interest rates on savings accounts:\n" +
                        "\n" +
                        "The base interest rate: the standard interest rate on the account that you qualify for no matter how many withdrawals, transactions or deposits you make\n" +
                        "Conditional bonus rate: an extra interest rate you get for meeting certain conditions, such as not making any withdrawals or depositing a certain amount in your account each month.\n" +
                        "Not every bank account has a bonus interest rate. For example, one bank might have a base interest rate of 1.5% and a bonus rate of 1%, while another might simply have a base interest rate of 2.5% and no bonus interest rate.\n" +
                        "\n" + "Types of savings accounts\n" +
                                "There are multiple different kinds of savings accounts to choose from:\n" +
                                "\n" +
                                "1. Bonus and online savings accounts\n" +
                                "These are your stock standard savings accounts – they allow you to deposit funds, link a transaction account and set up automatic transfers for savings. They offer higher interest rates single transaction accounts (which often have 0% interest), and may allow you to earn bonus interest by meeting specific conditions.\n" +
                                "\n" +
                                "2. Kid’s/children’s bank accounts\n" +
                                "Also referred to as youth or junior banking accounts, kid’s savings accounts are specifically designed for children under the age of 18. These bank accounts require consent from a parent or guardian to open, but from certain ages onwards (usually 13), the children can manage the account themselves.\n" +
                                "\n" +
                                "These exist so kids can learn the benefits of practical savings habits themselves. These accounts can even come with higher interest rates than adult bank accounts to encourage saving. They might require certain bonus conditions to be met to qualify for these interest rates, and can also exclude monthly account-keeping fees.\n" +
                        "\n" +
                        "3. Savings accounts for pensioners\n" +
                                "Savings accounts for pensioners and seniors are designed for people over the age of 55 or for those living on the aged pension. These accounts function in much the same way as regular savings accounts with a few key differences:\n" +
                                "\n" +
                                "Most are one linked account, allowing seniors to spend from their savings account: this reduces their need to manage multiple.\n" +
                                "Waived account-keeping fees: some charge no fees at all while others require a small monthly deposit to waive the fee \n" +
                        "\n" +
                        "4. Cash management accounts\n" +
                                "Sometimes classified as ‘investment accounts’, cash management accounts can be used to receive cash from investments (like dividends and proceeds of sales) and purchase new investments. Cash management accounts can be useful for people juggling multiple investments alongside their savings, putting them all in one convenient location.\n" +
                                "\n" +
                                "Cash management accounts can have higher interest rates than a standard savings account, but this will depend on who you’re with.\n" +
                                "\n" +
                                "5. Business savings accounts\n" +
                                "Not for the everyday punter, a business savings account allows you to earn interest on your business’s funds and keep it safe. They can often come with slightly lower interest rates compared to personal accounts and can require a higher minimum balance in order to earn interest.\n" +
                                "\n" +
                                "Pros and cons of savings accounts\n" +
                                "Here’s a quick summary of the pros and cons of a savings account:\n" +
                                "\n" +
                                "Pros\n" +
                                "Interest is compounding, so your interest can snowball over time\n" +
                                "There is a government guarantee of $250,000\n" +
                                "Savings accounts are at-call, meaning you can withdraw your funds at any time\n" +
                                "You can use these funds however you please, be it for spending or for building up savings over time\n" +
                                "They’re easy to open (most of the time)\n" +
                                "Cons\n" +
                                "Interest rates are quite low at the moment compared to other investment options, and will likely stay this way until the RBA cash rate increases\n" +
                                "Not meeting bonus interest conditions will see you miss out bigger interest earnings\n" +
                                "They’re quite inflexible without a linked transaction account\n" +
                                "There are fees you can be charged, like a monthly account-keeping fee (these fees can be quite low, however)\n" +
                                "They’re difficult to close (most of the time)\n" +
                                "Common savings account fees\n" +
                                "Although there are a number of fee-free savings accounts available, they aren’t always free. Depending on the provider you pick, you could end up paying:\n" +
                                "\n" +
                                "Monthly account-keeping (service) fees: the fee charged for keeping the account open and active.\n" +
                                "ATM withdrawal fees: when using an ATM, you can be charged a small fee either by your bank or other banks.\n" +
                                "Monthly statement fees: online statements (on your spending) tend to be free, but paper statements mailed to you might come with a fee.\n" +
                                "Electronic transaction fees: savings accounts aren’t meant for transferring money, and doing so can carry a small fee.\n" +
                                "Branch deposit fees: depositing money through a teller in a branch instead of online.\n" +
                                "These fees can vary. For example, the highest account-keeping fee at the time of writing (November 2018) is $6 a month. Consider looking for an account that doesn’t charge a monthly service fee.\n" +
                                "\n" +
                                "A lot of these fees are quite minor (often no more than a few dollars at most), but can be irritating if you’re trying to save money with your savings account."

                        );
                YouTubeActivity.YOUTUBE_VIDEO = "jY3_w3bwt3M";
                break;
            case 2:
                textView.setText("Testing 2");
                YouTubeActivity.YOUTUBE_VIDEO = "jY3_w3bwt3M";
                break;

        }

        btnVid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, YouTubeActivity.class);
                context.startActivity(intent);
            }
        });



    }
}