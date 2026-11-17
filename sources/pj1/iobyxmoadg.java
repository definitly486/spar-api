package pj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import nj1.istkbnxepw;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f76816zdlpuopuiu;

    /* JADX INFO: renamed from: pj1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1698iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f76817yggfygwlhe;

        public C1698iobyxmoadg(int i13) {
            super(String.valueOf(i13), null);
            this.f76817yggfygwlhe = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1698iobyxmoadg) && this.f76817yggfygwlhe == ((C1698iobyxmoadg) obj).f76817yggfygwlhe;
        }

        public int hashCode() {
            return Integer.hashCode(this.f76817yggfygwlhe);
        }

        public final int iobyxmoadg() {
            return this.f76817yggfygwlhe;
        }

        public String toString() {
            return "EmptyListMessage(messageRes=" + this.f76817yggfygwlhe + ")";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final istkbnxepw f76818jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final pj1.ppxfxbqfkf f76819yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(pj1.ppxfxbqfkf product, istkbnxepw mode) {
            super(product.getId(), null);
            zdlpuopuiu.btonecajqb(product, "product");
            zdlpuopuiu.btonecajqb(mode, "mode");
            this.f76819yggfygwlhe = product;
            this.f76818jyumaefscl = mode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f76819yggfygwlhe, ppxfxbqfkfVar.f76819yggfygwlhe) && this.f76818jyumaefscl == ppxfxbqfkfVar.f76818jyumaefscl;
        }

        public int hashCode() {
            return (this.f76819yggfygwlhe.hashCode() * 31) + this.f76818jyumaefscl.hashCode();
        }

        public final istkbnxepw iobyxmoadg() {
            return this.f76818jyumaefscl;
        }

        public String toString() {
            return "Product(product=" + this.f76819yggfygwlhe + ", mode=" + this.f76818jyumaefscl + ")";
        }

        public final pj1.ppxfxbqfkf wkgbmnqykc() {
            return this.f76819yggfygwlhe;
        }
    }

    public static final class wkgbmnqykc extends iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final boolean f76820iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final istkbnxepw f76821jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f76822yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(int i13, istkbnxepw mode, boolean z13) {
            super(String.valueOf(i13), null);
            zdlpuopuiu.btonecajqb(mode, "mode");
            this.f76822yggfygwlhe = i13;
            this.f76821jyumaefscl = mode;
            this.f76820iwizpuwonk = z13;
        }

        public final boolean eablkybsjg() {
            return this.f76820iwizpuwonk;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f76822yggfygwlhe == wkgbmnqykcVar.f76822yggfygwlhe && this.f76821jyumaefscl == wkgbmnqykcVar.f76821jyumaefscl && this.f76820iwizpuwonk == wkgbmnqykcVar.f76820iwizpuwonk;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f76822yggfygwlhe) * 31) + this.f76821jyumaefscl.hashCode()) * 31) + Boolean.hashCode(this.f76820iwizpuwonk);
        }

        public final istkbnxepw iobyxmoadg() {
            return this.f76821jyumaefscl;
        }

        public String toString() {
            return "SectionTitle(titleRes=" + this.f76822yggfygwlhe + ", mode=" + this.f76821jyumaefscl + ", isEmptySection=" + this.f76820iwizpuwonk + ")";
        }

        public final int wkgbmnqykc() {
            return this.f76822yggfygwlhe;
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f76823yggfygwlhe;

        public zoijcleaow(int i13) {
            super(String.valueOf(i13), null);
            this.f76823yggfygwlhe = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f76823yggfygwlhe == ((zoijcleaow) obj).f76823yggfygwlhe;
        }

        public int hashCode() {
            return Integer.hashCode(this.f76823yggfygwlhe);
        }

        public final int iobyxmoadg() {
            return this.f76823yggfygwlhe;
        }

        public String toString() {
            return "Hint(hintRes=" + this.f76823yggfygwlhe + ")";
        }
    }

    public /* synthetic */ iobyxmoadg(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f76816zdlpuopuiu;
    }

    private iobyxmoadg(String str) {
        this.f76816zdlpuopuiu = str;
    }
}
