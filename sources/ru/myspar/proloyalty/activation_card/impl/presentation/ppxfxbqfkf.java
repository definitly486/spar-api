package ru.myspar.proloyalty.activation_card.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91799iobyxmoadg;

        public iobyxmoadg(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f91799iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91799iobyxmoadg, ((iobyxmoadg) obj).f91799iobyxmoadg);
        }

        public int hashCode() {
            return this.f91799iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91799iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackbar(throwable=" + this.f91799iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91800iobyxmoadg;

        public zoijcleaow(String number) {
            zdlpuopuiu.btonecajqb(number, "number");
            this.f91800iobyxmoadg = number;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91800iobyxmoadg, ((zoijcleaow) obj).f91800iobyxmoadg);
        }

        public int hashCode() {
            return this.f91800iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91800iobyxmoadg;
        }

        public String toString() {
            return "ShowOnSuccessActivationCardSnackbar(number=" + this.f91800iobyxmoadg + ")";
        }
    }
}
