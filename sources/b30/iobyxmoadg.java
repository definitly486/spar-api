package b30;

import ft.ppxfxbqfkf;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o00.ConfirmProductReplacesRequest;
import o00.ConfirmReplacesRequest;
import pj.pkzmftpjix;
import w10.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f15079zoijcleaow;

    /* JADX INFO: renamed from: b30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0255iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15080iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f15081zoijcleaow;

        public C0255iobyxmoadg(String orderId, List list) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f15080iobyxmoadg = orderId;
            this.f15081zoijcleaow = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0255iobyxmoadg)) {
                return false;
            }
            C0255iobyxmoadg c0255iobyxmoadg = (C0255iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f15080iobyxmoadg, c0255iobyxmoadg.f15080iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15081zoijcleaow, c0255iobyxmoadg.f15081zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f15080iobyxmoadg.hashCode() * 31;
            List list = this.f15081zoijcleaow;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f15080iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f15080iobyxmoadg + ", replaces=" + this.f15081zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f15081zoijcleaow;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15082iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f15083zoijcleaow;

        public zoijcleaow(String originalArticle, String str) {
            zdlpuopuiu.btonecajqb(originalArticle, "originalArticle");
            this.f15082iobyxmoadg = originalArticle;
            this.f15083zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f15082iobyxmoadg, zoijcleaowVar.f15082iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15083zoijcleaow, zoijcleaowVar.f15083zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f15082iobyxmoadg.hashCode() * 31;
            String str = this.f15083zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f15082iobyxmoadg;
        }

        public String toString() {
            return "Replaces(originalArticle=" + this.f15082iobyxmoadg + ", selectedArticle=" + this.f15083zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f15083zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gtknphoqwx productReplacesRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(productReplacesRemoteSource, "productReplacesRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f15079zoijcleaow = productReplacesRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0255iobyxmoadg c0255iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        ArrayList arrayList;
        String strIobyxmoadg = c0255iobyxmoadg.iobyxmoadg();
        List<zoijcleaow> listZoijcleaow = c0255iobyxmoadg.zoijcleaow();
        if (listZoijcleaow != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            for (zoijcleaow zoijcleaowVar : listZoijcleaow) {
                arrayList.add(new ConfirmReplacesRequest(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
            }
        } else {
            arrayList = null;
        }
        return this.f15079zoijcleaow.iobyxmoadg(new ConfirmProductReplacesRequest(strIobyxmoadg, arrayList), gxszxtbevoVar);
    }
}
