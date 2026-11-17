package zi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfnezrywwk {

    public static final class iobyxmoadg extends nuxfzjnpeb {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ List f130161wkgbmnqykc;

        iobyxmoadg(List list) {
            this.f130161wkgbmnqykc = list;
        }

        @Override // zi.nuxfzjnpeb
        public iwxlajgraz gtknphoqwx(zeieaojujs key) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            if (!this.f130161wkgbmnqykc.contains(key)) {
                return null;
            }
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = key.ylkuphrtab();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return ageimvtcrz.kcexrzcfyt((jh.yfnezrywwk) nufgyqmvbuVarWkgbmnqykc);
        }
    }

    private static final kegysxyocb iobyxmoadg(List list, List list2, gh.dxjokdxxww dxjokdxxwwVar) {
        kegysxyocb kegysxyocbVarRgvfuqvkyq = wizcaqwiak.lqeggnwhkg(new iobyxmoadg(list)).rgvfuqvkyq((kegysxyocb) hg.jyumaefscl.opjhrmiecq(list2), mhtqkkgtqm.OUT_VARIANCE);
        if (kegysxyocbVarRgvfuqvkyq != null) {
            return kegysxyocbVarRgvfuqvkyq;
        }
        ikoacuggdj ikoacuggdjVarEsjtqupxsv = dxjokdxxwwVar.esjtqupxsv();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarEsjtqupxsv, "getDefaultBound(...)");
        return ikoacuggdjVarEsjtqupxsv;
    }

    public static final kegysxyocb zoijcleaow(jh.yfnezrywwk yfnezrywwkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(yfnezrywwkVar, "<this>");
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = yfnezrywwkVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
        if (wflxmlrfwpVarZoijcleaow instanceof jh.dxjokdxxww) {
            List parameters = ((jh.dxjokdxxww) wflxmlrfwpVarZoijcleaow).btonecajqb().getParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                zeieaojujs zeieaojujsVarBtonecajqb = ((jh.yfnezrywwk) it.next()).btonecajqb();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
                arrayList.add(zeieaojujsVarBtonecajqb);
            }
            List upperBounds = yfnezrywwkVar.getUpperBounds();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
            return iobyxmoadg(arrayList, upperBounds, pi.eablkybsjg.wflxmlrfwp(yfnezrywwkVar));
        }
        if (!(wflxmlrfwpVarZoijcleaow instanceof jh.lereixgezr)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((jh.lereixgezr) wflxmlrfwpVarZoijcleaow).getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            zeieaojujs zeieaojujsVarBtonecajqb2 = ((jh.yfnezrywwk) it2.next()).btonecajqb();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb2, "getTypeConstructor(...)");
            arrayList2.add(zeieaojujsVarBtonecajqb2);
        }
        List upperBounds2 = yfnezrywwkVar.getUpperBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds2, "getUpperBounds(...)");
        return iobyxmoadg(arrayList2, upperBounds2, pi.eablkybsjg.wflxmlrfwp(yfnezrywwkVar));
    }
}
