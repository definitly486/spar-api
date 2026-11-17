package ru.myspar.proloyalty.address.impl.address_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91869iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -431716774;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f91870iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f91870iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f91870iobyxmoadg, ((ppxfxbqfkf) obj).f91870iobyxmoadg);
        }

        public int hashCode() {
            return this.f91870iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f91870iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f91870iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.address_search.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2136zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91871iobyxmoadg;

        public C2136zoijcleaow(String fullAddress) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            this.f91871iobyxmoadg = fullAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2136zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91871iobyxmoadg, ((C2136zoijcleaow) obj).f91871iobyxmoadg);
        }

        public int hashCode() {
            return this.f91871iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91871iobyxmoadg;
        }

        public String toString() {
            return "OnAddressClicked(fullAddress=" + this.f91871iobyxmoadg + ")";
        }
    }
}
