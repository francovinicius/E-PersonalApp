package com.simpletask.e_personal


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.simpletask.e_personal.TreinoPeito.Companion.treinoDefinicao
import com.simpletask.e_personal.TreinoPeito.Companion.treinoEmagrecimento
import com.simpletask.e_personal.TreinoPeito.Companion.treinoHipertrofia
import com.simpletask.e_personal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val apiKey = "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"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamento
        val btnGerar = binding.btnGerar
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado

        btnGerar.setOnClickListener {
            progressBar.isVisible = true

            val objetivoValor = objetivo.text.toString()
            val grupamentoUmValor = grupamentoUm.text.toString()
            val textTreinoGerado = binding.textTreinoGerado

            if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito" && objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = treinoHipertrofia()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosHipertrofia.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = exerciciosHipertrofia.take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }
            else if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito" && objetivoValor == "Definição" || objetivoValor == "Definicao" ||
                objetivoValor == "Definicão" || objetivoValor == "Definiçao" || objetivoValor == "definição" || objetivoValor == "definicao" ||
                objetivoValor == "definicão" || objetivoValor == "definiçao")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosEmagrecimento = treinoEmagrecimento()

                // Embaralhe a lista para obter exercícios aleatórios
                treinoEmagrecimento().shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = treinoEmagrecimento().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }
            else if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito" && objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = treinoDefinicao()

                // Embaralhe a lista para obter exercícios aleatórios
                treinoDefinicao().shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = treinoDefinicao().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }
            else {
                val mensagemNaoEncontrado = "Valor não encontrado"
                textTreinoGerado.text = mensagemNaoEncontrado
            }


            progressBar.isVisible = false
            layoutTreinoGerado.isVisible = true
        }

    }
}


