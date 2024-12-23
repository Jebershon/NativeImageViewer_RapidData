// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class TestMessageImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.TestMessageImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		EnableCaching("EnableCaching"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		TestMessageImage_TestMessage("TestNativeFileDocuments.TestMessageImage_TestMessage");

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

	public TestMessageImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestMessageImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testMessageImageMendixObject)
	{
		super(context, testMessageImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, testMessageImageMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativefiledocuments.proxies.TestMessageImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.TestMessageImage(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.TestMessageImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.TestMessageImage.initialize(context, mendixObject);
	}

	public static java.util.List<testnativefiledocuments.proxies.TestMessageImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testnativefiledocuments.proxies.TestMessageImage.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TestMessageImage_TestMessage
	 */
	public final testnativefiledocuments.proxies.TestMessage getTestMessageImage_TestMessage() throws com.mendix.core.CoreException
	{
		return getTestMessageImage_TestMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of TestMessageImage_TestMessage
	 * @throws com.mendix.core.CoreException
	 */
	public final testnativefiledocuments.proxies.TestMessage getTestMessageImage_TestMessage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testnativefiledocuments.proxies.TestMessage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TestMessageImage_TestMessage.toString());
		if (identifier != null) {
			result = testnativefiledocuments.proxies.TestMessage.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TestMessageImage_TestMessage
	 * @param testmessageimage_testmessage
	 */
	public final void setTestMessageImage_TestMessage(testnativefiledocuments.proxies.TestMessage testmessageimage_testmessage)
	{
		setTestMessageImage_TestMessage(getContext(), testmessageimage_testmessage);
	}

	/**
	 * Set value of TestMessageImage_TestMessage
	 * @param context
	 * @param testmessageimage_testmessage
	 */
	public final void setTestMessageImage_TestMessage(com.mendix.systemwideinterfaces.core.IContext context, testnativefiledocuments.proxies.TestMessage testmessageimage_testmessage)
	{
		if (testmessageimage_testmessage == null) {
			getMendixObject().setValue(context, MemberNames.TestMessageImage_TestMessage.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TestMessageImage_TestMessage.toString(), testmessageimage_testmessage.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testnativefiledocuments.proxies.TestMessageImage that = (testnativefiledocuments.proxies.TestMessageImage) obj;
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
