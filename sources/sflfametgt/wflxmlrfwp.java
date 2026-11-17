package sflfametgt;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp implements agtfadlqog {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f106344agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f106345btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int[] f106346draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f106347dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Object f106348eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f106349gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final a.eablkybsjg.zoijcleaow f106350gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f106351iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final a.eablkybsjg.ppxfxbqfkf f106352lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final w0.zdlpuopuiu f106353nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f106354ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f106355wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f106356wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f106357zoijcleaow;

    public /* synthetic */ wflxmlrfwp(int i13, int i14, List list, long j13, Object obj, jztzpxfvev.jlmebxxoox jlmebxxooxVar, a.eablkybsjg.zoijcleaow zoijcleaowVar, a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, w0.zdlpuopuiu zdlpuopuiuVar, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, i14, list, j13, obj, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, zdlpuopuiuVar, z13);
    }

    private final int eablkybsjg(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar) {
        return this.f106345btonecajqb ? kcexrzcfytVar.ipoelvxyzq() : kcexrzcfytVar.eslsurpljm();
    }

    private final long gxszxtbevo(int i13) {
        int[] iArr = this.f106346draadjrbmk;
        int i14 = i13 * 2;
        return w0.agtfadlqog.wkgbmnqykc((((long) iArr[i14]) << 32) | (((long) iArr[i14 + 1]) & 4294967295L));
    }

    public final void dxjokdxxww(int i13, int i14, int i15) {
        int iEslsurpljm;
        this.f106355wflxmlrfwp = i13;
        this.f106344agtfadlqog = this.f106345btonecajqb ? i15 : i14;
        List list = this.f106354ppxfxbqfkf;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = (androidx.compose.ui.layout.kcexrzcfyt) list.get(i16);
            int i17 = i16 * 2;
            if (this.f106345btonecajqb) {
                int[] iArr = this.f106346draadjrbmk;
                a.eablkybsjg.zoijcleaow zoijcleaowVar = this.f106350gxszxtbevo;
                if (zoijcleaowVar == null) {
                    rlfsiqarku.eablkybsjg.zoijcleaow("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i17] = zoijcleaowVar.iobyxmoadg(kcexrzcfytVar.eslsurpljm(), i14, this.f106353nufgyqmvbu);
                this.f106346draadjrbmk[i17 + 1] = i13;
                iEslsurpljm = kcexrzcfytVar.ipoelvxyzq();
            } else {
                int[] iArr2 = this.f106346draadjrbmk;
                iArr2[i17] = i13;
                int i18 = i17 + 1;
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = this.f106352lqeggnwhkg;
                if (ppxfxbqfkfVar == null) {
                    rlfsiqarku.eablkybsjg.zoijcleaow("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr2[i18] = ppxfxbqfkfVar.iobyxmoadg(kcexrzcfytVar.ipoelvxyzq(), i15);
                iEslsurpljm = kcexrzcfytVar.eslsurpljm();
            }
            i13 += iEslsurpljm;
        }
    }

    @Override // sflfametgt.agtfadlqog
    public int getIndex() {
        return this.f106351iobyxmoadg;
    }

    @Override // sflfametgt.agtfadlqog
    public int iobyxmoadg() {
        return this.f106355wflxmlrfwp;
    }

    public final int lqeggnwhkg() {
        return this.f106357zoijcleaow;
    }

    public final void nufgyqmvbu(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        if (!(this.f106344agtfadlqog != Integer.MIN_VALUE)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("position() should be called first");
        }
        int size = this.f106354ppxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = (androidx.compose.ui.layout.kcexrzcfyt) this.f106354ppxfxbqfkf.get(i13);
            long jGxszxtbevo = gxszxtbevo(i13);
            if (this.f106347dxjokdxxww) {
                jGxszxtbevo = w0.agtfadlqog.wkgbmnqykc((((long) (this.f106345btonecajqb ? w0.agtfadlqog.dxjokdxxww(jGxszxtbevo) : (this.f106344agtfadlqog - w0.agtfadlqog.dxjokdxxww(jGxszxtbevo)) - eablkybsjg(kcexrzcfytVar))) << 32) | (((long) (this.f106345btonecajqb ? (this.f106344agtfadlqog - w0.agtfadlqog.btonecajqb(jGxszxtbevo)) - eablkybsjg(kcexrzcfytVar) : w0.agtfadlqog.btonecajqb(jGxszxtbevo))) & 4294967295L));
            }
            long jWflxmlrfwp = w0.agtfadlqog.wflxmlrfwp(jGxszxtbevo, this.f106356wkgbmnqykc);
            if (this.f106345btonecajqb) {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.bfopjjpdmp(iobyxmoadgVar, kcexrzcfytVar, jWflxmlrfwp, 0.0f, null, 6, null);
            } else {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.czzsidtyhn(iobyxmoadgVar, kcexrzcfytVar, jWflxmlrfwp, 0.0f, null, 6, null);
            }
        }
    }

    public final int ppxfxbqfkf() {
        return this.f106349gtknphoqwx;
    }

    public Object wkgbmnqykc() {
        return this.f106348eablkybsjg;
    }

    public final void zoijcleaow(int i13) {
        this.f106355wflxmlrfwp = iobyxmoadg() + i13;
        int length = this.f106346draadjrbmk.length;
        for (int i14 = 0; i14 < length; i14++) {
            boolean z13 = this.f106345btonecajqb;
            if ((z13 && i14 % 2 == 1) || (!z13 && i14 % 2 == 0)) {
                int[] iArr = this.f106346draadjrbmk;
                iArr[i14] = iArr[i14] + i13;
            }
        }
    }

    private wflxmlrfwp(int i13, int i14, List list, long j13, Object obj, jztzpxfvev.jlmebxxoox jlmebxxooxVar, a.eablkybsjg.zoijcleaow zoijcleaowVar, a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, w0.zdlpuopuiu zdlpuopuiuVar, boolean z13) {
        this.f106351iobyxmoadg = i13;
        this.f106357zoijcleaow = i14;
        this.f106354ppxfxbqfkf = list;
        this.f106356wkgbmnqykc = j13;
        this.f106348eablkybsjg = obj;
        this.f106350gxszxtbevo = zoijcleaowVar;
        this.f106352lqeggnwhkg = ppxfxbqfkfVar;
        this.f106353nufgyqmvbu = zdlpuopuiuVar;
        this.f106347dxjokdxxww = z13;
        this.f106345btonecajqb = jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = (androidx.compose.ui.layout.kcexrzcfyt) list.get(i15);
            iMax = Math.max(iMax, !this.f106345btonecajqb ? kcexrzcfytVar.ipoelvxyzq() : kcexrzcfytVar.eslsurpljm());
        }
        this.f106349gtknphoqwx = iMax;
        this.f106346draadjrbmk = new int[this.f106354ppxfxbqfkf.size() * 2];
        this.f106344agtfadlqog = Integer.MIN_VALUE;
    }
}
