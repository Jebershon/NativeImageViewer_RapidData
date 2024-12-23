// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativefiledocuments.proxies;

public class ImageToResize extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeFileDocuments.ImageToResize";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ImageWidth("ImageWidth"),
		ImageHeight("ImageHeight"),
		MaxResizedImageWidth("MaxResizedImageWidth"),
		MaxResizedImageHeight("MaxResizedImageHeight"),
		CompressionFormat("CompressionFormat"),
		Quality("Quality"),
		Rotation("Rotation"),
		KeepMetaData("KeepMetaData"),
		ResizeMode("ResizeMode"),
		PublicThumbnailPath("PublicThumbnailPath"),
		EnableCaching("EnableCaching"),
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

	public ImageToResize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ImageToResize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageToResizeMendixObject)
	{
		super(context, imageToResizeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, imageToResizeMendixObject.getType())) {
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
	public static testnativefiledocuments.proxies.ImageToResize initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativefiledocuments.proxies.ImageToResize(context, mendixObject);
	}

	public static testnativefiledocuments.proxies.ImageToResize load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativefiledocuments.proxies.ImageToResize.initialize(context, mendixObject);
	}

	public static java.util.List<testnativefiledocuments.proxies.ImageToResize> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testnativefiledocuments.proxies.ImageToResize.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of ImageWidth
	 */
	public final java.lang.Integer getImageWidth()
	{
		return getImageWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of ImageWidth
	 */
	public final java.lang.Integer getImageWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ImageWidth.toString());
	}

	/**
	 * Set value of ImageWidth
	 * @param imagewidth
	 */
	public final void setImageWidth(java.lang.Integer imagewidth)
	{
		setImageWidth(getContext(), imagewidth);
	}

	/**
	 * Set value of ImageWidth
	 * @param context
	 * @param imagewidth
	 */
	public final void setImageWidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer imagewidth)
	{
		getMendixObject().setValue(context, MemberNames.ImageWidth.toString(), imagewidth);
	}

	/**
	 * @return value of ImageHeight
	 */
	public final java.lang.Integer getImageHeight()
	{
		return getImageHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of ImageHeight
	 */
	public final java.lang.Integer getImageHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ImageHeight.toString());
	}

	/**
	 * Set value of ImageHeight
	 * @param imageheight
	 */
	public final void setImageHeight(java.lang.Integer imageheight)
	{
		setImageHeight(getContext(), imageheight);
	}

	/**
	 * Set value of ImageHeight
	 * @param context
	 * @param imageheight
	 */
	public final void setImageHeight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer imageheight)
	{
		getMendixObject().setValue(context, MemberNames.ImageHeight.toString(), imageheight);
	}

	/**
	 * @return value of MaxResizedImageWidth
	 */
	public final java.lang.Integer getMaxResizedImageWidth()
	{
		return getMaxResizedImageWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxResizedImageWidth
	 */
	public final java.lang.Integer getMaxResizedImageWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxResizedImageWidth.toString());
	}

	/**
	 * Set value of MaxResizedImageWidth
	 * @param maxresizedimagewidth
	 */
	public final void setMaxResizedImageWidth(java.lang.Integer maxresizedimagewidth)
	{
		setMaxResizedImageWidth(getContext(), maxresizedimagewidth);
	}

	/**
	 * Set value of MaxResizedImageWidth
	 * @param context
	 * @param maxresizedimagewidth
	 */
	public final void setMaxResizedImageWidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxresizedimagewidth)
	{
		getMendixObject().setValue(context, MemberNames.MaxResizedImageWidth.toString(), maxresizedimagewidth);
	}

	/**
	 * @return value of MaxResizedImageHeight
	 */
	public final java.lang.Integer getMaxResizedImageHeight()
	{
		return getMaxResizedImageHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxResizedImageHeight
	 */
	public final java.lang.Integer getMaxResizedImageHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxResizedImageHeight.toString());
	}

	/**
	 * Set value of MaxResizedImageHeight
	 * @param maxresizedimageheight
	 */
	public final void setMaxResizedImageHeight(java.lang.Integer maxresizedimageheight)
	{
		setMaxResizedImageHeight(getContext(), maxresizedimageheight);
	}

	/**
	 * Set value of MaxResizedImageHeight
	 * @param context
	 * @param maxresizedimageheight
	 */
	public final void setMaxResizedImageHeight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxresizedimageheight)
	{
		getMendixObject().setValue(context, MemberNames.MaxResizedImageHeight.toString(), maxresizedimageheight);
	}

	/**
	 * Get value of CompressionFormat
	 * @param compressionformat
	 */
	public final nativefiledocuments.proxies.ResizeImageCompressionFormat getCompressionFormat()
	{
		return getCompressionFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of CompressionFormat
	 */
	public final nativefiledocuments.proxies.ResizeImageCompressionFormat getCompressionFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CompressionFormat.toString());
		if (obj == null) {
			return null;
		}
		return nativefiledocuments.proxies.ResizeImageCompressionFormat.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of CompressionFormat
	 * @param compressionformat
	 */
	public final void setCompressionFormat(nativefiledocuments.proxies.ResizeImageCompressionFormat compressionformat)
	{
		setCompressionFormat(getContext(), compressionformat);
	}

	/**
	 * Set value of CompressionFormat
	 * @param context
	 * @param compressionformat
	 */
	public final void setCompressionFormat(com.mendix.systemwideinterfaces.core.IContext context, nativefiledocuments.proxies.ResizeImageCompressionFormat compressionformat)
	{
		if (compressionformat != null) {
			getMendixObject().setValue(context, MemberNames.CompressionFormat.toString(), compressionformat.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.CompressionFormat.toString(), null);
		}
	}

	/**
	 * @return value of Quality
	 */
	public final java.lang.Integer getQuality()
	{
		return getQuality(getContext());
	}

	/**
	 * @param context
	 * @return value of Quality
	 */
	public final java.lang.Integer getQuality(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Quality.toString());
	}

	/**
	 * Set value of Quality
	 * @param quality
	 */
	public final void setQuality(java.lang.Integer quality)
	{
		setQuality(getContext(), quality);
	}

	/**
	 * Set value of Quality
	 * @param context
	 * @param quality
	 */
	public final void setQuality(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer quality)
	{
		getMendixObject().setValue(context, MemberNames.Quality.toString(), quality);
	}

	/**
	 * @return value of Rotation
	 */
	public final java.lang.Integer getRotation()
	{
		return getRotation(getContext());
	}

	/**
	 * @param context
	 * @return value of Rotation
	 */
	public final java.lang.Integer getRotation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Rotation.toString());
	}

	/**
	 * Set value of Rotation
	 * @param rotation
	 */
	public final void setRotation(java.lang.Integer rotation)
	{
		setRotation(getContext(), rotation);
	}

	/**
	 * Set value of Rotation
	 * @param context
	 * @param rotation
	 */
	public final void setRotation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer rotation)
	{
		getMendixObject().setValue(context, MemberNames.Rotation.toString(), rotation);
	}

	/**
	 * @return value of KeepMetaData
	 */
	public final java.lang.Boolean getKeepMetaData()
	{
		return getKeepMetaData(getContext());
	}

	/**
	 * @param context
	 * @return value of KeepMetaData
	 */
	public final java.lang.Boolean getKeepMetaData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.KeepMetaData.toString());
	}

	/**
	 * Set value of KeepMetaData
	 * @param keepmetadata
	 */
	public final void setKeepMetaData(java.lang.Boolean keepmetadata)
	{
		setKeepMetaData(getContext(), keepmetadata);
	}

	/**
	 * Set value of KeepMetaData
	 * @param context
	 * @param keepmetadata
	 */
	public final void setKeepMetaData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean keepmetadata)
	{
		getMendixObject().setValue(context, MemberNames.KeepMetaData.toString(), keepmetadata);
	}

	/**
	 * Get value of ResizeMode
	 * @param resizemode
	 */
	public final nativefiledocuments.proxies.ResizeImageMode getResizeMode()
	{
		return getResizeMode(getContext());
	}

	/**
	 * @param context
	 * @return value of ResizeMode
	 */
	public final nativefiledocuments.proxies.ResizeImageMode getResizeMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ResizeMode.toString());
		if (obj == null) {
			return null;
		}
		return nativefiledocuments.proxies.ResizeImageMode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ResizeMode
	 * @param resizemode
	 */
	public final void setResizeMode(nativefiledocuments.proxies.ResizeImageMode resizemode)
	{
		setResizeMode(getContext(), resizemode);
	}

	/**
	 * Set value of ResizeMode
	 * @param context
	 * @param resizemode
	 */
	public final void setResizeMode(com.mendix.systemwideinterfaces.core.IContext context, nativefiledocuments.proxies.ResizeImageMode resizemode)
	{
		if (resizemode != null) {
			getMendixObject().setValue(context, MemberNames.ResizeMode.toString(), resizemode.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.ResizeMode.toString(), null);
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
			final testnativefiledocuments.proxies.ImageToResize that = (testnativefiledocuments.proxies.ImageToResize) obj;
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
