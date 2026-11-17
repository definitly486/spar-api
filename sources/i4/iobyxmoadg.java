package i4;

import com.google.common.primitives.nufgyqmvbu;
import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final long f41945eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f41946iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f41947ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f41948wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f41949zoijcleaow;

    public iobyxmoadg(long j13, long j14, long j15, long j16, long j17) {
        this.f41946iobyxmoadg = j13;
        this.f41949zoijcleaow = j14;
        this.f41947ppxfxbqfkf = j15;
        this.f41948wkgbmnqykc = j16;
        this.f41945eablkybsjg = j17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iobyxmoadg.class != obj.getClass()) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f41946iobyxmoadg == iobyxmoadgVar.f41946iobyxmoadg && this.f41949zoijcleaow == iobyxmoadgVar.f41949zoijcleaow && this.f41947ppxfxbqfkf == iobyxmoadgVar.f41947ppxfxbqfkf && this.f41948wkgbmnqykc == iobyxmoadgVar.f41948wkgbmnqykc && this.f41945eablkybsjg == iobyxmoadgVar.f41945eablkybsjg;
    }

    public int hashCode() {
        return ((((((((527 + nufgyqmvbu.iobyxmoadg(this.f41946iobyxmoadg)) * 31) + nufgyqmvbu.iobyxmoadg(this.f41949zoijcleaow)) * 31) + nufgyqmvbu.iobyxmoadg(this.f41947ppxfxbqfkf)) * 31) + nufgyqmvbu.iobyxmoadg(this.f41948wkgbmnqykc)) * 31) + nufgyqmvbu.iobyxmoadg(this.f41945eablkybsjg);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f41946iobyxmoadg + ", photoSize=" + this.f41949zoijcleaow + ", photoPresentationTimestampUs=" + this.f41947ppxfxbqfkf + ", videoStartPosition=" + this.f41948wkgbmnqykc + ", videoSize=" + this.f41945eablkybsjg;
    }
}
