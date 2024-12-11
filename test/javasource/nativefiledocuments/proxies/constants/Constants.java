// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativefiledocuments.proxies.constants;

import com.mendix.core.Core;

public final class Constants
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Constants() {}

	// These are the constants for the NativeFileDocuments module

	/**
	* Log retention in days, zero or negative means no cleanup
	*/
	public static java.lang.Long getLOG_FILE_RETENTION()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("NativeFileDocuments.LOG_FILE_RETENTION");
	}

	/**
	* Log retention in days, zero or negative means no cleanup
	*/
	public static java.lang.Long getLOG_RETENTION()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("NativeFileDocuments.LOG_RETENTION");
	}

	public static java.lang.String getLOGNODE_NATIVE_FILE_DOCUMENTS()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("NativeFileDocuments.LOGNODE_NATIVE_FILE_DOCUMENTS");
	}
}