package prototipoensinoingles;

public class Etiquetagem {
    private int maxPG = 20;
    private int PGNum = 1;
    public void setPGNum(int pgn){
        this.PGNum = pgn;
    }
    public int getPGNum(){
        return this.PGNum;
    }
    
    private String[] teoria = new String[this.maxPG];
    private String[] altA = new String[this.maxPG];
    private String[] altB = new String[this.maxPG];
    private String[] altC = new String[this.maxPG];
    private String[] altD = new String[this.maxPG];
    
    /*TEXTO DE TEORIA*/
    public void setTeoria(){
        //ControleExercicios ce = new ControleExercicios();
        //PÁGINA 1
        this.teoria[0] = """
                         A primeira fase para aprender inglês envolve substantivos. Serão mostradas
                         algumas palavras em português, depois, sua tradução em inglês.
                                   
                         	PORTUGUÊS		INGLÊS
                         	Cama		Bed
                         	Televisão		Television
                         	Louça		Dishes
                         	Relógio		Clock
                         	Roupa		Clothes
                                                  
                         EXERCÍCIO 1 - Assinale a alternativa correta para a pergunta. Você precisa
                         confirmar sua resposta, mas pode passar as páginas antes de confirmar. Se
                         acertar, ganhará 2 pontos, se quase acertar, ganhará 1 ponto.
                         
                         
                         PERGUNTA: Como se fala CAMA e ROUPA em inglês?
                         """;
        //PÁGINA 2
        this.teoria[1] = """
                                                  	PORTUGUÊS		INGLÊS
                                                  	Cama		Bed
                                                  	Televisão		Television
                                                  	Louça		Dishes
                                                  	Relógio		Clock
                                                  	Roupa		Clothes
                         	Mesa		Table
                         	Carro		Car
                         	Retrato		Portrait
                         
                         EXERCÍCIO 2 - Assinale a alternativa correta para a pergunta.
                         
                         Como se fala LOUÇA, RELÓGIO e RETRATO em inglês?
                         """;
        //PÁGINA 3
        this.teoria[2] = """
                         A próxima fase é aprender sobre adjetivos. Estas palavras classificam, tipificam ou
                         trazem outra caracteristica para os substantivos. Em inglês eles costumam vir antes
                         dos substantivos. Por exemplo:
                         
                         	PORTUGUÊS		INGLÊS
                         	Carro quebrado	Broken car
                         	Retrato bonito		Beautiful portrait
                         	Televisão barata	Cheap television
                         	Mesa velha		Old table
                         
                         EXERCÍCIO 3 - Selecione a alternativa com as traduções corretas para:
                         	Cheap Car; Old television; Beautiful portrait
                         """;
        
        //PÁGINA 4
        this.teoria[3] = """
                         Verbos são palavras que indicam ação ou estado. Em português, todos os verbos
                         no Infinitivo terminam em "ar", "er" ou "ir". Em inglês, a regra é que todos os verbos
                         são precedidos de "to".
                         
                         	PORTUGUÊS		INGLÊS
                         	Quebrar		to break
                         	Ser		to be
                         	Ver		to see
                         	Construir		to build
                         	Lavar		to wash
                         	Ir		to go
                         
                         EXERCÍCIO 4 - Assinale a alternativa com a tradução correta para:
                         	Ver o relógio; Lavar a louça; Construir a mesa
                         """;
        //PÁGINA 5
        this.teoria[4] = """
                         Pronomes indicam a pessoa que fala. Os pronomes em inglês se parecem com os
                         do português. Para facilitar o entendimento, vamos conjugar o verbo "construir".
                         Preste muita atenção no padrão de conjugação. 
                         
                         	PORTUGUÊS		INGLÊS
                         	Eu construo		I build
                         	Você constrói		You build
                         	Ele/Ela constrói	He/She/It builds
                         	Nós construímos	We build
                         	Vocês constroem	You build
                         	Eles/Elas constroem	They build
                         
                         EXERCÍCIO 5 - Como se diz, em inglês, "Ele constrói a mesa" e a forma no plural
                                        "Eles constroem a mesa"?
                         """;
        //PÁGINA 6
        this.teoria[5] = """
                         Depois de aprender pronomes, verbos, substantivos e adjetivos, é possível começar
                         a formar frases. Para isso, é preciso saber conjugar verbos. A conjugação de um 
                         verbo é igual para a maioria dos pronomes. A maior diferença está na terceira pessoa
                         do singular (He/She/It), em que um "s" ou "es" é posto no fim. Veja um exemplo com
                         o verbo "lavar":
                         
                         	PORTUGUÊS		INGLÊS
                         	Eu lavo as roupas	I wash the clothes
                         	Você lava as roupas	You wash the clothes
                         	Ele/Ela lava as roupas	He/She/It washes the clothes
                         	Nós lavamos as roupas	We wash the clothes
                         	Vocês lavam as roupas	You wash the clothes
                         	Eles/Elas lavam as roupas       They wash the clothes
                         
                         EXERCÍCIO 6 - Traduza para o inglês: Ela lava as roupas.
                         """;
        //PÁGINA 7
        this.teoria[6] = """
                         O verbo "ir" (to go) é conjugado com preposições especiais. Veja esse exemplo com a
                         palavra "igreja" (church).
                         
                         	PORTUGUÊS		INGLÊS
                         	Eu vou à igreja		I go to church
                         	Você vai à igreja	You go to church
                         	Ele/Ela vai à igreja	He/She/It goes to church
                         	Nós vamos à igreja	We go to church
                         	Vocês vão à igreja	You go to church
                         	Eles/Elas vão à igreja	They go to church
                         
                         EXERCÍCIO 7 - Traduza para o inglês: Vocês vão à igreja bonita.
                         """;
        //PÁGINA 8
        this.teoria[7] = """
                         	PORTUGUÊS		INGLÊS
                         	Eu quebro o carro	I break the car
                         	Você quebra o carro	You break the car
                         	Ele/Ela quebra o carro	He/She/It breaks the car
                         	Nós quebramos o carro	We break the car
                         	Vocês quebram o carro	You break the car
                         	Eles/Elas quebram o carro	They break the car
                         
                         EXERCÍCIO 8 - Qual é a diferença entre "você" e "vocês" no ingles?
                         """;
        //PÁGINA 9
        this.teoria[8] = """
                         O verbo "To be" é muito importante e tem uma conjugação diferente de todos os
                         outros verbos. Ele significa ser ou estar, dependendo do contexto. Veja esse exemplo
                         com a palavra "jovem" (young). Note que, na maioria das vozes, o verbo é conjugado
                         como "are", especialmente para o plural.
                         
                         	PORTUGUÊS		INGLÊS
                         	Eu sou jovem		I am young
                         	Você é jovem		You are young
                         	Ele/Ela é jovem	He/She/It is young
                         	Nós somos jovens	We are young
                         	Vocês são jovens	You are yong
                         	Eles/Elas são jovens	They are young
                         
                         EXERCÍCIO 9 - Traduza para o inglês: "Eu sou jovem" e "Ele é jovem".
                         """;
        //PÁGINA 10
        this.teoria[9] = """
                         Essa é a última página da aula teórica. Se passar para a próxima página, você fará
                         uma prova com as mesmas questões que acabou de responder. Mas não poderá
                         conferir o conteúdo teórico. Tem certeza que deseja continuar?
                         """;
        //PROVA
        //PÁGINA 11
        this.teoria[10] = """
                         Essa prova repete questões já vistas, mas sem teoria. Boa sorte!
                          
                         EXERCÍCIO P1 - Assinale a alternativa correta para a pergunta. Você precisa
                         confirmar sua resposta, mas pode passar as páginas antes de confirmar. Se
                         acertar, ganhará 2 pontos, se quase acertar, ganhará 1 ponto.
                         
                         
                         PERGUNTA: Como se fala CAMA e ROUPA em inglês?
                         """;
        //PÁGINA 12
        this.teoria[11] = """
                         EXERCÍCIO P2 - Assinale a alternativa correta para a pergunta.
                         
                         Como se fala LOUÇA, RELÓGIO e RETRATO em inglês?
                         """;
        //PÁGINA 13
        this.teoria[12] = """
                         EXERCÍCIO P3 - Selecione a alternativa com as traduções corretas para:
                         	Cheap Car; Old television; Beautiful portrait
                         """;
        
        //PÁGINA 14
        this.teoria[13] = """
                         EXERCÍCIO P4 - Assinale a alternativa com a tradução correta para:
                         	Ver o relógio; Lavar a louça; Construir a mesa
                         """;
        //PÁGINA 15
        this.teoria[14] = """
                         EXERCÍCIO P5 - Como se diz, em inglês, "Ele constrói a mesa" e a forma no plural
                                        "Eles constroem a mesa"?
                         """;
        //PÁGINA 16
        this.teoria[15] = """
                         EXERCÍCIO 6 - Traduza para o inglês: Ela lava as roupas.
                         """;
        //PÁGINA 17
        this.teoria[16] = """
                         EXERCÍCIO 7 - Traduza para o inglês: Vocês vão à igreja bonita.
                         """;
        //PÁGINA 18
        this.teoria[17] = """
                         EXERCÍCIO 8 - Qual é a diferença entre "você" e "vocês" no ingles?
                         """;
        //PÁGINA 19
        this.teoria[18] = """
                         ESSA É A ULTIMA PÁGINA DA PROVA, CONFIRME TODAS AS RESPOSTAS
                         ANTES DE AVANÇAR, POIS A AULA SERÁ FINALIZADA NA PRÓXIMA PÁGINA.
                          
                         EXERCÍCIO 9 - Traduza para o inglês: "Eu sou jovem" e "Ele é jovem".
                         """;
        //PÁGINA 20
        this.teoria[19] = "[ERRO de inicialização de feedback]";//esta mensagem não deve aparecer
    }
    public String feedback(){   
        ControleExercicios ce = new ControleExercicios();
        String relatorio =  "OBRIGADO POR PARTICIPAR!\n"+
                            "Pontos Teoria: "+ce.getPontos()+" de 18\n"+
                            "Pontos Prova: "+ce.getPontosProva()+" de 18\n\n";
        if(ce.getPontosProva() < 9){
            relatorio = relatorio+"Sua nota de prova foi abaixo da média, que é 9. Tente outra vez.";
        }else if(ce.getPontosProva() >= 9 && ce.getPontosProva() < 15){
            relatorio = relatorio+"Parabéns! Sua nota de prova está acima da média, que é 9.";
        }else if(ce.getPontosProva() >= 15){
            relatorio = relatorio+"Parabéns! Sua nota de prova é muito alta!";
        }return relatorio;
    }
    
    public void SobrescreverUltimaPG(int pg, String texto){
        this.teoria[pg - 1] = texto;
    }
    
    public String getTeoria(int i){
        return this.teoria[i-1];
    }
    /*LABEL ALTERNATIVA A*/
    public String getAltA(int i) {
        return this.altA[i-1];
    }
    public void setAltA() {
        //PERGUNTA 1
        this.altA[0] = "A. CAMA = CLOTHES / ROUPA = BED";
        //PERGUNTA 2
        this.altA[1] = "A. LOUÇA = DISHES / RELÓGIO = CLOCK / RETRATO = PORTRAIT";
        //PERGUNTA 3
        this.altA[2] = "A. Mesa quebrada / Relógio velho / Louça suja";
        //PERGUNTA 4
        this.altA[3] = "A. To be the table / To build the dishes / To wash the clock";
        //PERGUNTA 5
        this.altA[4] = "A. We build the table / They build the table";
        //PERGUNTA 6
        this.altA[5] = "A. It washes the clothes";
        //PERGUNTA 7
        this.altA[6] = "A. You go to the beautiful church";
        //PERGUNTA 8
        this.altA[7] = "A. Nenhuma. Não da para diferenciar.";
        //PERGUNTA 9
        this.altA[8] = "A. I am young / He is young";
        //PROVA
        //PERGUNTA P1
        this.altA[10] = "A. CAMA = CLOTHES / ROUPA = BED";
        //PERGUNTA P2
        this.altA[11] = "A. LOUÇA = DISHES / RELÓGIO = CLOCK / RETRATO = PORTRAIT";
        //PERGUNTA P3
        this.altA[12] = "A. Mesa quebrada / Relógio velho / Louça suja";
        //PERGUNTA P4
        this.altA[13] = "A. To be the table / To build the dishes / To wash the clock";
        //PERGUNTA P5
        this.altA[14] = "A. We build the table / They build the table";
        //PERGUNTA P6
        this.altA[15] = "A. It washes the clothes";
        //PERGUNTA P7
        this.altA[16] = "A. You go to the beautiful church";
        //PERGUNTA P8
        this.altA[17] = "A. Nenhuma. Não da para diferenciar.";
        //PERGUNTA P9
        this.altA[18] = "A. I am young / He is young";
    }
    /*LABEL ALTERNATIVA B*/
    public String getAltB(int i) {
        return this.altB[i-1];
    }
    public void setAltB() {
        //PERGUNTA 1
        this.altB[0] = "B. CAMA = DISHES / ROUPA = CLOCK";
        //PERGUNTA 2
        this.altB[1] = "B. LOUÇA = DICHES / RELÓGIO = CLOK / RETRATO = PORTRAT";
        //PERGUNTA 3
        this.altB[2] = "B. Carro barato / Televisão velha / Retrato bonito";
        //PERGUNTA 4
        this.altB[3] = "B. To be the clock / To build the dishes / To wash the table";
        //PERGUNTA 5
        this.altB[4] = "B. I build the table / I builds the table";
        //PERGUNTA 6
        this.altB[5] = "B. You wash the clothes";
        //PERGUNTA 7
        this.altB[6] = "B. You go to the church beautiful";
        //PERGUNTA 8
        this.altB[7] = "B. Nenhuma. Só podemos diferenciar pelo contexto.";
        //PERGUNTA 9
        this.altB[8] = "B. He am young / I is young";
        //PROVA
        //PERGUNTA P1
        this.altB[10] = "B. CAMA = DISHES / ROUPA = CLOCK";
        //PERGUNTA P2
        this.altB[11] = "B. LOUÇA = DICHES / RELÓGIO = CLOK / RETRATO = PORTRAT";
        //PERGUNTA P3
        this.altB[12] = "B. Carro barato / Televisão velha / Retrato bonito";
        //PERGUNTA P4
        this.altB[13] = "B. To be the clock / To build the dishes / To wash the table";
        //PERGUNTA P5
        this.altB[14] = "B. I build the table / I builds the table";
        //PERGUNTA P6
        this.altB[15] = "B. You wash the clothes";
        //PERGUNTA P7
        this.altB[16] = "B. You go to the church beautiful";
        //PERGUNTA P8
        this.altB[17] = "B. Nenhuma. Só podemos diferenciar pelo contexto.";
        //PERGUNTA P9
        this.altB[18] = "B. He am young / I is young";
    }
    /*LABEL ALTERNATIVA C*/
    public String getAltC(int i) {
        return this.altC[i-1];
    }
    public void setAltC() {
        //PERGUNTA 1
        this.altC[0] = "C. CAMA = BED / ROUPA = CLOTHES";
        //PERGUNTA 2
        this.altC[1] = "C. LOUÇA = TABLE / RELÓGIO = CLOCK / RETRATO = TELEVISION";
        //PERGUNTA 3
        this.altC[2] = "C. Carro velho / Mesa velha / Retrato quebrado";
        //PERGUNTA 4
        this.altC[3] = "C. See the clock / Wash the dishes / Build the table";
        //PERGUNTA 5
        this.altC[4] = "C. He builds the table / They build the table";
        //PERGUNTA 6
        this.altC[5] = "C. She wash the clothes";
        //PERGUNTA 7
        this.altC[6] = "C. He goes to the beautiful church";
        //PERGUNTA 8
        this.altC[7] = "C. Você = You / Vocês = Yous";
        //PERGUNTA 9
        this.altC[8] = "C. I is young / He am young";
        //PROVA
        //PERGUNTA P1
        this.altC[10] = "C. CAMA = BED / ROUPA = CLOTHES";
        //PERGUNTA P2
        this.altC[11] = "C. LOUÇA = TABLE / RELÓGIO = CLOCK / RETRATO = TELEVISION";
        //PERGUNTA P3
        this.altC[12] = "C. Carro velho / Mesa velha / Retrato quebrado";
        //PERGUNTA P4
        this.altC[13] = "C. See the clock / Wash the dishes / Build the table";
        //PERGUNTA P5
        this.altC[14] = "C. He builds the table / They build the table";
        //PERGUNTA P6
        this.altC[15] = "C. She wash the clothes";
        //PERGUNTA P7
        this.altC[16] = "C. He goes to the beautiful church";
        //PERGUNTA P8
        this.altC[17] = "C. Você = You / Vocês = Yous";
        //PERGUNTA P9
        this.altC[18] = "C. I is young / He am young";
    }
    /*LABEL ALTERNATIVA D*/
    public String getAltD(int i) {
        return this.altD[i-1];
    }
    public void setAltD() {
        //PERGUNTA 1
        this.altD[0] = "D. CAMA = TLEVISION / ROUPA = CLOCK";
        //PERGUNTA 2
        this.altD[1] = "D. LOUÇA = DISH / RELÓGIO = CLOTHES / RETRATO = CAR";
        //PERGUNTA 3
        this.altD[2] = "D. Carro quebrado / Televisão barata / Retrato bonito";
        //PERGUNTA 4
        this.altD[3] = "D. To see the clock / To wash the dishes / To build the table";
        //PERGUNTA 5
        this.altD[4] = "D. They build the table / He builds the table";
        //PERGUNTA 6
        this.altD[5] = "D. She washes the clothes";
        //PERGUNTA 7
        this.altD[6] = "D. You goes to the beautiful church";
        //PERGUNTA 8
        this.altD[7] = "D. Você = yous / Vocês = You";
        //PERGUNTA 9
        this.altD[8] = "D. He is young / I am young";
        //PROVA
        //PERGUNTA P1
        this.altD[10] = "D. CAMA = TLEVISION / ROUPA = CLOCK";
        //PERGUNTA P2
        this.altD[11] = "D. LOUÇA = DISH / RELÓGIO = CLOTHES / RETRATO = CAR";
        //PERGUNTA P3
        this.altD[12] = "D. Carro quebrado / Televisão barata / Retrato bonito";
        //PERGUNTA P4
        this.altD[13] = "D. To see the clock / To wash the dishes / To build the table";
        //PERGUNTA P5
        this.altD[14] = "D. They build the table / He builds the table";
        //PERGUNTA P6
        this.altD[15] = "D. She washes the clothes";
        //PERGUNTA P7
        this.altD[16] = "D. You goes to the beautiful church";
        //PERGUNTA P8
        this.altD[17] = "D. Você = yous / Vocês = You";
        //PERGUNTA P9
        this.altD[18] = "D. He is young / I am young";
    }
}