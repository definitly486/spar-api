package x01;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zy0.iobyxmoadg f120900zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120901iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f120902zoijcleaow;

        public iobyxmoadg(String uriString, int i13) {
            zdlpuopuiu.btonecajqb(uriString, "uriString");
            this.f120901iobyxmoadg = uriString;
            this.f120902zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f120901iobyxmoadg, iobyxmoadgVar.f120901iobyxmoadg) && this.f120902zoijcleaow == iobyxmoadgVar.f120902zoijcleaow;
        }

        public int hashCode() {
            return (this.f120901iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f120902zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f120902zoijcleaow;
        }

        public String toString() {
            return "Params(uriString=" + this.f120901iobyxmoadg + ", maxSizeInMb=" + this.f120902zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f120901iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(zy0.iobyxmoadg fileUtil, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f120900zoijcleaow = fileUtil;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f120900zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }
}
