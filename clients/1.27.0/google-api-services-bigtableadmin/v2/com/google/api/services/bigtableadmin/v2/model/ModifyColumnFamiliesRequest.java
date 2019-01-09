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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Request message for google.bigtable.admin.v2.BigtableTableAdmin.ModifyColumnFamilies
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyColumnFamiliesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Modifications to be atomically applied to the specified table's families. Entries are applied
   * in order, meaning that earlier modifications can be masked by later ones (in the case of
   * repeated updates to the same family, for example).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Modification> modifications;

  static {
    // hack to force ProGuard to consider Modification used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Modification.class);
  }

  /**
   * Modifications to be atomically applied to the specified table's families. Entries are applied
   * in order, meaning that earlier modifications can be masked by later ones (in the case of
   * repeated updates to the same family, for example).
   * @return value or {@code null} for none
   */
  public java.util.List<Modification> getModifications() {
    return modifications;
  }

  /**
   * Modifications to be atomically applied to the specified table's families. Entries are applied
   * in order, meaning that earlier modifications can be masked by later ones (in the case of
   * repeated updates to the same family, for example).
   * @param modifications modifications or {@code null} for none
   */
  public ModifyColumnFamiliesRequest setModifications(java.util.List<Modification> modifications) {
    this.modifications = modifications;
    return this;
  }

  @Override
  public ModifyColumnFamiliesRequest set(String fieldName, Object value) {
    return (ModifyColumnFamiliesRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyColumnFamiliesRequest clone() {
    return (ModifyColumnFamiliesRequest) super.clone();
  }

}