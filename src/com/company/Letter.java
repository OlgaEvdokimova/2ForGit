package com.company;

public class Letter {
    String symbol;


    Letter(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return symbol ;
    }

    @Override
    public boolean equals(Object obj) {
        return symbol.equals(obj);
    }
    @Override
    public int hashCode() {
        return symbol.hashCode();
    }

}
