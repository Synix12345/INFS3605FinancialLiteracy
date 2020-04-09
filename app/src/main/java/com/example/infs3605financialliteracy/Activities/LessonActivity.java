package com.example.infs3605financialliteracy.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.infs3605financialliteracy.R;

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
                break;
            case 1:
                textView.setText("TESTING 1");
                break;
            case 2:
                textView.setText("Testing 2");
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