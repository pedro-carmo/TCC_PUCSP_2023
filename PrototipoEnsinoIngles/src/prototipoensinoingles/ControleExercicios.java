package prototipoensinoingles;

public class ControleExercicios {
    private int nota = 0;
    private int pontos = 0;
    private int pontosProva = 0;
    public void setPontos(int pts){
        this.pontos = pts;
    }
    public int getPontos(){
        return this.pontos;
    }
    public void setPontosProva(int pts){
        this.pontosProva = pts;
    }
    public int getPontosProva(){
        return this.pontosProva;
    }
    
    private boolean[] travado = {
        //aula teorica
        false,//pg1
        false,//pg2
        false,//pg3
        false,//pg4
        false,//pg5
        false,//pg6
        false,//pg7
        false,//pg8
        false,//pg9
        true,//pg10
        //prova
        false,//pg11
        false,//pg12
        false,//pg13
        false,//pg14
        false,//pg15
        false,//pg16
        false,//pg17
        false,//pg18
        false,//pg19
        true,//pg20
    };
    
    public int corrigir(int pagina, char alternativa){
        /*insere o numero da pagina e a alternativa selecionada
        *"qual alternativa de qual pagina" é usado pra corrigir
        *bug da alt vazia: se uma alternativa for selecionada e cnfirmada, ao passar para outra pg, a alternativa
        continua selecionada, mesmo que não visivel. Entao, ao confirmar sem assinalar nada, a opcao da pg anterior
        será registrada de qualquer jeito, tendo chance de acertar e gerar ponto por uma alternativa vazia.
        *solucao: redundancia no mapeamento dos pontos, deixe claro quais alternativas sao erradas tambem.*/
        switch (pagina) {
            //AULA TEORICA
            case 1://correta = C; quase = A
                if(alternativa == 'c'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'a'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'b'||alternativa == 'd'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 2://correta = A; quase = B
                if(alternativa == 'a'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'b'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'c'||alternativa == 'd'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 3://correta = B; quase = D
                if(alternativa == 'b'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'd'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'a'||alternativa == 'c'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 4://correta = D; quase = C
                if(alternativa == 'd'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'c'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'a'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 5://correta = C; quase = D
                if(alternativa == 'c'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'c'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'a'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 6://correta = D; quase = A
                if(alternativa == 'd'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'a'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'c'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 7://correta = A; quase = B
                if(alternativa == 'a'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'b'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'd'||alternativa == 'c'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 8://correta = B; quase = A
                if(alternativa == 'b'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'a'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'd'||alternativa == 'c'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 9://correta = A; quase = D
                if(alternativa == 'a'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'd'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'c'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            //PROVA
            case 11://correta = C; quase = A
                if(alternativa == 'c'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'a'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'b'||alternativa == 'd'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 12://correta = A; quase = B
                if(alternativa == 'a'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'b'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'c'||alternativa == 'd'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 13://correta = B; quase = D
                if(alternativa == 'b'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'd'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'a'||alternativa == 'c'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 14://correta = D; quase = C
                if(alternativa == 'd'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'c'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'a'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 15://correta = C; quase = D
                if(alternativa == 'c'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'c'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'a'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 16://correta = D; quase = A
                if(alternativa == 'd'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'a'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'c'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 17://correta = A; quase = B
                if(alternativa == 'a'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'b'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'd'||alternativa == 'c'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 18://correta = B; quase = A
                if(alternativa == 'b'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'a'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'd'||alternativa == 'c'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            case 19://correta = A; quase = D
                if(alternativa == 'a'){//ganha 2 pts
                    this.nota = 2;
                }else if(alternativa == 'd'){//ganha 1 pts
                    this.nota = 1;
                }else if(alternativa == 'c'||alternativa == 'b'||alternativa == 'x'){
                    this.nota = 0;
                }
                break;
            default:
                this.nota = 0;
                break;
        }
        return this.nota;
    }
    
    public void setExTravado(int pagina){
        /*se ja foi confirmado, o ex deve travar
        *mapeia qual ex de qual pagina estará bloqueado*/
        this.travado[(pagina - 1)] = true;
    }
    public boolean getExTravado(int pagina){
        //verifica se na pagina atual o exercicio esta travado ou não
        return this.travado[(pagina - 1)];
    }
    
    
}
