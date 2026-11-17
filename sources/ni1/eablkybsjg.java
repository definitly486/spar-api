package ni1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f70141iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -762318274;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f70142iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1661655008;
        }

        public String toString() {
            return "ShowErrorDialogUnlockPromoProduct";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f70143iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f70144ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f70145zoijcleaow;

        public wkgbmnqykc(String name, String description, String imageUrl) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            this.f70143iobyxmoadg = name;
            this.f70145zoijcleaow = description;
            this.f70144ppxfxbqfkf = imageUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f70143iobyxmoadg, wkgbmnqykcVar.f70143iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70145zoijcleaow, wkgbmnqykcVar.f70145zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70144ppxfxbqfkf, wkgbmnqykcVar.f70144ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f70143iobyxmoadg.hashCode() * 31) + this.f70145zoijcleaow.hashCode()) * 31) + this.f70144ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f70145zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f70143iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoCollectionItemsDetailDialog(name=" + this.f70143iobyxmoadg + ", description=" + this.f70145zoijcleaow + ", imageUrl=" + this.f70144ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f70144ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f70146iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f70146iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70146iobyxmoadg, ((zoijcleaow) obj).f70146iobyxmoadg);
        }

        public int hashCode() {
            return this.f70146iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f70146iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f70146iobyxmoadg + ")";
        }
    }
}
