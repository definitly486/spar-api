package pr;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements pu.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f77171yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f77172zdlpuopuiu;

    public ppxfxbqfkf(List categories) {
        zdlpuopuiu.btonecajqb(categories, "categories");
        this.f77172zdlpuopuiu = categories;
        this.f77171yggfygwlhe = "javaClass";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f77172zdlpuopuiu, ((ppxfxbqfkf) obj).f77172zdlpuopuiu);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f77171yggfygwlhe;
    }

    public int hashCode() {
        return this.f77172zdlpuopuiu.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f77172zdlpuopuiu;
    }

    public String toString() {
        return "Categories(categories=" + this.f77172zdlpuopuiu + ")";
    }
}
