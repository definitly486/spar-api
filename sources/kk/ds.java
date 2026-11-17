package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ds extends qv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f56319iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f56320zoijcleaow;

    public ds(int i13, String uri) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri, "uri");
        this.f56319iobyxmoadg = i13;
        this.f56320zoijcleaow = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        return this.f56319iobyxmoadg == dsVar.f56319iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56320zoijcleaow, dsVar.f56320zoijcleaow);
    }

    public final int hashCode() {
        return this.f56320zoijcleaow.hashCode() + (Integer.hashCode(this.f56319iobyxmoadg) * 31);
    }

    public final String toString() {
        return "OpenAgreementConditionsClickedEvent(index=" + this.f56319iobyxmoadg + ", uri=" + this.f56320zoijcleaow + ")";
    }
}
