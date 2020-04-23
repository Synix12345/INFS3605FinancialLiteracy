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
                textView.setText("When you earn money from work or investments, you usually have to pay tax on your income.\n" +
                        "\n" +
                        "The amount you pay depends on:\n" +
                        "\n" +
                        "how much you earn, and\n" +
                        "any deductions or offsets you can claim\n" +
                        "Income tax is usually paid to the government as you earn throughout the year.\n" +
                        "\n" +
                        "If you're an employee, your employer will deduct tax from each pay and send it to the Australian Taxation Office (ATO) on your behalf.\n" +
                        "\n" +
                        "If you're self-employed, you need to set aside and pay the money yourself.\n" +
                        "\n" +
                        "At the end of each financial year, most people need to lodge a tax return with the ATO. You can do it yourself online through myTax or with the help of an accountant or tax agent.\n" +
                        "\n" +
                        "In Australia, income is taxed on a sliding scale.\n" +
                        "\n" +
                        "The table below shows income tax rates for Australian residents aged 18 and over.\n" +
                        "\n" +
                        "Tax rates 2018–19\n" +
                        "\n" +
                        "Taxable income: 0–$18,200; Tax on this income: Nil\n" +
                        "Taxable income: $18,201–$37,000; Tax on this income: 19c for each $1 over $18,200\n" +
                        "Taxable income: $37,001–$90,000; Tax on this income: $3,572 plus 32.5c for each $1 over $37,000\n" +
                        "Taxable income: $90,001–$180,000; Tax on this income: $20,797 plus 37c for each $1 over $90,000\n" +
                        "Taxable income: $180,001 and over; Tax on this income: $54,097 plus 45c for each $1 over $180,000\n" +
                        "\n" +
                        "This means if you earned $60,000 per year, your tax would be calculated like this:\n" +
                        "\n" +
                        "$18,200 x nil = $0\n" +
                        "\n" +
                        "$18,800 ($37,000–$18,200) x 19c = $3,572\n" +
                        "\n" +
                        "$23,000 ($60,000–$37,000) x 32.5c = $7,475\n" +
                        "\n" +
                        "$3,572 + $7,475 =  $11,047\n" +
                        "\n" +
                        "\n" +
                        "These rates do not include the Medicare levy.\n" +
                        "\n" +
                        "If you're a foreign resident, a working holiday maker, or under age 18, see your individual income tax rates on the ATO website.\n" +
                        "\n" +
                        "Medicare levy and surcharge\n" +
                        "Most people pay a Medicare levy, which is 2% of your taxable income. The levy is charged as part of your yearly income tax assessment.\n" +
                        "\n" +
                        "If you're on a low income, your levy may be reduced, or you may not have to pay it at all. If you're on a higher income, you may have also to pay a Medicare levy surcharge of between 1.0 and 1.5% of your taxable income. It depends on the level of private health insurance you have and how much you earn.\n" +
                        "\n" +
                        "See Medicare levy on the ATO website for details.\n" +
                        "\n" +
                        "Your taxable income is the income you must pay tax on, minus your tax deductions and offsets.\n" +
                        "\n" +
                        "Income that is taxable\n" +
                        "Income that you must pay tax on includes money from: employment, pensions and annuities, most government payments, investments, capital gains, income from trusts, partnerships or businesses, and foreign income\n" +
                        "\n" +
                        "The ATO has more information on income you must declare in your tax return.\n" +
                        "\n" +
                        "Income that is not taxable\n" +
                        "You will not have to pay tax on: lottery winnings and other prizes, small gifts or birthday presents, some government payments, child support, the tax-free portion of your redundancy payment, and government super co-contributions\n" +
                        "The ATO has more details on amounts not included as income.\n" +
                        "\n" +
                        "Reducing the tax you pay\n" +
                        "You may be able to reduce the amount of tax you pay if: you're entitled to tax deductions or offsets, or\n" +
                        "you choose to salary package (salary sacrifice)\n" +
                        "\n" +
                        "Tax deductions\n" +
                        "Tax deductions reduce your taxable income before the tax is calculated.\n" +
                        "\n" +
                        "Common tax deductions include: work-related expenses, self-education expenses, charitable donations, the cost of managing your tax affairs (for example, paying an accountant)\n" +
                        "See deductions you can claim on the ATO website for details.\n" +
                        "\n" +
                        "Tax offsets\n" +
                        "Tax offsets, also known as rebates, directly reduce the amount of tax payable. They are applied after the tax has been calculated.\n" +
                        "\n" +
                        "Common tax offsets include offsets for: low-income and middle-income earners, taxpayers with a invalid relative, pensioners and senior Australians, the taxable portion of a superannuation income stream\n" +
                        "\n" +
                        "See offsets and rebates on the ATO website for more information.\n" +
                        "\n" +
                        "Salary packaging\n" +
                        "Salary packaging is when you 'package' your income into salary and benefits. For example, you may arrange to receive less salary in exchange for superannuation or car payments.\n" +
                        "\n" +
                        "If you reduce your salary in this way, you can reduce your taxable income. See salary packaging.\n" +
                        "\n" +
                        "Where to get help with tax\n" +
                        "Individual income tax can be complex, and everyone's situation is different.\n" +
                        "\n" +
                        "If you want to get professional advice, think about choosing an accountant to help manage your tax and lodge your tax return.\n" +
                        "\n" +
                        "You can also ask general questions about tax through the ATO Community.\n" +
                        "\n" +
                        "See lodging your tax return on the ATO website for information about preparing your annual return.\n");
                YouTubeActivity.YOUTUBE_VIDEO = "FeqwZwQcrj8";
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