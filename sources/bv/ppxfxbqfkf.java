package bv;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final av.iobyxmoadg f17129zoijcleaow;

    public enum iobyxmoadg {
        DELIVERY("delivery"),
        PICKUP("pickup");


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f17130cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f17134zdlpuopuiu;

        iobyxmoadg(String str) {
            this.f17134zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f17134zdlpuopuiu;
        }
    }

    /* JADX INFO: renamed from: bv.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C0308ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17135jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17137zdlpuopuiu;

        C0308ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17137zdlpuopuiu = obj;
            this.f17135jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17138iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final iobyxmoadg f17139zoijcleaow;

        public zoijcleaow(String addressId, iobyxmoadg addressType) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f17138iobyxmoadg = addressId;
            this.f17139zoijcleaow = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f17138iobyxmoadg, zoijcleaowVar.f17138iobyxmoadg) && this.f17139zoijcleaow == zoijcleaowVar.f17139zoijcleaow;
        }

        public int hashCode() {
            return (this.f17138iobyxmoadg.hashCode() * 31) + this.f17139zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f17138iobyxmoadg;
        }

        public String toString() {
            return "Params(addressId=" + this.f17138iobyxmoadg + ", addressType=" + this.f17139zoijcleaow + ")";
        }

        public final iobyxmoadg zoijcleaow() {
            return this.f17139zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(av.iobyxmoadg addressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f17129zoijcleaow = addressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        C0308ppxfxbqfkf c0308ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C0308ppxfxbqfkf) {
            c0308ppxfxbqfkf = (C0308ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c0308ppxfxbqfkf.f17135jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0308ppxfxbqfkf.f17135jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0308ppxfxbqfkf = new C0308ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c0308ppxfxbqfkf = new C0308ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = c0308ppxfxbqfkf.f17137zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0308ppxfxbqfkf.f17135jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            av.iobyxmoadg iobyxmoadgVar = this.f17129zoijcleaow;
            String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            String strWkgbmnqykc = zoijcleaowVar.zoijcleaow().wkgbmnqykc();
            c0308ppxfxbqfkf.f17135jyumaefscl = 1;
            if (iobyxmoadgVar.ppxfxbqfkf(strIobyxmoadg, strWkgbmnqykc, c0308ppxfxbqfkf) == objGxszxtbevo) {
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
