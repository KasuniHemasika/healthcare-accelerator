/*
 * Copyright (c) 2024, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.healthcare.apim.consentmgt.mediation.model;

public class PIIController {
    private String piiController;
    private boolean onBehalf;
    private String contact;
    private String email;
    private String phone;
    private String piiControllerUrl;
    private Address address;

    public PIIController(String piiController, boolean onBehalf, String contact, String email, String phone, String piiControllerUrl, Address address) {
        this.piiController = piiController;
        this.onBehalf = onBehalf;
        this.contact = contact;
        this.email = email;
        this.phone = phone;
        this.piiControllerUrl = piiControllerUrl;
        this.address = address;
    }

    public String getPiiController() {
        return this.piiController;
    }

    public void setPiiController(String piiController) {
        this.piiController = piiController;
    }

    public boolean isOnBehalf() {
        return this.onBehalf;
    }

    public void setOnBehalf(boolean onBehalf) {
        this.onBehalf = onBehalf;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPiiControllerUrl() {
        return this.piiControllerUrl;
    }

    public void setPiiControllerUrl(String piiControllerUrl) {
        this.piiControllerUrl = piiControllerUrl;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

