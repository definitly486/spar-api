package opjhrmiecq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gg.vdvldrhtss f73530iobyxmoadg = new gg.vdvldrhtss(hg.jyumaefscl.wflxmlrfwp(), hg.jyumaefscl.wflxmlrfwp());

    static final class iobyxmoadg implements x.zynmafqrjb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f73531iobyxmoadg = new iobyxmoadg();

        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn wkgbmnqykc(List list, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, (androidx.compose.ui.layout.kcexrzcfyt) list.get(i13), 0, 0, 0.0f, 4, null);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // x.zynmafqrjb
        public final x.istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(((x.pmvmpeiblj) list.get(i13)).sflfametgt(j13));
            }
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.draadjrbmk(j13), w0.zoijcleaow.gtknphoqwx(j13), null, new tg.draadjrbmk() { // from class: opjhrmiecq.nufgyqmvbu
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return dxjokdxxww.iobyxmoadg.wkgbmnqykc(arrayList, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                }
            }, 4, null);
        }
    }

    public static final gg.vdvldrhtss eablkybsjg(j0.eablkybsjg eablkybsjgVar, Map map) {
        if (map == null || map.isEmpty()) {
            return f73530iobyxmoadg;
        }
        List listDxjokdxxww = eablkybsjgVar.dxjokdxxww("androidx.compose.foundation.text.inlineContent", 0, eablkybsjgVar.btonecajqb().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listDxjokdxxww.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(map.get(((j0.eablkybsjg.wkgbmnqykc) listDxjokdxxww.get(i13)).lqeggnwhkg()));
        }
        return new gg.vdvldrhtss(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(j0.eablkybsjg eablkybsjgVar, List list, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(eablkybsjgVar, list, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final boolean wkgbmnqykc(j0.eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.ojitshcjhn("androidx.compose.foundation.text.inlineContent", 0, eablkybsjgVar.btonecajqb().length());
    }

    public static final void zoijcleaow(final j0.eablkybsjg eablkybsjgVar, final List list, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1794596951);
        int i14 = (i13 & 6) == 0 ? (draadjrbmkVarBtonecajqb.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(list) ? 32 : 16;
        }
        int i15 = 0;
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1794596951, i14, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (j0.eablkybsjg.wkgbmnqykc) list.get(i16);
                tg.vdvldrhtss vdvldrhtssVar = (tg.vdvldrhtss) wkgbmnqykcVar.iobyxmoadg();
                int iZoijcleaow = wkgbmnqykcVar.zoijcleaow();
                int iPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = iobyxmoadg.f73531iobyxmoadg;
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                x.zynmafqrjb zynmafqrjbVar = (x.zynmafqrjb) objYadqdtsiqt;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, i15));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVar, iobyxmoadgVar2.ppxfxbqfkf());
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                i15 = 0;
                vdvldrhtssVar.invoke(eablkybsjgVar.subSequence(iZoijcleaow, iPpxfxbqfkf).btonecajqb(), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: opjhrmiecq.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return dxjokdxxww.ppxfxbqfkf(eablkybsjgVar, list, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
