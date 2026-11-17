package t;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pmvmpeiblj {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f109132agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final long f109133btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f109134draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f109135dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f109136eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private List f109137gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f109138gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f109139iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f109140lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f109141nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private pmvmpeiblj f109142ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f109143ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f109144wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f109145wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f109146zoijcleaow;

    public /* synthetic */ pmvmpeiblj(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, boolean z15, int i13, long j18, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14, j15, z13, f13, j16, j17, z14, z15, i13, j18);
    }

    public final int agtfadlqog() {
        return this.f109135dxjokdxxww;
    }

    public final float btonecajqb() {
        return this.f109136eablkybsjg;
    }

    public final boolean draadjrbmk() {
        return this.f109141nufgyqmvbu;
    }

    public final boolean dxjokdxxww() {
        return this.f109145wkgbmnqykc;
    }

    public final List eablkybsjg() {
        List list = this.f109137gtknphoqwx;
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }

    public final long gtknphoqwx() {
        return this.f109140lqeggnwhkg;
    }

    public final long gxszxtbevo() {
        return this.f109139iobyxmoadg;
    }

    public final void iobyxmoadg() {
        pmvmpeiblj pmvmpeibljVar = this.f109142ojitshcjhn;
        if (pmvmpeibljVar == null) {
            this.f109144wflxmlrfwp = true;
            this.f109132agtfadlqog = true;
        } else if (pmvmpeibljVar != null) {
            pmvmpeibljVar.iobyxmoadg();
        }
    }

    public final long lqeggnwhkg() {
        return this.f109134draadjrbmk;
    }

    public final long nufgyqmvbu() {
        return this.f109143ppxfxbqfkf;
    }

    public final long ojitshcjhn() {
        return this.f109146zoijcleaow;
    }

    public final boolean rgvfuqvkyq() {
        pmvmpeiblj pmvmpeibljVar = this.f109142ojitshcjhn;
        if (pmvmpeibljVar != null) {
            return pmvmpeibljVar.rgvfuqvkyq();
        }
        return this.f109144wflxmlrfwp || this.f109132agtfadlqog;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) lereixgezr.wkgbmnqykc(this.f109139iobyxmoadg)) + ", uptimeMillis=" + this.f109146zoijcleaow + ", position=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f109143ppxfxbqfkf)) + ", pressed=" + this.f109145wkgbmnqykc + ", pressure=" + this.f109136eablkybsjg + ", previousUptimeMillis=" + this.f109138gxszxtbevo + ", previousPosition=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f109140lqeggnwhkg)) + ", previousPressed=" + this.f109141nufgyqmvbu + ", isConsumed=" + rgvfuqvkyq() + ", type=" + ((Object) cllcsxoeiz.dxjokdxxww(this.f109135dxjokdxxww)) + ", historical=" + eablkybsjg() + ",scrollDelta=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f109133btonecajqb)) + ')';
    }

    public final long wflxmlrfwp() {
        return this.f109133btonecajqb;
    }

    public final pmvmpeiblj wkgbmnqykc(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, int i13, List list, long j18) {
        pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj(j13, j14, j15, z13, f13, j16, j17, z14, false, i13, list, j18, this.f109134draadjrbmk, null);
        pmvmpeiblj pmvmpeibljVar2 = this.f109142ojitshcjhn;
        if (pmvmpeibljVar2 == null) {
            pmvmpeibljVar2 = this;
        }
        pmvmpeibljVar.f109142ojitshcjhn = pmvmpeibljVar2;
        return pmvmpeibljVar;
    }

    public final pmvmpeiblj zoijcleaow(long j13, long j14, long j15, boolean z13, long j16, long j17, boolean z14, int i13, List list, long j18) {
        pmvmpeiblj pmvmpeibljVarWkgbmnqykc = wkgbmnqykc(j13, j14, j15, z13, this.f109136eablkybsjg, j16, j17, z14, i13, list, j18);
        pmvmpeiblj pmvmpeibljVar = this.f109142ojitshcjhn;
        if (pmvmpeibljVar == null) {
            pmvmpeibljVar = this;
        }
        pmvmpeibljVarWkgbmnqykc.f109142ojitshcjhn = pmvmpeibljVar;
        return pmvmpeibljVarWkgbmnqykc;
    }

    public /* synthetic */ pmvmpeiblj(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, boolean z15, int i13, List list, long j18, long j19, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14, j15, z13, f13, j16, j17, z14, z15, i13, list, j18, j19);
    }

    private pmvmpeiblj(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, boolean z15, int i13, long j18) {
        this.f109139iobyxmoadg = j13;
        this.f109146zoijcleaow = j14;
        this.f109143ppxfxbqfkf = j15;
        this.f109145wkgbmnqykc = z13;
        this.f109136eablkybsjg = f13;
        this.f109138gxszxtbevo = j16;
        this.f109140lqeggnwhkg = j17;
        this.f109141nufgyqmvbu = z14;
        this.f109135dxjokdxxww = i13;
        this.f109133btonecajqb = j18;
        this.f109134draadjrbmk = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        this.f109144wflxmlrfwp = z15;
        this.f109132agtfadlqog = z15;
    }

    public /* synthetic */ pmvmpeiblj(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, boolean z15, int i13, long j18, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14, j15, z13, f13, j16, j17, z14, z15, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cllcsxoeiz.f109054iobyxmoadg.wkgbmnqykc() : i13, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j18, null);
    }

    private pmvmpeiblj(long j13, long j14, long j15, boolean z13, float f13, long j16, long j17, boolean z14, boolean z15, int i13, List list, long j18, long j19) {
        this(j13, j14, j15, z13, f13, j16, j17, z14, z15, i13, j18, null);
        this.f109137gtknphoqwx = list;
        this.f109134draadjrbmk = j19;
    }
}
