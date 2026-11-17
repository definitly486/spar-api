package ru.myspar.proloyalty.delivery.impl.interval.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f95441iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 418708136;
        }

        public String toString() {
            return "OnCloseClick";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f95442iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f95443zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String date, String intervalValue) {
            super(null);
            zdlpuopuiu.btonecajqb(date, "date");
            zdlpuopuiu.btonecajqb(intervalValue, "intervalValue");
            this.f95442iobyxmoadg = date;
            this.f95443zoijcleaow = intervalValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f95442iobyxmoadg, ppxfxbqfkfVar.f95442iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95443zoijcleaow, ppxfxbqfkfVar.f95443zoijcleaow);
        }

        public int hashCode() {
            return (this.f95442iobyxmoadg.hashCode() * 31) + this.f95443zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f95442iobyxmoadg;
        }

        public String toString() {
            return "OnIntervalClicked(date=" + this.f95442iobyxmoadg + ", intervalValue=" + this.f95443zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f95443zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.delivery.impl.interval.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2237zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2237zoijcleaow f95444iobyxmoadg = new C2237zoijcleaow();

        private C2237zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2237zoijcleaow);
        }

        public int hashCode() {
            return -1111944202;
        }

        public String toString() {
            return "OnContinueButtonClicked";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
