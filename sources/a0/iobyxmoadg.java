package a0;

import androidx.appcompat.app.yggfygwlhe;
import g.eablkybsjg;
import g0.agtfadlqog;
import g0.esjtqupxsv;
import g0.wflxmlrfwp;
import g0.zdlpuopuiu;
import g0.zoijcleaow;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import y0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: a0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0000iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C0000iobyxmoadg f69zdlpuopuiu = new C0000iobyxmoadg();

        C0000iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final void eablkybsjg(zdlpuopuiu zdlpuopuiuVar, w1.zdlpuopuiu zdlpuopuiuVar2) {
        wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = zdlpuopuiuVar.rgvfuqvkyq();
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
        yggfygwlhe.iobyxmoadg(agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, esjtqupxsvVar.zoijcleaow()));
        zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVar.zdlpuopuiu();
        if (zdlpuopuiuVarZdlpuopuiu == null || agtfadlqog.iobyxmoadg(zdlpuopuiuVarZdlpuopuiu.rgvfuqvkyq(), esjtqupxsvVar.yadqdtsiqt()) == null) {
            return;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) agtfadlqog.iobyxmoadg(zdlpuopuiuVarZdlpuopuiu.rgvfuqvkyq(), esjtqupxsvVar.iobyxmoadg());
        if ((zoijcleaowVar == null || !ppxfxbqfkf(zoijcleaowVar)) && zdlpuopuiuVar.rgvfuqvkyq().ppxfxbqfkf(esjtqupxsvVar.iozdgvuglv())) {
            ArrayList arrayList = new ArrayList();
            List listJyumaefscl = zdlpuopuiuVarZdlpuopuiu.jyumaefscl();
            int size = listJyumaefscl.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                zdlpuopuiu zdlpuopuiuVar3 = (zdlpuopuiu) listJyumaefscl.get(i14);
                if (zdlpuopuiuVar3.rgvfuqvkyq().ppxfxbqfkf(esjtqupxsv.f35662iobyxmoadg.iozdgvuglv())) {
                    arrayList.add(zdlpuopuiuVar3);
                    if (zdlpuopuiuVar3.kcexrzcfyt().iwxlajgraz() < zdlpuopuiuVar.kcexrzcfyt().iwxlajgraz()) {
                        i13++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zIobyxmoadg = iobyxmoadg(arrayList);
            w1.zdlpuopuiu.gxszxtbevo gxszxtbevoVarIobyxmoadg = w1.zdlpuopuiu.gxszxtbevo.iobyxmoadg(zIobyxmoadg ? 0 : i13, 1, zIobyxmoadg ? i13 : 0, 1, false, ((Boolean) zdlpuopuiuVar.rgvfuqvkyq().btonecajqb(esjtqupxsv.f35662iobyxmoadg.iozdgvuglv(), C0000iobyxmoadg.f69zdlpuopuiu)).booleanValue());
            if (gxszxtbevoVarIobyxmoadg != null) {
                zdlpuopuiuVar2.sflfametgt(gxszxtbevoVarIobyxmoadg);
            }
        }
    }

    private static final w1.zdlpuopuiu.eablkybsjg gxszxtbevo(zoijcleaow zoijcleaowVar) {
        return w1.zdlpuopuiu.eablkybsjg.iobyxmoadg(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg(), false, 0);
    }

    private static final boolean iobyxmoadg(List list) {
        List listWflxmlrfwp;
        long jZdlpuopuiu;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
            int i13 = 0;
            while (i13 < iOjitshcjhn) {
                i13++;
                Object obj2 = list.get(i13);
                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj2;
                zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) obj;
                arrayList.add(eablkybsjg.wkgbmnqykc(eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (zdlpuopuiuVar2.gtknphoqwx().lqeggnwhkg() >> 32)) - Float.intBitsToFloat((int) (zdlpuopuiuVar.gtknphoqwx().lqeggnwhkg() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (zdlpuopuiuVar2.gtknphoqwx().lqeggnwhkg() & 4294967295L)) - Float.intBitsToFloat((int) (zdlpuopuiuVar.gtknphoqwx().lqeggnwhkg() & 4294967295L))))) & 4294967295L))));
                obj = obj2;
            }
            listWflxmlrfwp = arrayList;
        }
        if (listWflxmlrfwp.size() == 1) {
            jZdlpuopuiu = ((eablkybsjg) hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp)).zdlpuopuiu();
        } else {
            if (listWflxmlrfwp.isEmpty()) {
                ppxfxbqfkf.lqeggnwhkg("Empty collection can't be reduced.");
            }
            Object objOpjhrmiecq = hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp);
            int iOjitshcjhn2 = hg.jyumaefscl.ojitshcjhn(listWflxmlrfwp);
            if (1 <= iOjitshcjhn2) {
                int i14 = 1;
                while (true) {
                    objOpjhrmiecq = eablkybsjg.wkgbmnqykc(eablkybsjg.vdvldrhtss(((eablkybsjg) objOpjhrmiecq).zdlpuopuiu(), ((eablkybsjg) listWflxmlrfwp.get(i14)).zdlpuopuiu()));
                    if (i14 == iOjitshcjhn2) {
                        break;
                    }
                    i14++;
                }
            }
            jZdlpuopuiu = ((eablkybsjg) objOpjhrmiecq).zdlpuopuiu();
        }
        return Float.intBitsToFloat((int) (4294967295L & jZdlpuopuiu)) < Float.intBitsToFloat((int) (jZdlpuopuiu >> 32));
    }

    private static final boolean ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.zoijcleaow() < 0 || zoijcleaowVar.iobyxmoadg() < 0;
    }

    public static final void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, w1.zdlpuopuiu zdlpuopuiuVar2) {
        wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = zdlpuopuiuVar.rgvfuqvkyq();
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
        zoijcleaow zoijcleaowVar = (zoijcleaow) agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, esjtqupxsvVar.iobyxmoadg());
        if (zoijcleaowVar != null) {
            zdlpuopuiuVar2.ydmasvzmpa(gxszxtbevo(zoijcleaowVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (agtfadlqog.iobyxmoadg(zdlpuopuiuVar.rgvfuqvkyq(), esjtqupxsvVar.yadqdtsiqt()) != null) {
            List listJyumaefscl = zdlpuopuiuVar.jyumaefscl();
            int size = listJyumaefscl.size();
            for (int i13 = 0; i13 < size; i13++) {
                zdlpuopuiu zdlpuopuiuVar3 = (zdlpuopuiu) listJyumaefscl.get(i13);
                if (zdlpuopuiuVar3.rgvfuqvkyq().ppxfxbqfkf(esjtqupxsv.f35662iobyxmoadg.iozdgvuglv())) {
                    arrayList.add(zdlpuopuiuVar3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zIobyxmoadg = iobyxmoadg(arrayList);
        zdlpuopuiuVar2.ydmasvzmpa(w1.zdlpuopuiu.eablkybsjg.iobyxmoadg(zIobyxmoadg ? 1 : arrayList.size(), zIobyxmoadg ? arrayList.size() : 1, false, 0));
    }

    public static final boolean zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
        wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = zdlpuopuiuVar.rgvfuqvkyq();
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
        return (agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, esjtqupxsvVar.iobyxmoadg()) == null && agtfadlqog.iobyxmoadg(zdlpuopuiuVar.rgvfuqvkyq(), esjtqupxsvVar.yadqdtsiqt()) == null) ? false : true;
    }
}
