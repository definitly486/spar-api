package vt0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ut0.iobyxmoadg f118022zoijcleaow;

    public enum iobyxmoadg {
        DELIVERY("delivery"),
        PICKUP("pickup");


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f118023cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f118027zdlpuopuiu;

        iobyxmoadg(String str) {
            this.f118027zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f118027zdlpuopuiu;
        }
    }

    /* JADX INFO: renamed from: vt0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C2928ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f118028jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f118030zdlpuopuiu;

        C2928ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118030zdlpuopuiu = obj;
            this.f118028jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118031iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final iobyxmoadg f118032zoijcleaow;

        public zoijcleaow(String addressId, iobyxmoadg addressType) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f118031iobyxmoadg = addressId;
            this.f118032zoijcleaow = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f118031iobyxmoadg, zoijcleaowVar.f118031iobyxmoadg) && this.f118032zoijcleaow == zoijcleaowVar.f118032zoijcleaow;
        }

        public int hashCode() {
            return (this.f118031iobyxmoadg.hashCode() * 31) + this.f118032zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118031iobyxmoadg;
        }

        public String toString() {
            return "Params(addressId=" + this.f118031iobyxmoadg + ", addressType=" + this.f118032zoijcleaow + ")";
        }

        public final iobyxmoadg zoijcleaow() {
            return this.f118032zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ut0.iobyxmoadg addressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118022zoijcleaow = addressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        C2928ppxfxbqfkf c2928ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C2928ppxfxbqfkf) {
            c2928ppxfxbqfkf = (C2928ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c2928ppxfxbqfkf.f118028jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2928ppxfxbqfkf.f118028jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2928ppxfxbqfkf = new C2928ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c2928ppxfxbqfkf = new C2928ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = c2928ppxfxbqfkf.f118030zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2928ppxfxbqfkf.f118028jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ut0.iobyxmoadg iobyxmoadgVar = this.f118022zoijcleaow;
            String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            String strWkgbmnqykc = zoijcleaowVar.zoijcleaow().wkgbmnqykc();
            c2928ppxfxbqfkf.f118028jyumaefscl = 1;
            if (iobyxmoadgVar.ppxfxbqfkf(strIobyxmoadg, strWkgbmnqykc, c2928ppxfxbqfkf) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
