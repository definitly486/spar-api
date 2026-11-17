package n6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g6.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends eablkybsjg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, r6.zoijcleaow taskExecutor) {
        super(context, taskExecutor);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
    }

    private final boolean draadjrbmk(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // n6.eablkybsjg
    public IntentFilter btonecajqb() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // n6.eablkybsjg
    public void gtknphoqwx(Intent intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(zoijcleaow.f69178iobyxmoadg, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    lqeggnwhkg(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    lqeggnwhkg(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    lqeggnwhkg(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    lqeggnwhkg(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // n6.nufgyqmvbu
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public Boolean eablkybsjg() {
        Intent intentRegisterReceiver = wkgbmnqykc().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(draadjrbmk(intentRegisterReceiver));
        }
        yggfygwlhe.eablkybsjg().ppxfxbqfkf(zoijcleaow.f69178iobyxmoadg, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
