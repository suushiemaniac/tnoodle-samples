import dependencies.Libraries.Buildscript.ANDROID_BUILD_TOOLS_ACTUAL
import dependencies.Plugins.GWT_ACTUAL
import dependencies.Plugins.ANDROID_APP_ACTUAL

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

// This currently only exists because there is a bug in Gradle
// that prevents "plugins {}" and "buildscript {}" blocks
// to load anything not in the root package.

// See https://github.com/gradle/gradle/issues/9270 for details.

inline val PluginDependenciesSpec.GWT: PluginDependencySpec
    get() = GWT_ACTUAL

inline val PluginDependenciesSpec.ANDROID_APP: PluginDependencySpec
    get() = ANDROID_APP_ACTUAL

inline val ANDROID_BUILD_TOOLS: String
    get() = ANDROID_BUILD_TOOLS_ACTUAL
