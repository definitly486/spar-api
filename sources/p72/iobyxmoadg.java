package p72;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n72.iobyxmoadg f75959zoijcleaow;

    /* JADX INFO: renamed from: p72.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1673iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f75960jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f75962zdlpuopuiu;

        C1673iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75962zdlpuopuiu = obj;
            this.f75960jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(n72.iobyxmoadg splashRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(splashRepository, "splashRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75959zoijcleaow = splashRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1673iobyxmoadg c1673iobyxmoadg;
        if (gxszxtbevoVar instanceof C1673iobyxmoadg) {
            c1673iobyxmoadg = (C1673iobyxmoadg) gxszxtbevoVar;
            int i13 = c1673iobyxmoadg.f75960jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1673iobyxmoadg.f75960jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1673iobyxmoadg = new C1673iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1673iobyxmoadg = new C1673iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1673iobyxmoadg.f75962zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1673iobyxmoadg.f75960jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            n72.iobyxmoadg iobyxmoadgVar = this.f75959zoijcleaow;
            c1673iobyxmoadg.f75960jyumaefscl = 1;
            if (iobyxmoadgVar.lqeggnwhkg(c1673iobyxmoadg) == objGxszxtbevo) {
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
