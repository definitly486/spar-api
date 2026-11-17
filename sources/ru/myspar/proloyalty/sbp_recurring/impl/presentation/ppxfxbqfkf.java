package ru.myspar.proloyalty.sbp_recurring.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f100375iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1021107180;
        }

        public String toString() {
            return "DismissDialog";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final an1.iobyxmoadg f100376iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(an1.iobyxmoadg result) {
            super(null);
            zdlpuopuiu.btonecajqb(result, "result");
            this.f100376iobyxmoadg = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100376iobyxmoadg, ((zoijcleaow) obj).f100376iobyxmoadg);
        }

        public int hashCode() {
            return this.f100376iobyxmoadg.hashCode();
        }

        public final an1.iobyxmoadg iobyxmoadg() {
            return this.f100376iobyxmoadg;
        }

        public String toString() {
            return "OnSbpBankAppSelected(result=" + this.f100376iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
