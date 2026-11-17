package tu1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f111543iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f111544ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f111545wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f111546zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f111547iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f111548ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f111549zoijcleaow;

        public iobyxmoadg(String id2, String text, boolean z13) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(text, "text");
            this.f111547iobyxmoadg = id2;
            this.f111549zoijcleaow = text;
            this.f111548ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f111547iobyxmoadg, iobyxmoadgVar.f111547iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111549zoijcleaow, iobyxmoadgVar.f111549zoijcleaow) && this.f111548ppxfxbqfkf == iobyxmoadgVar.f111548ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f111547iobyxmoadg.hashCode() * 31) + this.f111549zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f111548ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f111547iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f111548ppxfxbqfkf;
        }

        public String toString() {
            return "Variant(id=" + this.f111547iobyxmoadg + ", text=" + this.f111549zoijcleaow + ", isSelected=" + this.f111548ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f111549zoijcleaow;
        }
    }

    public ppxfxbqfkf(String id2, String title, List variants, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(variants, "variants");
        this.f111543iobyxmoadg = id2;
        this.f111546zoijcleaow = title;
        this.f111544ppxfxbqfkf = variants;
        this.f111545wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f111543iobyxmoadg, ppxfxbqfkfVar.f111543iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111546zoijcleaow, ppxfxbqfkfVar.f111546zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f111544ppxfxbqfkf, ppxfxbqfkfVar.f111544ppxfxbqfkf) && this.f111545wkgbmnqykc == ppxfxbqfkfVar.f111545wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f111543iobyxmoadg.hashCode() * 31) + this.f111546zoijcleaow.hashCode()) * 31) + this.f111544ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f111545wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f111543iobyxmoadg;
    }

    public final List ppxfxbqfkf() {
        return this.f111544ppxfxbqfkf;
    }

    public String toString() {
        return "SubscriptionSettingUiModel(id=" + this.f111543iobyxmoadg + ", title=" + this.f111546zoijcleaow + ", variants=" + this.f111544ppxfxbqfkf + ", isAdditionalInfoIconVisible=" + this.f111545wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f111545wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f111546zoijcleaow;
    }
}
