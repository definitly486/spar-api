package l;

import androidx.compose.ui.graphics.wkgbmnqykc;
import h.dvvnrvtcbc;
import h.roivzttewh;
import j.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import w0.agtfadlqog;
import w0.kcexrzcfyt;
import w0.oxmwwwfdhm;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f61185btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f61186draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final long f61187dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final long f61188gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dvvnrvtcbc f61189lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f61190nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private wkgbmnqykc f61191wflxmlrfwp;

    public /* synthetic */ iobyxmoadg(dvvnrvtcbc dvvnrvtcbcVar, long j13, long j14, gtknphoqwx gtknphoqwxVar) {
        this(dvvnrvtcbcVar, j13, j14);
    }

    private final long gtknphoqwx(long j13, long j14) {
        int i13;
        int i14;
        if (agtfadlqog.dxjokdxxww(j13) < 0 || agtfadlqog.btonecajqb(j13) < 0 || (i13 = (int) (j14 >> 32)) < 0 || (i14 = (int) (4294967295L & j14)) < 0 || i13 > this.f61189lqeggnwhkg.getWidth() || i14 > this.f61189lqeggnwhkg.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j14;
    }

    @Override // l.ppxfxbqfkf
    protected void btonecajqb(gxszxtbevo gxszxtbevoVar) {
        dvvnrvtcbc dvvnrvtcbcVar = this.f61189lqeggnwhkg;
        long j13 = this.f61190nufgyqmvbu;
        long j14 = this.f61187dxjokdxxww;
        int iRound = Math.round(Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() >> 32)));
        long j15 = ((long) iRound) << 32;
        gxszxtbevo.crxdokpmqz(gxszxtbevoVar, dvvnrvtcbcVar, j13, j14, 0L, oxmwwwfdhm.ppxfxbqfkf((((long) Math.round(Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() & 4294967295L)))) & 4294967295L) | j15), this.f61186draadjrbmk, null, this.f61191wflxmlrfwp, 0, this.f61185btonecajqb, 328, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61189lqeggnwhkg, iobyxmoadgVar.f61189lqeggnwhkg) && agtfadlqog.nufgyqmvbu(this.f61190nufgyqmvbu, iobyxmoadgVar.f61190nufgyqmvbu) && oxmwwwfdhm.eablkybsjg(this.f61187dxjokdxxww, iobyxmoadgVar.f61187dxjokdxxww) && roivzttewh.wkgbmnqykc(this.f61185btonecajqb, iobyxmoadgVar.f61185btonecajqb);
    }

    public int hashCode() {
        return (((((this.f61189lqeggnwhkg.hashCode() * 31) + agtfadlqog.gtknphoqwx(this.f61190nufgyqmvbu)) * 31) + oxmwwwfdhm.nufgyqmvbu(this.f61187dxjokdxxww)) * 31) + roivzttewh.eablkybsjg(this.f61185btonecajqb);
    }

    @Override // l.ppxfxbqfkf
    protected boolean iobyxmoadg(float f13) {
        this.f61186draadjrbmk = f13;
        return true;
    }

    @Override // l.ppxfxbqfkf
    public long nufgyqmvbu() {
        return kcexrzcfyt.wkgbmnqykc(this.f61188gtknphoqwx);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f61189lqeggnwhkg + ", srcOffset=" + ((Object) agtfadlqog.agtfadlqog(this.f61190nufgyqmvbu)) + ", srcSize=" + ((Object) oxmwwwfdhm.dxjokdxxww(this.f61187dxjokdxxww)) + ", filterQuality=" + ((Object) roivzttewh.gxszxtbevo(this.f61185btonecajqb)) + ')';
    }

    @Override // l.ppxfxbqfkf
    protected boolean zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        this.f61191wflxmlrfwp = wkgbmnqykcVar;
        return true;
    }

    public /* synthetic */ iobyxmoadg(dvvnrvtcbc dvvnrvtcbcVar, long j13, long j14, int i13, gtknphoqwx gtknphoqwxVar) {
        this(dvvnrvtcbcVar, (i13 & 2) != 0 ? agtfadlqog.f118237zoijcleaow.zoijcleaow() : j13, (i13 & 4) != 0 ? oxmwwwfdhm.ppxfxbqfkf((((long) dvvnrvtcbcVar.getHeight()) & 4294967295L) | (((long) dvvnrvtcbcVar.getWidth()) << 32)) : j14, null);
    }

    private iobyxmoadg(dvvnrvtcbc dvvnrvtcbcVar, long j13, long j14) {
        this.f61189lqeggnwhkg = dvvnrvtcbcVar;
        this.f61190nufgyqmvbu = j13;
        this.f61187dxjokdxxww = j14;
        this.f61185btonecajqb = roivzttewh.f38955iobyxmoadg.iobyxmoadg();
        this.f61188gtknphoqwx = gtknphoqwx(j13, j14);
        this.f61186draadjrbmk = 1.0f;
    }
}
