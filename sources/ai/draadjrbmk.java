package ai;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f1923iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f1924zoijcleaow;

    public draadjrbmk(gtknphoqwx qualifier, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifier, "qualifier");
        this.f1923iobyxmoadg = qualifier;
        this.f1924zoijcleaow = z13;
    }

    public static /* synthetic */ draadjrbmk zoijcleaow(draadjrbmk draadjrbmkVar, gtknphoqwx gtknphoqwxVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            gtknphoqwxVar = draadjrbmkVar.f1923iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = draadjrbmkVar.f1924zoijcleaow;
        }
        return draadjrbmkVar.iobyxmoadg(gtknphoqwxVar, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f1923iobyxmoadg == draadjrbmkVar.f1923iobyxmoadg && this.f1924zoijcleaow == draadjrbmkVar.f1924zoijcleaow;
    }

    public int hashCode() {
        return (this.f1923iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f1924zoijcleaow);
    }

    public final draadjrbmk iobyxmoadg(gtknphoqwx qualifier, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifier, "qualifier");
        return new draadjrbmk(qualifier, z13);
    }

    public final gtknphoqwx ppxfxbqfkf() {
        return this.f1923iobyxmoadg;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f1923iobyxmoadg + ", isForWarningOnly=" + this.f1924zoijcleaow + ')';
    }

    public final boolean wkgbmnqykc() {
        return this.f1924zoijcleaow;
    }

    public /* synthetic */ draadjrbmk(gtknphoqwx gtknphoqwxVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, (i13 & 2) != 0 ? false : z13);
    }
}
