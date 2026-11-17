package ru.myspar.orders.impl.screens.orders.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91001iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f91001iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91001iobyxmoadg, ((iobyxmoadg) obj).f91001iobyxmoadg);
        }

        public int hashCode() {
            return this.f91001iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91001iobyxmoadg;
        }

        public String toString() {
            return "CopyOrderNumber(orderNumber=" + this.f91001iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91002iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91002iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91002iobyxmoadg, ((zoijcleaow) obj).f91002iobyxmoadg);
        }

        public int hashCode() {
            return this.f91002iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91002iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f91002iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
