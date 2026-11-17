package krqnebusok;

import androidx.compose.runtime.jztzpxfvev;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f60476iobyxmoadg = new ArrayList();

    private final boolean eablkybsjg(jztzpxfvev jztzpxfvevVar) {
        String strLqeggnwhkg = jztzpxfvevVar.lqeggnwhkg();
        return strLqeggnwhkg != null && mj.kcexrzcfyt.stevsuqkhv(strLqeggnwhkg, "C", false, 2, null);
    }

    private final void iobyxmoadg(jztzpxfvev jztzpxfvevVar, Object obj) {
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaow(jztzpxfvevVar, obj);
        if (ppxfxbqfkfVarZoijcleaow != null) {
            this.f60476iobyxmoadg.add(ppxfxbqfkfVarZoijcleaow);
        }
    }

    private final jztzpxfvev nufgyqmvbu(Object obj) {
        if (obj instanceof androidx.compose.runtime.zoijcleaow) {
            return lqeggnwhkg((androidx.compose.runtime.zoijcleaow) obj);
        }
        if (obj instanceof jztzpxfvev) {
            return (jztzpxfvev) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    private final boolean ppxfxbqfkf(jztzpxfvev jztzpxfvevVar, Object obj) {
        ArrayList arrayListEablkybsjg = jztzpxfvevVar.eablkybsjg();
        boolean z13 = false;
        if (arrayListEablkybsjg == null) {
            if (!jztzpxfvevVar.zoijcleaow()) {
                iobyxmoadg(jztzpxfvevVar, null);
                return true;
            }
            int iWkgbmnqykc = jztzpxfvevVar.wkgbmnqykc();
            int iPpxfxbqfkf = jztzpxfvevVar.ppxfxbqfkf();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iWkgbmnqykc <= iIntValue && iIntValue < iPpxfxbqfkf) || (iWkgbmnqykc == iPpxfxbqfkf && (obj instanceof Integer) && iWkgbmnqykc == number.intValue())) {
                    z13 = true;
                }
                if (z13) {
                    iobyxmoadg(jztzpxfvevVar, null);
                }
            }
            return z13;
        }
        int size = arrayListEablkybsjg.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj2 = arrayListEablkybsjg.get(i13);
            if (obj2 instanceof androidx.compose.runtime.zoijcleaow) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, obj)) {
                    iobyxmoadg(jztzpxfvevVar, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof jztzpxfvev)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (ppxfxbqfkf((jztzpxfvev) obj2, obj)) {
                    iobyxmoadg(jztzpxfvevVar, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    private final ppxfxbqfkf zoijcleaow(jztzpxfvev jztzpxfvevVar, Object obj) {
        String strLqeggnwhkg = jztzpxfvevVar.lqeggnwhkg();
        jyumaefscl jyumaefsclVarEablkybsjg = strLqeggnwhkg != null ? iwizpuwonk.eablkybsjg(strLqeggnwhkg) : null;
        if (jyumaefsclVarEablkybsjg == null) {
            return null;
        }
        if (obj == null) {
            return new ppxfxbqfkf(jyumaefsclVarEablkybsjg, null);
        }
        ArrayList arrayListEablkybsjg = jztzpxfvevVar.eablkybsjg();
        if (arrayListEablkybsjg != null) {
            int size = arrayListEablkybsjg.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj2 = arrayListEablkybsjg.get(i13);
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, obj)) {
                    break;
                }
                nufgyqmvbu(obj2);
            }
        }
        return new ppxfxbqfkf(jyumaefsclVarEablkybsjg, 0);
    }

    public final List dxjokdxxww() {
        return this.f60476iobyxmoadg;
    }

    public final void gxszxtbevo(jztzpxfvev jztzpxfvevVar, Object obj) {
    }

    public abstract jztzpxfvev lqeggnwhkg(androidx.compose.runtime.zoijcleaow zoijcleaowVar);

    public abstract int wkgbmnqykc(androidx.compose.runtime.zoijcleaow zoijcleaowVar);
}
