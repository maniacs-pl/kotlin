package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

interface export { companion object {} }

fun box(): String {
    testNotRenamed("export", { export })

    return "OK"
}