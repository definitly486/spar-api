package ru.myspar.address.impl.address_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83838iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f83838iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83838iobyxmoadg, ((iobyxmoadg) obj).f83838iobyxmoadg);
        }

        public int hashCode() {
            return this.f83838iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83838iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f83838iobyxmoadg + ")";
        }
    }
}
