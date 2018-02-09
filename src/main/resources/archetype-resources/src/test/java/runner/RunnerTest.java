package ${package}.runner;

import java.lang.annotation.Annotation;

import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.openbdt.run.SuiteTestRunner;
import io.openbdt.setup.Setup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/setup-spring.xml")
public class RunnerTest {

	@Autowired
	@Qualifier("webSetup")
	private Setup setup;

	@Autowired
	private SuiteTestRunner suiteTestRunner;

	@Test
	public void test() {
		for(Annotation annotation : this.setup.getClass().getAnnotations()){
			System.out.println(annotation);
		}
		Result result = suiteTestRunner.runWithJunit(this.setup.getClass());
		for(Failure failure: result.getFailures()) {
			System.out.println("Exception: " + failure.getException());
			System.out.println("Message: "+  failure.getMessage());
			System.out.println("Trace: "+  failure.getTrace());
		}
	}
}