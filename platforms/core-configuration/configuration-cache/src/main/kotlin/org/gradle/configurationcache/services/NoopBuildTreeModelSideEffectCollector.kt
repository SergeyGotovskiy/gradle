/*
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.configurationcache.services

import org.gradle.internal.buildtree.BuildTreeModelSideEffect
import org.gradle.internal.buildtree.BuildTreeModelSideEffectCollector


/**
 * Implementation of [BuildTreeModelSideEffectCollector] that does nothing.
 */
class NoopBuildTreeModelSideEffectCollector : BuildTreeModelSideEffectCollector {
    override fun onSideEffect(sideEffect: BuildTreeModelSideEffect) {}
}
