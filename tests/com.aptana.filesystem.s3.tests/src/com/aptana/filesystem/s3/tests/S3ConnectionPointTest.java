package com.aptana.filesystem.s3.tests;

import org.eclipse.core.runtime.Path;

import com.aptana.core.io.tests.CommonConnectionTest;
import com.aptana.ide.filesystem.s3.S3ConnectionPoint;

public class S3ConnectionPointTest extends CommonConnectionTest
{

	protected void setUp() throws Exception
	{
		S3ConnectionPoint ftpcp = new S3ConnectionPoint();
		ftpcp.setHost(getConfig().getProperty("s3.host", S3ConnectionPoint.DEFAULT_HOST)); //$NON-NLS-1$
		ftpcp.setLogin(getConfig().getProperty("s3.accessKey", "0ZA7YV7DBK6JCYAV77G2")); //$NON-NLS-1$ //$NON-NLS-2$
		String password = getConfig().getProperty("s3.secretAccessKey", ""); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println("**************S3 secret access key: " + password); //$NON-NLS-1$
		ftpcp.setPassword(password.toCharArray());
		ftpcp.setPath(new Path(getConfig().getProperty("s3.path", "/"))); //$NON-NLS-1$ //$NON-NLS-2$
		cp = ftpcp;

		super.setUp();
	}

	@Override
	protected boolean persistentConnection()
	{
		return false;
	}
}
