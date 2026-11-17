package q20;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h00.iobyxmoadg f77784zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f77785iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f77786zoijcleaow;

        public iobyxmoadg(String uriString, int i13) {
            zdlpuopuiu.btonecajqb(uriString, "uriString");
            this.f77785iobyxmoadg = uriString;
            this.f77786zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f77785iobyxmoadg, iobyxmoadgVar.f77785iobyxmoadg) && this.f77786zoijcleaow == iobyxmoadgVar.f77786zoijcleaow;
        }

        public int hashCode() {
            return (this.f77785iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f77786zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f77786zoijcleaow;
        }

        public String toString() {
            return "Params(uriString=" + this.f77785iobyxmoadg + ", maxSizeInMb=" + this.f77786zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f77785iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(h00.iobyxmoadg fileUtil, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f77784zoijcleaow = fileUtil;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f77784zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }
}
