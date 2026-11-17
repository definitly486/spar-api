package pr;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements pu.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f77162yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f77163zdlpuopuiu;

    public eablkybsjg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f77163zdlpuopuiu = items;
        String name = eablkybsjg.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f77162yggfygwlhe = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f77163zdlpuopuiu, ((eablkybsjg) obj).f77163zdlpuopuiu);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f77162yggfygwlhe;
    }

    public int hashCode() {
        return this.f77163zdlpuopuiu.hashCode();
    }

    public final eablkybsjg iobyxmoadg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        return new eablkybsjg(items);
    }

    public String toString() {
        return "History(items=" + this.f77163zdlpuopuiu + ")";
    }

    public final List wkgbmnqykc() {
        return this.f77163zdlpuopuiu;
    }
}
