package ce1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19793iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19794ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f19795wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f19796zoijcleaow;

    public ppxfxbqfkf(String id2, wkgbmnqykc type, String message, String emoji) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(emoji, "emoji");
        this.f19793iobyxmoadg = id2;
        this.f19796zoijcleaow = type;
        this.f19794ppxfxbqfkf = message;
        this.f19795wkgbmnqykc = emoji;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f19793iobyxmoadg, ppxfxbqfkfVar.f19793iobyxmoadg) && this.f19796zoijcleaow == ppxfxbqfkfVar.f19796zoijcleaow && zdlpuopuiu.eablkybsjg(this.f19794ppxfxbqfkf, ppxfxbqfkfVar.f19794ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f19795wkgbmnqykc, ppxfxbqfkfVar.f19795wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f19793iobyxmoadg.hashCode() * 31) + this.f19796zoijcleaow.hashCode()) * 31) + this.f19794ppxfxbqfkf.hashCode()) * 31) + this.f19795wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f19795wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f19794ppxfxbqfkf;
    }

    public String toString() {
        return "OrderStatusBanner(id=" + this.f19793iobyxmoadg + ", type=" + this.f19796zoijcleaow + ", message=" + this.f19794ppxfxbqfkf + ", emoji=" + this.f19795wkgbmnqykc + ")";
    }

    public final wkgbmnqykc wkgbmnqykc() {
        return this.f19796zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f19793iobyxmoadg;
    }
}
