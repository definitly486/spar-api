package ru.myspar.address.impl.shop_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84024iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f84024iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84024iobyxmoadg, ((iobyxmoadg) obj).f84024iobyxmoadg);
        }

        public int hashCode() {
            return this.f84024iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84024iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f84024iobyxmoadg + ")";
        }
    }
}
