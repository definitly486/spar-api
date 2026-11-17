package wh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh.xrmfcynszj;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh extends mh.wwaezpbzkn {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f119756wwaezpbzkn = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(cdpycssgdh.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(cdpycssgdh.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gxszxtbevo f119757cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final kh.nufgyqmvbu f119758iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final yi.dxjokdxxww f119759istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zh.yggfygwlhe f119760lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final yi.dxjokdxxww f119761lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final vh.gtknphoqwx f119762pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final yi.dxjokdxxww f119763yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final hi.eablkybsjg f119764zynmafqrjb;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f119765iobyxmoadg;

        static {
            int[] iArr = new int[ci.iobyxmoadg.EnumC0363iobyxmoadg.values().length];
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ci.iobyxmoadg.EnumC0363iobyxmoadg.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f119765iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdpycssgdh(vh.gtknphoqwx outerContext, zh.yggfygwlhe jPackage) {
        super(outerContext.wkgbmnqykc(), jPackage.gxszxtbevo());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outerContext, "outerContext");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jPackage, "jPackage");
        this.f119760lereixgezr = jPackage;
        vh.gtknphoqwx gtknphoqwxVarGxszxtbevo = vh.ppxfxbqfkf.gxszxtbevo(outerContext, this, null, 0, 6, null);
        this.f119762pmvmpeiblj = gtknphoqwxVarGxszxtbevo;
        this.f119764zynmafqrjb = jj.ppxfxbqfkf.iobyxmoadg(outerContext.iobyxmoadg().zoijcleaow().gxszxtbevo().lqeggnwhkg());
        this.f119759istkbnxepw = gtknphoqwxVarGxszxtbevo.eablkybsjg().wkgbmnqykc(new pmvmpeiblj(this));
        this.f119757cdpycssgdh = new gxszxtbevo(gtknphoqwxVarGxszxtbevo, jPackage, this);
        this.f119763yadqdtsiqt = gtknphoqwxVarGxszxtbevo.eablkybsjg().lqeggnwhkg(new zynmafqrjb(this), hg.jyumaefscl.wflxmlrfwp());
        this.f119758iozdgvuglv = gtknphoqwxVarGxszxtbevo.iobyxmoadg().dxjokdxxww().zoijcleaow() ? kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow() : vh.nufgyqmvbu.iobyxmoadg(gtknphoqwxVarGxszxtbevo, jPackage);
        this.f119761lmojexxdyd = gtknphoqwxVarGxszxtbevo.eablkybsjg().wkgbmnqykc(new istkbnxepw(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ezmngbhpjk(cdpycssgdh cdpycssgdhVar) {
        Collection collectionJyumaefscl = cdpycssgdhVar.f119760lereixgezr.jyumaefscl();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionJyumaefscl, 10));
        Iterator it = collectionJyumaefscl.iterator();
        while (it.hasNext()) {
            arrayList.add(((zh.yggfygwlhe) it.next()).gxszxtbevo());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap fmlbqenlif(cdpycssgdh cdpycssgdhVar) {
        HashMap map = new HashMap();
        for (Map.Entry entry : cdpycssgdhVar.mhtqkkgtqm().entrySet()) {
            String str = (String) entry.getKey();
            bi.cqumvgiudr cqumvgiudrVar = (bi.cqumvgiudr) entry.getValue();
            qi.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = qi.wkgbmnqykc.wkgbmnqykc(str);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarWkgbmnqykc, "byInternalName(...)");
            ci.iobyxmoadg iobyxmoadgVarGxszxtbevo = cqumvgiudrVar.gxszxtbevo();
            int i13 = iobyxmoadg.f119765iobyxmoadg[iobyxmoadgVarGxszxtbevo.ppxfxbqfkf().ordinal()];
            if (i13 == 1) {
                String strEablkybsjg = iobyxmoadgVarGxszxtbevo.eablkybsjg();
                if (strEablkybsjg != null) {
                    map.put(wkgbmnqykcVarWkgbmnqykc, qi.wkgbmnqykc.wkgbmnqykc(strEablkybsjg));
                }
            } else if (i13 == 2) {
                map.put(wkgbmnqykcVarWkgbmnqykc, wkgbmnqykcVarWkgbmnqykc);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map ipoelvxyzq(cdpycssgdh cdpycssgdhVar) {
        bi.cdpycssgdh cdpycssgdhVarOjitshcjhn = cdpycssgdhVar.f119762pmvmpeiblj.iobyxmoadg().ojitshcjhn();
        String strZoijcleaow = cdpycssgdhVar.gxszxtbevo().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        List<String> listIobyxmoadg = cdpycssgdhVarOjitshcjhn.iobyxmoadg(strZoijcleaow);
        ArrayList arrayList = new ArrayList();
        for (String str : listIobyxmoadg) {
            ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
            ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = qi.wkgbmnqykc.wkgbmnqykc(str).eablkybsjg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            bi.cqumvgiudr cqumvgiudrVarIobyxmoadg = bi.iwizpuwonk.iobyxmoadg(cdpycssgdhVar.f119762pmvmpeiblj.iobyxmoadg().btonecajqb(), iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVarEablkybsjg), cdpycssgdhVar.f119764zynmafqrjb);
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudrVarIobyxmoadg != null ? gg.cqumvgiudr.iobyxmoadg(str, cqumvgiudrVarIobyxmoadg) : null;
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return hg.tzroggbefp.kcexrzcfyt(arrayList);
    }

    @Override // kh.zoijcleaow, kh.iobyxmoadg
    public kh.nufgyqmvbu getAnnotations() {
        return this.f119758iozdgvuglv;
    }

    public final jh.eablkybsjg grlcpdaxtj(zh.lqeggnwhkg jClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jClass, "jClass");
        return this.f119757cdpycssgdh.dxjokdxxww().yfnezrywwk(jClass);
    }

    @Override // jh.hkdspvbjdz
    /* JADX INFO: renamed from: ixidwrxhsl, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo agtfadlqog() {
        return this.f119757cdpycssgdh;
    }

    public final List jrbgnlbqoe() {
        return (List) this.f119763yadqdtsiqt.invoke();
    }

    @Override // mh.wwaezpbzkn, mh.agtfadlqog, jh.rgvfuqvkyq
    public xrmfcynszj lqeggnwhkg() {
        return new bi.esjtqupxsv(this);
    }

    public final Map mhtqkkgtqm() {
        return (Map) yi.wflxmlrfwp.iobyxmoadg(this.f119759istkbnxepw, this, f119756wwaezpbzkn[0]);
    }

    @Override // mh.wwaezpbzkn, mh.wflxmlrfwp
    public String toString() {
        return "Lazy Java package fragment: " + gxszxtbevo() + " of module " + this.f119762pmvmpeiblj.iobyxmoadg().wflxmlrfwp();
    }
}
