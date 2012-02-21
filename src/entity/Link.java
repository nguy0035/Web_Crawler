/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tatthang
 */
public class Link implements Comparable {

    public Link(String url) {
        this.url = url;
    }

    
    @Override
    public int compareTo(Object o) {
        if (! (o instanceof Link)){
            throw new ClassCastException("Invalid object");
        }
        Link otherLink = (Link) o;
        if (this.url.equalsIgnoreCase(otherLink.getUrl()))
                return 0;
        
        return 1;
       
    }
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
