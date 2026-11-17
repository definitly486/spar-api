package ru.myspar.sbp_recurring.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f103090iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2029134927;
        }

        public String toString() {
            return "OnBtnAcceptClicked";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f103091iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1197042410;
        }

        public String toString() {
            return "OnUrlSbpRecurringClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.sbp_recurring.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2494zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103092iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2494zoijcleaow(String bankLaunchSchema) {
            super(null);
            zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
            this.f103092iobyxmoadg = bankLaunchSchema;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2494zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f103092iobyxmoadg, ((C2494zoijcleaow) obj).f103092iobyxmoadg);
        }

        public int hashCode() {
            return this.f103092iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f103092iobyxmoadg;
        }

        public String toString() {
            return "OnSbpBankAppSelected(bankLaunchSchema=" + this.f103092iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
