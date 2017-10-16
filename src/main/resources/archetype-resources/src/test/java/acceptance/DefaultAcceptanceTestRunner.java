#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = {"src/test/resources/bdd/features"}, glue = {"${package}.steps.definition"})
public class DefaultAcceptanceTestRunner {}
