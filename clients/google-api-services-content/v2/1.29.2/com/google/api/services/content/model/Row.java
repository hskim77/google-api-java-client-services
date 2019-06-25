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
 * Model definition for Row.
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
public final class Row extends com.google.api.client.json.GenericJson {

  /**
   * The list of cells that constitute the row. Must have the same length as columnHeaders for two-
   * dimensional tables, a length of 1 for one-dimensional tables. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Value> cells;

  /**
   * The list of cells that constitute the row. Must have the same length as columnHeaders for two-
   * dimensional tables, a length of 1 for one-dimensional tables. Required.
   * @return value or {@code null} for none
   */
  public java.util.List<Value> getCells() {
    return cells;
  }

  /**
   * The list of cells that constitute the row. Must have the same length as columnHeaders for two-
   * dimensional tables, a length of 1 for one-dimensional tables. Required.
   * @param cells cells or {@code null} for none
   */
  public Row setCells(java.util.List<Value> cells) {
    this.cells = cells;
    return this;
  }

  @Override
  public Row set(String fieldName, Object value) {
    return (Row) super.set(fieldName, value);
  }

  @Override
  public Row clone() {
    return (Row) super.clone();
  }

}
