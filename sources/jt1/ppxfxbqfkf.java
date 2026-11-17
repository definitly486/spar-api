package jt1;

import gg.wwaezpbzkn;
import it1.Splash;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ht1.iobyxmoadg f52352zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52353jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f52355zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52355zdlpuopuiu = obj;
            this.f52353jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ht1.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f52352zoijcleaow = splashRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(Splash splash, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f52353jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f52353jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f52355zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f52353jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ht1.iobyxmoadg iobyxmoadgVar2 = this.f52352zoijcleaow;
            iobyxmoadgVar.f52353jyumaefscl = 1;
            if (iobyxmoadgVar2.nufgyqmvbu(splash, iobyxmoadgVar) == objGxszxtbevo) {
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
