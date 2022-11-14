package br.com.fiap.senex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

import br.com.fiap.senex.adapter.ListPacotesAdapter;
import br.com.fiap.senex.dao.PacoteDAO;
import br.com.fiap.senex.model.Pacote;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;

public class tela_responsavel_activity extends AppCompatActivity {


	private TextView nome_resp;
	private TextView cpf_resp;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private ListView list_pacotes_listview;
	private Button sair_resp;
	private Button add_prt;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_responsavel);


		nome_resp = (TextView) findViewById(R.id.nome_resp);
		cpf_resp = (TextView) findViewById(R.id.cpf_resp);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		sair_resp = (Button) findViewById(R.id.sair_resp);
		add_prt = (Button) findViewById(R.id.add_prt);
		list_pacotes_listview = (ListView) findViewById(R.id.list_pacotes_listview);

		List<Pacote> pacotes = new PacoteDAO().lista();

		list_pacotes_listview.setAdapter(new ListPacotesAdapter(pacotes, this));


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

	