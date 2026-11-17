package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class ribwqtqdhb {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static WeakReference f24474wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f24475iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f24476ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ulzqkzuiru f24477zoijcleaow;

    private ribwqtqdhb(SharedPreferences sharedPreferences, Executor executor) {
        this.f24476ppxfxbqfkf = executor;
        this.f24475iobyxmoadg = sharedPreferences;
    }

    public static synchronized ribwqtqdhb iobyxmoadg(Context context, Executor executor) {
        ribwqtqdhb ribwqtqdhbVar;
        try {
            WeakReference weakReference = f24474wkgbmnqykc;
            ribwqtqdhbVar = weakReference != null ? (ribwqtqdhb) weakReference.get() : null;
            if (ribwqtqdhbVar == null) {
                ribwqtqdhbVar = new ribwqtqdhb(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                ribwqtqdhbVar.ppxfxbqfkf();
                f24474wkgbmnqykc = new WeakReference(ribwqtqdhbVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ribwqtqdhbVar;
    }

    private synchronized void ppxfxbqfkf() {
        this.f24477zoijcleaow = ulzqkzuiru.ppxfxbqfkf(this.f24475iobyxmoadg, "topic_operation_queue", StringUtils.COMMA, this.f24476ppxfxbqfkf);
    }

    synchronized boolean wkgbmnqykc(jlmebxxoox jlmebxxooxVar) {
        return this.f24477zoijcleaow.gxszxtbevo(jlmebxxooxVar.eablkybsjg());
    }

    synchronized jlmebxxoox zoijcleaow() {
        return jlmebxxoox.iobyxmoadg(this.f24477zoijcleaow.eablkybsjg());
    }
}
