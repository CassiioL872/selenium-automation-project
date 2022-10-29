package br.ce.wcaquino.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.tests.ContaTest;
import br.ce.wcaquino.tests.MovimentacaoTest;
import br.ce.wcaquino.tests.ResumoTest;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	ResumoTest.class
})
public class Suite {

}
