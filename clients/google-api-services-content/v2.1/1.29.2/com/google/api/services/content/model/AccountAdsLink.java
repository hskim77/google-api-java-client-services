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
 * Model definition for AccountAdsLink.
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
public final class AccountAdsLink extends com.google.api.client.json.GenericJson {

  /**
   * Customer ID of the Ads account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger adsId;

  /**
   * Status of the link between this Merchant Center account and the Ads account. Upon retrieval, it
   * represents the actual status of the link and can be either active if it was approved in Google
   * Ads or pending if it's pending approval. Upon insertion, it represents the intended status of
   * the link. Re-uploading a link with status active when it's still pending or with status pending
   * when it's already active will have no effect: the status will remain unchanged. Re-uploading a
   * link with deprecated status inactive is equivalent to not submitting the link at all and will
   * delete the link if it was active or cancel the link request if it was pending.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Customer ID of the Ads account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAdsId() {
    return adsId;
  }

  /**
   * Customer ID of the Ads account.
   * @param adsId adsId or {@code null} for none
   */
  public AccountAdsLink setAdsId(java.math.BigInteger adsId) {
    this.adsId = adsId;
    return this;
  }

  /**
   * Status of the link between this Merchant Center account and the Ads account. Upon retrieval, it
   * represents the actual status of the link and can be either active if it was approved in Google
   * Ads or pending if it's pending approval. Upon insertion, it represents the intended status of
   * the link. Re-uploading a link with status active when it's still pending or with status pending
   * when it's already active will have no effect: the status will remain unchanged. Re-uploading a
   * link with deprecated status inactive is equivalent to not submitting the link at all and will
   * delete the link if it was active or cancel the link request if it was pending.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the link between this Merchant Center account and the Ads account. Upon retrieval, it
   * represents the actual status of the link and can be either active if it was approved in Google
   * Ads or pending if it's pending approval. Upon insertion, it represents the intended status of
   * the link. Re-uploading a link with status active when it's still pending or with status pending
   * when it's already active will have no effect: the status will remain unchanged. Re-uploading a
   * link with deprecated status inactive is equivalent to not submitting the link at all and will
   * delete the link if it was active or cancel the link request if it was pending.
   * @param status status or {@code null} for none
   */
  public AccountAdsLink setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public AccountAdsLink set(String fieldName, Object value) {
    return (AccountAdsLink) super.set(fieldName, value);
  }

  @Override
  public AccountAdsLink clone() {
    return (AccountAdsLink) super.clone();
  }

}
