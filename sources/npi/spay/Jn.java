package npi.spay;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class Jn extends IllegalStateException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f70552zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jn(String option) {
        super("Unknown option: " + option);
        zdlpuopuiu.btonecajqb(option, "option");
        this.f70552zdlpuopuiu = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Jn) && zdlpuopuiu.eablkybsjg(this.f70552zdlpuopuiu, ((Jn) obj).f70552zdlpuopuiu);
    }

    public final int hashCode() {
        return this.f70552zdlpuopuiu.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "UnknownFeatureOption(option=" + this.f70552zdlpuopuiu + ")";
    }
}
