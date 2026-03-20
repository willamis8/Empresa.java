public class Gerente extends Funcionario{
private Double Bonus;
public Gerente(String nome, Double SalarioBase, double Bonus){
super(nome, SalarioBase);
this.Bonus= Bonus;
}
public Double getbonus(){
    return Bonus;
}
    public void setbonus(double bonus){
     this.Bonus = Bonus;
    }

   @Override

   public double calcularsalario(){
    return getsalarioBase() + Bonus;
   }
    }
    


