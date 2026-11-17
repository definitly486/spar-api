package ru.myspar.proloyalty.address.impl.shop_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92046iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2069028472;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.shop_search.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2142ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92047iobyxmoadg;

        public C2142ppxfxbqfkf(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f92047iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2142ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f92047iobyxmoadg, ((C2142ppxfxbqfkf) obj).f92047iobyxmoadg);
        }

        public int hashCode() {
            return this.f92047iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92047iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shopId=" + this.f92047iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92048iobyxmoadg;

        public zoijcleaow(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f92048iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92048iobyxmoadg, ((zoijcleaow) obj).f92048iobyxmoadg);
        }

        public int hashCode() {
            return this.f92048iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92048iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f92048iobyxmoadg + ")";
        }
    }
}
