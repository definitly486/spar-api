package ru.myspar.proloyalty.legacy.presentation.screen.savedcards;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97298iobyxmoadg;

        public iobyxmoadg(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f97298iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97298iobyxmoadg, ((iobyxmoadg) obj).f97298iobyxmoadg);
        }

        public int hashCode() {
            return this.f97298iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97298iobyxmoadg;
        }

        public String toString() {
            return "ShowDeleteDialog(cardId=" + this.f97298iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97299iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97299iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97299iobyxmoadg, ((ppxfxbqfkf) obj).f97299iobyxmoadg);
        }

        public int hashCode() {
            return this.f97299iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97299iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97299iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f97300iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1841204299;
        }

        public String toString() {
            return "ShowDeleteSuccess";
        }
    }
}
