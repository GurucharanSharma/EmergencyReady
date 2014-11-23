/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-10-28 17:08:27 UTC)
 * on 2014-11-15 at 06:31:01 UTC 
 * Modify at your own risk.
 */

package com.newemergencyreadybackend.entity.emergencyservicesendpoint;

/**
 * Service definition for Emergencyservicesendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link EmergencyservicesendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Emergencyservicesendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the emergencyservicesendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "emergencyservicesendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Emergencyservicesendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Emergencyservicesendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getEmergencyServices".
   *
   * This request holds the parameters needed by the emergencyservicesendpoint server.  After setting
   * any optional parameters, call the {@link GetEmergencyServices#execute()} method to invoke the
   * remote operation.
   *
   * @param id
   * @return the request
   */
  public GetEmergencyServices getEmergencyServices(java.lang.Long id) throws java.io.IOException {
    GetEmergencyServices result = new GetEmergencyServices(id);
    initialize(result);
    return result;
  }

  public class GetEmergencyServices extends EmergencyservicesendpointRequest<com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices> {

    private static final String REST_PATH = "emergencyservices/{id}";

    /**
     * Create a request for the method "getEmergencyServices".
     *
     * This request holds the parameters needed by the the emergencyservicesendpoint server.  After
     * setting any optional parameters, call the {@link GetEmergencyServices#execute()} method to
     * invoke the remote operation. <p> {@link GetEmergencyServices#initialize(com.google.api.client.g
     * oogleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetEmergencyServices(java.lang.Long id) {
      super(Emergencyservicesendpoint.this, "GET", REST_PATH, null, com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetEmergencyServices setAlt(java.lang.String alt) {
      return (GetEmergencyServices) super.setAlt(alt);
    }

    @Override
    public GetEmergencyServices setFields(java.lang.String fields) {
      return (GetEmergencyServices) super.setFields(fields);
    }

    @Override
    public GetEmergencyServices setKey(java.lang.String key) {
      return (GetEmergencyServices) super.setKey(key);
    }

    @Override
    public GetEmergencyServices setOauthToken(java.lang.String oauthToken) {
      return (GetEmergencyServices) super.setOauthToken(oauthToken);
    }

    @Override
    public GetEmergencyServices setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetEmergencyServices) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetEmergencyServices setQuotaUser(java.lang.String quotaUser) {
      return (GetEmergencyServices) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetEmergencyServices setUserIp(java.lang.String userIp) {
      return (GetEmergencyServices) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetEmergencyServices setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetEmergencyServices set(String parameterName, Object value) {
      return (GetEmergencyServices) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertEmergencyServices".
   *
   * This request holds the parameters needed by the emergencyservicesendpoint server.  After setting
   * any optional parameters, call the {@link InsertEmergencyServices#execute()} method to invoke the
   * remote operation.
   *
   * @param content the {@link com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices}
   * @return the request
   */
  public InsertEmergencyServices insertEmergencyServices(com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices content) throws java.io.IOException {
    InsertEmergencyServices result = new InsertEmergencyServices(content);
    initialize(result);
    return result;
  }

  public class InsertEmergencyServices extends EmergencyservicesendpointRequest<com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices> {

    private static final String REST_PATH = "emergencyservices";

    /**
     * Create a request for the method "insertEmergencyServices".
     *
     * This request holds the parameters needed by the the emergencyservicesendpoint server.  After
     * setting any optional parameters, call the {@link InsertEmergencyServices#execute()} method to
     * invoke the remote operation. <p> {@link InsertEmergencyServices#initialize(com.google.api.clien
     * t.googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices}
     * @since 1.13
     */
    protected InsertEmergencyServices(com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices content) {
      super(Emergencyservicesendpoint.this, "POST", REST_PATH, content, com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices.class);
    }

    @Override
    public InsertEmergencyServices setAlt(java.lang.String alt) {
      return (InsertEmergencyServices) super.setAlt(alt);
    }

    @Override
    public InsertEmergencyServices setFields(java.lang.String fields) {
      return (InsertEmergencyServices) super.setFields(fields);
    }

    @Override
    public InsertEmergencyServices setKey(java.lang.String key) {
      return (InsertEmergencyServices) super.setKey(key);
    }

    @Override
    public InsertEmergencyServices setOauthToken(java.lang.String oauthToken) {
      return (InsertEmergencyServices) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertEmergencyServices setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertEmergencyServices) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertEmergencyServices setQuotaUser(java.lang.String quotaUser) {
      return (InsertEmergencyServices) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertEmergencyServices setUserIp(java.lang.String userIp) {
      return (InsertEmergencyServices) super.setUserIp(userIp);
    }

    @Override
    public InsertEmergencyServices set(String parameterName, Object value) {
      return (InsertEmergencyServices) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listEmergencyServices".
   *
   * This request holds the parameters needed by the emergencyservicesendpoint server.  After setting
   * any optional parameters, call the {@link ListEmergencyServices#execute()} method to invoke the
   * remote operation.
   *
   * @return the request
   */
  public ListEmergencyServices listEmergencyServices() throws java.io.IOException {
    ListEmergencyServices result = new ListEmergencyServices();
    initialize(result);
    return result;
  }

  public class ListEmergencyServices extends EmergencyservicesendpointRequest<com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.CollectionResponseEmergencyServices> {

    private static final String REST_PATH = "emergencyservices";

    /**
     * Create a request for the method "listEmergencyServices".
     *
     * This request holds the parameters needed by the the emergencyservicesendpoint server.  After
     * setting any optional parameters, call the {@link ListEmergencyServices#execute()} method to
     * invoke the remote operation. <p> {@link ListEmergencyServices#initialize(com.google.api.client.
     * googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListEmergencyServices() {
      super(Emergencyservicesendpoint.this, "GET", REST_PATH, null, com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.CollectionResponseEmergencyServices.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListEmergencyServices setAlt(java.lang.String alt) {
      return (ListEmergencyServices) super.setAlt(alt);
    }

    @Override
    public ListEmergencyServices setFields(java.lang.String fields) {
      return (ListEmergencyServices) super.setFields(fields);
    }

    @Override
    public ListEmergencyServices setKey(java.lang.String key) {
      return (ListEmergencyServices) super.setKey(key);
    }

    @Override
    public ListEmergencyServices setOauthToken(java.lang.String oauthToken) {
      return (ListEmergencyServices) super.setOauthToken(oauthToken);
    }

    @Override
    public ListEmergencyServices setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListEmergencyServices) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListEmergencyServices setQuotaUser(java.lang.String quotaUser) {
      return (ListEmergencyServices) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListEmergencyServices setUserIp(java.lang.String userIp) {
      return (ListEmergencyServices) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListEmergencyServices setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListEmergencyServices setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListEmergencyServices set(String parameterName, Object value) {
      return (ListEmergencyServices) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeEmergencyServices".
   *
   * This request holds the parameters needed by the emergencyservicesendpoint server.  After setting
   * any optional parameters, call the {@link RemoveEmergencyServices#execute()} method to invoke the
   * remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveEmergencyServices removeEmergencyServices(java.lang.Long id) throws java.io.IOException {
    RemoveEmergencyServices result = new RemoveEmergencyServices(id);
    initialize(result);
    return result;
  }

  public class RemoveEmergencyServices extends EmergencyservicesendpointRequest<Void> {

    private static final String REST_PATH = "emergencyservices/{id}";

    /**
     * Create a request for the method "removeEmergencyServices".
     *
     * This request holds the parameters needed by the the emergencyservicesendpoint server.  After
     * setting any optional parameters, call the {@link RemoveEmergencyServices#execute()} method to
     * invoke the remote operation. <p> {@link RemoveEmergencyServices#initialize(com.google.api.clien
     * t.googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveEmergencyServices(java.lang.Long id) {
      super(Emergencyservicesendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveEmergencyServices setAlt(java.lang.String alt) {
      return (RemoveEmergencyServices) super.setAlt(alt);
    }

    @Override
    public RemoveEmergencyServices setFields(java.lang.String fields) {
      return (RemoveEmergencyServices) super.setFields(fields);
    }

    @Override
    public RemoveEmergencyServices setKey(java.lang.String key) {
      return (RemoveEmergencyServices) super.setKey(key);
    }

    @Override
    public RemoveEmergencyServices setOauthToken(java.lang.String oauthToken) {
      return (RemoveEmergencyServices) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveEmergencyServices setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveEmergencyServices) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveEmergencyServices setQuotaUser(java.lang.String quotaUser) {
      return (RemoveEmergencyServices) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveEmergencyServices setUserIp(java.lang.String userIp) {
      return (RemoveEmergencyServices) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveEmergencyServices setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveEmergencyServices set(String parameterName, Object value) {
      return (RemoveEmergencyServices) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateEmergencyServices".
   *
   * This request holds the parameters needed by the emergencyservicesendpoint server.  After setting
   * any optional parameters, call the {@link UpdateEmergencyServices#execute()} method to invoke the
   * remote operation.
   *
   * @param content the {@link com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices}
   * @return the request
   */
  public UpdateEmergencyServices updateEmergencyServices(com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices content) throws java.io.IOException {
    UpdateEmergencyServices result = new UpdateEmergencyServices(content);
    initialize(result);
    return result;
  }

  public class UpdateEmergencyServices extends EmergencyservicesendpointRequest<com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices> {

    private static final String REST_PATH = "emergencyservices";

    /**
     * Create a request for the method "updateEmergencyServices".
     *
     * This request holds the parameters needed by the the emergencyservicesendpoint server.  After
     * setting any optional parameters, call the {@link UpdateEmergencyServices#execute()} method to
     * invoke the remote operation. <p> {@link UpdateEmergencyServices#initialize(com.google.api.clien
     * t.googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices}
     * @since 1.13
     */
    protected UpdateEmergencyServices(com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices content) {
      super(Emergencyservicesendpoint.this, "PUT", REST_PATH, content, com.newemergencyreadybackend.entity.emergencyservicesendpoint.model.EmergencyServices.class);
    }

    @Override
    public UpdateEmergencyServices setAlt(java.lang.String alt) {
      return (UpdateEmergencyServices) super.setAlt(alt);
    }

    @Override
    public UpdateEmergencyServices setFields(java.lang.String fields) {
      return (UpdateEmergencyServices) super.setFields(fields);
    }

    @Override
    public UpdateEmergencyServices setKey(java.lang.String key) {
      return (UpdateEmergencyServices) super.setKey(key);
    }

    @Override
    public UpdateEmergencyServices setOauthToken(java.lang.String oauthToken) {
      return (UpdateEmergencyServices) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateEmergencyServices setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateEmergencyServices) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateEmergencyServices setQuotaUser(java.lang.String quotaUser) {
      return (UpdateEmergencyServices) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateEmergencyServices setUserIp(java.lang.String userIp) {
      return (UpdateEmergencyServices) super.setUserIp(userIp);
    }

    @Override
    public UpdateEmergencyServices set(String parameterName, Object value) {
      return (UpdateEmergencyServices) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Emergencyservicesendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Emergencyservicesendpoint}. */
    @Override
    public Emergencyservicesendpoint build() {
      return new Emergencyservicesendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link EmergencyservicesendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setEmergencyservicesendpointRequestInitializer(
        EmergencyservicesendpointRequestInitializer emergencyservicesendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(emergencyservicesendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}