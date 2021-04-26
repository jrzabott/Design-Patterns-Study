/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author drochaju
 */
public class Person {

    private String name;

    private static final Logger LOG = Logger.getLogger(Person.class.getName());

    public Person(String name) {
        this.name = name;
        LOG.info("<" + name + ">: name was requested.");
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }
    public void setName(String name) {
        this.name = name;
    }

}
