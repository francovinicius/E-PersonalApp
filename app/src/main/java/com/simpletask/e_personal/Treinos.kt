package com.simpletask.e_personal

import com.simpletask.e_personal.Exercicio as Exercicio1

data class Exercicio(val nome: String, val series: Int, val repeticoes: String)

class TreinoPeito {
    companion object {
        fun treinoEmagrecimento(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Supino Inclinado com Barra", 3, "12-15"),
                Exercicio1("Supino Declinado com Halteres", 3, "12-15"),
                Exercicio1("Crucifixo com Cabos", 3, "12-15"),
                Exercicio1("Pull-Over com Halteres", 3, "12-15"),
                Exercicio1("Flexão de Braços (joelhos apoiados, se necessário)", 3, "15-20"),
                Exercicio1("Supino Reto com Barra", 3, "12-15"),
                Exercicio1("Supino Declinado com Barra", 3, "12-15"),
                Exercicio1("Mergulhos em Paralelas", 3, "12-15"),
                Exercicio1("Flexão de Braços com Pernas Elevadas", 3, "15-20"),
                Exercicio1("Aperto de Mão no Pulley", 3, "12-15"),
                Exercicio1("Supino com Pegada Fechada", 3, "12-15"),
                Exercicio1("Flyes com Halteres", 3, "12-15"),
                Exercicio1("Supino Inclinado na Máquina", 3, "12-15"),
                Exercicio1("Push-Up Plyo (flexões explosivas com salto)", 3, "12-15"),
                Exercicio1("Supino Declinado na Máquina", 3, "12-15"),
                Exercicio1("Supino com Pegada Larga", 3, "12-15"),
                Exercicio1("Cross-Over com Cabos", 3, "12-15"),
                Exercicio1("Supino na Máquina Smith", 3, "12-15"),
                Exercicio1("Flexões Declinadas", 3, "15-20"),
                Exercicio1("Supino com Pegada Neutra", 3, "12-15"),
                Exercicio1("Pull-Over na Máquina", 3, "12-15"),
                Exercicio1("Flexões com os Pés Elevados", 3, "15-20"),
                Exercicio1("Mergulhos com Bola Suíça", 3, "12-15"),
                Exercicio1("Supino Reto com Halteres", 3, "12-15"),
                Exercicio1("Supino Inclinado com Barra", 3, "12-15"),
                Exercicio1("Crucifixo na Máquina", 3, "12-15"),
                Exercicio1("Push-Ups com Deslize", 3, "15-20"),
                Exercicio1("Aperto de Mão na Máquina", 3, "12-15"),
                Exercicio1("Supino com Corda", 3, "12-15"),
                Exercicio1("Flexões Explosivas", 3, "12-15"),
                Exercicio1("Flyes Inclinados com Halteres", 3, "12-15"),
                Exercicio1("Mergulhos em Barras Paralelas", 3, "12-15"),
                Exercicio1("Supino na Máquina Hammer Strength", 3, "12-15"),
                Exercicio1("Flexões com Toque no Ombro", 3, "15-20"),
                Exercicio1("Crucifixo Declinado na Máquina", 3, "12-15"),
                Exercicio1("Supino Inclinado com Halteres Leves", 3, "15-20"),
                Exercicio1("Supino Declinado com Halteres", 3, "12-15"),
                Exercicio1("Push-Ups de Tríceps", 3, "12-15"),
                Exercicio1("Flexões com Rotação (alternar entre as mãos)", 3, "12-15"),
                Exercicio1("Mergulhos no Banco (uso de bancos inclinados)", 3, "12-15"),
                Exercicio1("Flexões com Pernas no Banco", 3, "15-20"),
            )
        }

        fun treinoHipertrofia(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Supino Reto com Barra", 4, "8-10"),
                Exercicio1("Supino Inclinado com Halteres", 4, "8-10"),
                Exercicio1("Supino Declinado com Barra", 4, "8-10"),
                Exercicio1("Crucifixo Inclinado com Halteres", 4, "10-12"),
                Exercicio1("Mergulhos em Paralelas", 4, "10-12"),
                Exercicio1("Supino Inclinado na Máquina", 4, "10-12"),
                Exercicio1("Supino Reto na Máquina Smith", 4, "8-10"),
                Exercicio1("Crucifixo na Máquina", 4, "10-12"),
                Exercicio1("Flyes com Cabos", 4, "10-12"),
                Exercicio1("Supino com Pegada Fechada", 4, "10-12"),
                Exercicio1("Supino com Pegada Ampla", 4, "8-10"),
                Exercicio1("Flexões Ponderadas (com peso extra)", 4, "8-10"),
                Exercicio1("Peck Deck (máquina de peitoral)", 4, "10-12"),
                Exercicio1("Supino Declinado na Máquina", 4, "10-12"),
                Exercicio1("Aperto de Mão no Pulley Alto", 4, "10-12"),
                Exercicio1("Cross-Over com Corda", 4, "12-15"),
                Exercicio1("Supino com Pegada Neutra na Máquina Smith", 4, "10-12"),
                Exercicio1("Flexões com Parada (parar no meio do movimento)", 4, "10-12"),
                Exercicio1("Mergulhos no Banco (uso de bancos inclinados)", 4, "10-12"),
                Exercicio1("Supino na Máquina Hammer Strength", 4, "8-10"),
                Exercicio1("Flexões em Barras Paralelas", 4, "10-12"),
                Exercicio1("Flexões Declinadas", 4, "12-15"),
                Exercicio1("Flyes Declinados com Halteres", 4, "10-12"),
                Exercicio1("Supino Inclinado com Halteres Leves", 4, "12-15"),
                Exercicio1("Pullovers na Máquina", 4, "10-12"),
                Exercicio1("Flexões com Peso Corporal", 4, "12-15"),
                Exercicio1("Flyes Pec-Deck (máquina de voar)", 4, "12-15"),
                Exercicio1("Supino Declinado com Halteres Leves", 4, "12-15"),
                Exercicio1("Push-Ups na Bola Suíça", 4, "10-12"),
                Exercicio1("Supino com Pegada Larga na Máquina Smith", 4, "10-12"),
                Exercicio1("Mergulhos em Bancos Paralelos com Peso", 4, "10-12"),
                Exercicio1("Pullovers com Barra", 4, "10-12"),
                Exercicio1("Flyes com Halteres Declinados", 4, "10-12"),
                Exercicio1("Supino Inclinado com Halteres Pesados", 4, "8-10"),
                Exercicio1("Flexões no Solo", 4, "12-15"),
                Exercicio1("Supino Reto com Halteres Pesados", 4, "8-10"),
                Exercicio1("Crucifixo na Máquina Cross-Over", 4, "10-12"),
                Exercicio1("Flexões com os Pés Elevados", 4, "12-15"),
                Exercicio1("Flexões Declinadas com Peso Corporal", 4, "12-15"),
                Exercicio1("Supino com Pegada Fechada na Máquina", 4, "10-12"),
                Exercicio1("Supino com Corda na Polia Alta", 4, "10-12"),
            )
        }

        fun treinoDefinicao(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Supino Declinado com Barra (peso moderado)", 4, "10-12"),
                Exercicio1("Supino Inclinado com Halteres", 4, "10-12"),
                Exercicio1("Crucifixo com Cabos (contração muscular)", 4, "12-15"),
                Exercicio1("Flexões Explosivas", 4, "12-15"),
                Exercicio1("Pulldown na Máquina (parte superior do peito)", 4, "12-15"),
                Exercicio1("Supino Declinado com Halteres (peso moderado)", 4, "10-12"),
                Exercicio1("Cross-Over com Cabos (variação de ângulo)", 4, "12-15"),
                Exercicio1("Flexões em Diamante (mãos próximas)", 4, "12-15"),
                Exercicio1("Flyes com Halteres (peso moderado)", 4, "10-12"),
                Exercicio1("Mergulhos em Paralelas (contração muscular)", 4, "12-15"),
                Exercicio1("Supino com Pegada Neutra na Máquina", 4, "10-12"),
                Exercicio1("Flexões na Bola de Estabilidade (trabalho do core)", 4, "12-15"),
                Exercicio1("Supino na Máquina Smith (peso moderado)", 4, "10-12"),
                Exercicio1("Flexões com Rotação (alternar entre as mãos)", 4, "12-15"),
                Exercicio1("Flexões Declinadas (peso corporal ou com peso extra)", 4, "12-15"),
                Exercicio1("Supino Declinado na Máquina (peso moderado)", 4, "10-12"),
                Exercicio1("Flyes Declinados na Máquina", 4, "12-15"),
                Exercicio1("Supino na Máquina Hammer Strength (peso moderado)", 4, "10-12"),
                Exercicio1("Cross-Over com Corda (variação de amplitude)", 4, "12-15"),
                Exercicio1("Flexões Pliométricas (saltos explosivos)", 4, "12-15"),
                Exercicio1("Supino Inclinado com Barra (peso moderado)", 4, "10-12"),
                Exercicio1("Supino Declinado com Barra (peso moderado)", 4, "10-12"),
                Exercicio1("Crucifixo com Cabos (contração muscular)", 4, "12-15"),
                Exercicio1("Flexões Explosivas", 4, "12-15"),
                Exercicio1("Pulldown na Máquina (parte superior do peito)", 4, "12-15"),
                Exercicio1("Supino Declinado com Halteres (peso moderado)", 4, "10-12"),
                Exercicio1("Cross-Over com Cabos (variação de ângulo)", 4, "12-15"),
                Exercicio1("Flexões em Diamante (mãos próximas)", 4, "12-15"),
                Exercicio1("Flyes com Halteres (peso moderado)", 4, "10-12"),
                Exercicio1("Mergulhos em Paralelas (contração muscular)", 4, "12-15"),
                Exercicio1("Supino com Pegada Neutra na Máquina", 4, "10-12"),
                Exercicio1("Flexões na Bola de Estabilidade (trabalho do core)", 4, "12-15"),
                Exercicio1("Supino na Máquina Smith (peso moderado)", 4, "10-12"),
                Exercicio1("Flexões com Rotação (alternar entre as mãos)", 4, "12-15"),
                Exercicio1("Flexões Declinadas (peso corporal ou com peso extra)", 4, "12-15"),
                Exercicio1("Supino Declinado na Máquina (peso moderado)", 4, "10-12"),
                Exercicio1("Flyes Declinados na Máquina", 4, "12-15"),
                Exercicio1("Supino na Máquina Hammer Strength (peso moderado)", 4, "10-12"),
                Exercicio1("Cross-Over com Corda (variação de amplitude)", 4, "12-15"),
                Exercicio1("Flexões Pliométricas (saltos explosivos)", 4, "12-15")
            )
        }
    }

}

class TreinoCostas {
    companion object {
        fun treinoHipertrofiaCostas(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Puxada na Polia Alta (pegada larga)", 4, "8-10"),
                Exercicio1("Levantamento Terra", 4, "6-8"),
                Exercicio1("Barra Fixa (pronada)", 4, "8-10"),
                Exercicio1("Remada Curvada", 4, "8-10"),
                Exercicio1("Puxada na Polia Baixa (pegada supinada)", 4, "8-10"),
                Exercicio1("Pull-Ups (pegada larga)", 4, "8-10"),
                Exercicio1("Remada Cavalinho", 4, "10-12"),
                Exercicio1("Pulldown com Barra (pegada aberta)", 4, "8-10"),
                Exercicio1("Mergulho em Paralelas", 4, "8-10"),
                Exercicio1("Remada Unilateral com Halteres", 4, "10-12"),
                Exercicio1("Pull-Ups (pegada supinada)", 4, "8-10"),
                Exercicio1("Puxada no Cabo com Pegada Neutra", 4, "8-10"),
                Exercicio1("Bent Over Rows com Barra", 4, "8-10"),
                Exercicio1("Pulldown na Máquina", 4, "8-10"),
                Exercicio1("Remada T", 4, "10-12"),
                Exercicio1("Puxada Alta com Corda", 4, "10-12"),
                Exercicio1("Deadlift Romano", 4, "6-8"),
                Exercicio1("Pull-Ups com Peso Extra", 4, "6-8"),
                Exercicio1("Puxada Fechada na Polia Alta", 4, "8-10"),
                Exercicio1("Remada Baixa com Barra T", 4, "8-10"),
                Exercicio1("Puxada na Máquina Hammer Strength", 4, "8-10"),
                Exercicio1("Levantamento Terra com Barra Hexagonal", 4, "6-8"),
                Exercicio1("Pull-Ups com Pegada Neutra", 4, "8-10"),
                Exercicio1("Pulldown na Máquina (pegada supinada)", 4, "10-12"),
                Exercicio1("Mergulho em Paralelas com Peso Extra", 4, "6-8"),
                Exercicio1("Remada Unilateral com Barra T", 4, "8-10"),
                Exercicio1("Puxada com Triângulo na Polia Alta", 4, "8-10"),
                Exercicio1("T-Bar Row", 4, "8-10"),
                Exercicio1("Pulldown com Corda", 4, "10-12"),
                Exercicio1("Mergulho em Paralelas (pegada larga)", 4, "8-10"),
                Exercicio1("Remada na Máquina", 4, "8-10"),
                Exercicio1("Puxada Horizontal na Máquina", 4, "8-10"),
                Exercicio1("Deadlift com Pegada Alternada", 4, "6-8"),
                Exercicio1("Pull-Ups (pegada neutra) com Peso Extra", 4, "6-8"),
                Exercicio1("Puxada no Cabo (pegada supinada)", 4, "8-10"),
                Exercicio1("Remada Sentada", 4, "8-10"),
                Exercicio1("Pulldown na Máquina (pegada larga)", 4, "10-12"),
                Exercicio1("Pull-Ups (pegada mista)", 4, "8-10"),
                Exercicio1("Puxada no Cabo com Pegada Fechada", 4, "8-10"),
                Exercicio1("Deadlift Sumô", 4, "6-8"),
                Exercicio1("Pull-Ups (pegada larga) com Pegada Neutra", 4, "8-10")
            )
        }

        fun treinoEmagrecimentoCostas(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Puxada na Polia Alta (pegada larga)", 4, "12-15"),
                Exercicio1("Levantamento Terra", 4, "10-12"),
                Exercicio1("Barra Fixa (pronada)", 4, "12-15"),
                Exercicio1("Remada Curvada", 4, "12-15"),
                Exercicio1("Puxada na Polia Baixa (pegada supinada)", 4, "12-15"),
                Exercicio1("Pull-Ups (pegada larga)", 4, "12-15"),
                Exercicio1("Remada Cavalinho", 4, "12-15"),
                Exercicio1("Pulldown com Barra (pegada aberta)", 4, "12-15"),
                Exercicio1("Mergulho em Paralelas", 4, "12-15"),
                Exercicio1("Remada Unilateral com Halteres", 4, "12-15"),
                Exercicio1("Pull-Ups (pegada supinada)", 4, "12-15"),
                Exercicio1("Puxada no Cabo com Pegada Neutra", 4, "12-15"),
                Exercicio1("Bent Over Rows com Barra", 4, "12-15"),
                Exercicio1("Pulldown na Máquina", 4, "12-15"),
                Exercicio1("Remada T", 4, "12-15"),
                Exercicio1("Puxada Alta com Corda", 4, "12-15"),
                Exercicio1("Deadlift Romano", 4, "10-12"),
                Exercicio1("Pull-Ups com Peso Extra", 4, "10-12"),
                Exercicio1("Puxada Fechada na Polia Alta", 4, "12-15"),
                Exercicio1("Remada Baixa com Barra T", 4, "12-15"),
                Exercicio1("Puxada na Máquina Hammer Strength", 4, "12-15"),
                Exercicio1("Levantamento Terra com Barra Hexagonal", 4, "10-12"),
                Exercicio1("Pull-Ups com Pegada Neutra", 4, "12-15"),
                Exercicio1("Pulldown na Máquina (pegada supinada)", 4, "12-15"),
                Exercicio1("Mergulho em Paralelas com Peso Extra", 4, "10-12"),
                Exercicio1("Remada Unilateral com Barra T", 4, "12-15"),
                Exercicio1("Puxada com Triângulo na Polia Alta", 4, "12-15"),
                Exercicio1("T-Bar Row", 4, "12-15"),
                Exercicio1("Pulldown com Corda", 4, "12-15"),
                Exercicio1("Mergulho em Paralelas (pegada larga)", 4, "12-15"),
                Exercicio1("Remada na Máquina", 4, "12-15"),
                Exercicio1("Puxada Horizontal na Máquina", 4, "12-15"),
                Exercicio1("Deadlift com Pegada Alternada", 4, "10-12"),
                Exercicio1("Pull-Ups (pegada neutra) com Peso Extra", 4, "10-12"),
                Exercicio1("Puxada no Cabo (pegada supinada)", 4, "12-15"),
                Exercicio1("Remada Sentada", 4, "12-15"),
                Exercicio1("Pulldown na Máquina (pegada larga)", 4, "12-15"),
                Exercicio1("Pull-Ups (pegada mista)", 4, "12-15"),
                Exercicio1("Puxada no Cabo com Pegada Fechada", 4, "12-15"),
                Exercicio1("Deadlift Sumô", 4, "10-12"),
                Exercicio1("Pull-Ups (pegada larga) com Pegada Neutra", 4, "12-15")
            )
        }

        fun treinoDefinicaoCostas(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Puxada na Polia Alta (pegada larga)", 4, "15-20"),
                Exercicio1("Levantamento Terra", 4, "12-15"),
                Exercicio1("Barra Fixa (pronada)", 4, "15-20"),
                Exercicio1("Remada Curvada", 4, "15-20"),
                Exercicio1("Puxada na Polia Baixa (pegada supinada)", 4, "15-20"),
                Exercicio1("Pull-Ups (pegada larga)", 4, "15-20"),
                Exercicio1("Remada Cavalinho", 4, "15-20"),
                Exercicio1("Pulldown com Barra (pegada aberta)", 4, "15-20"),
                Exercicio1("Mergulho em Paralelas", 4, "15-20"),
                Exercicio1("Remada Unilateral com Halteres", 4, "15-20"),
                Exercicio1("Pull-Ups (pegada supinada)", 4, "15-20"),
                Exercicio1("Puxada no Cabo com Pegada Neutra", 4, "15-20"),
                Exercicio1("Bent Over Rows com Barra", 4, "15-20"),
                Exercicio1("Pulldown na Máquina", 4, "15-20"),
                Exercicio1("Remada T", 4, "15-20"),
                Exercicio1("Puxada Alta com Corda", 4, "15-20"),
                Exercicio1("Deadlift Romano", 4, "12-15"),
                Exercicio1("Pull-Ups com Peso Extra", 4, "12-15"),
                Exercicio1("Puxada Fechada na Polia Alta", 4, "15-20"),
                Exercicio1("Remada Baixa com Barra T", 4, "15-20"),
                Exercicio1("Puxada na Máquina Hammer Strength", 4, "15-20"),
                Exercicio1("Levantamento Terra com Barra Hexagonal", 4, "12-15"),
                Exercicio1("Pull-Ups com Pegada Neutra", 4, "15-20"),
                Exercicio1("Pulldown na Máquina (pegada supinada)", 4, "15-20"),
                Exercicio1("Mergulho em Paralelas com Peso Extra", 4, "12-15"),
                Exercicio1("Remada Unilateral com Barra T", 4, "15-20"),
                Exercicio1("Puxada com Triângulo na Polia Alta", 4, "15-20"),
                Exercicio1("T-Bar Row", 4, "15-20"),
                Exercicio1("Pulldown com Corda", 4, "15-20"),
                Exercicio1("Mergulho em Paralelas (pegada larga)", 4, "15-20"),
                Exercicio1("Remada na Máquina", 4, "15-20"),
                Exercicio1("Puxada Horizontal na Máquina", 4, "15-20"),
                Exercicio1("Deadlift com Pegada Alternada", 4, "12-15"),
                Exercicio1("Pull-Ups (pegada neutra) com Peso Extra", 4, "12-15"),
                Exercicio1("Puxada no Cabo (pegada supinada)", 4, "15-20"),
                Exercicio1("Remada Sentada", 4, "15-20"),
                Exercicio1("Pulldown na Máquina (pegada larga)", 4, "15-20"),
                Exercicio1("Pull-Ups (pegada larga) com Pegada Neutra", 4, "15-20")
            )
        }

    }

}

class TreinoPerna {
    companion object {
        fun treinoHipertrofiaPernas(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Agachamento Livre", 4, "8-10"),
                Exercicio1("Leg Press 45°", 4, "10-12"),
                Exercicio1("Afundo com Barra", 4, "10-12"),
                Exercicio1("Cadeira Extensora", 4, "12-15"),
                Exercicio1("Stiff", 4, "8-10"),
                Exercicio1("Mesa Flexora", 4, "12-15"),
                Exercicio1("Agachamento Hack", 4, "10-12"),
                Exercicio1("Prensa 45°", 4, "10-12"),
                Exercicio1("Cadeira Flexora", 4, "12-15"),
                Exercicio1("Passada com Halteres", 4, "10-12"),
                Exercicio1("Elevação de Panturrilhas Sentado", 4, "12-15"),
                Exercicio1("Agachamento com Salto", 4, "8-10"),
                Exercicio1("Extensão de Quadril no Solo", 4, "12-15"),
                Exercicio1("Leg Press 90°", 4, "10-12"),
                Exercicio1("Cadeira Adutora", 4, "12-15"),
                Exercicio1("Caminhada no Leg Press", 4, "10-12"),
                Exercicio1("Afundo com Barra Smith", 4, "10-12"),
                Exercicio1("Cadeira Abdutora", 4, "12-15"),
                Exercicio1("Agachamento Frontal", 4, "8-10"),
                Exercicio1("Cadeira Extensora Unilateral", 4, "12-15"),
                Exercicio1("Mesa Flexora Unilateral", 4, "12-15"),
                Exercicio1("Step Up", 4, "10-12"),
                Exercicio1("Elevação de Panturrilhas em Pé", 4, "12-15"),
                Exercicio1("Agachamento Búlgaro", 4, "10-12"),
                Exercicio1("Cadeira Flexora Unilateral", 4, "12-15"),
                Exercicio1("Mesa Flexora 45°", 4, "12-15"),
                Exercicio1("Agachamento Sumô", 4, "8-10"),
                Exercicio1("Extensão de Quadril com Halteres", 4, "12-15"),
                Exercicio1("Máquina de Abdução de Quadril", 4, "12-15"),
                Exercicio1("Agachamento na Smith Machine", 4, "8-10"),
                Exercicio1("Prensa 90°", 4, "10-12"),
                Exercicio1("Afundo com Barra Guiada", 4, "10-12"),
                Exercicio1("Cadeira Flexora com Máquina", 4, "12-15"),
                Exercicio1("Hack Machine", 4, "10-12"),
                Exercicio1("Cadeira Extensora Unilateral", 4, "12-15"),
                Exercicio1("Leg Press Horizontal", 4, "10-12"),
                Exercicio1("Elevação de Panturrilhas em Máquina", 4, "12-15"),
                Exercicio1("Afundo com Halteres", 4, "10-12"),
                Exercicio1("Mesa Flexora 90°", 4, "12-15"),
                Exercicio1("Passada no Smith Machine", 4, "10-12"),
                Exercicio1("Elevação de Panturrilhas Sentado (máquina)", 4, "12-15")
            )
        }

        fun treinoDefinicaoPernas(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Agachamento Livre com Barra (peso moderado)", 4, "15-20"),
                Exercicio1("Leg Press 45° com Pés Juntos", 4, "15-20"),
                Exercicio1("Afundo com Barra Guiada", 4, "15-20"),
                Exercicio1("Cadeira Extensora (contração máxima)", 4, "15-20"),
                Exercicio1("Stiff com Barra (peso moderado)", 4, "15-20"),
                Exercicio1("Mesa Flexora (contração máxima)", 4, "15-20"),
                Exercicio1("Agachamento Hack com Barra (peso moderado)", 4, "15-20"),
                Exercicio1("Prensa 45° com Pés Juntos", 4, "15-20"),
                Exercicio1("Cadeira Flexora (contração máxima)", 4, "15-20"),
                Exercicio1("Passada com Halteres (peso moderado)", 4, "15-20"),
                Exercicio1("Elevação de Panturrilhas Sentado (peso moderado)", 4, "15-20"),
                Exercicio1("Agachamento com Salto", 4, "15-20"),
                Exercicio1("Extensão de Quadril no Solo", 4, "15-20"),
                Exercicio1("Leg Press 90° com Pés Juntos", 4, "15-20"),
                Exercicio1("Cadeira Abdutora (contração máxima)", 4, "15-20"),
                Exercicio1("Caminhada no Leg Press", 4, "15-20"),
                Exercicio1("Afundo com Barra Smith (peso moderado)", 4, "15-20"),
                Exercicio1("Cadeira Abdutora (contração máxima)", 4, "15-20"),
                Exercicio1("Agachamento Frontal com Barra (peso moderado)", 4, "15-20"),
                Exercicio1("Cadeira Extensora Unilateral (contração máxima)", 4, "15-20"),
                Exercicio1("Mesa Flexora Unilateral (contração máxima)", 4, "15-20"),
                Exercicio1("Step Up (peso moderado)", 4, "15-20"),
                Exercicio1("Elevação de Panturrilhas em Pé (peso moderado)", 4, "15-20"),
                Exercicio1("Agachamento Búlgaro com Halteres (peso moderado)", 4, "15-20"),
                Exercicio1("Cadeira Flexora Unilateral (contração máxima)", 4, "15-20"),
                Exercicio1("Mesa Flexora 45° (contração máxima)", 4, "15-20"),
                Exercicio1("Agachamento Sumô (peso moderado)", 4, "15-20"),
                Exercicio1("Extensão de Quadril com Halteres (peso moderado)", 4, "15-20"),
                Exercicio1("Máquina de Abdução de Quadril (contração máxima)", 4, "15-20"),
                Exercicio1("Agachamento na Smith Machine (peso moderado)", 4, "15-20"),
                Exercicio1("Prensa 90° com Pés Juntos", 4, "15-20"),
                Exercicio1("Afundo com Barra Guiada (peso moderado)", 4, "15-20"),
                Exercicio1("Cadeira Flexora com Máquina (contração máxima)", 4, "15-20"),
                Exercicio1("Hack Machine com Barra (peso moderado)", 4, "15-20"),
                Exercicio1("Cadeira Extensora Unilateral (contração máxima)", 4, "15-20"),
                Exercicio1("Leg Press Horizontal com Pés Juntos", 4, "15-20"),
                Exercicio1("Elevação de Panturrilhas em Máquina (peso moderado)", 4, "15-20"),
                Exercicio1("Afundo com Halteres (peso moderado)", 4, "15-20"),
                Exercicio1("Mesa Flexora 90° (contração máxima)", 4, "15-20"),
                Exercicio1("Passada no Smith Machine (peso moderado)", 4, "15-20"),
                Exercicio1("Elevação de Panturrilhas Sentado (máquina, peso moderado)", 4, "15-20")
            )
        }

        fun treinoEmagrecimentoPernas(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Esteira (corrida leve)", 1, "20-30 minutos"),
                Exercicio1("Bicicleta Ergométrica (ritmo moderado)", 1, "20-30 minutos"),
                Exercicio1("Caminhada ao Ar Livre (ritmo moderado)", 1, "20-30 minutos"),
                Exercicio1("Subida de Escadas (ritmo moderado)", 1, "20-30 minutos"),
                Exercicio1("Pular Corda (ritmo moderado)", 1, "20-30 minutos"),
                Exercicio1("Agachamento Corporal", 4, "15-20 repetições"),
                Exercicio1("Afundo sem Peso", 4, "15-20 repetições"),
                Exercicio1("Elevação de Panturrilhas em Pé (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Máquina de Abdução de Quadril (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Máquina de Adução de Quadril (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Leg Press Horizontal (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Cadeira Extensora (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Cadeira Flexora (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Elevação de Panturrilhas Sentado (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Caminhada Lateral (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Agachamento Isométrico (segurar por 30 segundos)", 4, "3 séries"),
                Exercicio1("Prancha Abdominal (segurar por 30 segundos)", 4, "3 séries"),
                Exercicio1("Elevação de Pernas em Supino Declinado (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Bicicleta no Chão (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Agachamento com Salto (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Afundo com Salto (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Burpees", 4, "15-20 repetições"),
                Exercicio1("Mountain Climbers", 4, "15-20 repetições"),
                Exercicio1("Agachamento com Toque na Ponta dos Pés (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Pular Corda (ritmo rápido)", 1, "20-30 minutos"),
                Exercicio1("Escalador (Mountain Climbers com ritmo rápido)", 4, "15-20 repetições"),
                Exercicio1("Salto em Caixa (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Sprint (corrida de alta intensidade por 20-30 segundos)", 4, "4 séries"),
                Exercicio1("Jump Squat (agachamento com salto)", 4, "15-20 repetições"),
                Exercicio1("Cadeira Extensora com uma Perna (sem peso)", 4, "15-20 repetições por perna"),
                Exercicio1("Elevação de Panturrilhas em Pé na Borda (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Agachamento Isométrico com as Costas na Parede (segurar por 30 segundos)", 4, "3 séries"),
                Exercicio1("Prancha Lateral (segurar por 30 segundos de cada lado)", 4, "3 séries"),
                Exercicio1("Agachamento com Salto e Giro (sem peso)", 4, "15-20 repetições"),
                Exercicio1("Lunges com Rotação do Tronco (sem peso)", 4, "15-20 repetições por perna"),
                Exercicio1("Escada de Agilidade (ritmo moderado)", 1, "20-30 minutos"),
                Exercicio1("Sprint em Subida (corrida de alta intensidade por 20-30 segundos em subida)", 4, "4 séries"),
                Exercicio1("Agachamento Isométrico com os Braços Estendidos (segurar por 30 segundos)", 4, "3 séries"),
                Exercicio1("Bicicleta Ergométrica (treino intervalado, alternando entre alta e baixa intensidade)", 1, "20-30 minutos")
            )
        }

    }
}

class TreinoTriceps {
    companion object {
        fun treinoHipertrofiaTriceps(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Tríceps Pulldown na Polia Alta (barra reta)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Alta (barra V)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Alta (corda)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (barra reta)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (barra V)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (corda)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Testa com Barra Reta (supino fechado)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Testa com Barra W (supino fechado)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Testa com Halteres", 4, "8-10 repetições"),
                Exercicio1("Tríceps na Máquina (pegada V)", 4, "8-10 repetições"),
                Exercicio1("Tríceps na Máquina (pegada neutra)", 4, "8-10 repetições"),
                Exercicio1("Tríceps na Máquina (pegada supinada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps na Máquina (pegada pronada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Kickback com Halteres", 4, "8-10 repetições por braço"),
                Exercicio1("Tríceps Kickback com Barra", 4, "8-10 repetições"),
                Exercicio1("Tríceps Kickback com Anilha", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Supinada", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Neutra", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Pronada", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Corda", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Barra V", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Supinada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Pronada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Supinada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Pronada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Supinada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Pronada)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Neutra)", 4, "8-10 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada em Martelo)", 4, "8-10 repetições"),
                Exercicio1(
                    "Tríceps Pulley com Barra Reta (Pegada Supinada e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Barra Reta (Pegada Pronada e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Barra V (Pegada Supinada e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Barra V (Pegada Pronada e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada Supinada e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada Pronada e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada Neutra e Larga)",
                    4,
                    "8-10 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada em Martelo e Larga)",
                    4,
                    "8-10 repetições"
                )
            )
        }

        fun treinoDefinicaoTriceps(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Tríceps Pulldown na Polia Alta (barra reta)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Alta (barra V)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Alta (corda)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (barra reta)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (barra V)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (corda)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Testa com Barra Reta (supino fechado)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Testa com Barra W (supino fechado)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Testa com Halteres", 4, "15-20 repetições"),
                Exercicio1("Tríceps na Máquina (pegada V)", 4, "15-20 repetições"),
                Exercicio1("Tríceps na Máquina (pegada neutra)", 4, "15-20 repetições"),
                Exercicio1("Tríceps na Máquina (pegada supinada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps na Máquina (pegada pronada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Kickback com Halteres", 4, "15-20 repetições por braço"),
                Exercicio1("Tríceps Kickback com Barra", 4, "15-20 repetições"),
                Exercicio1("Tríceps Kickback com Anilha", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Supinada", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Neutra", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Pronada", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Corda", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Barra V", 4, "15-20 repetições"),
                Exercicio1(
                    "Tríceps Pulley com Barra Reta (Pegada Supinada)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Pronada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Supinada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Pronada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Supinada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Pronada)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Neutra)", 4, "15-20 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada em Martelo)", 4, "15-20 repetições"),
                Exercicio1(
                    "Tríceps Pulley com Barra Reta (Pegada Supinada e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Barra Reta (Pegada Pronada e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Barra V (Pegada Supinada e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Barra V (Pegada Pronada e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada Supinada e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada Pronada e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada Neutra e Larga)",
                    4,
                    "15-20 repetições"
                ),
                Exercicio1(
                    "Tríceps Pulley com Corda (Pegada em Martelo e Larga)",
                    4,
                    "15-20 repetições"
                )
            )
        }

        fun treinoEmagrecimentoTriceps(): ArrayList<Exercicio1> {
            return arrayListOf(
                Exercicio1("Tríceps Pulldown na Polia Alta (barra reta)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Alta (barra V)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Alta (corda)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (barra reta)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (barra V)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulldown na Polia Baixa (corda)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Testa com Barra Reta (supino fechado)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Testa com Barra W (supino fechado)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Testa com Halteres", 4, "12-15 repetições"),
                Exercicio1("Tríceps na Máquina (pegada V)", 4, "12-15 repetições"),
                Exercicio1("Tríceps na Máquina (pegada neutra)", 4, "12-15 repetições"),
                Exercicio1("Tríceps na Máquina (pegada supinada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps na Máquina (pegada pronada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Kickback com Halteres", 4, "12-15 repetições por braço"),
                Exercicio1("Tríceps Kickback com Barra", 4, "12-15 repetições"),
                Exercicio1("Tríceps Kickback com Anilha", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Supinada", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Neutra", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Pegada Pronada", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra V", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Supinada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Pronada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Supinada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Pronada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Supinada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Pronada)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Neutra)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada em Martelo)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Supinada e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra Reta (Pegada Pronada e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Supinada e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Barra V (Pegada Pronada e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Supinada e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Pronada e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada Neutra e Larga)", 4, "12-15 repetições"),
                Exercicio1("Tríceps Pulley com Corda (Pegada em Martelo e Larga)", 4, "12-15 repetições")
            )}

        }
}