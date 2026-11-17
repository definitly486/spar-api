package mb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66740iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66741zoijcleaow;

    public ppxfxbqfkf(String label, String value) {
        zdlpuopuiu.btonecajqb(label, "label");
        zdlpuopuiu.btonecajqb(value, "value");
        this.f66740iobyxmoadg = label;
        this.f66741zoijcleaow = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f66740iobyxmoadg, ppxfxbqfkfVar.f66740iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66741zoijcleaow, ppxfxbqfkfVar.f66741zoijcleaow);
    }

    public int hashCode() {
        return (this.f66740iobyxmoadg.hashCode() * 31) + this.f66741zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f66740iobyxmoadg;
    }

    public String toString() {
        return "ProductParamUiModel(label=" + this.f66740iobyxmoadg + ", value=" + this.f66741zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f66741zoijcleaow;
    }
}
