package zm0;

import dk.wflxmlrfwp;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gk.btonecajqb;
import gk.cdpycssgdh;
import gk.dxjokdxxww;
import gk.iozdgvuglv;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f130440iobyxmoadg = new wkgbmnqykc();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f130441zoijcleaow = wflxmlrfwp.eablkybsjg("Any", new dk.gxszxtbevo[0], null, 4, null);

    private wkgbmnqykc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object gxszxtbevo(btonecajqb btonecajqbVar) {
        if (btonecajqbVar instanceof cdpycssgdh) {
            Map map = (Map) btonecajqbVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), f130440iobyxmoadg.gxszxtbevo((btonecajqb) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (!(btonecajqbVar instanceof gk.ppxfxbqfkf)) {
            if (btonecajqbVar instanceof iozdgvuglv) {
                return ((iozdgvuglv) btonecajqbVar).toString();
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterable iterable = (Iterable) btonecajqbVar;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(f130440iobyxmoadg.gxszxtbevo((btonecajqb) it.next()));
        }
        return arrayList;
    }

    private final btonecajqb lqeggnwhkg(Object obj) {
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(String.valueOf(entry.getKey()), f130440iobyxmoadg.lqeggnwhkg(entry.getValue()));
                linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
            }
            return new cdpycssgdh(linkedHashMap);
        }
        if (!(obj instanceof List)) {
            if (obj instanceof Number) {
                return gk.gtknphoqwx.zoijcleaow((Number) obj);
            }
            return obj instanceof Boolean ? gk.gtknphoqwx.iobyxmoadg((Boolean) obj) : gk.gtknphoqwx.ppxfxbqfkf(String.valueOf(obj));
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(f130440iobyxmoadg.lqeggnwhkg(it.next()));
        }
        return new gk.ppxfxbqfkf(arrayList);
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f130441zoijcleaow;
    }

    @Override // bk.agtfadlqog
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Object value) {
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        zdlpuopuiu.btonecajqb(value, "value");
        ((gk.zdlpuopuiu) encoder).draadjrbmk(lqeggnwhkg(value));
    }

    @Override // bk.iobyxmoadg
    public Object zoijcleaow(ek.eablkybsjg decoder) {
        zdlpuopuiu.btonecajqb(decoder, "decoder");
        return gxszxtbevo(((dxjokdxxww) decoder).lqeggnwhkg());
    }
}
