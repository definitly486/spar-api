package v;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f114922iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f114923ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f114924wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f114925zoijcleaow;

    public zoijcleaow(float f13, float f14, long j13, int i13) {
        this.f114922iobyxmoadg = f13;
        this.f114925zoijcleaow = f14;
        this.f114923ppxfxbqfkf = j13;
        this.f114924wkgbmnqykc = i13;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zoijcleaow) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            if (zoijcleaowVar.f114922iobyxmoadg == this.f114922iobyxmoadg && zoijcleaowVar.f114925zoijcleaow == this.f114925zoijcleaow && zoijcleaowVar.f114923ppxfxbqfkf == this.f114923ppxfxbqfkf && zoijcleaowVar.f114924wkgbmnqykc == this.f114924wkgbmnqykc) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f114922iobyxmoadg) * 31) + Float.hashCode(this.f114925zoijcleaow)) * 31) + Long.hashCode(this.f114923ppxfxbqfkf)) * 31) + Integer.hashCode(this.f114924wkgbmnqykc);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f114922iobyxmoadg + ",horizontalScrollPixels=" + this.f114925zoijcleaow + ",uptimeMillis=" + this.f114923ppxfxbqfkf + ",deviceId=" + this.f114924wkgbmnqykc + ')';
    }
}
