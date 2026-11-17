package n6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g6.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk extends eablkybsjg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(Context context, r6.zoijcleaow taskExecutor) {
        super(context, taskExecutor);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
    }

    @Override // n6.eablkybsjg
    public IntentFilter btonecajqb() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // n6.nufgyqmvbu
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public Boolean eablkybsjg() {
        Intent intentRegisterReceiver = wkgbmnqykc().registerReceiver(null, btonecajqb());
        boolean z13 = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z13 = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z13 = false;
            }
        }
        return Boolean.valueOf(z13);
    }

    @Override // n6.eablkybsjg
    public void gtknphoqwx(Intent intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(wflxmlrfwp.f69176iobyxmoadg, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    lqeggnwhkg(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                lqeggnwhkg(Boolean.TRUE);
            }
        }
    }
}
