package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class A6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f45439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f45440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3908va f45441c;

    public A6(File file, C6 c13, C3908va c3908va) {
        super(file.getAbsolutePath(), 8);
        this.f45439a = c13;
        this.f45440b = file;
        this.f45441c = c3908va;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i13, String str) {
        if (i13 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f45439a;
        C3908va c3908va = this.f45441c;
        File file = this.f45440b;
        c3908va.getClass();
        consumer.consume(new File(file, str));
    }
}
