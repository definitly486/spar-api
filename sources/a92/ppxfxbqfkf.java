package a92;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1171iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f1172ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f1173wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1174zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f1175iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f1176ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f1177zoijcleaow;

        public iobyxmoadg(String id2, String text, boolean z13) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(text, "text");
            this.f1175iobyxmoadg = id2;
            this.f1177zoijcleaow = text;
            this.f1176ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f1175iobyxmoadg, iobyxmoadgVar.f1175iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1177zoijcleaow, iobyxmoadgVar.f1177zoijcleaow) && this.f1176ppxfxbqfkf == iobyxmoadgVar.f1176ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f1175iobyxmoadg.hashCode() * 31) + this.f1177zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f1176ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f1175iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f1176ppxfxbqfkf;
        }

        public String toString() {
            return "Variant(id=" + this.f1175iobyxmoadg + ", text=" + this.f1177zoijcleaow + ", isSelected=" + this.f1176ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f1177zoijcleaow;
        }
    }

    public ppxfxbqfkf(String id2, String title, List variants, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(variants, "variants");
        this.f1171iobyxmoadg = id2;
        this.f1174zoijcleaow = title;
        this.f1172ppxfxbqfkf = variants;
        this.f1173wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f1171iobyxmoadg, ppxfxbqfkfVar.f1171iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1174zoijcleaow, ppxfxbqfkfVar.f1174zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1172ppxfxbqfkf, ppxfxbqfkfVar.f1172ppxfxbqfkf) && this.f1173wkgbmnqykc == ppxfxbqfkfVar.f1173wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f1171iobyxmoadg.hashCode() * 31) + this.f1174zoijcleaow.hashCode()) * 31) + this.f1172ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f1173wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f1171iobyxmoadg;
    }

    public final List ppxfxbqfkf() {
        return this.f1172ppxfxbqfkf;
    }

    public String toString() {
        return "SubscriptionSettingUiModel(id=" + this.f1171iobyxmoadg + ", title=" + this.f1174zoijcleaow + ", variants=" + this.f1172ppxfxbqfkf + ", isAdditionalInfoIconVisible=" + this.f1173wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f1173wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f1174zoijcleaow;
    }
}
