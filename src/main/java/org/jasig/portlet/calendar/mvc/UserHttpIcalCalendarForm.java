/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portlet.calendar.mvc;

/**
 * Form bean for adding new user-defined http-based iCalendar feeds.
 *
 * @author Jen Bourey
 * @version $Revision$
 */
public class UserHttpIcalCalendarForm {

  private Long id;

  private String subscribeId;

  //	@NotBlank
  private String name;

  // RegEx copied from commons validation library
  //	@NotBlank
  //	@RegExp("^http[s]?:(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?")
  private String url;

  private boolean displayed;

  public UserHttpIcalCalendarForm() {
    id = new Long(-1);
    displayed = true;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSubscribeId() {
    return subscribeId;
  }

  public void setSubscribeId(String subscribeId) {
    this.subscribeId = subscribeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public boolean isDisplayed() {
    return displayed;
  }

  public void setDisplayed(boolean displayed) {
    this.displayed = displayed;
  }
}
