package sn;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f107742iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 49379261;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107743iobyxmoadg;

        public ppxfxbqfkf(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f107743iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f107743iobyxmoadg, ((ppxfxbqfkf) obj).f107743iobyxmoadg);
        }

        public int hashCode() {
            return this.f107743iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107743iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shopId=" + this.f107743iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f107744iobyxmoadg;

        public zoijcleaow(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f107744iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f107744iobyxmoadg, ((zoijcleaow) obj).f107744iobyxmoadg);
        }

        public int hashCode() {
            return this.f107744iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f107744iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f107744iobyxmoadg + ")";
        }
    }
}
