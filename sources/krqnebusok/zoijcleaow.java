package krqnebusok;

import androidx.compose.runtime.d0;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h0;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.hcddaimhww;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final Integer eablkybsjg(e0 e0Var, androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        d0 d0VarJyumaefscl = e0Var.jyumaefscl();
        try {
            return gxszxtbevo(d0VarJyumaefscl, cqumvgiudrVar, 0, d0VarJyumaefscl.cqumvgiudr());
        } finally {
            d0VarJyumaefscl.wkgbmnqykc();
        }
    }

    private static final Integer gxszxtbevo(d0 d0Var, androidx.compose.runtime.cqumvgiudr cqumvgiudrVar, int i13, int i14) {
        Integer numGxszxtbevo;
        while (true) {
            if (i13 >= i14) {
                return null;
            }
            int iIozdgvuglv = d0Var.iozdgvuglv(i13) + i13;
            if (d0Var.lmojexxdyd(i13) && d0Var.cdpycssgdh(i13) == 206 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(d0Var.yadqdtsiqt(i13), androidx.compose.runtime.jyumaefscl.wwaezpbzkn())) {
                Object objIstkbnxepw = d0Var.istkbnxepw(i13, 0);
                androidx.compose.runtime.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = objIstkbnxepw instanceof androidx.compose.runtime.oxmwwwfdhm.iobyxmoadg ? (androidx.compose.runtime.oxmwwwfdhm.iobyxmoadg) objIstkbnxepw : null;
                if (iobyxmoadgVar != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), cqumvgiudrVar)) {
                    return Integer.valueOf(i13);
                }
            }
            if (d0Var.eablkybsjg(i13) && (numGxszxtbevo = gxszxtbevo(d0Var, cqumvgiudrVar, i13 + 1, iIozdgvuglv)) != null) {
                return Integer.valueOf(numGxszxtbevo.intValue());
            }
            i13 = iIozdgvuglv;
        }
    }

    public static final List iobyxmoadg(d0 d0Var) {
        if (d0Var.dxjokdxxww() || d0Var.cqumvgiudr() == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(d0Var);
        int iYggfygwlhe = d0Var.yggfygwlhe();
        Object objValueOf = Integer.valueOf(d0Var.esjtqupxsv());
        while (iYggfygwlhe >= 0) {
            zdlpuopuiuVar.gxszxtbevo(d0Var.lereixgezr().lereixgezr(iYggfygwlhe), objValueOf);
            objValueOf = d0Var.iobyxmoadg(iYggfygwlhe);
            iYggfygwlhe = d0Var.stevsuqkhv(iYggfygwlhe);
        }
        return zdlpuopuiuVar.dxjokdxxww();
    }

    public static final List lqeggnwhkg(d0 d0Var, int i13, Object obj) {
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(d0Var);
        i13 = d0Var.stevsuqkhv(i13);
        androidx.compose.runtime.zoijcleaow zoijcleaowVarIobyxmoadg = d0Var.iobyxmoadg(i13);
        while (i13 >= 0) {
            zdlpuopuiuVar.gxszxtbevo(d0Var.lereixgezr().lereixgezr(i13), obj);
            if (i13 >= 0) {
                androidx.compose.runtime.zoijcleaow zoijcleaowVar = zoijcleaowVarIobyxmoadg;
                zoijcleaowVarIobyxmoadg = d0Var.iobyxmoadg(i13);
                i13 = d0Var.stevsuqkhv(i13);
                obj = zoijcleaowVar;
            } else {
                obj = zoijcleaowVarIobyxmoadg;
            }
        }
        return zdlpuopuiuVar.dxjokdxxww();
    }

    public static /* synthetic */ List ppxfxbqfkf(h0 h0Var, Object obj, int i13, Integer num, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        if ((i14 & 2) != 0) {
            i13 = h0Var.ribwqtqdhb();
        }
        if ((i14 & 4) != 0) {
            num = null;
        }
        return zoijcleaow(h0Var, obj, i13, num);
    }

    public static final rgvfuqvkyq wkgbmnqykc(e0 e0Var, tg.draadjrbmk draadjrbmkVar) {
        d0 d0VarJyumaefscl = e0Var.jyumaefscl();
        try {
            hcddaimhww hcddaimhwwVar = new hcddaimhww();
            while (hcddaimhwwVar.f60014zdlpuopuiu < e0Var.wflxmlrfwp()) {
                if (d0VarJyumaefscl.hcddaimhww(hcddaimhwwVar.f60014zdlpuopuiu) && ((Boolean) draadjrbmkVar.invoke(d0VarJyumaefscl.hkdspvbjdz(hcddaimhwwVar.f60014zdlpuopuiu))).booleanValue()) {
                    rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(hcddaimhwwVar.f60014zdlpuopuiu, null);
                    d0VarJyumaefscl.wkgbmnqykc();
                    return rgvfuqvkyqVar;
                }
                int iUlzqkzuiru = d0VarJyumaefscl.ulzqkzuiru(hcddaimhwwVar.f60014zdlpuopuiu);
                for (int i13 = 0; i13 < iUlzqkzuiru; i13++) {
                    if (((Boolean) draadjrbmkVar.invoke(d0VarJyumaefscl.istkbnxepw(hcddaimhwwVar.f60014zdlpuopuiu, i13))).booleanValue()) {
                        rgvfuqvkyq rgvfuqvkyqVar2 = new rgvfuqvkyq(hcddaimhwwVar.f60014zdlpuopuiu, Integer.valueOf(i13));
                        d0VarJyumaefscl.wkgbmnqykc();
                        return rgvfuqvkyqVar2;
                    }
                }
                hcddaimhwwVar.f60014zdlpuopuiu++;
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            d0VarJyumaefscl.wkgbmnqykc();
            return null;
        } catch (Throwable th2) {
            d0VarJyumaefscl.wkgbmnqykc();
            throw th2;
        }
    }

    public static final List zoijcleaow(h0 h0Var, Object obj, int i13, Integer num) {
        int iSkhdrjzrfn;
        if (h0Var.jlmebxxoox() || h0Var.jhduphickx() == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        cqumvgiudr cqumvgiudrVar = new cqumvgiudr(h0Var);
        if (num != null) {
            iSkhdrjzrfn = num.intValue();
        } else {
            iSkhdrjzrfn = h0Var.vipkmwdibw() < 0 ? h0Var.skhdrjzrfn(i13) : h0Var.vipkmwdibw();
        }
        if (obj == null) {
            obj = Integer.valueOf(h0Var.czzsidtyhn(i13));
        }
        while (i13 >= 0) {
            cqumvgiudrVar.gxszxtbevo(h0Var.g(i13), obj);
            obj = h0Var.zynmafqrjb(i13);
            if (iSkhdrjzrfn >= 0) {
                int i14 = iSkhdrjzrfn;
                iSkhdrjzrfn = h0Var.skhdrjzrfn(iSkhdrjzrfn);
                i13 = i14;
            } else {
                i13 = iSkhdrjzrfn;
            }
        }
        return cqumvgiudrVar.dxjokdxxww();
    }
}
