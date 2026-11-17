package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f69987lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f69988eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f69989gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f69990iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Text f69991ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Text f69992wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Text f69993zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public wflxmlrfwp(Text title, Text text, Text text2, Text galleryText, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(galleryText, "galleryText");
        this.f69990iobyxmoadg = title;
        this.f69993zoijcleaow = text;
        this.f69991ppxfxbqfkf = text2;
        this.f69992wkgbmnqykc = galleryText;
        this.f69988eablkybsjg = z13;
        this.f69989gxszxtbevo = "screenCaptureToolbox";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f69990iobyxmoadg, wflxmlrfwpVar.f69990iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69993zoijcleaow, wflxmlrfwpVar.f69993zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69991ppxfxbqfkf, wflxmlrfwpVar.f69991ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69992wkgbmnqykc, wflxmlrfwpVar.f69992wkgbmnqykc) && this.f69988eablkybsjg == wflxmlrfwpVar.f69988eablkybsjg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.f69990iobyxmoadg.hashCode() * 31;
        Text text = this.f69993zoijcleaow;
        int iHashCode2 = (iHashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.f69991ppxfxbqfkf;
        int iHashCode3 = (((iHashCode2 + (text2 != null ? text2.hashCode() : 0)) * 31) + this.f69992wkgbmnqykc.hashCode()) * 31;
        boolean z13 = this.f69988eablkybsjg;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode3 + r13;
    }

    public String toString() {
        return "ScreenCaptureToolboxModule(title=" + this.f69990iobyxmoadg + ", imageText=" + this.f69993zoijcleaow + ", videoText=" + this.f69991ppxfxbqfkf + ", galleryText=" + this.f69992wkgbmnqykc + ", isExpandedInitially=" + this.f69988eablkybsjg + ")";
    }

    public /* synthetic */ wflxmlrfwp(Text text, Text text2, Text text3, Text text4, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Screen capture tools") : text, (i13 & 2) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Take a screenshot") : text2, (i13 & 4) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Record a video") : text3, (i13 & 8) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Open the gallery") : text4, (i13 & 16) != 0 ? false : z13);
    }
}
