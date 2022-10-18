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
public class RetrofitRootProjectDependency extends DelegatingProjectDependency {

    @Inject
    public RetrofitRootProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":retrofit"
     */
    public RetrofitProjectDependency getRetrofit() { return new RetrofitProjectDependency(getFactory(), create(":retrofit")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-adapters"
     */
    public RetrofitAdaptersProjectDependency getRetrofitAdapters() { return new RetrofitAdaptersProjectDependency(getFactory(), create(":retrofit-adapters")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters"
     */
    public RetrofitConvertersProjectDependency getRetrofitConverters() { return new RetrofitConvertersProjectDependency(getFactory(), create(":retrofit-converters")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-mock"
     */
    public RetrofitMockProjectDependency getRetrofitMock() { return new RetrofitMockProjectDependency(getFactory(), create(":retrofit-mock")); }

    /**
     * Creates a project dependency on the project at path ":samples"
     */
    public SamplesProjectDependency getSamples() { return new SamplesProjectDependency(getFactory(), create(":samples")); }

}
