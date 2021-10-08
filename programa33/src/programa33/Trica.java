package programa33;

public class Trica {
    int trica[][]=new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}
    };
    int turno=0;
    void nuevaMovida(int x,int y){
        if(trica[x][y]==0){
            trica[x][y]=getTurno();
            setSiguienteTurno();
        }
    }
    public int getTurno(){
        return turno%2==0?1:-1;
    }
    private int getTurnoAnterior(){
        return getTurno()*-1;
    }
    public void setSiguienteTurno(){
        turno++;
    }
    public int hayGanador(){
        for(int i=0;i<3;i++){
            int h=0,v=0;
            for(int j=0;j<3;j++){
                h+=trica[i][j];
                v+=trica[j][i];
            }
            if(h==3||h==-3 || v==3||v==-3)
                return trica[i][i];
        }
        int d=0,di=0;
        for(int i=0;i<3;i++){
            d+=trica[i][i];
            di+=trica[i][3-i-1];
        }
        if(d==3||d==-3 || di==3||di==-3)
            return trica[1][1];
        int ceros=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(trica[i][j]==0)
                    ceros++;
        if(ceros==0)
            return 100;
        return 0;
    }
}
