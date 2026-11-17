package ru;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f104804iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f104805zoijcleaow;

    public ppxfxbqfkf(iobyxmoadg product, List replaces) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(replaces, "replaces");
        this.f104804iobyxmoadg = product;
        this.f104805zoijcleaow = replaces;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f104804iobyxmoadg, ppxfxbqfkfVar.f104804iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104805zoijcleaow, ppxfxbqfkfVar.f104805zoijcleaow);
    }

    public int hashCode() {
        return (this.f104804iobyxmoadg.hashCode() * 31) + this.f104805zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f104804iobyxmoadg;
    }

    public String toString() {
        return "SpecificOrderProductUiModel(product=" + this.f104804iobyxmoadg + ", replaces=" + this.f104805zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f104805zoijcleaow;
    }
}
