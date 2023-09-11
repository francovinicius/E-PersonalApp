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

            val grupamentoUm = binding.grupamento
            val grupamentoUmValor = grupamentoUm.text.toString()

            if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito") {
                treinoPeito()
            } else if (grupamentoUmValor == "Costas" || grupamentoUmValor == "costas") {
                treinoCostas()
            } else if (grupamentoUmValor == "Perna" || grupamentoUmValor == "perna") {
                treinoPerna()
            } else if (grupamentoUmValor == "Triceps" || grupamentoUmValor == "triceps" || grupamentoUmValor == "Tríceps" || grupamentoUmValor == "tríceps") {
                treinoTriceps()
            }

            /*
            else if (grupamentoUmValor == "Biceps" || grupamentoUmValor == "biceps" || grupamentoUmValor == "Bíceps" || grupamentoUmValor == "bíceps") {
                treinoBiceps()
            }

             */





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
                    val exerciciosAleatorios = TreinoPeito.treinoDefinicao().take(5)

                    // Crie uma string para armazenar a lista de exercícios formatados
                    val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                        "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                    }

                    // Exiba os exercícios gerados na TextView textTreinoGerado
                    textTreinoGerado.text = exerciciosFormatados
                }
                else if (grupamentoUmValor == "Peito" || grupamentoUmValor == "peito" && objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                    // Obtenha o ArrayList de exercícios de Definicao
                    val exerciciosEmagrecimento = TreinoPeito.treinoEmagrecimento()

                    // Embaralhe a lista para obter exercícios aleatórios
                    exerciciosEmagrecimento.shuffle()

                    // Pegue os primeiros 5 exercícios da lista (aleatórios)
                    val exerciciosAleatorios = TreinoPeito.treinoEmagrecimento().take(5)

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

    private fun treinoCostas() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamento
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoCostas.treinoHipertrofiaCostas()

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

            else if (objetivoValor == "Definição" || objetivoValor == "Definicao" ||
                objetivoValor == "Definicão" || objetivoValor == "Definiçao" || objetivoValor == "definição" || objetivoValor == "definicao" ||
                objetivoValor == "definicão" || objetivoValor == "definiçao")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoCostas.treinoDefinicaoCostas()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoCostas.treinoDefinicaoCostas().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoCostas.treinoEmagrecimentoCostas()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoCostas.treinoEmagrecimentoCostas().take(5)

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

    private fun treinoPerna() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamento
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoPerna.treinoHipertrofiaPernas()

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

            else if (objetivoValor == "Definição" || objetivoValor == "Definicao" ||
                objetivoValor == "Definicão" || objetivoValor == "Definiçao" || objetivoValor == "definição" || objetivoValor == "definicao" ||
                objetivoValor == "definicão" || objetivoValor == "definiçao")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoPerna.treinoDefinicaoPernas()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoPerna.treinoDefinicaoPernas().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoPerna.treinoEmagrecimentoPernas()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoPerna.treinoEmagrecimentoPernas().take(5)

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

    private fun treinoTriceps() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamento
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoTriceps.treinoHipertrofiaTriceps()

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

            else if (objetivoValor == "Definição" || objetivoValor == "Definicao" ||
                objetivoValor == "Definicão" || objetivoValor == "Definiçao" || objetivoValor == "definição" || objetivoValor == "definicao" ||
                objetivoValor == "definicão" || objetivoValor == "definiçao")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoTriceps.treinoDefinicaoTriceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoTriceps.treinoDefinicaoTriceps().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoTriceps.treinoEmagrecimentoTriceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoTriceps.treinoEmagrecimentoTriceps().take(5)

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
    /*
    private fun treinoBiceps() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamento
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoTriceps.treinoHipertrofiaTriceps()

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

            else if (objetivoValor == "Definição" || objetivoValor == "Definicao" ||
                objetivoValor == "Definicão" || objetivoValor == "Definiçao" || objetivoValor == "definição" || objetivoValor == "definicao" ||
                objetivoValor == "definicão" || objetivoValor == "definiçao")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoTriceps.treinoDefinicaoTriceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoTriceps.treinoDefinicaoTriceps().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoTriceps.treinoEmagrecimentoTriceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoTriceps.treinoEmagrecimentoTriceps().take(5)

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

     */
}


