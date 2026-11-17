package ru.myspar.delivery.impl.interval.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f87659iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1356684885;
        }

        public String toString() {
            return "OnCloseClick";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f87660iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f87661zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String date, String intervalValue) {
            super(null);
            zdlpuopuiu.btonecajqb(date, "date");
            zdlpuopuiu.btonecajqb(intervalValue, "intervalValue");
            this.f87660iobyxmoadg = date;
            this.f87661zoijcleaow = intervalValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f87660iobyxmoadg, ppxfxbqfkfVar.f87660iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87661zoijcleaow, ppxfxbqfkfVar.f87661zoijcleaow);
        }

        public int hashCode() {
            return (this.f87660iobyxmoadg.hashCode() * 31) + this.f87661zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f87660iobyxmoadg;
        }

        public String toString() {
            return "OnIntervalClicked(date=" + this.f87660iobyxmoadg + ", intervalValue=" + this.f87661zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f87661zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.delivery.impl.interval.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2000zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2000zoijcleaow f87662iobyxmoadg = new C2000zoijcleaow();

        private C2000zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2000zoijcleaow);
        }

        public int hashCode() {
            return 1935801619;
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
