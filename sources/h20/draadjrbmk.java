package h20;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c20.eablkybsjg f39147ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.ppxfxbqfkf f39148zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39149iobyxmoadg;

        public iobyxmoadg(String str) {
            this.f39149iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39149iobyxmoadg, ((iobyxmoadg) obj).f39149iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f39149iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39149iobyxmoadg;
        }

        public String toString() {
            return "Params(section=" + this.f39149iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(x10.ppxfxbqfkf catalogRemoteSource, c20.eablkybsjg isLoggedInUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39148zoijcleaow = catalogRemoteSource;
        this.f39147ppxfxbqfkf = isLoggedInUseCase;
    }

    static /* synthetic */ Object eablkybsjg(draadjrbmk draadjrbmkVar, String str, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return draadjrbmkVar.wkgbmnqykc(str, gxszxtbevoVar);
    }

    private final Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return !((Boolean) this.f39147ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() ? jyumaefscl.wflxmlrfwp() : this.f39148zoijcleaow.zoijcleaow(str, gxszxtbevoVar);
    }

    public final Object gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg(this, null, gxszxtbevoVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
