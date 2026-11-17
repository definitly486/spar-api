package org.xbill.DNS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class l0 extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected List f74454lereixgezr;

    protected l0() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        if (this.f74454lereixgezr.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = this.f74454lereixgezr.iterator();
        while (it.hasNext()) {
            sb3.append(e.iobyxmoadg((byte[]) it.next(), true));
            if (it.hasNext()) {
                sb3.append(" ");
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        Iterator it = this.f74454lereixgezr.iterator();
        while (it.hasNext()) {
            jyumaefsclVar.nufgyqmvbu((byte[]) it.next());
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74454lereixgezr = new ArrayList(2);
        while (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74454lereixgezr.add(zdlpuopuiuVar.lqeggnwhkg());
        }
    }
}
