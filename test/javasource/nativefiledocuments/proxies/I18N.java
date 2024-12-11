// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativefiledocuments.proxies;

public enum I18N
{
	ImageCropCancel(new java.lang.String[][] { new java.lang.String[] { "en_US", "Cancel" }, new java.lang.String[] { "nl_NL", "Annuleren" } }),
	ImageCropConfirm(new java.lang.String[][] { new java.lang.String[] { "en_US", "Save" }, new java.lang.String[] { "nl_NL", "Opslaan" } }),
	ImageCropDialogTitle(new java.lang.String[][] { new java.lang.String[] { "en_US", "Edit image" }, new java.lang.String[] { "nl_NL", "Foto bewerken" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private I18N(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}