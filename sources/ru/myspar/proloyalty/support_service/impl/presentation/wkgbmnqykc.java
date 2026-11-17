package ru.myspar.proloyalty.support_service.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101867iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f101867iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101867iobyxmoadg, ((iobyxmoadg) obj).f101867iobyxmoadg);
        }

        public int hashCode() {
            return this.f101867iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101867iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f101867iobyxmoadg + ")";
        }
    }
}
