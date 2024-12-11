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

import LogListener from "../LogListener";

// END EXTRA CODE

/**
 * Get the currently known log nodes. The listener only knows about log nodes that received log data. (Also if that log data was not written to a log file)
 * 
 * If a log level has been set on a node, the log level will be returned for that log node.
 * @returns {Promise.<MxObject[]>}
 */
export async function getLogNodes() {
	// BEGIN USER CODE

	return LogListener.getLogNodes();

	// END USER CODE
}
