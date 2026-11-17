package ra2;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f82448zoijcleaow;

    /* JADX INFO: renamed from: ra2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1846iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f82449jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f82451zdlpuopuiu;

        C1846iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82451zdlpuopuiu = obj;
            this.f82449jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82448zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        C1846iobyxmoadg c1846iobyxmoadg;
        if (gxszxtbevoVar instanceof C1846iobyxmoadg) {
            c1846iobyxmoadg = (C1846iobyxmoadg) gxszxtbevoVar;
            int i13 = c1846iobyxmoadg.f82449jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1846iobyxmoadg.f82449jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1846iobyxmoadg = new C1846iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1846iobyxmoadg = new C1846iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1846iobyxmoadg.f82451zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1846iobyxmoadg.f82449jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f82448zoijcleaow;
            c1846iobyxmoadg.f82449jyumaefscl = 1;
            if (ppxfxbqfkfVar.wkgbmnqykc(c1846iobyxmoadg) == objGxszxtbevo) {
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
