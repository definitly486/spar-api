package ru.myspar.auth.impl.presentation.authbysms;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84535iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f84535iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84535iobyxmoadg, ((iobyxmoadg) obj).f84535iobyxmoadg);
        }

        public int hashCode() {
            return this.f84535iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84535iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f84535iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f84536iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -641449109;
        }

        public String toString() {
            return "StartSmsRetriever";
        }
    }
}
