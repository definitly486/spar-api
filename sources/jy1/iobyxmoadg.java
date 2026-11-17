package jy1;

import hy1.istkbnxepw;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f52517zdlpuopuiu;

    /* JADX INFO: renamed from: jy1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1124iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f52518yggfygwlhe;

        public C1124iobyxmoadg(int i13) {
            super(String.valueOf(i13), null);
            this.f52518yggfygwlhe = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1124iobyxmoadg) && this.f52518yggfygwlhe == ((C1124iobyxmoadg) obj).f52518yggfygwlhe;
        }

        public int hashCode() {
            return Integer.hashCode(this.f52518yggfygwlhe);
        }

        public final int iobyxmoadg() {
            return this.f52518yggfygwlhe;
        }

        public String toString() {
            return "EmptyListMessage(messageRes=" + this.f52518yggfygwlhe + ")";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final istkbnxepw f52519jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final jy1.ppxfxbqfkf f52520yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(jy1.ppxfxbqfkf product, istkbnxepw mode) {
            super(product.getId(), null);
            zdlpuopuiu.btonecajqb(product, "product");
            zdlpuopuiu.btonecajqb(mode, "mode");
            this.f52520yggfygwlhe = product;
            this.f52519jyumaefscl = mode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f52520yggfygwlhe, ppxfxbqfkfVar.f52520yggfygwlhe) && this.f52519jyumaefscl == ppxfxbqfkfVar.f52519jyumaefscl;
        }

        public int hashCode() {
            return (this.f52520yggfygwlhe.hashCode() * 31) + this.f52519jyumaefscl.hashCode();
        }

        public final istkbnxepw iobyxmoadg() {
            return this.f52519jyumaefscl;
        }

        public String toString() {
            return "Product(product=" + this.f52520yggfygwlhe + ", mode=" + this.f52519jyumaefscl + ")";
        }

        public final jy1.ppxfxbqfkf wkgbmnqykc() {
            return this.f52520yggfygwlhe;
        }
    }

    public static final class wkgbmnqykc extends iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final boolean f52521iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final istkbnxepw f52522jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f52523yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(int i13, istkbnxepw mode, boolean z13) {
            super(String.valueOf(i13), null);
            zdlpuopuiu.btonecajqb(mode, "mode");
            this.f52523yggfygwlhe = i13;
            this.f52522jyumaefscl = mode;
            this.f52521iwizpuwonk = z13;
        }

        public final boolean eablkybsjg() {
            return this.f52521iwizpuwonk;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f52523yggfygwlhe == wkgbmnqykcVar.f52523yggfygwlhe && this.f52522jyumaefscl == wkgbmnqykcVar.f52522jyumaefscl && this.f52521iwizpuwonk == wkgbmnqykcVar.f52521iwizpuwonk;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f52523yggfygwlhe) * 31) + this.f52522jyumaefscl.hashCode()) * 31) + Boolean.hashCode(this.f52521iwizpuwonk);
        }

        public final istkbnxepw iobyxmoadg() {
            return this.f52522jyumaefscl;
        }

        public String toString() {
            return "SectionTitle(titleRes=" + this.f52523yggfygwlhe + ", mode=" + this.f52522jyumaefscl + ", isEmptySection=" + this.f52521iwizpuwonk + ")";
        }

        public final int wkgbmnqykc() {
            return this.f52523yggfygwlhe;
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f52524yggfygwlhe;

        public zoijcleaow(int i13) {
            super(String.valueOf(i13), null);
            this.f52524yggfygwlhe = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f52524yggfygwlhe == ((zoijcleaow) obj).f52524yggfygwlhe;
        }

        public int hashCode() {
            return Integer.hashCode(this.f52524yggfygwlhe);
        }

        public final int iobyxmoadg() {
            return this.f52524yggfygwlhe;
        }

        public String toString() {
            return "Hint(hintRes=" + this.f52524yggfygwlhe + ")";
        }
    }

    public /* synthetic */ iobyxmoadg(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f52517zdlpuopuiu;
    }

    private iobyxmoadg(String str) {
        this.f52517zdlpuopuiu = str;
    }
}
