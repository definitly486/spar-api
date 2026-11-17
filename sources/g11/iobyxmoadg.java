package g11;

import gz0.ConfirmProductReplacesRequest;
import gz0.ConfirmReplacesRequest;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import k01.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f35801zoijcleaow;

    /* JADX INFO: renamed from: g11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0808iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35802iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f35803zoijcleaow;

        public C0808iobyxmoadg(String orderId, List list) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f35802iobyxmoadg = orderId;
            this.f35803zoijcleaow = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0808iobyxmoadg)) {
                return false;
            }
            C0808iobyxmoadg c0808iobyxmoadg = (C0808iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f35802iobyxmoadg, c0808iobyxmoadg.f35802iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35803zoijcleaow, c0808iobyxmoadg.f35803zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f35802iobyxmoadg.hashCode() * 31;
            List list = this.f35803zoijcleaow;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f35802iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f35802iobyxmoadg + ", replaces=" + this.f35803zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f35803zoijcleaow;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35804iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f35805zoijcleaow;

        public zoijcleaow(String originalArticle, String str) {
            zdlpuopuiu.btonecajqb(originalArticle, "originalArticle");
            this.f35804iobyxmoadg = originalArticle;
            this.f35805zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f35804iobyxmoadg, zoijcleaowVar.f35804iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35805zoijcleaow, zoijcleaowVar.f35805zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f35804iobyxmoadg.hashCode() * 31;
            String str = this.f35805zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f35804iobyxmoadg;
        }

        public String toString() {
            return "Replaces(originalArticle=" + this.f35804iobyxmoadg + ", selectedArticle=" + this.f35805zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f35805zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gtknphoqwx productReplacesRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(productReplacesRemoteSource, "productReplacesRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f35801zoijcleaow = productReplacesRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0808iobyxmoadg c0808iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        ArrayList arrayList;
        String strIobyxmoadg = c0808iobyxmoadg.iobyxmoadg();
        List<zoijcleaow> listZoijcleaow = c0808iobyxmoadg.zoijcleaow();
        if (listZoijcleaow != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            for (zoijcleaow zoijcleaowVar : listZoijcleaow) {
                arrayList.add(new ConfirmReplacesRequest(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
            }
        } else {
            arrayList = null;
        }
        return this.f35801zoijcleaow.iobyxmoadg(new ConfirmProductReplacesRequest(strIobyxmoadg, arrayList), gxszxtbevoVar);
    }
}
