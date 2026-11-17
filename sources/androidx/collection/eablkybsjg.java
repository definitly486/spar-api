package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int[] f4263iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f4264ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f4265wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f4266zoijcleaow;

    public eablkybsjg() {
        this(0, 1, null);
    }

    private final void ppxfxbqfkf() {
        int[] iArr = this.f4263iobyxmoadg;
        int length = iArr.length;
        int i13 = this.f4266zoijcleaow;
        int i14 = length - i13;
        int i15 = length << 1;
        if (i15 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i15];
        hg.agtfadlqog.draadjrbmk(iArr, iArr2, 0, i13, length);
        hg.agtfadlqog.draadjrbmk(this.f4263iobyxmoadg, iArr2, i14, 0, this.f4266zoijcleaow);
        this.f4263iobyxmoadg = iArr2;
        this.f4266zoijcleaow = 0;
        this.f4264ppxfxbqfkf = length;
        this.f4265wkgbmnqykc = i15 - 1;
    }

    public final int eablkybsjg() {
        int i13 = this.f4266zoijcleaow;
        if (i13 == this.f4264ppxfxbqfkf) {
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.f4272iobyxmoadg;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i14 = this.f4263iobyxmoadg[i13];
        this.f4266zoijcleaow = (i13 + 1) & this.f4265wkgbmnqykc;
        return i14;
    }

    public final void iobyxmoadg(int i13) {
        int[] iArr = this.f4263iobyxmoadg;
        int i14 = this.f4264ppxfxbqfkf;
        iArr[i14] = i13;
        int i15 = this.f4265wkgbmnqykc & (i14 + 1);
        this.f4264ppxfxbqfkf = i15;
        if (i15 == this.f4266zoijcleaow) {
            ppxfxbqfkf();
        }
    }

    public final boolean wkgbmnqykc() {
        return this.f4266zoijcleaow == this.f4264ppxfxbqfkf;
    }

    public final void zoijcleaow() {
        this.f4264ppxfxbqfkf = this.f4266zoijcleaow;
    }

    public eablkybsjg(int i13) {
        if (!(i13 >= 1)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("capacity must be >= 1");
        }
        if (!(i13 <= 1073741824)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("capacity must be <= 2^30");
        }
        i13 = Integer.bitCount(i13) != 1 ? Integer.highestOneBit(i13 - 1) << 1 : i13;
        this.f4265wkgbmnqykc = i13 - 1;
        this.f4263iobyxmoadg = new int[i13];
    }

    public /* synthetic */ eablkybsjg(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 8 : i13);
    }
}
