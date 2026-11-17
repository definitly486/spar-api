package ox;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final ox.iobyxmoadg f75015eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f75016iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f75017ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f75018wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f75019zoijcleaow;

        public iobyxmoadg(int i13, String contactName, String contactPhone, boolean z13) {
            zdlpuopuiu.btonecajqb(contactName, "contactName");
            zdlpuopuiu.btonecajqb(contactPhone, "contactPhone");
            this.f75016iobyxmoadg = i13;
            this.f75019zoijcleaow = contactName;
            this.f75017ppxfxbqfkf = contactPhone;
            this.f75018wkgbmnqykc = z13;
            this.f75015eablkybsjg = ox.iobyxmoadg.ContactItem;
        }

        public final boolean eablkybsjg() {
            return this.f75018wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f75016iobyxmoadg == iobyxmoadgVar.f75016iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f75019zoijcleaow, iobyxmoadgVar.f75019zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75017ppxfxbqfkf, iobyxmoadgVar.f75017ppxfxbqfkf) && this.f75018wkgbmnqykc == iobyxmoadgVar.f75018wkgbmnqykc;
        }

        @Override // ox.zoijcleaow
        public int getId() {
            return this.f75016iobyxmoadg;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f75016iobyxmoadg) * 31) + this.f75019zoijcleaow.hashCode()) * 31) + this.f75017ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f75018wkgbmnqykc);
        }

        @Override // ox.zoijcleaow
        public ox.iobyxmoadg iobyxmoadg() {
            return this.f75015eablkybsjg;
        }

        public final String ppxfxbqfkf() {
            return this.f75019zoijcleaow;
        }

        public String toString() {
            return "ContactInfoUIItem(contactId=" + this.f75016iobyxmoadg + ", contactName=" + this.f75019zoijcleaow + ", contactPhone=" + this.f75017ppxfxbqfkf + ", isChecked=" + this.f75018wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f75017ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return this.f75016iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ox.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1633zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75020iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ox.iobyxmoadg f75021zoijcleaow;

        public C1633zoijcleaow(String letter) {
            zdlpuopuiu.btonecajqb(letter, "letter");
            this.f75020iobyxmoadg = letter;
            this.f75021zoijcleaow = ox.iobyxmoadg.Splitter;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1633zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75020iobyxmoadg, ((C1633zoijcleaow) obj).f75020iobyxmoadg);
        }

        @Override // ox.zoijcleaow
        public int getId() {
            return this.f75020iobyxmoadg.hashCode();
        }

        public int hashCode() {
            return this.f75020iobyxmoadg.hashCode();
        }

        @Override // ox.zoijcleaow
        public ox.iobyxmoadg iobyxmoadg() {
            return this.f75021zoijcleaow;
        }

        public String toString() {
            return "ContactSplitLetterItem(letter=" + this.f75020iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f75020iobyxmoadg;
        }
    }

    int getId();

    ox.iobyxmoadg iobyxmoadg();
}
