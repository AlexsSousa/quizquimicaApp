package com.example.appquimica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val radio = findViewById<RadioGroup>(R.id.radioGroupID)as RadioGroup

        val buttonResultado = findViewById<Button>(R.id.btnResultadoId)

        var respostaa = 0

        fun zerarResposta(resposta: Int): Int { // zerar resultados
            var resposta = 0
            return resposta
        }

        radio.setOnCheckedChangeListener{ group, checkedid ->

            when (checkedid){
                R.id.answer1->{
                    zerarResposta(respostaa)
                    respostaa = 1
                }
                R.id.answer2->{
                    zerarResposta(respostaa)
                    respostaa = 2
                }
                R.id.answer3->{
                    zerarResposta(respostaa)
                    respostaa = 3
                }
                R.id.answer4->{
                    zerarResposta(respostaa)
                    respostaa = 4
                }
            }
        }

        buttonResultado.setOnClickListener {

            if (respostaa == 1){
                Toast.makeText(this, "Resposta Certa", Toast.LENGTH_LONG).show()
            }else if (respostaa == 2){
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_LONG).show()
            }else if (respostaa == 3){
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_LONG).show()
            }else if (respostaa == 4){
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Selecione uma Resposta", Toast.LENGTH_LONG).show()
            }

        }

    }
}