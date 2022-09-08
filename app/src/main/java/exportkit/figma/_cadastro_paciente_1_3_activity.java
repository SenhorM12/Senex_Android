
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Thursday 25th of August 2022 11:23:05 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class _cadastro_paciente_1_3_activity extends Activity {

	
	private View _bg____cadastro_paciente_1_3_ek2;
	private ImageView cor_de_fundo_ek7;
	private ImageView homem_perfil_caricatura_18591_58482_1_ek6;
	private TextView nome_protegido;
	private TextView telefone__ek1;
	private TextView endere_o__ek6;
	private TextView cep__ek1;
	private TextView cpf__ek6;
	private TextView rectangle_9_ek5;
	private TextView rectangle_10_ek7;
	private TextView rectangle_11_ek2;
	private TextView rectangle_12;
	private TextView data_de_nascimento_;
	private TextView rectangle_14_ek1;
	private TextView rectangle_13;
	private Button rectangle_15_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_paciente_1_3);


		_bg____cadastro_paciente_1_3_ek2 = (View) findViewById(R.id.cor_de_fundo_ek2);
		homem_perfil_caricatura_18591_58482_1_ek6 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1_ek6);
		nome_protegido = (TextView) findViewById(R.id.nome_protegido);
		telefone__ek1 = (TextView) findViewById(R.id.telefone__ek1);
		endere_o__ek6 = (TextView) findViewById(R.id.endere_o__ek6);
		cep__ek1 = (TextView) findViewById(R.id.cep__ek1);
		cpf__ek6 = (TextView) findViewById(R.id.cpf__ek6);
		rectangle_9_ek5 = (TextView) findViewById(R.id.rectangle_9_ek5);
		rectangle_10_ek7 = (TextView) findViewById(R.id.rectangle_10_ek7);
		rectangle_11_ek2 = (TextView) findViewById(R.id.rectangle_11_ek2);
		rectangle_12 = (TextView) findViewById(R.id.rectangle_12);
		data_de_nascimento_ = (TextView) findViewById(R.id.data_de_nascimento_);
		rectangle_14_ek1 = (TextView) findViewById(R.id.rectangle_14_ek1);
		rectangle_13 = (TextView) findViewById(R.id.rectangle_13);
		rectangle_15_ek1 = (Button) findViewById(R.id.rectangle_15_ek1);
	
		
		rectangle_15_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_paciente_1_4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	