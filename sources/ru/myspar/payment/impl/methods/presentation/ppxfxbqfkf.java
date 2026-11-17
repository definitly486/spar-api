package ru.myspar.payment.impl.methods.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91538iobyxmoadg;

        public iobyxmoadg(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f91538iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91538iobyxmoadg, ((iobyxmoadg) obj).f91538iobyxmoadg);
        }

        public int hashCode() {
            return this.f91538iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91538iobyxmoadg;
        }

        public String toString() {
            return "OnError(throwable=" + this.f91538iobyxmoadg + ")";
        }
    }
}
