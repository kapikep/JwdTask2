package by.epam.jwd2.service;

import by.epam.jwd2.entity.Criteria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {

    @Test
    void validate() {

        Criteria criteria = new Criteria("");
        assertFalse(Validator.validate(criteria));

        Criteria criteria1 = new Criteria("refrigerator");
        assertTrue(Validator.validate(criteria1));
        criteria1.addCriteria("height", "170");
        criteria1.addCriteria("powerConsumption", "100");
        assertTrue(Validator.validate(criteria1));
        criteria1.addCriteria("hg", "170");
        assertFalse(Validator.validate(criteria1));

        Criteria criteria2 = new Criteria("refrigerator");
        criteria2.addCriteria("height", "170");
        criteria2.addCriteria("powerConsumption", "100");
        assertTrue(Validator.validate(criteria2));
        criteria2.addCriteria("powerConsumption", "5969696");
        assertFalse(Validator.validate(criteria2));

        Criteria criteria3 = new Criteria("");
        criteria3.addCriteria("height", "10");
        assertTrue(Validator.validate(criteria3));
        criteria3.addCriteria("jj", "");
        assertFalse(Validator.validate(criteria3));

    }
}