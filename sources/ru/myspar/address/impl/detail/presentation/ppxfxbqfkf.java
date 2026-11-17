package ru.myspar.address.impl.detail.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83921iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f83921iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83921iobyxmoadg, ((iobyxmoadg) obj).f83921iobyxmoadg);
        }

        public int hashCode() {
            return this.f83921iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83921iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f83921iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f83922iobyxmoadg;

        public zoijcleaow(int i13) {
            this.f83922iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f83922iobyxmoadg == ((zoijcleaow) obj).f83922iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f83922iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f83922iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningSnackBar(messageRes=" + this.f83922iobyxmoadg + ")";
        }
    }
}
