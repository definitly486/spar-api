package opjhrmiecq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f73639lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final rhgxfdycjh.jyumaefscl f73640nufgyqmvbu = rhgxfdycjh.zoijcleaow.zoijcleaow(new tg.rgvfuqvkyq() { // from class: opjhrmiecq.h0
        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return j0.ppxfxbqfkf((rhgxfdycjh.lereixgezr) obj, (j0) obj2);
        }
    }, new tg.draadjrbmk() { // from class: opjhrmiecq.i0
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return j0.wkgbmnqykc((List) obj);
        }
    });

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f73641eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f73642gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f73643iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.runtime.uawqvzlxes f73644ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private g.lqeggnwhkg f73645wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f73646zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final rhgxfdycjh.jyumaefscl iobyxmoadg() {
            return j0.f73640nufgyqmvbu;
        }

        private iobyxmoadg() {
        }
    }

    public j0(jztzpxfvev.jlmebxxoox jlmebxxooxVar, float f13) {
        this.f73643iobyxmoadg = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(f13);
        this.f73646zoijcleaow = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(0.0f);
        this.f73644ppxfxbqfkf = androidx.compose.runtime.j0.iobyxmoadg(0);
        this.f73645wkgbmnqykc = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
        this.f73641eablkybsjg = j0.l.f50289zoijcleaow.iobyxmoadg();
        this.f73642gxszxtbevo = androidx.compose.runtime.v0.lqeggnwhkg(jlmebxxooxVar, androidx.compose.runtime.v0.rgvfuqvkyq());
    }

    private final void agtfadlqog(int i13) {
        this.f73644ppxfxbqfkf.btonecajqb(i13);
    }

    private final void gtknphoqwx(float f13) {
        this.f73646zoijcleaow.pkzmftpjix(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ppxfxbqfkf(rhgxfdycjh.lereixgezr lereixgezrVar, j0 j0Var) {
        return hg.jyumaefscl.rgvfuqvkyq(Float.valueOf(j0Var.nufgyqmvbu()), Boolean.valueOf(j0Var.btonecajqb() == jztzpxfvev.jlmebxxoox.Vertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 wkgbmnqykc(List list) {
        Object obj = list.get(1);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Boolean");
        jztzpxfvev.jlmebxxoox jlmebxxooxVar = ((Boolean) obj).booleanValue() ? jztzpxfvev.jlmebxxoox.Vertical : jztzpxfvev.jlmebxxoox.Horizontal;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new j0(jlmebxxooxVar, ((Float) obj2).floatValue());
    }

    public final jztzpxfvev.jlmebxxoox btonecajqb() {
        return (jztzpxfvev.jlmebxxoox) this.f73642gxszxtbevo.getValue();
    }

    public final void draadjrbmk(float f13) {
        this.f73643iobyxmoadg.pkzmftpjix(f13);
    }

    public final int dxjokdxxww(long j13) {
        if (j0.l.agtfadlqog(j13) != j0.l.agtfadlqog(this.f73641eablkybsjg)) {
            return j0.l.agtfadlqog(j13);
        }
        return j0.l.dxjokdxxww(j13) != j0.l.dxjokdxxww(this.f73641eablkybsjg) ? j0.l.dxjokdxxww(j13) : j0.l.draadjrbmk(j13);
    }

    public final void gxszxtbevo(float f13, float f14, int i13) {
        float f15;
        float fNufgyqmvbu = nufgyqmvbu();
        float f16 = i13;
        float f17 = fNufgyqmvbu + f16;
        if (f14 <= f17 && (f13 >= fNufgyqmvbu || f14 - f13 <= f16)) {
            f15 = (f13 >= fNufgyqmvbu || f14 - f13 > f16) ? 0.0f : f13 - fNufgyqmvbu;
        } else {
            f15 = f14 - f17;
        }
        draadjrbmk(nufgyqmvbu() + f15);
    }

    public final float lqeggnwhkg() {
        return this.f73646zoijcleaow.zoijcleaow();
    }

    public final float nufgyqmvbu() {
        return this.f73643iobyxmoadg.zoijcleaow();
    }

    public final void ojitshcjhn(jztzpxfvev.jlmebxxoox jlmebxxooxVar, g.lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        float f13 = i14 - i13;
        gtknphoqwx(f13);
        if (lqeggnwhkgVar.nufgyqmvbu() != this.f73645wkgbmnqykc.nufgyqmvbu() || lqeggnwhkgVar.gtknphoqwx() != this.f73645wkgbmnqykc.gtknphoqwx()) {
            boolean z13 = jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Vertical;
            gxszxtbevo(z13 ? lqeggnwhkgVar.gtknphoqwx() : lqeggnwhkgVar.nufgyqmvbu(), z13 ? lqeggnwhkgVar.eablkybsjg() : lqeggnwhkgVar.dxjokdxxww(), i13);
            this.f73645wkgbmnqykc = lqeggnwhkgVar;
        }
        draadjrbmk(zg.gtknphoqwx.wflxmlrfwp(nufgyqmvbu(), 0.0f, f13));
        agtfadlqog(i13);
    }

    public final void wflxmlrfwp(long j13) {
        this.f73641eablkybsjg = j13;
    }

    public /* synthetic */ j0(jztzpxfvev.jlmebxxoox jlmebxxooxVar, float f13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(jlmebxxooxVar, (i13 & 2) != 0 ? 0.0f : f13);
    }
}
