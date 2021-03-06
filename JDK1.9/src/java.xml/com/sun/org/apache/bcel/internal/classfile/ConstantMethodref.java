/*
 * Copyright (c) 2007, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sun.org.apache.bcel.internal.classfile;


import com.sun.org.apache.bcel.internal.Constants;
import java.io.*;

/**
 * This class represents a constant pool reference to a method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
public final class ConstantMethodref extends ConstantCP {
  /**
   * Initialize from another object.
   */
  public ConstantMethodref(ConstantMethodref c) {
    super(Constants.CONSTANT_Methodref, c.getClassIndex(), c.getNameAndTypeIndex());
  }

  /**
   * Initialize instance from file data.
   *
   * @param file input stream
   * @throws IOException
   */
  ConstantMethodref(DataInputStream file) throws IOException
  {
    super(Constants.CONSTANT_Methodref, file);
  }

  /**
   * @param class_index Reference to the class containing the method
   * @param name_and_type_index and the method signature
   */
  public ConstantMethodref(int class_index,
                           int name_and_type_index) {
    super(Constants.CONSTANT_Methodref, class_index, name_and_type_index);
  }

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
  public void accept(Visitor v) {
    v.visitConstantMethodref(this);
  }
}
