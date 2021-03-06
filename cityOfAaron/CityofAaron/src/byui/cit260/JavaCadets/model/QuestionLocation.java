/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;



/**
 *
 * @author Steven
 */
public class QuestionLocation extends Location implements Serializable{
    private Question question;

    public QuestionLocation() {
    }
    
     public void setQuestions(ArrayList<Question> questionsInLocation) {
      
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.question);
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
        final QuestionLocation other = (QuestionLocation) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionLocation{" + "question=" + question + '}';
    }

   
    
}
