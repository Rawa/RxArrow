package com.lenguyenthanh.rxarrow.examples.util

import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.disposables.DisposableContainer

fun Disposable.disposedBy(container: DisposableContainer) {
    container.add(this)
}
