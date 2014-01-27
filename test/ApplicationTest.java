import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.NombreDecimal;
import models.NombreRomain;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    void assert_en_romain(int d, String r) {
		assertThat(new NombreDecimal(d).en_romain()).isEqualTo(r);
    }

    @Test
    public void romain_unites() {
		assert_en_romain(0,"");
		assert_en_romain(1,"I");
		assert_en_romain(2,"II");
		assert_en_romain(3,"III");
		assert_en_romain(4,"IV");
		assert_en_romain(5,"V");
		assert_en_romain(6,"VI");
		assert_en_romain(7,"VII");
		assert_en_romain(8,"VIII");
		assert_en_romain(9,"IX");
    }
    
    /*@Test
    public void romain_dizaines(){
		assert_en_romain(10,"X");
		assert_en_romain(20,"XX");
		assert_en_romain(30,"XXX");
		assert_en_romain(40,"XL");
		assert_en_romain(50,"L");
		assert_en_romain(60,"LX");
		assert_en_romain(70,"LXX");
		assert_en_romain(80,"LXXX");
		assert_en_romain(90,"XC");
	}
	/*@Test
    public void romain_centaines(){
		assert_en_romain(100,"C");
		assert_en_romain(200,"CC");
		assert_en_romain(300,"CCC");
		assert_en_romain(400,"CD");
		assert_en_romain(500,"D");
		assert_en_romain(600,"DC");
		assert_en_romain(700,"DCC");
		assert_en_romain(800,"DCCC");
		assert_en_romain(900,"CM");
	}*/
}
