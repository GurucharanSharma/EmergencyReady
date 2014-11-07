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
 * on 2014-11-07 at 04:33:41 UTC 
 * Modify at your own risk.
 */

package com.googleappengine.emergencyreadybackend.entity.policelineendpoint;

/**
 * Service definition for Policelineendpoint (v1).
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
 * This service uses {@link PolicelineendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Policelineendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the policelineendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://driven-stage-751.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "policelineendpoint/v1/";

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
  public Policelineendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Policelineendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getPoliceLine".
   *
   * This request holds the parameters needed by the policelineendpoint server.  After setting any
   * optional parameters, call the {@link GetPoliceLine#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetPoliceLine getPoliceLine(java.lang.Long id) throws java.io.IOException {
    GetPoliceLine result = new GetPoliceLine(id);
    initialize(result);
    return result;
  }

  public class GetPoliceLine extends PolicelineendpointRequest<com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine> {

    private static final String REST_PATH = "policeline/{id}";

    /**
     * Create a request for the method "getPoliceLine".
     *
     * This request holds the parameters needed by the the policelineendpoint server.  After setting
     * any optional parameters, call the {@link GetPoliceLine#execute()} method to invoke the remote
     * operation. <p> {@link GetPoliceLine#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetPoliceLine(java.lang.Long id) {
      super(Policelineendpoint.this, "GET", REST_PATH, null, com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine.class);
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
    public GetPoliceLine setAlt(java.lang.String alt) {
      return (GetPoliceLine) super.setAlt(alt);
    }

    @Override
    public GetPoliceLine setFields(java.lang.String fields) {
      return (GetPoliceLine) super.setFields(fields);
    }

    @Override
    public GetPoliceLine setKey(java.lang.String key) {
      return (GetPoliceLine) super.setKey(key);
    }

    @Override
    public GetPoliceLine setOauthToken(java.lang.String oauthToken) {
      return (GetPoliceLine) super.setOauthToken(oauthToken);
    }

    @Override
    public GetPoliceLine setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetPoliceLine) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetPoliceLine setQuotaUser(java.lang.String quotaUser) {
      return (GetPoliceLine) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetPoliceLine setUserIp(java.lang.String userIp) {
      return (GetPoliceLine) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetPoliceLine setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetPoliceLine set(String parameterName, Object value) {
      return (GetPoliceLine) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertPoliceLine".
   *
   * This request holds the parameters needed by the policelineendpoint server.  After setting any
   * optional parameters, call the {@link InsertPoliceLine#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine}
   * @return the request
   */
  public InsertPoliceLine insertPoliceLine(com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine content) throws java.io.IOException {
    InsertPoliceLine result = new InsertPoliceLine(content);
    initialize(result);
    return result;
  }

  public class InsertPoliceLine extends PolicelineendpointRequest<com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine> {

    private static final String REST_PATH = "policeline";

    /**
     * Create a request for the method "insertPoliceLine".
     *
     * This request holds the parameters needed by the the policelineendpoint server.  After setting
     * any optional parameters, call the {@link InsertPoliceLine#execute()} method to invoke the
     * remote operation. <p> {@link InsertPoliceLine#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine}
     * @since 1.13
     */
    protected InsertPoliceLine(com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine content) {
      super(Policelineendpoint.this, "POST", REST_PATH, content, com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine.class);
    }

    @Override
    public InsertPoliceLine setAlt(java.lang.String alt) {
      return (InsertPoliceLine) super.setAlt(alt);
    }

    @Override
    public InsertPoliceLine setFields(java.lang.String fields) {
      return (InsertPoliceLine) super.setFields(fields);
    }

    @Override
    public InsertPoliceLine setKey(java.lang.String key) {
      return (InsertPoliceLine) super.setKey(key);
    }

    @Override
    public InsertPoliceLine setOauthToken(java.lang.String oauthToken) {
      return (InsertPoliceLine) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertPoliceLine setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertPoliceLine) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertPoliceLine setQuotaUser(java.lang.String quotaUser) {
      return (InsertPoliceLine) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertPoliceLine setUserIp(java.lang.String userIp) {
      return (InsertPoliceLine) super.setUserIp(userIp);
    }

    @Override
    public InsertPoliceLine set(String parameterName, Object value) {
      return (InsertPoliceLine) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listPoliceLine".
   *
   * This request holds the parameters needed by the policelineendpoint server.  After setting any
   * optional parameters, call the {@link ListPoliceLine#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListPoliceLine listPoliceLine() throws java.io.IOException {
    ListPoliceLine result = new ListPoliceLine();
    initialize(result);
    return result;
  }

  public class ListPoliceLine extends PolicelineendpointRequest<com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.CollectionResponsePoliceLine> {

    private static final String REST_PATH = "policeline";

    /**
     * Create a request for the method "listPoliceLine".
     *
     * This request holds the parameters needed by the the policelineendpoint server.  After setting
     * any optional parameters, call the {@link ListPoliceLine#execute()} method to invoke the remote
     * operation. <p> {@link ListPoliceLine#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListPoliceLine() {
      super(Policelineendpoint.this, "GET", REST_PATH, null, com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.CollectionResponsePoliceLine.class);
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
    public ListPoliceLine setAlt(java.lang.String alt) {
      return (ListPoliceLine) super.setAlt(alt);
    }

    @Override
    public ListPoliceLine setFields(java.lang.String fields) {
      return (ListPoliceLine) super.setFields(fields);
    }

    @Override
    public ListPoliceLine setKey(java.lang.String key) {
      return (ListPoliceLine) super.setKey(key);
    }

    @Override
    public ListPoliceLine setOauthToken(java.lang.String oauthToken) {
      return (ListPoliceLine) super.setOauthToken(oauthToken);
    }

    @Override
    public ListPoliceLine setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListPoliceLine) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListPoliceLine setQuotaUser(java.lang.String quotaUser) {
      return (ListPoliceLine) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListPoliceLine setUserIp(java.lang.String userIp) {
      return (ListPoliceLine) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListPoliceLine setCursor(java.lang.String cursor) {
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

    public ListPoliceLine setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListPoliceLine set(String parameterName, Object value) {
      return (ListPoliceLine) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removePoliceLine".
   *
   * This request holds the parameters needed by the policelineendpoint server.  After setting any
   * optional parameters, call the {@link RemovePoliceLine#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemovePoliceLine removePoliceLine(java.lang.Long id) throws java.io.IOException {
    RemovePoliceLine result = new RemovePoliceLine(id);
    initialize(result);
    return result;
  }

  public class RemovePoliceLine extends PolicelineendpointRequest<Void> {

    private static final String REST_PATH = "policeline/{id}";

    /**
     * Create a request for the method "removePoliceLine".
     *
     * This request holds the parameters needed by the the policelineendpoint server.  After setting
     * any optional parameters, call the {@link RemovePoliceLine#execute()} method to invoke the
     * remote operation. <p> {@link RemovePoliceLine#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemovePoliceLine(java.lang.Long id) {
      super(Policelineendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemovePoliceLine setAlt(java.lang.String alt) {
      return (RemovePoliceLine) super.setAlt(alt);
    }

    @Override
    public RemovePoliceLine setFields(java.lang.String fields) {
      return (RemovePoliceLine) super.setFields(fields);
    }

    @Override
    public RemovePoliceLine setKey(java.lang.String key) {
      return (RemovePoliceLine) super.setKey(key);
    }

    @Override
    public RemovePoliceLine setOauthToken(java.lang.String oauthToken) {
      return (RemovePoliceLine) super.setOauthToken(oauthToken);
    }

    @Override
    public RemovePoliceLine setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemovePoliceLine) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemovePoliceLine setQuotaUser(java.lang.String quotaUser) {
      return (RemovePoliceLine) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemovePoliceLine setUserIp(java.lang.String userIp) {
      return (RemovePoliceLine) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemovePoliceLine setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemovePoliceLine set(String parameterName, Object value) {
      return (RemovePoliceLine) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updatePoliceLine".
   *
   * This request holds the parameters needed by the policelineendpoint server.  After setting any
   * optional parameters, call the {@link UpdatePoliceLine#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine}
   * @return the request
   */
  public UpdatePoliceLine updatePoliceLine(com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine content) throws java.io.IOException {
    UpdatePoliceLine result = new UpdatePoliceLine(content);
    initialize(result);
    return result;
  }

  public class UpdatePoliceLine extends PolicelineendpointRequest<com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine> {

    private static final String REST_PATH = "policeline";

    /**
     * Create a request for the method "updatePoliceLine".
     *
     * This request holds the parameters needed by the the policelineendpoint server.  After setting
     * any optional parameters, call the {@link UpdatePoliceLine#execute()} method to invoke the
     * remote operation. <p> {@link UpdatePoliceLine#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine}
     * @since 1.13
     */
    protected UpdatePoliceLine(com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine content) {
      super(Policelineendpoint.this, "PUT", REST_PATH, content, com.googleappengine.emergencyreadybackend.entity.policelineendpoint.model.PoliceLine.class);
    }

    @Override
    public UpdatePoliceLine setAlt(java.lang.String alt) {
      return (UpdatePoliceLine) super.setAlt(alt);
    }

    @Override
    public UpdatePoliceLine setFields(java.lang.String fields) {
      return (UpdatePoliceLine) super.setFields(fields);
    }

    @Override
    public UpdatePoliceLine setKey(java.lang.String key) {
      return (UpdatePoliceLine) super.setKey(key);
    }

    @Override
    public UpdatePoliceLine setOauthToken(java.lang.String oauthToken) {
      return (UpdatePoliceLine) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdatePoliceLine setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdatePoliceLine) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdatePoliceLine setQuotaUser(java.lang.String quotaUser) {
      return (UpdatePoliceLine) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdatePoliceLine setUserIp(java.lang.String userIp) {
      return (UpdatePoliceLine) super.setUserIp(userIp);
    }

    @Override
    public UpdatePoliceLine set(String parameterName, Object value) {
      return (UpdatePoliceLine) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Policelineendpoint}.
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

    /** Builds a new instance of {@link Policelineendpoint}. */
    @Override
    public Policelineendpoint build() {
      return new Policelineendpoint(this);
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
     * Set the {@link PolicelineendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPolicelineendpointRequestInitializer(
        PolicelineendpointRequestInitializer policelineendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(policelineendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
