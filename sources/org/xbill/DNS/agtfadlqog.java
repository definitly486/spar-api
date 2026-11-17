package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public class agtfadlqog {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final am.iobyxmoadg f74223zoijcleaow = am.zoijcleaow.dxjokdxxww(agtfadlqog.class);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow[] f74224iobyxmoadg = new zoijcleaow[17];

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        auzgnhcxok f74225iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        zoijcleaow f74226ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f74227zoijcleaow;

        private zoijcleaow() {
        }
    }

    public void iobyxmoadg(int i13, auzgnhcxok auzgnhcxokVar) {
        if (i13 > 16383) {
            return;
        }
        int iHashCode = (auzgnhcxokVar.hashCode() & Integer.MAX_VALUE) % 17;
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        zoijcleaowVar.f74225iobyxmoadg = auzgnhcxokVar;
        zoijcleaowVar.f74227zoijcleaow = i13;
        zoijcleaow[] zoijcleaowVarArr = this.f74224iobyxmoadg;
        zoijcleaowVar.f74226ppxfxbqfkf = zoijcleaowVarArr[iHashCode];
        zoijcleaowVarArr[iHashCode] = zoijcleaowVar;
        f74223zoijcleaow.dxjokdxxww("Adding {} at {}", auzgnhcxokVar, Integer.valueOf(i13));
    }

    public int zoijcleaow(auzgnhcxok auzgnhcxokVar) {
        int i13 = -1;
        for (zoijcleaow zoijcleaowVar = this.f74224iobyxmoadg[(auzgnhcxokVar.hashCode() & Integer.MAX_VALUE) % 17]; zoijcleaowVar != null; zoijcleaowVar = zoijcleaowVar.f74226ppxfxbqfkf) {
            if (zoijcleaowVar.f74225iobyxmoadg.equals(auzgnhcxokVar)) {
                i13 = zoijcleaowVar.f74227zoijcleaow;
            }
        }
        f74223zoijcleaow.dxjokdxxww("Looking for {}, found {}", auzgnhcxokVar, Integer.valueOf(i13));
        return i13;
    }
}
