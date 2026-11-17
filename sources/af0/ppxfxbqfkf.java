package af0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1674iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1675zoijcleaow;

    public ppxfxbqfkf(String str, String str2) {
        this.f1674iobyxmoadg = str;
        this.f1675zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f1674iobyxmoadg, ppxfxbqfkfVar.f1674iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1675zoijcleaow, ppxfxbqfkfVar.f1675zoijcleaow);
    }

    public int hashCode() {
        String str = this.f1674iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1675zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LoymaxPopupStyle(mainColor=" + this.f1674iobyxmoadg + ", secondColor=" + this.f1675zoijcleaow + ")";
    }
}
