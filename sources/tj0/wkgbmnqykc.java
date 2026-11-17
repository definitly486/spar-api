package tj0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f110738iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f110738iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f110738iobyxmoadg == ((iobyxmoadg) obj).f110738iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f110738iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f110738iobyxmoadg;
        }

        public String toString() {
            return "Back(isSuccess=" + this.f110738iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f110739iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f110739iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f110739iobyxmoadg, ((ppxfxbqfkf) obj).f110739iobyxmoadg);
        }

        public int hashCode() {
            return this.f110739iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f110739iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f110739iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f110740iobyxmoadg;

        public zoijcleaow(String id2) {
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f110740iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f110740iobyxmoadg, ((zoijcleaow) obj).f110740iobyxmoadg);
        }

        public int hashCode() {
            return this.f110740iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f110740iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificOrder(id=" + this.f110740iobyxmoadg + ")";
        }
    }
}
