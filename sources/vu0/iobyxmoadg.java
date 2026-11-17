package vu0;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f118092iobyxmoadg;

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f118092iobyxmoadg = context.getSharedPreferences("NOTIFICATION_CACHE_PREFERENCES", 0);
    }

    public final long iobyxmoadg() {
        return this.f118092iobyxmoadg.getLong("NC_LAST_TOKEN_CHECK_TIME", 0L);
    }

    public final void ppxfxbqfkf(long j13) {
        SharedPreferences cachePreferences = this.f118092iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachePreferences, "cachePreferences");
        SharedPreferences.Editor editorEdit = cachePreferences.edit();
        editorEdit.putLong("NC_LAST_TOKEN_CHECK_TIME", j13);
        editorEdit.apply();
    }

    public final void wkgbmnqykc(boolean z13) {
        SharedPreferences cachePreferences = this.f118092iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachePreferences, "cachePreferences");
        SharedPreferences.Editor editorEdit = cachePreferences.edit();
        editorEdit.putBoolean("NC_SENT_TO_SERVER_NAME", z13);
        editorEdit.apply();
    }

    public final boolean zoijcleaow() {
        return this.f118092iobyxmoadg.getBoolean("NC_SENT_TO_SERVER_NAME", false);
    }
}
