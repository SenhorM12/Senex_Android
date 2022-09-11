package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class home_activity extends AppCompatActivity {

	
	private View _bg__home_ek2;
	private ImageView cor_de_fundo;
	private TextView userEmailHome;
	private ImageView user_icon_2;
	private TextInputEditText userEmailBoxHome;
	private TextInputEditText senhaBoxHome;
	private TextView senhaHome;
	private Button enterButton;
	private TextView registerButtonHome;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		userEmailHome = (TextView) findViewById(R.id.userEmailHome);
		user_icon_2 = (ImageView) findViewById(R.id.user_icon_2);
		userEmailBoxHome = (TextInputEditText) findViewById(R.id.userEmailBoxHome);
		senhaBoxHome = (TextInputEditText) findViewById(R.id.senhaBoxHome);
		senhaHome = (TextView) findViewById(R.id.senhaHome);
		enterButton = (Button) findViewById(R.id.enterButton);
		registerButtonHome = (TextView) findViewById(R.id.registerButtonHome);


		enterButton.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
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
		
		
		//custom code goes here
	
	}
}
	
	