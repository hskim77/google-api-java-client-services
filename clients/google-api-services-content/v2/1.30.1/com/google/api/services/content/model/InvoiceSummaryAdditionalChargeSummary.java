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
 * Model definition for InvoiceSummaryAdditionalChargeSummary.
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
public final class InvoiceSummaryAdditionalChargeSummary extends com.google.api.client.json.GenericJson {

  /**
   * [required] Total additional charge for this type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount totalAmount;

  /**
   * [required] Type of the additional charge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [required] Total additional charge for this type.
   * @return value or {@code null} for none
   */
  public Amount getTotalAmount() {
    return totalAmount;
  }

  /**
   * [required] Total additional charge for this type.
   * @param totalAmount totalAmount or {@code null} for none
   */
  public InvoiceSummaryAdditionalChargeSummary setTotalAmount(Amount totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * [required] Type of the additional charge.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [required] Type of the additional charge.
   * @param type type or {@code null} for none
   */
  public InvoiceSummaryAdditionalChargeSummary setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public InvoiceSummaryAdditionalChargeSummary set(String fieldName, Object value) {
    return (InvoiceSummaryAdditionalChargeSummary) super.set(fieldName, value);
  }

  @Override
  public InvoiceSummaryAdditionalChargeSummary clone() {
    return (InvoiceSummaryAdditionalChargeSummary) super.clone();
  }

}
