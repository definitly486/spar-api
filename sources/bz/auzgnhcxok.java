package bz;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class auzgnhcxok extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17383eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pc2.iobyxmoadg f17384gxszxtbevo;

    auzgnhcxok(Context context, pc2.iobyxmoadg iobyxmoadgVar) {
        super(kc2.lqeggnwhkg.HoursSinceInstall);
        this.f17383eablkybsjg = context;
        this.f17384gxszxtbevo = iobyxmoadgVar;
    }

    private int yadqdtsiqt(String str) {
        try {
            return (int) TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - this.f17383eablkybsjg.getPackageManager().getPackageInfo(str, 4096).firstInstallTime);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        oc2.iobyxmoadg iobyxmoadgVar2 = new oc2.iobyxmoadg();
        oc2.iobyxmoadg iobyxmoadgVar3 = new oc2.iobyxmoadg();
        Set setKeySet = kc2.lqeggnwhkg.iobyxmoadg().keySet();
        for (Map.Entry entry : this.f17384gxszxtbevo.wkgbmnqykc().entrySet()) {
            String str = ((String) entry.getValue()).isEmpty() ? (String) entry.getKey() : (String) entry.getValue();
            if (!str.isEmpty()) {
                int iYadqdtsiqt = yadqdtsiqt((String) entry.getKey());
                if (setKeySet.contains(entry.getKey())) {
                    iobyxmoadgVar2.put(str, Integer.valueOf(iYadqdtsiqt));
                } else {
                    iobyxmoadgVar3.put(str, Integer.valueOf(iYadqdtsiqt));
                }
            }
        }
        if (!iobyxmoadgVar2.isEmpty()) {
            Set setNufgyqmvbu = this.f17384gxszxtbevo.nufgyqmvbu();
            kc2.lqeggnwhkg lqeggnwhkgVar = kc2.lqeggnwhkg.Default;
            if (setNufgyqmvbu.contains(lqeggnwhkgVar)) {
                iobyxmoadgVar.put(lqeggnwhkgVar.name(), iobyxmoadgVar2);
            }
        }
        if (!iobyxmoadgVar3.isEmpty()) {
            Set setNufgyqmvbu2 = this.f17384gxszxtbevo.nufgyqmvbu();
            kc2.lqeggnwhkg lqeggnwhkgVar2 = kc2.lqeggnwhkg.Custom;
            if (setNufgyqmvbu2.contains(lqeggnwhkgVar2)) {
                iobyxmoadgVar.put(lqeggnwhkgVar2.name(), iobyxmoadgVar3);
            }
        }
        return iobyxmoadgVar;
    }
}
