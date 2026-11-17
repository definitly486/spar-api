package vq1;

import java.util.List;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class pkzmftpjix implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117890iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final PromoCollectionInfo f117891ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f117892wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117893zoijcleaow;

    public pkzmftpjix(int i13, jpowsppfya type, PromoCollectionInfo info, List items) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        this.f117890iobyxmoadg = i13;
        this.f117893zoijcleaow = type;
        this.f117891ppxfxbqfkf = info;
        this.f117892wkgbmnqykc = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkzmftpjix)) {
            return false;
        }
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) obj;
        return this.f117890iobyxmoadg == pkzmftpjixVar.f117890iobyxmoadg && this.f117893zoijcleaow == pkzmftpjixVar.f117893zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117891ppxfxbqfkf, pkzmftpjixVar.f117891ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117892wkgbmnqykc, pkzmftpjixVar.f117892wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f117890iobyxmoadg) * 31) + this.f117893zoijcleaow.hashCode()) * 31) + this.f117891ppxfxbqfkf.hashCode()) * 31) + this.f117892wkgbmnqykc.hashCode();
    }

    public int iobyxmoadg() {
        return this.f117890iobyxmoadg;
    }

    public final List ppxfxbqfkf() {
        return this.f117892wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerPromoCollection(index=" + this.f117890iobyxmoadg + ", type=" + this.f117893zoijcleaow + ", info=" + this.f117891ppxfxbqfkf + ", items=" + this.f117892wkgbmnqykc + ")";
    }

    public final PromoCollectionInfo zoijcleaow() {
        return this.f117891ppxfxbqfkf;
    }
}
