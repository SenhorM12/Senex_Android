package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class home_activity extends AppCompatActivity {

	
	private TextView userEmailHome;
	private TextInputEditText userEmailBoxHome;
	private TextInputEditText senhaBoxHome;
	private TextView senhaHome;
	private Button enterButton;
	private TextView registerButtonHome;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		userEmailHome = (TextView) findViewById(R.id.userEmailHome);
		userEmailBoxHome = (TextInputEditText) findViewById(R.id.userEmailBoxHome);
		senhaBoxHome = (TextInputEditText) findViewById(R.id.senhaBoxHome);
		senhaHome = (TextView) findViewById(R.id.senhaHome);
		enterButton = (Button) findViewById(R.id.enterButton);
		registerButtonHome = (TextView) findViewById(R.id.registerButtonHome);


		enterButton.setOnClickListener(new View.OnClickListener() {
			public  void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
				startActivity(nextScreen);
			
		
			}
		});


		registerButtonHome.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_responsavel_1_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
	
	}
}
	
	