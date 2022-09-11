package br.com.fiap.senex

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseManager(context: Context, name: String?) : SQLiteOpenHelper(context,name,null,1)  {

    override fun onCreate(p0: SQLiteDatabase?) {

        val CREATE_TABLE = "CREATE TABLE USERS(\n" +
                "\tID_USER INT NOT NULL,\n" +
                "\tNOME VARCHAR(50) NOT NULL,\n" +
                "\tCPF VARCHAR(11),\n" +
                "\tPHONE INT NOT NULL,\n" +
                "\tEMAIL VARCHAR(100) NOT NULL,\n" +
                "\tSENHA VARCHAR(25) NOT NULL,\n" +
                "\tPRIMARY KEY (ID_USER)\n" +
                "\t);"
        p0?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL("DROP TABLE IF EXISTS USERS")

        p0?.execSQL("CREATE TABLE USERS(\n" +
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

    fun loginTest(i: String, param: Any?): Cursor {

        val db = this.readableDatabase
        val cur = db.rawQuery("select email,senha from users",null)
        return cur
    }

//    fun registerUser(){
//        val db = this.writableDatabase
//        db.execSQL("INSERT INTO USERS(ID_USER, NOME, CPF, PHONE, EMAIL, SENHA) VALUES (ROWID, ?, ?, ?, ?, ?)")
//    }
}