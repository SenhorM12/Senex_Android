package br.com.fiap.senex

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.FileNotFoundException
import java.io.IOException
import java.nio.charset.Charset
import java.util.*

class Teste : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.tela_responsavel)

            val horario_med: TextView = findViewById(R.id.horario_med)
            val rusovas___ems: TextView = findViewById(R.id.rusovas___ems)
            val comprimido_resp: TextView = findViewById(R.id.comprimido_resp)
            val motivo_med: TextView = findViewById(R.id.motivo_med)
            val data2 = retrieveUser2("paciente")

            val tokenizer2 = StringTokenizer(data2, ":")
            val horario = if (tokenizer2.hasMoreTokens()) tokenizer2.nextToken() else ""
            val remedio = if (tokenizer2.hasMoreTokens()) tokenizer2.nextToken() else ""
            val quantidade = if (tokenizer2.hasMoreTokens()) tokenizer2.nextToken() else ""
            val receita = if (tokenizer2.hasMoreTokens()) tokenizer2.nextToken() else ""
            horario_med.text = horario
            rusovas___ems.text = remedio
            comprimido_resp.text = quantidade
            motivo_med.text = receita


/*            registerButton.setOnClickListener(View.OnClickListener {

                val data = usernameBox.text.toString() + ":" + cpfBox.text.toString() + ":" + telefoneBox.text.toString() + ":" + userEmailBox.text.toString() + ":" + senhaBox1_1.text.toString()
                createUser("users", data)

            })

        }
    fun createUser(filename: String, data: String){
        try {
            val fs = openFileOutput(filename, Context.MODE_PRIVATE);

            fs.write(data.toByteArray())
            fs.close()
        }
        catch (e: FileNotFoundException) {
            Log.i("createUser", "FileNotFoundException")
        }
        catch (e: IOException) {
            Log.i("createUser", "IOException")
        }*/



        }
    fun retrieveUser2(filename: String): String {
        try {
            val fi2 = openFileInput(filename)
            val data2 = fi2.readBytes()

            fi2.close()

            data2.toString()

            return data2.toString(Charset.defaultCharset())
        }
        catch (e: FileNotFoundException){
            return ""
        }
        catch (e: IOException){
            return ""
        }
    }
}