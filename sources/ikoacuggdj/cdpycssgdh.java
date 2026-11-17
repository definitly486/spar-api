package ikoacuggdj;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
final class cdpycssgdh {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private EdgeEffect f44740btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private EdgeEffect f44741dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private EdgeEffect f44742eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private EdgeEffect f44743gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private EdgeEffect f44744gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f44745iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private EdgeEffect f44746lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private EdgeEffect f44747nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f44748ppxfxbqfkf = w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private EdgeEffect f44749wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f44750zoijcleaow;

    public cdpycssgdh(Context context, int i13) {
        this.f44745iobyxmoadg = context;
        this.f44750zoijcleaow = i13;
    }

    private final EdgeEffect eablkybsjg(jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        EdgeEffect edgeEffectZoijcleaow = zynmafqrjb.f44967iobyxmoadg.zoijcleaow(this.f44745iobyxmoadg);
        edgeEffectZoijcleaow.setColor(this.f44750zoijcleaow);
        if (!w0.oxmwwwfdhm.eablkybsjg(this.f44748ppxfxbqfkf, w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg())) {
            if (jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Vertical) {
                long j13 = this.f44748ppxfxbqfkf;
                edgeEffectZoijcleaow.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
            } else {
                long j14 = this.f44748ppxfxbqfkf;
                edgeEffectZoijcleaow.setSize((int) (j14 & 4294967295L), (int) (j14 >> 32));
            }
        }
        return edgeEffectZoijcleaow;
    }

    private final boolean esjtqupxsv(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(zynmafqrjb.f44967iobyxmoadg.ppxfxbqfkf(edgeEffect) == 0.0f);
    }

    private final boolean ojitshcjhn(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect agtfadlqog() {
        EdgeEffect edgeEffect = this.f44747nufgyqmvbu;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Vertical);
        this.f44747nufgyqmvbu = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final EdgeEffect btonecajqb() {
        EdgeEffect edgeEffect = this.f44740btonecajqb;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Horizontal);
        this.f44740btonecajqb = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final boolean cqumvgiudr() {
        return esjtqupxsv(this.f44746lqeggnwhkg);
    }

    public final EdgeEffect draadjrbmk() {
        EdgeEffect edgeEffect = this.f44743gtknphoqwx;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Horizontal);
        this.f44743gtknphoqwx = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final EdgeEffect dxjokdxxww() {
        EdgeEffect edgeEffect = this.f44744gxszxtbevo;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Horizontal);
        this.f44744gxszxtbevo = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final EdgeEffect gtknphoqwx() {
        EdgeEffect edgeEffect = this.f44746lqeggnwhkg;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Horizontal);
        this.f44746lqeggnwhkg = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final void gxszxtbevo() {
        EdgeEffect edgeEffect = this.f44749wkgbmnqykc;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.f44742eablkybsjg;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.f44744gxszxtbevo;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.f44746lqeggnwhkg;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.f44747nufgyqmvbu;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.f44741dxjokdxxww;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.f44740btonecajqb;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.f44743gtknphoqwx;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final void istkbnxepw(long j13) {
        this.f44748ppxfxbqfkf = j13;
        EdgeEffect edgeEffect = this.f44749wkgbmnqykc;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.f44742eablkybsjg;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.f44744gxszxtbevo;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j13 & 4294967295L), (int) (j13 >> 32));
        }
        EdgeEffect edgeEffect4 = this.f44746lqeggnwhkg;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j13 & 4294967295L), (int) (j13 >> 32));
        }
        EdgeEffect edgeEffect5 = this.f44747nufgyqmvbu;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.f44741dxjokdxxww;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j13 >> 32), (int) (j13 & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.f44740btonecajqb;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j13 & 4294967295L), (int) (j13 >> 32));
        }
        EdgeEffect edgeEffect8 = this.f44743gtknphoqwx;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & j13), (int) (j13 >> 32));
        }
    }

    public final boolean iwizpuwonk() {
        return esjtqupxsv(this.f44743gtknphoqwx);
    }

    public final boolean jyumaefscl() {
        return ojitshcjhn(this.f44746lqeggnwhkg);
    }

    public final boolean kcexrzcfyt() {
        return ojitshcjhn(this.f44744gxszxtbevo);
    }

    public final boolean lereixgezr() {
        return ojitshcjhn(this.f44749wkgbmnqykc);
    }

    public final EdgeEffect lqeggnwhkg() {
        EdgeEffect edgeEffect = this.f44742eablkybsjg;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Vertical);
        this.f44742eablkybsjg = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final EdgeEffect nufgyqmvbu() {
        EdgeEffect edgeEffect = this.f44741dxjokdxxww;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Vertical);
        this.f44741dxjokdxxww = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final boolean oxmwwwfdhm() {
        return esjtqupxsv(this.f44742eablkybsjg);
    }

    public final boolean pmvmpeiblj() {
        return esjtqupxsv(this.f44747nufgyqmvbu);
    }

    public final boolean rgvfuqvkyq() {
        return ojitshcjhn(this.f44742eablkybsjg);
    }

    public final boolean vdvldrhtss() {
        return esjtqupxsv(this.f44741dxjokdxxww);
    }

    public final EdgeEffect wflxmlrfwp() {
        EdgeEffect edgeEffect = this.f44749wkgbmnqykc;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectEablkybsjg = eablkybsjg(jztzpxfvev.jlmebxxoox.Vertical);
        this.f44749wkgbmnqykc = edgeEffectEablkybsjg;
        return edgeEffectEablkybsjg;
    }

    public final boolean yggfygwlhe() {
        return esjtqupxsv(this.f44744gxszxtbevo);
    }

    public final boolean zdlpuopuiu() {
        return esjtqupxsv(this.f44740btonecajqb);
    }

    public final boolean zynmafqrjb() {
        return esjtqupxsv(this.f44749wkgbmnqykc);
    }
}
