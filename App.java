public class app{

 public static void main(String[] args) {
       Funcionario f1 = new Funcionario("matheus", 3500);
       Funcionario f2 = new Gerente ("marlon", 5000, 1500);
       Funcionario f3 = new desenvolvedor("julia", 4500, 20, 70);

       system.out.println("funcionario:" + f1.getnome());
       system.out.println("salario final:" + f2.calcularsalario());
       system.out.println();

System.out.println("Funcionário: " + f2.getNome());
        System.out.println("Salário Final: " + f2.calcularSalario());
        System.out.println();


        System.out.println("Funcionário: " + f3.getNome());
        System.out.println("Salário Final: " + f3.calcularSalario());
    }
    }
