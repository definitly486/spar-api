package bs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class draadjrbmk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, rgvfuqvkyq.zoijcleaow zoijcleaowVar, long j13, ydmasvzmpa ydmasvzmpaVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, zoijcleaowVar, j13, ydmasvzmpaVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final rgvfuqvkyq.zoijcleaow model, long j13, final ydmasvzmpa paddings, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        long jYggfygwlhe;
        long j14;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final long j15;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(paddings, "paddings");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1042879961);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            jYggfygwlhe = j13;
            i15 |= ((i14 & 4) == 0 && draadjrbmkVarBtonecajqb.wkgbmnqykc(jYggfygwlhe)) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            jYggfygwlhe = j13;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(paddings) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            j15 = jYggfygwlhe;
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) == 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
                if ((i14 & 4) != 0) {
                    jYggfygwlhe = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yggfygwlhe();
                    i15 &= -897;
                }
                j14 = jYggfygwlhe;
                wkgbmnqykcVar3 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                j14 = jYggfygwlhe;
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1042879961, i15, -1, "ru.myspar.proloyalty.common.view.addressbar.MySparAddressBarShimmer (MySparAddressBarShimmer.kt:38)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.draadjrbmk(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.eablkybsjg.iobyxmoadg(cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16))), j14, null, 2, null), paddings), "mySparAddressBarRoot", null, null, false, 14, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), ppxfxbqfkfVarDxjokdxxww, draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn);
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
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f13 = 40;
            s31.lqeggnwhkg.zoijcleaow(bfopjjpdmp.lqeggnwhkg.gxszxtbevo(), w31.nufgyqmvbu.ojitshcjhn(s31.draadjrbmk.ppxfxbqfkf(cdpycssgdh.vdvldrhtss(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f13)), null, 1, null), "mySparAddressBarTitleIcon", null, null, false, 14, null), 0L, draadjrbmkVarBtonecajqb, 0, 4);
            float f14 = 8;
            t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewhVar, cdpycssgdh.dxjokdxxww(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(f13)), 1.0f, false, 2, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.gxszxtbevo(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 6);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            float f15 = 20;
            float f16 = 24;
            s31.lqeggnwhkg.zoijcleaow(bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(f16)), s31.draadjrbmk.ppxfxbqfkf(w31.nufgyqmvbu.ojitshcjhn(cdpycssgdh.yggfygwlhe(cdpycssgdh.dxjokdxxww(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f15)), w0.nufgyqmvbu.lqeggnwhkg(114)), "mySparAddressBarTitle", null, null, false, 14, null), null, 1, null), 0L, draadjrbmkVarBtonecajqb, 0, 4);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
            s31.lqeggnwhkg.zoijcleaow(bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(f16)), s31.draadjrbmk.ppxfxbqfkf(w31.nufgyqmvbu.ojitshcjhn(cdpycssgdh.yggfygwlhe(cdpycssgdh.dxjokdxxww(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(14)), w0.nufgyqmvbu.lqeggnwhkg(50)), "mySparAddressBarDescription", null, null, false, 14, null), null, 1, null), 0L, draadjrbmkVarBtonecajqb, 0, 4);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            draadjrbmkVarBtonecajqb.sopmlzcsov(552825365);
            if (model.iobyxmoadg()) {
                t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, 6);
                s31.lqeggnwhkg.zoijcleaow(bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(f16)), s31.draadjrbmk.ppxfxbqfkf(w31.nufgyqmvbu.ojitshcjhn(cdpycssgdh.yggfygwlhe(cdpycssgdh.dxjokdxxww(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f15)), w0.nufgyqmvbu.lqeggnwhkg(60)), "mySparAddressBarDeliveryPrice", null, null, false, 14, null), null, 1, null), 0L, draadjrbmkVarBtonecajqb, 0, 4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            j15 = j14;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bs0.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return draadjrbmk.ppxfxbqfkf(wkgbmnqykcVar3, model, j15, paddings, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
