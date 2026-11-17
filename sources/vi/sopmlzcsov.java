package vi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.yfnezrywwk;
import zi.bfopjjpdmp;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.metgxyhuhe;
import zi.mhtqkkgtqm;
import zi.opjhrmiecq;
import zi.rlfsiqarku;
import zi.skhdrjzrfn;
import zi.uwvvkdfqfp;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class sopmlzcsov {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.draadjrbmk f116963eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.draadjrbmk f116964gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f116965iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Map f116966lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f116967ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f116968wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sopmlzcsov f116969zoijcleaow;

    public sopmlzcsov(rgvfuqvkyq c13, sopmlzcsov sopmlzcsovVar, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugName, "debugName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containerPresentableName, "containerPresentableName");
        this.f116965iobyxmoadg = c13;
        this.f116969zoijcleaow = sopmlzcsovVar;
        this.f116967ppxfxbqfkf = debugName;
        this.f116968wkgbmnqykc = containerPresentableName;
        this.f116963eablkybsjg = c13.nufgyqmvbu().eablkybsjg(new kegysxyocb(this));
        this.f116964gxszxtbevo = c13.nufgyqmvbu().eablkybsjg(new tzroggbefp(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = hg.tzroggbefp.dxjokdxxww();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                di.kcexrzcfyt kcexrzcfytVar = (di.kcexrzcfyt) it.next();
                linkedHashMap.put(Integer.valueOf(kcexrzcfytVar.stevsuqkhv()), new xi.kegysxyocb(this.f116965iobyxmoadg, kcexrzcfytVar, i13));
                i13++;
            }
        }
        this.f116966lqeggnwhkg = linkedHashMap;
    }

    private final yfnezrywwk agtfadlqog(int i13) {
        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) this.f116966lqeggnwhkg.get(Integer.valueOf(i13));
        if (yfnezrywwkVar != null) {
            return yfnezrywwkVar;
        }
        sopmlzcsov sopmlzcsovVar = this.f116969zoijcleaow;
        if (sopmlzcsovVar != null) {
            return sopmlzcsovVar.agtfadlqog(i13);
        }
        return null;
    }

    private final ikoacuggdj btonecajqb(zi.kegysxyocb kegysxyocbVar, zi.kegysxyocb kegysxyocbVar2) {
        gh.dxjokdxxww dxjokdxxwwVarAgtfadlqog = ej.wkgbmnqykc.agtfadlqog(kegysxyocbVar);
        kh.nufgyqmvbu annotations = kegysxyocbVar.getAnnotations();
        zi.kegysxyocb kegysxyocbVarGtknphoqwx = gh.nufgyqmvbu.gtknphoqwx(kegysxyocbVar);
        List listEablkybsjg = gh.nufgyqmvbu.eablkybsjg(kegysxyocbVar);
        List listCzzsidtyhn = hg.jyumaefscl.czzsidtyhn(gh.nufgyqmvbu.wflxmlrfwp(kegysxyocbVar), 1);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listCzzsidtyhn, 10));
        Iterator it = listCzzsidtyhn.iterator();
        while (it.hasNext()) {
            arrayList.add(((iwxlajgraz) it.next()).getType());
        }
        return gh.nufgyqmvbu.zoijcleaow(dxjokdxxwwVarAgtfadlqog, annotations, kegysxyocbVarGtknphoqwx, listEablkybsjg, arrayList, null, kegysxyocbVar2, true).fmlbqenlif(kegysxyocbVar.mhtqkkgtqm());
    }

    private final zeieaojujs cqumvgiudr(di.vdvldrhtss vdvldrhtssVar) {
        jh.nufgyqmvbu nufgyqmvbuVarEsjtqupxsv;
        Object next;
        if (vdvldrhtssVar.opjhrmiecq()) {
            nufgyqmvbuVarEsjtqupxsv = (jh.nufgyqmvbu) this.f116963eablkybsjg.invoke(Integer.valueOf(vdvldrhtssVar.jhduphickx()));
            if (nufgyqmvbuVarEsjtqupxsv == null) {
                nufgyqmvbuVarEsjtqupxsv = esjtqupxsv(this, vdvldrhtssVar, vdvldrhtssVar.jhduphickx());
            }
        } else if (vdvldrhtssVar.auzgnhcxok()) {
            nufgyqmvbuVarEsjtqupxsv = agtfadlqog(vdvldrhtssVar.sflfametgt());
            if (nufgyqmvbuVarEsjtqupxsv == null) {
                return bj.draadjrbmk.f16409iobyxmoadg.eablkybsjg(bj.gtknphoqwx.f16477metgxyhuhe, String.valueOf(vdvldrhtssVar.sflfametgt()), this.f116968wkgbmnqykc);
            }
        } else if (vdvldrhtssVar.iwxlajgraz()) {
            String string = this.f116965iobyxmoadg.lqeggnwhkg().getString(vdvldrhtssVar.zfvoamnweg());
            Iterator it = wflxmlrfwp().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((yfnezrywwk) next).getName().zoijcleaow(), string));
            nufgyqmvbuVarEsjtqupxsv = (yfnezrywwk) next;
            if (nufgyqmvbuVarEsjtqupxsv == null) {
                return bj.draadjrbmk.f16409iobyxmoadg.eablkybsjg(bj.gtknphoqwx.f16488rlfsiqarku, string, this.f116965iobyxmoadg.eablkybsjg().toString());
            }
        } else {
            if (!vdvldrhtssVar.uawqvzlxes()) {
                return bj.draadjrbmk.f16409iobyxmoadg.eablkybsjg(bj.gtknphoqwx.f16507yfnezrywwk, new String[0]);
            }
            nufgyqmvbuVarEsjtqupxsv = (jh.nufgyqmvbu) this.f116964gxszxtbevo.invoke(Integer.valueOf(vdvldrhtssVar.ydmasvzmpa()));
            if (nufgyqmvbuVarEsjtqupxsv == null) {
                nufgyqmvbuVarEsjtqupxsv = esjtqupxsv(this, vdvldrhtssVar, vdvldrhtssVar.ydmasvzmpa());
            }
        }
        zeieaojujs zeieaojujsVarBtonecajqb = nufgyqmvbuVarEsjtqupxsv.btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
        return zeieaojujsVarBtonecajqb;
    }

    private final ikoacuggdj draadjrbmk(opjhrmiecq opjhrmiecqVar, zeieaojujs zeieaojujsVar, List list, boolean z13) {
        ikoacuggdj ikoacuggdjVarGtknphoqwx = zi.ntlheqmsrt.gtknphoqwx(opjhrmiecqVar, zeieaojujsVar, list, z13, null, 16, null);
        if (gh.nufgyqmvbu.vdvldrhtss(ikoacuggdjVarGtknphoqwx)) {
            return zdlpuopuiu(ikoacuggdjVarGtknphoqwx);
        }
        return null;
    }

    private final jh.nufgyqmvbu dxjokdxxww(int i13) {
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = jpowsppfya.iobyxmoadg(this.f116965iobyxmoadg.lqeggnwhkg(), i13);
        if (zoijcleaowVarIobyxmoadg.dxjokdxxww()) {
            return null;
        }
        return jh.esjtqupxsv.gxszxtbevo(this.f116965iobyxmoadg.ppxfxbqfkf().vdvldrhtss(), zoijcleaowVarIobyxmoadg);
    }

    private static final jh.eablkybsjg esjtqupxsv(sopmlzcsov sopmlzcsovVar, di.vdvldrhtss vdvldrhtssVar, int i13) {
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = jpowsppfya.iobyxmoadg(sopmlzcsovVar.f116965iobyxmoadg.lqeggnwhkg(), i13);
        List listJlmebxxoox = lj.wflxmlrfwp.jlmebxxoox(lj.wflxmlrfwp.dsvhmnatus(lj.wflxmlrfwp.agtfadlqog(vdvldrhtssVar, new ntlheqmsrt(sopmlzcsovVar)), ulzqkzuiru.f116974zdlpuopuiu));
        int iCqumvgiudr = lj.wflxmlrfwp.cqumvgiudr(lj.wflxmlrfwp.agtfadlqog(zoijcleaowVarIobyxmoadg, new kotlin.jvm.internal.cdpycssgdh() { // from class: vi.sopmlzcsov.iobyxmoadg
            @Override // ah.wflxmlrfwp
            public Object get(Object obj) {
                return ((ii.zoijcleaow) obj).eablkybsjg();
            }

            @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.gxszxtbevo
            public ah.gxszxtbevo getOwner() {
                return kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(ii.zoijcleaow.class);
            }

            @Override // kotlin.jvm.internal.gxszxtbevo
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (listJlmebxxoox.size() < iCqumvgiudr) {
            listJlmebxxoox.add(0);
        }
        return sopmlzcsovVar.f116965iobyxmoadg.ppxfxbqfkf().oxmwwwfdhm().wkgbmnqykc(zoijcleaowVarIobyxmoadg, listJlmebxxoox);
    }

    private final ikoacuggdj gtknphoqwx(opjhrmiecq opjhrmiecqVar, zeieaojujs zeieaojujsVar, List list, boolean z13) {
        ikoacuggdj ikoacuggdjVarDraadjrbmk;
        int size;
        int size2 = zeieaojujsVar.getParameters().size() - list.size();
        if (size2 != 0) {
            ikoacuggdjVarDraadjrbmk = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                zeieaojujs zeieaojujsVarBtonecajqb = zeieaojujsVar.wflxmlrfwp().crxdokpmqz(size).btonecajqb();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
                ikoacuggdjVarDraadjrbmk = zi.ntlheqmsrt.gtknphoqwx(opjhrmiecqVar, zeieaojujsVarBtonecajqb, list, z13, null, 16, null);
            }
        } else {
            ikoacuggdjVarDraadjrbmk = draadjrbmk(opjhrmiecqVar, zeieaojujsVar, list, z13);
        }
        return ikoacuggdjVarDraadjrbmk == null ? bj.draadjrbmk.f16409iobyxmoadg.gxszxtbevo(bj.gtknphoqwx.f16437czzsidtyhn, list, zeieaojujsVar, new String[0]) : ikoacuggdjVarDraadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.nufgyqmvbu gxszxtbevo(sopmlzcsov sopmlzcsovVar, int i13) {
        return sopmlzcsovVar.lqeggnwhkg(i13);
    }

    private final iwxlajgraz iwizpuwonk(yfnezrywwk yfnezrywwkVar, di.vdvldrhtss.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.pmvmpeiblj() == di.vdvldrhtss.zoijcleaow.ppxfxbqfkf.STAR) {
            return yfnezrywwkVar == null ? new rlfsiqarku(this.f116965iobyxmoadg.ppxfxbqfkf().vdvldrhtss().wflxmlrfwp()) : new uwvvkdfqfp(yfnezrywwkVar);
        }
        dsvhmnatus dsvhmnatusVar = dsvhmnatus.f116895iobyxmoadg;
        di.vdvldrhtss.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVarPmvmpeiblj = zoijcleaowVar.pmvmpeiblj();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPmvmpeiblj, "getProjection(...)");
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = dsvhmnatusVar.ppxfxbqfkf(ppxfxbqfkfVarPmvmpeiblj);
        di.vdvldrhtss vdvldrhtssVarRgvfuqvkyq = fi.gxszxtbevo.rgvfuqvkyq(zoijcleaowVar, this.f116965iobyxmoadg.btonecajqb());
        return vdvldrhtssVarRgvfuqvkyq == null ? new skhdrjzrfn(bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16509yzdjzghtvl, zoijcleaowVar.toString())) : new skhdrjzrfn(mhtqkkgtqmVarPpxfxbqfkf, yggfygwlhe(vdvldrhtssVarRgvfuqvkyq));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.nufgyqmvbu jyumaefscl(sopmlzcsov sopmlzcsovVar, int i13) {
        return sopmlzcsovVar.dxjokdxxww(i13);
    }

    private final opjhrmiecq kcexrzcfyt(List list, kh.nufgyqmvbu nufgyqmvbuVar, zeieaojujs zeieaojujsVar, jh.wflxmlrfwp wflxmlrfwpVar) {
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((bfopjjpdmp) it.next()).iobyxmoadg(nufgyqmvbuVar, zeieaojujsVar, wflxmlrfwpVar));
        }
        return opjhrmiecq.f130109yggfygwlhe.dxjokdxxww(hg.jyumaefscl.lereixgezr(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final di.vdvldrhtss lereixgezr(sopmlzcsov sopmlzcsovVar, di.vdvldrhtss it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return fi.gxszxtbevo.btonecajqb(it, sopmlzcsovVar.f116965iobyxmoadg.btonecajqb());
    }

    private final jh.nufgyqmvbu lqeggnwhkg(int i13) {
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = jpowsppfya.iobyxmoadg(this.f116965iobyxmoadg.lqeggnwhkg(), i13);
        return zoijcleaowVarIobyxmoadg.dxjokdxxww() ? this.f116965iobyxmoadg.ppxfxbqfkf().zoijcleaow(zoijcleaowVarIobyxmoadg) : jh.esjtqupxsv.ppxfxbqfkf(this.f116965iobyxmoadg.ppxfxbqfkf().vdvldrhtss(), zoijcleaowVarIobyxmoadg);
    }

    private final ikoacuggdj nufgyqmvbu(int i13) {
        if (jpowsppfya.iobyxmoadg(this.f116965iobyxmoadg.lqeggnwhkg(), i13).dxjokdxxww()) {
            return this.f116965iobyxmoadg.ppxfxbqfkf().ojitshcjhn().iobyxmoadg();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List oxmwwwfdhm(sopmlzcsov sopmlzcsovVar, di.vdvldrhtss vdvldrhtssVar) {
        return sopmlzcsovVar.f116965iobyxmoadg.ppxfxbqfkf().wkgbmnqykc().wkgbmnqykc(vdvldrhtssVar, sopmlzcsovVar.f116965iobyxmoadg.lqeggnwhkg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pmvmpeiblj(di.vdvldrhtss it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.ribwqtqdhb();
    }

    private static final List rgvfuqvkyq(di.vdvldrhtss vdvldrhtssVar, sopmlzcsov sopmlzcsovVar) {
        List listVipkmwdibw = vdvldrhtssVar.vipkmwdibw();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listVipkmwdibw, "getArgumentList(...)");
        di.vdvldrhtss vdvldrhtssVarBtonecajqb = fi.gxszxtbevo.btonecajqb(vdvldrhtssVar, sopmlzcsovVar.f116965iobyxmoadg.btonecajqb());
        List listRgvfuqvkyq = vdvldrhtssVarBtonecajqb != null ? rgvfuqvkyq(vdvldrhtssVarBtonecajqb, sopmlzcsovVar) : null;
        if (listRgvfuqvkyq == null) {
            listRgvfuqvkyq = hg.jyumaefscl.wflxmlrfwp();
        }
        return hg.jyumaefscl.ixidwrxhsl(listVipkmwdibw, listRgvfuqvkyq);
    }

    public static /* synthetic */ ikoacuggdj vdvldrhtss(sopmlzcsov sopmlzcsovVar, di.vdvldrhtss vdvldrhtssVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return sopmlzcsovVar.ojitshcjhn(vdvldrhtssVar, z13);
    }

    private final ikoacuggdj zdlpuopuiu(zi.kegysxyocb kegysxyocbVar) {
        zi.kegysxyocb type;
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) hg.jyumaefscl.lxfrhoxuzk(gh.nufgyqmvbu.wflxmlrfwp(kegysxyocbVar));
        if (iwxlajgrazVar == null || (type = iwxlajgrazVar.getType()) == null) {
            return null;
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = type.grlcpdaxtj().ylkuphrtab();
        ii.ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn = nufgyqmvbuVarWkgbmnqykc != null ? pi.eablkybsjg.ojitshcjhn(nufgyqmvbuVarWkgbmnqykc) : null;
        if (type.fyldjkxazc().size() != 1 || (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarOjitshcjhn, gh.ojitshcjhn.f37253jyumaefscl) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarOjitshcjhn, crxdokpmqz.f116888iobyxmoadg))) {
            return (ikoacuggdj) kegysxyocbVar;
        }
        zi.kegysxyocb type2 = ((iwxlajgraz) hg.jyumaefscl.yzdjzghtvl(type.fyldjkxazc())).getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type2, "getType(...)");
        jh.wflxmlrfwp wflxmlrfwpVarEablkybsjg = this.f116965iobyxmoadg.eablkybsjg();
        jh.iobyxmoadg iobyxmoadgVar = wflxmlrfwpVarEablkybsjg instanceof jh.iobyxmoadg ? (jh.iobyxmoadg) wflxmlrfwpVarEablkybsjg : null;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar != null ? pi.eablkybsjg.gtknphoqwx(iobyxmoadgVar) : null, stevsuqkhv.f116971iobyxmoadg) ? btonecajqb(kegysxyocbVar, type2) : btonecajqb(kegysxyocbVar, type2);
    }

    public final ikoacuggdj ojitshcjhn(di.vdvldrhtss proto, boolean z13) {
        ikoacuggdj ikoacuggdjVarGtknphoqwx;
        ikoacuggdj ikoacuggdjVarBtonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        ikoacuggdj ikoacuggdjVarNufgyqmvbu = proto.opjhrmiecq() ? nufgyqmvbu(proto.jhduphickx()) : proto.uawqvzlxes() ? nufgyqmvbu(proto.ydmasvzmpa()) : null;
        if (ikoacuggdjVarNufgyqmvbu != null) {
            return ikoacuggdjVarNufgyqmvbu;
        }
        zeieaojujs zeieaojujsVarCqumvgiudr = cqumvgiudr(proto);
        if (bj.draadjrbmk.wflxmlrfwp(zeieaojujsVarCqumvgiudr.ylkuphrtab())) {
            return bj.draadjrbmk.f16409iobyxmoadg.ppxfxbqfkf(bj.gtknphoqwx.f16462ixidwrxhsl, zeieaojujsVarCqumvgiudr, zeieaojujsVarCqumvgiudr.toString());
        }
        xi.iobyxmoadg iobyxmoadgVar = new xi.iobyxmoadg(this.f116965iobyxmoadg.nufgyqmvbu(), new mbcevpiqjq(this, proto));
        opjhrmiecq opjhrmiecqVarKcexrzcfyt = kcexrzcfyt(this.f116965iobyxmoadg.ppxfxbqfkf().jyumaefscl(), iobyxmoadgVar, zeieaojujsVarCqumvgiudr, this.f116965iobyxmoadg.eablkybsjg());
        List listRgvfuqvkyq = rgvfuqvkyq(proto, this);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
        int i13 = 0;
        for (Object obj : listRgvfuqvkyq) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            List parameters = zeieaojujsVarCqumvgiudr.getParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
            arrayList.add(iwizpuwonk((yfnezrywwk) hg.jyumaefscl.lrnfpwlwnk(parameters, i13), (di.vdvldrhtss.zoijcleaow) obj));
            i13 = i14;
        }
        List listM = hg.jyumaefscl.m(arrayList);
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = zeieaojujsVarCqumvgiudr.ylkuphrtab();
        if (z13 && (nufgyqmvbuVarWkgbmnqykc instanceof jh.uwvvkdfqfp)) {
            ikoacuggdj ikoacuggdjVarPpxfxbqfkf = zi.ntlheqmsrt.ppxfxbqfkf((jh.uwvvkdfqfp) nufgyqmvbuVarWkgbmnqykc, listM);
            ikoacuggdjVarGtknphoqwx = ikoacuggdjVarPpxfxbqfkf.fmlbqenlif(zi.ulzqkzuiru.zoijcleaow(ikoacuggdjVarPpxfxbqfkf) || proto.czzsidtyhn()).rhgxfdycjh(kcexrzcfyt(this.f116965iobyxmoadg.ppxfxbqfkf().jyumaefscl(), kh.nufgyqmvbu.f55413nufgyqmvbu.iobyxmoadg(hg.jyumaefscl.grlcpdaxtj(iobyxmoadgVar, ikoacuggdjVarPpxfxbqfkf.getAnnotations())), zeieaojujsVarCqumvgiudr, this.f116965iobyxmoadg.eablkybsjg()));
        } else if (fi.zoijcleaow.f33923iobyxmoadg.wkgbmnqykc(proto.jztzpxfvev()).booleanValue()) {
            ikoacuggdjVarGtknphoqwx = gtknphoqwx(opjhrmiecqVarKcexrzcfyt, zeieaojujsVarCqumvgiudr, listM, proto.czzsidtyhn());
        } else {
            ikoacuggdjVarGtknphoqwx = zi.ntlheqmsrt.gtknphoqwx(opjhrmiecqVarKcexrzcfyt, zeieaojujsVarCqumvgiudr, listM, proto.czzsidtyhn(), null, 16, null);
            if (fi.zoijcleaow.f33949zoijcleaow.wkgbmnqykc(proto.jztzpxfvev()).booleanValue()) {
                zi.esjtqupxsv esjtqupxsvVarPpxfxbqfkf = zi.esjtqupxsv.iobyxmoadg.ppxfxbqfkf(zi.esjtqupxsv.f130025iwizpuwonk, ikoacuggdjVarGtknphoqwx, true, false, 4, null);
                if (esjtqupxsvVarPpxfxbqfkf == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + ikoacuggdjVarGtknphoqwx + '\'').toString());
                }
                ikoacuggdjVarGtknphoqwx = esjtqupxsvVarPpxfxbqfkf;
            }
        }
        di.vdvldrhtss vdvldrhtssVarIobyxmoadg = fi.gxszxtbevo.iobyxmoadg(proto, this.f116965iobyxmoadg.btonecajqb());
        return (vdvldrhtssVarIobyxmoadg == null || (ikoacuggdjVarBtonecajqb = metgxyhuhe.btonecajqb(ikoacuggdjVarGtknphoqwx, ojitshcjhn(vdvldrhtssVarIobyxmoadg, false))) == null) ? ikoacuggdjVarGtknphoqwx : ikoacuggdjVarBtonecajqb;
    }

    public String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f116967ppxfxbqfkf);
        if (this.f116969zoijcleaow == null) {
            str = "";
        } else {
            str = ". Child of " + this.f116969zoijcleaow.f116967ppxfxbqfkf;
        }
        sb3.append(str);
        return sb3.toString();
    }

    public final List wflxmlrfwp() {
        return hg.jyumaefscl.m(this.f116966lqeggnwhkg.values());
    }

    public final zi.kegysxyocb yggfygwlhe(di.vdvldrhtss proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        if (!proto.weqkydbzbr()) {
            return ojitshcjhn(proto, true);
        }
        String string = this.f116965iobyxmoadg.lqeggnwhkg().getString(proto.xrmfcynszj());
        ikoacuggdj ikoacuggdjVarVdvldrhtss = vdvldrhtss(this, proto, false, 2, null);
        di.vdvldrhtss vdvldrhtssVarGxszxtbevo = fi.gxszxtbevo.gxszxtbevo(proto, this.f116965iobyxmoadg.btonecajqb());
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(vdvldrhtssVarGxszxtbevo);
        return this.f116965iobyxmoadg.ppxfxbqfkf().wflxmlrfwp().iobyxmoadg(proto, string, ikoacuggdjVarVdvldrhtss, vdvldrhtss(this, vdvldrhtssVarGxszxtbevo, false, 2, null));
    }
}
