package kk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class uwvvkdfqfp implements gg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SharedPreferences f58914iobyxmoadg;

    public uwvvkdfqfp(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f58914iobyxmoadg = context.getSharedPreferences("SPAY_SDK_DATA", 0);
    }

    @Override // kk.gg
    public final boolean a(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        SharedPreferences sharedPreferencesA = a();
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.contains(key);
        }
        return false;
    }

    @Override // kk.gg
    public final Object b(String str, String str2) {
        return ef.iobyxmoadg(this, str, str2);
    }

    @Override // kk.gg
    public final void a(String str, String str2) {
        ef.zoijcleaow(this, str, str2);
    }

    @Override // kk.gg
    public final SharedPreferences a() {
        return this.f58914iobyxmoadg;
    }
}
