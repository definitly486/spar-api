package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f69936eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f69937iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Text f69938ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f69939wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Text f69940zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public lqeggnwhkg(Text title, Text text, Text text2) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f69937iobyxmoadg = title;
        this.f69940zoijcleaow = text;
        this.f69938ppxfxbqfkf = text2;
        this.f69939wkgbmnqykc = "header";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f69937iobyxmoadg, lqeggnwhkgVar.f69937iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69940zoijcleaow, lqeggnwhkgVar.f69940zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69938ppxfxbqfkf, lqeggnwhkgVar.f69938ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f69937iobyxmoadg.hashCode() * 31;
        Text text = this.f69940zoijcleaow;
        int iHashCode2 = (iHashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.f69938ppxfxbqfkf;
        return iHashCode2 + (text2 != null ? text2.hashCode() : 0);
    }

    public String toString() {
        return "HeaderModule(title=" + this.f69937iobyxmoadg + ", subtitle=" + this.f69940zoijcleaow + ", text=" + this.f69938ppxfxbqfkf + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(CharSequence title, CharSequence charSequence, CharSequence charSequence2) {
        this(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(title), charSequence != null ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(charSequence) : null, charSequence2 != null ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(charSequence2) : null);
        zdlpuopuiu.btonecajqb(title, "title");
    }
}
