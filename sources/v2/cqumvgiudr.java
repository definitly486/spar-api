package v2;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final float f115310iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f115311ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final float f115312zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final cqumvgiudr f115309wkgbmnqykc = new cqumvgiudr(1.0f);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f115307eablkybsjg = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f115308gxszxtbevo = stevsuqkhv.uawqvzlxes(1);

    public cqumvgiudr(float f13) {
        this(f13, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cqumvgiudr.class != obj.getClass()) {
            return false;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
        return this.f115310iobyxmoadg == cqumvgiudrVar.f115310iobyxmoadg && this.f115312zoijcleaow == cqumvgiudrVar.f115312zoijcleaow;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f115310iobyxmoadg)) * 31) + Float.floatToRawIntBits(this.f115312zoijcleaow);
    }

    public long iobyxmoadg(long j13) {
        return j13 * ((long) this.f115311ppxfxbqfkf);
    }

    public String toString() {
        return stevsuqkhv.iozdgvuglv("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f115310iobyxmoadg), Float.valueOf(this.f115312zoijcleaow));
    }

    public cqumvgiudr zoijcleaow(float f13) {
        return new cqumvgiudr(f13, this.f115312zoijcleaow);
    }

    public cqumvgiudr(float f13, float f14) {
        y2.iobyxmoadg.iobyxmoadg(f13 > 0.0f);
        y2.iobyxmoadg.iobyxmoadg(f14 > 0.0f);
        this.f115310iobyxmoadg = f13;
        this.f115312zoijcleaow = f14;
        this.f115311ppxfxbqfkf = Math.round(f13 * 1000.0f);
    }
}
