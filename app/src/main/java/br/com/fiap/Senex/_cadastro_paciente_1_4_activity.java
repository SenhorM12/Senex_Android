package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;

import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public class _cadastro_paciente_1_4_activity extends AppCompatActivity {


	private View _bg____cadastro_paciente_1_4;
	private ImageView cor_de_fundo;
	private TextView nome1_4;
	private TextView cpf1_4;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextView phone1_4;
	private ImageView rectangle_9;
	private TextView titleText;
	private ImageView saude_1;
	private TextInputEditText receitaBox;
	private TextInputEditText timeBox;
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
		phone1_4 = (TextView) findViewById(R.id.phone1_4);
		rectangle_9 = (ImageView) findViewById(R.id.rectangle_9);
		titleText = (TextView) findViewById(R.id.titleText);
		saude_1 = (ImageView) findViewById(R.id.saude_1);
		receitaBox = (TextInputEditText) findViewById(R.id.receitaBox);
		timeBox = (TextInputEditText) findViewById(R.id.timeBox);
		medBox = (TextInputEditText) findViewById(R.id.medBox);
		qtBox = (TextInputEditText) findViewById(R.id.qtBox);
		endButton1_4 = (Button) findViewById(R.id.endButton1_4);

		String data = this.retrieveUser("user");
		StringTokenizer tokenizer = new StringTokenizer(data, ":");
		String nome = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "Responsável";
		String cpf = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
		String number = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
		nome1_4.setText((CharSequence)nome);
		cpf1_4.setText((CharSequence)cpf);
		phone1_4.setText((CharSequence)number);


		endButton1_4.setOnClickListener(new View.OnClickListener() {
			public final void onClick(View it) {
				String data = timeBox.getText() + ":" + medBox.getText() + ":" + qtBox.getText() + ":" + receitaBox.getText();
				br.com.fiap.senex._cadastro_paciente_1_4_activity.this.createPaciente("paciente", data);
			}
		});
	}

	public final void createPaciente(@NotNull String filename, @NotNull String data) {
		Intrinsics.checkNotNullParameter(filename, "filename");
		Intrinsics.checkNotNullParameter(data, "data");

		try {
			FileOutputStream fs = this.openFileOutput(filename, 0);
			Charset var5 = Charsets.UTF_8;
			byte[] var10001 = data.getBytes(var5);
			Intrinsics.checkNotNullExpressionValue(var10001, "this as java.lang.String).getBytes(charset)");
			fs.write(var10001);
			fs.close();
		} catch (FileNotFoundException var6) {
			Log.i("createPaciente", "FileNotFoundException");
		} catch (IOException var7) {
			Log.i("createPaciente", "IOException");
		}

		Intent nextScreen = new Intent(getApplicationContext(), tela_responsavel_activity.class);
		startActivity(nextScreen);
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

}
	
	