package yy0;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.zdlpuopuiu;
import uw0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f126865iobyxmoadg;

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f126865iobyxmoadg = context.getSharedPreferences("DebugPanelStubsPreferences", 0);
    }

    @Override // yy0.iobyxmoadg
    public boolean iobyxmoadg() {
        if (ppxfxbqfkf.f114521iobyxmoadg.cqumvgiudr()) {
            return true;
        }
        return this.f126865iobyxmoadg.getBoolean("debugPanelVpnStubEnabled", false);
    }
}
