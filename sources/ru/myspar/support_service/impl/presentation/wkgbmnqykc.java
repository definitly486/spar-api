package ru.myspar.support_service.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104504iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f104504iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104504iobyxmoadg, ((iobyxmoadg) obj).f104504iobyxmoadg);
        }

        public int hashCode() {
            return this.f104504iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104504iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f104504iobyxmoadg + ")";
        }
    }
}
