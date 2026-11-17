package m82;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l82.iobyxmoadg f66554zoijcleaow;

    /* JADX INFO: renamed from: m82.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1373iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66555iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f66556zoijcleaow;

        public C1373iobyxmoadg(String subscriptionId, boolean z13) {
            zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
            this.f66555iobyxmoadg = subscriptionId;
            this.f66556zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1373iobyxmoadg)) {
                return false;
            }
            C1373iobyxmoadg c1373iobyxmoadg = (C1373iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f66555iobyxmoadg, c1373iobyxmoadg.f66555iobyxmoadg) && this.f66556zoijcleaow == c1373iobyxmoadg.f66556zoijcleaow;
        }

        public int hashCode() {
            return (this.f66555iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f66556zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f66555iobyxmoadg;
        }

        public String toString() {
            return "Params(subscriptionId=" + this.f66555iobyxmoadg + ", isChecked=" + this.f66556zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f66556zoijcleaow;
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f66557jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f66559zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f66559zdlpuopuiu = obj;
            this.f66557jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(l82.iobyxmoadg subscriptionRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(subscriptionRemoteSource, "subscriptionRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f66554zoijcleaow = subscriptionRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1373iobyxmoadg c1373iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f66557jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f66557jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f66559zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f66557jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            l82.iobyxmoadg iobyxmoadgVar = this.f66554zoijcleaow;
            String strIobyxmoadg = c1373iobyxmoadg.iobyxmoadg();
            boolean zZoijcleaow = c1373iobyxmoadg.zoijcleaow();
            zoijcleaowVar.f66557jyumaefscl = 1;
            if (iobyxmoadgVar.wkgbmnqykc(strIobyxmoadg, zZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
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
