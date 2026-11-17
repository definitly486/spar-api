package ac;

/* JADX INFO: loaded from: classes2.dex */
public final class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1481iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1482zoijcleaow;

    public ylkuphrtab(String str, String str2) {
        this.f1481iobyxmoadg = str;
        this.f1482zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylkuphrtab)) {
            return false;
        }
        ylkuphrtab ylkuphrtabVar = (ylkuphrtab) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f1481iobyxmoadg, ylkuphrtabVar.f1481iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f1482zoijcleaow, ylkuphrtabVar.f1482zoijcleaow);
    }

    public int hashCode() {
        String str = this.f1481iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1482zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f1482zoijcleaow;
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f1481iobyxmoadg + ", authToken=" + this.f1482zoijcleaow + ')';
    }

    public final String zoijcleaow() {
        return this.f1481iobyxmoadg;
    }
}
