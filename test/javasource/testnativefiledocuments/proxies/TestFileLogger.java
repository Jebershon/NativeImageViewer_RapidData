// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class TestFileLogger implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testFileLoggerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.TestFileLogger";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LogLevel("LogLevel"),
		LogMessage("LogMessage");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TestFileLogger(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestFileLogger(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testFileLoggerMendixObject)
	{
		if (testFileLoggerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, testFileLoggerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.testFileLoggerMendixObject = testFileLoggerMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativefiledocuments.proxies.TestFileLogger initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.TestFileLogger(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.TestFileLogger load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.TestFileLogger.initialize(context, mendixObject);
	}

	/**
	 * Get value of LogLevel
	 * @param loglevel
	 */
	public final nativefiledocuments.proxies.FileLogLevel getLogLevel()
	{
		return getLogLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of LogLevel
	 */
	public final nativefiledocuments.proxies.FileLogLevel getLogLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.LogLevel.toString());
		if (obj == null) {
			return null;
		}
		return nativefiledocuments.proxies.FileLogLevel.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of LogLevel
	 * @param loglevel
	 */
	public final void setLogLevel(nativefiledocuments.proxies.FileLogLevel loglevel)
	{
		setLogLevel(getContext(), loglevel);
	}

	/**
	 * Set value of LogLevel
	 * @param context
	 * @param loglevel
	 */
	public final void setLogLevel(com.mendix.systemwideinterfaces.core.IContext context, nativefiledocuments.proxies.FileLogLevel loglevel)
	{
		if (loglevel != null) {
			getMendixObject().setValue(context, MemberNames.LogLevel.toString(), loglevel.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.LogLevel.toString(), null);
		}
	}

	/**
	 * @return value of LogMessage
	 */
	public final java.lang.String getLogMessage()
	{
		return getLogMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of LogMessage
	 */
	public final java.lang.String getLogMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LogMessage.toString());
	}

	/**
	 * Set value of LogMessage
	 * @param logmessage
	 */
	public final void setLogMessage(java.lang.String logmessage)
	{
		setLogMessage(getContext(), logmessage);
	}

	/**
	 * Set value of LogMessage
	 * @param context
	 * @param logmessage
	 */
	public final void setLogMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String logmessage)
	{
		getMendixObject().setValue(context, MemberNames.LogMessage.toString(), logmessage);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testFileLoggerMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testnativefiledocuments.proxies.TestFileLogger that = (testnativefiledocuments.proxies.TestFileLogger) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}