package ru.myspar.options.impl.options.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f90942iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90943iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f90944zoijcleaow;

        public iobyxmoadg(String str, boolean z13) {
            super(null);
            this.f90943iobyxmoadg = str;
            this.f90944zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f90943iobyxmoadg, iobyxmoadgVar.f90943iobyxmoadg) && this.f90944zoijcleaow == iobyxmoadgVar.f90944zoijcleaow;
        }

        public int hashCode() {
            String str = this.f90943iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f90944zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f90943iobyxmoadg;
        }

        public String toString() {
            return "ShowAutoRenewalResultMessage(subscriptionName=" + this.f90943iobyxmoadg + ", isChecked=" + this.f90944zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f90944zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f90945iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f90946iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f90946iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f90946iobyxmoadg, ((wkgbmnqykc) obj).f90946iobyxmoadg);
        }

        public int hashCode() {
            return this.f90946iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f90946iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f90946iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.options.impl.options.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2110zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90947iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2110zoijcleaow(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f90947iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2110zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f90947iobyxmoadg, ((C2110zoijcleaow) obj).f90947iobyxmoadg);
        }

        public int hashCode() {
            return this.f90947iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90947iobyxmoadg;
        }

        public String toString() {
            return "ShowCanDeleteError(message=" + this.f90947iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
