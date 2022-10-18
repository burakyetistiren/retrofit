package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class RetrofitAdaptersProjectDependency extends DelegatingProjectDependency {

    @Inject
    public RetrofitAdaptersProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters:guava"
     */
    public RetrofitAdapters_GuavaProjectDependency getGuava() { return new RetrofitAdapters_GuavaProjectDependency(getFactory(), create(":retrofit-adapters:guava")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters:java8"
     */
    public RetrofitAdapters_Java8ProjectDependency getJava8() { return new RetrofitAdapters_Java8ProjectDependency(getFactory(), create(":retrofit-adapters:java8")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters:rxjava"
     */
    public RetrofitAdapters_RxjavaProjectDependency getRxjava() { return new RetrofitAdapters_RxjavaProjectDependency(getFactory(), create(":retrofit-adapters:rxjava")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters:rxjava2"
     */
    public RetrofitAdapters_Rxjava2ProjectDependency getRxjava2() { return new RetrofitAdapters_Rxjava2ProjectDependency(getFactory(), create(":retrofit-adapters:rxjava2")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters:rxjava3"
     */
    public RetrofitAdapters_Rxjava3ProjectDependency getRxjava3() { return new RetrofitAdapters_Rxjava3ProjectDependency(getFactory(), create(":retrofit-adapters:rxjava3")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters:scala"
     */
    public RetrofitAdapters_ScalaProjectDependency getScala() { return new RetrofitAdapters_ScalaProjectDependency(getFactory(), create(":retrofit-adapters:scala")); }

}
