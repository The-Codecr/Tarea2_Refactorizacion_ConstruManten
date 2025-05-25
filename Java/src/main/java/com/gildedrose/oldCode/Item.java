package com.gildedrose;

public class Item {
   
    /* Se aplica el concepto de encapsulamiento para proteger 
    los atributos de la clase */
    private String _name;
    private int _sellIn , _quality;

    // Constructor
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    /* Getters y setters , se utilizan para acceder 
    y modificar los atributos de la clase*/
    public String name {get: return _name; set: _name = value;}
    public int sellIn {get: return _sellIn; set: _sellIn = value;}
    public int quality {get: return _quality; set: _quality = value;}


    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + quality;
    }
}

#region Old Code
/*public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
} */
#endregion