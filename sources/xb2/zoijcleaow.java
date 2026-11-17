package xb2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Intent f122027iobyxmoadg;

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f122027iobyxmoadg = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // xb2.iobyxmoadg
    public String getBatteryLevel() {
        Intent intent = this.f122027iobyxmoadg;
        if (intent == null) {
            return "";
        }
        return String.valueOf((intent.getIntExtra("level", -1) * 100) / this.f122027iobyxmoadg.getIntExtra("scale", -1));
    }
}
