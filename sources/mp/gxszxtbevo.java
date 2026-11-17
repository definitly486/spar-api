package mp;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.m1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import igdgnonuha.cdpycssgdh;
import igdgnonuha.istkbnxepw;
import igdgnonuha.pkzmftpjix;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.f;
import j0.jrbgnlbqoe;
import j0.n;
import jztzpxfvev.nuxfzjnpeb;
import kotlin.jvm.internal.zdlpuopuiu;
import t.tzroggbefp;
import t.ylkuphrtab;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    static final class iobyxmoadg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f67741iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f67742ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ j0.eablkybsjg f67743zoijcleaow;

        iobyxmoadg(iwxlajgraz iwxlajgrazVar, j0.eablkybsjg eablkybsjgVar, tg.iobyxmoadg iobyxmoadgVar) {
            this.f67741iobyxmoadg = iwxlajgrazVar;
            this.f67743zoijcleaow = eablkybsjgVar;
            this.f67742ppxfxbqfkf = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn zoijcleaow(iwxlajgraz iwxlajgrazVar, j0.eablkybsjg eablkybsjgVar, tg.iobyxmoadg iobyxmoadgVar, g.eablkybsjg eablkybsjgVar2) {
            f fVarDxjokdxxww = gxszxtbevo.dxjokdxxww(iwxlajgrazVar);
            if (fVarDxjokdxxww != null) {
                int iCqumvgiudr = fVarDxjokdxxww.cqumvgiudr(eablkybsjgVar2.zdlpuopuiu());
                if (((j0.eablkybsjg.wkgbmnqykc) jyumaefscl.weqkydbzbr(eablkybsjgVar.dxjokdxxww("PRIVACY", iCqumvgiudr, iCqumvgiudr))) != null) {
                    iobyxmoadgVar.invoke();
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            final iwxlajgraz iwxlajgrazVar = this.f67741iobyxmoadg;
            final j0.eablkybsjg eablkybsjgVar = this.f67743zoijcleaow;
            final tg.iobyxmoadg iobyxmoadgVar = this.f67742ppxfxbqfkf;
            Object objGtknphoqwx = nuxfzjnpeb.gtknphoqwx(ylkuphrtabVar, null, null, null, new tg.draadjrbmk() { // from class: mp.eablkybsjg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return gxszxtbevo.iobyxmoadg.zoijcleaow(iwxlajgrazVar, eablkybsjgVar, iobyxmoadgVar, (g.eablkybsjg) obj);
                }
            }, gxszxtbevoVar, 7, null);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    private static final void btonecajqb(iwxlajgraz iwxlajgrazVar, f fVar) {
        iwxlajgrazVar.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        nufgyqmvbu(iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f dxjokdxxww(iwxlajgraz iwxlajgrazVar) {
        return (f) iwxlajgrazVar.getValue();
    }

    public static final void eablkybsjg(final boolean z13, final boolean z14, final tg.draadjrbmk onCheckedChanged, final tg.iobyxmoadg onPrivacyClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(onCheckedChanged, "onCheckedChanged");
        zdlpuopuiu.btonecajqb(onPrivacyClick, "onPrivacyClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1009252209);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onCheckedChanged) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onPrivacyClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i14;
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1009252209, i15, -1, "ru.myspar.auth.impl.presentation.authorization.compose.components.AuthCheckbox (AuthCheckbox.kt:40)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
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
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), iobyxmoadgVar2.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
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
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar, "cbAgreement", null, null, false, 14, null);
            cdpycssgdh cdpycssgdhVar = cdpycssgdh.f42714iobyxmoadg;
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            istkbnxepw istkbnxepwVarIobyxmoadg = cdpycssgdhVar.iobyxmoadg(zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i16).btonecajqb(), zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i16).btonecajqb(), 0L, 0L, 0L, draadjrbmkVarBtonecajqb, cdpycssgdh.f42715zoijcleaow << 15, 28);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1971223803);
            boolean z15 = (i15 & 896) == 256;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: mp.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.gxszxtbevo(onCheckedChanged, ((Boolean) obj).booleanValue());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            pkzmftpjix.gxszxtbevo(z13, (tg.draadjrbmk) objYadqdtsiqt, wkgbmnqykcVarPmvmpeiblj, false, null, istkbnxepwVarIobyxmoadg, draadjrbmkVarBtonecajqb, i15 & 14, 24);
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg3);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg3 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow3 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg3.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg3.yadqdtsiqt(), Integer.valueOf(iHashCode3))) {
                draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            nufgyqmvbu(onPrivacyClick, null, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14, 2);
            ribwqtqdhb.ppxfxbqfkf.wkgbmnqykc(vdvldrhtssVar, z14, null, null, null, null, dxjokdxxww.f67733iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, 1572870 | (i15 & 112), 30);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: mp.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.lqeggnwhkg(z13, z14, onCheckedChanged, onPrivacyClick, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(iwxlajgraz iwxlajgrazVar, f it) {
        zdlpuopuiu.btonecajqb(it, "it");
        btonecajqb(iwxlajgrazVar, it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, boolean z13) {
        draadjrbmkVar.invoke(Boolean.valueOf(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(boolean z13, boolean z14, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        eablkybsjg(z13, z14, draadjrbmkVar, iobyxmoadgVar, draadjrbmkVar2, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    private static final void nufgyqmvbu(final tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        long jBtonecajqb;
        String strPpxfxbqfkf;
        String strPpxfxbqfkf2;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar2;
        j0.eablkybsjg eablkybsjgVar;
        Object objYadqdtsiqt2;
        final iwxlajgraz iwxlajgrazVar;
        boolean z13;
        Object objYadqdtsiqt3;
        Object objYadqdtsiqt4;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        j0.eablkybsjg.zoijcleaow zoijcleaowVar;
        int iZdlpuopuiu;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1518395193);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1518395193, i15, -1, "ru.myspar.auth.impl.presentation.authorization.compose.components.PrivacyAgreementText (AuthCheckbox.kt:74)");
                }
                z zVar = z.f44180iobyxmoadg;
                int i17 = z.f44181zoijcleaow;
                jBtonecajqb = zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).btonecajqb();
                strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(uo.wkgbmnqykc.authorization_legal_info_text, draadjrbmkVarBtonecajqb, 0);
                strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(uo.wkgbmnqykc.authorization_legal_info_clickable_text, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1733907146);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar2.iobyxmoadg()) {
                    zoijcleaowVar = new j0.eablkybsjg.zoijcleaow(0, 1, null);
                    zoijcleaowVar.gtknphoqwx(strPpxfxbqfkf);
                    zoijcleaowVar.gtknphoqwx(" ");
                    zoijcleaowVar.oxmwwwfdhm("PRIVACY", "privacy");
                    iZdlpuopuiu = zoijcleaowVar.zdlpuopuiu(new jrbgnlbqoe(jBtonecajqb, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    try {
                        zoijcleaowVar.gtknphoqwx(strPpxfxbqfkf2);
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu);
                        zoijcleaowVar.ojitshcjhn();
                        objYadqdtsiqt = zoijcleaowVar.yggfygwlhe();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } catch (Throwable th2) {
                        zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu);
                        throw th2;
                    }
                }
                eablkybsjgVar = (j0.eablkybsjg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1733896249);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt2 = c1.ppxfxbqfkf(null, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1733890835);
                z13 = (i15 & 14) == 4;
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt3 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt3 = new iobyxmoadg(iwxlajgrazVar, eablkybsjgVar, iobyxmoadgVar);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = tzroggbefp.ppxfxbqfkf(wkgbmnqykcVar3, wwaezpbzknVar2, (PointerInputEventHandler) objYadqdtsiqt3);
                n nVarZoijcleaow = u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).iobyxmoadg());
                long jEsjtqupxsv = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1733873336);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: mp.ppxfxbqfkf
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gxszxtbevo.gtknphoqwx(iwxlajgrazVar, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.gtknphoqwx(eablkybsjgVar, wkgbmnqykcVarPpxfxbqfkf, jEsjtqupxsv, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, draadjrbmkVar3, nVarZoijcleaow, draadjrbmkVar2, 6, 1572864, 65528);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: mp.wkgbmnqykc
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return gxszxtbevo.draadjrbmk(iobyxmoadgVar, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 19) == 18) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1518395193, i15, -1, "ru.myspar.auth.impl.presentation.authorization.compose.components.PrivacyAgreementText (AuthCheckbox.kt:74)");
            }
            z zVar2 = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            jBtonecajqb = zVar2.iobyxmoadg(draadjrbmkVarBtonecajqb, i18).btonecajqb();
            strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(uo.wkgbmnqykc.authorization_legal_info_text, draadjrbmkVarBtonecajqb, 0);
            strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(uo.wkgbmnqykc.authorization_legal_info_clickable_text, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733907146);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar2.iobyxmoadg()) {
                zoijcleaowVar = new j0.eablkybsjg.zoijcleaow(0, 1, null);
                zoijcleaowVar.gtknphoqwx(strPpxfxbqfkf);
                zoijcleaowVar.gtknphoqwx(" ");
                zoijcleaowVar.oxmwwwfdhm("PRIVACY", "privacy");
                iZdlpuopuiu = zoijcleaowVar.zdlpuopuiu(new jrbgnlbqoe(jBtonecajqb, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                zoijcleaowVar.gtknphoqwx(strPpxfxbqfkf2);
                wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu);
                zoijcleaowVar.ojitshcjhn();
                objYadqdtsiqt = zoijcleaowVar.yggfygwlhe();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            eablkybsjgVar = (j0.eablkybsjg) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733896249);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(null, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733890835);
            if ((i15 & 14) == 4) {
            }
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt3 = new iobyxmoadg(iwxlajgrazVar, eablkybsjgVar, iobyxmoadgVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new iobyxmoadg(iwxlajgrazVar, eablkybsjgVar, iobyxmoadgVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = tzroggbefp.ppxfxbqfkf(wkgbmnqykcVar3, wwaezpbzknVar4, (PointerInputEventHandler) objYadqdtsiqt3);
            n nVarZoijcleaow2 = u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i18).iobyxmoadg());
            long jEsjtqupxsv2 = y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i18).esjtqupxsv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733873336);
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: mp.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.gtknphoqwx(iwxlajgrazVar, (f) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt4;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.gtknphoqwx(eablkybsjgVar, wkgbmnqykcVarPpxfxbqfkf2, jEsjtqupxsv2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, draadjrbmkVar4, nVarZoijcleaow2, draadjrbmkVar2, 6, 1572864, 65528);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar5;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1518395193, i15, -1, "ru.myspar.auth.impl.presentation.authorization.compose.components.PrivacyAgreementText (AuthCheckbox.kt:74)");
            }
            z zVar3 = z.f44180iobyxmoadg;
            int i19 = z.f44181zoijcleaow;
            jBtonecajqb = zVar3.iobyxmoadg(draadjrbmkVarBtonecajqb, i19).btonecajqb();
            strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(uo.wkgbmnqykc.authorization_legal_info_text, draadjrbmkVarBtonecajqb, 0);
            strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(uo.wkgbmnqykc.authorization_legal_info_clickable_text, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733907146);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar2.iobyxmoadg()) {
                zoijcleaowVar = new j0.eablkybsjg.zoijcleaow(0, 1, null);
                zoijcleaowVar.gtknphoqwx(strPpxfxbqfkf);
                zoijcleaowVar.gtknphoqwx(" ");
                zoijcleaowVar.oxmwwwfdhm("PRIVACY", "privacy");
                iZdlpuopuiu = zoijcleaowVar.zdlpuopuiu(new jrbgnlbqoe(jBtonecajqb, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                zoijcleaowVar.gtknphoqwx(strPpxfxbqfkf2);
                wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaowVar.rgvfuqvkyq(iZdlpuopuiu);
                zoijcleaowVar.ojitshcjhn();
                objYadqdtsiqt = zoijcleaowVar.yggfygwlhe();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            eablkybsjgVar = (j0.eablkybsjg) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733896249);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(null, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733890835);
            if ((i15 & 14) == 4) {
            }
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt3 = new iobyxmoadg(iwxlajgrazVar, eablkybsjgVar, iobyxmoadgVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new iobyxmoadg(iwxlajgrazVar, eablkybsjgVar, iobyxmoadgVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = tzroggbefp.ppxfxbqfkf(wkgbmnqykcVar3, wwaezpbzknVar6, (PointerInputEventHandler) objYadqdtsiqt3);
            n nVarZoijcleaow3 = u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i19).iobyxmoadg());
            long jEsjtqupxsv3 = y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i19).esjtqupxsv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1733873336);
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: mp.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.gtknphoqwx(iwxlajgrazVar, (f) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            tg.draadjrbmk draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt4;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.gtknphoqwx(eablkybsjgVar, wkgbmnqykcVarPpxfxbqfkf3, jEsjtqupxsv3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, draadjrbmkVar5, nVarZoijcleaow3, draadjrbmkVar2, 6, 1572864, 65528);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar6;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: mp.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.draadjrbmk(iobyxmoadgVar, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
