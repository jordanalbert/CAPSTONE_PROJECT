/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spingame;

/**
 *
 * @author angela
 */
public class SpinnerField {

    private String content;
    
    public SpinnerField(String c) {
        this.content = c;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    @Override
    public String toString() {
        return this.content;
    }
}
