/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
<<<<<<< HEAD:giraph-block-app-8/src/main/java/org/apache/giraph/function/primitive/comparators/BooleanComparatorFunction.java
package org.apache.giraph.function.primitive.comparators;

import it.unimi.dsi.fastutil.booleans.BooleanComparator;

import java.io.Serializable;

/** A type-specific comparator, that can be specified with a Lambda */
public interface BooleanComparatorFunction
    extends BooleanComparator, Serializable {
  @Override
  default int compare(Boolean ok1, Boolean ok2) {
   return compare(ok1.booleanValue(), ok2.booleanValue());
=======
package org.apache.giraph.compiling;

/**
 * Conf option which can initialize an object of specific class with desired
 * parameters set.
 * See TestRuntimeObjectFactoryCreationUtils for example.
 * Make sure fields which you want to set are protected.
 *
 * @param <T> Class type
 */
public class ObjectInitializerConfOption<T>
    extends ObjectFactoryConfOption<T> {
  public ObjectInitializerConfOption(
      String key, Class<T> classType, String codeSnippet, String description) {
    super(key, classType, codeSnippet, description);
  }

  @Override
  protected String createFullCodeSnippet(String codeSnippet) {
    return "return new " + getInterfaceName() + "(){{" + codeSnippet + "}};";
>>>>>>> release-1.3:giraph-block-app-8/src/main/java/org/apache/giraph/compiling/ObjectInitializerConfOption.java
  }
}
