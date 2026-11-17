package pj0;

import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76813iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f76814ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Uri f76815zoijcleaow;

    public iobyxmoadg(String name, Uri imageUri, String url) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(imageUri, "imageUri");
        zdlpuopuiu.btonecajqb(url, "url");
        this.f76813iobyxmoadg = name;
        this.f76815zoijcleaow = imageUri;
        this.f76814ppxfxbqfkf = url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f76813iobyxmoadg, iobyxmoadgVar.f76813iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76815zoijcleaow, iobyxmoadgVar.f76815zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f76814ppxfxbqfkf, iobyxmoadgVar.f76814ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f76813iobyxmoadg.hashCode() * 31) + this.f76815zoijcleaow.hashCode()) * 31) + this.f76814ppxfxbqfkf.hashCode();
    }

    public final Uri iobyxmoadg() {
        return this.f76815zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f76814ppxfxbqfkf;
    }

    public String toString() {
        return "PartnerUiModel(name=" + this.f76813iobyxmoadg + ", imageUri=" + this.f76815zoijcleaow + ", url=" + this.f76814ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f76813iobyxmoadg;
    }
}
