package z2;

import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f127607iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f127608ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f127609zoijcleaow;

    public eablkybsjg(long j13, long j14, long j15) {
        this.f127607iobyxmoadg = j13;
        this.f127609zoijcleaow = j14;
        this.f127608ppxfxbqfkf = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f127607iobyxmoadg == eablkybsjgVar.f127607iobyxmoadg && this.f127609zoijcleaow == eablkybsjgVar.f127609zoijcleaow && this.f127608ppxfxbqfkf == eablkybsjgVar.f127608ppxfxbqfkf;
    }

    public int hashCode() {
        return ((((527 + com.google.common.primitives.nufgyqmvbu.iobyxmoadg(this.f127607iobyxmoadg)) * 31) + com.google.common.primitives.nufgyqmvbu.iobyxmoadg(this.f127609zoijcleaow)) * 31) + com.google.common.primitives.nufgyqmvbu.iobyxmoadg(this.f127608ppxfxbqfkf);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f127607iobyxmoadg + ", modification time=" + this.f127609zoijcleaow + ", timescale=" + this.f127608ppxfxbqfkf;
    }
}
