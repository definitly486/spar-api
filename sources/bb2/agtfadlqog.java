package bb2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f15678iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f15679zoijcleaow;

    public agtfadlqog(String url, boolean z13) {
        zdlpuopuiu.btonecajqb(url, "url");
        this.f15678iobyxmoadg = url;
        this.f15679zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f15678iobyxmoadg, agtfadlqogVar.f15678iobyxmoadg) && this.f15679zoijcleaow == agtfadlqogVar.f15679zoijcleaow;
    }

    public int hashCode() {
        return (this.f15678iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15679zoijcleaow);
    }

    public final String iobyxmoadg() {
        return this.f15678iobyxmoadg;
    }

    public String toString() {
        return "Model(url=" + this.f15678iobyxmoadg + ", isChatOrderEnabled=" + this.f15679zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f15679zoijcleaow;
    }
}
