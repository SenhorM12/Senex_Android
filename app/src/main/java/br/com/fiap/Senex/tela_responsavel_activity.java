package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;

import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;

public class tela_responsavel_activity extends AppCompatActivity {


	private View _bg__tela_responsavel;
	private ImageView cor_de_fundo;
	private TextView nome_resp;
	private TextView cpf_resp;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextView number_resp;
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
	private Button add_prt;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_responsavel);


		_bg__tela_responsavel = (View) findViewById(R.id._bg__tela_responsavel);
		cor_de_fundo = (ImageView) findViewById(R.id.cor_de_fundo);
		nome_resp = (TextView) findViewById(R.id.nome_resp);
		cpf_resp = (TextView) findViewById(R.id.cpf_resp);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		number_resp = (TextView) findViewById(R.id.number_resp);
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
		sair_resp = (Button) findViewById(R.id.sair_resp);
		add_prt = (Button) findViewById(R.id.add_prt);

		String data = this.retrieveUser("user");
		StringTokenizer tokenizer = new StringTokenizer(data, ":");
		String nome = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "Responsável";
		String cpf = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
		String number = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
		nome_resp.setText((CharSequence)nome);
		cpf_resp.setText((CharSequence)cpf);
		number_resp.setText((CharSequence)number);

		String data1 = this.retrieveUser1("protegido");
		StringTokenizer tokenizer1 = new StringTokenizer(data1, ":");
		String nome1 = tokenizer1.hasMoreTokens() ? tokenizer1.nextToken() : "";
		nome_resp_add.setText((CharSequence)nome1);

		String data2 = this.retrieveUser2("paciente");
		StringTokenizer tokenizer2 = new StringTokenizer(data2, ":");
		String horario = tokenizer2.hasMoreTokens() ? tokenizer2.nextToken() : "";
		String remedio = tokenizer2.hasMoreTokens() ? tokenizer2.nextToken() : "";
		String quantidade = tokenizer2.hasMoreTokens() ? tokenizer2.nextToken() : "";
		String receita = tokenizer2.hasMoreTokens() ? tokenizer2.nextToken() : "";
		horario_med.setText((CharSequence)horario + "Hr");
		rusovas___ems.setText((CharSequence)remedio);
		comprimido_resp.setText((CharSequence)quantidade);
		motivo_med.setText((CharSequence)receita);


		sair_resp.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);


			}
		});


		add_prt.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_paciente_1_2_activity.class);
				startActivity(nextScreen);


			}
		});

	}
	@NotNull
	public final String retrieveUser(@NotNull String filename) {
		Intrinsics.checkNotNullParameter(filename, "filename");

		try {
			FileInputStream fi = this.openFileInput(filename);
			Intrinsics.checkNotNullExpressionValue(fi, "fi");
			byte[] data = ByteStreamsKt.readBytes((InputStream)fi);
			fi.close();
			data.toString();
			Charset var10000 = Charset.defaultCharset();
			Intrinsics.checkNotNullExpressionValue(var10000, "Charset.defaultCharset()");
			Charset var5 = var10000;
			return new String(data, var5);
		} catch (FileNotFoundException var6) {
			return "";
		} catch (IOException var7) {
			return "";
		}
	}

	@NotNull
	public final String retrieveUser1(@NotNull String filename) {
		Intrinsics.checkNotNullParameter(filename, "filename");

		try {
			FileInputStream fi1 = this.openFileInput(filename);
			Intrinsics.checkNotNullExpressionValue(fi1, "fi1");
			byte[] data1 = ByteStreamsKt.readBytes((InputStream)fi1);
			fi1.close();
			data1.toString();
			Charset var10000 = Charset.defaultCharset();
			Intrinsics.checkNotNullExpressionValue(var10000, "Charset.defaultCharset()");
			Charset var5 = var10000;
			return new String(data1, var5);
		} catch (FileNotFoundException var6) {
			return "";
		} catch (IOException var7) {
			return "";
		}
	}

	@NotNull
	public final String retrieveUser2(@NotNull String filename) {
		Intrinsics.checkNotNullParameter(filename, "filename");

		try {
			FileInputStream fi2 = this.openFileInput(filename);
			Intrinsics.checkNotNullExpressionValue(fi2, "fi2");
			byte[] data2 = ByteStreamsKt.readBytes((InputStream)fi2);
			fi2.close();
			data2.toString();
			Charset var10000 = Charset.defaultCharset();
			Intrinsics.checkNotNullExpressionValue(var10000, "Charset.defaultCharset()");
			Charset var5 = var10000;
			return new String(data2, var5);
		} catch (FileNotFoundException var6) {
			return "";
		} catch (IOException var7) {
			return "";
		}
	}
}

	