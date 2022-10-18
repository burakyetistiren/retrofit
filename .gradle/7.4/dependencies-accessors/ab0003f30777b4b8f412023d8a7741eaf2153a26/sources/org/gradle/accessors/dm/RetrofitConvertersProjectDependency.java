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
public class RetrofitConvertersProjectDependency extends DelegatingProjectDependency {

    @Inject
    public RetrofitConvertersProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:gson"
     */
    public RetrofitConverters_GsonProjectDependency getGson() { return new RetrofitConverters_GsonProjectDependency(getFactory(), create(":retrofit-converters:gson")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:guava"
     */
    public RetrofitConverters_GuavaProjectDependency getGuava() { return new RetrofitConverters_GuavaProjectDependency(getFactory(), create(":retrofit-converters:guava")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:jackson"
     */
    public RetrofitConverters_JacksonProjectDependency getJackson() { return new RetrofitConverters_JacksonProjectDependency(getFactory(), create(":retrofit-converters:jackson")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:java8"
     */
    public RetrofitConverters_Java8ProjectDependency getJava8() { return new RetrofitConverters_Java8ProjectDependency(getFactory(), create(":retrofit-converters:java8")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:jaxb"
     */
    public RetrofitConverters_JaxbProjectDependency getJaxb() { return new RetrofitConverters_JaxbProjectDependency(getFactory(), create(":retrofit-converters:jaxb")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:jaxb3"
     */
    public RetrofitConverters_Jaxb3ProjectDependency getJaxb3() { return new RetrofitConverters_Jaxb3ProjectDependency(getFactory(), create(":retrofit-converters:jaxb3")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:moshi"
     */
    public RetrofitConverters_MoshiProjectDependency getMoshi() { return new RetrofitConverters_MoshiProjectDependency(getFactory(), create(":retrofit-converters:moshi")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:protobuf"
     */
    public RetrofitConverters_ProtobufProjectDependency getProtobuf() { return new RetrofitConverters_ProtobufProjectDependency(getFactory(), create(":retrofit-converters:protobuf")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:scalars"
     */
    public RetrofitConverters_ScalarsProjectDependency getScalars() { return new RetrofitConverters_ScalarsProjectDependency(getFactory(), create(":retrofit-converters:scalars")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:simplexml"
     */
    public RetrofitConverters_SimplexmlProjectDependency getSimplexml() { return new RetrofitConverters_SimplexmlProjectDependency(getFactory(), create(":retrofit-converters:simplexml")); }

    /**
     * Creates a project dependency on the project at path ":retrofit-converters:wire"
     */
    public RetrofitConverters_WireProjectDependency getWire() { return new RetrofitConverters_WireProjectDependency(getFactory(), create(":retrofit-converters:wire")); }

}
