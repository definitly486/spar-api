package ru.myspar.proloyalty.payment.impl.methods.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99188iobyxmoadg;

        public iobyxmoadg(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f99188iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99188iobyxmoadg, ((iobyxmoadg) obj).f99188iobyxmoadg);
        }

        public int hashCode() {
            return this.f99188iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99188iobyxmoadg;
        }

        public String toString() {
            return "OnError(throwable=" + this.f99188iobyxmoadg + ")";
        }
    }
}
