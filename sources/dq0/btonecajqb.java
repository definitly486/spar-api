package dq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb implements jt0.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29308yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f29309zdlpuopuiu;

    public btonecajqb(List suggestions) {
        zdlpuopuiu.btonecajqb(suggestions, "suggestions");
        this.f29309zdlpuopuiu = suggestions;
        String name = btonecajqb.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f29308yggfygwlhe = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f29309zdlpuopuiu, ((btonecajqb) obj).f29309zdlpuopuiu);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29308yggfygwlhe;
    }

    public int hashCode() {
        return this.f29309zdlpuopuiu.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f29309zdlpuopuiu;
    }

    public String toString() {
        return "Suggestions(suggestions=" + this.f29309zdlpuopuiu + ")";
    }
}
