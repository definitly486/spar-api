package ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96488iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f96488iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96488iobyxmoadg, ((iobyxmoadg) obj).f96488iobyxmoadg);
        }

        public int hashCode() {
            return this.f96488iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96488iobyxmoadg;
        }

        public String toString() {
            return "OnArrowClicked(orderId=" + this.f96488iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f96489iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f96490iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f96490iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f96490iobyxmoadg == ((wkgbmnqykc) obj).f96490iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f96490iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f96490iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f96490iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2280zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2280zoijcleaow f96491iobyxmoadg = new C2280zoijcleaow();

        private C2280zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
