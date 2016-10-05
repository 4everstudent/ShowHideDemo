package a4everstudent.showhidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {
 View textView;

    public void showText(View view){
        textView.setVisibility(textView.VISIBLE);
    }

    public void hideText(View view){
        textView.setVisibility(textView.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textLabel);

    }
}
