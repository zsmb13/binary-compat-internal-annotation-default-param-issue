package co.zsmb.example

@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
annotation class MyInternalApi

fun defParamPublicFun(x: String = "") {}

@MyInternalApi
fun defParamInternalFun(x: Int = 0) {}

fun main() {
    defParamPublicFun()
    defParamPublicFun("test")
    defParamInternalFun()
    defParamInternalFun(1)
}
