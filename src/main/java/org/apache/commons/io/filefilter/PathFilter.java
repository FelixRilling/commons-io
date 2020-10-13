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

package org.apache.commons.io.filefilter;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;

/**
 * A filter for {@link Path}s.
 *
 * @since 2.9.0
 */
public interface PathFilter {

    /**
     * Tests whether or not to include the specified Path in a result.
     *
     * @param path The Path to test.
     * @return a FileVisitResult
     * @throws IOException if an I/O error occurs
     */
    FileVisitResult accept(Path path) throws IOException;

    /**
     * Tests whether or not to include the specified Path in a result.
     *
     * @param path The dir path to test.
     * @param name The path base name to test.
     * @return a FileVisitResult
     * @throws IOException if an I/O error occurs
     */
    FileVisitResult accept(Path path, Path name) throws IOException;
}
