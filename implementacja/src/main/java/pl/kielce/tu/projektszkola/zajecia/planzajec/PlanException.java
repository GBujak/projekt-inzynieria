package pl.kielce.tu.projektszkola.zajecia.planzajec;

public class PlanException extends Exception {
    private final String msg;

    PlanException(String msg){
        this.msg = msg;
    }

    public String toString(){
        return ("PlanException occurred: " + msg);
    }
}
