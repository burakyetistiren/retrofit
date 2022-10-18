package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for android (com.google.android:android)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() { return create("android"); }

        /**
         * Creates a dependency provider for androidPlugin (com.android.tools.build:gradle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidPlugin() { return create("androidPlugin"); }

        /**
         * Creates a dependency provider for androidxTestRunner (androidx.test:runner)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroidxTestRunner() { return create("androidxTestRunner"); }

        /**
         * Creates a dependency provider for animalSnifferAnnotations (org.codehaus.mojo:animal-sniffer-annotations)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnimalSnifferAnnotations() { return create("animalSnifferAnnotations"); }

        /**
         * Creates a dependency provider for assertj (org.assertj:assertj-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertj() { return create("assertj"); }

        /**
         * Creates a dependency provider for errorproneCore (com.google.errorprone:error_prone_core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getErrorproneCore() { return create("errorproneCore"); }

        /**
         * Creates a dependency provider for errorproneJavac (com.google.errorprone:javac)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getErrorproneJavac() { return create("errorproneJavac"); }

        /**
         * Creates a dependency provider for findBugsAnnotations (com.google.code.findbugs:jsr305)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFindBugsAnnotations() { return create("findBugsAnnotations"); }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() { return create("gson"); }

        /**
         * Creates a dependency provider for guava (com.google.guava:guava)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGuava() { return create("guava"); }

        /**
         * Creates a dependency provider for jacksonDatabind (com.fasterxml.jackson.core:jackson-databind)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDatabind() { return create("jacksonDatabind"); }

        /**
         * Creates a dependency provider for jaxb3Api (jakarta.xml.bind:jakarta.xml.bind-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJaxb3Api() { return create("jaxb3Api"); }

        /**
         * Creates a dependency provider for jaxb3Impl (com.sun.xml.bind:jaxb-impl)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJaxb3Impl() { return create("jaxb3Impl"); }

        /**
         * Creates a dependency provider for jaxbApi (javax.xml.bind:jaxb-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJaxbApi() { return create("jaxbApi"); }

        /**
         * Creates a dependency provider for jaxbImpl (org.glassfish.jaxb:jaxb-runtime)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJaxbImpl() { return create("jaxbImpl"); }

        /**
         * Creates a dependency provider for jsoup (org.jsoup:jsoup)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsoup() { return create("jsoup"); }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit"); }

        /**
         * Creates a dependency provider for kotlinCoroutines (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinCoroutines() { return create("kotlinCoroutines"); }

        /**
         * Creates a dependency provider for kotlinStdLib (org.jetbrains.kotlin:kotlin-stdlib)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinStdLib() { return create("kotlinStdLib"); }

        /**
         * Creates a dependency provider for mockwebserver (com.squareup.okhttp3:mockwebserver)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockwebserver() { return create("mockwebserver"); }

        /**
         * Creates a dependency provider for moshi (com.squareup.moshi:moshi)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMoshi() { return create("moshi"); }

        /**
         * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() { return create("okhttp"); }

        /**
         * Creates a dependency provider for protobuf (com.google.protobuf:protobuf-java)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getProtobuf() { return create("protobuf"); }

        /**
         * Creates a dependency provider for protoc (com.google.protobuf:protoc)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getProtoc() { return create("protoc"); }

        /**
         * Creates a dependency provider for reactiveStreams (org.reactivestreams:reactive-streams)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getReactiveStreams() { return create("reactiveStreams"); }

        /**
         * Creates a dependency provider for robovm (com.mobidevelop.robovm:robovm-rt)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRobovm() { return create("robovm"); }

        /**
         * Creates a dependency provider for robovmPlugin (com.mobidevelop.robovm:robovm-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRobovmPlugin() { return create("robovmPlugin"); }

        /**
         * Creates a dependency provider for rxjava (io.reactivex:rxjava)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxjava() { return create("rxjava"); }

        /**
         * Creates a dependency provider for rxjava2 (io.reactivex.rxjava2:rxjava)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxjava2() { return create("rxjava2"); }

        /**
         * Creates a dependency provider for rxjava3 (io.reactivex.rxjava3:rxjava)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxjava3() { return create("rxjava3"); }

        /**
         * Creates a dependency provider for scalaLibrary (org.scala-lang:scala-library)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getScalaLibrary() { return create("scalaLibrary"); }

        /**
         * Creates a dependency provider for simpleXml (org.simpleframework:simple-xml)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSimpleXml() { return create("simpleXml"); }

        /**
         * Creates a dependency provider for wireRuntime (com.squareup.wire:wire-runtime)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWireRuntime() { return create("wireRuntime"); }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jaxb (2.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJaxb() { return getVersion("jaxb"); }

            /**
             * Returns the version associated to this alias: jaxb3 (3.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJaxb3() { return getVersion("jaxb3"); }

            /**
             * Returns the version associated to this alias: kotlin (1.5.21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: okhttp (3.14.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

            /**
             * Returns the version associated to this alias: protobuf (3.17.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getProtobuf() { return getVersion("protobuf"); }

            /**
             * Returns the version associated to this alias: robovm (2.3.14)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRobovm() { return getVersion("robovm"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final KotlinPluginAccessors baccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for animalsniffer to the plugin id 'ru.vyarus.animalsniffer'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAnimalsniffer() { return createPlugin("animalsniffer"); }

            /**
             * Creates a plugin provider for dokka to the plugin id 'org.jetbrains.dokka'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDokka() { return createPlugin("dokka"); }

            /**
             * Creates a plugin provider for errorprone to the plugin id 'net.ltgt.errorprone'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getErrorprone() { return createPlugin("errorprone"); }

            /**
             * Creates a plugin provider for googleJavaFormat to the plugin id 'com.github.sherter.google-java-format'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getGoogleJavaFormat() { return createPlugin("googleJavaFormat"); }

            /**
             * Creates a plugin provider for mavenPublish to the plugin id 'com.vanniktech.maven.publish'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getMavenPublish() { return createPlugin("mavenPublish"); }

            /**
             * Creates a plugin provider for protobuf to the plugin id 'com.google.protobuf'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getProtobuf() { return createPlugin("protobuf"); }

        /**
         * Returns the group of bundles at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() { return baccForKotlinPluginAccessors; }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.jvm to the plugin id 'org.jetbrains.kotlin.jvm'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJvm() { return createPlugin("kotlin.jvm"); }

    }

}
