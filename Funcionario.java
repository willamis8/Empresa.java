public class Funcionario {
private String nome;
private double  SalarioBase;

public Funcionario(String nome, double SalarioBase){
    this.nome = nome;
    this.SalarioBase = SalarioBase;
}
public String getnome(){
    return nome;
}
public void setnome(String nome){
 this.nome = nome;
}
        public double getsalarioBase(){
            return SalarioBase;
        }
        public void getsalarioBase(double SalarioBase){
            this.SalarioBase = SalarioBase;
        }
        public double calcularsalario(){
            return SalarioBase;
        }
}


