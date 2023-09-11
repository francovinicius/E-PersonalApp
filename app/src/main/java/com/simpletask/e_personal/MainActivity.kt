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

            grupamentoUm()
            grupamentoDois()

        }


}

    private fun grupamentoUm() {
        val textTreinoGerado = binding.textTreinoGerado
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
        } else if (grupamentoUmValor == "Biceps" || grupamentoUmValor == "biceps" || grupamentoUmValor == "Bíceps" || grupamentoUmValor == "bíceps") {
            treinoBiceps()
        } else if (grupamentoUmValor == "Ombro" || grupamentoUmValor == "ombro") {
            treinoOmbro()
        }else {
            val mensagemNaoEncontrado = "Valor não encontrado"
            textTreinoGerado.text = mensagemNaoEncontrado
        }
    }

    private fun grupamentoDois() {
        val textTreinoGerado = binding.textTreinoGeradoDois
        val grupamentoDois = binding.grupamentoDois
        val grupamentoDoisValor = grupamentoDois.text.toString()

        if (grupamentoDoisValor == "Peito" || grupamentoDoisValor == "peito") {
            treinoPeitoDois()
        } else if (grupamentoDoisValor == "Costas" || grupamentoDoisValor == "costas") {
            treinoCostasDois()
        } else if (grupamentoDoisValor == "Perna" || grupamentoDoisValor == "perna") {
            treinoPernaDois()
        } else if (grupamentoDoisValor == "Triceps" || grupamentoDoisValor == "triceps" || grupamentoDoisValor == "Tríceps" || grupamentoDoisValor == "tríceps") {
            treinoTricepsDois()
        } else if (grupamentoDoisValor == "Biceps" || grupamentoDoisValor == "biceps" || grupamentoDoisValor == "Bíceps" || grupamentoDoisValor == "bíceps") {
            treinoBicepsDois()
        } else if (grupamentoDoisValor == "Ombro" || grupamentoDoisValor == "ombro") {
            treinoOmbroDois()
        }else {
            val mensagemNaoEncontrado = "Valor não encontrado"
            textTreinoGerado.text = mensagemNaoEncontrado
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
                val exerciciosHipertrofia = TreinoBiceps.treinoHipertrofiaBiceps()

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
                val exerciciosDefinicao = TreinoBiceps.treinoDefinicaoBiceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoBiceps.treinoDefinicaoBiceps().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoBiceps.treinoEmagrecimentoBiceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoBiceps.treinoEmagrecimentoBiceps().take(5)

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

    private fun treinoOmbro() {
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
                val exerciciosDefinicao = TreinoOmbro.treinoDefinicaoOmbro()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoOmbro.treinoDefinicaoOmbro().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoOmbro.treinoEmagrecimentoOmbro()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoOmbro.treinoEmagrecimentoOmbro().take(5)

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


    private fun treinoPeitoDois() {

        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamentoDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

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

    private fun treinoCostasDois() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamentoDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

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

    private fun treinoPernaDois() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamentoDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

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

    private fun treinoTricepsDois() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamentoDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

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

    private fun treinoBicepsDois() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamentoDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia" || objetivoValor == "hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoBiceps.treinoHipertrofiaBiceps()

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
                val exerciciosDefinicao = TreinoBiceps.treinoDefinicaoBiceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoBiceps.treinoDefinicaoBiceps().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoBiceps.treinoEmagrecimentoBiceps()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoBiceps.treinoEmagrecimentoBiceps().take(5)

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

    private fun treinoOmbroDois() {
        val objetivo = binding.objetivo
        val grupamentoUm = binding.grupamentoDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.text.toString()
        val grupamentoUmValor = grupamentoUm.text.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

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
                val exerciciosDefinicao = TreinoOmbro.treinoDefinicaoOmbro()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoOmbro.treinoDefinicaoOmbro().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento" || objetivoValor == "emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoOmbro.treinoEmagrecimentoOmbro()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoOmbro.treinoEmagrecimentoOmbro().take(5)

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


