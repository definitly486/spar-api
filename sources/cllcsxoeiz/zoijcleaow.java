package cllcsxoeiz;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Size f20052eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f20053gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final UUID f20054iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f20055lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f20056nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f20057ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rect f20058wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f20059zoijcleaow;

    zoijcleaow(UUID uuid, int i13, int i14, Rect rect, Size size, int i15, boolean z13, boolean z14) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f20054iobyxmoadg = uuid;
        this.f20059zoijcleaow = i13;
        this.f20057ppxfxbqfkf = i14;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f20058wkgbmnqykc = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f20052eablkybsjg = size;
        this.f20053gxszxtbevo = i15;
        this.f20055lqeggnwhkg = z13;
        this.f20056nufgyqmvbu = z14;
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public boolean btonecajqb() {
        return this.f20056nufgyqmvbu;
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public int eablkybsjg() {
        return this.f20059zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f20054iobyxmoadg.equals(gxszxtbevoVar.gxszxtbevo()) && this.f20059zoijcleaow == gxszxtbevoVar.eablkybsjg() && this.f20057ppxfxbqfkf == gxszxtbevoVar.zoijcleaow() && this.f20058wkgbmnqykc.equals(gxszxtbevoVar.iobyxmoadg()) && this.f20052eablkybsjg.equals(gxszxtbevoVar.wkgbmnqykc()) && this.f20053gxszxtbevo == gxszxtbevoVar.ppxfxbqfkf() && this.f20055lqeggnwhkg == gxszxtbevoVar.lqeggnwhkg() && this.f20056nufgyqmvbu == gxszxtbevoVar.btonecajqb();
    }

    @Override // cllcsxoeiz.gxszxtbevo
    UUID gxszxtbevo() {
        return this.f20054iobyxmoadg;
    }

    public int hashCode() {
        return ((((((((((((((this.f20054iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f20059zoijcleaow) * 1000003) ^ this.f20057ppxfxbqfkf) * 1000003) ^ this.f20058wkgbmnqykc.hashCode()) * 1000003) ^ this.f20052eablkybsjg.hashCode()) * 1000003) ^ this.f20053gxszxtbevo) * 1000003) ^ (this.f20055lqeggnwhkg ? 1231 : 1237)) * 1000003) ^ (this.f20056nufgyqmvbu ? 1231 : 1237);
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public Rect iobyxmoadg() {
        return this.f20058wkgbmnqykc;
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public boolean lqeggnwhkg() {
        return this.f20055lqeggnwhkg;
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public int ppxfxbqfkf() {
        return this.f20053gxszxtbevo;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f20054iobyxmoadg + ", getTargets=" + this.f20059zoijcleaow + ", getFormat=" + this.f20057ppxfxbqfkf + ", getCropRect=" + this.f20058wkgbmnqykc + ", getSize=" + this.f20052eablkybsjg + ", getRotationDegrees=" + this.f20053gxszxtbevo + ", isMirroring=" + this.f20055lqeggnwhkg + ", shouldRespectInputCropRect=" + this.f20056nufgyqmvbu + "}";
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public Size wkgbmnqykc() {
        return this.f20052eablkybsjg;
    }

    @Override // cllcsxoeiz.gxszxtbevo
    public int zoijcleaow() {
        return this.f20057ppxfxbqfkf;
    }
}
