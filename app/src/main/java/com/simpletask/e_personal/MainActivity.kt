package com.simpletask.e_personal


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ArrayAdapter
import android.widget.Spinner
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

        //Selecioar as Spinners
        objetivoSpinner()
        grupamentoSpinnerUm()
        grupamentoSpinnerDois()



        val btnGerar = binding.btnGerar
        val progressBar = binding.progressBar


        btnGerar.setOnClickListener {
            progressBar.isVisible = true

            grupamentoUm()
            grupamentoDois()

        }


}

    //selecionadores dos grupamentos
    private fun grupamentoUm() {
        val textTreinoGerado = binding.textTreinoGerado
        val grupamentoUm = binding.grupamentoSpinner
        val grupamentoUmValor = grupamentoUm.selectedItem.toString()

        if (grupamentoUmValor == "Peito") {
            treinoPeito()
        } else if (grupamentoUmValor == "Costas") {
            treinoCostas()
        } else if (grupamentoUmValor == "Quadríceps") {
            treinoQuadriceps()
        }else if (grupamentoUmValor == "Posterior") {
            treinoPosterior()
        }else {
            val mensagemNaoEncontrado = "Valor não encontrado"
            textTreinoGerado.text = mensagemNaoEncontrado
        }
    }

    private fun grupamentoDois() {
            val textTreinoGerado = binding.textTreinoGerado
            val grupamentoUm = binding.grupamentoSpinnerDois
            val grupamentoUmValor = grupamentoUm.selectedItem.toString()

            if (grupamentoUmValor == "Glúteo") {
                treinoGluteo()
            } else if (grupamentoUmValor == "Ombros") {
                treinoOmbro()
            } else if (grupamentoUmValor == "Tríceps") {
                treinoTriceps()
            }else if (grupamentoUmValor == "Bíceps") {
                treinoBiceps()
            }            else {
                val mensagemNaoEncontrado = "Valor não encontrado"
                textTreinoGerado.text = mensagemNaoEncontrado
            }
        }


    //Chamar os spinners
    private fun grupamentoSpinnerUm()
    {
        val muscleGroupSpinner: Spinner = binding.grupamentoSpinner

        // Definindo as opções do Spinner em um ArrayAdapter
        val muscleGroupOptions = arrayOf("Selecione o Grupamento:", "Peito", "Costas", "Quadríceps", "Posterior")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, muscleGroupOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        muscleGroupSpinner.adapter = adapter
    }

    private fun grupamentoSpinnerDois()
    {
        val muscleGroupSpinner: Spinner = binding.grupamentoSpinnerDois

        // Definindo as opções do Spinner em um ArrayAdapter
        val muscleGroupOptions = arrayOf("Selecione o Grupamento:", "Glúteo", "Ombros", "Tríceps", "Bíceps")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, muscleGroupOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        muscleGroupSpinner.adapter = adapter
    }

    private fun objetivoSpinner() {
        val objetiveGroupSpinner: Spinner = binding.objetivoSpinner

        // Definindo as opções do Spinner em um ArrayAdapter
        val objetiveGroupOptions = arrayOf("Selecione o objetivo:", "Hipertrofia", "Definição", "Emagrecimento")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, objetiveGroupOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        objetiveGroupSpinner.adapter = adapter
    }

    //treinos
    private fun treinoPeito() {

            val objetivo = binding.objetivoSpinner
            val progressBar = binding.progressBar
            val layoutTreinoGerado = binding.layoutTreinoGerado
            val handler = Handler(Looper.getMainLooper())

            val objetivoValor = objetivo.selectedItem.toString()
            val textTreinoGerado = binding.textTreinoGerado

            handler.postDelayed({

                if (objetivoValor == "Hipertrofia") {
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
                else if (objetivoValor == "Definição")   {
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
                else if (objetivoValor == "Emagrecimento") {
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
        val objetivo = binding.objetivoSpinner

        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado
        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
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

            else if (objetivoValor == "Definição")   {
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

            else if (objetivoValor == "Emagrecimento") {
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

    private fun treinoQuadriceps() {
        val objetivo = binding.objetivoSpinner

        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado
        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoQuadriceps.treinoQuadricepsHipertrofia()

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

            else if (objetivoValor == "Definição")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoQuadriceps.treinoQuadricepsDefinicao()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoQuadriceps.treinoQuadricepsDefinicao().take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoQuadriceps.treinoQuadricepsEmagrecimento()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = TreinoQuadriceps.treinoQuadricepsEmagrecimento().take(5)

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

    private fun treinoPosterior() {
        val objetivo = binding.objetivoSpinner

        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.layoutTreinoGerado
        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGerado

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoPosteriorCoxa.treinoPosteriorCoixaHipertrofia()

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

            else if (objetivoValor == "Definição")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoPosteriorCoxa.treinoPosteriorCoxaDefinicao()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = exerciciosDefinicao.take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoPosteriorCoxa.treinoPosteriorCoxaEmagrecimento()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = exerciciosEmagrecimento.take(5)

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

    private fun treinoGluteo() {
        val objetivo = binding.objetivoSpinner
        val grupamentoUm = binding.grupamentoSpinnerDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois
        val handler = Handler(Looper.getMainLooper())
        val objetivoValor = objetivo.selectedItem.toString()
        val grupamentoUmValor = grupamentoUm.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoGluteos.treinoGluteosHipertrofia()

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

            else if (objetivoValor == "Definição")   {
                // Obtenha o ArrayList de exercícios de emagrecimento
                val exerciciosDefinicao = TreinoGluteos.treinoGluteosDefinicao()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosDefinicao.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = exerciciosDefinicao.take(5)

                // Crie uma string para armazenar a lista de exercícios formatados
                val exerciciosFormatados = exerciciosAleatorios.joinToString("\n") {
                    "Exercício: ${it.nome}\nSéries: ${it.series}\nRepetições: ${it.repeticoes}\n"
                }

                // Exiba os exercícios gerados na TextView textTreinoGerado
                textTreinoGerado.text = exerciciosFormatados
            }

            else if (objetivoValor == "Emagrecimento") {
                // Obtenha o ArrayList de exercícios de Definicao
                val exerciciosEmagrecimento = TreinoGluteos.treinoGluteosEmagrecimento()

                // Embaralhe a lista para obter exercícios aleatórios
                exerciciosEmagrecimento.shuffle()

                // Pegue os primeiros 5 exercícios da lista (aleatórios)
                val exerciciosAleatorios = exerciciosEmagrecimento.take(5)

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
        val objetivo = binding.objetivoSpinner
        val grupamentoUm = binding.grupamentoSpinnerDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.selectedItem.toString()
        val grupamentoUmValor = grupamentoUm.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
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

            else if (objetivoValor == "Definição")   {
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

            else if (objetivoValor == "Emagrecimento") {
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
        val objetivo = binding.objetivoSpinner
        val grupamentoUm = binding.grupamentoSpinnerDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.selectedItem.toString()
        val grupamentoUmValor = grupamentoUm.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
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

            else if (objetivoValor == "Definição")   {
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

            else if (objetivoValor == "Emagrecimento") {
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
        val objetivo = binding.objetivoSpinner
        val grupamentoUm = binding.grupamentoSpinnerDois
        val progressBar = binding.progressBar
        val layoutTreinoGerado = binding.textTreinoGeradoDois

        val handler = Handler(Looper.getMainLooper())

        val objetivoValor = objetivo.selectedItem.toString()
        val grupamentoUmValor = grupamentoUm.selectedItem.toString()
        val textTreinoGerado = binding.textTreinoGeradoDois

        handler.postDelayed({

            if (objetivoValor == "Hipertrofia") {
                // Obtenha o ArrayList de exercícios de hipertrofia
                val exerciciosHipertrofia = TreinoOmbro.treinoHipertrofiaOmbro()

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

            else if (objetivoValor == "Definição")   {
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

            else if (objetivoValor == "Emagrecimento") {
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


