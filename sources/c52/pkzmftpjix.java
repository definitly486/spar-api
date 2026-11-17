package c52;

import java.util.List;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class pkzmftpjix implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18970iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final PromoCollectionInfo f18971ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f18972wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18973zoijcleaow;

    public pkzmftpjix(int i13, jpowsppfya type, PromoCollectionInfo info, List items) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        this.f18970iobyxmoadg = i13;
        this.f18973zoijcleaow = type;
        this.f18971ppxfxbqfkf = info;
        this.f18972wkgbmnqykc = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkzmftpjix)) {
            return false;
        }
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) obj;
        return this.f18970iobyxmoadg == pkzmftpjixVar.f18970iobyxmoadg && this.f18973zoijcleaow == pkzmftpjixVar.f18973zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18971ppxfxbqfkf, pkzmftpjixVar.f18971ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18972wkgbmnqykc, pkzmftpjixVar.f18972wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f18970iobyxmoadg) * 31) + this.f18973zoijcleaow.hashCode()) * 31) + this.f18971ppxfxbqfkf.hashCode()) * 31) + this.f18972wkgbmnqykc.hashCode();
    }

    public int iobyxmoadg() {
        return this.f18970iobyxmoadg;
    }

    public final List ppxfxbqfkf() {
        return this.f18972wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerPromoCollection(index=" + this.f18970iobyxmoadg + ", type=" + this.f18973zoijcleaow + ", info=" + this.f18971ppxfxbqfkf + ", items=" + this.f18972wkgbmnqykc + ")";
    }

    public final PromoCollectionInfo zoijcleaow() {
        return this.f18971ppxfxbqfkf;
    }
}
