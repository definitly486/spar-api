package t6;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class nufgyqmvbu implements n1 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private b1 f109841eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f109842iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lrnfpwlwnk f109843ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final opjhrmiecq f109844wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f109845zoijcleaow;

    nufgyqmvbu(Context context, int i13, lrnfpwlwnk lrnfpwlwnkVar, opjhrmiecq opjhrmiecqVar) {
        this.f109842iobyxmoadg = context;
        this.f109845zoijcleaow = i13;
        this.f109843ppxfxbqfkf = lrnfpwlwnkVar;
        this.f109844wkgbmnqykc = opjhrmiecqVar;
    }

    private b1 ppxfxbqfkf() {
        TelephonyManager telephonyManagerWkgbmnqykc = wkgbmnqykc();
        if (telephonyManagerWkgbmnqykc != null && this.f109841eablkybsjg == null) {
            this.f109841eablkybsjg = new b1(this.f109842iobyxmoadg, telephonyManagerWkgbmnqykc);
        }
        return this.f109841eablkybsjg;
    }

    protected List eablkybsjg(TelephonyManager telephonyManager) {
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        return allCellInfo == null ? new ArrayList() : allCellInfo;
    }

    @Override // t6.n1
    public List iobyxmoadg() {
        ArrayList arrayList = new ArrayList();
        TelephonyManager telephonyManagerWkgbmnqykc = wkgbmnqykc();
        if (telephonyManagerWkgbmnqykc != null) {
            long jIobyxmoadg = this.f109843ppxfxbqfkf.iobyxmoadg();
            long jZoijcleaow = this.f109843ppxfxbqfkf.zoijcleaow();
            Iterator it = eablkybsjg(telephonyManagerWkgbmnqykc).iterator();
            while (it.hasNext()) {
                wflxmlrfwp wflxmlrfwpVarDxjokdxxww = f0.dxjokdxxww((CellInfo) it.next(), jIobyxmoadg, jZoijcleaow);
                if (wflxmlrfwpVarDxjokdxxww != null && this.f109844wkgbmnqykc.iobyxmoadg(wflxmlrfwpVarDxjokdxxww)) {
                    arrayList.add(wflxmlrfwpVarDxjokdxxww);
                }
            }
        }
        return arrayList;
    }

    public TelephonyManager wkgbmnqykc() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f109842iobyxmoadg.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        int i13 = this.f109845zoijcleaow;
        return i13 != -1 ? telephonyManager.createForSubscriptionId(i13) : telephonyManager;
    }

    @Override // t6.n1
    public ServiceState zoijcleaow() {
        b1 b1VarPpxfxbqfkf = ppxfxbqfkf();
        if (b1VarPpxfxbqfkf != null) {
            return b1VarPpxfxbqfkf.wkgbmnqykc();
        }
        return null;
    }
}
