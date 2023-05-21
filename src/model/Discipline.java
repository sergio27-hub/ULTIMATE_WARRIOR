/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chejo
 */
public class Discipline {
    
    private int discipline_id;
    private String name;
    private String description;
    
    public Discipline(int discipline_id, String name, String description) {
        this.discipline_id = discipline_id;
        this.name = name;
        this.description = description;
    }

    public Discipline(String name, String description) {
	this(-1, name, description);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscipline_id() {
        return discipline_id;
    }

    public void setDiscipline_id(int discipline_id) {
        this.discipline_id = discipline_id;
    }
    
    
}
