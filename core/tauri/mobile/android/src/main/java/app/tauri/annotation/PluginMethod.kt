// Copyright 2019-2023 Tauri Programme within The Commons Conservancy
// SPDX-License-Identifier: Apache-2.0
// SPDX-License-Identifier: MIT

package app.tauri.annotation

@Retention(AnnotationRetention.RUNTIME)
annotation class PluginMethod(val returnType: String = "promise") { }
