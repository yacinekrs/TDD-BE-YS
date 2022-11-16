package fr.isima.master1.genielog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Nested
    class Creation {

        @Test
        void cannotCreatNullName() {
            assertThatThrownBy(() -> {new Role(null);}).isInstanceOf(IllegalArgumentException.class)

        }
        @Test
        void cannotCreatEmptyName() {
            assertThatThrownBy(() -> {new Role("");}).isInstanceOf(IllegalArgumentException.class)
        }
        @Test
        void cannotCreatBalnkName() {
            assertThatThrownBy(() -> {new Role("  ");}).isInstanceOf(IllegalArgumentException.class)

        }
        @Test
        void mustBeValidRole() {
            var role = new Role ("manager");
        }
    }
    @Nested
    class equality {
        @Test
        void roleMustBeEqualToItSelf() {
            var role = new Role("dev");
            assertThat(role.equals(role));
        }
        @Test
        void cannotCreatEmptyName() {

        }
        @Test
        void cannotCreatBalnkName() {

        }
        @Test
        void cannotCreatNameWithDigit() {

        }
    }

}