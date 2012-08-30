/**
 * Copyright © 2012 Alcatel-Lucent.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * Licensed to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.alu.e3.gateway.valid.camel.component;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;

public class ValidatorProducer extends DefaultProducer {
	
	public ValidatorProducer(Endpoint endpoint) {
		super(endpoint);
		
		if(!(endpoint instanceof ValidatorEndpoint)){
			throw new RuntimeException("ValidatorProducer does not support endpoint type:"+endpoint.getClass().getName());
		}
	}

	@Override
	public void process(Exchange exchange) throws Exception {
	}

}
