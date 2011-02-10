package com.jakewharton.gwtbase.client.application.ioc;

import com.google.gwt.inject.client.Ginjector;
import com.jakewharton.gwtbase.client.application.Application;

// Interface for that forces or "extending" injectors (who are interfaces)
// to return an AcrintaFitnessApp
public interface ApplicationInjector extends Ginjector {
	// not too exciting. just setting up our interface
	Application getApplication();
}
