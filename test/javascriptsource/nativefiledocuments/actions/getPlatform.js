// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";
import { Platform } from "react-native";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Get the platform: iOS or Android
 * @returns {Promise.<"NativeFileDocuments.Platform.android"|"NativeFileDocuments.Platform.ios">}
 */
export async function getPlatform() {
	// BEGIN USER CODE

	return Platform.OS;

	// END USER CODE
}