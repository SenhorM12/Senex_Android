
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		_cadastro_paciente_1_5
	 *	@date 		Thursday 08th of September 2022 09:27:31 PM
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

public class _cadastro_paciente_1_5_activity extends Activity {

	
	private View _bg____cadastro_paciente_1_5;
	private ImageView cor_de_fundo;
	private TextView nome_;
	private TextView cpf_;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextView endere_o_;
	private ImageView rectangle_9;
	private TextView sa_de_do_paciente;
	private ImageView saude_1;
	private TextView tem_problema_do_cora__o_;
	private TextView tem_diabetes_;
	private TextView tem_dst_;
	private TextView tem_press_o_alta_;
	private ImageView rectangle_14;
	private ImageView rectangle_15;
	private ImageView rectangle_16;
	private ImageView rectangle_17;
	private ImageView rectangle_18;
	private ImageView rectangle_19;
	private ImageView rectangle_20;
	private ImageView rectangle_21;
	private TextView sim;
	private TextView sim_ek1;
	private TextView sim_ek2;
	private TextView sim_ek3;
	private TextView n_o;
	private TextView n_o_ek1;
	private TextView n_o_ek2;
	private TextView n_o_ek3;
	private ImageView rectangle_16_ek1;
	private TextView _pr_ximo;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_paciente_1_5);

		
		_bg____cadastro_paciente_1_5 = (View) findViewById(R.id._bg____cadastro_paciente_1_5);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		nome_ = (TextView) findViewById(R.id.nome_);
		cpf_ = (TextView) findViewById(R.id.cpf_);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		endere_o_ = (TextView) findViewById(R.id.endere_o_);
		rectangle_9 = (ImageView) findViewById(R.id.rectangle_9);
		sa_de_do_paciente = (TextView) findViewById(R.id.sa_de_do_paciente);
		saude_1 = (ImageView) findViewById(R.id.saude_1);
		tem_problema_do_cora__o_ = (TextView) findViewById(R.id.tem_problema_do_cora__o_);
		tem_diabetes_ = (TextView) findViewById(R.id.tem_diabetes_);
		tem_dst_ = (TextView) findViewById(R.id.tem_dst_);
		tem_press_o_alta_ = (TextView) findViewById(R.id.tem_press_o_alta_);
		rectangle_14 = (ImageView) findViewById(R.id.rectangle_14);
		rectangle_15 = (ImageView) findViewById(R.id.rectangle_15);
		rectangle_16 = (ImageView) findViewById(R.id.rectangle_16);
		rectangle_17 = (ImageView) findViewById(R.id.rectangle_17);
		rectangle_18 = (ImageView) findViewById(R.id.rectangle_18);
		rectangle_19 = (ImageView) findViewById(R.id.rectangle_19);
		rectangle_20 = (ImageView) findViewById(R.id.rectangle_20);
		rectangle_21 = (ImageView) findViewById(R.id.rectangle_21);
		sim = (TextView) findViewById(R.id.sim);
		sim_ek1 = (TextView) findViewById(R.id.sim_ek1);
		sim_ek2 = (TextView) findViewById(R.id.sim_ek2);
		sim_ek3 = (TextView) findViewById(R.id.sim_ek3);
		n_o = (TextView) findViewById(R.id.n_o);
		n_o_ek1 = (TextView) findViewById(R.id.n_o_ek1);
		n_o_ek2 = (TextView) findViewById(R.id.n_o_ek2);
		n_o_ek3 = (TextView) findViewById(R.id.n_o_ek3);
		rectangle_16_ek1 = (ImageView) findViewById(R.id.rectangle_16_ek1);
		_pr_ximo = (TextView) findViewById(R.id._pr_ximo);
	
		
		_pr_ximo.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_paciente_1_4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	