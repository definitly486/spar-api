package wl0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final sl0.iobyxmoadg f120198iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120199zoijcleaow;

    public zoijcleaow(sl0.iobyxmoadg type, String text) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f120198iobyxmoadg = type;
        this.f120199zoijcleaow = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f120198iobyxmoadg == zoijcleaowVar.f120198iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f120199zoijcleaow, zoijcleaowVar.f120199zoijcleaow);
    }

    public int hashCode() {
        return (this.f120198iobyxmoadg.hashCode() * 31) + this.f120199zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f120199zoijcleaow;
    }

    public String toString() {
        return "AddressDetailTypeUiModel(type=" + this.f120198iobyxmoadg + ", text=" + this.f120199zoijcleaow + ")";
    }

    public final sl0.iobyxmoadg zoijcleaow() {
        return this.f120198iobyxmoadg;
    }
}
