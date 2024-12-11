// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Get URL for a Mendix FileDocument
 * @param {MxObject} mendixFileDocument
 * @returns {Promise.<string>}
 */
export async function getFileDocumentUrl(mendixFileDocument) {
	// BEGIN USER CODE
	const guid = mendixFileDocument.getGuid();
	// Need to pass the right change date to the function.
	const changeDateMillis = mendixFileDocument.get("changedDate");
	return mx.data.getDocumentUrl(guid, changeDateMillis, false);
	// END USER CODE
}