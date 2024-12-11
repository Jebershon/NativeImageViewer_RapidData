// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class TestMessage implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testMessageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.TestMessage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		Message("Message"),
		ShareToType("ShareToType"),
		EmailSubject("EmailSubject");

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

	public TestMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestMessage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testMessageMendixObject)
	{
		if (testMessageMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, testMessageMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.testMessageMendixObject = testMessageMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativefiledocuments.proxies.TestMessage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.TestMessage(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.TestMessage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.TestMessage.initialize(context, mendixObject);
	}

	public static java.util.List<testnativefiledocuments.proxies.TestMessage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testnativefiledocuments.proxies.TestMessage.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
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
	 * Get value of ShareToType
	 * @param sharetotype
	 */
	public final nativefiledocuments.proxies.ShareToType getShareToType()
	{
		return getShareToType(getContext());
	}

	/**
	 * @param context
	 * @return value of ShareToType
	 */
	public final nativefiledocuments.proxies.ShareToType getShareToType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ShareToType.toString());
		if (obj == null) {
			return null;
		}
		return nativefiledocuments.proxies.ShareToType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ShareToType
	 * @param sharetotype
	 */
	public final void setShareToType(nativefiledocuments.proxies.ShareToType sharetotype)
	{
		setShareToType(getContext(), sharetotype);
	}

	/**
	 * Set value of ShareToType
	 * @param context
	 * @param sharetotype
	 */
	public final void setShareToType(com.mendix.systemwideinterfaces.core.IContext context, nativefiledocuments.proxies.ShareToType sharetotype)
	{
		if (sharetotype != null) {
			getMendixObject().setValue(context, MemberNames.ShareToType.toString(), sharetotype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.ShareToType.toString(), null);
		}
	}

	/**
	 * @return value of EmailSubject
	 */
	public final java.lang.String getEmailSubject()
	{
		return getEmailSubject(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailSubject
	 */
	public final java.lang.String getEmailSubject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmailSubject.toString());
	}

	/**
	 * Set value of EmailSubject
	 * @param emailsubject
	 */
	public final void setEmailSubject(java.lang.String emailsubject)
	{
		setEmailSubject(getContext(), emailsubject);
	}

	/**
	 * Set value of EmailSubject
	 * @param context
	 * @param emailsubject
	 */
	public final void setEmailSubject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emailsubject)
	{
		getMendixObject().setValue(context, MemberNames.EmailSubject.toString(), emailsubject);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testMessageMendixObject;
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
			final testnativefiledocuments.proxies.TestMessage that = (testnativefiledocuments.proxies.TestMessage) obj;
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
