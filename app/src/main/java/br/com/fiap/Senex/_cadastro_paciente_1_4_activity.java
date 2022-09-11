package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class _cadastro_paciente_1_4_activity extends AppCompatActivity {


	private View _bg____cadastro_paciente_1_4;
	private ImageView cor_de_fundo;
	private TextView nome1_4;
	private TextView cpf1_4;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextView adress1_4;
	private ImageView rectangle_9;
	private TextView titleText;
	private ImageView saude_1;
	private TextInputEditText receitaBox;
	private TimePicker timeBox;
	private TextInputEditText medBox;
	private TextInputEditText qtBox;
	private Button endButton1_4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_paciente_1_4);


		_bg____cadastro_paciente_1_4 = (View) findViewById(R.id._bg____cadastro_paciente_1_4);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		nome1_4 = (TextView) findViewById(R.id.nome1_4);
		cpf1_4 = (TextView) findViewById(R.id.cpf1_4);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		adress1_4 = (TextView) findViewById(R.id.adress1_4);
		rectangle_9 = (ImageView) findViewById(R.id.rectangle_9);
		titleText = (TextView) findViewById(R.id.titleText);
		saude_1 = (ImageView) findViewById(R.id.saude_1);
		receitaBox = (TextInputEditText) findViewById(R.id.receitaBox);
		timeBox = (TimePicker) findViewById(R.id.timeBox);
		medBox = (TextInputEditText) findViewById(R.id.medBox);
		qtBox = (TextInputEditText) findViewById(R.id.qtBox);
		endButton1_4 = (Button) findViewById(R.id.endButton1_4);


		endButton1_4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
				startActivity(nextScreen);


			}
		});

	}
}
	
	