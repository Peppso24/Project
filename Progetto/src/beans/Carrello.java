package beans;

import java.util.ArrayList;

public class Carrello {
 
 ArrayList<Prodotti> cart;
 
 public Carrello(){
  cart = new ArrayList<Prodotti>();
 }

 public ArrayList<Prodotti> getCart(){
  return cart;
 }
 
 public void setCart(ArrayList<Prodotti> cart){
  this.cart=cart;
 }
 
}