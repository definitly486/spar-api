package oh;

import bi.agtfadlqog;
import bi.cqumvgiudr;
import bi.iwizpuwonk;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.zdlpuopuiu;
import mh.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f72853iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ConcurrentHashMap f72854ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f72855zoijcleaow;

    public iobyxmoadg(agtfadlqog resolver, lqeggnwhkg kotlinClassFinder) {
        zdlpuopuiu.btonecajqb(resolver, "resolver");
        zdlpuopuiu.btonecajqb(kotlinClassFinder, "kotlinClassFinder");
        this.f72853iobyxmoadg = resolver;
        this.f72855zoijcleaow = kotlinClassFinder;
        this.f72854ppxfxbqfkf = new ConcurrentHashMap();
    }

    public final si.gtknphoqwx iobyxmoadg(gxszxtbevo fileClass) {
        Collection collectionEablkybsjg;
        zdlpuopuiu.btonecajqb(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f72854ppxfxbqfkf;
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = fileClass.ppxfxbqfkf();
        Object obj = concurrentHashMap.get(zoijcleaowVarPpxfxbqfkf);
        if (obj == null) {
            ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = fileClass.ppxfxbqfkf().gxszxtbevo();
            if (fileClass.gxszxtbevo().ppxfxbqfkf() == ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS) {
                List<String> listGxszxtbevo = fileClass.gxszxtbevo().gxszxtbevo();
                collectionEablkybsjg = new ArrayList();
                for (String str : listGxszxtbevo) {
                    ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
                    ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = qi.wkgbmnqykc.wkgbmnqykc(str).eablkybsjg();
                    zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    cqumvgiudr cqumvgiudrVarIobyxmoadg = iwizpuwonk.iobyxmoadg(this.f72855zoijcleaow, iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVarEablkybsjg), jj.ppxfxbqfkf.iobyxmoadg(this.f72853iobyxmoadg.gxszxtbevo().lqeggnwhkg()));
                    if (cqumvgiudrVarIobyxmoadg != null) {
                        collectionEablkybsjg.add(cqumvgiudrVarIobyxmoadg);
                    }
                }
            } else {
                collectionEablkybsjg = jyumaefscl.eablkybsjg(fileClass);
            }
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(this.f72853iobyxmoadg.gxszxtbevo().vdvldrhtss(), ppxfxbqfkfVarGxszxtbevo);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionEablkybsjg.iterator();
            while (it.hasNext()) {
                si.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = this.f72853iobyxmoadg.ppxfxbqfkf(rgvfuqvkyqVar, (cqumvgiudr) it.next());
                if (gtknphoqwxVarPpxfxbqfkf != null) {
                    arrayList.add(gtknphoqwxVarPpxfxbqfkf);
                }
            }
            List listM = jyumaefscl.m(arrayList);
            si.gtknphoqwx gtknphoqwxVarIobyxmoadg = si.zoijcleaow.f106770wkgbmnqykc.iobyxmoadg("package " + ppxfxbqfkfVarGxszxtbevo + " (" + fileClass + ')', listM);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(zoijcleaowVarPpxfxbqfkf, gtknphoqwxVarIobyxmoadg);
            obj = objPutIfAbsent == null ? gtknphoqwxVarIobyxmoadg : objPutIfAbsent;
        }
        zdlpuopuiu.dxjokdxxww(obj, "getOrPut(...)");
        return (si.gtknphoqwx) obj;
    }
}
