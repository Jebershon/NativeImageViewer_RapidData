// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class Base64EncodedImage implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject base64EncodedImageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.Base64EncodedImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Base64Contents("Base64Contents"),
		FileName("FileName");

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

	public Base64EncodedImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Base64EncodedImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject base64EncodedImageMendixObject)
	{
		if (base64EncodedImageMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, base64EncodedImageMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.base64EncodedImageMendixObject = base64EncodedImageMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativefiledocuments.proxies.Base64EncodedImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.Base64EncodedImage(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.Base64EncodedImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.Base64EncodedImage.initialize(context, mendixObject);
	}

	/**
	 * @return value of Base64Contents
	 */
	public final java.lang.String getBase64Contents()
	{
		return getBase64Contents(getContext());
	}

	/**
	 * @param context
	 * @return value of Base64Contents
	 */
	public final java.lang.String getBase64Contents(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Base64Contents.toString());
	}

	/**
	 * Set value of Base64Contents
	 * @param base64contents
	 */
	public final void setBase64Contents(java.lang.String base64contents)
	{
		setBase64Contents(getContext(), base64contents);
	}

	/**
	 * Set value of Base64Contents
	 * @param context
	 * @param base64contents
	 */
	public final void setBase64Contents(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String base64contents)
	{
		getMendixObject().setValue(context, MemberNames.Base64Contents.toString(), base64contents);
	}

	/**
	 * @return value of FileName
	 */
	public final java.lang.String getFileName()
	{
		return getFileName(getContext());
	}

	/**
	 * @param context
	 * @return value of FileName
	 */
	public final java.lang.String getFileName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FileName.toString());
	}

	/**
	 * Set value of FileName
	 * @param filename
	 */
	public final void setFileName(java.lang.String filename)
	{
		setFileName(getContext(), filename);
	}

	/**
	 * Set value of FileName
	 * @param context
	 * @param filename
	 */
	public final void setFileName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String filename)
	{
		getMendixObject().setValue(context, MemberNames.FileName.toString(), filename);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return base64EncodedImageMendixObject;
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
			final testnativefiledocuments.proxies.Base64EncodedImage that = (testnativefiledocuments.proxies.Base64EncodedImage) obj;
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
