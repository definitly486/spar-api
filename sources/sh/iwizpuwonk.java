package sh;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ai.draadjrbmk f106547iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f106548ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Collection f106549zoijcleaow;

    public iwizpuwonk(ai.draadjrbmk nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f106547iobyxmoadg = nullabilityQualifier;
        this.f106549zoijcleaow = qualifierApplicabilityTypes;
        this.f106548ppxfxbqfkf = z13;
    }

    public static /* synthetic */ iwizpuwonk zoijcleaow(iwizpuwonk iwizpuwonkVar, ai.draadjrbmk draadjrbmkVar, Collection collection, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = iwizpuwonkVar.f106547iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            collection = iwizpuwonkVar.f106549zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = iwizpuwonkVar.f106548ppxfxbqfkf;
        }
        return iwizpuwonkVar.iobyxmoadg(draadjrbmkVar, collection, z13);
    }

    public final Collection eablkybsjg() {
        return this.f106549zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106547iobyxmoadg, iwizpuwonkVar.f106547iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106549zoijcleaow, iwizpuwonkVar.f106549zoijcleaow) && this.f106548ppxfxbqfkf == iwizpuwonkVar.f106548ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f106547iobyxmoadg.hashCode() * 31) + this.f106549zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f106548ppxfxbqfkf);
    }

    public final iwizpuwonk iobyxmoadg(ai.draadjrbmk nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new iwizpuwonk(nullabilityQualifier, qualifierApplicabilityTypes, z13);
    }

    public final boolean ppxfxbqfkf() {
        return this.f106548ppxfxbqfkf;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f106547iobyxmoadg + ", qualifierApplicabilityTypes=" + this.f106549zoijcleaow + ", definitelyNotNull=" + this.f106548ppxfxbqfkf + ')';
    }

    public final ai.draadjrbmk wkgbmnqykc() {
        return this.f106547iobyxmoadg;
    }

    public /* synthetic */ iwizpuwonk(ai.draadjrbmk draadjrbmkVar, Collection collection, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(draadjrbmkVar, collection, (i13 & 4) != 0 ? draadjrbmkVar.ppxfxbqfkf() == ai.gtknphoqwx.NOT_NULL : z13);
    }
}
