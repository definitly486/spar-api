package pr;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo implements pu.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f77164yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f77165zdlpuopuiu;

    public gxszxtbevo(List suggestions) {
        zdlpuopuiu.btonecajqb(suggestions, "suggestions");
        this.f77165zdlpuopuiu = suggestions;
        String name = gxszxtbevo.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f77164yggfygwlhe = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f77165zdlpuopuiu, ((gxszxtbevo) obj).f77165zdlpuopuiu);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f77164yggfygwlhe;
    }

    public int hashCode() {
        return this.f77165zdlpuopuiu.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f77165zdlpuopuiu;
    }

    public String toString() {
        return "Suggestions(suggestions=" + this.f77165zdlpuopuiu + ")";
    }
}
