package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public final class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f26461iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f26462ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f26463wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f26464zoijcleaow;

    public ribwqtqdhb(int i13, int i14, int i15, int i16) {
        this.f26461iobyxmoadg = i13;
        this.f26464zoijcleaow = i14;
        this.f26462ppxfxbqfkf = i15;
        this.f26463wkgbmnqykc = i16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ribwqtqdhb)) {
            return false;
        }
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) obj;
        return this.f26461iobyxmoadg == ribwqtqdhbVar.f26461iobyxmoadg && this.f26464zoijcleaow == ribwqtqdhbVar.f26464zoijcleaow && this.f26462ppxfxbqfkf == ribwqtqdhbVar.f26462ppxfxbqfkf && this.f26463wkgbmnqykc == ribwqtqdhbVar.f26463wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f26461iobyxmoadg * 31) + this.f26464zoijcleaow) * 31) + this.f26462ppxfxbqfkf) * 31) + this.f26463wkgbmnqykc;
    }

    public final int iobyxmoadg() {
        return this.f26463wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f26462ppxfxbqfkf;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f26461iobyxmoadg + ", top=" + this.f26464zoijcleaow + ", right=" + this.f26462ppxfxbqfkf + ", bottom=" + this.f26463wkgbmnqykc + ')';
    }

    public final int wkgbmnqykc() {
        return this.f26464zoijcleaow;
    }

    public final int zoijcleaow() {
        return this.f26461iobyxmoadg;
    }
}
