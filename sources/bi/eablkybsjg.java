package bi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jh.xrmfcynszj;
import vi.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg implements vi.nufgyqmvbu {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow f16256zoijcleaow = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f16257iobyxmoadg;

    /* JADX INFO: renamed from: bi.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0289eablkybsjg implements cqumvgiudr.ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ArrayList f16259zoijcleaow;

        C0289eablkybsjg(ArrayList arrayList) {
            this.f16259zoijcleaow = arrayList;
        }

        @Override // bi.cqumvgiudr.ppxfxbqfkf
        public void iobyxmoadg() {
        }

        @Override // bi.cqumvgiudr.ppxfxbqfkf
        public cqumvgiudr.iobyxmoadg zoijcleaow(ii.zoijcleaow classId, xrmfcynszj source) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            return eablkybsjg.this.esjtqupxsv(classId, source, this.f16259zoijcleaow);
        }
    }

    public static abstract class iobyxmoadg {
        public abstract Map iobyxmoadg();
    }

    private enum ppxfxbqfkf {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f16260cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public /* synthetic */ class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f16265iobyxmoadg;

        static {
            int[] iArr = new int[vi.wkgbmnqykc.values().length];
            try {
                iArr[vi.wkgbmnqykc.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vi.wkgbmnqykc.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vi.wkgbmnqykc.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16265iobyxmoadg = iArr;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final cqumvgiudr iobyxmoadg(cllcsxoeiz container, boolean z13, boolean z14, Boolean bool, boolean z15, jyumaefscl kotlinClassFinder, hi.eablkybsjg jvmMetadataVersion) {
            cllcsxoeiz.iobyxmoadg iobyxmoadgVarNufgyqmvbu;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinClassFinder, "kotlinClassFinder");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jvmMetadataVersion, "jvmMetadataVersion");
            if (z13) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof cllcsxoeiz.iobyxmoadg) {
                    cllcsxoeiz.iobyxmoadg iobyxmoadgVar = (cllcsxoeiz.iobyxmoadg) container;
                    if (iobyxmoadgVar.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.INTERFACE) {
                        ii.zoijcleaow zoijcleaowVarEablkybsjg = iobyxmoadgVar.eablkybsjg();
                        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo("DefaultImpls");
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
                        return iwizpuwonk.iobyxmoadg(kotlinClassFinder, zoijcleaowVarEablkybsjg.wkgbmnqykc(gxszxtbevoVarGxszxtbevo), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof cllcsxoeiz.zoijcleaow)) {
                    xrmfcynszj xrmfcynszjVarPpxfxbqfkf = container.ppxfxbqfkf();
                    oxmwwwfdhm oxmwwwfdhmVar = xrmfcynszjVarPpxfxbqfkf instanceof oxmwwwfdhm ? (oxmwwwfdhm) xrmfcynszjVarPpxfxbqfkf : null;
                    qi.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = oxmwwwfdhmVar != null ? oxmwwwfdhmVar.gxszxtbevo() : null;
                    if (wkgbmnqykcVarGxszxtbevo != null) {
                        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = ii.zoijcleaow.f44488wkgbmnqykc;
                        String strGxszxtbevo = wkgbmnqykcVarGxszxtbevo.gxszxtbevo();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGxszxtbevo, "getInternalName(...)");
                        return iwizpuwonk.iobyxmoadg(kotlinClassFinder, iobyxmoadgVar2.ppxfxbqfkf(new ii.ppxfxbqfkf(mj.kcexrzcfyt.pkzmftpjix(strGxszxtbevo, '/', '.', false, 4, null))), jvmMetadataVersion);
                    }
                }
            }
            if (z14 && (container instanceof cllcsxoeiz.iobyxmoadg)) {
                cllcsxoeiz.iobyxmoadg iobyxmoadgVar3 = (cllcsxoeiz.iobyxmoadg) container;
                if (iobyxmoadgVar3.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.COMPANION_OBJECT && (iobyxmoadgVarNufgyqmvbu = iobyxmoadgVar3.nufgyqmvbu()) != null && (iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.CLASS || iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.ENUM_CLASS || (z15 && (iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.INTERFACE || iobyxmoadgVarNufgyqmvbu.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.ANNOTATION_CLASS)))) {
                    xrmfcynszj xrmfcynszjVarPpxfxbqfkf2 = iobyxmoadgVarNufgyqmvbu.ppxfxbqfkf();
                    lereixgezr lereixgezrVar = xrmfcynszjVarPpxfxbqfkf2 instanceof lereixgezr ? (lereixgezr) xrmfcynszjVarPpxfxbqfkf2 : null;
                    if (lereixgezrVar != null) {
                        return lereixgezrVar.wkgbmnqykc();
                    }
                    return null;
                }
            }
            if (!(container instanceof cllcsxoeiz.zoijcleaow) || !(container.ppxfxbqfkf() instanceof oxmwwwfdhm)) {
                return null;
            }
            xrmfcynszj xrmfcynszjVarPpxfxbqfkf3 = container.ppxfxbqfkf();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(xrmfcynszjVarPpxfxbqfkf3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            oxmwwwfdhm oxmwwwfdhmVar2 = (oxmwwwfdhm) xrmfcynszjVarPpxfxbqfkf3;
            cqumvgiudr cqumvgiudrVarLqeggnwhkg = oxmwwwfdhmVar2.lqeggnwhkg();
            return cqumvgiudrVarLqeggnwhkg == null ? iwizpuwonk.iobyxmoadg(kotlinClassFinder, oxmwwwfdhmVar2.wkgbmnqykc(), jvmMetadataVersion) : cqumvgiudrVarLqeggnwhkg;
        }

        private zoijcleaow() {
        }
    }

    public eablkybsjg(jyumaefscl kotlinClassFinder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinClassFinder, "kotlinClassFinder");
        this.f16257iobyxmoadg = kotlinClassFinder;
    }

    private final List agtfadlqog(cllcsxoeiz cllcsxoeizVar, pmvmpeiblj pmvmpeibljVar, boolean z13, boolean z14, Boolean bool, boolean z15) {
        List list;
        cqumvgiudr cqumvgiudrVarRgvfuqvkyq = rgvfuqvkyq(cllcsxoeizVar, f16256zoijcleaow.iobyxmoadg(cllcsxoeizVar, z13, z14, bool, z15, this.f16257iobyxmoadg, yggfygwlhe()));
        return (cqumvgiudrVarRgvfuqvkyq == null || (list = (List) vdvldrhtss(cqumvgiudrVarRgvfuqvkyq).iobyxmoadg().get(pmvmpeibljVar)) == null) ? hg.jyumaefscl.wflxmlrfwp() : list;
    }

    private final List lereixgezr(cllcsxoeiz cllcsxoeizVar, di.agtfadlqog agtfadlqogVar, ppxfxbqfkf ppxfxbqfkfVar) {
        Boolean boolWkgbmnqykc = fi.zoijcleaow.f33950zynmafqrjb.wkgbmnqykc(agtfadlqogVar.xrmfcynszj());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(boolWkgbmnqykc, "get(...)");
        boolWkgbmnqykc.booleanValue();
        boolean zGxszxtbevo = hi.dxjokdxxww.gxszxtbevo(agtfadlqogVar);
        if (ppxfxbqfkfVar == ppxfxbqfkf.PROPERTY) {
            pmvmpeiblj pmvmpeibljVarZoijcleaow = gxszxtbevo.zoijcleaow(agtfadlqogVar, cllcsxoeizVar.zoijcleaow(), cllcsxoeizVar.wkgbmnqykc(), false, true, false, 40, null);
            return pmvmpeibljVarZoijcleaow == null ? hg.jyumaefscl.wflxmlrfwp() : ojitshcjhn(this, cllcsxoeizVar, pmvmpeibljVarZoijcleaow, true, false, boolWkgbmnqykc, zGxszxtbevo, 8, null);
        }
        pmvmpeiblj pmvmpeibljVarZoijcleaow2 = gxszxtbevo.zoijcleaow(agtfadlqogVar, cllcsxoeizVar.zoijcleaow(), cllcsxoeizVar.wkgbmnqykc(), true, false, false, 48, null);
        if (pmvmpeibljVarZoijcleaow2 == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        return mj.kcexrzcfyt.sopmlzcsov(pmvmpeibljVarZoijcleaow2.iobyxmoadg(), "$delegate", false, 2, null) != (ppxfxbqfkfVar == ppxfxbqfkf.DELEGATE_FIELD) ? hg.jyumaefscl.wflxmlrfwp() : agtfadlqog(cllcsxoeizVar, pmvmpeibljVarZoijcleaow2, true, true, boolWkgbmnqykc, zGxszxtbevo);
    }

    static /* synthetic */ List ojitshcjhn(eablkybsjg eablkybsjgVar, cllcsxoeiz cllcsxoeizVar, pmvmpeiblj pmvmpeibljVar, boolean z13, boolean z14, Boolean bool, boolean z15, int i13, Object obj) {
        if (obj == null) {
            return eablkybsjgVar.agtfadlqog(cllcsxoeizVar, pmvmpeibljVar, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : bool, (i13 & 32) != 0 ? false : z15);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    private final cqumvgiudr pmvmpeiblj(cllcsxoeiz.iobyxmoadg iobyxmoadgVar) {
        xrmfcynszj xrmfcynszjVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        lereixgezr lereixgezrVar = xrmfcynszjVarPpxfxbqfkf instanceof lereixgezr ? (lereixgezr) xrmfcynszjVarPpxfxbqfkf : null;
        if (lereixgezrVar != null) {
            return lereixgezrVar.wkgbmnqykc();
        }
        return null;
    }

    private final int wflxmlrfwp(cllcsxoeiz cllcsxoeizVar, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar instanceof di.dxjokdxxww) {
            if (!fi.gxszxtbevo.lqeggnwhkg((di.dxjokdxxww) agtfadlqogVar)) {
                return 0;
            }
        } else if (agtfadlqogVar instanceof di.agtfadlqog) {
            if (!fi.gxszxtbevo.nufgyqmvbu((di.agtfadlqog) agtfadlqogVar)) {
                return 0;
            }
        } else {
            if (!(agtfadlqogVar instanceof di.wkgbmnqykc)) {
                throw new UnsupportedOperationException("Unsupported message: " + agtfadlqogVar.getClass());
            }
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cllcsxoeizVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            cllcsxoeiz.iobyxmoadg iobyxmoadgVar = (cllcsxoeiz.iobyxmoadg) cllcsxoeizVar;
            if (iobyxmoadgVar.lqeggnwhkg() == di.ppxfxbqfkf.EnumC0570ppxfxbqfkf.ENUM_CLASS) {
                return 2;
            }
            if (!iobyxmoadgVar.dxjokdxxww()) {
                return 0;
            }
        }
        return 1;
    }

    public static /* synthetic */ pmvmpeiblj zdlpuopuiu(eablkybsjg eablkybsjgVar, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog agtfadlqogVar, fi.ppxfxbqfkf ppxfxbqfkfVar, fi.lqeggnwhkg lqeggnwhkgVar, vi.wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        return eablkybsjgVar.kcexrzcfyt(agtfadlqogVar, ppxfxbqfkfVar, lqeggnwhkgVar, wkgbmnqykcVar, z13);
    }

    @Override // vi.nufgyqmvbu
    public List btonecajqb(cllcsxoeiz container, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog proto, vi.wkgbmnqykc kind) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        if (kind == vi.wkgbmnqykc.PROPERTY) {
            return lereixgezr(container, (di.agtfadlqog) proto, ppxfxbqfkf.PROPERTY);
        }
        pmvmpeiblj pmvmpeibljVarZdlpuopuiu = zdlpuopuiu(this, proto, container.zoijcleaow(), container.wkgbmnqykc(), kind, false, 16, null);
        return pmvmpeibljVarZdlpuopuiu == null ? hg.jyumaefscl.wflxmlrfwp() : ojitshcjhn(this, container, pmvmpeibljVarZdlpuopuiu, false, false, null, false, 60, null);
    }

    protected abstract cqumvgiudr.iobyxmoadg cqumvgiudr(ii.zoijcleaow zoijcleaowVar, xrmfcynszj xrmfcynszjVar, List list);

    @Override // vi.nufgyqmvbu
    public List draadjrbmk(cllcsxoeiz container, di.agtfadlqog proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        return lereixgezr(container, proto, ppxfxbqfkf.DELEGATE_FIELD);
    }

    @Override // vi.nufgyqmvbu
    public List dxjokdxxww(cllcsxoeiz container, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog proto, vi.wkgbmnqykc kind) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        pmvmpeiblj pmvmpeibljVarZdlpuopuiu = zdlpuopuiu(this, proto, container.zoijcleaow(), container.wkgbmnqykc(), kind, false, 16, null);
        return pmvmpeibljVarZdlpuopuiu != null ? ojitshcjhn(this, container, pmvmpeiblj.f16327zoijcleaow.eablkybsjg(pmvmpeibljVarZdlpuopuiu, 0), false, false, null, false, 60, null) : hg.jyumaefscl.wflxmlrfwp();
    }

    protected final cqumvgiudr.iobyxmoadg esjtqupxsv(ii.zoijcleaow annotationClassId, xrmfcynszj source, List result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        if (fh.iobyxmoadg.f33812iobyxmoadg.zoijcleaow().contains(annotationClassId)) {
            return null;
        }
        return cqumvgiudr(annotationClassId, source, result);
    }

    @Override // vi.nufgyqmvbu
    public List gtknphoqwx(cllcsxoeiz.iobyxmoadg container) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        cqumvgiudr cqumvgiudrVarPmvmpeiblj = pmvmpeiblj(container);
        if (cqumvgiudrVarPmvmpeiblj != null) {
            ArrayList arrayList = new ArrayList(1);
            cqumvgiudrVarPmvmpeiblj.eablkybsjg(new C0289eablkybsjg(arrayList), oxmwwwfdhm(cqumvgiudrVarPmvmpeiblj));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.iobyxmoadg()).toString());
    }

    @Override // vi.nufgyqmvbu
    public List gxszxtbevo(di.kcexrzcfyt proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        Object objJyumaefscl = proto.jyumaefscl(gi.iobyxmoadg.f37416nufgyqmvbu);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objJyumaefscl, "getExtension(...)");
        Iterable<di.zoijcleaow> iterable = (Iterable) objJyumaefscl;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(iterable, 10));
        for (di.zoijcleaow zoijcleaowVar : iterable) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
            arrayList.add(iobyxmoadg(zoijcleaowVar, nameResolver));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public abstract Object iobyxmoadg(di.zoijcleaow zoijcleaowVar, fi.ppxfxbqfkf ppxfxbqfkfVar);

    protected final boolean iwizpuwonk(ii.zoijcleaow classId) {
        cqumvgiudr cqumvgiudrVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
        return classId.eablkybsjg() != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(classId.nufgyqmvbu().zoijcleaow(), "Container") && (cqumvgiudrVarIobyxmoadg = iwizpuwonk.iobyxmoadg(this.f16257iobyxmoadg, classId, yggfygwlhe())) != null && fh.iobyxmoadg.f33812iobyxmoadg.ppxfxbqfkf(cqumvgiudrVarIobyxmoadg);
    }

    protected final jyumaefscl jyumaefscl() {
        return this.f16257iobyxmoadg;
    }

    protected final pmvmpeiblj kcexrzcfyt(kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog proto, fi.ppxfxbqfkf nameResolver, fi.lqeggnwhkg typeTable, vi.wkgbmnqykc kind, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeTable, "typeTable");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        if (proto instanceof di.wkgbmnqykc) {
            pmvmpeiblj.iobyxmoadg iobyxmoadgVar = pmvmpeiblj.f16327zoijcleaow;
            hi.wkgbmnqykc.zoijcleaow zoijcleaowVarZoijcleaow = hi.dxjokdxxww.f40413iobyxmoadg.zoijcleaow((di.wkgbmnqykc) proto, nameResolver, typeTable);
            if (zoijcleaowVarZoijcleaow == null) {
                return null;
            }
            return iobyxmoadgVar.zoijcleaow(zoijcleaowVarZoijcleaow);
        }
        if (proto instanceof di.dxjokdxxww) {
            pmvmpeiblj.iobyxmoadg iobyxmoadgVar2 = pmvmpeiblj.f16327zoijcleaow;
            hi.wkgbmnqykc.zoijcleaow zoijcleaowVarEablkybsjg = hi.dxjokdxxww.f40413iobyxmoadg.eablkybsjg((di.dxjokdxxww) proto, nameResolver, typeTable);
            if (zoijcleaowVarEablkybsjg == null) {
                return null;
            }
            return iobyxmoadgVar2.zoijcleaow(zoijcleaowVarEablkybsjg);
        }
        if (!(proto instanceof di.agtfadlqog)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo propertySignature = gi.iobyxmoadg.f37419wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(propertySignature, "propertySignature");
        gi.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = (gi.iobyxmoadg.wkgbmnqykc) fi.eablkybsjg.iobyxmoadg((kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.wkgbmnqykc) proto, propertySignature);
        if (wkgbmnqykcVar == null) {
            return null;
        }
        int i13 = wkgbmnqykc.f16265iobyxmoadg[kind.ordinal()];
        if (i13 == 1) {
            if (!wkgbmnqykcVar.hcddaimhww()) {
                return null;
            }
            pmvmpeiblj.iobyxmoadg iobyxmoadgVar3 = pmvmpeiblj.f16327zoijcleaow;
            gi.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarYadqdtsiqt = wkgbmnqykcVar.yadqdtsiqt();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarYadqdtsiqt, "getGetter(...)");
            return iobyxmoadgVar3.ppxfxbqfkf(nameResolver, ppxfxbqfkfVarYadqdtsiqt);
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return null;
            }
            return gxszxtbevo.iobyxmoadg((di.agtfadlqog) proto, nameResolver, typeTable, true, true, z13);
        }
        if (!wkgbmnqykcVar.jpowsppfya()) {
            return null;
        }
        pmvmpeiblj.iobyxmoadg iobyxmoadgVar4 = pmvmpeiblj.f16327zoijcleaow;
        gi.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarLmojexxdyd = wkgbmnqykcVar.lmojexxdyd();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarLmojexxdyd, "getSetter(...)");
        return iobyxmoadgVar4.ppxfxbqfkf(nameResolver, ppxfxbqfkfVarLmojexxdyd);
    }

    @Override // vi.nufgyqmvbu
    public List lqeggnwhkg(cllcsxoeiz container, di.agtfadlqog proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        return lereixgezr(container, proto, ppxfxbqfkf.BACKING_FIELD);
    }

    @Override // vi.nufgyqmvbu
    public List nufgyqmvbu(cllcsxoeiz container, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog callableProto, vi.wkgbmnqykc kind, int i13, di.yggfygwlhe proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callableProto, "callableProto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        pmvmpeiblj pmvmpeibljVarZdlpuopuiu = zdlpuopuiu(this, callableProto, container.zoijcleaow(), container.wkgbmnqykc(), kind, false, 16, null);
        if (pmvmpeibljVarZdlpuopuiu == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        return ojitshcjhn(this, container, pmvmpeiblj.f16327zoijcleaow.eablkybsjg(pmvmpeibljVarZdlpuopuiu, i13 + wflxmlrfwp(container, callableProto)), false, false, null, false, 60, null);
    }

    protected byte[] oxmwwwfdhm(cqumvgiudr kotlinClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinClass, "kotlinClass");
        return null;
    }

    protected final cqumvgiudr rgvfuqvkyq(cllcsxoeiz container, cqumvgiudr cqumvgiudrVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        if (cqumvgiudrVar != null) {
            return cqumvgiudrVar;
        }
        if (container instanceof cllcsxoeiz.iobyxmoadg) {
            return pmvmpeiblj((cllcsxoeiz.iobyxmoadg) container);
        }
        return null;
    }

    protected abstract iobyxmoadg vdvldrhtss(cqumvgiudr cqumvgiudrVar);

    @Override // vi.nufgyqmvbu
    public List wkgbmnqykc(di.vdvldrhtss proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        Object objJyumaefscl = proto.jyumaefscl(gi.iobyxmoadg.f37413gxszxtbevo);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objJyumaefscl, "getExtension(...)");
        Iterable<di.zoijcleaow> iterable = (Iterable) objJyumaefscl;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(iterable, 10));
        for (di.zoijcleaow zoijcleaowVar : iterable) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
            arrayList.add(iobyxmoadg(zoijcleaowVar, nameResolver));
        }
        return arrayList;
    }

    public abstract hi.eablkybsjg yggfygwlhe();

    @Override // vi.nufgyqmvbu
    public List zoijcleaow(cllcsxoeiz container, di.lqeggnwhkg proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        return ojitshcjhn(this, container, pmvmpeiblj.f16327zoijcleaow.iobyxmoadg(container.zoijcleaow().getString(proto.pkzmftpjix()), hi.zoijcleaow.zoijcleaow(((cllcsxoeiz.iobyxmoadg) container).eablkybsjg().zoijcleaow())), false, false, null, false, 60, null);
    }
}
