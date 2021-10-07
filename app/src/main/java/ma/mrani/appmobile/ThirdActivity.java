package ma.mrani.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    Button btnSecondAct;
    Button btnMainAct;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnMainAct = findViewById(R.id.btnMainActivityFromThird);
        View.OnClickListener listenerToMain = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMainActivity();
            }
        };
        btnMainAct.setOnClickListener(listenerToMain);

         btnSecondAct = findViewById(R.id.btnActivitySecod);
         View.OnClickListener listenerToSecond = new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openActivity2();

             }
         };
        btnSecondAct.setOnClickListener(listenerToSecond);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start Third Activity", Toast.LENGTH_SHORT).show();
    }

    public void backToMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public  void openActivity2(){
        Intent intent = new Intent(this, SecondAvtivity.class);
        startActivity(intent);
    }
}
