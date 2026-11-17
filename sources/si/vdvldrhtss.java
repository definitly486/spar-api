package si;

import java.util.Collection;
import java.util.List;
import jh.crxdokpmqz;
import jh.jztzpxfvev;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.yadqdtsiqt;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss extends draadjrbmk {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f106731gxszxtbevo = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(vdvldrhtss.class), "functions", "getFunctions()Ljava/util/List;")), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(vdvldrhtss.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.dxjokdxxww f106732eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f106733ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yi.dxjokdxxww f106734wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jh.eablkybsjg f106735zoijcleaow;

    public vdvldrhtss(yi.agtfadlqog storageManager, jh.eablkybsjg containingClass, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containingClass, "containingClass");
        this.f106735zoijcleaow = containingClass;
        this.f106733ppxfxbqfkf = z13;
        containingClass.getKind();
        jh.gxszxtbevo gxszxtbevoVar = jh.gxszxtbevo.CLASS;
        this.f106734wkgbmnqykc = storageManager.wkgbmnqykc(new ojitshcjhn(this));
        this.f106732eablkybsjg = storageManager.wkgbmnqykc(new rgvfuqvkyq(this));
    }

    private final List agtfadlqog() {
        return (List) yi.wflxmlrfwp.iobyxmoadg(this.f106734wkgbmnqykc, this, f106731gxszxtbevo[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List btonecajqb(vdvldrhtss vdvldrhtssVar) {
        return hg.jyumaefscl.rgvfuqvkyq(li.nufgyqmvbu.lqeggnwhkg(vdvldrhtssVar.f106735zoijcleaow), li.nufgyqmvbu.nufgyqmvbu(vdvldrhtssVar.f106735zoijcleaow));
    }

    private final List ojitshcjhn() {
        return (List) yi.wflxmlrfwp.iobyxmoadg(this.f106732eablkybsjg, this, f106731gxszxtbevo[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rgvfuqvkyq(vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar.f106733ppxfxbqfkf ? hg.jyumaefscl.vdvldrhtss(li.nufgyqmvbu.gxszxtbevo(vdvldrhtssVar.f106735zoijcleaow)) : hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public List gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return hg.jyumaefscl.ixidwrxhsl(agtfadlqog(), ojitshcjhn());
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    public /* bridge */ /* synthetic */ jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo gxszxtbevoVar, rh.zoijcleaow zoijcleaowVar) {
        return (jh.nufgyqmvbu) gtknphoqwx(gxszxtbevoVar, zoijcleaowVar);
    }

    public Void gtknphoqwx(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return null;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public jj.gtknphoqwx wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        List listAgtfadlqog = agtfadlqog();
        jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
        for (Object obj : listAgtfadlqog) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((jztzpxfvev) obj).getName(), name)) {
                gtknphoqwxVar.add(obj);
            }
        }
        return gtknphoqwxVar;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        List listOjitshcjhn = ojitshcjhn();
        jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
        for (Object obj : listOjitshcjhn) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((crxdokpmqz) obj).getName(), name)) {
                gtknphoqwxVar.add(obj);
            }
        }
        return gtknphoqwxVar;
    }
}
