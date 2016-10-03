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

package fi.otavanopisto.restfulptv.client;

import fi.otavanopisto.restfulptv.client.model.*;

import fi.otavanopisto.restfulptv.client.model.BadRequest;
import fi.otavanopisto.restfulptv.client.model.PhoneChannel;
import fi.otavanopisto.restfulptv.client.model.Forbidden;
import fi.otavanopisto.restfulptv.client.model.InternalServerError;
import fi.otavanopisto.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-03T15:33:19.141+03:00")
public class PhoneChannelsApi {

  private ApiClient client;
  private String baseUrl;

  public PhoneChannelsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * creates PhoneChannel
   * creates PhoneChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PhoneChannel> createServicePhoneChannel(String serviceId, PhoneChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/phoneChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<PhoneChannel> resultType = new ResultType<PhoneChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds PhoneChannel by phoneChannelId
   * finds PhoneChannels by phoneChannelId
   * @param serviceId Service id (required)
   * @param phoneChannelId phoneChannel id (required)
   */
  public ApiResponse<PhoneChannel> findServicePhoneChannel(String serviceId, String phoneChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/phoneChannels/{phoneChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "phoneChannelId" + "\\}", String.valueOf(phoneChannelId)), baseUrl);
      
    ResultType<PhoneChannel> resultType = new ResultType<PhoneChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists PhoneChannels by serviceId
   * Lists PhoneChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<PhoneChannel>> listServicePhoneChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/phoneChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<PhoneChannel>> resultType = new ResultType<List<PhoneChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates PhoneChannel
   * Updates PhoneChannel
   * @param serviceId service id (required)
   * @param phoneChannelId phoneChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PhoneChannel> updatePhoneChannel(String serviceId, String phoneChannelId, PhoneChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/phoneChannels/{phoneChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "phoneChannelId" + "\\}", String.valueOf(phoneChannelId)), baseUrl);
      
    ResultType<PhoneChannel> resultType = new ResultType<PhoneChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
}
