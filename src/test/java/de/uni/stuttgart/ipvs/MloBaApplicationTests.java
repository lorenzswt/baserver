package de.uni.stuttgart.ipvs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import mloBa.MloBaApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MloBaApplication.class)
@WebAppConfiguration
public class MloBaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
