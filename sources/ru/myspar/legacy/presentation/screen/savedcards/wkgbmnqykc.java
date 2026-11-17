package ru.myspar.legacy.presentation.screen.savedcards;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89619iobyxmoadg;

        public iobyxmoadg(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f89619iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89619iobyxmoadg, ((iobyxmoadg) obj).f89619iobyxmoadg);
        }

        public int hashCode() {
            return this.f89619iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89619iobyxmoadg;
        }

        public String toString() {
            return "ShowDeleteDialog(cardId=" + this.f89619iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89620iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89620iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89620iobyxmoadg, ((ppxfxbqfkf) obj).f89620iobyxmoadg);
        }

        public int hashCode() {
            return this.f89620iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89620iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89620iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f89621iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -665001368;
        }

        public String toString() {
            return "ShowDeleteSuccess";
        }
    }
}
