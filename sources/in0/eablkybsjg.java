package in0;

import java.util.Date;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: in0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1042eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Date f45000iobyxmoadg;

        public C1042eablkybsjg(Date date) {
            this.f45000iobyxmoadg = date;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1042eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f45000iobyxmoadg, ((C1042eablkybsjg) obj).f45000iobyxmoadg);
        }

        public int hashCode() {
            Date date = this.f45000iobyxmoadg;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public final Date iobyxmoadg() {
            return this.f45000iobyxmoadg;
        }

        public String toString() {
            return "ShowDatePickerDialog(selectedDate=" + this.f45000iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f45001iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1301992330;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f45002iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 2138350141;
        }

        public String toString() {
            return "NavigateToPrivatePolicy";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f45003iobyxmoadg;

        public wkgbmnqykc(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f45003iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f45003iobyxmoadg, ((wkgbmnqykc) obj).f45003iobyxmoadg);
        }

        public int hashCode() {
            return this.f45003iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f45003iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f45003iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f45004iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1823804125;
        }

        public String toString() {
            return "NavigateToMainScreen";
        }
    }
}
