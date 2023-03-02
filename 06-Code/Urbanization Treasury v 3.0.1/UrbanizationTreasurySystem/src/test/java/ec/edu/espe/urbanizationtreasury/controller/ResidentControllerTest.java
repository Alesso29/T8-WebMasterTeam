package ec.edu.espe.urbanizationtreasury.controller;

import ec.edu.espe.urbanizationtreasury.model.Resident;
import org.bson.Document;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author joela
 */
public class ResidentControllerTest {
    
    public ResidentControllerTest() {
    }

    /**
     * Test of validateTheId method, of class ResidentController.
     */
    @Test
    public void testValidateTheId() throws Exception {
        System.out.println("validateTheId");
        String id = "1722263009";
        ResidentController.validateTheId(id);
    }

    /**
     * Test of toDocument method, of class ResidentController.
     */
    @Test
    public void testToDocument() {
        System.out.println("toDocument");
        Resident resident = new Resident(1727925602L,21,"Augusto Salazar");
        Document expResult = new Document();
        expResult.append("id", 1727925602L)
                .append("name", "Augusto Salazar")
                .append("batch", 21);
        Document result = ResidentController.toDocument(resident);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
