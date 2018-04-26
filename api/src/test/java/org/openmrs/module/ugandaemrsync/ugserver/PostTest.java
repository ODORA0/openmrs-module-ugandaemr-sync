/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 * <p>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p>
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ugandaemrsync.ugserver;

import org.junit.Test;
import org.openmrs.module.ugandaemrsync.server.SyncDataRecord;
import org.openmrs.test.BaseModuleContextSensitiveTest;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link UgandaEMRSyncService} .
 */
public class PostTest extends BaseModuleContextSensitiveTest {
	
	String content = "<items><SyncItem containedType=\"org.openmrs.Encounter\" key=\"3b617eb0-d3fe-49e2-9814-1e205c4eea8d\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Encounter><dateChanged type=\"timestamp\">2017-01-31T13:20:08.651+0300</dateChanged><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><encounterDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</encounterDatetime><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><uuid type=\"string\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><form type=\"org.openmrs.Form\">b8224534-7df0-4c00-ba8e-6b1f291087eb</form><changedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</changedBy><patient type=\"org.openmrs.Patient\">7729ec14-9e7a-436d-96b9-38e042a3b09a</patient><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><visit type=\"org.openmrs.Visit\">df95483a-6abf-11e6-967e-e21ce42407b6</visit><encounterType type=\"org.openmrs.EncounterType\">6d88e370-f2ba-476b-bf1b-d8eaf3b1b67e</encounterType></org.openmrs.Encounter>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"04c826ff-255d-4c19-9b9c-940bab81c647\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">bfe91a36-a2be-46d0-853f-8e3cfe6f29eb</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">04c826ff-255d-4c19-9b9c-940bab81c647</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"efc3cb70-a2d9-4207-9989-bee67b1fdda6\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">57fcb065-ca5c-45ec-a4c8-a3201bd359ea</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">efc3cb70-a2d9-4207-9989-bee67b1fdda6</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"08545163-0d80-464e-a663-eac1b4fe2170\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">a63149f5-bad7-4f84-8c61-0722589edc85</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">08545163-0d80-464e-a663-eac1b4fe2170</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"1bfced6a-3e04-457a-8419-80772de53bd4\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">960c4581-61bd-414a-a3ec-083eb7667904</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">1bfced6a-3e04-457a-8419-80772de53bd4</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"7be0acfb-f08a-48ce-a7ca-b62888587d9c\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">b70ad93d-3193-4290-b806-f24a9fdb785f</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">7be0acfb-f08a-48ce-a7ca-b62888587d9c</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"281f1412-c5f9-4d8a-a31f-346ccefe8703\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">8bdff534-6b4b-44ca-bc88-d088b3b53431</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">281f1412-c5f9-4d8a-a31f-346ccefe8703</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"66a6975e-8ed7-47ee-b90d-3926365b6e1a\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">cb1d8a3d-b6d2-4e50-8290-7b303333af46</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">66a6975e-8ed7-47ee-b90d-3926365b6e1a</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"e2ae1e2c-4724-4b6b-8cad-ca018f438b89\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">a083f9c4-5871-4194-bbeb-27b8f3d04ae7</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">e2ae1e2c-4724-4b6b-8cad-ca018f438b89</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"853f5085-c9e0-4cc8-9b6f-40bf52e86e64\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">de869d37-b2ba-4add-bb16-2b8a4855feb9</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">853f5085-c9e0-4cc8-9b6f-40bf52e86e64</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"45c2afe1-41fb-44f3-aaab-4aea489aebd0\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">e7313d04-aa15-4f2f-9193-d7df05e9ef99</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">45c2afe1-41fb-44f3-aaab-4aea489aebd0</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"ba658a8e-4690-4d0a-aa1a-0aa9e2c47953\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">a4c1830d-1b34-46ec-896c-53951825fc99</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">ba658a8e-4690-4d0a-aa1a-0aa9e2c47953</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"dba1680e-a3f6-44e9-ad41-f1508f1bed24\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">1b0cb349-e1e6-494a-b9cc-24b2cccf8a40</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">dba1680e-a3f6-44e9-ad41-f1508f1bed24</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"6f9dc945-29ec-44f2-bc7d-fca211e94935\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">fc4dda43-1122-4527-b461-fecf3c790d9c</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">6f9dc945-29ec-44f2-bc7d-fca211e94935</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"eb7ef479-ba84-41db-9506-3256e6d31ad6\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">9006ca93-8605-47b1-adb2-5dc76741f196</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">eb7ef479-ba84-41db-9506-3256e6d31ad6</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"7573ebcb-a07a-4f5f-97fe-25173c34cded\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">9f72d1f6-acbe-4408-a480-2957a85864f4</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">7573ebcb-a07a-4f5f-97fe-25173c34cded</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"9c82e84a-ce90-4efb-813b-88ce1aa0cc6d\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">b6ecbc40-d61b-4704-b3de-f285e16c9d82</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">9c82e84a-ce90-4efb-813b-88ce1aa0cc6d</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"be9ad4fa-eef0-4dc0-80ad-8dfd2e6d8f87\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">634f8d10-c774-4f9e-9dd1-466f26a93e6f</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">be9ad4fa-eef0-4dc0-80ad-8dfd2e6d8f87</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"7cd0c162-67b9-48cd-b75f-d178638d2552\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">8d30a972-6bad-47b1-9232-87491ee188ef</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">7cd0c162-67b9-48cd-b75f-d178638d2552</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"429ed598-2f23-4a1b-a4c1-0727768d5513\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">23b03b82-3fe1-456c-a6e7-de269bb6456f</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">429ed598-2f23-4a1b-a4c1-0727768d5513</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"ca9e6d51-dfa0-4a12-b1cb-1f8196e04505\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">0c17fa18-8fab-4997-9934-96d1af52949d</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">ca9e6d51-dfa0-4a12-b1cb-1f8196e04505</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"234592be-304c-4e87-96fe-6df82b4ab607\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">d7ee2fe3-e2c2-4b7c-938b-fe4274243adf</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">234592be-304c-4e87-96fe-6df82b4ab607</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"c75557ba-ff50-482e-9192-a87a6fc4a643\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">74215766-e2a0-42dc-b7bc-fe1def4d1484</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">c75557ba-ff50-482e-9192-a87a6fc4a643</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"8912af60-3bfd-4fb0-82e8-b6c978ba3756\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">7283f432-2bca-4e6c-be9e-42ed7d4fadd1</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">8912af60-3bfd-4fb0-82e8-b6c978ba3756</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"be6a8601-d58d-40ea-9f6a-5b6e9f16b3ee\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">7c47f1b5-6364-4a35-be50-19c9f056fea7</concept><valueDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</valueDatetime><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">be6a8601-d58d-40ea-9f6a-5b6e9f16b3ee</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location></org.openmrs.Obs>]]></content></SyncItem><SyncItem containedType=\"org.openmrs.Obs\" key=\"b605d98f-5fca-4bf4-b9ac-28a544384b23\" state=\"UPDATED\"><content><![CDATA[<org.openmrs.Obs><creator type=\"org.openmrs.User\">fae36dae-f8c9-4519-b76e-5a08fffd6a4c</creator><voidReason type=\"string\">delete encounter</voidReason><concept type=\"org.openmrs.Concept\">5077e4fb-9963-4d37-940a-24cc63e477fa</concept><dateVoided type=\"timestamp\">2017-01-31T13:20:05.650+0300</dateVoided><encounter type=\"org.openmrs.Encounter\">3b617eb0-d3fe-49e2-9814-1e205c4eea8d</encounter><uuid type=\"string\">b605d98f-5fca-4bf4-b9ac-28a544384b23</uuid><voidedBy type=\"org.openmrs.User\">ac59a1a8-68ff-11e6-967e-e21ce42407b6</voidedBy><obsDatetime type=\"timestamp\">2016-06-13T00:00:00.000+0300</obsDatetime><dateCreated type=\"timestamp\">2016-06-13T17:51:38.000+0300</dateCreated><person type=\"org.openmrs.Person\">7729ec14-9e7a-436d-96b9-38e042a3b09a</person><voided type=\"boolean\">true</voided><location type=\"org.openmrs.Location\">629d78e9-93e5-43b0-ad8a-48313fd99117</location><valueCoded type=\"org.openmrs.Concept\">dcd695dc-30ab-102d-86b0-7a5022ba4115</valueCoded></org.openmrs.Obs>]]></content></SyncItem></items>";
	
	/* @Test
	 public void shouldSendPost() throws Exception {
	     UgandaEMRHttpURLConnection connectionRequest = new UgandaEMRHttpURLConnection();
	     String resource = "/api";

	     Map result = connectionRequest.sendPostBy(SyncConstant.XML_CONTENT_TYPE, content, SyncConstant.HEALTH_CENTER_SYNC_ID,
	             SyncConstant.SERVER_PROTOCOL_PLACE_HOLDER + SyncConstant.SERVER_IP_PLACE_HOLDER + resource);

	     assertNotNull(result);
	 }

	 @Test
	 public void shouldSendSyncRecord() throws Exception {
	     SyncDataRecord syncDataRecord = new SyncDataRecord();
	     Map<String, Object> result = syncDataRecord.syncData(content);
	     assertNotNull(true);
	 }*/
}
