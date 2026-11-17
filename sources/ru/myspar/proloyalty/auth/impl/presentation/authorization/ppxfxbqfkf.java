package ru.myspar.proloyalty.auth.impl.presentation.authorization;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92553iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 744318216;
        }

        public String toString() {
            return "OnCloseClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.authorization.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2155ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92554iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2155ppxfxbqfkf(tzroggbefp phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f92554iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2155ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f92554iobyxmoadg, ((C2155ppxfxbqfkf) obj).f92554iobyxmoadg);
        }

        public int hashCode() {
            return this.f92554iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92554iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneNumberChanged(phoneNumber=" + this.f92554iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92555iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -699277431;
        }

        public String toString() {
            return "OnContinueClick";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
