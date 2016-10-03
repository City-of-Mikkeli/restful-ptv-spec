/**
 * RESTful PTV
 * Restful way to use Palvelutietovaranto.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package fi.otavanopisto.restfulptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.restfulptv.client.model.Address;
import fi.otavanopisto.restfulptv.client.model.LanguageItem;
import fi.otavanopisto.restfulptv.client.model.LocalizedListItem;
import fi.otavanopisto.restfulptv.client.model.ServiceHour;
import fi.otavanopisto.restfulptv.client.model.Support;
import fi.otavanopisto.restfulptv.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * ServiceLocationChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-03T15:33:19.141+03:00")
public class ServiceLocationChannel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("serviceChannelType")
  private String serviceChannelType = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<LocalizedListItem> serviceChannelNames = new ArrayList<LocalizedListItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<LocalizedListItem> serviceChannelDescriptions = new ArrayList<LocalizedListItem>();

  @JsonProperty("serviceAreaRestricted")
  private Boolean serviceAreaRestricted = null;

  @JsonProperty("supportContacts")
  private List<Support> supportContacts = new ArrayList<Support>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("coordinateSystem")
  private String coordinateSystem = null;

  @JsonProperty("coordinatesSetManually")
  private Boolean coordinatesSetManually = null;

  @JsonProperty("phoneServiceCharge")
  private Boolean phoneServiceCharge = null;

  @JsonProperty("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @JsonProperty("serviceAreas")
  private List<String> serviceAreas = new ArrayList<String>();

  @JsonProperty("phoneChargeDescriptions")
  private List<LanguageItem> phoneChargeDescriptions = new ArrayList<LanguageItem>();

  @JsonProperty("addresses")
  private List<Address> addresses = new ArrayList<Address>();

  @JsonProperty("serviceChargeTypes")
  private List<String> serviceChargeTypes = new ArrayList<String>();

  @JsonProperty("serviceHours")
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public ServiceLocationChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceLocationChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

   /**
   * Get serviceChannelType
   * @return serviceChannelType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChannelType() {
    return serviceChannelType;
  }

  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  public ServiceLocationChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ServiceLocationChannel serviceChannelNames(List<LocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public ServiceLocationChannel addServiceChannelNamesItem(LocalizedListItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<LocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public ServiceLocationChannel serviceChannelDescriptions(List<LocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public ServiceLocationChannel addServiceChannelDescriptionsItem(LocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * Get serviceChannelDescriptions
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<LocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public ServiceLocationChannel serviceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
    return this;
  }

   /**
   * Get serviceAreaRestricted
   * @return serviceAreaRestricted
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getServiceAreaRestricted() {
    return serviceAreaRestricted;
  }

  public void setServiceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
  }

  public ServiceLocationChannel supportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public ServiceLocationChannel addSupportContactsItem(Support supportContactsItem) {
    this.supportContacts.add(supportContactsItem);
    return this;
  }

   /**
   * Get supportContacts
   * @return supportContacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Support> getSupportContacts() {
    return supportContacts;
  }

  public void setSupportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
  }

  public ServiceLocationChannel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ServiceLocationChannel phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ServiceLocationChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ServiceLocationChannel addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ServiceLocationChannel fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public ServiceLocationChannel latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public ServiceLocationChannel longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public ServiceLocationChannel coordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
    return this;
  }

   /**
   * Get coordinateSystem
   * @return coordinateSystem
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoordinateSystem() {
    return coordinateSystem;
  }

  public void setCoordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
  }

  public ServiceLocationChannel coordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
    return this;
  }

   /**
   * Get coordinatesSetManually
   * @return coordinatesSetManually
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCoordinatesSetManually() {
    return coordinatesSetManually;
  }

  public void setCoordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
  }

  public ServiceLocationChannel phoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
    return this;
  }

   /**
   * Get phoneServiceCharge
   * @return phoneServiceCharge
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPhoneServiceCharge() {
    return phoneServiceCharge;
  }

  public void setPhoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
  }

  public ServiceLocationChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public ServiceLocationChannel addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  public ServiceLocationChannel serviceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
    return this;
  }

  public ServiceLocationChannel addServiceAreasItem(String serviceAreasItem) {
    this.serviceAreas.add(serviceAreasItem);
    return this;
  }

   /**
   * Get serviceAreas
   * @return serviceAreas
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceAreas() {
    return serviceAreas;
  }

  public void setServiceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
  }

  public ServiceLocationChannel phoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  public ServiceLocationChannel addPhoneChargeDescriptionsItem(LanguageItem phoneChargeDescriptionsItem) {
    this.phoneChargeDescriptions.add(phoneChargeDescriptionsItem);
    return this;
  }

   /**
   * Get phoneChargeDescriptions
   * @return phoneChargeDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }

  public void setPhoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  public ServiceLocationChannel addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ServiceLocationChannel addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public ServiceLocationChannel serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  public ServiceLocationChannel addServiceChargeTypesItem(String serviceChargeTypesItem) {
    this.serviceChargeTypes.add(serviceChargeTypesItem);
    return this;
  }

   /**
   * Get serviceChargeTypes
   * @return serviceChargeTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceChargeTypes() {
    return serviceChargeTypes;
  }

  public void setServiceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
  }

  public ServiceLocationChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public ServiceLocationChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * Get serviceHours
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public ServiceLocationChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLocationChannel serviceLocationChannel = (ServiceLocationChannel) o;
    return Objects.equals(this.id, serviceLocationChannel.id) &&
        Objects.equals(this.serviceChannelType, serviceLocationChannel.serviceChannelType) &&
        Objects.equals(this.organizationId, serviceLocationChannel.organizationId) &&
        Objects.equals(this.serviceChannelNames, serviceLocationChannel.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, serviceLocationChannel.serviceChannelDescriptions) &&
        Objects.equals(this.serviceAreaRestricted, serviceLocationChannel.serviceAreaRestricted) &&
        Objects.equals(this.supportContacts, serviceLocationChannel.supportContacts) &&
        Objects.equals(this.email, serviceLocationChannel.email) &&
        Objects.equals(this.phone, serviceLocationChannel.phone) &&
        Objects.equals(this.languages, serviceLocationChannel.languages) &&
        Objects.equals(this.fax, serviceLocationChannel.fax) &&
        Objects.equals(this.latitude, serviceLocationChannel.latitude) &&
        Objects.equals(this.longitude, serviceLocationChannel.longitude) &&
        Objects.equals(this.coordinateSystem, serviceLocationChannel.coordinateSystem) &&
        Objects.equals(this.coordinatesSetManually, serviceLocationChannel.coordinatesSetManually) &&
        Objects.equals(this.phoneServiceCharge, serviceLocationChannel.phoneServiceCharge) &&
        Objects.equals(this.webPages, serviceLocationChannel.webPages) &&
        Objects.equals(this.serviceAreas, serviceLocationChannel.serviceAreas) &&
        Objects.equals(this.phoneChargeDescriptions, serviceLocationChannel.phoneChargeDescriptions) &&
        Objects.equals(this.addresses, serviceLocationChannel.addresses) &&
        Objects.equals(this.serviceChargeTypes, serviceLocationChannel.serviceChargeTypes) &&
        Objects.equals(this.serviceHours, serviceLocationChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, serviceLocationChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, serviceAreaRestricted, supportContacts, email, phone, languages, fax, latitude, longitude, coordinateSystem, coordinatesSetManually, phoneServiceCharge, webPages, serviceAreas, phoneChargeDescriptions, addresses, serviceChargeTypes, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLocationChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    serviceAreaRestricted: ").append(toIndentedString(serviceAreaRestricted)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateSystem: ").append(toIndentedString(coordinateSystem)).append("\n");
    sb.append("    coordinatesSetManually: ").append(toIndentedString(coordinatesSetManually)).append("\n");
    sb.append("    phoneServiceCharge: ").append(toIndentedString(phoneServiceCharge)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceAreas: ").append(toIndentedString(serviceAreas)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

