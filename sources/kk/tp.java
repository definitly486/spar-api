package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class tp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final rt f58712iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f58713zoijcleaow;

    public tp(rt name, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        this.f58712iobyxmoadg = name;
        this.f58713zoijcleaow = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58712iobyxmoadg, tpVar.f58712iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58713zoijcleaow, tpVar.f58713zoijcleaow);
    }

    public final int hashCode() {
        int iHashCode = this.f58712iobyxmoadg.hashCode() * 31;
        String str = this.f58713zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MerchantData(name=" + this.f58712iobyxmoadg + ", logo=" + this.f58713zoijcleaow + ")";
    }
}
