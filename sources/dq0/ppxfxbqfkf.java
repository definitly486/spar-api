package dq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements jt0.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29325yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f29326zdlpuopuiu;

    public ppxfxbqfkf(List categories) {
        zdlpuopuiu.btonecajqb(categories, "categories");
        this.f29326zdlpuopuiu = categories;
        this.f29325yggfygwlhe = "javaClass";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29326zdlpuopuiu, ((ppxfxbqfkf) obj).f29326zdlpuopuiu);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29325yggfygwlhe;
    }

    public int hashCode() {
        return this.f29326zdlpuopuiu.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f29326zdlpuopuiu;
    }

    public String toString() {
        return "Categories(categories=" + this.f29326zdlpuopuiu + ")";
    }
}
