package ru.myspar.proloyalty.sbp_recurring.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f100378iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 212461486;
        }

        public String toString() {
            return "OnBtnAcceptClicked";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f100379iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1409926439;
        }

        public String toString() {
            return "OnUrlSbpRecurringClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.sbp_recurring.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2412zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100380iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2412zoijcleaow(String bankLaunchSchema) {
            super(null);
            zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
            this.f100380iobyxmoadg = bankLaunchSchema;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2412zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100380iobyxmoadg, ((C2412zoijcleaow) obj).f100380iobyxmoadg);
        }

        public int hashCode() {
            return this.f100380iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f100380iobyxmoadg;
        }

        public String toString() {
            return "OnSbpBankAppSelected(bankLaunchSchema=" + this.f100380iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
