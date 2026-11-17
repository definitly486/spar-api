package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f5702iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f5707zoijcleaow = new hszhottldk("provider");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f5705ppxfxbqfkf = new hszhottldk("provider");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Object f5706wkgbmnqykc = new hszhottldk("compositionLocalMap");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Object f5700eablkybsjg = new hszhottldk("providerValues");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Object f5701gxszxtbevo = new hszhottldk("providers");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Object f5703lqeggnwhkg = new hszhottldk("reference");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Comparator f5704nufgyqmvbu = new Comparator() { // from class: androidx.compose.runtime.kcexrzcfyt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jyumaefscl.wkgbmnqykc((rlfsiqarku) obj, (rlfsiqarku) obj2);
        }
    };

    public static final Object cdpycssgdh() {
        return f5707zoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cllcsxoeiz(d0 d0Var, int i13, int i14, int i15) {
        if (i13 == i14) {
            return i13;
        }
        if (i13 == i15 || i14 == i15) {
            return i15;
        }
        if (d0Var.stevsuqkhv(i13) == i14) {
            return i14;
        }
        if (d0Var.stevsuqkhv(i14) == i13) {
            return i13;
        }
        if (d0Var.stevsuqkhv(i13) == d0Var.stevsuqkhv(i14)) {
            return d0Var.stevsuqkhv(i13);
        }
        int iCqumvgiudr = cqumvgiudr(d0Var, i13, i15);
        int iCqumvgiudr2 = cqumvgiudr(d0Var, i14, i15);
        int i16 = iCqumvgiudr - iCqumvgiudr2;
        for (int i17 = 0; i17 < i16; i17++) {
            i13 = d0Var.stevsuqkhv(i13);
        }
        int i18 = iCqumvgiudr2 - iCqumvgiudr;
        for (int i19 = 0; i19 < i18; i19++) {
            i14 = d0Var.stevsuqkhv(i14);
        }
        while (i13 != i14) {
            i13 = d0Var.stevsuqkhv(i13);
            i14 = d0Var.stevsuqkhv(i14);
        }
        return i13;
    }

    private static final int cqumvgiudr(d0 d0Var, int i13, int i14) {
        int i15 = 0;
        while (i13 > 0 && i13 != i14) {
            i13 = d0Var.stevsuqkhv(i13);
            i15++;
        }
        return i15;
    }

    public static final void dsvhmnatus(h0 h0Var, final t tVar) {
        h0Var.sopmlzcsov(h0Var.ribwqtqdhb(), new tg.rgvfuqvkyq() { // from class: androidx.compose.runtime.zdlpuopuiu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return jyumaefscl.wypolnanlu(tVar, ((Integer) obj).intValue(), obj2);
            }
        });
        h0Var.fyldjkxazc();
    }

    private static final int esjtqupxsv(List list, int i13) {
        int iLereixgezr = lereixgezr(list, i13);
        return iLereixgezr < 0 ? -(iLereixgezr + 1) : iLereixgezr;
    }

    public static final boolean hcddaimhww(h0 h0Var) {
        return h0Var.ribwqtqdhb() > h0Var.vipkmwdibw() + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.collection.dsvhmnatus hkdspvbjdz(int i13) {
        return ipoelvxyzq.zoijcleaow.wkgbmnqykc(new androidx.collection.dsvhmnatus(i13));
    }

    public static final Object iozdgvuglv() {
        return f5705ppxfxbqfkf;
    }

    public static final Object istkbnxepw() {
        return f5706wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn iwizpuwonk(t tVar, h0 h0Var, int i13, Object obj) {
        if (obj instanceof dxjokdxxww) {
            tVar.zoijcleaow((dxjokdxxww) obj);
        } else if (obj instanceof v) {
            v vVar = (v) obj;
            if (!(vVar.zoijcleaow() instanceof y)) {
                stevsuqkhv(h0Var, i13, obj);
                tVar.gxszxtbevo(vVar);
            }
        } else if (obj instanceof e) {
            stevsuqkhv(h0Var, i13, obj);
            ((e) obj).pmvmpeiblj();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final boolean jpowsppfya() {
        return false;
    }

    public static final void jyumaefscl(final h0 h0Var, final t tVar) {
        h0Var.sopmlzcsov(h0Var.ribwqtqdhb(), new tg.rgvfuqvkyq() { // from class: androidx.compose.runtime.yggfygwlhe
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return jyumaefscl.iwizpuwonk(tVar, h0Var, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    private static final void kcexrzcfyt(d0 d0Var, List list, int i13) {
        if (d0Var.hcddaimhww(i13)) {
            list.add(d0Var.hkdspvbjdz(i13));
            return;
        }
        int iIozdgvuglv = i13 + 1;
        int iIozdgvuglv2 = i13 + d0Var.iozdgvuglv(i13);
        while (iIozdgvuglv < iIozdgvuglv2) {
            kcexrzcfyt(d0Var, list, iIozdgvuglv);
            iIozdgvuglv += d0Var.iozdgvuglv(iIozdgvuglv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rlfsiqarku kegysxyocb(List list, int i13) {
        int iLereixgezr = lereixgezr(list, i13);
        if (iLereixgezr >= 0) {
            return (rlfsiqarku) list.remove(iLereixgezr);
        }
        return null;
    }

    private static final int lereixgezr(List list, int i13) {
        int size = list.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            int iDraadjrbmk = kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(((rlfsiqarku) list.get(i15)).zoijcleaow(), i13);
            if (iDraadjrbmk < 0) {
                i14 = i15 + 1;
            } else {
                if (iDraadjrbmk <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static final Object lmojexxdyd() {
        return f5701gxszxtbevo;
    }

    public static final void mbcevpiqjq() {
    }

    public static final void ntlheqmsrt(int i13, int i14, int i15, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List oxmwwwfdhm(e0 e0Var, zoijcleaow zoijcleaowVar) {
        ArrayList arrayList = new ArrayList();
        d0 d0VarJyumaefscl = e0Var.jyumaefscl();
        try {
            kcexrzcfyt(d0VarJyumaefscl, arrayList, e0Var.zoijcleaow(zoijcleaowVar));
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            return arrayList;
        } finally {
            d0VarJyumaefscl.wkgbmnqykc();
        }
    }

    public static final boolean pkzmftpjix(d0 d0Var) {
        return d0Var.gtknphoqwx() > d0Var.yggfygwlhe() + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rlfsiqarku pmvmpeiblj(List list, int i13, int i14) {
        int iEsjtqupxsv = esjtqupxsv(list, i13);
        if (iEsjtqupxsv >= list.size()) {
            return null;
        }
        rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) list.get(iEsjtqupxsv);
        if (rlfsiqarkuVar.zoijcleaow() < i14) {
            return rlfsiqarkuVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rgvfuqvkyq(int i13) {
        return i13 != 0;
    }

    private static final void stevsuqkhv(h0 h0Var, int i13, Object obj) {
        Object objWwaezpbzkn = h0Var.wwaezpbzkn(i13);
        if (obj == objWwaezpbzkn) {
            return;
        }
        zdlpuopuiu("Slot table is out of sync (expected " + obj + ", got " + objWwaezpbzkn + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tzroggbefp(List list, int i13, int i14) {
        int iEsjtqupxsv = esjtqupxsv(list, i13);
        while (iEsjtqupxsv < list.size() && ((rlfsiqarku) list.get(iEsjtqupxsv)).zoijcleaow() < i14) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vdvldrhtss(boolean z13) {
        return z13 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wkgbmnqykc(rlfsiqarku rlfsiqarkuVar, rlfsiqarku rlfsiqarkuVar2) {
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(rlfsiqarkuVar.zoijcleaow(), rlfsiqarkuVar2.zoijcleaow());
    }

    public static final Object wwaezpbzkn() {
        return f5703lqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wypolnanlu(t tVar, int i13, Object obj) {
        if (obj instanceof dxjokdxxww) {
            tVar.iobyxmoadg((dxjokdxxww) obj);
        }
        if (obj instanceof v) {
            tVar.gxszxtbevo((v) obj);
        }
        if (obj instanceof e) {
            ((e) obj).pmvmpeiblj();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object yadqdtsiqt(yfnezrywwk yfnezrywwkVar) {
        return yfnezrywwkVar.wkgbmnqykc() != null ? new uwvvkdfqfp(Integer.valueOf(yfnezrywwkVar.iobyxmoadg()), yfnezrywwkVar.wkgbmnqykc()) : Integer.valueOf(yfnezrywwkVar.iobyxmoadg());
    }

    public static final Void yggfygwlhe(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ylkuphrtab(List list, int i13, e eVar, Object obj) {
        int iLereixgezr = lereixgezr(list, i13);
        if (iLereixgezr < 0) {
            int i14 = -(iLereixgezr + 1);
            if (!(obj instanceof kegysxyocb)) {
                obj = null;
            }
            list.add(i14, new rlfsiqarku(eVar, i13, obj));
            return;
        }
        rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) list.get(iLereixgezr);
        if (!(obj instanceof kegysxyocb)) {
            rlfsiqarkuVar.eablkybsjg(null);
            return;
        }
        Object objIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
        if (objIobyxmoadg == null) {
            rlfsiqarkuVar.eablkybsjg(obj);
        } else if (objIobyxmoadg instanceof androidx.collection.wypolnanlu) {
            ((androidx.collection.wypolnanlu) objIobyxmoadg).nufgyqmvbu(obj);
        } else {
            rlfsiqarkuVar.eablkybsjg(androidx.collection.jhduphickx.ppxfxbqfkf(objIobyxmoadg, obj));
        }
    }

    public static final void zdlpuopuiu(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final boolean zynmafqrjb() {
        return f5702iobyxmoadg;
    }
}
