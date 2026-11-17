package vt0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ut0.iobyxmoadg f118050zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118051iobyxmoadg;

        public iobyxmoadg(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f118051iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118051iobyxmoadg, ((iobyxmoadg) obj).f118051iobyxmoadg);
        }

        public int hashCode() {
            return this.f118051iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118051iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f118051iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: vt0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2929zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f118052jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f118054zdlpuopuiu;

        C2929zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118054zdlpuopuiu = obj;
            this.f118052jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ut0.iobyxmoadg addressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118050zoijcleaow = addressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C2929zoijcleaow c2929zoijcleaow;
        if (gxszxtbevoVar instanceof C2929zoijcleaow) {
            c2929zoijcleaow = (C2929zoijcleaow) gxszxtbevoVar;
            int i13 = c2929zoijcleaow.f118052jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2929zoijcleaow.f118052jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2929zoijcleaow = new C2929zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2929zoijcleaow = new C2929zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c2929zoijcleaow.f118054zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2929zoijcleaow.f118052jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ut0.iobyxmoadg iobyxmoadgVar2 = this.f118050zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c2929zoijcleaow.f118052jyumaefscl = 1;
            if (iobyxmoadgVar2.zoijcleaow(strIobyxmoadg, c2929zoijcleaow) == objGxszxtbevo) {
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
