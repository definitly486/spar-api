package ug1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f113556iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f113556iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f113556iobyxmoadg == ((iobyxmoadg) obj).f113556iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f113556iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f113556iobyxmoadg;
        }

        public String toString() {
            return "Back(isSuccess=" + this.f113556iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f113557iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f113557iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113557iobyxmoadg, ((ppxfxbqfkf) obj).f113557iobyxmoadg);
        }

        public int hashCode() {
            return this.f113557iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f113557iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f113557iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f113558iobyxmoadg;

        public zoijcleaow(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f113558iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113558iobyxmoadg, ((zoijcleaow) obj).f113558iobyxmoadg);
        }

        public int hashCode() {
            return this.f113558iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f113558iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificOrder(id=" + this.f113558iobyxmoadg + ")";
        }
    }
}
