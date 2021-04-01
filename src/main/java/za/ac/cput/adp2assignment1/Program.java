/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2assignment1;

/**
 *
 * @author Cameron Clyde Van Wyk 219076936
 */
public class Program {
    
     public static void main(String[] args) {
        
    }
    private String id, name, prgType;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrgType(String prgType) {
        this.prgType = prgType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrgType() {
        return prgType;
    }

    @Override
    public String toString() {
        return "Program{" + "id=" + id + 
                            ", name=" + name + 
                            ", prgType=" + prgType + '}';
    }
    

}
