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
 * Order. All methods require the order manager role.
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
public final class Order extends com.google.api.client.json.GenericJson {

  /**
   * Whether the order was acknowledged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean acknowledged;

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelType;

  /**
   * The details of the customer who placed the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderCustomer customer;

  /**
   * Delivery details for shipments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderDeliveryDetails deliveryDetails;

  /**
   * The REST ID of the order. Globally unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#order".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Line items that are ordered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderLineItem> lineItems;

  /**
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
   * The net amount for the order. For example, if an order was originally for a grand total of $100
   * and a refund was issued for $20, the net amount will be $80.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price netAmount;

  /**
   * The details of the payment method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderPaymentMethod paymentMethod;

  /**
   * The status of the payment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentStatus;

  /**
   * The date when the order was placed, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String placedDate;

  /**
   * The details of the merchant provided promotions applied to the order. More details about the
   * program are here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderLegacyPromotion> promotions;

  /**
   * Refunds for the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderRefund> refunds;

  /**
   * Shipments of the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderShipment> shipments;

  /**
   * The total cost of shipping for all items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price shippingCost;

  /**
   * The tax for the total shipping cost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price shippingCostTax;

  /**
   * Deprecated. Shipping details are provided with line items instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shippingOption;

  /**
   * The status of the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The party responsible for collecting and remitting taxes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taxCollector;

  /**
   * Whether the order was acknowledged.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAcknowledged() {
    return acknowledged;
  }

  /**
   * Whether the order was acknowledged.
   * @param acknowledged acknowledged or {@code null} for none
   */
  public Order setAcknowledged(java.lang.Boolean acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelType() {
    return channelType;
  }

  /**
   * Deprecated.
   * @param channelType channelType or {@code null} for none
   */
  public Order setChannelType(java.lang.String channelType) {
    this.channelType = channelType;
    return this;
  }

  /**
   * The details of the customer who placed the order.
   * @return value or {@code null} for none
   */
  public OrderCustomer getCustomer() {
    return customer;
  }

  /**
   * The details of the customer who placed the order.
   * @param customer customer or {@code null} for none
   */
  public Order setCustomer(OrderCustomer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Delivery details for shipments.
   * @return value or {@code null} for none
   */
  public OrderDeliveryDetails getDeliveryDetails() {
    return deliveryDetails;
  }

  /**
   * Delivery details for shipments.
   * @param deliveryDetails deliveryDetails or {@code null} for none
   */
  public Order setDeliveryDetails(OrderDeliveryDetails deliveryDetails) {
    this.deliveryDetails = deliveryDetails;
    return this;
  }

  /**
   * The REST ID of the order. Globally unique.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The REST ID of the order. Globally unique.
   * @param id id or {@code null} for none
   */
  public Order setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#order".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#order".
   * @param kind kind or {@code null} for none
   */
  public Order setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Line items that are ordered.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderLineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Line items that are ordered.
   * @param lineItems lineItems or {@code null} for none
   */
  public Order setLineItems(java.util.List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * @param merchantId merchantId or {@code null} for none
   */
  public Order setMerchantId(java.math.BigInteger merchantId) {
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
  public Order setMerchantOrderId(java.lang.String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

  /**
   * The net amount for the order. For example, if an order was originally for a grand total of $100
   * and a refund was issued for $20, the net amount will be $80.
   * @return value or {@code null} for none
   */
  public Price getNetAmount() {
    return netAmount;
  }

  /**
   * The net amount for the order. For example, if an order was originally for a grand total of $100
   * and a refund was issued for $20, the net amount will be $80.
   * @param netAmount netAmount or {@code null} for none
   */
  public Order setNetAmount(Price netAmount) {
    this.netAmount = netAmount;
    return this;
  }

  /**
   * The details of the payment method.
   * @return value or {@code null} for none
   */
  public OrderPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * The details of the payment method.
   * @param paymentMethod paymentMethod or {@code null} for none
   */
  public Order setPaymentMethod(OrderPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The status of the payment.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentStatus() {
    return paymentStatus;
  }

  /**
   * The status of the payment.
   * @param paymentStatus paymentStatus or {@code null} for none
   */
  public Order setPaymentStatus(java.lang.String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * The date when the order was placed, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlacedDate() {
    return placedDate;
  }

  /**
   * The date when the order was placed, in ISO 8601 format.
   * @param placedDate placedDate or {@code null} for none
   */
  public Order setPlacedDate(java.lang.String placedDate) {
    this.placedDate = placedDate;
    return this;
  }

  /**
   * The details of the merchant provided promotions applied to the order. More details about the
   * program are here.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderLegacyPromotion> getPromotions() {
    return promotions;
  }

  /**
   * The details of the merchant provided promotions applied to the order. More details about the
   * program are here.
   * @param promotions promotions or {@code null} for none
   */
  public Order setPromotions(java.util.List<OrderLegacyPromotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * Refunds for the order.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderRefund> getRefunds() {
    return refunds;
  }

  /**
   * Refunds for the order.
   * @param refunds refunds or {@code null} for none
   */
  public Order setRefunds(java.util.List<OrderRefund> refunds) {
    this.refunds = refunds;
    return this;
  }

  /**
   * Shipments of the order.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderShipment> getShipments() {
    return shipments;
  }

  /**
   * Shipments of the order.
   * @param shipments shipments or {@code null} for none
   */
  public Order setShipments(java.util.List<OrderShipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  /**
   * The total cost of shipping for all items.
   * @return value or {@code null} for none
   */
  public Price getShippingCost() {
    return shippingCost;
  }

  /**
   * The total cost of shipping for all items.
   * @param shippingCost shippingCost or {@code null} for none
   */
  public Order setShippingCost(Price shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * The tax for the total shipping cost.
   * @return value or {@code null} for none
   */
  public Price getShippingCostTax() {
    return shippingCostTax;
  }

  /**
   * The tax for the total shipping cost.
   * @param shippingCostTax shippingCostTax or {@code null} for none
   */
  public Order setShippingCostTax(Price shippingCostTax) {
    this.shippingCostTax = shippingCostTax;
    return this;
  }

  /**
   * Deprecated. Shipping details are provided with line items instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getShippingOption() {
    return shippingOption;
  }

  /**
   * Deprecated. Shipping details are provided with line items instead.
   * @param shippingOption shippingOption or {@code null} for none
   */
  public Order setShippingOption(java.lang.String shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

  /**
   * The status of the order.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the order.
   * @param status status or {@code null} for none
   */
  public Order setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The party responsible for collecting and remitting taxes.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaxCollector() {
    return taxCollector;
  }

  /**
   * The party responsible for collecting and remitting taxes.
   * @param taxCollector taxCollector or {@code null} for none
   */
  public Order setTaxCollector(java.lang.String taxCollector) {
    this.taxCollector = taxCollector;
    return this;
  }

  @Override
  public Order set(String fieldName, Object value) {
    return (Order) super.set(fieldName, value);
  }

  @Override
  public Order clone() {
    return (Order) super.clone();
  }

}
