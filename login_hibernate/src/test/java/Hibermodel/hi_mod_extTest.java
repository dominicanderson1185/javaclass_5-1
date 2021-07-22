package Hibermodel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hi_mod_extTest {




	@Test
	void getPassword() {

		hi_mod_ext x = new hi_mod_ext("student","lost");
		assertEquals("lost", x.yoPassword());
	}

	@Test
	void getUsername() {
		hi_mod_ext x = new hi_mod_ext("student@yahoo","lost");
		assertEquals("student@yahoo", x.yoUsername() );
	}
	@Test
	void getUsername1() {
		hi_mod_ext x = new hi_mod_ext("student","lost");
		assertEquals("student", x.yoPassword());}

		@Test
		void getPassword2(){
			hi_mod_ext x = new hi_mod_ext("student","lost312");
			assertEquals("lost312", x.yoPassword());
		}
	}
