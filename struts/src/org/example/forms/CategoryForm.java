package org.example.forms;

import org.apache.struts.validator.ValidatorForm;

public class CategoryForm extends ValidatorForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
