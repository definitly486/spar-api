package k5;

import androidx.navigation.wflxmlrfwp;
import bk.ojitshcjhn;
import dk.gxszxtbevo;
import gg.wwaezpbzkn;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ k5.iobyxmoadg f53835yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Map f53836zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Map map, k5.iobyxmoadg iobyxmoadgVar) {
            super(3);
            this.f53836zdlpuopuiu = map;
            this.f53835yggfygwlhe = iobyxmoadgVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg(((Number) obj).intValue(), (String) obj2, (wflxmlrfwp) obj3);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, String argName, wflxmlrfwp navType) {
            zdlpuopuiu.btonecajqb(argName, "argName");
            zdlpuopuiu.btonecajqb(navType, "navType");
            Object obj = this.f53836zdlpuopuiu.get(argName);
            zdlpuopuiu.lqeggnwhkg(obj);
            this.f53835yggfygwlhe.ppxfxbqfkf(i13, argName, navType, (List) obj);
        }
    }

    private static final void iobyxmoadg(bk.zoijcleaow zoijcleaowVar, Map map, vdvldrhtss vdvldrhtssVar) {
        int iWkgbmnqykc = zoijcleaowVar.iobyxmoadg().wkgbmnqykc();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            String strEablkybsjg = zoijcleaowVar.iobyxmoadg().eablkybsjg(i13);
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) map.get(strEablkybsjg);
            if (wflxmlrfwpVar == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strEablkybsjg + ']').toString());
            }
            vdvldrhtssVar.invoke(Integer.valueOf(i13), strEablkybsjg, wflxmlrfwpVar);
        }
    }

    public static final String ppxfxbqfkf(Object route, Map typeMap) {
        zdlpuopuiu.btonecajqb(route, "route");
        zdlpuopuiu.btonecajqb(typeMap, "typeMap");
        bk.zoijcleaow zoijcleaowVarIobyxmoadg = ojitshcjhn.iobyxmoadg(cllcsxoeiz.zoijcleaow(route.getClass()));
        Map mapHcddaimhww = new zoijcleaow(zoijcleaowVarIobyxmoadg, typeMap).hcddaimhww(route);
        k5.iobyxmoadg iobyxmoadgVar = new k5.iobyxmoadg(zoijcleaowVarIobyxmoadg);
        iobyxmoadg(zoijcleaowVarIobyxmoadg, typeMap, new iobyxmoadg(mapHcddaimhww, iobyxmoadgVar));
        return iobyxmoadgVar.wkgbmnqykc();
    }

    public static final boolean wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return zdlpuopuiu.eablkybsjg(gxszxtbevoVar.getKind(), dk.ojitshcjhn.iobyxmoadg.f29095iobyxmoadg) && gxszxtbevoVar.isInline() && gxszxtbevoVar.wkgbmnqykc() == 1;
    }

    public static final int zoijcleaow(bk.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        int iHashCode = zoijcleaowVar.iobyxmoadg().nufgyqmvbu().hashCode();
        int iWkgbmnqykc = zoijcleaowVar.iobyxmoadg().wkgbmnqykc();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            iHashCode = (iHashCode * 31) + zoijcleaowVar.iobyxmoadg().eablkybsjg(i13).hashCode();
        }
        return iHashCode;
    }
}
