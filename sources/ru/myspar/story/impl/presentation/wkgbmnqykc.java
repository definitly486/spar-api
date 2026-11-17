package ru.myspar.story.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104357iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1883291823;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104358iobyxmoadg;

        public zoijcleaow(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f104358iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104358iobyxmoadg, ((zoijcleaow) obj).f104358iobyxmoadg);
        }

        public int hashCode() {
            return this.f104358iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104358iobyxmoadg;
        }

        public String toString() {
            return "ShowError(throwable=" + this.f104358iobyxmoadg + ")";
        }
    }
}
