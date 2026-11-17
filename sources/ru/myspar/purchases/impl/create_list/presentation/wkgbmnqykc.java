package ru.myspar.purchases.impl.create_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102281iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -874407092;
        }

        public String toString() {
            return "EmptyNameMessage";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102282iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102282iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102282iobyxmoadg, ((zoijcleaow) obj).f102282iobyxmoadg);
        }

        public int hashCode() {
            return this.f102282iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102282iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102282iobyxmoadg + ")";
        }
    }
}
