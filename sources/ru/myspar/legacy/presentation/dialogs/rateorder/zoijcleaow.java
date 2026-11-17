package ru.myspar.legacy.presentation.dialogs.rateorder;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88704iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f88704iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88704iobyxmoadg, ((iobyxmoadg) obj).f88704iobyxmoadg);
        }

        public int hashCode() {
            return this.f88704iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88704iobyxmoadg;
        }

        public String toString() {
            return "OnArrowClicked(orderId=" + this.f88704iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88705iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f88706iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f88706iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f88706iobyxmoadg == ((wkgbmnqykc) obj).f88706iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f88706iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f88706iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f88706iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.rateorder.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2035zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2035zoijcleaow f88707iobyxmoadg = new C2035zoijcleaow();

        private C2035zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
