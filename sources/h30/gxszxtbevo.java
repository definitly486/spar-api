package h30;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import w10.oxmwwwfdhm;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oxmwwwfdhm f39288zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f39289jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f39291zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39291zdlpuopuiu = obj;
            this.f39289jyumaefscl |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(oxmwwwfdhm shopRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(shopRemoteSource, "shopRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39288zoijcleaow = shopRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f39289jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f39289jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f39291zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f39289jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            oxmwwwfdhm oxmwwwfdhmVar = this.f39288zoijcleaow;
            iobyxmoadgVar.f39289jyumaefscl = 1;
            objIobyxmoadg = oxmwwwfdhmVar.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return ((s10.wkgbmnqykc) objIobyxmoadg).iobyxmoadg();
    }
}
