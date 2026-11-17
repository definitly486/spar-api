package wh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh.iyctptxqzt;
import zi.fiwbwshyhd;
import zi.ikoacuggdj;
import zi.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb implements uh.lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f119747dxjokdxxww = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqb.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqb.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqb.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yh.iobyxmoadg f119748eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yi.dxjokdxxww f119749gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vh.gtknphoqwx f119750iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f119751lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f119752nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.btonecajqb f119753ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yi.dxjokdxxww f119754wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zh.iobyxmoadg f119755zoijcleaow;

    public btonecajqb(vh.gtknphoqwx c13, zh.iobyxmoadg javaAnnotation, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaAnnotation, "javaAnnotation");
        this.f119750iobyxmoadg = c13;
        this.f119755zoijcleaow = javaAnnotation;
        this.f119753ppxfxbqfkf = c13.eablkybsjg().iobyxmoadg(new lqeggnwhkg(this));
        this.f119754wkgbmnqykc = c13.eablkybsjg().wkgbmnqykc(new nufgyqmvbu(this));
        this.f119748eablkybsjg = c13.iobyxmoadg().zdlpuopuiu().iobyxmoadg(javaAnnotation);
        this.f119749gxszxtbevo = c13.eablkybsjg().wkgbmnqykc(new dxjokdxxww(this));
        this.f119751lqeggnwhkg = javaAnnotation.iobyxmoadg();
        this.f119752nufgyqmvbu = javaAnnotation.iozdgvuglv() || z13;
    }

    private final ni.lqeggnwhkg agtfadlqog(zh.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof zh.ojitshcjhn) {
            return ni.dxjokdxxww.gxszxtbevo(ni.dxjokdxxww.f70090iobyxmoadg, ((zh.ojitshcjhn) zoijcleaowVar).getValue(), null, 2, null);
        }
        if (zoijcleaowVar instanceof zh.wflxmlrfwp) {
            zh.wflxmlrfwp wflxmlrfwpVar = (zh.wflxmlrfwp) zoijcleaowVar;
            return vdvldrhtss(wflxmlrfwpVar.wkgbmnqykc(), wflxmlrfwpVar.eablkybsjg());
        }
        if (!(zoijcleaowVar instanceof zh.eablkybsjg)) {
            if (zoijcleaowVar instanceof zh.ppxfxbqfkf) {
                return ojitshcjhn(((zh.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
            }
            if (zoijcleaowVar instanceof zh.nufgyqmvbu) {
                return oxmwwwfdhm(((zh.nufgyqmvbu) zoijcleaowVar).zoijcleaow());
            }
            return null;
        }
        zh.eablkybsjg eablkybsjgVar = (zh.eablkybsjg) zoijcleaowVar;
        ii.gxszxtbevo name = eablkybsjgVar.getName();
        if (name == null) {
            name = sh.ylkuphrtab.f106660ppxfxbqfkf;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(name);
        return rgvfuqvkyq(name, eablkybsjgVar.ppxfxbqfkf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ii.ppxfxbqfkf btonecajqb(btonecajqb btonecajqbVar) {
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = btonecajqbVar.f119755zoijcleaow.ppxfxbqfkf();
        if (zoijcleaowVarPpxfxbqfkf != null) {
            return zoijcleaowVarPpxfxbqfkf.iobyxmoadg();
        }
        return null;
    }

    private final jh.eablkybsjg dxjokdxxww(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        return jh.esjtqupxsv.wkgbmnqykc(this.f119750iobyxmoadg.wkgbmnqykc(), ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar), this.f119750iobyxmoadg.iobyxmoadg().zoijcleaow().gxszxtbevo().oxmwwwfdhm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ikoacuggdj kcexrzcfyt(btonecajqb btonecajqbVar) {
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = btonecajqbVar.gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo == null) {
            return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16438d, btonecajqbVar.f119755zoijcleaow.toString());
        }
        jh.eablkybsjg eablkybsjgVarGxszxtbevo = ih.wkgbmnqykc.gxszxtbevo(ih.wkgbmnqykc.f44282iobyxmoadg, ppxfxbqfkfVarGxszxtbevo, btonecajqbVar.f119750iobyxmoadg.wkgbmnqykc().wflxmlrfwp(), null, 4, null);
        if (eablkybsjgVarGxszxtbevo == null) {
            zh.lqeggnwhkg lqeggnwhkgVarYggfygwlhe = btonecajqbVar.f119755zoijcleaow.yggfygwlhe();
            eablkybsjgVarGxszxtbevo = lqeggnwhkgVarYggfygwlhe != null ? btonecajqbVar.f119750iobyxmoadg.iobyxmoadg().agtfadlqog().iobyxmoadg(lqeggnwhkgVarYggfygwlhe) : null;
            if (eablkybsjgVarGxszxtbevo == null) {
                eablkybsjgVarGxszxtbevo = btonecajqbVar.dxjokdxxww(ppxfxbqfkfVarGxszxtbevo);
            }
        }
        return eablkybsjgVarGxszxtbevo.ojitshcjhn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map nufgyqmvbu(btonecajqb btonecajqbVar) {
        Collection<zh.zoijcleaow> collectionOjitshcjhn = btonecajqbVar.f119755zoijcleaow.ojitshcjhn();
        ArrayList arrayList = new ArrayList();
        for (zh.zoijcleaow zoijcleaowVar : collectionOjitshcjhn) {
            ii.gxszxtbevo name = zoijcleaowVar.getName();
            if (name == null) {
                name = sh.ylkuphrtab.f106660ppxfxbqfkf;
            }
            ni.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = btonecajqbVar.agtfadlqog(zoijcleaowVar);
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = lqeggnwhkgVarAgtfadlqog != null ? gg.cqumvgiudr.iobyxmoadg(name, lqeggnwhkgVarAgtfadlqog) : null;
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return hg.tzroggbefp.kcexrzcfyt(arrayList);
    }

    private final ni.lqeggnwhkg ojitshcjhn(zh.iobyxmoadg iobyxmoadgVar) {
        return new ni.iobyxmoadg(new btonecajqb(this.f119750iobyxmoadg, iobyxmoadgVar, false, 4, null));
    }

    private final ni.lqeggnwhkg oxmwwwfdhm(zh.cqumvgiudr cqumvgiudrVar) {
        return ni.kcexrzcfyt.f70096zoijcleaow.iobyxmoadg(this.f119750iobyxmoadg.lqeggnwhkg().rgvfuqvkyq(cqumvgiudrVar, xh.zoijcleaow.zoijcleaow(fiwbwshyhd.COMMON, false, false, null, 7, null)));
    }

    private final ni.lqeggnwhkg rgvfuqvkyq(ii.gxszxtbevo gxszxtbevoVar, List list) {
        zi.kegysxyocb kegysxyocbVarDraadjrbmk;
        if (zi.ulzqkzuiru.iobyxmoadg(getType())) {
            return null;
        }
        jh.eablkybsjg eablkybsjgVarDraadjrbmk = pi.eablkybsjg.draadjrbmk(this);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDraadjrbmk);
        iyctptxqzt iyctptxqztVarZoijcleaow = th.iobyxmoadg.zoijcleaow(gxszxtbevoVar, eablkybsjgVarDraadjrbmk);
        if (iyctptxqztVarZoijcleaow == null || (kegysxyocbVarDraadjrbmk = iyctptxqztVarZoijcleaow.getType()) == null) {
            kegysxyocbVarDraadjrbmk = this.f119750iobyxmoadg.iobyxmoadg().wflxmlrfwp().wflxmlrfwp().draadjrbmk(mhtqkkgtqm.INVARIANT, bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16432c, new String[0]));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kegysxyocbVarDraadjrbmk, "getArrayType(...)");
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ni.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog((zh.zoijcleaow) it.next());
            if (lqeggnwhkgVarAgtfadlqog == null) {
                lqeggnwhkgVarAgtfadlqog = new ni.yggfygwlhe();
            }
            arrayList.add(lqeggnwhkgVarAgtfadlqog);
        }
        return ni.dxjokdxxww.f70090iobyxmoadg.ppxfxbqfkf(arrayList, kegysxyocbVarDraadjrbmk);
    }

    private final ni.lqeggnwhkg vdvldrhtss(ii.zoijcleaow zoijcleaowVar, ii.gxszxtbevo gxszxtbevoVar) {
        if (zoijcleaowVar == null || gxszxtbevoVar == null) {
            return null;
        }
        return new ni.gtknphoqwx(zoijcleaowVar, gxszxtbevoVar);
    }

    @Override // kh.ppxfxbqfkf
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public ikoacuggdj getType() {
        return (ikoacuggdj) yi.wflxmlrfwp.iobyxmoadg(this.f119754wkgbmnqykc, this, f119747dxjokdxxww[1]);
    }

    @Override // kh.ppxfxbqfkf
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public yh.iobyxmoadg lqeggnwhkg() {
        return this.f119748eablkybsjg;
    }

    @Override // kh.ppxfxbqfkf
    public ii.ppxfxbqfkf gxszxtbevo() {
        return (ii.ppxfxbqfkf) yi.wflxmlrfwp.zoijcleaow(this.f119753ppxfxbqfkf, this, f119747dxjokdxxww[0]);
    }

    @Override // uh.lqeggnwhkg
    public boolean iobyxmoadg() {
        return this.f119751lqeggnwhkg;
    }

    public String toString() {
        return ki.agtfadlqog.stevsuqkhv(ki.agtfadlqog.f55536nufgyqmvbu, this, null, 2, null);
    }

    public final boolean wflxmlrfwp() {
        return this.f119752nufgyqmvbu;
    }

    @Override // kh.ppxfxbqfkf
    public Map zoijcleaow() {
        return (Map) yi.wflxmlrfwp.iobyxmoadg(this.f119749gxszxtbevo, this, f119747dxjokdxxww[2]);
    }

    public /* synthetic */ btonecajqb(vh.gtknphoqwx gtknphoqwxVar, zh.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, iobyxmoadgVar, (i13 & 4) != 0 ? false : z13);
    }
}
