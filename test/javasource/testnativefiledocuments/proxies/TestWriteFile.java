// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class TestWriteFile extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.TestWriteFile";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Base64Data("Base64Data"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public TestWriteFile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestWriteFile(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testWriteFileMendixObject)
	{
		super(context, testWriteFileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, testWriteFileMendixObject.getType())) {
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
	public static testnativefiledocuments.proxies.TestWriteFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.TestWriteFile(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.TestWriteFile load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.TestWriteFile.initialize(context, mendixObject);
	}

	public static java.util.List<testnativefiledocuments.proxies.TestWriteFile> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testnativefiledocuments.proxies.TestWriteFile.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Base64Data
	 */
	public final java.lang.String getBase64Data()
	{
		return getBase64Data(getContext());
	}

	/**
	 * @param context
	 * @return value of Base64Data
	 */
	public final java.lang.String getBase64Data(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Base64Data.toString());
	}

	/**
	 * Set value of Base64Data
	 * @param base64data
	 */
	public final void setBase64Data(java.lang.String base64data)
	{
		setBase64Data(getContext(), base64data);
	}

	/**
	 * Set value of Base64Data
	 * @param context
	 * @param base64data
	 */
	public final void setBase64Data(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String base64data)
	{
		getMendixObject().setValue(context, MemberNames.Base64Data.toString(), base64data);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testnativefiledocuments.proxies.TestWriteFile that = (testnativefiledocuments.proxies.TestWriteFile) obj;
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
