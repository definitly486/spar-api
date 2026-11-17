package y2;

/* JADX INFO: loaded from: classes.dex */
public final class lmojexxdyd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final lmojexxdyd f123566ppxfxbqfkf = new lmojexxdyd(-1, -1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final lmojexxdyd f123567wkgbmnqykc = new lmojexxdyd(0, 0);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f123568iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f123569zoijcleaow;

    public lmojexxdyd(int i13, int i14) {
        iobyxmoadg.iobyxmoadg((i13 == -1 || i13 >= 0) && (i14 == -1 || i14 >= 0));
        this.f123568iobyxmoadg = i13;
        this.f123569zoijcleaow = i14;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd)) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return this.f123568iobyxmoadg == lmojexxdydVar.f123568iobyxmoadg && this.f123569zoijcleaow == lmojexxdydVar.f123569zoijcleaow;
    }

    public int hashCode() {
        int i13 = this.f123569zoijcleaow;
        int i14 = this.f123568iobyxmoadg;
        return i13 ^ ((i14 >>> 16) | (i14 << 16));
    }

    public int iobyxmoadg() {
        return this.f123569zoijcleaow;
    }

    public String toString() {
        return this.f123568iobyxmoadg + "x" + this.f123569zoijcleaow;
    }

    public int zoijcleaow() {
        return this.f123568iobyxmoadg;
    }
}
