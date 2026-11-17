package o70;

import com.pandulapeter.beagle.common.configuration.Text;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements p002if.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72239iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f72240ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Text f72241wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72242zoijcleaow;

    public iobyxmoadg(String apiVersion, String desc, List supportedEndPoints) {
        zdlpuopuiu.btonecajqb(apiVersion, "apiVersion");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(supportedEndPoints, "supportedEndPoints");
        this.f72239iobyxmoadg = apiVersion;
        this.f72242zoijcleaow = desc;
        this.f72240ppxfxbqfkf = supportedEndPoints;
        this.f72241wkgbmnqykc = com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(apiVersion).zoijcleaow(" " + desc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f72239iobyxmoadg, iobyxmoadgVar.f72239iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72242zoijcleaow, iobyxmoadgVar.f72242zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72240ppxfxbqfkf, iobyxmoadgVar.f72240ppxfxbqfkf);
    }

    @Override // p002if.zoijcleaow
    public String getId() {
        return if.zoijcleaow.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // p002if.zoijcleaow
    public Text getTitle() {
        return this.f72241wkgbmnqykc;
    }

    public int hashCode() {
        return (((this.f72239iobyxmoadg.hashCode() * 31) + this.f72242zoijcleaow.hashCode()) * 31) + this.f72240ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f72239iobyxmoadg;
    }

    public String toString() {
        return "ApiVersionSelectionContract(apiVersion=" + this.f72239iobyxmoadg + ", desc=" + this.f72242zoijcleaow + ", supportedEndPoints=" + this.f72240ppxfxbqfkf + ")";
    }
}
