package xb2;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f122026iobyxmoadg = new iobyxmoadg(null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // xb2.ppxfxbqfkf
    public String iobyxmoadg(Context appContext) {
        zdlpuopuiu.btonecajqb(appContext, "appContext");
        String string = appContext.getSharedPreferences("clickstream_lite_prefs_device_id", 0).getString("deviceId", "");
        return string == null ? "" : string;
    }

    @Override // xb2.ppxfxbqfkf
    public void zoijcleaow(Context appContext, String deviceId) {
        zdlpuopuiu.btonecajqb(appContext, "appContext");
        zdlpuopuiu.btonecajqb(deviceId, "deviceId");
        appContext.getSharedPreferences("clickstream_lite_prefs_device_id", 0).edit().putString("deviceId", deviceId).apply();
    }
}
