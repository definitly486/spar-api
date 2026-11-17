package ru.myspar.address.impl.address_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f83844iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1482393443;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83845iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83845iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f83845iobyxmoadg, ((ppxfxbqfkf) obj).f83845iobyxmoadg);
        }

        public int hashCode() {
            return this.f83845iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83845iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f83845iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.address.impl.address_search.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1892zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83846iobyxmoadg;

        public C1892zoijcleaow(String fullAddress) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            this.f83846iobyxmoadg = fullAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1892zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83846iobyxmoadg, ((C1892zoijcleaow) obj).f83846iobyxmoadg);
        }

        public int hashCode() {
            return this.f83846iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83846iobyxmoadg;
        }

        public String toString() {
            return "OnAddressClicked(fullAddress=" + this.f83846iobyxmoadg + ")";
        }
    }
}
