package com.simpletask.e_personal


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.simpletask.e_personal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val btnGerar = binding.btnGerar
        val progressBar = binding.progressBar


        btnGerar.setOnClickListener {
            progressBar.isVisible = true

            treinoPeito()


        }


}
    private fun treinoPeito() {

            val objetivo = binding.objetivo
            val grupamentoUm = binding.grupamento
            val progressBar = binding.progressBar
            val layoutTreinoGerado = binding.layoutTreinoGerado

            val handler = Handler(Looper.getMainLooper())

            val objetivoValor = objetivo.text.toString()
            val grupamentoUmValor = grupamentoUm.text.toString()
            val textTreinoGerado = binding.textTreinoGerado

            handler.postDelayed({

                if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito" && objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                    // Obtenha o ArrayList de exercícios de hipertrofia
                    val exerciciosHipertrofia = TreinoPeito.treinoHipertrofia()

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
                    val exerciciosDefinicao = TreinoPeito.treinoDefinicao()

                    // Embaralhe a lista para obter exercícios aleatórios
                    exerciciosDefinicao.shuffle()

                    // Pegue os primeiros 5 exercícios da lista (aleatórios)
                    val exerciciosAleatorios = TreinoPeito.treinoEmagrecimento().take(5)

                    // Crie uma string para armazenar a lista de exercícios formatados
                    val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                        "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                    }

                    // Exiba os exercícios gerados na TextView textTreinoGerado
                    textTreinoGerado.text = exerciciosFormatados
                }
                else if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito" && objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                    // Obtenha o ArrayList de exercícios de Definicao
                    val exerciciosEmagrecimento = TreinoPeito.treinoDefinicao()

                    // Embaralhe a lista para obter exercícios aleatórios
                    exerciciosEmagrecimento.shuffle()

                    // Pegue os primeiros 5 exercícios da lista (aleatórios)
                    val exerciciosAleatorios = TreinoPeito.treinoDefinicao().take(5)

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
            }, 3000)

        }
}


