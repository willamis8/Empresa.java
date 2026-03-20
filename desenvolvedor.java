public class desenvolvedor extends Funcionario{
private int horaextras;
private double valorhoraextra;

public desenvolvedor(String nome, double SalarioBase, int  horaextras, double valorhoraextra){
    super(nome, SalarioBase);
    this.horaextras = horaextras;
    this.valorhoraextra = valorhoraextra;
}
public int gethoraextras(){
    return horaextras;
}
public void sethoraextras(int horaextras){
    this.horaextras = horaextras;
}
public double  getvalorhoraextra(){
    return valorhoraextra;
}
public void setvalorhoraextra(double valorhoraextra){
    this.valorhoraextra = valorhoraextra;
}
@Override
 public double calcularsalario(){
    return getsalarioBase() + (horaextras + valorhoraextra);
 }
}

