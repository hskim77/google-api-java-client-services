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
 * Model definition for OrderReportTransaction.
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
public final class OrderReportTransaction extends com.google.api.client.json.GenericJson {

  /**
   * The disbursement amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price disbursementAmount;

  /**
   * The date the disbursement was created, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disbursementCreationDate;

  /**
   * The date the disbursement was initiated, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disbursementDate;

  /**
   * The ID of the disbursement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disbursementId;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * Merchant-provided ID of the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String merchantOrderId;

  /**
   * The ID of the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderId;

  /**
   * Total amount for the items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount productAmount;

  /**
   * Total amount with remitted tax for the items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProductAmount productAmountWithRemittedTax;

  /**
   * The date of the transaction, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transactionDate;

  /**
   * The disbursement amount.
   * @return value or {@code null} for none
   */
  public Price getDisbursementAmount() {
    return disbursementAmount;
  }

  /**
   * The disbursement amount.
   * @param disbursementAmount disbursementAmount or {@code null} for none
   */
  public OrderReportTransaction setDisbursementAmount(Price disbursementAmount) {
    this.disbursementAmount = disbursementAmount;
    return this;
  }

  /**
   * The date the disbursement was created, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisbursementCreationDate() {
    return disbursementCreationDate;
  }

  /**
   * The date the disbursement was created, in ISO 8601 format.
   * @param disbursementCreationDate disbursementCreationDate or {@code null} for none
   */
  public OrderReportTransaction setDisbursementCreationDate(java.lang.String disbursementCreationDate) {
    this.disbursementCreationDate = disbursementCreationDate;
    return this;
  }

  /**
   * The date the disbursement was initiated, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisbursementDate() {
    return disbursementDate;
  }

  /**
   * The date the disbursement was initiated, in ISO 8601 format.
   * @param disbursementDate disbursementDate or {@code null} for none
   */
  public OrderReportTransaction setDisbursementDate(java.lang.String disbursementDate) {
    this.disbursementDate = disbursementDate;
    return this;
  }

  /**
   * The ID of the disbursement.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisbursementId() {
    return disbursementId;
  }

  /**
   * The ID of the disbursement.
   * @param disbursementId disbursementId or {@code null} for none
   */
  public OrderReportTransaction setDisbursementId(java.lang.String disbursementId) {
    this.disbursementId = disbursementId;
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
  public OrderReportTransaction setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Merchant-provided ID of the order.
   * @return value or {@code null} for none
   */
  public java.lang.String getMerchantOrderId() {
    return merchantOrderId;
  }

  /**
   * Merchant-provided ID of the order.
   * @param merchantOrderId merchantOrderId or {@code null} for none
   */
  public OrderReportTransaction setMerchantOrderId(java.lang.String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

  /**
   * The ID of the order.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderId() {
    return orderId;
  }

  /**
   * The ID of the order.
   * @param orderId orderId or {@code null} for none
   */
  public OrderReportTransaction setOrderId(java.lang.String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Total amount for the items.
   * @return value or {@code null} for none
   */
  public Amount getProductAmount() {
    return productAmount;
  }

  /**
   * Total amount for the items.
   * @param productAmount productAmount or {@code null} for none
   */
  public OrderReportTransaction setProductAmount(Amount productAmount) {
    this.productAmount = productAmount;
    return this;
  }

  /**
   * Total amount with remitted tax for the items.
   * @return value or {@code null} for none
   */
  public ProductAmount getProductAmountWithRemittedTax() {
    return productAmountWithRemittedTax;
  }

  /**
   * Total amount with remitted tax for the items.
   * @param productAmountWithRemittedTax productAmountWithRemittedTax or {@code null} for none
   */
  public OrderReportTransaction setProductAmountWithRemittedTax(ProductAmount productAmountWithRemittedTax) {
    this.productAmountWithRemittedTax = productAmountWithRemittedTax;
    return this;
  }

  /**
   * The date of the transaction, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransactionDate() {
    return transactionDate;
  }

  /**
   * The date of the transaction, in ISO 8601 format.
   * @param transactionDate transactionDate or {@code null} for none
   */
  public OrderReportTransaction setTransactionDate(java.lang.String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  @Override
  public OrderReportTransaction set(String fieldName, Object value) {
    return (OrderReportTransaction) super.set(fieldName, value);
  }

  @Override
  public OrderReportTransaction clone() {
    return (OrderReportTransaction) super.clone();
  }

}
