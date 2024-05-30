//
package logica;

public class Cursos {
    String matematica, historia, ciencias, literatura, civica;
    
    public Cursos(){
    }
    
    public Cursos(String matematica, String historia, String ciencias, String literatura, String civica) {
        this.matematica = matematica;
        this.historia = historia;
        this.ciencias = ciencias;
        this.literatura = literatura;
        this.civica = civica;
    }

    public String getMatematica() {
        return matematica;
    }

    public void setMatematica(String matematica) {
        this.matematica = matematica;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getCiencias() {
        return ciencias;
    }

    public void setCiencias(String ciencias) {
        this.ciencias = ciencias;
    }

    public String getLiteratura() {
        return literatura;
    }

    public void setLiteratura(String literatura) {
        this.literatura = literatura;
    }

    public String getCivica() {
        return civica;
    }

    public void setCivica(String civica) {
        this.civica = civica;
    }

    @Override
    public String toString() {
        return "Cursos{" + "matematica=" + matematica + ", historia=" + historia + ", ciencias=" + ciencias + ", literatura=" + literatura + ", civica=" + civica + '}';
    }
    
}
