package g61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36522iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36523zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String str, String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f36522iobyxmoadg = str;
            this.f36523zoijcleaow = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f36522iobyxmoadg, iobyxmoadgVar.f36522iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36523zoijcleaow, iobyxmoadgVar.f36523zoijcleaow);
        }

        public int hashCode() {
            String str = this.f36522iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f36523zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f36522iobyxmoadg;
        }

        public String toString() {
            return "OnActivateClicked(itemId=" + this.f36522iobyxmoadg + ", qrCode=" + this.f36523zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f36523zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36524iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f36525ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f36526wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36527zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String image, String name, String description, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(image, "image");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(description, "description");
            this.f36524iobyxmoadg = image;
            this.f36527zoijcleaow = name;
            this.f36525ppxfxbqfkf = description;
            this.f36526wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f36524iobyxmoadg, ppxfxbqfkfVar.f36524iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36527zoijcleaow, ppxfxbqfkfVar.f36527zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f36525ppxfxbqfkf, ppxfxbqfkfVar.f36525ppxfxbqfkf) && this.f36526wkgbmnqykc == ppxfxbqfkfVar.f36526wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f36524iobyxmoadg.hashCode() * 31) + this.f36527zoijcleaow.hashCode()) * 31) + this.f36525ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f36526wkgbmnqykc);
        }

        public final String iobyxmoadg() {
            return this.f36525ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f36527zoijcleaow;
        }

        public String toString() {
            return "OnPromoItemClicked(image=" + this.f36524iobyxmoadg + ", name=" + this.f36527zoijcleaow + ", description=" + this.f36525ppxfxbqfkf + ", isOpen=" + this.f36526wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f36526wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f36524iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: g61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0820wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0820wkgbmnqykc f36528iobyxmoadg = new C0820wkgbmnqykc();

        private C0820wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f36529iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
