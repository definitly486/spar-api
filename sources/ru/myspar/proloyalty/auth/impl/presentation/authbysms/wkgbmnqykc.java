package ru.myspar.proloyalty.auth.impl.presentation.authbysms;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92531iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92531iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92531iobyxmoadg, ((iobyxmoadg) obj).f92531iobyxmoadg);
        }

        public int hashCode() {
            return this.f92531iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92531iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f92531iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92532iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1553453966;
        }

        public String toString() {
            return "StartSmsRetriever";
        }
    }
}
