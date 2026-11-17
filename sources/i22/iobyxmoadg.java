package i22;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h22.iobyxmoadg f41806ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n00.iobyxmoadg f41807zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(n00.iobyxmoadg barcodeMapper, h22.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(barcodeMapper, "barcodeMapper");
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f41807zoijcleaow = barcodeMapper;
        this.f41806ppxfxbqfkf = scanGoRepository;
    }

    private final List wkgbmnqykc(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0982iobyxmoadg c0982iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f41806ppxfxbqfkf.gxszxtbevo(this.f41807zoijcleaow.iobyxmoadg(c0982iobyxmoadg.zoijcleaow()), c0982iobyxmoadg.ppxfxbqfkf() ? jyumaefscl.wflxmlrfwp() : wkgbmnqykc(c0982iobyxmoadg.iobyxmoadg()), gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: i22.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0982iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f41808iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f41809ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f41810zoijcleaow;

        public C0982iobyxmoadg(String rawBarcode, boolean z13, List markCodes) {
            zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
            zdlpuopuiu.btonecajqb(markCodes, "markCodes");
            this.f41808iobyxmoadg = rawBarcode;
            this.f41810zoijcleaow = z13;
            this.f41809ppxfxbqfkf = markCodes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0982iobyxmoadg)) {
                return false;
            }
            C0982iobyxmoadg c0982iobyxmoadg = (C0982iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f41808iobyxmoadg, c0982iobyxmoadg.f41808iobyxmoadg) && this.f41810zoijcleaow == c0982iobyxmoadg.f41810zoijcleaow && zdlpuopuiu.eablkybsjg(this.f41809ppxfxbqfkf, c0982iobyxmoadg.f41809ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f41808iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f41810zoijcleaow)) * 31) + this.f41809ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f41809ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f41810zoijcleaow;
        }

        public String toString() {
            return "Params(rawBarcode=" + this.f41808iobyxmoadg + ", isEmptyMarkCode=" + this.f41810zoijcleaow + ", markCodes=" + this.f41809ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f41808iobyxmoadg;
        }

        public /* synthetic */ C0982iobyxmoadg(String str, boolean z13, List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }
}
