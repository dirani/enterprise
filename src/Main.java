public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


/*
Exercicio:


Criei 3 classes, funcionário, desenvolvedor e gestor.

* Todo funcionário tem um nome e um identificador.
* Essas 3 classes devem ter o método calcular salário.
* O desenvolvedor deve ter um atributo chamado “experieriencia” que pode ser (júnior, mid, senior) tip Enum
* O salário do desenvolvedor é o salário base(800Є )  x 1 para junior, x 2,51 para mid e x 3,33 para senior.
* O gestor deve ter um atributo chamado “numeroProjeto”.
* O salário do gestor é o numero de projeto x 0.33 x o salário base (1100Є)
* Criei outra classe chamada RH. O RH deve ter um método que recebe um funcionário, e é capaz de calcular o salário desse funcionário.
* Criei uma classe chamada empresa. Essa classe deve ser capaz de adicionar e remover funcionário.
* Essa classe também deverá ter um método para exportar o salário de todos os funcionários. Esse método deverá imprimir o salário de todos os funcionários, e retornar uma List de String com o nome e salário de cada funcionário. Tenha cuidado, se por algum motivo a empresa tiver cadastrado o mesmo usuário 2x, esse método por ser critico precisa validar isso e evitar exibir o salário do candidato 2x.
* Faça 2 implementações desse método, uma com stream e outra sem.

* Crie uma classe Main que tenha um método main e execute o exercicio acima.
* Seu método main deve inserir na empresa pelo menos 3 funcionarios. */
