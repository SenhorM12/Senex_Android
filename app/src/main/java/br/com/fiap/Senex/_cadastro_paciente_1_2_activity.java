package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class _cadastro_paciente_1_2_activity extends AppCompatActivity {

	
	private View _bg____cadastro_paciente_1_3_ek2;
	private ImageView cor_de_fundo_ek7;
	private ImageView homem_perfil_caricatura_18591_58482_1_ek6;
	private TextView nome1_2;
	private TextView telefone1_2;
	private TextView adress1_2;
	private TextView cep1_2;
	private TextView cpf1_2;
	private TextView dtNasc;
	private TextInputEditText nomeBox1_2;
	private TextInputEditText cpfBox1_2;
	private TextInputEditText telefoneBox1_2;
	private TextInputEditText adressBox;
	private TextInputEditText cepBox1_2;
	private TextInputEditText dtNascBox;
	private Button nextButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_paciente_1_2);


		_bg____cadastro_paciente_1_3_ek2 = (View) findViewById(R.id.cor_de_fundo_ek2);
		homem_perfil_caricatura_18591_58482_1_ek6 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1_ek6);
		nome1_2 = (TextView) findViewById(R.id.nome1_2);
		telefone1_2 = (TextView) findViewById(R.id.telefone1_2);
		adress1_2 = (TextView) findViewById(R.id.adress1_2);
		cep1_2 = (TextView) findViewById(R.id.cep1_2);
		cpf1_2 = (TextView) findViewById(R.id.cpf1_2);
		dtNasc = (TextView) findViewById(R.id.dtNasc);
		nomeBox1_2 = (TextInputEditText) findViewById(R.id.nomeBox1_2);
		cpfBox1_2 = (TextInputEditText) findViewById(R.id.cpfBox1_2);
		telefoneBox1_2 = (TextInputEditText) findViewById(R.id.telefoneBox1_2);
		adressBox = (TextInputEditText) findViewById(R.id.adressBox);
		cepBox1_2 = (TextInputEditText) findViewById(R.id.cepBox1_2);
		dtNascBox = (TextInputEditText) findViewById(R.id.dtNascBox);
		nextButton = (Button) findViewById(R.id.nextButton);
	
		
		nextButton.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_paciente_1_4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	