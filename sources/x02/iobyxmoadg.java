package x02;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f120903iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f120904ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f120905zoijcleaow;

    public iobyxmoadg(boolean z13, boolean z14, zoijcleaow type) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f120903iobyxmoadg = z13;
        this.f120905zoijcleaow = z14;
        this.f120904ppxfxbqfkf = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f120903iobyxmoadg == iobyxmoadgVar.f120903iobyxmoadg && this.f120905zoijcleaow == iobyxmoadgVar.f120905zoijcleaow && this.f120904ppxfxbqfkf == iobyxmoadgVar.f120904ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f120903iobyxmoadg) * 31) + Boolean.hashCode(this.f120905zoijcleaow)) * 31) + this.f120904ppxfxbqfkf.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f120904ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f120903iobyxmoadg;
    }

    public String toString() {
        return "ButtonUiModel(isLoading=" + this.f120903iobyxmoadg + ", isEnabled=" + this.f120905zoijcleaow + ", type=" + this.f120904ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f120905zoijcleaow;
    }
}
