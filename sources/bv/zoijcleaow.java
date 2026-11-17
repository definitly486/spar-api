package bv;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final av.iobyxmoadg f17157zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17158iobyxmoadg;

        public iobyxmoadg(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f17158iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17158iobyxmoadg, ((iobyxmoadg) obj).f17158iobyxmoadg);
        }

        public int hashCode() {
            return this.f17158iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f17158iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f17158iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: bv.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0309zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17159jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17161zdlpuopuiu;

        C0309zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17161zdlpuopuiu = obj;
            this.f17159jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(av.iobyxmoadg addressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f17157zoijcleaow = addressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C0309zoijcleaow c0309zoijcleaow;
        if (gxszxtbevoVar instanceof C0309zoijcleaow) {
            c0309zoijcleaow = (C0309zoijcleaow) gxszxtbevoVar;
            int i13 = c0309zoijcleaow.f17159jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0309zoijcleaow.f17159jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0309zoijcleaow = new C0309zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0309zoijcleaow = new C0309zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c0309zoijcleaow.f17161zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0309zoijcleaow.f17159jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            av.iobyxmoadg iobyxmoadgVar2 = this.f17157zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c0309zoijcleaow.f17159jyumaefscl = 1;
            if (iobyxmoadgVar2.zoijcleaow(strIobyxmoadg, c0309zoijcleaow) == objGxszxtbevo) {
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
