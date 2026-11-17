package w52;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import czzsidtyhn.uawqvzlxes;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import gg.wwaezpbzkn;
import h.g;
import h.oipsdeybqn;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import igdgnonuha.z1;
import j0.h;
import j0.i;
import j0.n;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gtknphoqwx {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(List list, boolean z13, boolean z14, rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        wflxmlrfwp(list, z13, z14, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final float cdpycssgdh(double d13, double d14) {
        Double dValueOf = Double.valueOf(d14);
        if (dValueOf.doubleValue() <= 0.0d) {
            dValueOf = null;
        }
        return (float) Math.min(1.0d, qs.eablkybsjg.gtknphoqwx(d13 / (dValueOf != null ? dValueOf.doubleValue() : 1.0d), 5, null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0174  */
    private static final void cqumvgiudr(final v52.iobyxmoadg iobyxmoadgVar, final rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        oipsdeybqn oipsdeybqnVarDxjokdxxww;
        boolean z13;
        boolean z14;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(441866116);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(441866116, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LoyaltyProgramLevel (SpecialBannerLoyaltyProgramCompose.kt:76)");
            }
            y52.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1638549146);
            if (iobyxmoadgVarIobyxmoadg2 == y52.iobyxmoadg.LEVEL_BLOCKED) {
                oipsdeybqnVarDxjokdxxww = oipsdeybqn.dxjokdxxww(y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).esjtqupxsv());
                z13 = true;
            } else {
                if (iobyxmoadgVarIobyxmoadg2 == y52.iobyxmoadg.LEVEL_WITH_LOCKS) {
                    oipsdeybqnVarDxjokdxxww = null;
                    z14 = true;
                    z13 = false;
                } else {
                    if (iobyxmoadgVarIobyxmoadg2 != y52.iobyxmoadg.LEVEL_WITH_INFO) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oipsdeybqnVarDxjokdxxww = null;
                    z13 = false;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
                zynmafqrjb(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.zoijcleaow(), oipsdeybqnVarDxjokdxxww, draadjrbmkVarBtonecajqb, 0, 0);
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(12)), draadjrbmkVarBtonecajqb, 6);
                wflxmlrfwp(iobyxmoadgVar.ppxfxbqfkf(), z13, z14, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 << 6) & 7168, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-881221679);
                if (iobyxmoadgVar.wkgbmnqykc() != null && iobyxmoadgVar.iobyxmoadg() == y52.iobyxmoadg.LEVEL_WITH_INFO) {
                    uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
                    zdlpuopuiu(iobyxmoadgVar.wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
            z14 = z13;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar2 = vdvldrhtss.f26487iobyxmoadg;
            zynmafqrjb(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.zoijcleaow(), oipsdeybqnVarDxjokdxxww, draadjrbmkVarBtonecajqb, 0, 0);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(12)), draadjrbmkVarBtonecajqb, 6);
            wflxmlrfwp(iobyxmoadgVar.ppxfxbqfkf(), z13, z14, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 << 6) & 7168, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-881221679);
            if (iobyxmoadgVar.wkgbmnqykc() != null) {
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
                zdlpuopuiu(iobyxmoadgVar.wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.esjtqupxsv(iobyxmoadgVar, rgvfuqvkyqVar, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(List list, int i13, draadjrbmk draadjrbmkVar, int i14) {
        gtknphoqwx(list, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(v52.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        cqumvgiudr(iobyxmoadgVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void gtknphoqwx(final List list, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        draadjrbmk draadjrbmkVar2;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(536813589);
        int i15 = 4;
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(536813589, i14, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.CategoriesBlock (SpecialBannerLoyaltyProgramCompose.kt:224)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(i15)), draadjrbmkVarBtonecajqb, 6);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
                z zVar = z.f44180iobyxmoadg;
                int i16 = z.f44181zoijcleaow;
                draadjrbmk draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(str, wkgbmnqykcVarNufgyqmvbu, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().ojitshcjhn(), draadjrbmkVar3, 48, 0, 65528);
                i15 = i15;
                draadjrbmkVarBtonecajqb = draadjrbmkVar3;
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.btonecajqb
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.draadjrbmk(list, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(String str, String str2, oipsdeybqn oipsdeybqnVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zynmafqrjb(str, str2, oipsdeybqnVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(czzsidtyhn.rgvfuqvkyq rgvfuqvkyqVar, double d13, double d14, int i13, draadjrbmk draadjrbmkVar, int i14) {
        jyumaefscl(rgvfuqvkyqVar, d13, d14, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void jyumaefscl(final czzsidtyhn.rgvfuqvkyq rgvfuqvkyqVar, final double d13, final double d14, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        long jIwizpuwonk;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1003420024);
        if ((i13 & 48) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.gxszxtbevo(d13) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.gxszxtbevo(d14) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 145) == 144 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1003420024, i14, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelProgressWithSum (SpecialBannerLoyaltyProgramCompose.kt:303)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(12)), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarDxjokdxxww = cdpycssgdh.dxjokdxxww(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(4));
            z zVar = z.f44180iobyxmoadg;
            int i15 = z.f44181zoijcleaow;
            z1.kcexrzcfyt(cdpycssgdh(d13, d14), wkgbmnqykcVarDxjokdxxww, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).eablkybsjg(), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).zdlpuopuiu(), g.f38891iobyxmoadg.zoijcleaow(), draadjrbmkVarBtonecajqb, 48, 0);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(2)), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewhVar, iobyxmoadgVar, 1.0f, false, 2, null);
            n nVarZoijcleaow = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i15).zoijcleaow();
            if (d13 > 0.0d) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1062040907);
                jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).eablkybsjg();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1061968429);
                jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).iwizpuwonk();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            w6.btonecajqb(String.valueOf((int) d13), wkgbmnqykcVarZoijcleaow, jIwizpuwonk, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarZoijcleaow, draadjrbmkVarBtonecajqb, 0, 3072, 57336);
            w6.btonecajqb(String.valueOf((int) d14), tbqsvytpvh.zoijcleaow(roivzttewhVar, iobyxmoadgVar, 1.0f, false, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).esjtqupxsv(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(v0.btonecajqb.f114934zoijcleaow.zoijcleaow()), 0L, 0, false, 1, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i15).zoijcleaow(), draadjrbmkVarBtonecajqb, 0, 3072, 56824);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.iwizpuwonk(rgvfuqvkyqVar, d13, d14, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, float f13, rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        vdvldrhtss(iobyxmoadgVar, z13, z14, f13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void lereixgezr(final v52.zoijcleaow model, final rgvfuqvkyq onBannerInfoItemClicked, draadjrbmk draadjrbmkVar, final int i13) {
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(onBannerInfoItemClicked, "onBannerInfoItemClicked");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(442540125);
        int i14 = (i13 & 6) == 0 ? (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBannerInfoItemClicked) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(442540125, i14, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.SpecialBannerLoyaltyProgramCompose (SpecialBannerLoyaltyProgramCompose.kt:63)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            int i15 = 0;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1710209510);
            for (Object obj : model.iobyxmoadg()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                v52.iobyxmoadg iobyxmoadgVar2 = (v52.iobyxmoadg) obj;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1710208189);
                if (i15 != 0) {
                    uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                cqumvgiudr(iobyxmoadgVar2, onBannerInfoItemClicked, draadjrbmkVarBtonecajqb, i14 & 112);
                i15 = i16;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return gtknphoqwx.pmvmpeiblj(model, onBannerInfoItemClicked, i13, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void ojitshcjhn(final tbqsvytpvh tbqsvytpvhVar, final boolean z13, final boolean z14, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        int i15;
        long jEablkybsjg;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-191502061);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(tbqsvytpvhVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-191502061, i14, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoIcon (SpecialBannerLoyaltyProgramCompose.kt:237)");
            }
            if (z13) {
                i15 = s40.gxszxtbevo.ic_lock_closed;
            } else {
                i15 = z14 ? s40.gxszxtbevo.ic_lock_open : s40.gxszxtbevo.ic_chevron_right_green;
            }
            if (z13) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1948111698);
                jEablkybsjg = oipsdeybqn.wflxmlrfwp(y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).lereixgezr(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else if (z14) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1948109252);
                jEablkybsjg = y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1948107588);
                jEablkybsjg = y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(i15, draadjrbmkVarBtonecajqb, 0), null, tbqsvytpvhVar.ppxfxbqfkf(cdpycssgdh.vdvldrhtss(esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 11, null), w0.nufgyqmvbu.lqeggnwhkg((z13 || z14) ? 16 : 24)), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww()), jEablkybsjg, draadjrbmkVarBtonecajqb, 48, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.rgvfuqvkyq(tbqsvytpvhVar, z13, z14, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(rgvfuqvkyq rgvfuqvkyqVar, c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.wkgbmnqykc());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(v52.zoijcleaow zoijcleaowVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        lereixgezr(zoijcleaowVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(tbqsvytpvh tbqsvytpvhVar, boolean z13, boolean z14, int i13, draadjrbmk draadjrbmkVar, int i14) {
        ojitshcjhn(tbqsvytpvhVar, z13, z14, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void vdvldrhtss(final c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar, final boolean z13, final boolean z14, final float f13, final rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        draadjrbmk draadjrbmkVar2;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-325542717);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.zoijcleaow(f13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 16384 : 8192;
        }
        int i15 = i14;
        if ((i15 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-325542717, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoItem (SpecialBannerLoyaltyProgramCompose.kt:164)");
            }
            boolean z15 = (z13 || z14 || iobyxmoadgVar.zoijcleaow() == f40.zoijcleaow.NONE) ? false : true;
            boolean z16 = (z13 || z14) ? true : z15;
            boolean z17 = (z13 || z14 || iobyxmoadgVar.iobyxmoadg().isEmpty()) ? false : true;
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            oipsdeybqn oipsdeybqnVarDxjokdxxww = oipsdeybqn.dxjokdxxww(y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).lereixgezr());
            oipsdeybqnVarDxjokdxxww.iwizpuwonk();
            oipsdeybqn oipsdeybqnVar = z13 ? oipsdeybqnVarDxjokdxxww : null;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1932779284);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1932778616);
            if (z15) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-54159603);
                boolean zLmojexxdyd = ((57344 & i15) == 16384) | draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: w52.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gtknphoqwx.oxmwwwfdhm(rgvfuqvkyqVar, iobyxmoadgVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.eablkybsjg.nufgyqmvbu(wkgbmnqykcVarNufgyqmvbu, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt, 15, null);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg interfaceC0470eablkybsjgNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar3 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(interfaceC0470eablkybsjgNufgyqmvbu, iobyxmoadgVar3.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar4.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
            float f14 = 4;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.yggfygwlhe(iobyxmoadgVar2, f13), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f14), 1, null);
            n nVarGtknphoqwx = y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().gtknphoqwx();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-54146208);
            long jEablkybsjg = oipsdeybqnVar == null ? y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg() : oipsdeybqnVar.iwizpuwonk();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(iobyxmoadgVar.ppxfxbqfkf(), wkgbmnqykcVarRgvfuqvkyq, jEablkybsjg, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarGtknphoqwx, draadjrbmkVar2, 0, 3072, 57336);
            float f15 = 8;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f15)), draadjrbmkVar2, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewhVar, iobyxmoadgVar2, 1.0f, false, 2, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar3.gtknphoqwx(), draadjrbmkVar2, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarZoijcleaow);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq2 = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(6), 1, null);
            n nVarIobyxmoadg = y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVar2, i16).zoijcleaow().iobyxmoadg();
            draadjrbmkVar2.sopmlzcsov(444656673);
            long jIwizpuwonk = oipsdeybqnVar == null ? y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i16).iwizpuwonk() : oipsdeybqnVar.iwizpuwonk();
            draadjrbmkVar2.stevsuqkhv();
            m50.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar.eablkybsjg(), wkgbmnqykcVarRgvfuqvkyq2, jIwizpuwonk, 0L, null, null, null, 0L, null, null, 0, 0L, false, 0, 0, null, nVarIobyxmoadg, draadjrbmkVar2, 48, 0, 65528);
            draadjrbmkVar2.sopmlzcsov(444660491);
            if (z17) {
                gtknphoqwx(iobyxmoadgVar.iobyxmoadg(), draadjrbmkVar2, 0);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f15)), draadjrbmkVar2, 6);
            draadjrbmkVar2.sopmlzcsov(-54123049);
            if (z16) {
                ojitshcjhn(roivzttewhVar, z13, z14, draadjrbmkVar2, (i15 & 896) | (i15 & 112) | 6);
                uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f14)), draadjrbmkVar2, 6);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.kcexrzcfyt(iobyxmoadgVar, z13, z14, f13, rgvfuqvkyqVar, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0100  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    private static final void wflxmlrfwp(final List list, boolean z13, boolean z14, final rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        int i19;
        boolean z17;
        boolean z18;
        h hVarIobyxmoadg;
        Iterator it;
        int iZynmafqrjb;
        float fX;
        final boolean z19;
        int iZynmafqrjb2;
        a0 a0VarWflxmlrfwp;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1769548981);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i23 = i14 & 2;
        if (i23 == 0) {
            if ((i13 & 48) == 0) {
                z15 = z13;
                i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z16 = z14;
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z16)) {
                        i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i15 |= i17;
                }
                if ((i14 & 8) != 0) {
                    i15 |= 3072;
                } else if ((i13 & 3072) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                        i18 = 2048;
                    } else {
                        i18 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i18;
                }
                if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    i19 = 0;
                    if (i23 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
                    }
                    hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
                    it = list.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                    while (it.hasNext()) {
                        iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                        if (iZynmafqrjb < iZynmafqrjb2) {
                            iZynmafqrjb = iZynmafqrjb2;
                        }
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    for (Object obj : list) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            hg.jyumaefscl.iwizpuwonk();
                        }
                        c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar = (c52.vdvldrhtss.iobyxmoadg) obj;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                        if (i19 > 0) {
                            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        vdvldrhtss(iobyxmoadgVar, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                        i19 = i24;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    z19 = z18;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    z17 = z15;
                    z19 = z16;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final boolean z23 = z17;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.eablkybsjg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj2, Object obj3) {
                            return gtknphoqwx.agtfadlqog(list, z23, z19, rgvfuqvkyqVar, i13, i14, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i15 |= 384;
            z16 = z14;
            if ((i14 & 8) != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i18 = 2048;
                } else {
                    i18 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) == 1170) {
                i19 = 0;
                if (i23 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
                }
                hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
                it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                while (it.hasNext()) {
                    iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                    if (iZynmafqrjb < iZynmafqrjb2) {
                        iZynmafqrjb = iZynmafqrjb2;
                    }
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                while (r15.hasNext()) {
                    int i25 = i19 + 1;
                    if (i19 < 0) {
                        hg.jyumaefscl.iwizpuwonk();
                    }
                    c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar2 = (c52.vdvldrhtss.iobyxmoadg) obj;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                    if (i19 > 0) {
                        uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    vdvldrhtss(iobyxmoadgVar2, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                    i19 = i25;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                z19 = z18;
            } else {
                i19 = 0;
                if (i23 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
                }
                hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
                it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                while (it.hasNext()) {
                    iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                    if (iZynmafqrjb < iZynmafqrjb2) {
                        iZynmafqrjb = iZynmafqrjb2;
                    }
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                while (r15.hasNext()) {
                    int i26 = i19 + 1;
                    if (i19 < 0) {
                        hg.jyumaefscl.iwizpuwonk();
                    }
                    c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar3 = (c52.vdvldrhtss.iobyxmoadg) obj;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                    if (i19 > 0) {
                        uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    vdvldrhtss(iobyxmoadgVar3, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                    i19 = i26;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                z19 = z18;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z24 = z17;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.eablkybsjg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj2, Object obj3) {
                        return gtknphoqwx.agtfadlqog(list, z24, z19, rgvfuqvkyqVar, i13, i14, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        z15 = z13;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z16 = z14;
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z16)) {
                    i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i15 |= i17;
            }
            if ((i14 & 8) != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i18 = 2048;
                } else {
                    i18 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) == 1170) {
                i19 = 0;
                if (i23 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
                }
                hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
                it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                while (it.hasNext()) {
                    iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                    if (iZynmafqrjb < iZynmafqrjb2) {
                        iZynmafqrjb = iZynmafqrjb2;
                    }
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                while (r15.hasNext()) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        hg.jyumaefscl.iwizpuwonk();
                    }
                    c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar4 = (c52.vdvldrhtss.iobyxmoadg) obj;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                    if (i19 > 0) {
                        uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    vdvldrhtss(iobyxmoadgVar4, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                    i19 = i27;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                z19 = z18;
            } else {
                i19 = 0;
                if (i23 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
                }
                hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
                it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                while (it.hasNext()) {
                    iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                    if (iZynmafqrjb < iZynmafqrjb2) {
                        iZynmafqrjb = iZynmafqrjb2;
                    }
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                while (r15.hasNext()) {
                    int i28 = i19 + 1;
                    if (i19 < 0) {
                        hg.jyumaefscl.iwizpuwonk();
                    }
                    c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar5 = (c52.vdvldrhtss.iobyxmoadg) obj;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                    if (i19 > 0) {
                        uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    vdvldrhtss(iobyxmoadgVar5, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                    i19 = i28;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                z19 = z18;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z25 = z17;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.eablkybsjg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj2, Object obj3) {
                        return gtknphoqwx.agtfadlqog(list, z25, z19, rgvfuqvkyqVar, i13, i14, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        z16 = z14;
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                i18 = 2048;
            } else {
                i18 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 |= i18;
        }
        if ((i15 & 1171) == 1170) {
            i19 = 0;
            if (i23 != 0) {
                z17 = false;
            } else {
                z17 = z15;
            }
            if (i16 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
            }
            hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
            it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
            while (it.hasNext()) {
                iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                if (iZynmafqrjb < iZynmafqrjb2) {
                    iZynmafqrjb = iZynmafqrjb2;
                }
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            while (r15.hasNext()) {
                int i29 = i19 + 1;
                if (i19 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar6 = (c52.vdvldrhtss.iobyxmoadg) obj;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                if (i19 > 0) {
                    uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                vdvldrhtss(iobyxmoadgVar6, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                i19 = i29;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            z19 = z18;
        } else {
            i19 = 0;
            if (i23 != 0) {
                z17 = false;
            } else {
                z17 = z15;
            }
            if (i16 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1769548981, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelInfoBlock (SpecialBannerLoyaltyProgramCompose.kt:136)");
            }
            hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1930955358);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1930961545);
            it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            iZynmafqrjb = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
            while (it.hasNext()) {
                iZynmafqrjb2 = (int) (hVarIobyxmoadg.iobyxmoadg(((c52.vdvldrhtss.iobyxmoadg) it.next()).ppxfxbqfkf(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : y50.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().gtknphoqwx(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                if (iZynmafqrjb < iZynmafqrjb2) {
                    iZynmafqrjb = iZynmafqrjb2;
                }
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            fX = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).x(iZynmafqrjb);
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            while (r15.hasNext()) {
                int i210 = i19 + 1;
                if (i19 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                c52.vdvldrhtss.iobyxmoadg iobyxmoadgVar7 = (c52.vdvldrhtss.iobyxmoadg) obj;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1930952050);
                if (i19 > 0) {
                    uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(8)), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                vdvldrhtss(iobyxmoadgVar7, z17, z18, fX, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344));
                i19 = i210;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            z19 = z18;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final boolean z26 = z17;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return gtknphoqwx.agtfadlqog(list, z26, z19, rgvfuqvkyqVar, i13, i14, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(c52.vdvldrhtss.zoijcleaow zoijcleaowVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zdlpuopuiu(zoijcleaowVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void zdlpuopuiu(final c52.vdvldrhtss.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        float f13;
        boolean z13;
        draadjrbmk draadjrbmkVar2;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(519745915);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(519745915, i14, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.LevelProgressBlock (SpecialBannerLoyaltyProgramCompose.kt:265)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f14 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null);
            z zVar = z.f44180iobyxmoadg;
            int i15 = z.f44181zoijcleaow;
            float f15 = 8;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarAgtfadlqog = esjtqupxsv.agtfadlqog(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVarRgvfuqvkyq, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).wflxmlrfwp(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(f15))), w0.nufgyqmvbu.lqeggnwhkg(f14));
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarAgtfadlqog);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            if (zoijcleaowVar.iobyxmoadg() < zoijcleaowVar.zoijcleaow()) {
                z13 = true;
                f13 = 0.0f;
            } else {
                f13 = 0.0f;
                z13 = false;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, f13, 1, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), iobyxmoadgVar2.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-61685554);
            if (!z13) {
                t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_check, draadjrbmkVarBtonecajqb, 0), null, esjtqupxsv.agtfadlqog(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.vdvldrhtss(esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 11, null), w0.nufgyqmvbu.lqeggnwhkg(32)), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).eablkybsjg(), bfopjjpdmp.lqeggnwhkg.gxszxtbevo()), w0.nufgyqmvbu.lqeggnwhkg(f15)), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).yadqdtsiqt(), draadjrbmkVarBtonecajqb, 48, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            m50.ppxfxbqfkf.ppxfxbqfkf(zoijcleaowVar.ppxfxbqfkf(), null, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0, 0L, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i15).iobyxmoadg(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.sopmlzcsov(-144968159);
            if (z13) {
                jyumaefscl(vdvldrhtssVar, zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), draadjrbmkVar2, 6);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.yggfygwlhe(zoijcleaowVar, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01db  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    private static final void zynmafqrjb(final String str, final String str2, oipsdeybqn oipsdeybqnVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        oipsdeybqn oipsdeybqnVar2;
        oipsdeybqn oipsdeybqnVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        z zVar;
        int i16;
        long jIwizpuwonk;
        long jIwizpuwonk2;
        final oipsdeybqn oipsdeybqnVar4;
        a0 a0VarWflxmlrfwp;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(365444043);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str2) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                oipsdeybqnVar2 = oipsdeybqnVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(oipsdeybqnVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    oipsdeybqnVar3 = null;
                } else {
                    oipsdeybqnVar3 = oipsdeybqnVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(365444043, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.TitleWithDate (SpecialBannerLoyaltyProgramCompose.kt:107)");
                }
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                float f13 = 16;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null);
                zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewh.f26469iobyxmoadg, iobyxmoadgVar, 1.0f, false, 2, null);
                zVar = z.f44180iobyxmoadg;
                i16 = z.f44181zoijcleaow;
                n nVarLqeggnwhkg = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).lqeggnwhkg();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1606530310);
                if (oipsdeybqnVar3 == null) {
                    jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk();
                } else {
                    jIwizpuwonk = oipsdeybqnVar3.iwizpuwonk();
                }
                long j13 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i18 = i15;
                w6.btonecajqb(str, wkgbmnqykcVarZoijcleaow, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarLqeggnwhkg, draadjrbmkVarBtonecajqb, i15 & 14, 3072, 57336);
                uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f13)), draadjrbmkVarBtonecajqb, 6);
                n nVarIobyxmoadg = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).iobyxmoadg();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1606538406);
                if (oipsdeybqnVar3 == null) {
                    jIwizpuwonk2 = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).esjtqupxsv();
                } else {
                    jIwizpuwonk2 = oipsdeybqnVar3.iwizpuwonk();
                }
                long j14 = jIwizpuwonk2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                w6.btonecajqb(str2, null, j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarIobyxmoadg, draadjrbmkVarBtonecajqb, (i18 >> 3) & 14, 3072, 57338);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                oipsdeybqnVar4 = oipsdeybqnVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                oipsdeybqnVar4 = oipsdeybqnVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.wkgbmnqykc
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return gtknphoqwx.istkbnxepw(str, str2, oipsdeybqnVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        oipsdeybqnVar2 = oipsdeybqnVar;
        if ((i15 & 147) == 146) {
            if (i17 != 0) {
                oipsdeybqnVar3 = null;
            } else {
                oipsdeybqnVar3 = oipsdeybqnVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(365444043, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.TitleWithDate (SpecialBannerLoyaltyProgramCompose.kt:107)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f14 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq2 = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = tbqsvytpvh.zoijcleaow(roivzttewh.f26469iobyxmoadg, iobyxmoadgVar3, 1.0f, false, 2, null);
            zVar = z.f44180iobyxmoadg;
            i16 = z.f44181zoijcleaow;
            n nVarLqeggnwhkg2 = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).lqeggnwhkg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1606530310);
            if (oipsdeybqnVar3 == null) {
                jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk();
            } else {
                jIwizpuwonk = oipsdeybqnVar3.iwizpuwonk();
            }
            long j15 = jIwizpuwonk;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i19 = i15;
            w6.btonecajqb(str, wkgbmnqykcVarZoijcleaow2, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarLqeggnwhkg2, draadjrbmkVarBtonecajqb, i15 & 14, 3072, 57336);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f14)), draadjrbmkVarBtonecajqb, 6);
            n nVarIobyxmoadg2 = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).iobyxmoadg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1606538406);
            if (oipsdeybqnVar3 == null) {
                jIwizpuwonk2 = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).esjtqupxsv();
            } else {
                jIwizpuwonk2 = oipsdeybqnVar3.iwizpuwonk();
            }
            long j16 = jIwizpuwonk2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            w6.btonecajqb(str2, null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarIobyxmoadg2, draadjrbmkVarBtonecajqb, (i19 >> 3) & 14, 3072, 57338);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            oipsdeybqnVar4 = oipsdeybqnVar3;
        } else {
            if (i17 != 0) {
                oipsdeybqnVar3 = null;
            } else {
                oipsdeybqnVar3 = oipsdeybqnVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(365444043, i15, -1, "ru.myspar.specialbanner.impl.presentation.loyalty_program.compose.TitleWithDate (SpecialBannerLoyaltyProgramCompose.kt:107)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar5 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f15 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq3 = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar5, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 2, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar6 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar6.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow3, iobyxmoadgVar6.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar6.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar6.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar6.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = tbqsvytpvh.zoijcleaow(roivzttewh.f26469iobyxmoadg, iobyxmoadgVar5, 1.0f, false, 2, null);
            zVar = z.f44180iobyxmoadg;
            i16 = z.f44181zoijcleaow;
            n nVarLqeggnwhkg3 = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).lqeggnwhkg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1606530310);
            if (oipsdeybqnVar3 == null) {
                jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk();
            } else {
                jIwizpuwonk = oipsdeybqnVar3.iwizpuwonk();
            }
            long j17 = jIwizpuwonk;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i110 = i15;
            w6.btonecajqb(str, wkgbmnqykcVarZoijcleaow3, j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarLqeggnwhkg3, draadjrbmkVarBtonecajqb, i15 & 14, 3072, 57336);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar5, w0.nufgyqmvbu.lqeggnwhkg(f15)), draadjrbmkVarBtonecajqb, 6);
            n nVarIobyxmoadg3 = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).iobyxmoadg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1606538406);
            if (oipsdeybqnVar3 == null) {
                jIwizpuwonk2 = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).esjtqupxsv();
            } else {
                jIwizpuwonk2 = oipsdeybqnVar3.iwizpuwonk();
            }
            long j18 = jIwizpuwonk2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            w6.btonecajqb(str2, null, j18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVarIobyxmoadg3, draadjrbmkVarBtonecajqb, (i110 >> 3) & 14, 3072, 57338);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            oipsdeybqnVar4 = oipsdeybqnVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: w52.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.istkbnxepw(str, str2, oipsdeybqnVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
