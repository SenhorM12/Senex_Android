package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

	public class tela_responsavel_activity extends AppCompatActivity {

	
	private View _bg__tela_responsavel;
	private ImageView cor_de_fundo;
	private TextView nome_;
	private TextView cpf_;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextView endere_o_;
	private ImageView rectangle_9;
	private ImageView rectangle_10;
	private ImageView office_customer_female_light_icon_4;
	private TextView v__maria;
	private View rectangle_10_ek1;
	private TextView rusovas___ems;
	private TextView _1_comprimido___10mg___branco;
	private TextView _10_15;
	private ImageView accept_icon_1;
	private TextView __colesterol;
	private ImageView pencil_icon_1;
	private ImageView bin_2_icon_1;
	private ImageView rectangle_11;
	private ImageView office_customer_female_light_icon_5;
	private TextView v__clara;
	private View rectangle_10_ek2;
	private TextView rusovas___ems_ek1;
	private TextView _1_comprimido___10mg___branco_ek1;
	private TextView _10_15_ek1;
	private TextView __colesterol_ek1;
	private ImageView pencil_icon_1_ek1;
	private ImageView bin_2_icon_1_ek1;
	private ImageView _accept_icon_1_ek1;
	private ImageView rectangle_22;
	private TextView _sair;
	private ImageView rectangle_16;
	private TextView _config_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_responsavel);

		
		_bg__tela_responsavel = (View) findViewById(R.id._bg__tela_responsavel);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		nome_ = (TextView) findViewById(R.id.nome_);
		cpf_ = (TextView) findViewById(R.id.cpf_);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		endere_o_ = (TextView) findViewById(R.id.endere_o_);
		rectangle_9 = (ImageView) findViewById(R.id.rectangle_9);
		rectangle_10 = (ImageView) findViewById(R.id.rectangle_10);
		office_customer_female_light_icon_4 = (ImageView) findViewById(R.id.office_customer_female_light_icon_4);
		v__maria = (TextView) findViewById(R.id.v__maria);
		rectangle_10_ek1 = (View) findViewById(R.id.rectangle_10_ek1);
		rusovas___ems = (TextView) findViewById(R.id.rusovas___ems);
		_1_comprimido___10mg___branco = (TextView) findViewById(R.id._1_comprimido___10mg___branco);
		_10_15 = (TextView) findViewById(R.id._10_15);
		accept_icon_1 = (ImageView) findViewById(R.id.accept_icon_1);
		__colesterol = (TextView) findViewById(R.id.__colesterol);
		pencil_icon_1 = (ImageView) findViewById(R.id.pencil_icon_1);
		bin_2_icon_1 = (ImageView) findViewById(R.id.bin_2_icon_1);
		rectangle_11 = (ImageView) findViewById(R.id.rectangle_11);
		office_customer_female_light_icon_5 = (ImageView) findViewById(R.id.office_customer_female_light_icon_5);
		v__clara = (TextView) findViewById(R.id.v__clara);
		rectangle_10_ek2 = (View) findViewById(R.id.rectangle_10_ek2);
		rusovas___ems_ek1 = (TextView) findViewById(R.id.rusovas___ems_ek1);
		_1_comprimido___10mg___branco_ek1 = (TextView) findViewById(R.id._1_comprimido___10mg___branco_ek1);
		_10_15_ek1 = (TextView) findViewById(R.id._10_15_ek1);
		__colesterol_ek1 = (TextView) findViewById(R.id.__colesterol_ek1);
		pencil_icon_1_ek1 = (ImageView) findViewById(R.id.pencil_icon_1_ek1);
		bin_2_icon_1_ek1 = (ImageView) findViewById(R.id.bin_2_icon_1_ek1);
		_accept_icon_1_ek1 = (ImageView) findViewById(R.id._accept_icon_1_ek1);
		rectangle_22 = (ImageView) findViewById(R.id.rectangle_22);
		_sair = (TextView) findViewById(R.id._sair);
		rectangle_16 = (ImageView) findViewById(R.id.rectangle_16);
		_config_ = (TextView) findViewById(R.id._config_);
	
		
		_accept_icon_1_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_sair.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_config_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_responsavel_1_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	