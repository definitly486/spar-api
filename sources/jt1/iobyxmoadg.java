package jt1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ht1.iobyxmoadg f52348zoijcleaow;

    /* JADX INFO: renamed from: jt1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1116iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52349jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f52351zdlpuopuiu;

        C1116iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52351zdlpuopuiu = obj;
            this.f52349jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ht1.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f52348zoijcleaow = splashRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1116iobyxmoadg c1116iobyxmoadg;
        if (gxszxtbevoVar instanceof C1116iobyxmoadg) {
            c1116iobyxmoadg = (C1116iobyxmoadg) gxszxtbevoVar;
            int i13 = c1116iobyxmoadg.f52349jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1116iobyxmoadg.f52349jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1116iobyxmoadg = new C1116iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1116iobyxmoadg = new C1116iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1116iobyxmoadg.f52351zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1116iobyxmoadg.f52349jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ht1.iobyxmoadg iobyxmoadgVar = this.f52348zoijcleaow;
            c1116iobyxmoadg.f52349jyumaefscl = 1;
            if (iobyxmoadgVar.lqeggnwhkg(c1116iobyxmoadg) == objGxszxtbevo) {
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
