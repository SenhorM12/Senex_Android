package br.com.fiap.senex

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseManager(context: Context, name: String?) : SQLiteOpenHelper(context,name,null,1)  {

    override fun onCreate(db: SQLiteDatabase?) {

        val CREATE_TABLE = "CREATE TABLE USERS(\n" +
                "\tID_USER INT NOT NULL,\n" +
                "\tNOME VARCHAR(50) NOT NULL,\n" +
                "\tCPF VARCHAR(11),\n" +
                "\tPHONE INT NOT NULL,\n" +
                "\tEMAIL VARCHAR(100) NOT NULL,\n" +
                "\tSENHA VARCHAR(25) NOT NULL,\n" +
                "\tPRIMARY KEY (ID_USER)\n" +
                "\t);"
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db?.execSQL("UPDATE TABLE USERS(\n" +
                "\tID_USER INT NOT NULL,\n" +
                "\tNOME VARCHAR(50) NOT NULL,\n" +
                "\tCPF VARCHAR(30),\n" +
                "\tPHONE INT NOT NULL,\n" +
                "\tEMAIL VARCHAR(100) NOT NULL,\n" +
                "\tSENHA VARCHAR(25) NOT NULL,\n" +
                "\tPRIMARY KEY (ID_USER)\n" +
                "\t);")
    }

    fun createUser(id: Int, nome: String, cpf: String, phone: Int, email: String, senha: String){
        val db = this.writableDatabase

        val cv = ContentValues()

        cv.put("ID_USER", id)
        cv.put("NOME", nome)
        cv.put("CPF", cpf)
        cv.put("PHONE", phone)
        cv.put("EMAIL", email)
        cv.put("SENHA", senha)

        db.insert("USERS","ID_USER",cv)
    }

    fun loginTest(): Cursor {

        val db = this.readableDatabase
        val cur = db.rawQuery("select email,senha from users",null)
        return cur
    }

    fun removeSaudacao(){
        val db = this.writableDatabase
        db.delete("SAUDACAO","ID_SAUDACAO=1",null)
    }
}