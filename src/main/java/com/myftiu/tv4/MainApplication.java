package com.myftiu.tv4;

import com.myftiu.tv4.configuration.ProjectConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author by ali myftiu on 27/11/14.
 */
public class MainApplication extends Application<ProjectConfiguration>  {



	public static void main(String[] args) throws Exception
	{
		new MainApplication().run(args);
	}

	@Override
	public void initialize(Bootstrap<ProjectConfiguration> bootstrap)
	{

	}

	@Override
	public void run(ProjectConfiguration configuration, Environment environment) throws Exception
	{

	}
}
