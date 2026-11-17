package v70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116297iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f116298zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String str, String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f116297iobyxmoadg = str;
            this.f116298zoijcleaow = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f116297iobyxmoadg, iobyxmoadgVar.f116297iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116298zoijcleaow, iobyxmoadgVar.f116298zoijcleaow);
        }

        public int hashCode() {
            String str = this.f116297iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f116298zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116297iobyxmoadg;
        }

        public String toString() {
            return "OnActivateClicked(itemId=" + this.f116297iobyxmoadg + ", qrCode=" + this.f116298zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f116298zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116299iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f116300ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f116301wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f116302zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String image, String name, String description, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(image, "image");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(description, "description");
            this.f116299iobyxmoadg = image;
            this.f116302zoijcleaow = name;
            this.f116300ppxfxbqfkf = description;
            this.f116301wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f116299iobyxmoadg, ppxfxbqfkfVar.f116299iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116302zoijcleaow, ppxfxbqfkfVar.f116302zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116300ppxfxbqfkf, ppxfxbqfkfVar.f116300ppxfxbqfkf) && this.f116301wkgbmnqykc == ppxfxbqfkfVar.f116301wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f116299iobyxmoadg.hashCode() * 31) + this.f116302zoijcleaow.hashCode()) * 31) + this.f116300ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f116301wkgbmnqykc);
        }

        public final String iobyxmoadg() {
            return this.f116300ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f116302zoijcleaow;
        }

        public String toString() {
            return "OnPromoItemClicked(image=" + this.f116299iobyxmoadg + ", name=" + this.f116302zoijcleaow + ", description=" + this.f116300ppxfxbqfkf + ", isOpen=" + this.f116301wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f116301wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f116299iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: v70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2894wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2894wkgbmnqykc f116303iobyxmoadg = new C2894wkgbmnqykc();

        private C2894wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f116304iobyxmoadg = new zoijcleaow();

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
