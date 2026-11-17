package eo1;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final do1.iobyxmoadg f31652ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fz0.iobyxmoadg f31653zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(fz0.iobyxmoadg barcodeMapper, do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(barcodeMapper, "barcodeMapper");
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31653zoijcleaow = barcodeMapper;
        this.f31652ppxfxbqfkf = scanGoRepository;
    }

    private final List wkgbmnqykc(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0678iobyxmoadg c0678iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f31652ppxfxbqfkf.gxszxtbevo(this.f31653zoijcleaow.iobyxmoadg(c0678iobyxmoadg.zoijcleaow()), c0678iobyxmoadg.ppxfxbqfkf() ? jyumaefscl.wflxmlrfwp() : wkgbmnqykc(c0678iobyxmoadg.iobyxmoadg()), gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: eo1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0678iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31654iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f31655ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f31656zoijcleaow;

        public C0678iobyxmoadg(String rawBarcode, boolean z13, List markCodes) {
            zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
            zdlpuopuiu.btonecajqb(markCodes, "markCodes");
            this.f31654iobyxmoadg = rawBarcode;
            this.f31656zoijcleaow = z13;
            this.f31655ppxfxbqfkf = markCodes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0678iobyxmoadg)) {
                return false;
            }
            C0678iobyxmoadg c0678iobyxmoadg = (C0678iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f31654iobyxmoadg, c0678iobyxmoadg.f31654iobyxmoadg) && this.f31656zoijcleaow == c0678iobyxmoadg.f31656zoijcleaow && zdlpuopuiu.eablkybsjg(this.f31655ppxfxbqfkf, c0678iobyxmoadg.f31655ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f31654iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f31656zoijcleaow)) * 31) + this.f31655ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f31655ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f31656zoijcleaow;
        }

        public String toString() {
            return "Params(rawBarcode=" + this.f31654iobyxmoadg + ", isEmptyMarkCode=" + this.f31656zoijcleaow + ", markCodes=" + this.f31655ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f31654iobyxmoadg;
        }

        public /* synthetic */ C0678iobyxmoadg(String str, boolean z13, List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }
}
