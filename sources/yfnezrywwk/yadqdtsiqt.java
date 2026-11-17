package yfnezrywwk;

import java.util.List;
import java.util.Map;
import jztzpxfvev.jlmebxxoox;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt implements cqumvgiudr, x.istkbnxepw {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final int f124915agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final long f124916btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f124917draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final w0.wkgbmnqykc f124918dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final x.istkbnxepw f124919eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final List f124920gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f124921gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iozdgvuglv f124922iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f124923lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final pj.cllcsxoeiz f124924nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f124925ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final int f124926oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f124927ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final jlmebxxoox f124928rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final int f124929vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final int f124930wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f124931wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f124932zoijcleaow;

    public /* synthetic */ yadqdtsiqt(iozdgvuglv iozdgvuglvVar, int i13, boolean z13, float f13, x.istkbnxepw istkbnxepwVar, float f14, boolean z14, pj.cllcsxoeiz cllcsxoeizVar, w0.wkgbmnqykc wkgbmnqykcVar, long j13, List list, int i14, int i15, int i16, boolean z15, jlmebxxoox jlmebxxooxVar, int i17, int i18, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iozdgvuglvVar, i13, z13, f13, istkbnxepwVar, f14, z14, cllcsxoeizVar, wkgbmnqykcVar, j13, list, i14, i15, i16, z15, jlmebxxooxVar, i17, i18);
    }

    @Override // x.istkbnxepw
    public Map agtfadlqog() {
        return this.f124919eablkybsjg.agtfadlqog();
    }

    public final boolean btonecajqb() {
        iozdgvuglv iozdgvuglvVar = this.f124922iobyxmoadg;
        return ((iozdgvuglvVar != null ? iozdgvuglvVar.getIndex() : 0) == 0 && this.f124932zoijcleaow == 0) ? false : true;
    }

    public final long draadjrbmk() {
        return this.f124916btonecajqb;
    }

    public final yadqdtsiqt dxjokdxxww(int i13, boolean z13) {
        iozdgvuglv iozdgvuglvVar;
        yadqdtsiqt yadqdtsiqtVar = null;
        if (!this.f124923lqeggnwhkg && !nufgyqmvbu().isEmpty() && (iozdgvuglvVar = this.f124922iobyxmoadg) != null) {
            int iGtknphoqwx = iozdgvuglvVar.gtknphoqwx();
            int i14 = this.f124932zoijcleaow - i13;
            if (i14 >= 0 && i14 < iGtknphoqwx) {
                iozdgvuglv iozdgvuglvVar2 = (iozdgvuglv) hg.jyumaefscl.opjhrmiecq(nufgyqmvbu());
                iozdgvuglv iozdgvuglvVar3 = (iozdgvuglv) hg.jyumaefscl.skhdrjzrfn(nufgyqmvbu());
                if (!iozdgvuglvVar2.eablkybsjg() && !iozdgvuglvVar3.eablkybsjg() && (i13 >= 0 ? Math.min(eablkybsjg() - iozdgvuglvVar2.iobyxmoadg(), ppxfxbqfkf() - iozdgvuglvVar3.iobyxmoadg()) > i13 : Math.min((iozdgvuglvVar2.iobyxmoadg() + iozdgvuglvVar2.gtknphoqwx()) - eablkybsjg(), (iozdgvuglvVar3.iobyxmoadg() + iozdgvuglvVar3.gtknphoqwx()) - ppxfxbqfkf()) > (-i13))) {
                    List listNufgyqmvbu = nufgyqmvbu();
                    int size = listNufgyqmvbu.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        ((iozdgvuglv) listNufgyqmvbu.get(i15)).lqeggnwhkg(i13, z13);
                    }
                    yadqdtsiqtVar = new yadqdtsiqt(this.f124922iobyxmoadg, this.f124932zoijcleaow - i13, this.f124927ppxfxbqfkf || i13 > 0, i13, this.f124919eablkybsjg, this.f124921gxszxtbevo, this.f124923lqeggnwhkg, this.f124924nufgyqmvbu, this.f124918dxjokdxxww, this.f124916btonecajqb, nufgyqmvbu(), eablkybsjg(), ppxfxbqfkf(), gxszxtbevo(), yggfygwlhe(), getOrientation(), zoijcleaow(), lqeggnwhkg(), null);
                }
            }
        }
        return yadqdtsiqtVar;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public int eablkybsjg() {
        return this.f124917draadjrbmk;
    }

    @Override // x.istkbnxepw
    public int getHeight() {
        return this.f124919eablkybsjg.getHeight();
    }

    @Override // yfnezrywwk.cqumvgiudr
    public jlmebxxoox getOrientation() {
        return this.f124928rgvfuqvkyq;
    }

    @Override // x.istkbnxepw
    public int getWidth() {
        return this.f124919eablkybsjg.getWidth();
    }

    public final boolean gtknphoqwx() {
        return this.f124927ppxfxbqfkf;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public int gxszxtbevo() {
        return this.f124915agtfadlqog;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public long iobyxmoadg() {
        return w0.oxmwwwfdhm.ppxfxbqfkf((((long) getHeight()) & 4294967295L) | (((long) getWidth()) << 32));
    }

    public final float jyumaefscl() {
        return this.f124921gxszxtbevo;
    }

    public final iozdgvuglv kcexrzcfyt() {
        return this.f124922iobyxmoadg;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public int lqeggnwhkg() {
        return this.f124926oxmwwwfdhm;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public List nufgyqmvbu() {
        return this.f124920gtknphoqwx;
    }

    @Override // x.istkbnxepw
    public void ojitshcjhn() {
        this.f124919eablkybsjg.ojitshcjhn();
    }

    public final w0.wkgbmnqykc oxmwwwfdhm() {
        return this.f124918dxjokdxxww;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public int ppxfxbqfkf() {
        return this.f124930wflxmlrfwp;
    }

    @Override // x.istkbnxepw
    public tg.draadjrbmk rgvfuqvkyq() {
        return this.f124919eablkybsjg.rgvfuqvkyq();
    }

    public final pj.cllcsxoeiz vdvldrhtss() {
        return this.f124924nufgyqmvbu;
    }

    public final float wflxmlrfwp() {
        return this.f124931wkgbmnqykc;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public int wkgbmnqykc() {
        return -eablkybsjg();
    }

    public boolean yggfygwlhe() {
        return this.f124925ojitshcjhn;
    }

    public final int zdlpuopuiu() {
        return this.f124932zoijcleaow;
    }

    @Override // yfnezrywwk.cqumvgiudr
    public int zoijcleaow() {
        return this.f124929vdvldrhtss;
    }

    private yadqdtsiqt(iozdgvuglv iozdgvuglvVar, int i13, boolean z13, float f13, x.istkbnxepw istkbnxepwVar, float f14, boolean z14, pj.cllcsxoeiz cllcsxoeizVar, w0.wkgbmnqykc wkgbmnqykcVar, long j13, List list, int i14, int i15, int i16, boolean z15, jlmebxxoox jlmebxxooxVar, int i17, int i18) {
        this.f124922iobyxmoadg = iozdgvuglvVar;
        this.f124932zoijcleaow = i13;
        this.f124927ppxfxbqfkf = z13;
        this.f124931wkgbmnqykc = f13;
        this.f124919eablkybsjg = istkbnxepwVar;
        this.f124921gxszxtbevo = f14;
        this.f124923lqeggnwhkg = z14;
        this.f124924nufgyqmvbu = cllcsxoeizVar;
        this.f124918dxjokdxxww = wkgbmnqykcVar;
        this.f124916btonecajqb = j13;
        this.f124920gtknphoqwx = list;
        this.f124917draadjrbmk = i14;
        this.f124930wflxmlrfwp = i15;
        this.f124915agtfadlqog = i16;
        this.f124925ojitshcjhn = z15;
        this.f124928rgvfuqvkyq = jlmebxxooxVar;
        this.f124929vdvldrhtss = i17;
        this.f124926oxmwwwfdhm = i18;
    }
}
