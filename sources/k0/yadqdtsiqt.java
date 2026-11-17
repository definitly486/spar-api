package k0;

/* JADX INFO: loaded from: classes.dex */
final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rlfsiqarku f53383iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f53384ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f53385zoijcleaow = -1;

    public yadqdtsiqt(rlfsiqarku rlfsiqarkuVar) {
        this.f53383iobyxmoadg = rlfsiqarkuVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    private final float iobyxmoadg(int i13, boolean z13, boolean z14, boolean z15) {
        boolean z16;
        int i14 = 1;
        if (z13) {
            int iIobyxmoadg = lmojexxdyd.iobyxmoadg(this.f53383iobyxmoadg.dxjokdxxww(), i13, z13);
            int iJyumaefscl = this.f53383iobyxmoadg.jyumaefscl(iIobyxmoadg);
            int iRgvfuqvkyq = this.f53383iobyxmoadg.rgvfuqvkyq(iIobyxmoadg);
            if (i13 == iJyumaefscl || i13 == iRgvfuqvkyq) {
                z16 = true;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        int i15 = i13 * 4;
        if (!z15) {
            i14 = z16 ? 2 : 3;
        } else if (z16) {
            i14 = 0;
        }
        int i16 = i15 + i14;
        if (this.f53385zoijcleaow == i16) {
            return this.f53384ppxfxbqfkf;
        }
        float fPmvmpeiblj = z15 ? this.f53383iobyxmoadg.pmvmpeiblj(i13, z13) : this.f53383iobyxmoadg.cdpycssgdh(i13, z13);
        if (z14) {
            this.f53385zoijcleaow = i16;
            this.f53384ppxfxbqfkf = fPmvmpeiblj;
        }
        return fPmvmpeiblj;
    }

    public final float eablkybsjg(int i13) {
        return iobyxmoadg(i13, true, true, false);
    }

    public final float ppxfxbqfkf(int i13) {
        return iobyxmoadg(i13, true, true, true);
    }

    public final float wkgbmnqykc(int i13) {
        return iobyxmoadg(i13, false, false, false);
    }

    public final float zoijcleaow(int i13) {
        return iobyxmoadg(i13, false, false, true);
    }
}
