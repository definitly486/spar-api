package ru.myspar.purchases.impl.history.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102322iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102322iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102322iobyxmoadg, ((iobyxmoadg) obj).f102322iobyxmoadg);
        }

        public int hashCode() {
            return this.f102322iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102322iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102322iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2468ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2468ppxfxbqfkf f102323iobyxmoadg = new C2468ppxfxbqfkf();

        private C2468ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2468ppxfxbqfkf);
        }

        public int hashCode() {
            return 1599704142;
        }

        public String toString() {
            return "ShowWarningInfoSnackbar";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f102324iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 861812746;
        }

        public String toString() {
            return "ShowRatePurchaseDialog";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
