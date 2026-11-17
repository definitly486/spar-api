package ru.myspar.subscription.impl.detail.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104445iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f104445iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104445iobyxmoadg, ((iobyxmoadg) obj).f104445iobyxmoadg);
        }

        public int hashCode() {
            return this.f104445iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104445iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f104445iobyxmoadg + ")";
        }
    }
}
