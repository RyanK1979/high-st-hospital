package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Janitor("", "");

		int salary = underTest.getSalary();

		assertThat(salary, is(40000));
	}

}
