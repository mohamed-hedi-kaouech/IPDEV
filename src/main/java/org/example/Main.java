package example;

import org.example.Interfaces.InterfaceGblobal;
import org.example.Model.Personne;
import org.example.Service.PersonneService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne p = new Personne(26, "Mouldi", "kaouech", "4 Nahj Tribunal Mhamdia");
        InterfaceGblobal<Personne> ps = new PersonneService();
//        ps.add2(p);
        System.out.println(ps.getAll());
    }
}