package n6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g6.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf extends eablkybsjg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(Context context, r6.zoijcleaow taskExecutor) {
        super(context, taskExecutor);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
    }

    @Override // n6.eablkybsjg
    public IntentFilter btonecajqb() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // n6.nufgyqmvbu
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public Boolean eablkybsjg() {
        Intent intentRegisterReceiver = wkgbmnqykc().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(wkgbmnqykc.f69177iobyxmoadg, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z13 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }

    @Override // n6.eablkybsjg
    public void gtknphoqwx(Intent intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(wkgbmnqykc.f69177iobyxmoadg, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    lqeggnwhkg(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                lqeggnwhkg(Boolean.FALSE);
            }
        }
    }
}
