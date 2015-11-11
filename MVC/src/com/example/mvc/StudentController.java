package com.example.mvc;

/**
 * Created by Brenda on 11/10/2015.
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setIDNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getIDNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getIDNo());
    }
}