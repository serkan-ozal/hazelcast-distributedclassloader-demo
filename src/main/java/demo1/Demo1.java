/*
 * Copyright (c) 2008-2015, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package demo1;

/**
 * Demo application for test application
 * (github.com/serkan-ozal/hazelcast-distributedclassloader/tree/master/src/test/java/test1/Test1.java) 
 * 
 * @author Serkan OZAL
 */
// Run with "-Djava.system.class.loader=com.hazelcast.distributedclassloader.HazelcastDistributedClassLoader"
public class Demo1 {

	public static void main(String[] args) throws Exception {
	    System.out.println("Demo-1 is up and running");
	}

}
