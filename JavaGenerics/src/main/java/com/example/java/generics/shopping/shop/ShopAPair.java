package com.example.java.generics.shopping.shop;

public class ShopAPair {
    public static void main(String[] args) {
        CloningPair<Shoe> sp = new CloningPair<>(new Shoe(9, "Red"), new Shoe(10, "Green"));
        CloningPair<Shoe> sp2 = new CloningPair<>(new Shoe(9, "Red"), new Shoe(10, "Green"));
        CloningPair<Glove> gp = new CloningPair<>(new Glove(9, "Red"), new Glove(10, "Green"));
        CloningPair<Glove> gp2 = new CloningPair<>(new Glove(10, "Red"), new Glove(10, "Green"));

        boolean match=sp.matches();

        System.out.println("sp matches ? :" + sp.matches());
        System.out.println("gp matches ? :" + gp.matches());
        System.out.println("gp2 matches ? :" + gp2.matches());
        System.out.println("proposed matches ? :" +
                CloningPair.match(new Shoe(10, "Red"), new Shoe(10, "Red")));
//                CloningPair.<Shoe>match(new Shoe(10, "Red"), new Shoe(10, "Red")));
    }
}
