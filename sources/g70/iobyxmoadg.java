package g70;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: g70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0821iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36555iobyxmoadg;

        public C0821iobyxmoadg(String screenKey) {
            zdlpuopuiu.btonecajqb(screenKey, "screenKey");
            this.f36555iobyxmoadg = screenKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0821iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36555iobyxmoadg, ((C0821iobyxmoadg) obj).f36555iobyxmoadg);
        }

        public int hashCode() {
            return this.f36555iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f36555iobyxmoadg;
        }

        public String toString() {
            return "ChangeScreen(screenKey=" + this.f36555iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f36556iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 511153897;
        }

        public String toString() {
            return "RemoveLast";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc f36557iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final g70.ppxfxbqfkf f36558zoijcleaow;

        public zoijcleaow(wkgbmnqykc screenKey, g70.ppxfxbqfkf dialogHolder) {
            zdlpuopuiu.btonecajqb(screenKey, "screenKey");
            zdlpuopuiu.btonecajqb(dialogHolder, "dialogHolder");
            this.f36557iobyxmoadg = screenKey;
            this.f36558zoijcleaow = dialogHolder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f36557iobyxmoadg, zoijcleaowVar.f36557iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36558zoijcleaow, zoijcleaowVar.f36558zoijcleaow);
        }

        public int hashCode() {
            return (this.f36557iobyxmoadg.hashCode() * 31) + this.f36558zoijcleaow.hashCode();
        }

        public final g70.ppxfxbqfkf iobyxmoadg() {
            return this.f36558zoijcleaow;
        }

        public String toString() {
            return "PutDialog(screenKey=" + this.f36557iobyxmoadg + ", dialogHolder=" + this.f36558zoijcleaow + ")";
        }

        public final wkgbmnqykc zoijcleaow() {
            return this.f36557iobyxmoadg;
        }
    }
}
