package qg1;

import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78806iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f78807ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Uri f78808zoijcleaow;

    public iobyxmoadg(String name, Uri imageUri, String url) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(imageUri, "imageUri");
        zdlpuopuiu.btonecajqb(url, "url");
        this.f78806iobyxmoadg = name;
        this.f78808zoijcleaow = imageUri;
        this.f78807ppxfxbqfkf = url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f78806iobyxmoadg, iobyxmoadgVar.f78806iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f78808zoijcleaow, iobyxmoadgVar.f78808zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f78807ppxfxbqfkf, iobyxmoadgVar.f78807ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f78806iobyxmoadg.hashCode() * 31) + this.f78808zoijcleaow.hashCode()) * 31) + this.f78807ppxfxbqfkf.hashCode();
    }

    public final Uri iobyxmoadg() {
        return this.f78808zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f78807ppxfxbqfkf;
    }

    public String toString() {
        return "PartnerUiModel(name=" + this.f78806iobyxmoadg + ", imageUri=" + this.f78808zoijcleaow + ", url=" + this.f78807ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f78806iobyxmoadg;
    }
}
