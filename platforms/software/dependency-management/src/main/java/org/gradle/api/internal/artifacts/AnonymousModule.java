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
package org.gradle.api.internal.artifacts;

import org.gradle.api.Project;
import org.gradle.api.artifacts.component.ComponentIdentifier;
import org.gradle.api.artifacts.component.ModuleComponentIdentifier;
import org.gradle.internal.component.external.model.DefaultModuleComponentIdentifier;

/**
 * A module representing a component with no unique identity.
 */
public class AnonymousModule implements Module {

    private static final ModuleComponentIdentifier ID = new DefaultModuleComponentIdentifier(
        DefaultModuleIdentifier.newId(
            "unspecified",
            "unspecified"
        ),
        Project.DEFAULT_VERSION
    );

    @Override
    public String getGroup() {
        return ID.getGroup();
    }

    @Override
    public String getName() {
        return ID.getModule();
    }

    @Override
    public String getVersion() {
        return ID.getVersion();
    }

    @Override
    public String getStatus() {
        return Project.DEFAULT_STATUS;
    }

    @Override
    public ComponentIdentifier getComponentId() {
        return ID;
    }
}
