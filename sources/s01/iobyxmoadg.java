package s01;

import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.ppxfxbqfkf f105167zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(l01.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f105167zoijcleaow = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(InterfaceC2556iobyxmoadg interfaceC2556iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        if (interfaceC2556iobyxmoadg instanceof InterfaceC2556iobyxmoadg.C2557iobyxmoadg) {
            return l01.ppxfxbqfkf.ppxfxbqfkf(this.f105167zoijcleaow, null, null, null, jyumaefscl.eablkybsjg(((InterfaceC2556iobyxmoadg.C2557iobyxmoadg) interfaceC2556iobyxmoadg).iobyxmoadg()), gxszxtbevoVar, 7, null);
        }
        if (!(interfaceC2556iobyxmoadg instanceof InterfaceC2556iobyxmoadg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC2556iobyxmoadg.zoijcleaow zoijcleaowVar = (InterfaceC2556iobyxmoadg.zoijcleaow) interfaceC2556iobyxmoadg;
        return l01.ppxfxbqfkf.ppxfxbqfkf(this.f105167zoijcleaow, zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg(), null, gxszxtbevoVar, 8, null);
    }

    /* JADX INFO: renamed from: s01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC2556iobyxmoadg {

        /* JADX INFO: renamed from: s01.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2557iobyxmoadg implements InterfaceC2556iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f105168iobyxmoadg;

            public C2557iobyxmoadg(String comboId) {
                zdlpuopuiu.btonecajqb(comboId, "comboId");
                this.f105168iobyxmoadg = comboId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2557iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105168iobyxmoadg, ((C2557iobyxmoadg) obj).f105168iobyxmoadg);
            }

            public int hashCode() {
                return this.f105168iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f105168iobyxmoadg;
            }

            public String toString() {
                return "FromDeepLink(comboId=" + this.f105168iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: s01.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC2556iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final nz0.zoijcleaow f105169iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f105170ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f105171zoijcleaow;

            public zoijcleaow(nz0.zoijcleaow typeOfBlock, String str, String str2) {
                zdlpuopuiu.btonecajqb(typeOfBlock, "typeOfBlock");
                this.f105169iobyxmoadg = typeOfBlock;
                this.f105171zoijcleaow = str;
                this.f105170ppxfxbqfkf = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return this.f105169iobyxmoadg == zoijcleaowVar.f105169iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f105171zoijcleaow, zoijcleaowVar.f105171zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105170ppxfxbqfkf, zoijcleaowVar.f105170ppxfxbqfkf);
            }

            public int hashCode() {
                int iHashCode = this.f105169iobyxmoadg.hashCode() * 31;
                String str = this.f105171zoijcleaow;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f105170ppxfxbqfkf;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String iobyxmoadg() {
                return this.f105170ppxfxbqfkf;
            }

            public final nz0.zoijcleaow ppxfxbqfkf() {
                return this.f105169iobyxmoadg;
            }

            public String toString() {
                return "FromScreen(typeOfBlock=" + this.f105169iobyxmoadg + ", section=" + this.f105171zoijcleaow + ", article=" + this.f105170ppxfxbqfkf + ")";
            }

            public final String zoijcleaow() {
                return this.f105171zoijcleaow;
            }

            public /* synthetic */ zoijcleaow(nz0.zoijcleaow zoijcleaowVar, String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this(zoijcleaowVar, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
            }
        }
    }
}
