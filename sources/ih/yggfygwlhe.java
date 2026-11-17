package ih;

import bi.iozdgvuglv;
import bi.istkbnxepw;
import bi.zynmafqrjb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jh.cdpycssgdh;
import jh.iyctptxqzt;
import jh.jpowsppfya;
import jh.jztzpxfvev;
import jh.lereixgezr;
import jh.lmojexxdyd;
import jh.xrmfcynszj;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.yadqdtsiqt;
import mh.wwaezpbzkn;
import zi.crxdokpmqz;
import zi.ikoacuggdj;
import zi.kegysxyocb;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe implements lh.iobyxmoadg, lh.ppxfxbqfkf {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f44283dxjokdxxww = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(yggfygwlhe.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(yggfygwlhe.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(yggfygwlhe.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.dxjokdxxww f44284eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yi.iobyxmoadg f44285gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lmojexxdyd f44286iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final yi.dxjokdxxww f44287lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final yi.lqeggnwhkg f44288nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.dxjokdxxww f44289ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final kegysxyocb f44290wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ih.wkgbmnqykc f44291zoijcleaow;

    private enum iobyxmoadg {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f44296lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public static final class ppxfxbqfkf extends wwaezpbzkn {
        ppxfxbqfkf(lmojexxdyd lmojexxdydVar, ii.ppxfxbqfkf ppxfxbqfkfVar) {
            super(lmojexxdydVar, ppxfxbqfkfVar);
        }

        @Override // jh.hkdspvbjdz
        /* JADX INFO: renamed from: wizcaqwiak, reason: merged with bridge method [inline-methods] */
        public si.gtknphoqwx.zoijcleaow agtfadlqog() {
            return si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends jj.zoijcleaow.AbstractC1108zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f44299iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f44300zoijcleaow;

        wkgbmnqykc(String str, hkdspvbjdz hkdspvbjdzVar) {
            this.f44299iobyxmoadg = str;
            this.f44300zoijcleaow = hkdspvbjdzVar;
        }

        @Override // jj.zoijcleaow.wkgbmnqykc
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg() {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f44300zoijcleaow.f60015zdlpuopuiu;
            return iobyxmoadgVar == null ? iobyxmoadg.NOT_CONSIDERED : iobyxmoadgVar;
        }

        @Override // jj.zoijcleaow.wkgbmnqykc
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean ppxfxbqfkf(jh.eablkybsjg javaClassDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaClassDescriptor, "javaClassDescriptor");
            String strIobyxmoadg = zynmafqrjb.iobyxmoadg(iozdgvuglv.f16272iobyxmoadg, javaClassDescriptor, this.f44299iobyxmoadg);
            cqumvgiudr cqumvgiudrVar = cqumvgiudr.f44215iobyxmoadg;
            if (cqumvgiudrVar.gxszxtbevo().contains(strIobyxmoadg)) {
                this.f44300zoijcleaow.f60015zdlpuopuiu = iobyxmoadg.HIDDEN;
            } else if (cqumvgiudrVar.dxjokdxxww().contains(strIobyxmoadg)) {
                this.f44300zoijcleaow.f60015zdlpuopuiu = iobyxmoadg.VISIBLE;
            } else if (cqumvgiudrVar.ppxfxbqfkf().contains(strIobyxmoadg)) {
                this.f44300zoijcleaow.f60015zdlpuopuiu = iobyxmoadg.DEPRECATED_LIST_METHODS;
            } else if (cqumvgiudrVar.wkgbmnqykc().contains(strIobyxmoadg)) {
                this.f44300zoijcleaow.f60015zdlpuopuiu = iobyxmoadg.DROP;
            }
            return this.f44300zoijcleaow.f60015zdlpuopuiu == null;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f44301iobyxmoadg;

        static {
            int[] iArr = new int[iobyxmoadg.values().length];
            try {
                iArr[iobyxmoadg.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iobyxmoadg.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iobyxmoadg.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[iobyxmoadg.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[iobyxmoadg.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44301iobyxmoadg = iArr;
        }
    }

    public yggfygwlhe(lmojexxdyd moduleDescriptor, yi.agtfadlqog storageManager, tg.iobyxmoadg settingsComputation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(settingsComputation, "settingsComputation");
        this.f44286iobyxmoadg = moduleDescriptor;
        this.f44291zoijcleaow = ih.wkgbmnqykc.f44282iobyxmoadg;
        this.f44289ppxfxbqfkf = storageManager.wkgbmnqykc(settingsComputation);
        this.f44290wkgbmnqykc = vdvldrhtss(storageManager);
        this.f44284eablkybsjg = storageManager.wkgbmnqykc(new draadjrbmk(this, storageManager));
        this.f44285gxszxtbevo = storageManager.ppxfxbqfkf();
        this.f44287lqeggnwhkg = storageManager.wkgbmnqykc(new wflxmlrfwp(this));
        this.f44288nufgyqmvbu = storageManager.dxjokdxxww(new agtfadlqog(this));
    }

    private final gtknphoqwx.zoijcleaow cdpycssgdh() {
        return (gtknphoqwx.zoijcleaow) yi.wflxmlrfwp.iobyxmoadg(this.f44289ppxfxbqfkf, this, f44283dxjokdxxww[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection cqumvgiudr(ii.gxszxtbevo gxszxtbevoVar, si.gtknphoqwx it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.wkgbmnqykc(gxszxtbevoVar, rh.wkgbmnqykc.FROM_BUILTINS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable iozdgvuglv(jh.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.iobyxmoadg().eablkybsjg();
    }

    private final kh.nufgyqmvbu istkbnxepw() {
        return (kh.nufgyqmvbu) yi.wflxmlrfwp.iobyxmoadg(this.f44287lqeggnwhkg, this, f44283dxjokdxxww[2]);
    }

    private static final boolean iwizpuwonk(jh.draadjrbmk draadjrbmkVar, wizcaqwiak wizcaqwiakVar, jh.draadjrbmk draadjrbmkVar2) {
        return li.ojitshcjhn.cqumvgiudr(draadjrbmkVar, draadjrbmkVar2.ppxfxbqfkf(wizcaqwiakVar)) == li.ojitshcjhn.dxjokdxxww.iobyxmoadg.OVERRIDABLE;
    }

    private final ikoacuggdj jyumaefscl() {
        return (ikoacuggdj) yi.wflxmlrfwp.iobyxmoadg(this.f44284eablkybsjg, this, f44283dxjokdxxww[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kh.nufgyqmvbu kcexrzcfyt(yggfygwlhe yggfygwlheVar, gg.vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<destruct>");
        String str = (String) vdvldrhtssVar.iobyxmoadg();
        String str2 = (String) vdvldrhtssVar.wkgbmnqykc();
        return kh.nufgyqmvbu.f55413nufgyqmvbu.iobyxmoadg(hg.jyumaefscl.eablkybsjg(kh.lqeggnwhkg.zoijcleaow(yggfygwlheVar.f44286iobyxmoadg.wflxmlrfwp(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final wh.agtfadlqog lereixgezr(jh.eablkybsjg eablkybsjgVar) {
        ii.zoijcleaow zoijcleaowVarAgtfadlqog;
        ii.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg;
        if (gh.dxjokdxxww.vipkmwdibw(eablkybsjgVar) || !gh.dxjokdxxww.dvvnrvtcbc(eablkybsjgVar)) {
            return null;
        }
        ii.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = pi.eablkybsjg.rgvfuqvkyq(eablkybsjgVar);
        if (!wkgbmnqykcVarRgvfuqvkyq.gxszxtbevo() || (zoijcleaowVarAgtfadlqog = ih.ppxfxbqfkf.f44265iobyxmoadg.agtfadlqog(wkgbmnqykcVarRgvfuqvkyq)) == null || (ppxfxbqfkfVarIobyxmoadg = zoijcleaowVarAgtfadlqog.iobyxmoadg()) == null) {
            return null;
        }
        jh.eablkybsjg eablkybsjgVarWkgbmnqykc = jh.kcexrzcfyt.wkgbmnqykc(cdpycssgdh().iobyxmoadg(), ppxfxbqfkfVarIobyxmoadg, rh.wkgbmnqykc.FROM_BUILTINS);
        if (eablkybsjgVarWkgbmnqykc instanceof wh.agtfadlqog) {
            return (wh.agtfadlqog) eablkybsjgVarWkgbmnqykc;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Boolean lmojexxdyd(yggfygwlhe yggfygwlheVar, jh.zoijcleaow zoijcleaowVar) {
        boolean z13;
        if (zoijcleaowVar.getKind() == jh.zoijcleaow.iobyxmoadg.DECLARATION) {
            ih.wkgbmnqykc wkgbmnqykcVar = yggfygwlheVar.f44291zoijcleaow;
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = zoijcleaowVar.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (wkgbmnqykcVar.ppxfxbqfkf((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow)) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ikoacuggdj ojitshcjhn(yggfygwlhe yggfygwlheVar, yi.agtfadlqog agtfadlqogVar) {
        return jh.esjtqupxsv.wkgbmnqykc(yggfygwlheVar.cdpycssgdh().iobyxmoadg(), lqeggnwhkg.f44250wkgbmnqykc.iobyxmoadg(), new jpowsppfya(agtfadlqogVar, yggfygwlheVar.cdpycssgdh().iobyxmoadg())).ojitshcjhn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb oxmwwwfdhm(yggfygwlhe yggfygwlheVar) {
        ikoacuggdj ikoacuggdjVarDxjokdxxww = yggfygwlheVar.f44286iobyxmoadg.wflxmlrfwp().dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDxjokdxxww, "getAnyType(...)");
        return ikoacuggdjVarDxjokdxxww;
    }

    private final iobyxmoadg pmvmpeiblj(lereixgezr lereixgezrVar) {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = lereixgezrVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objZoijcleaow = jj.zoijcleaow.zoijcleaow(hg.jyumaefscl.eablkybsjg((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow), new zdlpuopuiu(this), new wkgbmnqykc(istkbnxepw.ppxfxbqfkf(lereixgezrVar, false, false, 3, null), new hkdspvbjdz()));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "dfs(...)");
        return (iobyxmoadg) objZoijcleaow;
    }

    private final jztzpxfvev rgvfuqvkyq(xi.wflxmlrfwp wflxmlrfwpVar, jztzpxfvev jztzpxfvevVar) {
        lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = jztzpxfvevVar.yggfygwlhe();
        iobyxmoadgVarYggfygwlhe.gxszxtbevo(wflxmlrfwpVar);
        iobyxmoadgVarYggfygwlhe.eablkybsjg(jh.zdlpuopuiu.f51354eablkybsjg);
        iobyxmoadgVarYggfygwlhe.wkgbmnqykc(wflxmlrfwpVar.ojitshcjhn());
        iobyxmoadgVarYggfygwlhe.dxjokdxxww(wflxmlrfwpVar.fiwbwshyhd());
        lereixgezr lereixgezrVarBuild = iobyxmoadgVarYggfygwlhe.build();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lereixgezrVarBuild);
        return (jztzpxfvev) lereixgezrVarBuild;
    }

    private final kegysxyocb vdvldrhtss(yi.agtfadlqog agtfadlqogVar) {
        mh.gtknphoqwx gtknphoqwxVar = new mh.gtknphoqwx(new ppxfxbqfkf(this.f44286iobyxmoadg, new ii.ppxfxbqfkf("java.io")), ii.gxszxtbevo.gxszxtbevo("Serializable"), cdpycssgdh.ABSTRACT, jh.gxszxtbevo.INTERFACE, hg.jyumaefscl.eablkybsjg(new crxdokpmqz(agtfadlqogVar, new ojitshcjhn(this))), xrmfcynszj.f51348iobyxmoadg, false, agtfadlqogVar);
        gtknphoqwxVar.ageimvtcrz(si.gtknphoqwx.zoijcleaow.f106714zoijcleaow, hg.ikoacuggdj.eablkybsjg(), null);
        ikoacuggdj ikoacuggdjVarOjitshcjhn = gtknphoqwxVar.ojitshcjhn();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
        return ikoacuggdjVarOjitshcjhn;
    }

    private final boolean wwaezpbzkn(jh.draadjrbmk draadjrbmkVar, jh.eablkybsjg eablkybsjgVar) {
        if (draadjrbmkVar.dxjokdxxww().size() == 1) {
            List listDxjokdxxww = draadjrbmkVar.dxjokdxxww();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ((iyctptxqzt) hg.jyumaefscl.yzdjzghtvl(listDxjokdxxww)).getType().grlcpdaxtj().ylkuphrtab();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbuVarWkgbmnqykc != null ? pi.eablkybsjg.rgvfuqvkyq(nufgyqmvbuVarWkgbmnqykc) : null, pi.eablkybsjg.rgvfuqvkyq(eablkybsjgVar))) {
                return true;
            }
        }
        return false;
    }

    private final boolean yadqdtsiqt(jztzpxfvev jztzpxfvevVar, boolean z13) {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = jztzpxfvevVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strPpxfxbqfkf = istkbnxepw.ppxfxbqfkf(jztzpxfvevVar, false, false, 3, null);
        if (z13 ^ cqumvgiudr.f44215iobyxmoadg.lqeggnwhkg().contains(zynmafqrjb.iobyxmoadg(iozdgvuglv.f16272iobyxmoadg, (jh.eablkybsjg) wflxmlrfwpVarZoijcleaow, strPpxfxbqfkf))) {
            return true;
        }
        Boolean boolEablkybsjg = jj.zoijcleaow.eablkybsjg(hg.jyumaefscl.eablkybsjg(jztzpxfvevVar), oxmwwwfdhm.f44257iobyxmoadg, new kcexrzcfyt(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(boolEablkybsjg, "ifAny(...)");
        return boolEablkybsjg.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.eablkybsjg yggfygwlhe(wh.agtfadlqog agtfadlqogVar, jh.eablkybsjg eablkybsjgVar) {
        th.btonecajqb EMPTY = th.btonecajqb.f110485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(EMPTY, "EMPTY");
        return agtfadlqogVar.ixidwrxhsl(EMPTY, eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kh.nufgyqmvbu ylkuphrtab(yggfygwlhe yggfygwlheVar) {
        return kh.nufgyqmvbu.f55413nufgyqmvbu.iobyxmoadg(hg.jyumaefscl.eablkybsjg(kh.lqeggnwhkg.ppxfxbqfkf(yggfygwlheVar.f44286iobyxmoadg.wflxmlrfwp(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    private final Collection zdlpuopuiu(jh.eablkybsjg eablkybsjgVar, tg.draadjrbmk draadjrbmkVar) {
        wh.agtfadlqog agtfadlqogVarLereixgezr = lereixgezr(eablkybsjgVar);
        if (agtfadlqogVarLereixgezr == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Collection collectionLqeggnwhkg = this.f44291zoijcleaow.lqeggnwhkg(pi.eablkybsjg.ojitshcjhn(agtfadlqogVarLereixgezr), ih.zoijcleaow.f44304nufgyqmvbu.iobyxmoadg());
        jh.eablkybsjg eablkybsjgVar2 = (jh.eablkybsjg) hg.jyumaefscl.igdgnonuha(collectionLqeggnwhkg);
        if (eablkybsjgVar2 == null) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        jj.draadjrbmk.zoijcleaow zoijcleaowVar = jj.draadjrbmk.f51581jyumaefscl;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionLqeggnwhkg, 10));
        Iterator it = collectionLqeggnwhkg.iterator();
        while (it.hasNext()) {
            arrayList.add(pi.eablkybsjg.ojitshcjhn((jh.eablkybsjg) it.next()));
        }
        jj.draadjrbmk draadjrbmkVarZoijcleaow = zoijcleaowVar.zoijcleaow(arrayList);
        boolean zPpxfxbqfkf = this.f44291zoijcleaow.ppxfxbqfkf(eablkybsjgVar);
        si.gtknphoqwx gtknphoqwxVarNtlheqmsrt = ((jh.eablkybsjg) this.f44285gxszxtbevo.iobyxmoadg(pi.eablkybsjg.ojitshcjhn(agtfadlqogVarLereixgezr), new vdvldrhtss(agtfadlqogVarLereixgezr, eablkybsjgVar2))).ntlheqmsrt();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarNtlheqmsrt, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) draadjrbmkVar.invoke(gtknphoqwxVarNtlheqmsrt);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            jztzpxfvev jztzpxfvevVar = (jztzpxfvev) obj;
            if (jztzpxfvevVar.getKind() == jh.zoijcleaow.iobyxmoadg.DECLARATION && jztzpxfvevVar.getVisibility().wkgbmnqykc() && !gh.dxjokdxxww.yfnezrywwk(jztzpxfvevVar)) {
                Collection collectionEablkybsjg = jztzpxfvevVar.eablkybsjg();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "getOverriddenDescriptors(...)");
                Collection collection = collectionEablkybsjg;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = ((lereixgezr) it2.next()).zoijcleaow();
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
                            if (draadjrbmkVarZoijcleaow.contains(pi.eablkybsjg.ojitshcjhn(wflxmlrfwpVarZoijcleaow))) {
                            }
                        }
                    }
                }
                if (!yadqdtsiqt(jztzpxfvevVar, zPpxfxbqfkf)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable zynmafqrjb(yggfygwlhe yggfygwlheVar, jh.eablkybsjg eablkybsjgVar) {
        Collection collectionZoijcleaow = eablkybsjgVar.btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZoijcleaow.iterator();
        while (it.hasNext()) {
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ((kegysxyocb) it.next()).grlcpdaxtj().ylkuphrtab();
            jh.eablkybsjg eablkybsjgVarLereixgezr = null;
            jh.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = nufgyqmvbuVarWkgbmnqykc != null ? nufgyqmvbuVarWkgbmnqykc.iobyxmoadg() : null;
            jh.eablkybsjg eablkybsjgVar2 = nufgyqmvbuVarIobyxmoadg instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarIobyxmoadg : null;
            if (eablkybsjgVar2 != null && (eablkybsjgVarLereixgezr = yggfygwlheVar.lereixgezr(eablkybsjgVar2)) == null) {
                eablkybsjgVarLereixgezr = eablkybsjgVar2;
            }
            if (eablkybsjgVarLereixgezr != null) {
                arrayList.add(eablkybsjgVarLereixgezr);
            }
        }
        return arrayList;
    }

    @Override // lh.iobyxmoadg
    public Collection eablkybsjg(jh.eablkybsjg classDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        ii.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = pi.eablkybsjg.rgvfuqvkyq(classDescriptor);
        cqumvgiudr cqumvgiudrVar = cqumvgiudr.f44215iobyxmoadg;
        if (cqumvgiudrVar.btonecajqb(wkgbmnqykcVarRgvfuqvkyq)) {
            return hg.jyumaefscl.rgvfuqvkyq(jyumaefscl(), this.f44290wkgbmnqykc);
        }
        return cqumvgiudrVar.gtknphoqwx(wkgbmnqykcVarRgvfuqvkyq) ? hg.jyumaefscl.eablkybsjg(this.f44290wkgbmnqykc) : hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // lh.iobyxmoadg
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public Set ppxfxbqfkf(jh.eablkybsjg classDescriptor) {
        wh.lereixgezr lereixgezrVarYzdjzghtvl;
        Set setIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        if (!cdpycssgdh().zoijcleaow()) {
            return hg.ikoacuggdj.eablkybsjg();
        }
        wh.agtfadlqog agtfadlqogVarLereixgezr = lereixgezr(classDescriptor);
        return (agtfadlqogVarLereixgezr == null || (lereixgezrVarYzdjzghtvl = agtfadlqogVarLereixgezr.ntlheqmsrt()) == null || (setIobyxmoadg = lereixgezrVarYzdjzghtvl.iobyxmoadg()) == null) ? hg.ikoacuggdj.eablkybsjg() : setIobyxmoadg;
    }

    @Override // lh.iobyxmoadg
    public Collection iobyxmoadg(jh.eablkybsjg classDescriptor) {
        jh.eablkybsjg eablkybsjgVarGxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != jh.gxszxtbevo.CLASS || !cdpycssgdh().zoijcleaow()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        wh.agtfadlqog agtfadlqogVarLereixgezr = lereixgezr(classDescriptor);
        if (agtfadlqogVarLereixgezr != null && (eablkybsjgVarGxszxtbevo = ih.wkgbmnqykc.gxszxtbevo(this.f44291zoijcleaow, pi.eablkybsjg.ojitshcjhn(agtfadlqogVarLereixgezr), ih.zoijcleaow.f44304nufgyqmvbu.iobyxmoadg(), null, 4, null)) != null) {
            wizcaqwiak wizcaqwiakVarPpxfxbqfkf = esjtqupxsv.iobyxmoadg(eablkybsjgVarGxszxtbevo, agtfadlqogVarLereixgezr).ppxfxbqfkf();
            List listFmlbqenlif = agtfadlqogVarLereixgezr.gtknphoqwx();
            ArrayList<jh.wkgbmnqykc> arrayList = new ArrayList();
            for (Object obj : listFmlbqenlif) {
                jh.wkgbmnqykc wkgbmnqykcVar = (jh.wkgbmnqykc) obj;
                if (wkgbmnqykcVar.getVisibility().wkgbmnqykc()) {
                    Collection collectionGtknphoqwx = eablkybsjgVarGxszxtbevo.gtknphoqwx();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionGtknphoqwx, "getConstructors(...)");
                    Collection collection = collectionGtknphoqwx;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                jh.wkgbmnqykc wkgbmnqykcVar2 = (jh.wkgbmnqykc) it.next();
                                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar2);
                                if (iwizpuwonk(wkgbmnqykcVar2, wizcaqwiakVarPpxfxbqfkf, wkgbmnqykcVar)) {
                                }
                            }
                        }
                    }
                    if (!wwaezpbzkn(wkgbmnqykcVar, classDescriptor) && !gh.dxjokdxxww.yfnezrywwk(wkgbmnqykcVar) && !cqumvgiudr.f44215iobyxmoadg.eablkybsjg().contains(zynmafqrjb.iobyxmoadg(iozdgvuglv.f16272iobyxmoadg, agtfadlqogVarLereixgezr, istkbnxepw.ppxfxbqfkf(wkgbmnqykcVar, false, false, 3, null)))) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
            for (jh.wkgbmnqykc wkgbmnqykcVar3 : arrayList) {
                lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = wkgbmnqykcVar3.yggfygwlhe();
                iobyxmoadgVarYggfygwlhe.gxszxtbevo(classDescriptor);
                iobyxmoadgVarYggfygwlhe.wkgbmnqykc(classDescriptor.ojitshcjhn());
                iobyxmoadgVarYggfygwlhe.wflxmlrfwp();
                iobyxmoadgVarYggfygwlhe.nufgyqmvbu(wizcaqwiakVarPpxfxbqfkf.btonecajqb());
                if (!cqumvgiudr.f44215iobyxmoadg.nufgyqmvbu().contains(zynmafqrjb.iobyxmoadg(iozdgvuglv.f16272iobyxmoadg, agtfadlqogVarLereixgezr, istkbnxepw.ppxfxbqfkf(wkgbmnqykcVar3, false, false, 3, null)))) {
                    iobyxmoadgVarYggfygwlhe.rgvfuqvkyq(istkbnxepw());
                }
                lereixgezr lereixgezrVarBuild = iobyxmoadgVarYggfygwlhe.build();
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(lereixgezrVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((jh.wkgbmnqykc) lereixgezrVarBuild);
            }
            return arrayList2;
        }
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // lh.ppxfxbqfkf
    public boolean wkgbmnqykc(jh.eablkybsjg classDescriptor, jztzpxfvev functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        wh.agtfadlqog agtfadlqogVarLereixgezr = lereixgezr(classDescriptor);
        if (agtfadlqogVarLereixgezr == null || !functionDescriptor.getAnnotations().wizcaqwiak(lh.wkgbmnqykc.iobyxmoadg())) {
            return true;
        }
        if (!cdpycssgdh().zoijcleaow()) {
            return false;
        }
        String strPpxfxbqfkf = istkbnxepw.ppxfxbqfkf(functionDescriptor, false, false, 3, null);
        wh.lereixgezr lereixgezrVarYzdjzghtvl = agtfadlqogVarLereixgezr.ntlheqmsrt();
        ii.gxszxtbevo name = functionDescriptor.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        Collection collectionWkgbmnqykc = lereixgezrVarYzdjzghtvl.wkgbmnqykc(name, rh.wkgbmnqykc.FROM_BUILTINS);
        if (!(collectionWkgbmnqykc instanceof Collection) || !collectionWkgbmnqykc.isEmpty()) {
            Iterator it = collectionWkgbmnqykc.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(istkbnxepw.ppxfxbqfkf((jztzpxfvev) it.next(), false, false, 3, null), strPpxfxbqfkf)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // lh.iobyxmoadg
    public Collection zoijcleaow(ii.gxszxtbevo name, jh.eablkybsjg classDescriptor) {
        kh.nufgyqmvbu nufgyqmvbuVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name, ih.iobyxmoadg.f44240eablkybsjg.iobyxmoadg()) && (classDescriptor instanceof xi.wflxmlrfwp) && gh.dxjokdxxww.okpsazkaxt(classDescriptor)) {
            xi.wflxmlrfwp wflxmlrfwpVar = (xi.wflxmlrfwp) classDescriptor;
            List listMhtqkkgtqm = wflxmlrfwpVar.h().mhtqkkgtqm();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listMhtqkkgtqm, "getFunctionList(...)");
            if (listMhtqkkgtqm == null || !listMhtqkkgtqm.isEmpty()) {
                Iterator it = listMhtqkkgtqm.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vi.jpowsppfya.zoijcleaow(wflxmlrfwpVar.g().lqeggnwhkg(), ((di.dxjokdxxww) it.next()).czzsidtyhn()), ih.iobyxmoadg.f44240eablkybsjg.iobyxmoadg())) {
                        return hg.jyumaefscl.wflxmlrfwp();
                    }
                }
            }
            return hg.jyumaefscl.eablkybsjg(rgvfuqvkyq(wflxmlrfwpVar, (jztzpxfvev) hg.jyumaefscl.rhgxfdycjh(jyumaefscl().agtfadlqog().wkgbmnqykc(name, rh.wkgbmnqykc.FROM_BUILTINS))));
        }
        if (!cdpycssgdh().zoijcleaow()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Collection<jztzpxfvev> collectionZdlpuopuiu = zdlpuopuiu(classDescriptor, new rgvfuqvkyq(name));
        ArrayList arrayList = new ArrayList();
        for (jztzpxfvev jztzpxfvevVar : collectionZdlpuopuiu) {
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = jztzpxfvevVar.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            lereixgezr lereixgezrVarPpxfxbqfkf = jztzpxfvevVar.ppxfxbqfkf(esjtqupxsv.iobyxmoadg((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow, classDescriptor).ppxfxbqfkf());
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(lereixgezrVarPpxfxbqfkf, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = ((jztzpxfvev) lereixgezrVarPpxfxbqfkf).yggfygwlhe();
            iobyxmoadgVarYggfygwlhe.gxszxtbevo(classDescriptor);
            iobyxmoadgVarYggfygwlhe.dxjokdxxww(classDescriptor.fiwbwshyhd());
            iobyxmoadgVarYggfygwlhe.wflxmlrfwp();
            int i13 = zoijcleaow.f44301iobyxmoadg[pmvmpeiblj(jztzpxfvevVar).ordinal()];
            jztzpxfvev jztzpxfvevVar2 = null;
            if (i13 != 1) {
                if (i13 == 2) {
                    ii.gxszxtbevo name2 = jztzpxfvevVar.getName();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name2, jyumaefscl.f44243iobyxmoadg)) {
                        nufgyqmvbuVar = (kh.nufgyqmvbu) this.f44288nufgyqmvbu.invoke(gg.cqumvgiudr.iobyxmoadg(jztzpxfvevVar.getName().zoijcleaow(), "first"));
                    } else {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(name2, jyumaefscl.f44244zoijcleaow)) {
                            throw new IllegalStateException(("Unexpected name: " + jztzpxfvevVar.getName()).toString());
                        }
                        nufgyqmvbuVar = (kh.nufgyqmvbu) this.f44288nufgyqmvbu.invoke(gg.cqumvgiudr.iobyxmoadg(jztzpxfvevVar.getName().zoijcleaow(), "last"));
                    }
                    iobyxmoadgVarYggfygwlhe.rgvfuqvkyq(nufgyqmvbuVar);
                } else if (i13 == 3) {
                    iobyxmoadgVarYggfygwlhe.rgvfuqvkyq(istkbnxepw());
                } else if (i13 != 4) {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                lereixgezr lereixgezrVarBuild = iobyxmoadgVarYggfygwlhe.build();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lereixgezrVarBuild);
                jztzpxfvevVar2 = (jztzpxfvev) lereixgezrVarBuild;
            } else if (!jh.yadqdtsiqt.iobyxmoadg(classDescriptor)) {
                iobyxmoadgVarYggfygwlhe.lqeggnwhkg();
                lereixgezr lereixgezrVarBuild2 = iobyxmoadgVarYggfygwlhe.build();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lereixgezrVarBuild2);
                jztzpxfvevVar2 = (jztzpxfvev) lereixgezrVarBuild2;
            }
            if (jztzpxfvevVar2 != null) {
                arrayList.add(jztzpxfvevVar2);
            }
        }
        return arrayList;
    }
}
