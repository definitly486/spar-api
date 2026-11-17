package lereixgezr;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends ntlheqmsrt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.opjhrmiecq f62447iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f62448ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Matrix f62449wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f62450zoijcleaow;

    wkgbmnqykc(istkbnxepw.opjhrmiecq opjhrmiecqVar, long j13, int i13, Matrix matrix) {
        if (opjhrmiecqVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f62447iobyxmoadg = opjhrmiecqVar;
        this.f62450zoijcleaow = j13;
        this.f62448ppxfxbqfkf = i13;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f62449wkgbmnqykc = matrix;
    }

    @Override // lereixgezr.ntlheqmsrt
    public Matrix eablkybsjg() {
        return this.f62449wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ntlheqmsrt)) {
            return false;
        }
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) obj;
        return this.f62447iobyxmoadg.equals(ntlheqmsrtVar.iobyxmoadg()) && this.f62450zoijcleaow == ntlheqmsrtVar.getTimestamp() && this.f62448ppxfxbqfkf == ntlheqmsrtVar.ppxfxbqfkf() && this.f62449wkgbmnqykc.equals(ntlheqmsrtVar.eablkybsjg());
    }

    @Override // lereixgezr.ntlheqmsrt, lereixgezr.dsvhmnatus
    public long getTimestamp() {
        return this.f62450zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = (this.f62447iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        long j13 = this.f62450zoijcleaow;
        return ((((iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ this.f62448ppxfxbqfkf) * 1000003) ^ this.f62449wkgbmnqykc.hashCode();
    }

    @Override // lereixgezr.ntlheqmsrt, lereixgezr.dsvhmnatus
    public istkbnxepw.opjhrmiecq iobyxmoadg() {
        return this.f62447iobyxmoadg;
    }

    @Override // lereixgezr.ntlheqmsrt, lereixgezr.dsvhmnatus
    public int ppxfxbqfkf() {
        return this.f62448ppxfxbqfkf;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f62447iobyxmoadg + ", timestamp=" + this.f62450zoijcleaow + ", rotationDegrees=" + this.f62448ppxfxbqfkf + ", sensorToBufferTransformMatrix=" + this.f62449wkgbmnqykc + "}";
    }
}
