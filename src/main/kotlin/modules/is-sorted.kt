package modules

/**
 * El principal problema que tenemos la hacerlo así es que debes saber lo que devuelve el método,
 * o clase que se está invocando.
 * https://kotlinlang.org/docs/using-packages-from-npm.html
 */
@JsModule("is-sorted")
@JsNonModule
external fun <T> sorted(a: Array<T>): Boolean