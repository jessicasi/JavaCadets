/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.Arrays;



/**
 *
 * @author jessicasi
 */
public class Storehouse implements Serializable{
    
        private Author[] authors;
        private Animal[] animal;
        private InventoryItem[] tools;
        private Provision[] provisions;

    public Storehouse() {
    }
        
       
    /**
     * Get the value of provisions
     *
     * @return the value of provisions
     */
    public Provision[] getProvisions() {
        return provisions;
    }

    /**
     * Set the value of provisions
     *
     * @param provisions new value of provisions
     */
    public void setProvisions(Provision[] provisions) {
        this.provisions = provisions;
    }


    /**
     * Get the value of tools
     *
     * @return the value of tools
     */
    public InventoryItem[] getTools() {
        return tools;
    }

    /**
     * Set the value of tools
     *
     * @param tools new value of tools
     */
    public void setTools(InventoryItem[] tools) {
        this.tools = tools;
    }


    /**
     * Get the value of animal
     *
     * @return the value of animal
     */
    public Animal[] getAnimal() {
        return animal;
    }

    /**
     * Set the value of animal
     *
     * @param animal new value of animal
     */
    public void setAnimal(Animal[] animal) {
        this.animal = animal;
    }


    /**
     * Get the value of authors
     *
     * @return the value of authors
     */
    public Author[] getAuthors() {
        return authors;
    }

    /**
     * Set the value of authors
     *
     * @param authors new value of authors
     */
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.authors);
        hash = 97 * hash + Arrays.deepHashCode(this.animal);
        hash = 97 * hash + Arrays.deepHashCode(this.tools);
        hash = 97 * hash + Arrays.deepHashCode(this.provisions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Storehouse other = (Storehouse) obj;
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        if (!Arrays.deepEquals(this.animal, other.animal)) {
            return false;
        }
        if (!Arrays.deepEquals(this.tools, other.tools)) {
            return false;
        }
        if (!Arrays.deepEquals(this.provisions, other.provisions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Storehouse{" + "authors=" + authors + ", animal=" + animal + ", tools=" + tools + ", provisions=" + provisions + '}';
    }
    
    

    
}