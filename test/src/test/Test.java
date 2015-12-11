/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author yinru
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human aPerson = new Human();
        System.out.println(aPerson.getHeight());
        aPerson.growHeight(10);
        System.out.println(aPerson.getHeight());
    }
    
}


class Human
{
/**
     * accessor
     */
    int getHeight()
    {
        return this.height;
    }

    /**
     * pass argument
     */
    void growHeight(int h)
    {
        this.height = this.height + h;
    }

    int height;
}