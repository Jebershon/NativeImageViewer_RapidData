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

import NativeFileDocumentsUtils from "../nativefiledocumentsutils";
import RNFS from "react-native-fs";
import { Platform } from 'react-native';

// END EXTRA CODE

/**
 * Read contents from file as UTF 8 string.
 * Note that this can be slow and cause high memory usage with large files!
 * @param {string} filepath - The path to the file or directory.
 * @param {"NativeFileDocuments.PathType.FullPath"|"NativeFileDocuments.PathType.DocumentsDirectory"} pathType
 * @param {boolean} writeToLog
 * @returns {Promise.<string>}
 */
export async function readTextFile(filepath, pathType, writeToLog) {
	// BEGIN USER CODE

	if (!filepath) {
		Promise.reject(new Error("No file path specified"));
	}
	if (!pathType) {
		Promise.reject(new Error("No path type specified"));
	}
	if (writeToLog) {
		NativeFileDocumentsUtils.writeToLog({
			actionName: "readTextFile",
			logType: "Parameters",
			logMessage: JSON.stringify({
				filepath: filepath,
				pathType: pathType
			})
		});
	}

	const fullPath = NativeFileDocumentsUtils.getFullPath(filepath, pathType, RNFS, Platform.OS);

	if (writeToLog) {
		NativeFileDocumentsUtils.writeToLog({
			actionName: "readTextFile",
			logType: "Info",
			logMessage: "Full path: " + fullPath
		});
	}

	return RNFS.readFile(fullPath, "utf8");

	// END USER CODE
}
