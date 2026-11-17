package m31;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import b31.wflxmlrfwp;
import bfopjjpdmp.lqeggnwhkg;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import e0.gxszxtbevo;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.pmvmpeiblj;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import metgxyhuhe.gtknphoqwx;
import tg.rgvfuqvkyq;
import w31.nufgyqmvbu;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f65078yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f65079zdlpuopuiu;

        iobyxmoadg(vdvldrhtss vdvldrhtssVar, String str) {
            this.f65079zdlpuopuiu = vdvldrhtssVar;
            this.f65078yggfygwlhe = str;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(541084981, i13, -1, "ru.myspar.proloyalty.core.ui.compose.components.gender_selector.GenderCard.<anonymous> (GenderSelector.kt:91)");
            }
            w6.btonecajqb(this.f65078yggfygwlhe, nufgyqmvbu.ojitshcjhn(esjtqupxsv.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16), w0.nufgyqmvbu.lqeggnwhkg(10)), "genderTypeText", null, null, false, 14, null), ((oipsdeybqn) this.f65079zdlpuopuiu.nufgyqmvbu()).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVar, z.f44181zoijcleaow).zoijcleaow(), draadjrbmkVar, 0, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(lr0.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, draadjrbmk draadjrbmkVar2, int i15) {
        lqeggnwhkg(zoijcleaowVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(lr0.zoijcleaow.FEMALE);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final lr0.zoijcleaow gender, final boolean z13, final tg.iobyxmoadg onClick, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        vdvldrhtss vdvldrhtssVarIobyxmoadg;
        String strPpxfxbqfkf;
        draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1957395218);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(gender) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1957395218, i14, -1, "ru.myspar.proloyalty.core.ui.compose.components.gender_selector.GenderCard (GenderSelector.kt:66)");
            }
            if (z13) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-746436832);
                z zVar = z.f44180iobyxmoadg;
                int i15 = z.f44181zoijcleaow;
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(oipsdeybqn.dxjokdxxww(zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i15).btonecajqb()), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).yadqdtsiqt()));
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-746340360);
                z zVar2 = z.f44180iobyxmoadg;
                int i16 = z.f44181zoijcleaow;
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i16).gtknphoqwx()), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i16).iwizpuwonk()));
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            vdvldrhtss vdvldrhtssVar = vdvldrhtssVarIobyxmoadg;
            if (gender == lr0.zoijcleaow.MALE) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-746193420);
                strPpxfxbqfkf = gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_male_gender_russian, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-746116974);
                strPpxfxbqfkf = gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_female_gender_russian, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            String str = strPpxfxbqfkf;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(1638506318);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            pmvmpeiblj.iobyxmoadg(nufgyqmvbu.ojitshcjhn(androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar, (metgxyhuhe.draadjrbmk) objYadqdtsiqt, null, false, null, null, onClick, 28, null), "btnGenderType", null, null, false, 14, null), lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(12)), ((oipsdeybqn) vdvldrhtssVar.lqeggnwhkg()).iwizpuwonk(), 0L, null, w0.nufgyqmvbu.lqeggnwhkg(2), ezmngbhpjk.nufgyqmvbu.eablkybsjg(541084981, true, new iobyxmoadg(vdvldrhtssVar, str), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar2, 1769472, 24);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: m31.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.gxszxtbevo(gender, z13, onClick, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(lr0.zoijcleaow zoijcleaowVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        eablkybsjg(zoijcleaowVar, z13, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void lqeggnwhkg(lr0.zoijcleaow zoijcleaowVar, final tg.draadjrbmk onGenderClick, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        lr0.zoijcleaow zoijcleaowVar2;
        int i15;
        draadjrbmk draadjrbmkVar2;
        final lr0.zoijcleaow zoijcleaowVar3;
        zdlpuopuiu.btonecajqb(onGenderClick, "onGenderClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1203080120);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            zoijcleaowVar2 = zoijcleaowVar;
        } else if ((i13 & 6) == 0) {
            zoijcleaowVar2 = zoijcleaowVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVar2) ? 4 : 2) | i13;
        } else {
            zoijcleaowVar2 = zoijcleaowVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onGenderClick) ? 32 : 16;
        }
        int i17 = i15;
        if ((i17 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            zoijcleaowVar3 = zoijcleaowVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            lr0.zoijcleaow zoijcleaowVar4 = i16 != 0 ? lr0.zoijcleaow.NONE : zoijcleaowVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1203080120, i17, -1, "ru.myspar.proloyalty.core.ui.compose.components.gender_selector.GenderSelector (GenderSelector.kt:36)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = nufgyqmvbu.ojitshcjhn(iobyxmoadgVar, "gender_block_title", null, null, false, 14, null);
            String strPpxfxbqfkf = gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_gender_required, draadjrbmkVarBtonecajqb, 0);
            z zVar = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            lr0.zoijcleaow zoijcleaowVar5 = zoijcleaowVar4;
            w6.btonecajqb(strPpxfxbqfkf, wkgbmnqykcVarOjitshcjhn, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).btonecajqb(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVar2, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(2), 0.0f, 0.0f, 0.0f, 14, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(10)), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVar2, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarOxmwwwfdhm);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            lr0.zoijcleaow zoijcleaowVar6 = lr0.zoijcleaow.MALE;
            zoijcleaowVar3 = zoijcleaowVar5;
            boolean z13 = zoijcleaowVar3 == zoijcleaowVar6;
            draadjrbmkVar2.sopmlzcsov(-165335661);
            int i19 = i17 & 112;
            boolean z14 = i19 == 32;
            Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
            if (z14 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: m31.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return eablkybsjg.nufgyqmvbu(onGenderClick);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar2.stevsuqkhv();
            eablkybsjg(zoijcleaowVar6, z13, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar2, 6);
            lr0.zoijcleaow zoijcleaowVar7 = lr0.zoijcleaow.FEMALE;
            boolean z15 = zoijcleaowVar3 == zoijcleaowVar7;
            draadjrbmkVar2.sopmlzcsov(-165329995);
            boolean z16 = i19 == 32;
            Object objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
            if (z16 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: m31.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return eablkybsjg.dxjokdxxww(onGenderClick);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar2.stevsuqkhv();
            eablkybsjg(zoijcleaowVar7, z15, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVar2, 6);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: m31.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.btonecajqb(zoijcleaowVar3, onGenderClick, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(lr0.zoijcleaow.MALE);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
