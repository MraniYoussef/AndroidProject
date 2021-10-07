package ma.mrani.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondAvtivity extends AppCompatActivity implements View.OnClickListener  {


    Button btnActivityThird;
    Button btnBackToMainActivity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Back to Main Activity
        btnBackToMainActivity = findViewById(R.id.btnActivityMainFromSecond);
        btnBackToMainActivity.setOnClickListener(this);

    // To third Activity
        btnActivityThird = findViewById(R.id.btnActThirdFromSecond);
        btnActivityThird.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "start Second Activity", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnActivityMainFromSecond :
                Intent intentToSecond = new Intent(this, MainActivity.class);
                startActivity(intentToSecond);
                break;
            case R.id.btnActThirdFromSecond:
                Intent intentToThird = new Intent(this, ThirdActivity.class);
                startActivity(intentToThird);
                break;
            default:
                break;
        }
    }
}
