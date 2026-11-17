package dh;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class eslsurpljm implements kotlin.jvm.internal.yggfygwlhe {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f28192cqumvgiudr = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(eslsurpljm.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(eslsurpljm.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final e.iobyxmoadg f28193iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final e.iobyxmoadg f28194jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final e.iobyxmoadg f28195yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zi.kegysxyocb f28196zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f28197iobyxmoadg;

        static {
            int[] iArr = new int[zi.mhtqkkgtqm.values().length];
            try {
                iArr[zi.mhtqkkgtqm.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi.mhtqkkgtqm.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi.mhtqkkgtqm.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28197iobyxmoadg = iArr;
        }
    }

    public eslsurpljm(zi.kegysxyocb type, tg.iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        this.f28196zdlpuopuiu = type;
        e.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = null;
        e.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar instanceof e.iobyxmoadg ? (e.iobyxmoadg) iobyxmoadgVar : null;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVarPpxfxbqfkf = iobyxmoadgVar2;
        } else if (iobyxmoadgVar != null) {
            iobyxmoadgVarPpxfxbqfkf = e.ppxfxbqfkf(iobyxmoadgVar);
        }
        this.f28195yggfygwlhe = iobyxmoadgVarPpxfxbqfkf;
        this.f28194jyumaefscl = e.ppxfxbqfkf(new fmlbqenlif(this));
        this.f28193iwizpuwonk = e.ppxfxbqfkf(new ezmngbhpjk(this, iobyxmoadgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type draadjrbmk(eslsurpljm eslsurpljmVar, int i13, gg.gtknphoqwx gtknphoqwxVar) {
        Type type;
        Type typeLqeggnwhkg = eslsurpljmVar.lqeggnwhkg();
        if (typeLqeggnwhkg instanceof Class) {
            Class cls = (Class) typeLqeggnwhkg;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(componentType);
            return componentType;
        }
        if (typeLqeggnwhkg instanceof GenericArrayType) {
            if (i13 == 0) {
                Type genericComponentType = ((GenericArrayType) typeLqeggnwhkg).getGenericComponentType();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(genericComponentType);
                return genericComponentType;
            }
            throw new c("Array type has been queried for a non-0th argument: " + eslsurpljmVar);
        }
        if (!(typeLqeggnwhkg instanceof ParameterizedType)) {
            throw new c("Non-generic type has been queried for arguments: " + eslsurpljmVar);
        }
        Type type2 = (Type) gtknphoqwx(gtknphoqwxVar).get(i13);
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerBounds, "getLowerBounds(...)");
        Type type3 = (Type) hg.agtfadlqog.ydmasvzmpa(lowerBounds);
        if (type3 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
            type = (Type) hg.agtfadlqog.yfnezrywwk(upperBounds);
        } else {
            type = type3;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(type);
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dxjokdxxww(eslsurpljm eslsurpljmVar) {
        Type typeLqeggnwhkg = eslsurpljmVar.lqeggnwhkg();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(typeLqeggnwhkg);
        return ph.gxszxtbevo.nufgyqmvbu(typeLqeggnwhkg);
    }

    private static final List gtknphoqwx(gg.gtknphoqwx gtknphoqwxVar) {
        return (List) gtknphoqwxVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gxszxtbevo(eslsurpljm eslsurpljmVar, tg.iobyxmoadg iobyxmoadgVar) {
        ah.vdvldrhtss vdvldrhtssVarWkgbmnqykc;
        List listFyldjkxazc = eslsurpljmVar.f28196zdlpuopuiu.fyldjkxazc();
        if (listFyldjkxazc.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new rhgxfdycjh(eslsurpljmVar));
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listFyldjkxazc, 10));
        int i13 = 0;
        for (Object obj : listFyldjkxazc) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            zi.iwxlajgraz iwxlajgrazVar = (zi.iwxlajgraz) obj;
            if (iwxlajgrazVar.zoijcleaow()) {
                vdvldrhtssVarWkgbmnqykc = ah.vdvldrhtss.f1899ppxfxbqfkf.ppxfxbqfkf();
            } else {
                zi.kegysxyocb type = iwxlajgrazVar.getType();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                eslsurpljm eslsurpljmVar2 = new eslsurpljm(type, iobyxmoadgVar == null ? null : new yzdjzghtvl(eslsurpljmVar, i13, gtknphoqwxVarIobyxmoadg));
                int i15 = iobyxmoadg.f28197iobyxmoadg[iwxlajgrazVar.ppxfxbqfkf().ordinal()];
                if (i15 == 1) {
                    vdvldrhtssVarWkgbmnqykc = ah.vdvldrhtss.f1899ppxfxbqfkf.wkgbmnqykc(eslsurpljmVar2);
                } else if (i15 == 2) {
                    vdvldrhtssVarWkgbmnqykc = ah.vdvldrhtss.f1899ppxfxbqfkf.iobyxmoadg(eslsurpljmVar2);
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vdvldrhtssVarWkgbmnqykc = ah.vdvldrhtss.f1899ppxfxbqfkf.zoijcleaow(eslsurpljmVar2);
                }
            }
            arrayList.add(vdvldrhtssVarWkgbmnqykc);
            i13 = i14;
        }
        return arrayList;
    }

    private final ah.eablkybsjg rgvfuqvkyq(zi.kegysxyocb kegysxyocbVar) {
        zi.kegysxyocb type;
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().wkgbmnqykc();
        if (!(nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg)) {
            if (nufgyqmvbuVarWkgbmnqykc instanceof jh.yfnezrywwk) {
                return new a(null, (jh.yfnezrywwk) nufgyqmvbuVarWkgbmnqykc);
            }
            if (!(nufgyqmvbuVarWkgbmnqykc instanceof jh.uwvvkdfqfp)) {
                return null;
            }
            throw new gg.rgvfuqvkyq("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsVdvldrhtss = n.vdvldrhtss((jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc);
        if (clsVdvldrhtss == null) {
            return null;
        }
        if (!clsVdvldrhtss.isArray()) {
            if (zi.ageimvtcrz.draadjrbmk(kegysxyocbVar)) {
                return new sopmlzcsov(clsVdvldrhtss);
            }
            Class clsDxjokdxxww = ph.gxszxtbevo.dxjokdxxww(clsVdvldrhtss);
            if (clsDxjokdxxww != null) {
                clsVdvldrhtss = clsDxjokdxxww;
            }
            return new sopmlzcsov(clsVdvldrhtss);
        }
        zi.iwxlajgraz iwxlajgrazVar = (zi.iwxlajgraz) hg.jyumaefscl.krqnebusok(kegysxyocbVar.fyldjkxazc());
        if (iwxlajgrazVar == null || (type = iwxlajgrazVar.getType()) == null) {
            return new sopmlzcsov(clsVdvldrhtss);
        }
        ah.eablkybsjg eablkybsjgVarRgvfuqvkyq = rgvfuqvkyq(type);
        if (eablkybsjgVarRgvfuqvkyq != null) {
            return new sopmlzcsov(n.gxszxtbevo(sg.iobyxmoadg.zoijcleaow(ch.zoijcleaow.iobyxmoadg(eablkybsjgVarRgvfuqvkyq))));
        }
        throw new c("Cannot determine classifier for array element type: " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ah.eablkybsjg wflxmlrfwp(eslsurpljm eslsurpljmVar) {
        return eslsurpljmVar.rgvfuqvkyq(eslsurpljmVar.f28196zdlpuopuiu);
    }

    @Override // ah.ojitshcjhn
    public ah.eablkybsjg agtfadlqog() {
        return (ah.eablkybsjg) this.f28194jyumaefscl.zoijcleaow(this, f28192cqumvgiudr[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof eslsurpljm) {
            eslsurpljm eslsurpljmVar = (eslsurpljm) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28196zdlpuopuiu, eslsurpljmVar.f28196zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(agtfadlqog(), eslsurpljmVar.agtfadlqog()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhn(), eslsurpljmVar.ojitshcjhn())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f28196zdlpuopuiu.hashCode() * 31;
        ah.eablkybsjg eablkybsjgVarAgtfadlqog = agtfadlqog();
        return ((iHashCode + (eablkybsjgVarAgtfadlqog != null ? eablkybsjgVarAgtfadlqog.hashCode() : 0)) * 31) + ojitshcjhn().hashCode();
    }

    @Override // kotlin.jvm.internal.yggfygwlhe
    public Type lqeggnwhkg() {
        e.iobyxmoadg iobyxmoadgVar = this.f28195yggfygwlhe;
        if (iobyxmoadgVar != null) {
            return (Type) iobyxmoadgVar.invoke();
        }
        return null;
    }

    @Override // ah.ojitshcjhn
    public List ojitshcjhn() {
        Object objZoijcleaow = this.f28193iwizpuwonk.zoijcleaow(this, f28192cqumvgiudr[1]);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
        return (List) objZoijcleaow;
    }

    public final zi.kegysxyocb oxmwwwfdhm() {
        return this.f28196zdlpuopuiu;
    }

    public String toString() {
        return i.f28226iobyxmoadg.draadjrbmk(this.f28196zdlpuopuiu);
    }

    public /* synthetic */ eslsurpljm(zi.kegysxyocb kegysxyocbVar, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(kegysxyocbVar, (i13 & 2) != 0 ? null : iobyxmoadgVar);
    }
}
