package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Receptionist("", "");

		int salary = underTest.getSalary();

		assertThat(salary, is(45000));
	}

}
