
	 
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
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class _cadastro_responsavel_1_1_activity extends Activity {

	
	private View _bg____cadastro_responsavel_1_1_ek2;
	private ImageView cor_de_fundo_ek1;
	private TextView nome_respons_vel_;
	private TextView telefone_;
	private TextView endere_o_;
	private TextView cep_;
	private TextView cpf_;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private ImageView rectangle_4;
	private ImageView rectangle_6;
	private ImageView rectangle_7;
	private ImageView rectangle_8;
	private ImageView rectangle_5;
	private ImageView rectangle_22;
	private TextView _pr_ximo;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_responsavel_1_1);

		
		_bg____cadastro_responsavel_1_1_ek2 = (View) findViewById(R.id._bg____cadastro_responsavel_1_1_ek2);
		cor_de_fundo_ek1 = (ImageView) findViewById(R.id.cor_de_fundo_ek1);
		nome_respons_vel_ = (TextView) findViewById(R.id.nome_respons_vel_);
		telefone_ = (TextView) findViewById(R.id.telefone_);
		endere_o_ = (TextView) findViewById(R.id.endere_o_);
		cep_ = (TextView) findViewById(R.id.cep_);
		cpf_ = (TextView) findViewById(R.id.cpf_);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		rectangle_4 = (ImageView) findViewById(R.id.rectangle_4);
		rectangle_6 = (ImageView) findViewById(R.id.rectangle_6);
		rectangle_7 = (ImageView) findViewById(R.id.rectangle_7);
		rectangle_8 = (ImageView) findViewById(R.id.rectangle_8);
		rectangle_5 = (ImageView) findViewById(R.id.rectangle_5);
		rectangle_22 = (ImageView) findViewById(R.id.rectangle_22);
		_pr_ximo = (TextView) findViewById(R.id._pr_ximo);
	
		
		_pr_ximo.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_paciente_1_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	