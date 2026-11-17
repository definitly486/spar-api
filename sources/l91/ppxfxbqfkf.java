package l91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61965iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f61966ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f61967zoijcleaow;

        public iobyxmoadg(String label, String value, boolean z13) {
            zdlpuopuiu.btonecajqb(label, "label");
            zdlpuopuiu.btonecajqb(value, "value");
            this.f61965iobyxmoadg = label;
            this.f61967zoijcleaow = value;
            this.f61966ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f61965iobyxmoadg, iobyxmoadgVar.f61965iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61967zoijcleaow, iobyxmoadgVar.f61967zoijcleaow) && this.f61966ppxfxbqfkf == iobyxmoadgVar.f61966ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f61965iobyxmoadg.hashCode() * 31) + this.f61967zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f61966ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f61965iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f61966ppxfxbqfkf;
        }

        public String toString() {
            return "Declaration(label=" + this.f61965iobyxmoadg + ", value=" + this.f61967zoijcleaow + ", isClickable=" + this.f61966ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f61967zoijcleaow;
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61968iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f61969zoijcleaow;

        public zoijcleaow(String label, String value) {
            zdlpuopuiu.btonecajqb(label, "label");
            zdlpuopuiu.btonecajqb(value, "value");
            this.f61968iobyxmoadg = label;
            this.f61969zoijcleaow = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f61968iobyxmoadg, zoijcleaowVar.f61968iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61969zoijcleaow, zoijcleaowVar.f61969zoijcleaow);
        }

        public int hashCode() {
            return (this.f61968iobyxmoadg.hashCode() * 31) + this.f61969zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f61968iobyxmoadg;
        }

        public String toString() {
            return "Simple(label=" + this.f61968iobyxmoadg + ", value=" + this.f61969zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f61969zoijcleaow;
        }
    }
}
