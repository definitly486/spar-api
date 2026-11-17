package li;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.cllcsxoeiz;
import zi.kegysxyocb;
import zi.lrnfpwlwnk;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq implements aj.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.rgvfuqvkyq f62626eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f62627iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final aj.lqeggnwhkg f62628ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final aj.gxszxtbevo f62629wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final aj.eablkybsjg.iobyxmoadg f62630zoijcleaow;

    public static final class iobyxmoadg extends lrnfpwlwnk {

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f62631gtknphoqwx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(boolean z13, boolean z14, rgvfuqvkyq rgvfuqvkyqVar, aj.gxszxtbevo gxszxtbevoVar, aj.lqeggnwhkg lqeggnwhkgVar) {
            super(z13, z14, true, rgvfuqvkyqVar, gxszxtbevoVar, lqeggnwhkgVar);
            this.f62631gtknphoqwx = rgvfuqvkyqVar;
        }

        @Override // zi.lrnfpwlwnk
        public boolean gxszxtbevo(dj.dxjokdxxww subType, dj.dxjokdxxww superType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
            if (!(subType instanceof kegysxyocb)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof kegysxyocb) {
                return ((Boolean) this.f62631gtknphoqwx.f62626eablkybsjg.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public rgvfuqvkyq(Map map, aj.eablkybsjg.iobyxmoadg equalityAxioms, aj.lqeggnwhkg kotlinTypeRefiner, aj.gxszxtbevo kotlinTypePreparator, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(equalityAxioms, "equalityAxioms");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypePreparator, "kotlinTypePreparator");
        this.f62627iobyxmoadg = map;
        this.f62630zoijcleaow = equalityAxioms;
        this.f62628ppxfxbqfkf = kotlinTypeRefiner;
        this.f62629wkgbmnqykc = kotlinTypePreparator;
        this.f62626eablkybsjg = rgvfuqvkyqVar;
    }

    private final boolean fyldjkxazc(zeieaojujs zeieaojujsVar, zeieaojujs zeieaojujsVar2) {
        if (this.f62630zoijcleaow.iobyxmoadg(zeieaojujsVar, zeieaojujsVar2)) {
            return true;
        }
        Map map = this.f62627iobyxmoadg;
        if (map == null) {
            return false;
        }
        zeieaojujs zeieaojujsVar3 = (zeieaojujs) map.get(zeieaojujsVar);
        zeieaojujs zeieaojujsVar4 = (zeieaojujs) this.f62627iobyxmoadg.get(zeieaojujsVar2);
        if (zeieaojujsVar3 == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zeieaojujsVar3, zeieaojujsVar2)) {
            return zeieaojujsVar4 != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zeieaojujsVar4, zeieaojujsVar);
        }
        return true;
    }

    @Override // dj.ojitshcjhn
    public List agtfadlqog(dj.btonecajqb btonecajqbVar, dj.wflxmlrfwp constructor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructor, "constructor");
        return null;
    }

    @Override // dj.ojitshcjhn
    public boolean auzgnhcxok(dj.wflxmlrfwp c13, dj.wflxmlrfwp c14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c1");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c14, "c2");
        if (!(c13 instanceof zeieaojujs)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c14 instanceof zeieaojujs) {
            return aj.zoijcleaow.iobyxmoadg.iobyxmoadg(this, c13, c14) || fyldjkxazc((zeieaojujs) c13, (zeieaojujs) c14);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // dj.ojitshcjhn
    public boolean bfopjjpdmp(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.yadqdtsiqt(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public boolean btonecajqb(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(dxjokdxxwwVar);
        return (btonecajqbVarGxszxtbevo != null ? wkgbmnqykc(btonecajqbVarGxszxtbevo) : null) != null;
    }

    @Override // dj.ojitshcjhn
    public dj.dxjokdxxww cdpycssgdh(Collection collection) {
        return aj.zoijcleaow.iobyxmoadg.cdpycssgdh(this, collection);
    }

    @Override // zi.hszhottldk
    public dj.dxjokdxxww cllcsxoeiz(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.iwizpuwonk(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public dj.dxjokdxxww cqumvgiudr(dj.wkgbmnqykc wkgbmnqykcVar) {
        return aj.zoijcleaow.iobyxmoadg.okpsazkaxt(this, wkgbmnqykcVar);
    }

    @Override // dj.ojitshcjhn
    public dj.wflxmlrfwp crxdokpmqz(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(dxjokdxxwwVar);
        if (btonecajqbVarGxszxtbevo == null) {
            btonecajqbVarGxszxtbevo = zdlpuopuiu(dxjokdxxwwVar);
        }
        return iobyxmoadg(btonecajqbVarGxszxtbevo);
    }

    @Override // dj.ojitshcjhn
    public List czzsidtyhn(dj.agtfadlqog agtfadlqogVar) {
        return aj.zoijcleaow.iobyxmoadg.cqumvgiudr(this, agtfadlqogVar);
    }

    @Override // zi.hszhottldk
    public boolean draadjrbmk(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.pkzmftpjix(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public int dsvhmnatus(dj.gtknphoqwx gtknphoqwxVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gtknphoqwxVar, "<this>");
        if (gtknphoqwxVar instanceof dj.btonecajqb) {
            return tbqsvytpvh((dj.dxjokdxxww) gtknphoqwxVar);
        }
        if (gtknphoqwxVar instanceof dj.iobyxmoadg) {
            return ((dj.iobyxmoadg) gtknphoqwxVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gtknphoqwxVar + ", " + cllcsxoeiz.zoijcleaow(gtknphoqwxVar.getClass())).toString());
    }

    @Override // dj.ojitshcjhn
    public boolean dvvnrvtcbc(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.stevsuqkhv(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public dj.eablkybsjg dxjokdxxww(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.eablkybsjg(this, btonecajqbVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public dj.btonecajqb eablkybsjg(dj.btonecajqb btonecajqbVar, boolean z13) {
        return aj.zoijcleaow.iobyxmoadg.opjhrmiecq(this, btonecajqbVar, z13);
    }

    @Override // dj.ojitshcjhn
    public boolean esjtqupxsv(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.jpowsppfya(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public boolean fiwbwshyhd(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.tzroggbefp(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public dj.draadjrbmk gtknphoqwx(dj.ppxfxbqfkf ppxfxbqfkfVar) {
        return aj.zoijcleaow.iobyxmoadg.uwvvkdfqfp(this, ppxfxbqfkfVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public dj.btonecajqb gxszxtbevo(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.nufgyqmvbu(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public dj.dxjokdxxww hcddaimhww(dj.dxjokdxxww dxjokdxxwwVar, boolean z13) {
        return aj.zoijcleaow.iobyxmoadg.bfopjjpdmp(this, dxjokdxxwwVar, z13);
    }

    @Override // dj.ojitshcjhn
    public Collection hkdspvbjdz(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.czzsidtyhn(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public boolean hszhottldk(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.ribwqtqdhb(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public dj.btonecajqb igdgnonuha(dj.dxjokdxxww dxjokdxxwwVar) {
        dj.btonecajqb btonecajqbVarPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.lqeggnwhkg lqeggnwhkgVarYadqdtsiqt = yadqdtsiqt(dxjokdxxwwVar);
        if (lqeggnwhkgVarYadqdtsiqt != null && (btonecajqbVarPpxfxbqfkf = ppxfxbqfkf(lqeggnwhkgVarYadqdtsiqt)) != null) {
            return btonecajqbVarPpxfxbqfkf;
        }
        dj.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(dxjokdxxwwVar);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVarGxszxtbevo);
        return btonecajqbVarGxszxtbevo;
    }

    @Override // dj.ojitshcjhn
    public dj.ppxfxbqfkf ikoacuggdj(dj.wkgbmnqykc wkgbmnqykcVar) {
        return aj.zoijcleaow.iobyxmoadg.sflfametgt(this, wkgbmnqykcVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public dj.wflxmlrfwp iobyxmoadg(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.zfvoamnweg(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public dj.gxszxtbevo iozdgvuglv(dj.lqeggnwhkg lqeggnwhkgVar) {
        aj.zoijcleaow.iobyxmoadg.gxszxtbevo(this, lqeggnwhkgVar);
        return null;
    }

    public lrnfpwlwnk ipoelvxyzq(boolean z13, boolean z14) {
        if (this.f62626eablkybsjg != null) {
            return new iobyxmoadg(z13, z14, this, this.f62629wkgbmnqykc, this.f62628ppxfxbqfkf);
        }
        return aj.iobyxmoadg.iobyxmoadg(z13, z14, this, this.f62629wkgbmnqykc, this.f62628ppxfxbqfkf);
    }

    @Override // dj.ojitshcjhn
    public boolean istkbnxepw(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.wypolnanlu(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public dj.zoijcleaow iwizpuwonk(dj.wkgbmnqykc wkgbmnqykcVar) {
        return aj.zoijcleaow.iobyxmoadg.gtknphoqwx(this, wkgbmnqykcVar);
    }

    @Override // dj.ojitshcjhn
    public dj.draadjrbmk iwxlajgraz(dj.btonecajqb btonecajqbVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        if (i13 < 0 || i13 >= tbqsvytpvh(btonecajqbVar)) {
            return null;
        }
        return nuxfzjnpeb(btonecajqbVar, i13);
    }

    @Override // dj.ojitshcjhn
    public dj.btonecajqb iyctptxqzt(dj.btonecajqb btonecajqbVar) {
        dj.btonecajqb btonecajqbVarRlfsiqarku;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        dj.eablkybsjg eablkybsjgVarDxjokdxxww = dxjokdxxww(btonecajqbVar);
        return (eablkybsjgVarDxjokdxxww == null || (btonecajqbVarRlfsiqarku = rlfsiqarku(eablkybsjgVarDxjokdxxww)) == null) ? btonecajqbVar : btonecajqbVarRlfsiqarku;
    }

    @Override // dj.ojitshcjhn
    public boolean jhduphickx(dj.draadjrbmk draadjrbmkVar) {
        return aj.zoijcleaow.iobyxmoadg.crxdokpmqz(this, draadjrbmkVar);
    }

    @Override // dj.ojitshcjhn
    public lrnfpwlwnk.ppxfxbqfkf jlmebxxoox(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.yfnezrywwk(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public boolean jpowsppfya(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.lmojexxdyd(this, wflxmlrfwpVar);
    }

    @Override // zi.hszhottldk
    public gh.draadjrbmk jyumaefscl(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.oxmwwwfdhm(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public boolean jztzpxfvev(dj.agtfadlqog agtfadlqogVar, dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.zynmafqrjb(this, agtfadlqogVar, wflxmlrfwpVar);
    }

    @Override // aj.zoijcleaow
    public dj.dxjokdxxww kcexrzcfyt(dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        return aj.zoijcleaow.iobyxmoadg.draadjrbmk(this, btonecajqbVar, btonecajqbVar2);
    }

    @Override // dj.ojitshcjhn
    public dj.btonecajqb kegysxyocb(dj.btonecajqb btonecajqbVar, dj.zoijcleaow zoijcleaowVar) {
        return aj.zoijcleaow.iobyxmoadg.btonecajqb(this, btonecajqbVar, zoijcleaowVar);
    }

    @Override // dj.ojitshcjhn
    public int lereixgezr(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.rlfsiqarku(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public dj.agtfadlqog lmojexxdyd(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.jyumaefscl(this, wflxmlrfwpVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public dj.btonecajqb lqeggnwhkg(dj.lqeggnwhkg lqeggnwhkgVar) {
        return aj.zoijcleaow.iobyxmoadg.ikoacuggdj(this, lqeggnwhkgVar);
    }

    @Override // dj.ojitshcjhn
    public boolean lrnfpwlwnk(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.hcddaimhww(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public boolean lxfrhoxuzk(dj.btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return wypolnanlu(iobyxmoadg(btonecajqbVar));
    }

    @Override // dj.ojitshcjhn
    public dj.dxjokdxxww mbcevpiqjq(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        return xrmfcynszj(dxjokdxxwwVar, false);
    }

    @Override // dj.ojitshcjhn
    public boolean metgxyhuhe(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.lqeggnwhkg lqeggnwhkgVarYadqdtsiqt = yadqdtsiqt(dxjokdxxwwVar);
        if (lqeggnwhkgVarYadqdtsiqt == null) {
            return false;
        }
        iozdgvuglv(lqeggnwhkgVarYadqdtsiqt);
        return false;
    }

    @Override // dj.ojitshcjhn
    public boolean ntlheqmsrt(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        return (dxjokdxxwwVar instanceof dj.btonecajqb) && zfvoamnweg((dj.btonecajqb) dxjokdxxwwVar);
    }

    @Override // zi.hszhottldk
    public dj.dxjokdxxww nufgyqmvbu(dj.agtfadlqog agtfadlqogVar) {
        return aj.zoijcleaow.iobyxmoadg.zdlpuopuiu(this, agtfadlqogVar);
    }

    @Override // dj.ojitshcjhn
    public dj.draadjrbmk nuxfzjnpeb(dj.dxjokdxxww dxjokdxxwwVar, int i13) {
        return aj.zoijcleaow.iobyxmoadg.wflxmlrfwp(this, dxjokdxxwwVar, i13);
    }

    @Override // dj.ojitshcjhn
    public boolean oipsdeybqn(dj.btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return lrnfpwlwnk(iobyxmoadg(btonecajqbVar));
    }

    @Override // dj.ojitshcjhn
    public dj.dxjokdxxww ojitshcjhn(dj.draadjrbmk draadjrbmkVar) {
        return aj.zoijcleaow.iobyxmoadg.yggfygwlhe(this, draadjrbmkVar);
    }

    @Override // zi.hszhottldk
    public gh.draadjrbmk okpsazkaxt(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.kcexrzcfyt(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public dj.draadjrbmk opjhrmiecq(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.dxjokdxxww(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public boolean oxmwwwfdhm(dj.wkgbmnqykc wkgbmnqykcVar) {
        return aj.zoijcleaow.iobyxmoadg.kegysxyocb(this, wkgbmnqykcVar);
    }

    @Override // zi.hszhottldk
    public boolean pkzmftpjix(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.jhduphickx(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public boolean pmvmpeiblj(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.ntlheqmsrt(this, dxjokdxxwwVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public dj.btonecajqb ppxfxbqfkf(dj.lqeggnwhkg lqeggnwhkgVar) {
        return aj.zoijcleaow.iobyxmoadg.oipsdeybqn(this, lqeggnwhkgVar);
    }

    @Override // dj.ojitshcjhn
    public boolean rgvfuqvkyq(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        return istkbnxepw(crxdokpmqz(dxjokdxxwwVar)) && !dvvnrvtcbc(dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public List ribwqtqdhb(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.vdvldrhtss(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public dj.btonecajqb rlfsiqarku(dj.eablkybsjg eablkybsjgVar) {
        return aj.zoijcleaow.iobyxmoadg.metgxyhuhe(this, eablkybsjgVar);
    }

    @Override // zi.hszhottldk
    public boolean roivzttewh(dj.dxjokdxxww dxjokdxxwwVar, ii.ppxfxbqfkf ppxfxbqfkfVar) {
        return aj.zoijcleaow.iobyxmoadg.pmvmpeiblj(this, dxjokdxxwwVar, ppxfxbqfkfVar);
    }

    @Override // dj.ojitshcjhn
    public boolean sflfametgt(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(dxjokdxxwwVar);
        return (btonecajqbVarGxszxtbevo != null ? dxjokdxxww(btonecajqbVarGxszxtbevo) : null) != null;
    }

    @Override // dj.ojitshcjhn
    public dj.draadjrbmk skhdrjzrfn(dj.gtknphoqwx gtknphoqwxVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gtknphoqwxVar, "<this>");
        if (gtknphoqwxVar instanceof dj.btonecajqb) {
            return nuxfzjnpeb((dj.dxjokdxxww) gtknphoqwxVar, i13);
        }
        if (gtknphoqwxVar instanceof dj.iobyxmoadg) {
            E e13 = ((dj.iobyxmoadg) gtknphoqwxVar).get(i13);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(e13, "get(...)");
            return (dj.draadjrbmk) e13;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gtknphoqwxVar + ", " + cllcsxoeiz.zoijcleaow(gtknphoqwxVar.getClass())).toString());
    }

    @Override // dj.oxmwwwfdhm
    public boolean sopmlzcsov(dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        return aj.zoijcleaow.iobyxmoadg.istkbnxepw(this, btonecajqbVar, btonecajqbVar2);
    }

    @Override // zi.hszhottldk
    public dj.dxjokdxxww stevsuqkhv(dj.dxjokdxxww dxjokdxxwwVar) {
        dj.btonecajqb btonecajqbVarEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(dxjokdxxwwVar);
        return (btonecajqbVarGxszxtbevo == null || (btonecajqbVarEablkybsjg = eablkybsjg(btonecajqbVarGxszxtbevo, true)) == null) ? dxjokdxxwwVar : btonecajqbVarEablkybsjg;
    }

    @Override // dj.ojitshcjhn
    public int tbqsvytpvh(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.zoijcleaow(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public boolean tzroggbefp(dj.wkgbmnqykc wkgbmnqykcVar) {
        return aj.zoijcleaow.iobyxmoadg.mbcevpiqjq(this, wkgbmnqykcVar);
    }

    @Override // dj.ojitshcjhn
    public dj.agtfadlqog uawqvzlxes(dj.wflxmlrfwp wflxmlrfwpVar, int i13) {
        return aj.zoijcleaow.iobyxmoadg.rgvfuqvkyq(this, wflxmlrfwpVar, i13);
    }

    @Override // dj.ojitshcjhn
    public dj.kcexrzcfyt ulzqkzuiru(dj.agtfadlqog agtfadlqogVar) {
        return aj.zoijcleaow.iobyxmoadg.lereixgezr(this, agtfadlqogVar);
    }

    @Override // dj.ojitshcjhn
    public List uwvvkdfqfp(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.agtfadlqog(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public boolean vdvldrhtss(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.jlmebxxoox(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public dj.kcexrzcfyt vipkmwdibw(dj.draadjrbmk draadjrbmkVar) {
        return aj.zoijcleaow.iobyxmoadg.esjtqupxsv(this, draadjrbmkVar);
    }

    @Override // dj.ojitshcjhn
    public boolean weqkydbzbr(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.wwaezpbzkn(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public boolean wflxmlrfwp(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.dsvhmnatus(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public boolean wizcaqwiak(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.vipkmwdibw(this, dxjokdxxwwVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public dj.wkgbmnqykc wkgbmnqykc(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }

    @Override // dj.vdvldrhtss
    public boolean wwaezpbzkn() {
        return aj.zoijcleaow.iobyxmoadg.hkdspvbjdz(this);
    }

    @Override // dj.ojitshcjhn
    public boolean wypolnanlu(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.iozdgvuglv(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public dj.dxjokdxxww xrmfcynszj(dj.dxjokdxxww dxjokdxxwwVar, boolean z13) {
        return aj.zoijcleaow.iobyxmoadg.jztzpxfvev(this, dxjokdxxwwVar, z13);
    }

    @Override // dj.ojitshcjhn
    public dj.lqeggnwhkg yadqdtsiqt(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.lqeggnwhkg(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public boolean ydmasvzmpa(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        return zfvoamnweg(zdlpuopuiu(dxjokdxxwwVar)) != zfvoamnweg(igdgnonuha(dxjokdxxwwVar));
    }

    @Override // dj.ojitshcjhn
    public Collection yfnezrywwk(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.ydmasvzmpa(this, wflxmlrfwpVar);
    }

    @Override // dj.ojitshcjhn
    public dj.gtknphoqwx yggfygwlhe(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.ppxfxbqfkf(this, btonecajqbVar);
    }

    @Override // dj.ojitshcjhn
    public boolean ylkuphrtab(dj.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(zdlpuopuiu(dxjokdxxwwVar)), iobyxmoadg(igdgnonuha(dxjokdxxwwVar)));
    }

    @Override // dj.ojitshcjhn
    public dj.btonecajqb zdlpuopuiu(dj.dxjokdxxww dxjokdxxwwVar) {
        dj.btonecajqb btonecajqbVarLqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        dj.lqeggnwhkg lqeggnwhkgVarYadqdtsiqt = yadqdtsiqt(dxjokdxxwwVar);
        if (lqeggnwhkgVarYadqdtsiqt != null && (btonecajqbVarLqeggnwhkg = lqeggnwhkg(lqeggnwhkgVarYadqdtsiqt)) != null) {
            return btonecajqbVarLqeggnwhkg;
        }
        dj.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(dxjokdxxwwVar);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(btonecajqbVarGxszxtbevo);
        return btonecajqbVarGxszxtbevo;
    }

    @Override // dj.ojitshcjhn
    public boolean zeieaojujs(dj.dxjokdxxww dxjokdxxwwVar) {
        return aj.zoijcleaow.iobyxmoadg.ylkuphrtab(this, dxjokdxxwwVar);
    }

    @Override // dj.ojitshcjhn
    public boolean zfvoamnweg(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.cllcsxoeiz(this, btonecajqbVar);
    }

    @Override // aj.zoijcleaow, dj.ojitshcjhn
    public boolean zoijcleaow(dj.btonecajqb btonecajqbVar) {
        return aj.zoijcleaow.iobyxmoadg.ulzqkzuiru(this, btonecajqbVar);
    }

    @Override // zi.hszhottldk
    public ii.wkgbmnqykc zynmafqrjb(dj.wflxmlrfwp wflxmlrfwpVar) {
        return aj.zoijcleaow.iobyxmoadg.ojitshcjhn(this, wflxmlrfwpVar);
    }
}
