package ii0;

import java.util.List;
import ki0.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f44492iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f44493ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ki0.gxszxtbevo f44494zoijcleaow;

    public gxszxtbevo(List items, ki0.gxszxtbevo mode, draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(mode, "mode");
        this.f44492iobyxmoadg = items;
        this.f44494zoijcleaow = mode;
        this.f44493ppxfxbqfkf = draadjrbmkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f44492iobyxmoadg, gxszxtbevoVar.f44492iobyxmoadg) && this.f44494zoijcleaow == gxszxtbevoVar.f44494zoijcleaow && zdlpuopuiu.eablkybsjg(this.f44493ppxfxbqfkf, gxszxtbevoVar.f44493ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f44492iobyxmoadg.hashCode() * 31) + this.f44494zoijcleaow.hashCode()) * 31;
        draadjrbmk draadjrbmkVar = this.f44493ppxfxbqfkf;
        return iHashCode + (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode());
    }

    public final List iobyxmoadg() {
        return this.f44492iobyxmoadg;
    }

    public final draadjrbmk ppxfxbqfkf() {
        return this.f44493ppxfxbqfkf;
    }

    public String toString() {
        return "Model(items=" + this.f44492iobyxmoadg + ", mode=" + this.f44494zoijcleaow + ", networkInfo=" + this.f44493ppxfxbqfkf + ")";
    }

    public final ki0.gxszxtbevo zoijcleaow() {
        return this.f44494zoijcleaow;
    }
}
