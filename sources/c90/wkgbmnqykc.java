package c90;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final b90.zoijcleaow f19342zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f19343iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f19343iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f19343iobyxmoadg == ((iobyxmoadg) obj).f19343iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f19343iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f19343iobyxmoadg;
        }

        public String toString() {
            return "Params(isChecked=" + this.f19343iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f19344jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f19346zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f19346zdlpuopuiu = obj;
            this.f19344jyumaefscl |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(b90.zoijcleaow echecksRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(echecksRemoteSource, "echecksRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f19342zoijcleaow = echecksRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f19344jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f19344jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f19346zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f19344jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            b90.zoijcleaow zoijcleaowVar2 = this.f19342zoijcleaow;
            boolean zIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            zoijcleaowVar.f19344jyumaefscl = 1;
            if (zoijcleaowVar2.iobyxmoadg(zIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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
