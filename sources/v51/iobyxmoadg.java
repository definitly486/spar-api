package v51;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: v51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2880iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116103iobyxmoadg;

        public C2880iobyxmoadg(String screenKey) {
            zdlpuopuiu.btonecajqb(screenKey, "screenKey");
            this.f116103iobyxmoadg = screenKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2880iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116103iobyxmoadg, ((C2880iobyxmoadg) obj).f116103iobyxmoadg);
        }

        public int hashCode() {
            return this.f116103iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116103iobyxmoadg;
        }

        public String toString() {
            return "ChangeScreen(screenKey=" + this.f116103iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f116104iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1165275686;
        }

        public String toString() {
            return "RemoveLast";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc f116105iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final v51.ppxfxbqfkf f116106zoijcleaow;

        public zoijcleaow(wkgbmnqykc screenKey, v51.ppxfxbqfkf dialogHolder) {
            zdlpuopuiu.btonecajqb(screenKey, "screenKey");
            zdlpuopuiu.btonecajqb(dialogHolder, "dialogHolder");
            this.f116105iobyxmoadg = screenKey;
            this.f116106zoijcleaow = dialogHolder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f116105iobyxmoadg, zoijcleaowVar.f116105iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116106zoijcleaow, zoijcleaowVar.f116106zoijcleaow);
        }

        public int hashCode() {
            return (this.f116105iobyxmoadg.hashCode() * 31) + this.f116106zoijcleaow.hashCode();
        }

        public final v51.ppxfxbqfkf iobyxmoadg() {
            return this.f116106zoijcleaow;
        }

        public String toString() {
            return "PutDialog(screenKey=" + this.f116105iobyxmoadg + ", dialogHolder=" + this.f116106zoijcleaow + ")";
        }

        public final wkgbmnqykc zoijcleaow() {
            return this.f116105iobyxmoadg;
        }
    }
}
