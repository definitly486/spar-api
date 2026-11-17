package ru.myspar.proloyalty.auth.impl.presentation.registration;

import java.util.Date;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Date f92666iobyxmoadg;

        public iobyxmoadg(Date date) {
            this.f92666iobyxmoadg = date;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92666iobyxmoadg, ((iobyxmoadg) obj).f92666iobyxmoadg);
        }

        public int hashCode() {
            Date date = this.f92666iobyxmoadg;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public final Date iobyxmoadg() {
            return this.f92666iobyxmoadg;
        }

        public String toString() {
            return "ShowDatePickerDialog(selectedDate=" + this.f92666iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {
        public abstract CharSequence iobyxmoadg();
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92667iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92667iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92667iobyxmoadg, ((zoijcleaow) obj).f92667iobyxmoadg);
        }

        public int hashCode() {
            return this.f92667iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92667iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f92667iobyxmoadg + ")";
        }
    }
}
