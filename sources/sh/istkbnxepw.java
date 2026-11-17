package sh;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dsvhmnatus f106544iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dsvhmnatus f106545ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final KotlinVersion f106546zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f106543wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final istkbnxepw f106542eablkybsjg = new istkbnxepw(dsvhmnatus.STRICT, null, null, 6, null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final istkbnxepw iobyxmoadg() {
            return istkbnxepw.f106542eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    public istkbnxepw(dsvhmnatus reportLevelBefore, KotlinVersion kotlinVersion, dsvhmnatus reportLevelAfter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reportLevelBefore, "reportLevelBefore");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reportLevelAfter, "reportLevelAfter");
        this.f106544iobyxmoadg = reportLevelBefore;
        this.f106546zoijcleaow = kotlinVersion;
        this.f106545ppxfxbqfkf = reportLevelAfter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof istkbnxepw)) {
            return false;
        }
        istkbnxepw istkbnxepwVar = (istkbnxepw) obj;
        return this.f106544iobyxmoadg == istkbnxepwVar.f106544iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106546zoijcleaow, istkbnxepwVar.f106546zoijcleaow) && this.f106545ppxfxbqfkf == istkbnxepwVar.f106545ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = this.f106544iobyxmoadg.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f106546zoijcleaow;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31) + this.f106545ppxfxbqfkf.hashCode();
    }

    public final dsvhmnatus ppxfxbqfkf() {
        return this.f106544iobyxmoadg;
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f106544iobyxmoadg + ", sinceVersion=" + this.f106546zoijcleaow + ", reportLevelAfter=" + this.f106545ppxfxbqfkf + ')';
    }

    public final KotlinVersion wkgbmnqykc() {
        return this.f106546zoijcleaow;
    }

    public final dsvhmnatus zoijcleaow() {
        return this.f106545ppxfxbqfkf;
    }

    public /* synthetic */ istkbnxepw(dsvhmnatus dsvhmnatusVar, KotlinVersion kotlinVersion, dsvhmnatus dsvhmnatusVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(dsvhmnatusVar, (i13 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i13 & 4) != 0 ? dsvhmnatusVar : dsvhmnatusVar2);
    }
}
