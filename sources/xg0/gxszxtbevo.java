package xg0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f122320iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f122321ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f122322wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f122323zoijcleaow;

    public gxszxtbevo(String id2, lqeggnwhkg type, String message, String emoji) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(emoji, "emoji");
        this.f122320iobyxmoadg = id2;
        this.f122323zoijcleaow = type;
        this.f122321ppxfxbqfkf = message;
        this.f122322wkgbmnqykc = emoji;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f122320iobyxmoadg, gxszxtbevoVar.f122320iobyxmoadg) && this.f122323zoijcleaow == gxszxtbevoVar.f122323zoijcleaow && zdlpuopuiu.eablkybsjg(this.f122321ppxfxbqfkf, gxszxtbevoVar.f122321ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f122322wkgbmnqykc, gxszxtbevoVar.f122322wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f122320iobyxmoadg.hashCode() * 31) + this.f122323zoijcleaow.hashCode()) * 31) + this.f122321ppxfxbqfkf.hashCode()) * 31) + this.f122322wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f122322wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f122321ppxfxbqfkf;
    }

    public String toString() {
        return "OrderStatusBanner(id=" + this.f122320iobyxmoadg + ", type=" + this.f122323zoijcleaow + ", message=" + this.f122321ppxfxbqfkf + ", emoji=" + this.f122322wkgbmnqykc + ")";
    }

    public final lqeggnwhkg wkgbmnqykc() {
        return this.f122323zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f122320iobyxmoadg;
    }
}
