package r01;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f81356ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.ppxfxbqfkf f81357zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81358iobyxmoadg;

        public iobyxmoadg(String str) {
            this.f81358iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81358iobyxmoadg, ((iobyxmoadg) obj).f81358iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f81358iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f81358iobyxmoadg;
        }

        public String toString() {
            return "Params(section=" + this.f81358iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(l01.ppxfxbqfkf catalogRemoteSource, esjtqupxsv isAuthUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81357zoijcleaow = catalogRemoteSource;
        this.f81356ppxfxbqfkf = isAuthUseCase;
    }

    static /* synthetic */ Object eablkybsjg(dxjokdxxww dxjokdxxwwVar, String str, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return dxjokdxxwwVar.wkgbmnqykc(str, gxszxtbevoVar);
    }

    private final Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return !((Boolean) this.f81356ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() ? jyumaefscl.wflxmlrfwp() : this.f81357zoijcleaow.zoijcleaow(str, gxszxtbevoVar);
    }

    public final Object gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(this, null, gxszxtbevoVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
