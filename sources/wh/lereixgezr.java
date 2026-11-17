package wh;

import ai.okpsazkaxt;
import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.iyctptxqzt;
import jh.jztzpxfvev;
import jh.yfnezrywwk;
import zi.ageimvtcrz;
import zi.fiwbwshyhd;
import zi.iwxlajgraz;

/* JADX INFO: loaded from: classes3.dex */
public final class lereixgezr extends mbcevpiqjq {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final jh.eablkybsjg f119795agtfadlqog;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final yi.dxjokdxxww f119796kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final zh.lqeggnwhkg f119797ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final yi.dxjokdxxww f119798oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final boolean f119799rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final yi.dxjokdxxww f119800vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final yi.nufgyqmvbu f119801yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final yi.dxjokdxxww f119802zdlpuopuiu;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.rgvfuqvkyq implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(lereixgezr.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(ii.gxszxtbevo p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((lereixgezr) this.receiver).v(p13);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.rgvfuqvkyq implements tg.draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(lereixgezr.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(ii.gxszxtbevo p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((lereixgezr) this.receiver).w(p13);
        }
    }

    public /* synthetic */ lereixgezr(vh.gtknphoqwx gtknphoqwxVar, jh.eablkybsjg eablkybsjgVar, zh.lqeggnwhkg lqeggnwhkgVar, boolean z13, lereixgezr lereixgezrVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, eablkybsjgVar, lqeggnwhkgVar, z13, (i13 & 16) != 0 ? null : lereixgezrVar);
    }

    private final jztzpxfvev a(jh.crxdokpmqz crxdokpmqzVar, String str, tg.draadjrbmk draadjrbmkVar) {
        jztzpxfvev jztzpxfvevVar;
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(str);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        Iterator it = ((Iterable) draadjrbmkVar.invoke(gxszxtbevoVarGxszxtbevo)).iterator();
        do {
            jztzpxfvevVar = null;
            if (!it.hasNext()) {
                break;
            }
            jztzpxfvev jztzpxfvevVar2 = (jztzpxfvev) it.next();
            if (jztzpxfvevVar2.dxjokdxxww().size() == 0) {
                aj.eablkybsjg eablkybsjgVar = aj.eablkybsjg.f2055iobyxmoadg;
                zi.kegysxyocb returnType = jztzpxfvevVar2.getReturnType();
                if (returnType == null ? false : eablkybsjgVar.zoijcleaow(returnType, crxdokpmqzVar.getType())) {
                    jztzpxfvevVar = jztzpxfvevVar2;
                }
            }
        } while (jztzpxfvevVar == null);
        return jztzpxfvevVar;
    }

    private final jztzpxfvev ageimvtcrz(jh.lereixgezr lereixgezrVar, tg.draadjrbmk draadjrbmkVar) {
        Object next;
        ii.gxszxtbevo name = lereixgezrVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        Iterator it = ((Iterable) draadjrbmkVar.invoke(name)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!j((jztzpxfvev) next, lereixgezrVar));
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) next;
        if (jztzpxfvevVar == null) {
            return null;
        }
        jh.lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = jztzpxfvevVar.yggfygwlhe();
        List listDxjokdxxww = lereixgezrVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listDxjokdxxww, 10));
        Iterator it2 = listDxjokdxxww.iterator();
        while (it2.hasNext()) {
            arrayList.add(((iyctptxqzt) it2.next()).getType());
        }
        List listDxjokdxxww2 = jztzpxfvevVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww2, "getValueParameters(...)");
        iobyxmoadgVarYggfygwlhe.ppxfxbqfkf(uh.nufgyqmvbu.iobyxmoadg(arrayList, listDxjokdxxww2, lereixgezrVar));
        iobyxmoadgVarYggfygwlhe.zdlpuopuiu();
        iobyxmoadgVarYggfygwlhe.wflxmlrfwp();
        iobyxmoadgVarYggfygwlhe.zoijcleaow(uh.eablkybsjg.f113560vipkmwdibw, Boolean.TRUE);
        return (jztzpxfvev) iobyxmoadgVarYggfygwlhe.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean auzgnhcxok(zh.vdvldrhtss it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return !it.wkgbmnqykc();
    }

    private final jztzpxfvev b(jh.crxdokpmqz crxdokpmqzVar, tg.draadjrbmk draadjrbmkVar) {
        jh.jlmebxxoox jlmebxxooxVarWkgbmnqykc = crxdokpmqzVar.wkgbmnqykc();
        jh.jlmebxxoox jlmebxxooxVar = jlmebxxooxVarWkgbmnqykc != null ? (jh.jlmebxxoox) sh.tzroggbefp.lqeggnwhkg(jlmebxxooxVarWkgbmnqykc) : null;
        String strZoijcleaow = jlmebxxooxVar != null ? sh.wflxmlrfwp.f106634iobyxmoadg.zoijcleaow(jlmebxxooxVar) : null;
        if (strZoijcleaow != null && !sh.tzroggbefp.draadjrbmk(kegysxyocb(), jlmebxxooxVar)) {
            return a(crxdokpmqzVar, strZoijcleaow, draadjrbmkVar);
        }
        String strZoijcleaow2 = crxdokpmqzVar.getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow2, "asString(...)");
        return a(crxdokpmqzVar, sh.wwaezpbzkn.zoijcleaow(strZoijcleaow2), draadjrbmkVar);
    }

    private final jztzpxfvev c(jh.crxdokpmqz crxdokpmqzVar, tg.draadjrbmk draadjrbmkVar) {
        jztzpxfvev jztzpxfvevVar;
        zi.kegysxyocb returnType;
        String strZoijcleaow = crxdokpmqzVar.getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(sh.wwaezpbzkn.eablkybsjg(strZoijcleaow));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        Iterator it = ((Iterable) draadjrbmkVar.invoke(gxszxtbevoVarGxszxtbevo)).iterator();
        do {
            jztzpxfvevVar = null;
            if (!it.hasNext()) {
                break;
            }
            jztzpxfvev jztzpxfvevVar2 = (jztzpxfvev) it.next();
            if (jztzpxfvevVar2.dxjokdxxww().size() == 1 && (returnType = jztzpxfvevVar2.getReturnType()) != null && gh.dxjokdxxww.skhdrjzrfn(returnType)) {
                aj.eablkybsjg eablkybsjgVar = aj.eablkybsjg.f2055iobyxmoadg;
                List listDxjokdxxww = jztzpxfvevVar2.dxjokdxxww();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
                if (eablkybsjgVar.ppxfxbqfkf(((iyctptxqzt) hg.jyumaefscl.yzdjzghtvl(listDxjokdxxww)).getType(), crxdokpmqzVar.getType())) {
                    jztzpxfvevVar = jztzpxfvevVar2;
                }
            }
        } while (jztzpxfvevVar == null);
        return jztzpxfvevVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set d(vh.gtknphoqwx gtknphoqwxVar, lereixgezr lereixgezrVar) {
        return hg.jyumaefscl.r(gtknphoqwxVar.iobyxmoadg().iwizpuwonk().eablkybsjg(lereixgezrVar.kegysxyocb(), gtknphoqwxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection dvvnrvtcbc(lereixgezr lereixgezrVar, ii.gxszxtbevo it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return lereixgezrVar.w(it);
    }

    private final jh.yggfygwlhe e(jh.eablkybsjg eablkybsjgVar) {
        jh.yggfygwlhe visibility = eablkybsjgVar.getVisibility();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(visibility, sh.esjtqupxsv.f106532zoijcleaow)) {
            return visibility;
        }
        jh.yggfygwlhe PROTECTED_AND_PACKAGE = sh.esjtqupxsv.f106530ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final boolean eslsurpljm(jztzpxfvev jztzpxfvevVar) {
        jztzpxfvev jztzpxfvevVarJrbgnlbqoe = jrbgnlbqoe(jztzpxfvevVar);
        if (jztzpxfvevVarJrbgnlbqoe == null) {
            return false;
        }
        ii.gxszxtbevo name = jztzpxfvevVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        Set<jztzpxfvev> setG = g(name);
        if ((setG instanceof Collection) && setG.isEmpty()) {
            return false;
        }
        for (jztzpxfvev jztzpxfvevVar2 : setG) {
            if (jztzpxfvevVar2.isSuspend() && ezmngbhpjk(jztzpxfvevVarJrbgnlbqoe, jztzpxfvevVar2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean ezmngbhpjk(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2) {
        li.ojitshcjhn.dxjokdxxww.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = li.ojitshcjhn.f62605gxszxtbevo.iozdgvuglv(iobyxmoadgVar2, iobyxmoadgVar, true).ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "getResult(...)");
        return iobyxmoadgVarPpxfxbqfkf == li.ojitshcjhn.dxjokdxxww.iobyxmoadg.OVERRIDABLE && !sh.lereixgezr.f106553iobyxmoadg.iobyxmoadg(iobyxmoadgVar2, iobyxmoadgVar);
    }

    private final jztzpxfvev fiwbwshyhd(jztzpxfvev jztzpxfvevVar, jh.iobyxmoadg iobyxmoadgVar, Collection collection) {
        Collection<jztzpxfvev> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return jztzpxfvevVar;
        }
        for (jztzpxfvev jztzpxfvevVar2 : collection2) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jztzpxfvevVar, jztzpxfvevVar2) && jztzpxfvevVar2.oipsdeybqn() == null && ezmngbhpjk(jztzpxfvevVar2, iobyxmoadgVar)) {
                jh.lereixgezr lereixgezrVarBuild = jztzpxfvevVar.yggfygwlhe().btonecajqb().build();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lereixgezrVarBuild);
                return (jztzpxfvev) lereixgezrVarBuild;
            }
        }
        return jztzpxfvevVar;
    }

    private final boolean fmlbqenlif(jh.crxdokpmqz crxdokpmqzVar, tg.draadjrbmk draadjrbmkVar) {
        if (wkgbmnqykc.iobyxmoadg(crxdokpmqzVar)) {
            return false;
        }
        jztzpxfvev jztzpxfvevVarB = b(crxdokpmqzVar, draadjrbmkVar);
        jztzpxfvev jztzpxfvevVarC = c(crxdokpmqzVar, draadjrbmkVar);
        if (jztzpxfvevVarB == null) {
            return false;
        }
        if (crxdokpmqzVar.jpowsppfya()) {
            return jztzpxfvevVarC != null && jztzpxfvevVarC.vdvldrhtss() == jztzpxfvevVarB.vdvldrhtss();
        }
        return true;
    }

    private final uh.gxszxtbevo fyldjkxazc(jh.crxdokpmqz crxdokpmqzVar, tg.draadjrbmk draadjrbmkVar) {
        jztzpxfvev jztzpxfvevVarC;
        mh.hkdspvbjdz hkdspvbjdzVarWflxmlrfwp = null;
        if (!fmlbqenlif(crxdokpmqzVar, draadjrbmkVar)) {
            return null;
        }
        jztzpxfvev jztzpxfvevVarB = b(crxdokpmqzVar, draadjrbmkVar);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(jztzpxfvevVarB);
        if (crxdokpmqzVar.jpowsppfya()) {
            jztzpxfvevVarC = c(crxdokpmqzVar, draadjrbmkVar);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(jztzpxfvevVarC);
        } else {
            jztzpxfvevVarC = null;
        }
        if (jztzpxfvevVarC != null) {
            jztzpxfvevVarC.vdvldrhtss();
            jztzpxfvevVarB.vdvldrhtss();
        }
        uh.wkgbmnqykc wkgbmnqykcVar = new uh.wkgbmnqykc(kegysxyocb(), jztzpxfvevVarB, jztzpxfvevVarC, crxdokpmqzVar);
        zi.kegysxyocb returnType = jztzpxfvevVarB.getReturnType();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(returnType);
        wkgbmnqykcVar.e(returnType, hg.jyumaefscl.wflxmlrfwp(), dsvhmnatus(), null, hg.jyumaefscl.wflxmlrfwp());
        mh.jpowsppfya jpowsppfyaVarGtknphoqwx = li.nufgyqmvbu.gtknphoqwx(wkgbmnqykcVar, jztzpxfvevVarB.getAnnotations(), false, false, false, jztzpxfvevVarB.lqeggnwhkg());
        jpowsppfyaVarGtknphoqwx.ipoelvxyzq(jztzpxfvevVarB);
        jpowsppfyaVarGtknphoqwx.ixidwrxhsl(wkgbmnqykcVar.getType());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jpowsppfyaVarGtknphoqwx, "apply(...)");
        if (jztzpxfvevVarC != null) {
            List listDxjokdxxww = jztzpxfvevVarC.dxjokdxxww();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
            iyctptxqzt iyctptxqztVar = (iyctptxqzt) hg.jyumaefscl.weqkydbzbr(listDxjokdxxww);
            if (iyctptxqztVar == null) {
                throw new AssertionError("No parameter found for " + jztzpxfvevVarC);
            }
            hkdspvbjdzVarWflxmlrfwp = li.nufgyqmvbu.wflxmlrfwp(wkgbmnqykcVar, jztzpxfvevVarC.getAnnotations(), iyctptxqztVar.getAnnotations(), false, false, false, jztzpxfvevVarC.getVisibility(), jztzpxfvevVarC.lqeggnwhkg());
            hkdspvbjdzVarWflxmlrfwp.ipoelvxyzq(jztzpxfvevVarC);
        }
        wkgbmnqykcVar.yzdjzghtvl(jpowsppfyaVarGtknphoqwx, hkdspvbjdzVarWflxmlrfwp);
        return wkgbmnqykcVar;
    }

    private final Set g(ii.gxszxtbevo gxszxtbevoVar) {
        Collection collectionSkhdrjzrfn = skhdrjzrfn();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionSkhdrjzrfn.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, ((zi.kegysxyocb) it.next()).agtfadlqog().wkgbmnqykc(gxszxtbevoVar, rh.wkgbmnqykc.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    static /* synthetic */ uh.gxszxtbevo grlcpdaxtj(lereixgezr lereixgezrVar, zh.oxmwwwfdhm oxmwwwfdhmVar, zi.kegysxyocb kegysxyocbVar, jh.cdpycssgdh cdpycssgdhVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            kegysxyocbVar = null;
        }
        return lereixgezrVar.ipoelvxyzq(oxmwwwfdhmVar, kegysxyocbVar, cdpycssgdhVar);
    }

    private final jh.wkgbmnqykc hszhottldk() {
        jh.eablkybsjg eablkybsjgVarKegysxyocb = kegysxyocb();
        uh.zoijcleaow zoijcleaowVarW = uh.zoijcleaow.w(eablkybsjgVarKegysxyocb, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), true, jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(this.f119797ojitshcjhn));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarW, "createJavaConstructor(...)");
        List listMhtqkkgtqm = mhtqkkgtqm(zoijcleaowVarW);
        zoijcleaowVarW.c(false);
        zoijcleaowVarW.t(listMhtqkkgtqm, e(eablkybsjgVarKegysxyocb));
        zoijcleaowVarW.b(false);
        zoijcleaowVarW.j(eablkybsjgVarKegysxyocb.ojitshcjhn());
        return zoijcleaowVarW;
    }

    private final Set i(ii.gxszxtbevo gxszxtbevoVar) {
        Collection collectionSkhdrjzrfn = skhdrjzrfn();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionSkhdrjzrfn.iterator();
        while (it.hasNext()) {
            Collection collectionZoijcleaow = ((zi.kegysxyocb) it.next()).agtfadlqog().zoijcleaow(gxszxtbevoVar, rh.wkgbmnqykc.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionZoijcleaow, 10));
            Iterator it2 = collectionZoijcleaow.iterator();
            while (it2.hasNext()) {
                arrayList2.add((jh.crxdokpmqz) it2.next());
            }
            hg.jyumaefscl.istkbnxepw(arrayList, arrayList2);
        }
        return hg.jyumaefscl.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List igdgnonuha(lereixgezr lereixgezrVar, vh.gtknphoqwx gtknphoqwxVar) {
        Collection collectionGtknphoqwx = lereixgezrVar.f119797ojitshcjhn.gtknphoqwx();
        ArrayList arrayList = new ArrayList(collectionGtknphoqwx.size());
        Iterator it = collectionGtknphoqwx.iterator();
        while (it.hasNext()) {
            arrayList.add(lereixgezrVar.t((zh.gtknphoqwx) it.next()));
        }
        if (lereixgezrVar.f119797ojitshcjhn.vdvldrhtss()) {
            jh.wkgbmnqykc wkgbmnqykcVarHszhottldk = lereixgezrVar.hszhottldk();
            String strPpxfxbqfkf = bi.istkbnxepw.ppxfxbqfkf(wkgbmnqykcVarHszhottldk, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(wkgbmnqykcVarHszhottldk);
                        gtknphoqwxVar.iobyxmoadg().nufgyqmvbu().eablkybsjg(lereixgezrVar.f119797ojitshcjhn, wkgbmnqykcVarHszhottldk);
                        break;
                    }
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bi.istkbnxepw.ppxfxbqfkf((jh.wkgbmnqykc) it2.next(), false, false, 2, null), strPpxfxbqfkf));
            } else {
                arrayList.add(wkgbmnqykcVarHszhottldk);
                gtknphoqwxVar.iobyxmoadg().nufgyqmvbu().eablkybsjg(lereixgezrVar.f119797ojitshcjhn, wkgbmnqykcVarHszhottldk);
                break;
            }
        }
        gtknphoqwxVar.iobyxmoadg().iwizpuwonk().iobyxmoadg(lereixgezrVar.kegysxyocb(), arrayList, gtknphoqwxVar);
        okpsazkaxt okpsazkaxtVarOxmwwwfdhm = gtknphoqwxVar.iobyxmoadg().oxmwwwfdhm();
        boolean zIsEmpty = arrayList.isEmpty();
        List listVdvldrhtss = arrayList;
        if (zIsEmpty) {
            listVdvldrhtss = hg.jyumaefscl.vdvldrhtss(lereixgezrVar.wizcaqwiak());
        }
        return hg.jyumaefscl.m(okpsazkaxtVarOxmwwwfdhm.rgvfuqvkyq(gtknphoqwxVar, listVdvldrhtss));
    }

    private final uh.gxszxtbevo ipoelvxyzq(zh.oxmwwwfdhm oxmwwwfdhmVar, zi.kegysxyocb kegysxyocbVar, jh.cdpycssgdh cdpycssgdhVar) {
        uh.gxszxtbevo gxszxtbevoVarI = uh.gxszxtbevo.i(kegysxyocb(), vh.nufgyqmvbu.iobyxmoadg(jpowsppfya(), oxmwwwfdhmVar), cdpycssgdhVar, sh.ntlheqmsrt.wkgbmnqykc(oxmwwwfdhmVar.getVisibility()), false, oxmwwwfdhmVar.getName(), jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(oxmwwwfdhmVar), false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarI, "create(...)");
        mh.jpowsppfya jpowsppfyaVarWkgbmnqykc = li.nufgyqmvbu.wkgbmnqykc(gxszxtbevoVarI, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jpowsppfyaVarWkgbmnqykc, "createDefaultGetter(...)");
        gxszxtbevoVarI.yzdjzghtvl(jpowsppfyaVarWkgbmnqykc, null);
        zi.kegysxyocb kegysxyocbVarPmvmpeiblj = kegysxyocbVar == null ? pmvmpeiblj(oxmwwwfdhmVar, vh.ppxfxbqfkf.dxjokdxxww(jpowsppfya(), gxszxtbevoVarI, oxmwwwfdhmVar, 0, 4, null)) : kegysxyocbVar;
        gxszxtbevoVarI.e(kegysxyocbVarPmvmpeiblj, hg.jyumaefscl.wflxmlrfwp(), dsvhmnatus(), null, hg.jyumaefscl.wflxmlrfwp());
        jpowsppfyaVarWkgbmnqykc.ixidwrxhsl(kegysxyocbVarPmvmpeiblj);
        return gxszxtbevoVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection iwxlajgraz(lereixgezr lereixgezrVar, ii.gxszxtbevo it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return lereixgezrVar.v(it);
    }

    private final jztzpxfvev ixidwrxhsl(jztzpxfvev jztzpxfvevVar, ii.gxszxtbevo gxszxtbevoVar) {
        jh.lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = jztzpxfvevVar.yggfygwlhe();
        iobyxmoadgVarYggfygwlhe.oxmwwwfdhm(gxszxtbevoVar);
        iobyxmoadgVarYggfygwlhe.zdlpuopuiu();
        iobyxmoadgVarYggfygwlhe.wflxmlrfwp();
        jh.lereixgezr lereixgezrVarBuild = iobyxmoadgVarYggfygwlhe.build();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lereixgezrVarBuild);
        return (jztzpxfvev) lereixgezrVarBuild;
    }

    private final boolean j(jztzpxfvev jztzpxfvevVar, jh.lereixgezr lereixgezrVar) {
        String strPpxfxbqfkf = bi.istkbnxepw.ppxfxbqfkf(jztzpxfvevVar, false, false, 2, null);
        jh.lereixgezr lereixgezrVarIobyxmoadg = lereixgezrVar.iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lereixgezrVarIobyxmoadg, "getOriginal(...)");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strPpxfxbqfkf, bi.istkbnxepw.ppxfxbqfkf(lereixgezrVarIobyxmoadg, false, false, 2, null)) && !ezmngbhpjk(jztzpxfvevVar, lereixgezrVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    private final jztzpxfvev jrbgnlbqoe(jztzpxfvev jztzpxfvevVar) {
        ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk;
        ii.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq;
        List listDxjokdxxww = jztzpxfvevVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        iyctptxqzt iyctptxqztVar = (iyctptxqzt) hg.jyumaefscl.lxfrhoxuzk(listDxjokdxxww);
        if (iyctptxqztVar != null) {
            jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = iyctptxqztVar.getType().grlcpdaxtj().ylkuphrtab();
            if (nufgyqmvbuVarYlkuphrtab == null || (wkgbmnqykcVarRgvfuqvkyq = pi.eablkybsjg.rgvfuqvkyq(nufgyqmvbuVarYlkuphrtab)) == null) {
                ppxfxbqfkfVarDraadjrbmk = null;
            } else {
                if (!wkgbmnqykcVarRgvfuqvkyq.gxszxtbevo()) {
                    wkgbmnqykcVarRgvfuqvkyq = null;
                }
                if (wkgbmnqykcVarRgvfuqvkyq != null) {
                    ppxfxbqfkfVarDraadjrbmk = wkgbmnqykcVarRgvfuqvkyq.draadjrbmk();
                } else {
                    ppxfxbqfkfVarDraadjrbmk = null;
                }
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarDraadjrbmk, gh.ojitshcjhn.f37253jyumaefscl)) {
                iyctptxqztVar = null;
            }
            if (iyctptxqztVar != null) {
                jh.lereixgezr.iobyxmoadg iobyxmoadgVarYggfygwlhe = jztzpxfvevVar.yggfygwlhe();
                List listDxjokdxxww2 = jztzpxfvevVar.dxjokdxxww();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww2, "getValueParameters(...)");
                jztzpxfvev jztzpxfvevVar2 = (jztzpxfvev) iobyxmoadgVarYggfygwlhe.ppxfxbqfkf(hg.jyumaefscl.czzsidtyhn(listDxjokdxxww2, 1)).wkgbmnqykc(((iwxlajgraz) iyctptxqztVar.getType().fyldjkxazc().get(0)).getType()).build();
                mh.dsvhmnatus dsvhmnatusVar = (mh.dsvhmnatus) jztzpxfvevVar2;
                if (dsvhmnatusVar != null) {
                    dsvhmnatusVar.k(true);
                }
                return jztzpxfvevVar2;
            }
        }
        return null;
    }

    private final boolean k(jztzpxfvev jztzpxfvevVar) {
        ii.gxszxtbevo name = jztzpxfvevVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        List listIobyxmoadg = sh.cllcsxoeiz.iobyxmoadg(name);
        if (listIobyxmoadg == null || !listIobyxmoadg.isEmpty()) {
            Iterator it = listIobyxmoadg.iterator();
            while (it.hasNext()) {
                Set<jh.crxdokpmqz> setI = i((ii.gxszxtbevo) it.next());
                if (!(setI instanceof Collection) || !setI.isEmpty()) {
                    for (jh.crxdokpmqz crxdokpmqzVar : setI) {
                        if (fmlbqenlif(crxdokpmqzVar, new jyumaefscl(jztzpxfvevVar, this))) {
                            if (!crxdokpmqzVar.jpowsppfya()) {
                                String strZoijcleaow = jztzpxfvevVar.getName().zoijcleaow();
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
                                if (!sh.wwaezpbzkn.wkgbmnqykc(strZoijcleaow)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (rhgxfdycjh(jztzpxfvevVar) || x(jztzpxfvevVar) || eslsurpljm(jztzpxfvevVar)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map krqnebusok(lereixgezr lereixgezrVar) {
        Collection fields = lereixgezrVar.f119797ojitshcjhn.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((zh.agtfadlqog) obj).pkzmftpjix()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((zh.agtfadlqog) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection l(jztzpxfvev jztzpxfvevVar, lereixgezr lereixgezrVar, ii.gxszxtbevo accessorName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(accessorName, "accessorName");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jztzpxfvevVar.getName(), accessorName) ? hg.jyumaefscl.eablkybsjg(jztzpxfvevVar) : hg.jyumaefscl.ixidwrxhsl(lereixgezrVar.v(accessorName), lereixgezrVar.w(accessorName));
    }

    private final void lrnfpwlwnk(Collection collection, ii.gxszxtbevo gxszxtbevoVar, Collection collection2, boolean z13) {
        Collection collectionWkgbmnqykc = th.iobyxmoadg.wkgbmnqykc(gxszxtbevoVar, collection2, collection, kegysxyocb(), jpowsppfya().iobyxmoadg().ppxfxbqfkf(), jpowsppfya().iobyxmoadg().gtknphoqwx().iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionWkgbmnqykc, "resolveOverridesForNonStaticMembers(...)");
        if (!z13) {
            collection.addAll(collectionWkgbmnqykc);
            return;
        }
        Collection<jztzpxfvev> collection3 = collectionWkgbmnqykc;
        List listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(collection, collection3);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection3, 10));
        for (jztzpxfvev jztzpxfvevVarFiwbwshyhd : collection3) {
            jztzpxfvev jztzpxfvevVar = (jztzpxfvev) sh.tzroggbefp.btonecajqb(jztzpxfvevVarFiwbwshyhd);
            if (jztzpxfvevVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(jztzpxfvevVarFiwbwshyhd);
            } else {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(jztzpxfvevVarFiwbwshyhd);
                jztzpxfvevVarFiwbwshyhd = fiwbwshyhd(jztzpxfvevVarFiwbwshyhd, jztzpxfvevVar, listIxidwrxhsl);
            }
            arrayList.add(jztzpxfvevVarFiwbwshyhd);
        }
        collection.addAll(arrayList);
    }

    private final List lxfrhoxuzk(mh.dxjokdxxww dxjokdxxwwVar) {
        gg.vdvldrhtss vdvldrhtssVar;
        Collection collectionZynmafqrjb = this.f119797ojitshcjhn.zynmafqrjb();
        ArrayList arrayList = new ArrayList(collectionZynmafqrjb.size());
        xh.iobyxmoadg iobyxmoadgVarZoijcleaow = xh.zoijcleaow.zoijcleaow(fiwbwshyhd.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionZynmafqrjb) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((zh.oxmwwwfdhm) obj).getName(), sh.ylkuphrtab.f106660ppxfxbqfkf)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        gg.vdvldrhtss vdvldrhtssVar2 = new gg.vdvldrhtss(arrayList2, arrayList3);
        List list = (List) vdvldrhtssVar2.iobyxmoadg();
        List<zh.oxmwwwfdhm> list2 = (List) vdvldrhtssVar2.wkgbmnqykc();
        list.size();
        zh.oxmwwwfdhm oxmwwwfdhmVar = (zh.oxmwwwfdhm) hg.jyumaefscl.weqkydbzbr(list);
        if (oxmwwwfdhmVar != null) {
            zh.cqumvgiudr returnType = oxmwwwfdhmVar.getReturnType();
            if (returnType instanceof zh.gxszxtbevo) {
                zh.gxszxtbevo gxszxtbevoVar = (zh.gxszxtbevo) returnType;
                vdvldrhtssVar = new gg.vdvldrhtss(jpowsppfya().lqeggnwhkg().draadjrbmk(gxszxtbevoVar, iobyxmoadgVarZoijcleaow, true), jpowsppfya().lqeggnwhkg().rgvfuqvkyq(gxszxtbevoVar.draadjrbmk(), iobyxmoadgVarZoijcleaow));
            } else {
                vdvldrhtssVar = new gg.vdvldrhtss(jpowsppfya().lqeggnwhkg().rgvfuqvkyq(returnType, iobyxmoadgVarZoijcleaow), null);
            }
            weqkydbzbr(arrayList, dxjokdxxwwVar, 0, oxmwwwfdhmVar, (zi.kegysxyocb) vdvldrhtssVar.iobyxmoadg(), (zi.kegysxyocb) vdvldrhtssVar.wkgbmnqykc());
        }
        int i13 = 0;
        int i14 = oxmwwwfdhmVar == null ? 0 : 1;
        for (zh.oxmwwwfdhm oxmwwwfdhmVar2 : list2) {
            weqkydbzbr(arrayList, dxjokdxxwwVar, i13 + i14, oxmwwwfdhmVar2, jpowsppfya().lqeggnwhkg().rgvfuqvkyq(oxmwwwfdhmVar2.getReturnType(), iobyxmoadgVarZoijcleaow), null);
            i13++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set m(lereixgezr lereixgezrVar) {
        return hg.jyumaefscl.r(lereixgezrVar.f119797ojitshcjhn.pmvmpeiblj());
    }

    private final List mhtqkkgtqm(mh.dxjokdxxww dxjokdxxwwVar) {
        Collection collectionNufgyqmvbu = this.f119797ojitshcjhn.nufgyqmvbu();
        ArrayList arrayList = new ArrayList(collectionNufgyqmvbu.size());
        xh.iobyxmoadg iobyxmoadgVarZoijcleaow = xh.zoijcleaow.zoijcleaow(fiwbwshyhd.COMMON, false, false, null, 6, null);
        Iterator it = collectionNufgyqmvbu.iterator();
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (!it.hasNext()) {
                return arrayList;
            }
            i13 = i14 + 1;
            zh.iwizpuwonk iwizpuwonkVar = (zh.iwizpuwonk) it.next();
            zi.kegysxyocb kegysxyocbVarRgvfuqvkyq = jpowsppfya().lqeggnwhkg().rgvfuqvkyq(iwizpuwonkVar.getType(), iobyxmoadgVarZoijcleaow);
            arrayList.add(new mh.ntlheqmsrt(dxjokdxxwwVar, null, i14, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), iwizpuwonkVar.getName(), kegysxyocbVarRgvfuqvkyq, false, false, false, iwizpuwonkVar.btonecajqb() ? jpowsppfya().iobyxmoadg().wflxmlrfwp().wflxmlrfwp().gtknphoqwx(kegysxyocbVarRgvfuqvkyq) : null, jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(iwizpuwonkVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.eablkybsjg n(lereixgezr lereixgezrVar, vh.gtknphoqwx gtknphoqwxVar, ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        if (((Set) lereixgezrVar.f119798oxmwwwfdhm.invoke()).contains(name)) {
            sh.yggfygwlhe yggfygwlheVarWkgbmnqykc = gtknphoqwxVar.iobyxmoadg().wkgbmnqykc();
            ii.zoijcleaow zoijcleaowVarAgtfadlqog = pi.eablkybsjg.agtfadlqog(lereixgezrVar.kegysxyocb());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVarAgtfadlqog);
            zh.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = yggfygwlheVarWkgbmnqykc.ppxfxbqfkf(new sh.yggfygwlhe.iobyxmoadg(zoijcleaowVarAgtfadlqog.wkgbmnqykc(name), null, lereixgezrVar.f119797ojitshcjhn, 2, null));
            if (lqeggnwhkgVarPpxfxbqfkf == null) {
                return null;
            }
            agtfadlqog agtfadlqogVar = new agtfadlqog(gtknphoqwxVar, lereixgezrVar.kegysxyocb(), lqeggnwhkgVarPpxfxbqfkf, null, 8, null);
            gtknphoqwxVar.iobyxmoadg().eablkybsjg().iobyxmoadg(agtfadlqogVar);
            return agtfadlqogVar;
        }
        if (!((Set) lereixgezrVar.f119796kcexrzcfyt.invoke()).contains(name)) {
            zh.agtfadlqog agtfadlqogVar2 = (zh.agtfadlqog) ((Map) lereixgezrVar.f119802zdlpuopuiu.invoke()).get(name);
            if (agtfadlqogVar2 == null) {
                return null;
            }
            return mh.vdvldrhtss.fyldjkxazc(gtknphoqwxVar.eablkybsjg(), lereixgezrVar.kegysxyocb(), name, gtknphoqwxVar.eablkybsjg().wkgbmnqykc(new esjtqupxsv(lereixgezrVar)), vh.nufgyqmvbu.iobyxmoadg(gtknphoqwxVar, agtfadlqogVar2), gtknphoqwxVar.iobyxmoadg().zdlpuopuiu().iobyxmoadg(agtfadlqogVar2));
        }
        List listPpxfxbqfkf = hg.jyumaefscl.ppxfxbqfkf();
        gtknphoqwxVar.iobyxmoadg().iwizpuwonk().gxszxtbevo(lereixgezrVar.kegysxyocb(), name, listPpxfxbqfkf, gtknphoqwxVar);
        List listIobyxmoadg = hg.jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
        int size = listIobyxmoadg.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (jh.eablkybsjg) hg.jyumaefscl.yzdjzghtvl(listIobyxmoadg);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listIobyxmoadg).toString());
    }

    private final void nuxfzjnpeb(Set set, Collection collection, Set set2, tg.draadjrbmk draadjrbmkVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jh.crxdokpmqz crxdokpmqzVar = (jh.crxdokpmqz) it.next();
            uh.gxszxtbevo gxszxtbevoVarFyldjkxazc = fyldjkxazc(crxdokpmqzVar, draadjrbmkVar);
            if (gxszxtbevoVarFyldjkxazc != null) {
                collection.add(gxszxtbevoVarFyldjkxazc);
                if (set2 != null) {
                    set2.add(crxdokpmqzVar);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o(lereixgezr lereixgezrVar) {
        return ikoacuggdj.draadjrbmk(lereixgezrVar.iobyxmoadg(), lereixgezrVar.ppxfxbqfkf());
    }

    private final jztzpxfvev p(jztzpxfvev jztzpxfvevVar, tg.draadjrbmk draadjrbmkVar, Collection collection) {
        jztzpxfvev jztzpxfvevVarAgeimvtcrz;
        jh.lereixgezr lereixgezrVarDraadjrbmk = sh.dxjokdxxww.draadjrbmk(jztzpxfvevVar);
        if (lereixgezrVarDraadjrbmk == null || (jztzpxfvevVarAgeimvtcrz = ageimvtcrz(lereixgezrVarDraadjrbmk, draadjrbmkVar)) == null) {
            return null;
        }
        if (!k(jztzpxfvevVarAgeimvtcrz)) {
            jztzpxfvevVarAgeimvtcrz = null;
        }
        if (jztzpxfvevVarAgeimvtcrz != null) {
            return fiwbwshyhd(jztzpxfvevVarAgeimvtcrz, lereixgezrVarDraadjrbmk, collection);
        }
        return null;
    }

    private final jztzpxfvev q(jztzpxfvev jztzpxfvevVar, tg.draadjrbmk draadjrbmkVar, ii.gxszxtbevo gxszxtbevoVar, Collection collection) {
        jztzpxfvev jztzpxfvevVar2 = (jztzpxfvev) sh.tzroggbefp.lqeggnwhkg(jztzpxfvevVar);
        if (jztzpxfvevVar2 == null) {
            return null;
        }
        String strEablkybsjg = sh.tzroggbefp.eablkybsjg(jztzpxfvevVar2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(strEablkybsjg);
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(strEablkybsjg);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        Iterator it = ((Collection) draadjrbmkVar.invoke(gxszxtbevoVarGxszxtbevo)).iterator();
        while (it.hasNext()) {
            jztzpxfvev jztzpxfvevVarIxidwrxhsl = ixidwrxhsl((jztzpxfvev) it.next(), gxszxtbevoVar);
            if (yzdjzghtvl(jztzpxfvevVar2, jztzpxfvevVarIxidwrxhsl)) {
                return fiwbwshyhd(jztzpxfvevVarIxidwrxhsl, jztzpxfvevVar2, collection);
            }
        }
        return null;
    }

    private final jztzpxfvev r(jztzpxfvev jztzpxfvevVar, tg.draadjrbmk draadjrbmkVar) {
        if (!jztzpxfvevVar.isSuspend()) {
            return null;
        }
        ii.gxszxtbevo name = jztzpxfvevVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        Iterator it = ((Iterable) draadjrbmkVar.invoke(name)).iterator();
        while (it.hasNext()) {
            jztzpxfvev jztzpxfvevVarJrbgnlbqoe = jrbgnlbqoe((jztzpxfvev) it.next());
            if (jztzpxfvevVarJrbgnlbqoe == null || !ezmngbhpjk(jztzpxfvevVarJrbgnlbqoe, jztzpxfvevVar)) {
                jztzpxfvevVarJrbgnlbqoe = null;
            }
            if (jztzpxfvevVarJrbgnlbqoe != null) {
                return jztzpxfvevVarJrbgnlbqoe;
            }
        }
        return null;
    }

    private final boolean rhgxfdycjh(jztzpxfvev jztzpxfvevVar) {
        sh.mbcevpiqjq.iobyxmoadg iobyxmoadgVar = sh.mbcevpiqjq.f106567iobyxmoadg;
        ii.gxszxtbevo name = jztzpxfvevVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        ii.gxszxtbevo gxszxtbevoVarZoijcleaow = iobyxmoadgVar.zoijcleaow(name);
        if (gxszxtbevoVarZoijcleaow == null) {
            return false;
        }
        Set setG = g(gxszxtbevoVarZoijcleaow);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setG) {
            if (sh.tzroggbefp.wkgbmnqykc((jztzpxfvev) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        jztzpxfvev jztzpxfvevVarIxidwrxhsl = ixidwrxhsl(jztzpxfvevVar, gxszxtbevoVarZoijcleaow);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (yzdjzghtvl((jztzpxfvev) it.next(), jztzpxfvevVarIxidwrxhsl)) {
                return true;
            }
        }
        return false;
    }

    private final Collection skhdrjzrfn() {
        if (!this.f119799rgvfuqvkyq) {
            return jpowsppfya().iobyxmoadg().gtknphoqwx().wkgbmnqykc().lqeggnwhkg(kegysxyocb());
        }
        Collection collectionZoijcleaow = kegysxyocb().btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        return collectionZoijcleaow;
    }

    private final uh.zoijcleaow t(zh.gtknphoqwx gtknphoqwxVar) {
        jh.eablkybsjg eablkybsjgVarKegysxyocb = kegysxyocb();
        uh.zoijcleaow zoijcleaowVarW = uh.zoijcleaow.w(eablkybsjgVarKegysxyocb, vh.nufgyqmvbu.iobyxmoadg(jpowsppfya(), gtknphoqwxVar), false, jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(gtknphoqwxVar));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarW, "createJavaConstructor(...)");
        vh.gtknphoqwx gtknphoqwxVarNufgyqmvbu = vh.ppxfxbqfkf.nufgyqmvbu(jpowsppfya(), zoijcleaowVarW, gtknphoqwxVar, eablkybsjgVarKegysxyocb.rgvfuqvkyq().size());
        mbcevpiqjq.zoijcleaow zoijcleaowVarOkpsazkaxt = okpsazkaxt(gtknphoqwxVarNufgyqmvbu, zoijcleaowVarW, gtknphoqwxVar.dxjokdxxww());
        List listRgvfuqvkyq = eablkybsjgVarKegysxyocb.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
        List typeParameters = gtknphoqwxVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            yfnezrywwk yfnezrywwkVarIobyxmoadg = gtknphoqwxVarNufgyqmvbu.gxszxtbevo().iobyxmoadg((zh.esjtqupxsv) it.next());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVarIobyxmoadg);
            arrayList.add(yfnezrywwkVarIobyxmoadg);
        }
        zoijcleaowVarW.u(zoijcleaowVarOkpsazkaxt.iobyxmoadg(), sh.ntlheqmsrt.wkgbmnqykc(gtknphoqwxVar.getVisibility()), hg.jyumaefscl.ixidwrxhsl(listRgvfuqvkyq, arrayList));
        zoijcleaowVarW.b(false);
        zoijcleaowVarW.c(zoijcleaowVarOkpsazkaxt.zoijcleaow());
        zoijcleaowVarW.j(eablkybsjgVarKegysxyocb.ojitshcjhn());
        gtknphoqwxVarNufgyqmvbu.iobyxmoadg().nufgyqmvbu().eablkybsjg(gtknphoqwxVar, zoijcleaowVarW);
        return zoijcleaowVarW;
    }

    private final void tbqsvytpvh(ii.gxszxtbevo gxszxtbevoVar, Collection collection) {
        zh.oxmwwwfdhm oxmwwwfdhmVar = (zh.oxmwwwfdhm) hg.jyumaefscl.eslsurpljm(((ppxfxbqfkf) cllcsxoeiz().invoke()).gxszxtbevo(gxszxtbevoVar));
        if (oxmwwwfdhmVar == null) {
            return;
        }
        collection.add(grlcpdaxtj(this, oxmwwwfdhmVar, null, jh.cdpycssgdh.FINAL, 2, null));
    }

    private final uh.eablkybsjg u(zh.iwizpuwonk iwizpuwonkVar) {
        uh.eablkybsjg eablkybsjgVarS = uh.eablkybsjg.s(kegysxyocb(), vh.nufgyqmvbu.iobyxmoadg(jpowsppfya(), iwizpuwonkVar), iwizpuwonkVar.getName(), jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(iwizpuwonkVar), true);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarS, "createJavaMethod(...)");
        eablkybsjgVarS.r(null, dsvhmnatus(), hg.jyumaefscl.wflxmlrfwp(), hg.jyumaefscl.wflxmlrfwp(), hg.jyumaefscl.wflxmlrfwp(), jpowsppfya().lqeggnwhkg().rgvfuqvkyq(iwizpuwonkVar.getType(), xh.zoijcleaow.zoijcleaow(fiwbwshyhd.COMMON, false, false, null, 6, null)), jh.cdpycssgdh.f51295zdlpuopuiu.iobyxmoadg(false, false, true), jh.zdlpuopuiu.f51354eablkybsjg, null);
        eablkybsjgVarS.v(false, false);
        jpowsppfya().iobyxmoadg().nufgyqmvbu().wkgbmnqykc(iwizpuwonkVar, eablkybsjgVarS);
        return eablkybsjgVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection v(ii.gxszxtbevo gxszxtbevoVar) {
        Collection collectionGxszxtbevo = ((ppxfxbqfkf) cllcsxoeiz().invoke()).gxszxtbevo(gxszxtbevoVar);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionGxszxtbevo, 10));
        Iterator it = collectionGxszxtbevo.iterator();
        while (it.hasNext()) {
            arrayList.add(ribwqtqdhb((zh.oxmwwwfdhm) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection w(ii.gxszxtbevo gxszxtbevoVar) {
        Set setG = g(gxszxtbevoVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setG) {
            jztzpxfvev jztzpxfvevVar = (jztzpxfvev) obj;
            if (!sh.tzroggbefp.wkgbmnqykc(jztzpxfvevVar) && sh.dxjokdxxww.draadjrbmk(jztzpxfvevVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void weqkydbzbr(List list, jh.draadjrbmk draadjrbmkVar, int i13, zh.oxmwwwfdhm oxmwwwfdhmVar, zi.kegysxyocb kegysxyocbVar, zi.kegysxyocb kegysxyocbVar2) {
        kh.nufgyqmvbu nufgyqmvbuVarZoijcleaow = kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
        ii.gxszxtbevo name = oxmwwwfdhmVar.getName();
        zi.kegysxyocb kegysxyocbVarAgtfadlqog = ageimvtcrz.agtfadlqog(kegysxyocbVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kegysxyocbVarAgtfadlqog, "makeNotNullable(...)");
        list.add(new mh.ntlheqmsrt(draadjrbmkVar, null, i13, nufgyqmvbuVarZoijcleaow, name, kegysxyocbVarAgtfadlqog, oxmwwwfdhmVar.cllcsxoeiz(), false, false, kegysxyocbVar2 != null ? ageimvtcrz.agtfadlqog(kegysxyocbVar2) : null, jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(oxmwwwfdhmVar)));
    }

    private final jh.wkgbmnqykc wizcaqwiak() {
        boolean zWflxmlrfwp = this.f119797ojitshcjhn.wflxmlrfwp();
        if ((this.f119797ojitshcjhn.hcddaimhww() || !this.f119797ojitshcjhn.oxmwwwfdhm()) && !zWflxmlrfwp) {
            return null;
        }
        jh.eablkybsjg eablkybsjgVarKegysxyocb = kegysxyocb();
        uh.zoijcleaow zoijcleaowVarW = uh.zoijcleaow.w(eablkybsjgVarKegysxyocb, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), true, jpowsppfya().iobyxmoadg().zdlpuopuiu().iobyxmoadg(this.f119797ojitshcjhn));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarW, "createJavaConstructor(...)");
        List listLxfrhoxuzk = zWflxmlrfwp ? lxfrhoxuzk(zoijcleaowVarW) : Collections.emptyList();
        zoijcleaowVarW.c(false);
        zoijcleaowVarW.t(listLxfrhoxuzk, e(eablkybsjgVarKegysxyocb));
        zoijcleaowVarW.b(true);
        zoijcleaowVarW.j(eablkybsjgVarKegysxyocb.ojitshcjhn());
        jpowsppfya().iobyxmoadg().nufgyqmvbu().eablkybsjg(this.f119797ojitshcjhn, zoijcleaowVarW);
        return zoijcleaowVarW;
    }

    private final boolean x(jztzpxfvev jztzpxfvevVar) {
        sh.dxjokdxxww dxjokdxxwwVar = sh.dxjokdxxww.f106527ojitshcjhn;
        ii.gxszxtbevo name = jztzpxfvevVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        if (!dxjokdxxwwVar.agtfadlqog(name)) {
            return false;
        }
        ii.gxszxtbevo name2 = jztzpxfvevVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name2, "getName(...)");
        Set setG = g(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setG.iterator();
        while (it.hasNext()) {
            jh.lereixgezr lereixgezrVarDraadjrbmk = sh.dxjokdxxww.draadjrbmk((jztzpxfvev) it.next());
            if (lereixgezrVarDraadjrbmk != null) {
                arrayList.add(lereixgezrVarDraadjrbmk);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (j(jztzpxfvevVar, (jh.lereixgezr) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean yzdjzghtvl(jztzpxfvev jztzpxfvevVar, jh.lereixgezr lereixgezrVar) {
        if (sh.gxszxtbevo.f106533ojitshcjhn.wflxmlrfwp(jztzpxfvevVar)) {
            lereixgezrVar = lereixgezrVar.iobyxmoadg();
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lereixgezrVar);
        return ezmngbhpjk(lereixgezrVar, jztzpxfvevVar);
    }

    private final void zeieaojujs(ii.gxszxtbevo gxszxtbevoVar, Collection collection, Collection collection2, Collection collection3, tg.draadjrbmk draadjrbmkVar) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            jztzpxfvev jztzpxfvevVar = (jztzpxfvev) it.next();
            jj.iobyxmoadg.iobyxmoadg(collection3, q(jztzpxfvevVar, draadjrbmkVar, gxszxtbevoVar, collection));
            jj.iobyxmoadg.iobyxmoadg(collection3, p(jztzpxfvevVar, draadjrbmkVar, collection));
            jj.iobyxmoadg.iobyxmoadg(collection3, r(jztzpxfvevVar, draadjrbmkVar));
        }
    }

    @Override // wh.mbcevpiqjq
    protected Set cdpycssgdh(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        if (this.f119797ojitshcjhn.wflxmlrfwp()) {
            return iobyxmoadg();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((ppxfxbqfkf) cllcsxoeiz().invoke()).ppxfxbqfkf());
        Collection collectionZoijcleaow = kegysxyocb().btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        Iterator it = collectionZoijcleaow.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, ((zi.kegysxyocb) it.next()).agtfadlqog().ppxfxbqfkf());
        }
        return linkedHashSet;
    }

    @Override // wh.mbcevpiqjq
    protected jh.vipkmwdibw dsvhmnatus() {
        return li.dxjokdxxww.draadjrbmk(kegysxyocb());
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        yi.nufgyqmvbu nufgyqmvbuVar;
        jh.eablkybsjg eablkybsjgVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        s(name, location);
        lereixgezr lereixgezrVar = (lereixgezr) stevsuqkhv();
        return (lereixgezrVar == null || (nufgyqmvbuVar = lereixgezrVar.f119801yggfygwlhe) == null || (eablkybsjgVar = (jh.eablkybsjg) nufgyqmvbuVar.invoke(name)) == null) ? (jh.nufgyqmvbu) this.f119801yggfygwlhe.invoke(name) : eablkybsjgVar;
    }

    @Override // wh.mbcevpiqjq
    protected void esjtqupxsv(Collection result, ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        if (this.f119797ojitshcjhn.vdvldrhtss() && ((ppxfxbqfkf) cllcsxoeiz().invoke()).eablkybsjg(name) != null) {
            Collection collection = result;
            if (collection.isEmpty()) {
                zh.iwizpuwonk iwizpuwonkVarEablkybsjg = ((ppxfxbqfkf) cllcsxoeiz().invoke()).eablkybsjg(name);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iwizpuwonkVarEablkybsjg);
                result.add(u(iwizpuwonkVarEablkybsjg));
            } else {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (((jztzpxfvev) it.next()).dxjokdxxww().isEmpty()) {
                    }
                }
                zh.iwizpuwonk iwizpuwonkVarEablkybsjg2 = ((ppxfxbqfkf) cllcsxoeiz().invoke()).eablkybsjg(name);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iwizpuwonkVarEablkybsjg2);
                result.add(u(iwizpuwonkVarEablkybsjg2));
            }
        }
        jpowsppfya().iobyxmoadg().iwizpuwonk().zoijcleaow(kegysxyocb(), name, result, jpowsppfya());
    }

    public final yi.dxjokdxxww f() {
        return this.f119800vdvldrhtss;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wh.mbcevpiqjq
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public jh.eablkybsjg kegysxyocb() {
        return this.f119795agtfadlqog;
    }

    @Override // wh.mbcevpiqjq
    protected void istkbnxepw(ii.gxszxtbevo name, Collection result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        if (this.f119797ojitshcjhn.wflxmlrfwp()) {
            tbqsvytpvh(name, result);
        }
        Set setI = i(name);
        if (setI.isEmpty()) {
            return;
        }
        jj.draadjrbmk.zoijcleaow zoijcleaowVar = jj.draadjrbmk.f51581jyumaefscl;
        jj.draadjrbmk draadjrbmkVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        jj.draadjrbmk draadjrbmkVarIobyxmoadg2 = zoijcleaowVar.iobyxmoadg();
        nuxfzjnpeb(setI, result, draadjrbmkVarIobyxmoadg, new iwizpuwonk(this));
        nuxfzjnpeb(ikoacuggdj.btonecajqb(setI, draadjrbmkVarIobyxmoadg), draadjrbmkVarIobyxmoadg2, null, new cqumvgiudr(this));
        Collection collectionWkgbmnqykc = th.iobyxmoadg.wkgbmnqykc(name, ikoacuggdj.draadjrbmk(setI, draadjrbmkVarIobyxmoadg2), result, kegysxyocb(), jpowsppfya().iobyxmoadg().ppxfxbqfkf(), jpowsppfya().iobyxmoadg().gtknphoqwx().iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionWkgbmnqykc, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionWkgbmnqykc);
    }

    @Override // wh.mbcevpiqjq
    protected mbcevpiqjq.iobyxmoadg jlmebxxoox(zh.oxmwwwfdhm method, List methodTypeParameters, zi.kegysxyocb returnType, List valueParameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(method, "method");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(returnType, "returnType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(valueParameters, "valueParameters");
        th.ojitshcjhn.zoijcleaow zoijcleaowVarIobyxmoadg = jpowsppfya().iobyxmoadg().kcexrzcfyt().iobyxmoadg(method, kegysxyocb(), returnType, null, valueParameters, methodTypeParameters);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarIobyxmoadg, "resolvePropagatedSignature(...)");
        zi.kegysxyocb kegysxyocbVarWkgbmnqykc = zoijcleaowVarIobyxmoadg.wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kegysxyocbVarWkgbmnqykc, "getReturnType(...)");
        zi.kegysxyocb kegysxyocbVarPpxfxbqfkf = zoijcleaowVarIobyxmoadg.ppxfxbqfkf();
        List listGxszxtbevo = zoijcleaowVarIobyxmoadg.gxszxtbevo();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listGxszxtbevo, "getValueParameters(...)");
        List listEablkybsjg = zoijcleaowVarIobyxmoadg.eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listEablkybsjg, "getTypeParameters(...)");
        boolean zLqeggnwhkg = zoijcleaowVarIobyxmoadg.lqeggnwhkg();
        List listZoijcleaow = zoijcleaowVarIobyxmoadg.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listZoijcleaow, "getErrors(...)");
        return new mbcevpiqjq.iobyxmoadg(kegysxyocbVarWkgbmnqykc, kegysxyocbVarPpxfxbqfkf, listGxszxtbevo, listEablkybsjg, zLqeggnwhkg, listZoijcleaow);
    }

    @Override // wh.mbcevpiqjq
    protected Set jyumaefscl(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        return ikoacuggdj.draadjrbmk((Set) this.f119798oxmwwwfdhm.invoke(), ((Map) this.f119802zdlpuopuiu.invoke()).keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wh.mbcevpiqjq
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet cqumvgiudr(si.wkgbmnqykc kindFilter, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        Collection collectionZoijcleaow = kegysxyocb().btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZoijcleaow.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(linkedHashSet, ((zi.kegysxyocb) it.next()).agtfadlqog().iobyxmoadg());
        }
        linkedHashSet.addAll(((ppxfxbqfkf) cllcsxoeiz().invoke()).iobyxmoadg());
        linkedHashSet.addAll(((ppxfxbqfkf) cllcsxoeiz().invoke()).zoijcleaow());
        linkedHashSet.addAll(jyumaefscl(kindFilter, draadjrbmkVar));
        linkedHashSet.addAll(jpowsppfya().iobyxmoadg().iwizpuwonk().wkgbmnqykc(kegysxyocb(), jpowsppfya()));
        return linkedHashSet;
    }

    public void s(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        qh.iobyxmoadg.iobyxmoadg(jpowsppfya().iobyxmoadg().draadjrbmk(), location, kegysxyocb(), name);
    }

    @Override // wh.mbcevpiqjq
    public String toString() {
        return "Lazy Java member scope for " + this.f119797ojitshcjhn.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wh.mbcevpiqjq
    /* JADX INFO: renamed from: uawqvzlxes, reason: merged with bridge method [inline-methods] */
    public wh.zoijcleaow lereixgezr() {
        return new wh.zoijcleaow(this.f119797ojitshcjhn, yggfygwlhe.f119860zdlpuopuiu);
    }

    @Override // wh.mbcevpiqjq
    protected boolean ulzqkzuiru(uh.eablkybsjg eablkybsjgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        if (this.f119797ojitshcjhn.wflxmlrfwp()) {
            return false;
        }
        return k(eablkybsjgVar);
    }

    @Override // wh.mbcevpiqjq, si.draadjrbmk, si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        s(name, location);
        return super.wkgbmnqykc(name, location);
    }

    @Override // wh.mbcevpiqjq, si.draadjrbmk, si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        s(name, location);
        return super.zoijcleaow(name, location);
    }

    @Override // wh.mbcevpiqjq
    protected void zynmafqrjb(Collection result, ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        Set setG = g(name);
        if (!sh.mbcevpiqjq.f106567iobyxmoadg.gtknphoqwx(name) && !sh.dxjokdxxww.f106527ojitshcjhn.agtfadlqog(name)) {
            Set set = setG;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((jh.lereixgezr) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (k((jztzpxfvev) obj)) {
                    arrayList.add(obj);
                }
            }
            lrnfpwlwnk(result, name, arrayList, false);
            return;
        }
        jj.draadjrbmk draadjrbmkVarIobyxmoadg = jj.draadjrbmk.f51581jyumaefscl.iobyxmoadg();
        Collection collectionWkgbmnqykc = th.iobyxmoadg.wkgbmnqykc(name, setG, hg.jyumaefscl.wflxmlrfwp(), kegysxyocb(), vi.iwizpuwonk.f116930iobyxmoadg, jpowsppfya().iobyxmoadg().gtknphoqwx().iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionWkgbmnqykc, "resolveOverridesForNonStaticMembers(...)");
        zeieaojujs(name, result, collectionWkgbmnqykc, result, new iobyxmoadg(this));
        zeieaojujs(name, result, collectionWkgbmnqykc, draadjrbmkVarIobyxmoadg, new zoijcleaow(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setG) {
            if (k((jztzpxfvev) obj2)) {
                arrayList2.add(obj2);
            }
        }
        lrnfpwlwnk(result, name, hg.jyumaefscl.ixidwrxhsl(arrayList2, draadjrbmkVarIobyxmoadg), true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lereixgezr(vh.gtknphoqwx c13, jh.eablkybsjg ownerDescriptor, zh.lqeggnwhkg jClass, boolean z13, lereixgezr lereixgezrVar) {
        super(c13, lereixgezrVar);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ownerDescriptor, "ownerDescriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jClass, "jClass");
        this.f119795agtfadlqog = ownerDescriptor;
        this.f119797ojitshcjhn = jClass;
        this.f119799rgvfuqvkyq = z13;
        this.f119800vdvldrhtss = c13.eablkybsjg().wkgbmnqykc(new rgvfuqvkyq(this, c13));
        this.f119798oxmwwwfdhm = c13.eablkybsjg().wkgbmnqykc(new vdvldrhtss(this));
        this.f119796kcexrzcfyt = c13.eablkybsjg().wkgbmnqykc(new oxmwwwfdhm(c13, this));
        this.f119802zdlpuopuiu = c13.eablkybsjg().wkgbmnqykc(new kcexrzcfyt(this));
        this.f119801yggfygwlhe = c13.eablkybsjg().eablkybsjg(new zdlpuopuiu(this, c13));
    }
}
