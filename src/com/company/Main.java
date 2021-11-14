package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Model m= new Model();
        Controller controller=new Controller();
        View view=new View();
        System.out.println("Введите действие: ");
        m.x=sc.nextInt();
        m.d=sc.next();
        m.y=sc.nextInt();
        switch(m.d) {
            case "+":
                m.result=controller.summ(m.x, m.y);
                break;
            case "-":
                m.result=controller.min(m.x, m.y);
                break;
            case "*":
                m.result=controller.dob(m.x, m.y);
                break;
            case "/":
                m.result=controller.chast(m.x, m.y);
                break;
        }
        view.displey(m.result);
    }
}
