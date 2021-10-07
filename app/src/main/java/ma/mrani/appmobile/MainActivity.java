package ma.mrani.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    TextView textView;
    Button buttonToSecond;
    Button buttonToThird;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewMain);
        buttonToSecond = findViewById(R.id.btn2ndActivityFromMain);
        buttonToSecond.setOnClickListener(this);

        buttonToThird = findViewById(R.id.btnThirdActivityFromMain);
        buttonToThird.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start Main", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn2ndActivityFromMain:
                Intent intentTosecond = new Intent(this, SecondAvtivity.class);
                startActivity(intentTosecond);
                break;
            case R.id.btnThirdActivityFromMain:
                Intent intentToThird = new Intent(this, ThirdActivity.class);
                startActivity(intentToThird);
                break;
            default:

                break;
        }

    }
}
