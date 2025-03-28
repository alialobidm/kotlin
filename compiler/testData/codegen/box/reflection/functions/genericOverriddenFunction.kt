// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: WASM
// IGNORE_IR_DESERIALIZATION_TEST: JS_IR
// ^^^ Source code is not compiled in JS.

// WITH_REFLECT

package test

import kotlin.test.assertEquals

interface H<T> {
    fun foo(): T?
}

interface A : H<A>

fun box(): String {
    assertEquals("test.A?", A::foo.returnType.toString())
    assertEquals("T?", H<A>::foo.returnType.toString())

    return "OK"
}
