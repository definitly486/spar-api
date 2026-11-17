package bw;

import android.content.Context;
import android.content.SharedPreferences;
import k30.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f17183iobyxmoadg;

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f17183iobyxmoadg = context.getSharedPreferences("NOTIFICATION_CACHE_PREFERENCES", 0);
    }

    public final void eablkybsjg(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences cachePreferences = this.f17183iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachePreferences, "cachePreferences");
        SharedPreferences.Editor editorEdit = cachePreferences.edit();
        editorEdit.putString("NC_PUSH_TOKEN_NAME", value);
        editorEdit.apply();
    }

    public final void gxszxtbevo(boolean z13) {
        SharedPreferences cachePreferences = this.f17183iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachePreferences, "cachePreferences");
        SharedPreferences.Editor editorEdit = cachePreferences.edit();
        editorEdit.putBoolean("NC_SENT_TO_SERVER_NAME", z13);
        editorEdit.apply();
    }

    public final long iobyxmoadg() {
        return this.f17183iobyxmoadg.getLong("NC_LAST_TOKEN_CHECK_TIME", 0L);
    }

    public final boolean ppxfxbqfkf() {
        return this.f17183iobyxmoadg.getBoolean("NC_SENT_TO_SERVER_NAME", false);
    }

    public final void wkgbmnqykc(long j13) {
        SharedPreferences cachePreferences = this.f17183iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachePreferences, "cachePreferences");
        SharedPreferences.Editor editorEdit = cachePreferences.edit();
        editorEdit.putLong("NC_LAST_TOKEN_CHECK_TIME", j13);
        editorEdit.apply();
    }

    public final String zoijcleaow() {
        String string = this.f17183iobyxmoadg.getString("NC_PUSH_TOKEN_NAME", draadjrbmk.ppxfxbqfkf());
        return string == null ? "" : string;
    }
}
