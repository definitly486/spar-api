package ru.myspar.address.impl.shop_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84021iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2139831797;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.address.impl.shop_search.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1898ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84022iobyxmoadg;

        public C1898ppxfxbqfkf(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f84022iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1898ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f84022iobyxmoadg, ((C1898ppxfxbqfkf) obj).f84022iobyxmoadg);
        }

        public int hashCode() {
            return this.f84022iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84022iobyxmoadg;
        }

        public String toString() {
            return "OnShopClicked(shopId=" + this.f84022iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84023iobyxmoadg;

        public zoijcleaow(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f84023iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84023iobyxmoadg, ((zoijcleaow) obj).f84023iobyxmoadg);
        }

        public int hashCode() {
            return this.f84023iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84023iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f84023iobyxmoadg + ")";
        }
    }
}
