package com.company;

import com.company.candy.Kitkat;
import com.company.candy.Snickers;
import com.company.candy.Twix;
import com.company.crips.Doritos;
import com.company.crips.Lays;
import com.company.crips.Pringles;
import com.company.drinks.Cola;
import com.company.drinks.Fanta;
import com.company.drinks.Pepsi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VendMachine {
    private HashMap<String, List<Product>> productBoard = new HashMap<>();

    public HashMap<String, List<Product>> getProductBoard(HashMap<Character, Integer> comandVM) {
        return productBoard;
    }

    public void setProductBoard(HashMap<String, List<Product>> productBoard) {
        this.productBoard = productBoard;
    }

    public VendMachine(HashMap<Character, Integer> productBoard) {
        this.productBoard = productBoard;
    }


    private void initilizeBoard(){
        Cola cola = new Cola();
        Pepsi pepsi = new Pepsi();
        Fanta fanta = new Fanta();
        ArrayList<Product> drinks = new ArrayList<>();
        drinks.add(cola);
        drinks.add(fanta);
        drinks.add(pepsi);


        Kitkat kitkat = new Kitkat();
        Snickers snickers = new Snickers();
        Twix twix = new Twix();
        ArrayList<Product> candys = new ArrayList<>();
        candys.add(kitkat);
        candys.add(snickers);
        candys.add(twix);

        Doritos doritos = new Doritos();
        Lays lays = new Lays();
        Pringles pringles = new Pringles();
        ArrayList<Product> crisps = new ArrayList<>();
        crisps.add(doritos);
        crisps.add(lays);
        crisps.add(pringles);




        productBoard.put("A", drinks);
        productBoard.put("B", candys);
        productBoard.put("C", crisps);

    }
}
