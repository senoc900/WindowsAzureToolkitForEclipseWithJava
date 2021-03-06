/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.gigaspaces.azure.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class InputEndpointList implements Iterable<InputEndpoint> {

	private List<InputEndpoint> inputEndpointList=new ArrayList<InputEndpoint>();

	@XmlElement(name="InputEndpoint")
	public List<InputEndpoint> getInputEndpointList() {
		return inputEndpointList;
	}

	public void setInputEndpointList(List<InputEndpoint> inputEndpointList) {
		this.inputEndpointList = inputEndpointList;
	}

	@Override
	public Iterator<InputEndpoint> iterator() {		
		return inputEndpointList.iterator();
	}
}
