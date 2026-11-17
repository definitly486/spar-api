package zi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class auzgnhcxok {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f130000gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.lqeggnwhkg f130001eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iozdgvuglv f130002iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.gxszxtbevo f130003ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f130004wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tbqsvytpvh f130005zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:57:0x0136  */
        /* JADX WARN: Code duplicated, block: B:88:0x01cf  */
        public final kegysxyocb iobyxmoadg(kegysxyocb kegysxyocbVar, wizcaqwiak substitutor, Set set, boolean z13) {
            grlcpdaxtj grlcpdaxtjVarGxszxtbevo;
            kegysxyocb type;
            kegysxyocb type2;
            kegysxyocb type3;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(substitutor, "substitutor");
            grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
            if (grlcpdaxtjVarJrbgnlbqoe instanceof ylkuphrtab) {
                ylkuphrtab ylkuphrtabVar = (ylkuphrtab) grlcpdaxtjVarJrbgnlbqoe;
                ikoacuggdj ikoacuggdjVarEslsurpljm = ylkuphrtabVar.eslsurpljm();
                if (!ikoacuggdjVarEslsurpljm.grlcpdaxtj().getParameters().isEmpty() && ikoacuggdjVarEslsurpljm.grlcpdaxtj().ylkuphrtab() != null) {
                    List<jh.yfnezrywwk> parameters = ikoacuggdjVarEslsurpljm.grlcpdaxtj().getParameters();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
                    ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters, 10));
                    for (jh.yfnezrywwk yfnezrywwkVar : parameters) {
                        iwxlajgraz uwvvkdfqfpVar = (iwxlajgraz) hg.jyumaefscl.lrnfpwlwnk(kegysxyocbVar.fyldjkxazc(), yfnezrywwkVar.getIndex());
                        if (!z13 || uwvvkdfqfpVar == null || (type3 = uwvvkdfqfpVar.getType()) == null || ej.wkgbmnqykc.dxjokdxxww(type3)) {
                            boolean z14 = set != null && set.contains(yfnezrywwkVar);
                            if (uwvvkdfqfpVar == null || z14) {
                                uwvvkdfqfpVar = new uwvvkdfqfp(yfnezrywwkVar);
                            } else {
                                igdgnonuha igdgnonuhaVarBtonecajqb = substitutor.btonecajqb();
                                kegysxyocb type4 = uwvvkdfqfpVar.getType();
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type4, "getType(...)");
                                if (igdgnonuhaVarBtonecajqb.eablkybsjg(type4) == null) {
                                    uwvvkdfqfpVar = new uwvvkdfqfp(yfnezrywwkVar);
                                }
                            }
                        }
                        arrayList.add(uwvvkdfqfpVar);
                    }
                    ikoacuggdjVarEslsurpljm = lxfrhoxuzk.gxszxtbevo(ikoacuggdjVarEslsurpljm, arrayList, null, 2, null);
                }
                ikoacuggdj ikoacuggdjVarKrqnebusok = ylkuphrtabVar.krqnebusok();
                if (!ikoacuggdjVarKrqnebusok.grlcpdaxtj().getParameters().isEmpty() && ikoacuggdjVarKrqnebusok.grlcpdaxtj().ylkuphrtab() != null) {
                    List<jh.yfnezrywwk> parameters2 = ikoacuggdjVarKrqnebusok.grlcpdaxtj().getParameters();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters2, "getParameters(...)");
                    ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters2, 10));
                    for (jh.yfnezrywwk yfnezrywwkVar2 : parameters2) {
                        iwxlajgraz uwvvkdfqfpVar2 = (iwxlajgraz) hg.jyumaefscl.lrnfpwlwnk(kegysxyocbVar.fyldjkxazc(), yfnezrywwkVar2.getIndex());
                        if (!z13 || uwvvkdfqfpVar2 == null || (type2 = uwvvkdfqfpVar2.getType()) == null || ej.wkgbmnqykc.dxjokdxxww(type2)) {
                            boolean z15 = set != null && set.contains(yfnezrywwkVar2);
                            if (uwvvkdfqfpVar2 == null || z15) {
                                uwvvkdfqfpVar2 = new uwvvkdfqfp(yfnezrywwkVar2);
                            } else {
                                igdgnonuha igdgnonuhaVarBtonecajqb2 = substitutor.btonecajqb();
                                kegysxyocb type5 = uwvvkdfqfpVar2.getType();
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type5, "getType(...)");
                                if (igdgnonuhaVarBtonecajqb2.eablkybsjg(type5) == null) {
                                    uwvvkdfqfpVar2 = new uwvvkdfqfp(yfnezrywwkVar2);
                                }
                            }
                        }
                        arrayList2.add(uwvvkdfqfpVar2);
                    }
                    ikoacuggdjVarKrqnebusok = lxfrhoxuzk.gxszxtbevo(ikoacuggdjVarKrqnebusok, arrayList2, null, 2, null);
                }
                grlcpdaxtjVarGxszxtbevo = ntlheqmsrt.eablkybsjg(ikoacuggdjVarEslsurpljm, ikoacuggdjVarKrqnebusok);
            } else {
                if (!(grlcpdaxtjVarJrbgnlbqoe instanceof ikoacuggdj)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikoacuggdj ikoacuggdjVar = (ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe;
                if (ikoacuggdjVar.grlcpdaxtj().getParameters().isEmpty() || ikoacuggdjVar.grlcpdaxtj().ylkuphrtab() == null) {
                    grlcpdaxtjVarGxszxtbevo = ikoacuggdjVar;
                } else {
                    List<jh.yfnezrywwk> parameters3 = ikoacuggdjVar.grlcpdaxtj().getParameters();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters3, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters3, 10));
                    for (jh.yfnezrywwk yfnezrywwkVar3 : parameters3) {
                        iwxlajgraz uwvvkdfqfpVar3 = (iwxlajgraz) hg.jyumaefscl.lrnfpwlwnk(kegysxyocbVar.fyldjkxazc(), yfnezrywwkVar3.getIndex());
                        if (!z13 || uwvvkdfqfpVar3 == null || (type = uwvvkdfqfpVar3.getType()) == null || ej.wkgbmnqykc.dxjokdxxww(type)) {
                            boolean z16 = set != null && set.contains(yfnezrywwkVar3);
                            if (uwvvkdfqfpVar3 == null || z16) {
                                uwvvkdfqfpVar3 = new uwvvkdfqfp(yfnezrywwkVar3);
                            } else {
                                igdgnonuha igdgnonuhaVarBtonecajqb3 = substitutor.btonecajqb();
                                kegysxyocb type6 = uwvvkdfqfpVar3.getType();
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type6, "getType(...)");
                                if (igdgnonuhaVarBtonecajqb3.eablkybsjg(type6) == null) {
                                    uwvvkdfqfpVar3 = new uwvvkdfqfp(yfnezrywwkVar3);
                                }
                            }
                        }
                        arrayList3.add(uwvvkdfqfpVar3);
                    }
                    grlcpdaxtjVarGxszxtbevo = lxfrhoxuzk.gxszxtbevo(ikoacuggdjVar, arrayList3, null, 2, null);
                }
            }
            kegysxyocb kegysxyocbVarAgtfadlqog = substitutor.agtfadlqog(ipoelvxyzq.zoijcleaow(grlcpdaxtjVarGxszxtbevo, grlcpdaxtjVarJrbgnlbqoe), mhtqkkgtqm.OUT_VARIANCE);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kegysxyocbVarAgtfadlqog, "safeSubstitute(...)");
            return kegysxyocbVarAgtfadlqog;
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jh.yfnezrywwk f130006iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lmojexxdyd f130007zoijcleaow;

        public zoijcleaow(jh.yfnezrywwk typeParameter, lmojexxdyd typeAttr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAttr, "typeAttr");
            this.f130006iobyxmoadg = typeParameter;
            this.f130007zoijcleaow = typeAttr;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.f130006iobyxmoadg, this.f130006iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.f130007zoijcleaow, this.f130007zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f130006iobyxmoadg.hashCode();
            return iHashCode + (iHashCode * 31) + this.f130007zoijcleaow.hashCode();
        }

        public final lmojexxdyd iobyxmoadg() {
            return this.f130007zoijcleaow;
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f130006iobyxmoadg + ", typeAttr=" + this.f130007zoijcleaow + ')';
        }

        public final jh.yfnezrywwk zoijcleaow() {
            return this.f130006iobyxmoadg;
        }
    }

    public auzgnhcxok(iozdgvuglv projectionComputer, tbqsvytpvh options) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(projectionComputer, "projectionComputer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(options, "options");
        this.f130002iobyxmoadg = projectionComputer;
        this.f130005zoijcleaow = options;
        yi.gxszxtbevo gxszxtbevoVar = new yi.gxszxtbevo("Type parameter upper bound erasure results");
        this.f130003ppxfxbqfkf = gxszxtbevoVar;
        this.f130004wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new roivzttewh(this));
        yi.lqeggnwhkg lqeggnwhkgVarDxjokdxxww = gxszxtbevoVar.dxjokdxxww(new uawqvzlxes(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lqeggnwhkgVarDxjokdxxww, "createMemoizedFunction(...)");
        this.f130001eablkybsjg = lqeggnwhkgVarDxjokdxxww;
    }

    private final Set dxjokdxxww(wizcaqwiak wizcaqwiakVar, List list, lmojexxdyd lmojexxdydVar) {
        Set setZoijcleaow = hg.ikoacuggdj.zoijcleaow();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kegysxyocb kegysxyocbVar = (kegysxyocb) it.next();
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
            if (nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg) {
                setZoijcleaow.add(f130000gxszxtbevo.iobyxmoadg(kegysxyocbVar, wizcaqwiakVar, lmojexxdydVar.ppxfxbqfkf(), this.f130005zoijcleaow.zoijcleaow()));
            } else if (nufgyqmvbuVarWkgbmnqykc instanceof jh.yfnezrywwk) {
                Set setPpxfxbqfkf = lmojexxdydVar.ppxfxbqfkf();
                if (setPpxfxbqfkf == null || !setPpxfxbqfkf.contains(nufgyqmvbuVarWkgbmnqykc)) {
                    List upperBounds = ((jh.yfnezrywwk) nufgyqmvbuVarWkgbmnqykc).getUpperBounds();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
                    setZoijcleaow.addAll(dxjokdxxww(wizcaqwiakVar, upperBounds, lmojexxdydVar));
                } else {
                    setZoijcleaow.add(wkgbmnqykc(lmojexxdydVar));
                }
            }
            if (!this.f130005zoijcleaow.iobyxmoadg()) {
                break;
            }
        }
        return hg.ikoacuggdj.iobyxmoadg(setZoijcleaow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb gxszxtbevo(auzgnhcxok auzgnhcxokVar, zoijcleaow zoijcleaowVar) {
        return auzgnhcxokVar.lqeggnwhkg(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
    }

    private final kegysxyocb lqeggnwhkg(jh.yfnezrywwk yfnezrywwkVar, lmojexxdyd lmojexxdydVar) {
        iwxlajgraz iwxlajgrazVarIobyxmoadg;
        Set setPpxfxbqfkf = lmojexxdydVar.ppxfxbqfkf();
        if (setPpxfxbqfkf != null && setPpxfxbqfkf.contains(yfnezrywwkVar.iobyxmoadg())) {
            return wkgbmnqykc(lmojexxdydVar);
        }
        ikoacuggdj ikoacuggdjVarOjitshcjhn = yfnezrywwkVar.ojitshcjhn();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
        Set<jh.yfnezrywwk> setDraadjrbmk = ej.wkgbmnqykc.draadjrbmk(ikoacuggdjVarOjitshcjhn, setPpxfxbqfkf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(setDraadjrbmk, 10)), 16));
        for (jh.yfnezrywwk yfnezrywwkVar2 : setDraadjrbmk) {
            if (setPpxfxbqfkf == null || !setPpxfxbqfkf.contains(yfnezrywwkVar2)) {
                iwxlajgrazVarIobyxmoadg = this.f130002iobyxmoadg.iobyxmoadg(yfnezrywwkVar2, lmojexxdydVar, this, eablkybsjg(yfnezrywwkVar2, lmojexxdydVar.wkgbmnqykc(yfnezrywwkVar)));
            } else {
                iwxlajgrazVarIobyxmoadg = ageimvtcrz.zdlpuopuiu(yfnezrywwkVar2, lmojexxdydVar);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iwxlajgrazVarIobyxmoadg, "makeStarProjection(...)");
            }
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(yfnezrywwkVar2.btonecajqb(), iwxlajgrazVarIobyxmoadg);
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        wizcaqwiak wizcaqwiakVarLqeggnwhkg = wizcaqwiak.lqeggnwhkg(nuxfzjnpeb.iobyxmoadg.eablkybsjg(nuxfzjnpeb.f130098ppxfxbqfkf, linkedHashMap, false, 2, null));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wizcaqwiakVarLqeggnwhkg, "create(...)");
        List upperBounds = yfnezrywwkVar.getUpperBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
        Set setDxjokdxxww = dxjokdxxww(wizcaqwiakVarLqeggnwhkg, upperBounds, lmojexxdydVar);
        if (setDxjokdxxww.isEmpty()) {
            return wkgbmnqykc(lmojexxdydVar);
        }
        if (!this.f130005zoijcleaow.iobyxmoadg()) {
            if (setDxjokdxxww.size() == 1) {
                return (kegysxyocb) hg.jyumaefscl.rhgxfdycjh(setDxjokdxxww);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listM = hg.jyumaefscl.m(setDxjokdxxww);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((kegysxyocb) it.next()).jrbgnlbqoe());
        }
        return aj.wkgbmnqykc.iobyxmoadg(arrayList);
    }

    private final bj.dxjokdxxww nufgyqmvbu() {
        return (bj.dxjokdxxww) this.f130004wkgbmnqykc.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bj.dxjokdxxww ppxfxbqfkf(auzgnhcxok auzgnhcxokVar) {
        return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16447fmlbqenlif, auzgnhcxokVar.toString());
    }

    private final kegysxyocb wkgbmnqykc(lmojexxdyd lmojexxdydVar) {
        kegysxyocb kegysxyocbVarCdpycssgdh;
        ikoacuggdj ikoacuggdjVarIobyxmoadg = lmojexxdydVar.iobyxmoadg();
        return (ikoacuggdjVarIobyxmoadg == null || (kegysxyocbVarCdpycssgdh = ej.wkgbmnqykc.cdpycssgdh(ikoacuggdjVarIobyxmoadg)) == null) ? nufgyqmvbu() : kegysxyocbVarCdpycssgdh;
    }

    public final kegysxyocb eablkybsjg(jh.yfnezrywwk typeParameter, lmojexxdyd typeAttr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAttr, "typeAttr");
        Object objInvoke = this.f130001eablkybsjg.invoke(new zoijcleaow(typeParameter, typeAttr));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
        return (kegysxyocb) objInvoke;
    }

    public /* synthetic */ auzgnhcxok(iozdgvuglv iozdgvuglvVar, tbqsvytpvh tbqsvytpvhVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iozdgvuglvVar, (i13 & 2) != 0 ? new tbqsvytpvh(false, false) : tbqsvytpvhVar);
    }
}
