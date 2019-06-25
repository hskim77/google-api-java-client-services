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
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * A batch entry encoding a single non-batch accountstatuses request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountstatusesCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the (sub-)account whose status to get.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger accountId;

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * If set, only issues for the specified destinations are returned, otherwise only issues for the
   * Shopping destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destinations;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * The method (get).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The ID of the (sub-)account whose status to get.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAccountId() {
    return accountId;
  }

  /**
   * The ID of the (sub-)account whose status to get.
   * @param accountId accountId or {@code null} for none
   */
  public AccountstatusesCustomBatchRequestEntry setAccountId(java.math.BigInteger accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * An entry ID, unique within the batch request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * An entry ID, unique within the batch request.
   * @param batchId batchId or {@code null} for none
   */
  public AccountstatusesCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * If set, only issues for the specified destinations are returned, otherwise only issues for the
   * Shopping destination.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestinations() {
    return destinations;
  }

  /**
   * If set, only issues for the specified destinations are returned, otherwise only issues for the
   * Shopping destination.
   * @param destinations destinations or {@code null} for none
   */
  public AccountstatusesCustomBatchRequestEntry setDestinations(java.util.List<java.lang.String> destinations) {
    this.destinations = destinations;
    return this;
  }

  /**
   * The ID of the managing account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the managing account.
   * @param merchantId merchantId or {@code null} for none
   */
  public AccountstatusesCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The method (get).
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * The method (get).
   * @param method method or {@code null} for none
   */
  public AccountstatusesCustomBatchRequestEntry setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  @Override
  public AccountstatusesCustomBatchRequestEntry set(String fieldName, Object value) {
    return (AccountstatusesCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public AccountstatusesCustomBatchRequestEntry clone() {
    return (AccountstatusesCustomBatchRequestEntry) super.clone();
  }

}
