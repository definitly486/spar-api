package mh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class cqumvgiudr extends wflxmlrfwp implements jh.mbcevpiqjq {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f66956pmvmpeiblj = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(cqumvgiudr.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(cqumvgiudr.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final yi.dxjokdxxww f66957cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final yi.dxjokdxxww f66958esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ii.ppxfxbqfkf f66959iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iozdgvuglv f66960jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final si.gtknphoqwx f66961lereixgezr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqumvgiudr(iozdgvuglv module, ii.ppxfxbqfkf fqName, yi.agtfadlqog storageManager) {
        super(kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), fqName.nufgyqmvbu());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        this.f66960jyumaefscl = module;
        this.f66959iwizpuwonk = fqName;
        this.f66957cqumvgiudr = storageManager.wkgbmnqykc(new yggfygwlhe(this));
        this.f66958esjtqupxsv = storageManager.wkgbmnqykc(new jyumaefscl(this));
        this.f66961lereixgezr = new si.dxjokdxxww(storageManager, new iwizpuwonk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fyldjkxazc(cqumvgiudr cqumvgiudrVar) {
        return jh.kegysxyocb.zoijcleaow(cqumvgiudrVar.iwxlajgraz().ipoelvxyzq(), cqumvgiudrVar.gxszxtbevo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ipoelvxyzq(cqumvgiudr cqumvgiudrVar) {
        return jh.kegysxyocb.ppxfxbqfkf(cqumvgiudrVar.iwxlajgraz().ipoelvxyzq(), cqumvgiudrVar.gxszxtbevo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final si.gtknphoqwx jrbgnlbqoe(cqumvgiudr cqumvgiudrVar) {
        if (cqumvgiudrVar.isEmpty()) {
            return si.gtknphoqwx.zoijcleaow.f106714zoijcleaow;
        }
        List listRlfsiqarku = cqumvgiudrVar.rlfsiqarku();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRlfsiqarku, 10));
        Iterator it = listRlfsiqarku.iterator();
        while (it.hasNext()) {
            arrayList.add(((jh.hkdspvbjdz) it.next()).agtfadlqog());
        }
        List listJrbgnlbqoe = hg.jyumaefscl.jrbgnlbqoe(arrayList, new wypolnanlu(cqumvgiudrVar.iwxlajgraz(), cqumvgiudrVar.gxszxtbevo()));
        return si.zoijcleaow.f106770wkgbmnqykc.iobyxmoadg("package view scope for " + cqumvgiudrVar.gxszxtbevo() + " in " + cqumvgiudrVar.iwxlajgraz().getName(), listJrbgnlbqoe);
    }

    @Override // jh.mbcevpiqjq
    public si.gtknphoqwx agtfadlqog() {
        return this.f66961lereixgezr;
    }

    public boolean equals(Object obj) {
        jh.mbcevpiqjq mbcevpiqjqVar = obj instanceof jh.mbcevpiqjq ? (jh.mbcevpiqjq) obj : null;
        return mbcevpiqjqVar != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevo(), mbcevpiqjqVar.gxszxtbevo()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iwxlajgraz(), mbcevpiqjqVar.iwxlajgraz());
    }

    @Override // jh.wflxmlrfwp
    /* JADX INFO: renamed from: grlcpdaxtj, reason: merged with bridge method [inline-methods] */
    public jh.mbcevpiqjq zoijcleaow() {
        if (gxszxtbevo().wkgbmnqykc()) {
            return null;
        }
        iozdgvuglv iozdgvuglvVarIwxlajgraz = iwxlajgraz();
        ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = gxszxtbevo().eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
        return iozdgvuglvVarIwxlajgraz.wwaezpbzkn(ppxfxbqfkfVarEablkybsjg);
    }

    @Override // jh.mbcevpiqjq
    public ii.ppxfxbqfkf gxszxtbevo() {
        return this.f66959iwizpuwonk;
    }

    public int hashCode() {
        return (iwxlajgraz().hashCode() * 31) + gxszxtbevo().hashCode();
    }

    @Override // jh.mbcevpiqjq
    public boolean isEmpty() {
        return mhtqkkgtqm();
    }

    @Override // jh.mbcevpiqjq
    /* JADX INFO: renamed from: ixidwrxhsl, reason: merged with bridge method [inline-methods] */
    public iozdgvuglv iwxlajgraz() {
        return this.f66960jyumaefscl;
    }

    protected final boolean mhtqkkgtqm() {
        return ((Boolean) yi.wflxmlrfwp.iobyxmoadg(this.f66958esjtqupxsv, this, f66956pmvmpeiblj[1])).booleanValue();
    }

    @Override // jh.mbcevpiqjq
    public List rlfsiqarku() {
        return (List) yi.wflxmlrfwp.iobyxmoadg(this.f66957cqumvgiudr, this, f66956pmvmpeiblj[0]);
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn visitor, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visitor, "visitor");
        return visitor.gtknphoqwx(this, obj);
    }
}
