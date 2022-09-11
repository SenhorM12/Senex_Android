package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tela_responsavel_activity extends AppCompatActivity {


	private View _bg__tela_responsavel;
	private ImageView cor_de_fundo;
	private TextView nome_resp;
	private TextView cpf_resp;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextView adress_resp;
	private ImageView rectangle_9;
	private ImageView office_customer_female_light_icon_4;
	private TextView nome_resp_add;
	private View rectangle_10_ek1;
	private TextView rusovas___ems;
	private TextView comprimido_resp;
	private TextView horario_med;
	private ImageView accept_icon_1;
	private TextView motivo_med;
	private ImageView pencil_icon_1;
	private ImageView bin_2_icon_1;
	private ImageView rectangle_11;
	private ImageView office_customer_female_light_icon_5;
	private TextView nome_resp_2;
	private View rectangle_10_ek2;
	private TextView rusovas___ems_ek1;
	private TextView comprimido_resp_2;
	private TextView horario_med_2;
	private TextView motivo_med_2;
	private ImageView pencil_icon_1_ek1;
	private ImageView bin_2_icon_1_ek1;
	private ImageView _accept_icon_1_ek1;
	private Button sair_resp;
	private Button config_resp;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_responsavel);


		_bg__tela_responsavel = (View) findViewById(R.id._bg__tela_responsavel);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		nome_resp = (TextView) findViewById(R.id.nome_resp);
		cpf_resp = (TextView) findViewById(R.id.cpf_resp);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		adress_resp = (TextView) findViewById(R.id.adress_resp);
		rectangle_9 = (ImageView) findViewById(R.id.rectangle_9);
		office_customer_female_light_icon_4 = (ImageView) findViewById(R.id.office_customer_female_light_icon_4);
		nome_resp_add = (TextView) findViewById(R.id.nome_resp_add);
		rectangle_10_ek1 = (View) findViewById(R.id.rectangle_10_ek1);
		rusovas___ems = (TextView) findViewById(R.id.rusovas___ems);
		comprimido_resp = (TextView) findViewById(R.id.comprimido_resp);
		horario_med = (TextView) findViewById(R.id.horario_med);
		accept_icon_1 = (ImageView) findViewById(R.id.accept_icon_1);
		motivo_med = (TextView) findViewById(R.id.motivo_med);
		pencil_icon_1 = (ImageView) findViewById(R.id.pencil_icon_1);
		bin_2_icon_1 = (ImageView) findViewById(R.id.bin_2_icon_1);
		rectangle_11 = (ImageView) findViewById(R.id.rectangle_11);
		office_customer_female_light_icon_5 = (ImageView) findViewById(R.id.office_customer_female_light_icon_5);
		nome_resp_2 = (TextView) findViewById(R.id.nome_resp_2);
		rectangle_10_ek2 = (View) findViewById(R.id.rectangle_10_ek2);
		rusovas___ems_ek1 = (TextView) findViewById(R.id.rusovas___ems_ek1);
		comprimido_resp_2 = (TextView) findViewById(R.id.comprimido_resp_2);
		horario_med_2 = (TextView) findViewById(R.id.horario_med_2);
		motivo_med_2 = (TextView) findViewById(R.id.motivo_med_2);
		pencil_icon_1_ek1 = (ImageView) findViewById(R.id.pencil_icon_1_ek1);
		bin_2_icon_1_ek1 = (ImageView) findViewById(R.id.bin_2_icon_1_ek1);
		_accept_icon_1_ek1 = (ImageView) findViewById(R.id._accept_icon_1_ek1);
		sair_resp = (Button) findViewById(R.id.sair_resp);
		config_resp = (Button) findViewById(R.id.config_resp);


		_accept_icon_1_ek1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
				startActivity(nextScreen);


			}
		});


		sair_resp.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);


			}
		});


		config_resp.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_responsavel_1_1_activity.class);
				startActivity(nextScreen);


			}
		});

	}
}
	