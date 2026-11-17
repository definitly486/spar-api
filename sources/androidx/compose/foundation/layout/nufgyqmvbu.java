package androidx.compose.foundation.layout;

import androidx.collection.dsvhmnatus;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final dsvhmnatus f4873iobyxmoadg = gxszxtbevo(true);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dsvhmnatus f4876zoijcleaow = gxszxtbevo(false);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final x.zynmafqrjb f4874ppxfxbqfkf = new draadjrbmk(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final x.zynmafqrjb f4875wkgbmnqykc = iobyxmoadg.f4877iobyxmoadg;

    static final class iobyxmoadg implements x.zynmafqrjb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f4877iobyxmoadg = new iobyxmoadg();

        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn wkgbmnqykc(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // x.zynmafqrjb
        public final x.istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.wflxmlrfwp(j13), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.lqeggnwhkg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return nufgyqmvbu.iobyxmoadg.wkgbmnqykc((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, x.pmvmpeiblj pmvmpeibljVar, w0.zdlpuopuiu zdlpuopuiuVar, int i13, int i14, a.eablkybsjg eablkybsjgVar) {
        a.eablkybsjg eablkybsjgVarH0;
        gxszxtbevo gxszxtbevoVarLqeggnwhkg = lqeggnwhkg(pmvmpeibljVar);
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.lmojexxdyd(iobyxmoadgVar, kcexrzcfytVar, ((gxszxtbevoVarLqeggnwhkg == null || (eablkybsjgVarH0 = gxszxtbevoVarLqeggnwhkg.H0()) == null) ? eablkybsjgVar : eablkybsjgVarH0).iobyxmoadg(w0.oxmwwwfdhm.ppxfxbqfkf((((long) kcexrzcfytVar.eslsurpljm()) << 32) | (((long) kcexrzcfytVar.ipoelvxyzq()) & 4294967295L)), w0.oxmwwwfdhm.ppxfxbqfkf((((long) i13) << 32) | (((long) i14) & 4294967295L)), zdlpuopuiuVar), 0.0f, 2, null);
    }

    public static final x.zynmafqrjb dxjokdxxww(a.eablkybsjg eablkybsjgVar, boolean z13) {
        x.zynmafqrjb zynmafqrjbVar = (x.zynmafqrjb) (z13 ? f4873iobyxmoadg : f4876zoijcleaow).eablkybsjg(eablkybsjgVar);
        return zynmafqrjbVar == null ? new draadjrbmk(eablkybsjgVar, z13) : zynmafqrjbVar;
    }

    public static final x.zynmafqrjb gtknphoqwx(a.eablkybsjg eablkybsjgVar, boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        x.zynmafqrjb zynmafqrjbVar;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(56522820, i13, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, a.eablkybsjg.f20iobyxmoadg.ojitshcjhn()) || z13) {
            draadjrbmkVar.sopmlzcsov(244414741);
            boolean z14 = ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.ulzqkzuiru(eablkybsjgVar)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 48) == 32);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new draadjrbmk(eablkybsjgVar, z13);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            zynmafqrjbVar = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
        } else {
            draadjrbmkVar.sopmlzcsov(244367063);
            draadjrbmkVar.stevsuqkhv();
            zynmafqrjbVar = f4874ppxfxbqfkf;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return zynmafqrjbVar;
    }

    private static final dsvhmnatus gxszxtbevo(boolean z13) {
        dsvhmnatus dsvhmnatusVar = new dsvhmnatus(9);
        a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.ojitshcjhn(), new draadjrbmk(iobyxmoadgVar.ojitshcjhn(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.wflxmlrfwp(), new draadjrbmk(iobyxmoadgVar.wflxmlrfwp(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.agtfadlqog(), new draadjrbmk(iobyxmoadgVar.agtfadlqog(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.nufgyqmvbu(), new draadjrbmk(iobyxmoadgVar.nufgyqmvbu(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.eablkybsjg(), new draadjrbmk(iobyxmoadgVar.eablkybsjg(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.gxszxtbevo(), new draadjrbmk(iobyxmoadgVar.gxszxtbevo(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.wkgbmnqykc(), new draadjrbmk(iobyxmoadgVar.wkgbmnqykc(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.zoijcleaow(), new draadjrbmk(iobyxmoadgVar.zoijcleaow(), z13));
        dsvhmnatusVar.cqumvgiudr(iobyxmoadgVar.ppxfxbqfkf(), new draadjrbmk(iobyxmoadgVar.ppxfxbqfkf(), z13));
        return dsvhmnatusVar;
    }

    private static final gxszxtbevo lqeggnwhkg(x.pmvmpeiblj pmvmpeibljVar) {
        Object objLqeggnwhkg = pmvmpeibljVar.lqeggnwhkg();
        if (objLqeggnwhkg instanceof gxszxtbevo) {
            return (gxszxtbevo) objLqeggnwhkg;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nufgyqmvbu(x.pmvmpeiblj pmvmpeibljVar) {
        gxszxtbevo gxszxtbevoVarLqeggnwhkg = lqeggnwhkg(pmvmpeibljVar);
        if (gxszxtbevoVarLqeggnwhkg != null) {
            return gxszxtbevoVarLqeggnwhkg.I0();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-211209833);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 3) != 2, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-211209833, i14, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            x.zynmafqrjb zynmafqrjbVar = f4875wkgbmnqykc;
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVar, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: czzsidtyhn.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return androidx.compose.foundation.layout.nufgyqmvbu.ppxfxbqfkf(wkgbmnqykcVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
