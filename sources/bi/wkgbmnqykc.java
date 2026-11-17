package bi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jh.xrmfcynszj;
import vi.cllcsxoeiz;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc extends eablkybsjg implements vi.eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.lqeggnwhkg f16332ppxfxbqfkf;

    public static final class iobyxmoadg implements cqumvgiudr.wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ HashMap f16333eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f16335ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ HashMap f16336wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ HashMap f16337zoijcleaow;

        /* JADX INFO: renamed from: bi.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public final class C0294iobyxmoadg extends zoijcleaow implements cqumvgiudr.eablkybsjg {

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f16338wkgbmnqykc;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0294iobyxmoadg(iobyxmoadg iobyxmoadgVar, pmvmpeiblj signature) {
                super(iobyxmoadgVar, signature);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
                this.f16338wkgbmnqykc = iobyxmoadgVar;
            }

            @Override // bi.cqumvgiudr.eablkybsjg
            public cqumvgiudr.iobyxmoadg ppxfxbqfkf(int i13, ii.zoijcleaow classId, xrmfcynszj source) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
                pmvmpeiblj pmvmpeibljVarEablkybsjg = pmvmpeiblj.f16327zoijcleaow.eablkybsjg(wkgbmnqykc(), i13);
                List arrayList = (List) this.f16338wkgbmnqykc.f16337zoijcleaow.get(pmvmpeibljVarEablkybsjg);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f16338wkgbmnqykc.f16337zoijcleaow.put(pmvmpeibljVarEablkybsjg, arrayList);
                }
                return wkgbmnqykc.this.esjtqupxsv(classId, source, arrayList);
            }
        }

        public class zoijcleaow implements cqumvgiudr.ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final pmvmpeiblj f16339iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f16340ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final ArrayList f16341zoijcleaow;

            public zoijcleaow(iobyxmoadg iobyxmoadgVar, pmvmpeiblj signature) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
                this.f16340ppxfxbqfkf = iobyxmoadgVar;
                this.f16339iobyxmoadg = signature;
                this.f16341zoijcleaow = new ArrayList();
            }

            @Override // bi.cqumvgiudr.ppxfxbqfkf
            public void iobyxmoadg() {
                if (this.f16341zoijcleaow.isEmpty()) {
                    return;
                }
                this.f16340ppxfxbqfkf.f16337zoijcleaow.put(this.f16339iobyxmoadg, this.f16341zoijcleaow);
            }

            protected final pmvmpeiblj wkgbmnqykc() {
                return this.f16339iobyxmoadg;
            }

            @Override // bi.cqumvgiudr.ppxfxbqfkf
            public cqumvgiudr.iobyxmoadg zoijcleaow(ii.zoijcleaow classId, xrmfcynszj source) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
                return wkgbmnqykc.this.esjtqupxsv(classId, source, this.f16341zoijcleaow);
            }
        }

        iobyxmoadg(HashMap map, cqumvgiudr cqumvgiudrVar, HashMap map2, HashMap map3) {
            this.f16337zoijcleaow = map;
            this.f16335ppxfxbqfkf = cqumvgiudrVar;
            this.f16336wkgbmnqykc = map2;
            this.f16333eablkybsjg = map3;
        }

        @Override // bi.cqumvgiudr.wkgbmnqykc
        public cqumvgiudr.eablkybsjg iobyxmoadg(ii.gxszxtbevo name, String desc) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            pmvmpeiblj.iobyxmoadg iobyxmoadgVar = pmvmpeiblj.f16327zoijcleaow;
            String strZoijcleaow = name.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            return new C0294iobyxmoadg(this, iobyxmoadgVar.wkgbmnqykc(strZoijcleaow, desc));
        }

        @Override // bi.cqumvgiudr.wkgbmnqykc
        public cqumvgiudr.ppxfxbqfkf zoijcleaow(ii.gxszxtbevo name, String desc, Object obj) {
            Object objYlkuphrtab;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            pmvmpeiblj.iobyxmoadg iobyxmoadgVar = pmvmpeiblj.f16327zoijcleaow;
            String strZoijcleaow = name.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            pmvmpeiblj pmvmpeibljVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(strZoijcleaow, desc);
            if (obj != null && (objYlkuphrtab = wkgbmnqykc.this.ylkuphrtab(desc, obj)) != null) {
                this.f16333eablkybsjg.put(pmvmpeibljVarIobyxmoadg, objYlkuphrtab);
            }
            return new zoijcleaow(this, pmvmpeibljVarIobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(yi.agtfadlqog storageManager, jyumaefscl kotlinClassFinder) {
        super(kotlinClassFinder);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinClassFinder, "kotlinClassFinder");
        this.f16332ppxfxbqfkf = storageManager.dxjokdxxww(new bi.iobyxmoadg(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hcddaimhww(lqeggnwhkg loadConstantFromProperty, pmvmpeiblj it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadConstantFromProperty, "$this$loadConstantFromProperty");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return loadConstantFromProperty.ppxfxbqfkf().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg jpowsppfya(wkgbmnqykc wkgbmnqykcVar, cqumvgiudr kotlinClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinClass, "kotlinClass");
        return wkgbmnqykcVar.wwaezpbzkn(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lmojexxdyd(lqeggnwhkg loadConstantFromProperty, pmvmpeiblj it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadConstantFromProperty, "$this$loadConstantFromProperty");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return loadConstantFromProperty.zoijcleaow().get(it);
    }

    private final Object pkzmftpjix(cllcsxoeiz cllcsxoeizVar, di.agtfadlqog agtfadlqogVar, vi.wkgbmnqykc wkgbmnqykcVar, kegysxyocb kegysxyocbVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        Object objInvoke;
        cqumvgiudr cqumvgiudrVarRgvfuqvkyq = rgvfuqvkyq(cllcsxoeizVar, eablkybsjg.f16256zoijcleaow.iobyxmoadg(cllcsxoeizVar, true, true, fi.zoijcleaow.f33950zynmafqrjb.wkgbmnqykc(agtfadlqogVar.xrmfcynszj()), hi.dxjokdxxww.gxszxtbevo(agtfadlqogVar), jyumaefscl(), yggfygwlhe()));
        if (cqumvgiudrVarRgvfuqvkyq == null) {
            return null;
        }
        pmvmpeiblj pmvmpeibljVarKcexrzcfyt = kcexrzcfyt(agtfadlqogVar, cllcsxoeizVar.zoijcleaow(), cllcsxoeizVar.wkgbmnqykc(), wkgbmnqykcVar, cqumvgiudrVarRgvfuqvkyq.gxszxtbevo().wkgbmnqykc().wkgbmnqykc(agtfadlqog.f16253zoijcleaow.iobyxmoadg()));
        if (pmvmpeibljVarKcexrzcfyt == null || (objInvoke = rgvfuqvkyqVar.invoke(this.f16332ppxfxbqfkf.invoke(cqumvgiudrVarRgvfuqvkyq), pmvmpeibljVarKcexrzcfyt)) == null) {
            return null;
        }
        return gh.kcexrzcfyt.wkgbmnqykc(kegysxyocbVar) ? hkdspvbjdz(objInvoke) : objInvoke;
    }

    private final lqeggnwhkg wwaezpbzkn(cqumvgiudr cqumvgiudrVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        cqumvgiudrVar.wkgbmnqykc(new iobyxmoadg(map, cqumvgiudrVar, map3, map2), oxmwwwfdhm(cqumvgiudrVar));
        return new lqeggnwhkg(map, map2, map3);
    }

    @Override // vi.eablkybsjg
    public Object eablkybsjg(cllcsxoeiz container, di.agtfadlqog proto, kegysxyocb expectedType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(expectedType, "expectedType");
        return pkzmftpjix(container, proto, vi.wkgbmnqykc.PROPERTY_GETTER, expectedType, zoijcleaow.f16367zdlpuopuiu);
    }

    protected abstract Object hkdspvbjdz(Object obj);

    protected final boolean iozdgvuglv(ii.zoijcleaow annotationClassId, Map arguments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arguments, "arguments");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(annotationClassId, fh.iobyxmoadg.f33812iobyxmoadg.iobyxmoadg())) {
            return false;
        }
        Object obj = arguments.get(ii.gxszxtbevo.gxszxtbevo("value"));
        ni.kcexrzcfyt kcexrzcfytVar = obj instanceof ni.kcexrzcfyt ? (ni.kcexrzcfyt) obj : null;
        if (kcexrzcfytVar == null) {
            return false;
        }
        Object objZoijcleaow = kcexrzcfytVar.zoijcleaow();
        ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow c1512zoijcleaow = objZoijcleaow instanceof ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow ? (ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow) objZoijcleaow : null;
        if (c1512zoijcleaow == null) {
            return false;
        }
        return iwizpuwonk(c1512zoijcleaow.zoijcleaow());
    }

    @Override // vi.eablkybsjg
    public Object ppxfxbqfkf(cllcsxoeiz container, di.agtfadlqog proto, kegysxyocb expectedType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(expectedType, "expectedType");
        return pkzmftpjix(container, proto, vi.wkgbmnqykc.PROPERTY, expectedType, ppxfxbqfkf.f16329zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bi.eablkybsjg
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg vdvldrhtss(cqumvgiudr binaryClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binaryClass, "binaryClass");
        return (lqeggnwhkg) this.f16332ppxfxbqfkf.invoke(binaryClass);
    }

    protected abstract Object ylkuphrtab(String str, Object obj);
}
