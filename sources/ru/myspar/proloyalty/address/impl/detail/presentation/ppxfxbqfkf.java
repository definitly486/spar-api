package ru.myspar.proloyalty.address.impl.detail.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91946iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91946iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91946iobyxmoadg, ((iobyxmoadg) obj).f91946iobyxmoadg);
        }

        public int hashCode() {
            return this.f91946iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91946iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f91946iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91947iobyxmoadg;

        public zoijcleaow(int i13) {
            this.f91947iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f91947iobyxmoadg == ((zoijcleaow) obj).f91947iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91947iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f91947iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningSnackBar(messageRes=" + this.f91947iobyxmoadg + ")";
        }
    }
}
