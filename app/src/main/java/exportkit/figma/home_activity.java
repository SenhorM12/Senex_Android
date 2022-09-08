

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class home_activity extends Activity {

	
	private View _bg__home_ek2;
	private ImageView cor_de_fundo;
	private TextView e_mail_;
	private ImageView user_icon_2;
	private View email_box;
	private View rectangle_2;
	private TextView senha_;
	private Button entrar;
	private TextView _criar_conta;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		e_mail_ = (TextView) findViewById(R.id.e_mail_);
		user_icon_2 = (ImageView) findViewById(R.id.user_icon_2);
		email_box = (View) findViewById(R.id.email_box);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		senha_ = (TextView) findViewById(R.id.senha_);
		entrar = (Button) findViewById(R.id.entrar);
		_criar_conta = (TextView) findViewById(R.id._criar_conta);
	
		
		entrar.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_criar_conta.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_responsavel_1_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	