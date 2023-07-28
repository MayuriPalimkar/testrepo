package TestNG_features;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class time_out {

	@Test(timeOut = 10000)
	public void loginTest() {
		for (; ;) {
			System.out.println("Hello");
		}
	}

}
