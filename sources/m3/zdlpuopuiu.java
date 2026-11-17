package m3;

import android.net.Uri;
import v2.cdpycssgdh;

/* JADX INFO: loaded from: classes.dex */
public final class zdlpuopuiu extends cdpycssgdh {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f65062agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final long f65063btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f65064draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final long f65065dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f65066eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final long f65067gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f65068gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f65069lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f65070nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Object f65071ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final v2.kcexrzcfyt f65072rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final v2.kcexrzcfyt.lqeggnwhkg f65073vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f65074wflxmlrfwp;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final Object f65061oxmwwwfdhm = new Object();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final v2.kcexrzcfyt f65060kcexrzcfyt = new v2.kcexrzcfyt.ppxfxbqfkf().wkgbmnqykc("SinglePeriodTimeline").lqeggnwhkg(Uri.EMPTY).iobyxmoadg();

    public zdlpuopuiu(long j13, boolean z13, boolean z14, boolean z15, Object obj, v2.kcexrzcfyt kcexrzcfytVar) {
        this(j13, j13, 0L, 0L, z13, z14, z15, obj, kcexrzcfytVar);
    }

    @Override // v2.cdpycssgdh
    public int dxjokdxxww() {
        return 1;
    }

    @Override // v2.cdpycssgdh
    public cdpycssgdh.zoijcleaow lqeggnwhkg(int i13, cdpycssgdh.zoijcleaow zoijcleaowVar, boolean z13) {
        y2.iobyxmoadg.ppxfxbqfkf(i13, 0, 1);
        return zoijcleaowVar.kcexrzcfyt(null, z13 ? f65061oxmwwwfdhm : null, 0, this.f65070nufgyqmvbu, -this.f65063btonecajqb);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v2.cdpycssgdh
    public cdpycssgdh.ppxfxbqfkf ojitshcjhn(int i13, cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, long j13) {
        long j14;
        y2.iobyxmoadg.ppxfxbqfkf(i13, 0, 1);
        long j15 = this.f65067gtknphoqwx;
        boolean z13 = this.f65074wflxmlrfwp;
        if (!z13 || this.f65062agtfadlqog || j13 == 0) {
            j14 = j15;
        } else {
            long j16 = this.f65065dxjokdxxww;
            if (j16 != -9223372036854775807L) {
                j15 += j13;
                if (j15 <= j16) {
                    j14 = j15;
                }
            }
            j14 = -9223372036854775807L;
        }
        return ppxfxbqfkfVar.lqeggnwhkg(cdpycssgdh.ppxfxbqfkf.f115274vdvldrhtss, this.f65072rgvfuqvkyq, this.f65071ojitshcjhn, this.f65066eablkybsjg, this.f65068gxszxtbevo, this.f65069lqeggnwhkg, this.f65064draadjrbmk, z13, this.f65073vdvldrhtss, j14, this.f65065dxjokdxxww, 0, 0, this.f65063btonecajqb);
    }

    @Override // v2.cdpycssgdh
    public int rgvfuqvkyq() {
        return 1;
    }

    @Override // v2.cdpycssgdh
    public Object wflxmlrfwp(int i13) {
        y2.iobyxmoadg.ppxfxbqfkf(i13, 0, 1);
        return f65061oxmwwwfdhm;
    }

    @Override // v2.cdpycssgdh
    public int zoijcleaow(Object obj) {
        return f65061oxmwwwfdhm.equals(obj) ? 0 : -1;
    }

    public zdlpuopuiu(long j13, long j14, long j15, long j16, boolean z13, boolean z14, boolean z15, Object obj, v2.kcexrzcfyt kcexrzcfytVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j13, j14, j15, j16, z13, z14, false, obj, kcexrzcfytVar, z15 ? kcexrzcfytVar.f115397wkgbmnqykc : null);
    }

    public zdlpuopuiu(long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z13, boolean z14, boolean z15, Object obj, v2.kcexrzcfyt kcexrzcfytVar, v2.kcexrzcfyt.lqeggnwhkg lqeggnwhkgVar) {
        this.f65066eablkybsjg = j13;
        this.f65068gxszxtbevo = j14;
        this.f65069lqeggnwhkg = j15;
        this.f65070nufgyqmvbu = j16;
        this.f65065dxjokdxxww = j17;
        this.f65063btonecajqb = j18;
        this.f65067gtknphoqwx = j19;
        this.f65064draadjrbmk = z13;
        this.f65074wflxmlrfwp = z14;
        this.f65062agtfadlqog = z15;
        this.f65071ojitshcjhn = obj;
        this.f65072rgvfuqvkyq = (v2.kcexrzcfyt) y2.iobyxmoadg.eablkybsjg(kcexrzcfytVar);
        this.f65073vdvldrhtss = lqeggnwhkgVar;
    }
}
