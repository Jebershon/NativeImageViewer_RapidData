// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class TestLogListener implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testLogListenerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.TestLogListener";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DefaultLogLevel("DefaultLogLevel"),
		LogLevel("LogLevel"),
		Message("Message"),
		IsListenerActive("IsListenerActive");

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

	public TestLogListener(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestLogListener(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testLogListenerMendixObject)
	{
		if (testLogListenerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, testLogListenerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.testLogListenerMendixObject = testLogListenerMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativefiledocuments.proxies.TestLogListener initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.TestLogListener(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.TestLogListener load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.TestLogListener.initialize(context, mendixObject);
	}

	/**
	 * Get value of DefaultLogLevel
	 * @param defaultloglevel
	 */
	public final nativefiledocuments.proxies.LogLevel getDefaultLogLevel()
	{
		return getDefaultLogLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of DefaultLogLevel
	 */
	public final nativefiledocuments.proxies.LogLevel getDefaultLogLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DefaultLogLevel.toString());
		if (obj == null) {
			return null;
		}
		return nativefiledocuments.proxies.LogLevel.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DefaultLogLevel
	 * @param defaultloglevel
	 */
	public final void setDefaultLogLevel(nativefiledocuments.proxies.LogLevel defaultloglevel)
	{
		setDefaultLogLevel(getContext(), defaultloglevel);
	}

	/**
	 * Set value of DefaultLogLevel
	 * @param context
	 * @param defaultloglevel
	 */
	public final void setDefaultLogLevel(com.mendix.systemwideinterfaces.core.IContext context, nativefiledocuments.proxies.LogLevel defaultloglevel)
	{
		if (defaultloglevel != null) {
			getMendixObject().setValue(context, MemberNames.DefaultLogLevel.toString(), defaultloglevel.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.DefaultLogLevel.toString(), null);
		}
	}

	/**
	 * Get value of LogLevel
	 * @param loglevel
	 */
	public final nativefiledocuments.proxies.LogLevel getLogLevel()
	{
		return getLogLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of LogLevel
	 */
	public final nativefiledocuments.proxies.LogLevel getLogLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.LogLevel.toString());
		if (obj == null) {
			return null;
		}
		return nativefiledocuments.proxies.LogLevel.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of LogLevel
	 * @param loglevel
	 */
	public final void setLogLevel(nativefiledocuments.proxies.LogLevel loglevel)
	{
		setLogLevel(getContext(), loglevel);
	}

	/**
	 * Set value of LogLevel
	 * @param context
	 * @param loglevel
	 */
	public final void setLogLevel(com.mendix.systemwideinterfaces.core.IContext context, nativefiledocuments.proxies.LogLevel loglevel)
	{
		if (loglevel != null) {
			getMendixObject().setValue(context, MemberNames.LogLevel.toString(), loglevel.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.LogLevel.toString(), null);
		}
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of IsListenerActive
	 */
	public final java.lang.Boolean getIsListenerActive()
	{
		return getIsListenerActive(getContext());
	}

	/**
	 * @param context
	 * @return value of IsListenerActive
	 */
	public final java.lang.Boolean getIsListenerActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsListenerActive.toString());
	}

	/**
	 * Set value of IsListenerActive
	 * @param islisteneractive
	 */
	public final void setIsListenerActive(java.lang.Boolean islisteneractive)
	{
		setIsListenerActive(getContext(), islisteneractive);
	}

	/**
	 * Set value of IsListenerActive
	 * @param context
	 * @param islisteneractive
	 */
	public final void setIsListenerActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islisteneractive)
	{
		getMendixObject().setValue(context, MemberNames.IsListenerActive.toString(), islisteneractive);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testLogListenerMendixObject;
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
			final testnativefiledocuments.proxies.TestLogListener that = (testnativefiledocuments.proxies.TestLogListener) obj;
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
