package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
       Zerg sobaka = new Zerg();
       Zerg pios = new Zerg();
       Zerg tarakan = new Zerg();
       Zerg korova = new Zerg();
       Zerg zombi = new Zerg();
       
       sobaka.name = "sobaka";
        pios.name = "pios";
         tarakan.name = "tarakan";
          korova.name = "korova";
           zombi.name = "zombi";
           
       Protoss zil = new Protoss();
       Protoss pauk = new Protoss();
       Protoss stalker = new Protoss();
       
       zil.name = "ziloid";
       pauk.name = "begun";
       stalker.name = "Stalker";
       
       Terran ter1 = new Terran();
       Terran ter2 = new Terran();
       Terran ter3 = new Terran();
       Terran ter4 = new Terran();
       
       ter1.name = "teran";
        ter2.name = "Morodior";
        ter3.name = "tank";
        ter4.name = "car";
        
       
       
       
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
