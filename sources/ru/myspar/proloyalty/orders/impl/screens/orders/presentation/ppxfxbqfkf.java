package ru.myspar.proloyalty.orders.impl.screens.orders.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98653iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f98653iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98653iobyxmoadg, ((iobyxmoadg) obj).f98653iobyxmoadg);
        }

        public int hashCode() {
            return this.f98653iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98653iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderNumber=" + this.f98653iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f98654iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f98654iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f98654iobyxmoadg, ((zoijcleaow) obj).f98654iobyxmoadg);
        }

        public int hashCode() {
            return this.f98654iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f98654iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f98654iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
