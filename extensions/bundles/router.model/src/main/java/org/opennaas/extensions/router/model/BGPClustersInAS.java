/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class BGPClustersInAS as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the BGPClustersInASBean Interface. The CIM class BGPClustersInAS is described as
 * follows:
 * 
 * This aggregation establishes 'whole-part' relationships between an AutonomousSystem and the BGPClusters that it contains.
 */
public class BGPClustersInAS extends Association implements Serializable {

	/**
	 * This constructor creates a BGPClustersInASBeanImpl Class which implements the BGPClustersInASBean Interface, and encapsulates the CIM class
	 * BGPClustersInAS in a Java Bean. The CIM class BGPClustersInAS is described as follows:
	 * 
	 * This aggregation establishes 'whole-part' relationships between an AutonomousSystem and the BGPClusters that it contains.
	 */
	public BGPClustersInAS() {
	};

	/**
	 * This method create an Association of the type BGPClustersInAS between one AutonomousSystem object and BGPCluster object
	 */
	public static BGPClustersInAS link(AutonomousSystem groupAS, BGPCluster
			partAS) {

		return (BGPClustersInAS) Association.link(BGPClustersInAS.class, groupAS, partAS);
	}// link

} // Class BGPClustersInAS
