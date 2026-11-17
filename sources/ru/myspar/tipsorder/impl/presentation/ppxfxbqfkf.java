package ru.myspar.tipsorder.impl.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104604iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f104604iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104604iobyxmoadg, ((iobyxmoadg) obj).f104604iobyxmoadg);
        }

        public int hashCode() {
            return this.f104604iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104604iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f104604iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f104605iobyxmoadg;

        public zoijcleaow(List banks) {
            zdlpuopuiu.btonecajqb(banks, "banks");
            this.f104605iobyxmoadg = banks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104605iobyxmoadg, ((zoijcleaow) obj).f104605iobyxmoadg);
        }

        public int hashCode() {
            return this.f104605iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f104605iobyxmoadg;
        }

        public String toString() {
            return "ShowSbpBanks(banks=" + this.f104605iobyxmoadg + ")";
        }
    }
}
