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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public class _cadastro_responsavel_1_1_activity extends AppCompatActivity {

	
	private View _bg____cadastro_responsavel_1_1_ek2;
	private ImageView cor_de_fundo_ek1;
	private TextView username;
	private TextView telefone;
	private TextView userEmail;
	private TextView senha1_1;
	private TextView cpf;
	private ImageView homem_perfil_caricatura_18591_58482_1;
	private TextInputEditText usernameBox;
	private TextInputEditText cpfBox;
	private TextInputEditText telefoneBox;
	private TextInputEditText userEmailBox;
	private TextInputEditText senhaBox1_1;
	private Button registerButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._cadastro_responsavel_1_1);

		
		_bg____cadastro_responsavel_1_1_ek2 = (View) findViewById(R.id._bg____cadastro_responsavel_1_1_ek2);
		cor_de_fundo_ek1 = (ImageView) findViewById(R.id.cor_de_fundo_ek1);
		username = (TextView) findViewById(R.id.username);
		telefone = (TextView) findViewById(R.id.telefone);
		userEmail = (TextView) findViewById(R.id.userEmail);
		senha1_1 = (TextView) findViewById(R.id.senha1_1);
		cpf = (TextView) findViewById(R.id.cpf);
		homem_perfil_caricatura_18591_58482_1 = (ImageView) findViewById(R.id.homem_perfil_caricatura_18591_58482_1);
		usernameBox = (TextInputEditText) findViewById(R.id.usernameBox);
		cpfBox = (TextInputEditText) findViewById(R.id.cpfBox);
		telefoneBox = (TextInputEditText) findViewById(R.id.telefoneBox);
		userEmailBox = (TextInputEditText) findViewById(R.id.userEmailBox);
		senhaBox1_1 = (TextInputEditText) findViewById(R.id.senhaBox1_1);
		registerButton = (Button) findViewById(R.id.registerButton);


		registerButton.setOnClickListener(new View.OnClickListener() {
			public final void onClick(View it) {
				String data = usernameBox.getText() + ":" + cpfBox.getText() + ":" + telefoneBox.getText() + ":" + userEmailBox.getText() + ":" + senhaBox1_1.getText();
				_cadastro_responsavel_1_1_activity.this.createUser("users", data);
			}
		});
	}

		public final void createUser(@NotNull String filename, @NotNull String data) {
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
					Log.i("createUser", "FileNotFoundException");
				} catch (IOException var7) {
					Log.i("createUser", "IOException");
				}

				Intent nextScreen = new Intent(getApplicationContext(), _cadastro_paciente_1_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		}
	