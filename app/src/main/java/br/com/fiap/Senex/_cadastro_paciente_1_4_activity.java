package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import exportkit.figma.R;

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
	private ImageView rectangle_22;
	private ImageView saude__1__1;
	private ImageView rectangle_23;
	private ImageView saude__1__2;
	private ImageView rectangle_24;
	private ImageView rectangle_26;
	private ImageView rectangle_27;
	private ImageView saude__1__3;
	private ImageView rectangle_25;
	private ImageView saude__1__4;
	private TextView adicionar_receita;
	private TextView adicionar_rem_dio;
	private TextView adicionar_quantidade_de_comprimido;
	private TextView adicionar_hor_rio;
	private TextView __;
	private ImageView hora_do_relogio_1;
	private ImageView rectangle_16;
	private TextView _finalizar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_paciente_1_4);

		
		_bg____cadastro_paciente_1_4 = (View) findViewById(R.id._bg____cadastro_paciente_1_4);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		nome_ = (TextView) findViewById(R.id.nome_);
		cpf_ = (TextView) findViewById(R.id.cpf_);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		endere_o_ = (TextView) findViewById(R.id.endere_o_);
		rectangle_9 = (ImageView) findViewById(R.id.rectangle_9);
		sa_de_do_paciente = (TextView) findViewById(R.id.sa_de_do_paciente);
		saude_1 = (ImageView) findViewById(R.id.saude_1);
		rectangle_22 = (ImageView) findViewById(R.id.rectangle_22);
		saude__1__1 = (ImageView) findViewById(R.id.saude__1__1);
		rectangle_23 = (ImageView) findViewById(R.id.rectangle_23);
		saude__1__2 = (ImageView) findViewById(R.id.saude__1__2);
		rectangle_24 = (ImageView) findViewById(R.id.rectangle_24);
		rectangle_26 = (ImageView) findViewById(R.id.rectangle_26);
		rectangle_27 = (ImageView) findViewById(R.id.rectangle_27);
		saude__1__3 = (ImageView) findViewById(R.id.saude__1__3);
		rectangle_25 = (ImageView) findViewById(R.id.rectangle_25);
		saude__1__4 = (ImageView) findViewById(R.id.saude__1__4);
		adicionar_receita = (TextView) findViewById(R.id.adicionar_receita);
		adicionar_rem_dio = (TextView) findViewById(R.id.adicionar_rem_dio);
		adicionar_quantidade_de_comprimido = (TextView) findViewById(R.id.adicionar_quantidade_de_comprimido);
		adicionar_hor_rio = (TextView) findViewById(R.id.adicionar_hor_rio);
		__ = (TextView) findViewById(R.id.__);
		hora_do_relogio_1 = (ImageView) findViewById(R.id.hora_do_relogio_1);
		rectangle_16 = (ImageView) findViewById(R.id.rectangle_16);
		_finalizar = (TextView) findViewById(R.id._finalizar);
	
		
		_finalizar.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	