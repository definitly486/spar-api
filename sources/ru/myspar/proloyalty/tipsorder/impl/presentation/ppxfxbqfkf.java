package ru.myspar.proloyalty.tipsorder.impl.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101967iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f101967iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101967iobyxmoadg, ((iobyxmoadg) obj).f101967iobyxmoadg);
        }

        public int hashCode() {
            return this.f101967iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101967iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f101967iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f101968iobyxmoadg;

        public zoijcleaow(List banks) {
            zdlpuopuiu.btonecajqb(banks, "banks");
            this.f101968iobyxmoadg = banks;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101968iobyxmoadg, ((zoijcleaow) obj).f101968iobyxmoadg);
        }

        public int hashCode() {
            return this.f101968iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f101968iobyxmoadg;
        }

        public String toString() {
            return "ShowSbpBanks(banks=" + this.f101968iobyxmoadg + ")";
        }
    }
}
