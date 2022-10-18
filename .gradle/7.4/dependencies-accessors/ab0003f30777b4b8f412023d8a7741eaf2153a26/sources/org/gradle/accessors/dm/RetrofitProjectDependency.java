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
public class RetrofitProjectDependency extends DelegatingProjectDependency {

    @Inject
    public RetrofitProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":retrofit:android-test"
     */
    public Retrofit_AndroidTestProjectDependency getAndroidTest() { return new Retrofit_AndroidTestProjectDependency(getFactory(), create(":retrofit:android-test")); }

    /**
     * Creates a project dependency on the project at path ":retrofit:kotlin-test"
     */
    public Retrofit_KotlinTestProjectDependency getKotlinTest() { return new Retrofit_KotlinTestProjectDependency(getFactory(), create(":retrofit:kotlin-test")); }

    /**
     * Creates a project dependency on the project at path ":retrofit:robovm-test"
     */
    public Retrofit_RobovmTestProjectDependency getRobovmTest() { return new Retrofit_RobovmTestProjectDependency(getFactory(), create(":retrofit:robovm-test")); }

    /**
     * Creates a project dependency on the project at path ":retrofit:test-helpers"
     */
    public Retrofit_TestHelpersProjectDependency getTestHelpers() { return new Retrofit_TestHelpersProjectDependency(getFactory(), create(":retrofit:test-helpers")); }

}
