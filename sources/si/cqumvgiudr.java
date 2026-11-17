package si;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.crxdokpmqz;
import jh.jztzpxfvev;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class cqumvgiudr extends si.iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f106706wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f106707ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f106708zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gtknphoqwx iobyxmoadg(String message, Collection types) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((kegysxyocb) it.next()).agtfadlqog());
            }
            jj.gtknphoqwx gtknphoqwxVarZoijcleaow = ij.iobyxmoadg.zoijcleaow(arrayList);
            gtknphoqwx gtknphoqwxVarZoijcleaow2 = zoijcleaow.f106770wkgbmnqykc.zoijcleaow(message, gtknphoqwxVarZoijcleaow);
            return gtknphoqwxVarZoijcleaow.size() <= 1 ? gtknphoqwxVarZoijcleaow2 : new cqumvgiudr(message, gtknphoqwxVarZoijcleaow2, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ cqumvgiudr(String str, gtknphoqwx gtknphoqwxVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(str, gtknphoqwxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.iobyxmoadg agtfadlqog(jh.iobyxmoadg selectMostSpecificInEachOverridableGroup) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.iobyxmoadg ojitshcjhn(jztzpxfvev selectMostSpecificInEachOverridableGroup) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.iobyxmoadg rgvfuqvkyq(crxdokpmqz selectMostSpecificInEachOverridableGroup) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    public static final gtknphoqwx wflxmlrfwp(String str, Collection collection) {
        return f106706wkgbmnqykc.iobyxmoadg(str, collection);
    }

    @Override // si.iobyxmoadg
    protected gtknphoqwx dxjokdxxww() {
        return this.f106707ppxfxbqfkf;
    }

    @Override // si.iobyxmoadg, si.agtfadlqog
    public Collection gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        Collection collectionGxszxtbevo = super.gxszxtbevo(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionGxszxtbevo) {
            if (((jh.wflxmlrfwp) obj) instanceof jh.iobyxmoadg) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        gg.vdvldrhtss vdvldrhtssVar = new gg.vdvldrhtss(arrayList, arrayList2);
        List list = (List) vdvldrhtssVar.iobyxmoadg();
        List list2 = (List) vdvldrhtssVar.wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return hg.jyumaefscl.ixidwrxhsl(li.oxmwwwfdhm.zoijcleaow(list, iwizpuwonk.f106720zdlpuopuiu), list2);
    }

    @Override // si.iobyxmoadg, si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return li.oxmwwwfdhm.zoijcleaow(super.wkgbmnqykc(name, location), yggfygwlhe.f106764zdlpuopuiu);
    }

    @Override // si.iobyxmoadg, si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return li.oxmwwwfdhm.zoijcleaow(super.zoijcleaow(name, location), jyumaefscl.f106721zdlpuopuiu);
    }

    private cqumvgiudr(String str, gtknphoqwx gtknphoqwxVar) {
        this.f106708zoijcleaow = str;
        this.f106707ppxfxbqfkf = gtknphoqwxVar;
    }
}
