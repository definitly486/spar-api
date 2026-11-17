package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj implements nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f60031yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Class f60032zdlpuopuiu;

    public pmvmpeiblj(Class jClass, String moduleName) {
        zdlpuopuiu.btonecajqb(jClass, "jClass");
        zdlpuopuiu.btonecajqb(moduleName, "moduleName");
        this.f60032zdlpuopuiu = jClass;
        this.f60031yggfygwlhe = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof pmvmpeiblj) && zdlpuopuiu.eablkybsjg(zoijcleaow(), ((pmvmpeiblj) obj).zoijcleaow());
    }

    public int hashCode() {
        return zoijcleaow().hashCode();
    }

    public String toString() {
        return zoijcleaow() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.nufgyqmvbu
    public Class zoijcleaow() {
        return this.f60032zdlpuopuiu;
    }
}
