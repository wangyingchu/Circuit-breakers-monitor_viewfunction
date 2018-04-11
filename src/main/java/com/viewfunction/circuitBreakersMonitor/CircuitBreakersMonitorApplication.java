package com.viewfunction.circuitBreakersMonitor;

import com.viewfunction.circuitBreakersMonitor.util.ApplicationLauncherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class CircuitBreakersMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakersMonitorApplication.class, args);
        ApplicationLauncherUtil.printApplicationConsoleBanner();
	}
}
