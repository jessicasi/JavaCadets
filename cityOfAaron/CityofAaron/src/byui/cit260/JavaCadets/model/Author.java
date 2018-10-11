/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jesscasi
 */
public class Author implements Serializable{
    
        private String authors;

    public Author() {
    }
        

    /**
     * Get the value of authors
     *
     * @return the value of authors
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * Set the value of authors
     *
     * @param authors new value of authors
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.authors);
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
        final Author other = (Author) obj;
        if (!Objects.equals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Author{" + "authors=" + authors + '}';
    }

   

}