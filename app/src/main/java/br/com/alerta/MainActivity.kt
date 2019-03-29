package br.com.alerta

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_alerta.setOnClickListener {
            //Criar alerta
            val alerta = AlertDialog.Builder(this)

            //Adicionando titulo
            alerta.setTitle("Alerta!")

            //Adicionando mensagem!
            alerta.setMessage("Olá usuário")

            //Adicionando botão Positivo
            alerta.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->

            })

            //Adicionar Negativo
            alerta.setNegativeButton("Não OK", null)

            //Adicionar Neutro
            alerta.setNeutralButton("Cancelar", null)

            //Impedir o usuario de clicar fora do alert
            alerta.setCancelable(false)
            
            //Executar o Alerta
            alerta.create().show()
        }
    }
}
