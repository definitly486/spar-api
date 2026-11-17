package j20;

import ft.ppxfxbqfkf;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.ppxfxbqfkf f50564zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(x10.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f50564zoijcleaow = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(InterfaceC1083iobyxmoadg interfaceC1083iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        if (interfaceC1083iobyxmoadg instanceof InterfaceC1083iobyxmoadg.C1084iobyxmoadg) {
            return x10.ppxfxbqfkf.nufgyqmvbu(this.f50564zoijcleaow, null, null, null, null, null, jyumaefscl.eablkybsjg(((InterfaceC1083iobyxmoadg.C1084iobyxmoadg) interfaceC1083iobyxmoadg).iobyxmoadg()), gxszxtbevoVar, 31, null);
        }
        if (!(interfaceC1083iobyxmoadg instanceof InterfaceC1083iobyxmoadg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC1083iobyxmoadg.zoijcleaow zoijcleaowVar = (InterfaceC1083iobyxmoadg.zoijcleaow) interfaceC1083iobyxmoadg;
        return x10.ppxfxbqfkf.nufgyqmvbu(this.f50564zoijcleaow, zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.eablkybsjg(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), null, gxszxtbevoVar, 32, null);
    }

    /* JADX INFO: renamed from: j20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1083iobyxmoadg {

        /* JADX INFO: renamed from: j20.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1084iobyxmoadg implements InterfaceC1083iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f50565iobyxmoadg;

            public C1084iobyxmoadg(String comboId) {
                zdlpuopuiu.btonecajqb(comboId, "comboId");
                this.f50565iobyxmoadg = comboId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1084iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50565iobyxmoadg, ((C1084iobyxmoadg) obj).f50565iobyxmoadg);
            }

            public int hashCode() {
                return this.f50565iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f50565iobyxmoadg;
            }

            public String toString() {
                return "FromDeepLink(comboId=" + this.f50565iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: j20.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC1083iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final String f50566eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f50567iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final DeliveryCode f50568ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final String f50569wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final w00.zoijcleaow f50570zoijcleaow;

            public zoijcleaow(String shopId, w00.zoijcleaow typeOfBlock, DeliveryCode deliveryCode, String str, String str2) {
                zdlpuopuiu.btonecajqb(shopId, "shopId");
                zdlpuopuiu.btonecajqb(typeOfBlock, "typeOfBlock");
                this.f50567iobyxmoadg = shopId;
                this.f50570zoijcleaow = typeOfBlock;
                this.f50568ppxfxbqfkf = deliveryCode;
                this.f50569wkgbmnqykc = str;
                this.f50566eablkybsjg = str2;
            }

            public final w00.zoijcleaow eablkybsjg() {
                return this.f50570zoijcleaow;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f50567iobyxmoadg, zoijcleaowVar.f50567iobyxmoadg) && this.f50570zoijcleaow == zoijcleaowVar.f50570zoijcleaow && this.f50568ppxfxbqfkf == zoijcleaowVar.f50568ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f50569wkgbmnqykc, zoijcleaowVar.f50569wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f50566eablkybsjg, zoijcleaowVar.f50566eablkybsjg);
            }

            public int hashCode() {
                int iHashCode = ((this.f50567iobyxmoadg.hashCode() * 31) + this.f50570zoijcleaow.hashCode()) * 31;
                DeliveryCode deliveryCode = this.f50568ppxfxbqfkf;
                int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
                String str = this.f50569wkgbmnqykc;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f50566eablkybsjg;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String iobyxmoadg() {
                return this.f50566eablkybsjg;
            }

            public final String ppxfxbqfkf() {
                return this.f50569wkgbmnqykc;
            }

            public String toString() {
                return "FromScreen(shopId=" + this.f50567iobyxmoadg + ", typeOfBlock=" + this.f50570zoijcleaow + ", deliveryType=" + this.f50568ppxfxbqfkf + ", section=" + this.f50569wkgbmnqykc + ", article=" + this.f50566eablkybsjg + ")";
            }

            public final String wkgbmnqykc() {
                return this.f50567iobyxmoadg;
            }

            public final DeliveryCode zoijcleaow() {
                return this.f50568ppxfxbqfkf;
            }

            public /* synthetic */ zoijcleaow(String str, w00.zoijcleaow zoijcleaowVar, DeliveryCode deliveryCode, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                this(str, zoijcleaowVar, (i13 & 4) != 0 ? null : deliveryCode, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3);
            }
        }
    }
}
