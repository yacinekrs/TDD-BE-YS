package fr.isima.master1.genielog;

import java.util.Objects;

public class Role {
    String name;

    public Role (String name){
        if (name == null) throw new IllegalArgumentException("Un nom ne peut pas etre null");
        if (name.isEmpty()) throw new IllegalArgumentException("Un nom ne peut pas etre vide");
        if (name.isBlank()) throw new IllegalArgumentException("Un nom ne peut pas avoir d'espace");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return name.equals(role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
