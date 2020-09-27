package Alexis.m_gas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView enterPhoneNumber = findViewById(R.id.text_view_enter_phonenumber);
        EditText phoneNumber = findViewById(R.id.edit_text_phone_number);
        Button signIn = findViewById(R.id.button_sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(SignInActivity.this, MapsActivity.class);
                startActivity(signIn);
            }
        });
    }
}