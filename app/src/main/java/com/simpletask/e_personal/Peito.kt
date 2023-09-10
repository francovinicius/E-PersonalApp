package com.simpletask.e_personal

data class Exercicio(val nome: String, val series: Int, val repeticoes: String)

class TreinoPeito {
    companion object {
        fun treinoEmagrecimento(): ArrayList<Exercicio> {
            return arrayListOf(
                Exercicio("Supino Inclinado com Barra", 3, "12-15"),
                Exercicio("Supino Declinado com Halteres", 3, "12-15"),
                Exercicio("Crucifixo com Cabos", 3, "12-15"),
                Exercicio("Pull-Over com Halteres", 3, "12-15"),
                Exercicio("Flexão de Braços (joelhos apoiados, se necessário)", 3, "15-20"),
                Exercicio("Supino Reto com Barra", 3, "12-15"),
                Exercicio("Supino Declinado com Barra", 3, "12-15"),
                Exercicio("Mergulhos em Paralelas", 3, "12-15"),
                Exercicio("Flexão de Braços com Pernas Elevadas", 3, "15-20"),
                Exercicio("Aperto de Mão no Pulley", 3, "12-15"),
                Exercicio("Supino com Pegada Fechada", 3, "12-15"),
                Exercicio("Flyes com Halteres", 3, "12-15"),
                Exercicio("Supino Inclinado na Máquina", 3, "12-15"),
                Exercicio("Push-Up Plyo (flexões explosivas com salto)", 3, "12-15"),
                Exercicio("Supino Declinado na Máquina", 3, "12-15"),
                Exercicio("Supino com Pegada Larga", 3, "12-15"),
                Exercicio("Cross-Over com Cabos", 3, "12-15"),
                Exercicio("Supino na Máquina Smith", 3, "12-15"),
                Exercicio("Flexões Declinadas", 3, "15-20"),
                Exercicio("Supino com Pegada Neutra", 3, "12-15"),
                Exercicio("Pull-Over na Máquina", 3, "12-15"),
                Exercicio("Flexões com os Pés Elevados", 3, "15-20"),
                Exercicio("Mergulhos com Bola Suíça", 3, "12-15"),
                Exercicio("Supino Reto com Halteres", 3, "12-15"),
                Exercicio("Supino Inclinado com Barra", 3, "12-15"),
                Exercicio("Crucifixo na Máquina", 3, "12-15"),
                Exercicio("Push-Ups com Deslize", 3, "15-20"),
                Exercicio("Aperto de Mão na Máquina", 3, "12-15"),
                Exercicio("Supino com Corda", 3, "12-15"),
                Exercicio("Flexões Explosivas", 3, "12-15"),
                Exercicio("Flyes Inclinados com Halteres", 3, "12-15"),
                Exercicio("Mergulhos em Barras Paralelas", 3, "12-15"),
                Exercicio("Supino na Máquina Hammer Strength", 3, "12-15"),
                Exercicio("Flexões com Toque no Ombro", 3, "15-20"),
                Exercicio("Crucifixo Declinado na Máquina", 3, "12-15"),
                Exercicio("Supino Inclinado com Halteres Leves", 3, "15-20"),
                Exercicio("Supino Declinado com Halteres", 3, "12-15"),
                Exercicio("Push-Ups de Tríceps", 3, "12-15"),
                Exercicio("Flexões com Rotação (alternar entre as mãos)", 3, "12-15"),
                Exercicio("Mergulhos no Banco (uso de bancos inclinados)", 3, "12-15"),
                Exercicio("Flexões com Pernas no Banco", 3, "15-20"),
            )
        }

        fun treinoHipertrofia(): ArrayList<Exercicio> {
            return arrayListOf(
                Exercicio("Supino Reto com Barra", 4, "8-10"),
                Exercicio("Supino Inclinado com Halteres", 4, "8-10"),
                Exercicio("Supino Declinado com Barra", 4, "8-10"),
                Exercicio("Crucifixo Inclinado com Halteres", 4, "10-12"),
                Exercicio("Mergulhos em Paralelas", 4, "10-12"),
                Exercicio("Supino Inclinado na Máquina", 4, "10-12"),
                Exercicio("Supino Reto na Máquina Smith", 4, "8-10"),
                Exercicio("Crucifixo na Máquina", 4, "10-12"),
                Exercicio("Flyes com Cabos", 4, "10-12"),
                Exercicio("Supino com Pegada Fechada", 4, "10-12"),
                Exercicio("Supino com Pegada Ampla", 4, "8-10"),
                Exercicio("Flexões Ponderadas (com peso extra)", 4, "8-10"),
                Exercicio("Peck Deck (máquina de peitoral)", 4, "10-12"),
                Exercicio("Supino Declinado na Máquina", 4, "10-12"),
                Exercicio("Aperto de Mão no Pulley Alto", 4, "10-12"),
                Exercicio("Cross-Over com Corda", 4, "12-15"),
                Exercicio("Supino com Pegada Neutra na Máquina Smith", 4, "10-12"),
                Exercicio("Flexões com Parada (parar no meio do movimento)", 4, "10-12"),
                Exercicio("Mergulhos no Banco (uso de bancos inclinados)", 4, "10-12"),
                Exercicio("Supino na Máquina Hammer Strength", 4, "8-10"),
                Exercicio("Flexões em Barras Paralelas", 4, "10-12"),
                Exercicio("Flexões Declinadas", 4, "12-15"),
                Exercicio("Flyes Declinados com Halteres", 4, "10-12"),
                Exercicio("Supino Inclinado com Halteres Leves", 4, "12-15"),
                Exercicio("Pullovers na Máquina", 4, "10-12"),
                Exercicio("Flexões com Peso Corporal", 4, "12-15"),
                Exercicio("Flyes Pec-Deck (máquina de voar)", 4, "12-15"),
                Exercicio("Supino Declinado com Halteres Leves", 4, "12-15"),
                Exercicio("Push-Ups na Bola Suíça", 4, "10-12"),
                Exercicio("Supino com Pegada Larga na Máquina Smith", 4, "10-12"),
                Exercicio("Mergulhos em Bancos Paralelos com Peso", 4, "10-12"),
                Exercicio("Pullovers com Barra", 4, "10-12"),
                Exercicio("Flyes com Halteres Declinados", 4, "10-12"),
                Exercicio("Supino Inclinado com Halteres Pesados", 4, "8-10"),
                Exercicio("Flexões no Solo", 4, "12-15"),
                Exercicio("Supino Reto com Halteres Pesados", 4, "8-10"),
                Exercicio("Crucifixo na Máquina Cross-Over", 4, "10-12"),
                Exercicio("Flexões com os Pés Elevados", 4, "12-15"),
                Exercicio("Flexões Declinadas com Peso Corporal", 4, "12-15"),
                Exercicio("Supino com Pegada Fechada na Máquina", 4, "10-12"),
                Exercicio("Supino com Corda na Polia Alta", 4, "10-12"),
            )
        }

        fun treinoDefinicao(): ArrayList<Exercicio> {
            return arrayListOf(
                Exercicio("Supino Declinado com Barra (peso moderado)", 4, "10-12"),
                Exercicio("Supino Inclinado com Halteres", 4, "10-12"),
                Exercicio("Crucifixo com Cabos (contração muscular)", 4, "12-15"),
                Exercicio("Flexões Explosivas", 4, "12-15"),
                Exercicio("Pulldown na Máquina (parte superior do peito)", 4, "12-15"),
                Exercicio("Supino Declinado com Halteres (peso moderado)", 4, "10-12"),
                Exercicio("Cross-Over com Cabos (variação de ângulo)", 4, "12-15"),
                Exercicio("Flexões em Diamante (mãos próximas)", 4, "12-15"),
                Exercicio("Flyes com Halteres (peso moderado)", 4, "10-12"),
                Exercicio("Mergulhos em Paralelas (contração muscular)", 4, "12-15"),
                Exercicio("Supino com Pegada Neutra na Máquina", 4, "10-12"),
                Exercicio("Flexões na Bola de Estabilidade (trabalho do core)", 4, "12-15"),
                Exercicio("Supino na Máquina Smith (peso moderado)", 4, "10-12"),
                Exercicio("Flexões com Rotação (alternar entre as mãos)", 4, "12-15"),
                Exercicio("Flexões Declinadas (peso corporal ou com peso extra)", 4, "12-15"),
                Exercicio("Supino Declinado na Máquina (peso moderado)", 4, "10-12"),
                Exercicio("Flyes Declinados na Máquina", 4, "12-15"),
                Exercicio("Supino na Máquina Hammer Strength (peso moderado)", 4, "10-12"),
                Exercicio("Cross-Over com Corda (variação de amplitude)", 4, "12-15"),
                Exercicio("Flexões Pliométricas (saltos explosivos)", 4, "12-15"),
                Exercicio("Supino Inclinado com Barra (peso moderado)", 4, "10-12"),
                Exercicio("Supino Declinado com Barra (peso moderado)", 4, "10-12"),
                Exercicio("Crucifixo com Cabos (contração muscular)", 4, "12-15"),
                Exercicio("Flexões Explosivas", 4, "12-15"),
                Exercicio("Pulldown na Máquina (parte superior do peito)", 4, "12-15"),
                Exercicio("Supino Declinado com Halteres (peso moderado)", 4, "10-12"),
                Exercicio("Cross-Over com Cabos (variação de ângulo)", 4, "12-15"),
                Exercicio("Flexões em Diamante (mãos próximas)", 4, "12-15"),
                Exercicio("Flyes com Halteres (peso moderado)", 4, "10-12"),
                Exercicio("Mergulhos em Paralelas (contração muscular)", 4, "12-15"),
                Exercicio("Supino com Pegada Neutra na Máquina", 4, "10-12"),
                Exercicio("Flexões na Bola de Estabilidade (trabalho do core)", 4, "12-15"),
                Exercicio("Supino na Máquina Smith (peso moderado)", 4, "10-12"),
                Exercicio("Flexões com Rotação (alternar entre as mãos)", 4, "12-15"),
                Exercicio("Flexões Declinadas (peso corporal ou com peso extra)", 4, "12-15"),
                Exercicio("Supino Declinado na Máquina (peso moderado)", 4, "10-12"),
                Exercicio("Flyes Declinados na Máquina", 4, "12-15"),
                Exercicio("Supino na Máquina Hammer Strength (peso moderado)", 4, "10-12"),
                Exercicio("Cross-Over com Corda (variação de amplitude)", 4, "12-15"),
                Exercicio("Flexões Pliométricas (saltos explosivos)", 4, "12-15")
            )
        }
    }

}