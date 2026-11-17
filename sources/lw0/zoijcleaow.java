package lw0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final lw0.iobyxmoadg f64253eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f64254iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f64255ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f64256wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f64257zoijcleaow;

        public iobyxmoadg(int i13, String contactName, String contactPhone, boolean z13) {
            zdlpuopuiu.btonecajqb(contactName, "contactName");
            zdlpuopuiu.btonecajqb(contactPhone, "contactPhone");
            this.f64254iobyxmoadg = i13;
            this.f64257zoijcleaow = contactName;
            this.f64255ppxfxbqfkf = contactPhone;
            this.f64256wkgbmnqykc = z13;
            this.f64253eablkybsjg = lw0.iobyxmoadg.ContactItem;
        }

        public final boolean eablkybsjg() {
            return this.f64256wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f64254iobyxmoadg == iobyxmoadgVar.f64254iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f64257zoijcleaow, iobyxmoadgVar.f64257zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f64255ppxfxbqfkf, iobyxmoadgVar.f64255ppxfxbqfkf) && this.f64256wkgbmnqykc == iobyxmoadgVar.f64256wkgbmnqykc;
        }

        @Override // lw0.zoijcleaow
        public int getId() {
            return this.f64254iobyxmoadg;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f64254iobyxmoadg) * 31) + this.f64257zoijcleaow.hashCode()) * 31) + this.f64255ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f64256wkgbmnqykc);
        }

        @Override // lw0.zoijcleaow
        public lw0.iobyxmoadg iobyxmoadg() {
            return this.f64253eablkybsjg;
        }

        public final String ppxfxbqfkf() {
            return this.f64257zoijcleaow;
        }

        public String toString() {
            return "ContactInfoUIItem(contactId=" + this.f64254iobyxmoadg + ", contactName=" + this.f64257zoijcleaow + ", contactPhone=" + this.f64255ppxfxbqfkf + ", isChecked=" + this.f64256wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f64255ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return this.f64254iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: lw0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1327zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f64258iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lw0.iobyxmoadg f64259zoijcleaow;

        public C1327zoijcleaow(String letter) {
            zdlpuopuiu.btonecajqb(letter, "letter");
            this.f64258iobyxmoadg = letter;
            this.f64259zoijcleaow = lw0.iobyxmoadg.Splitter;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1327zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f64258iobyxmoadg, ((C1327zoijcleaow) obj).f64258iobyxmoadg);
        }

        @Override // lw0.zoijcleaow
        public int getId() {
            return this.f64258iobyxmoadg.hashCode();
        }

        public int hashCode() {
            return this.f64258iobyxmoadg.hashCode();
        }

        @Override // lw0.zoijcleaow
        public lw0.iobyxmoadg iobyxmoadg() {
            return this.f64259zoijcleaow;
        }

        public String toString() {
            return "ContactSplitLetterItem(letter=" + this.f64258iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f64258iobyxmoadg;
        }
    }

    int getId();

    lw0.iobyxmoadg iobyxmoadg();
}
