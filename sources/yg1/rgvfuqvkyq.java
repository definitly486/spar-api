package yg1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f124973iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f124974zoijcleaow;

    public rgvfuqvkyq(String url, String str) {
        zdlpuopuiu.btonecajqb(url, "url");
        this.f124973iobyxmoadg = url;
        this.f124974zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return zdlpuopuiu.eablkybsjg(this.f124973iobyxmoadg, rgvfuqvkyqVar.f124973iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f124974zoijcleaow, rgvfuqvkyqVar.f124974zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f124973iobyxmoadg.hashCode() * 31;
        String str = this.f124974zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f124973iobyxmoadg;
    }

    public String toString() {
        return "Model(url=" + this.f124973iobyxmoadg + ", jwt=" + this.f124974zoijcleaow + ")";
    }
}
