package t20;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f109323zoijcleaow;

    /* JADX INFO: renamed from: t20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2685iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f109324jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f109326zdlpuopuiu;

        C2685iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f109326zdlpuopuiu = obj;
            this.f109324jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f109323zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C2685iobyxmoadg c2685iobyxmoadg;
        if (gxszxtbevoVar instanceof C2685iobyxmoadg) {
            c2685iobyxmoadg = (C2685iobyxmoadg) gxszxtbevoVar;
            int i13 = c2685iobyxmoadg.f109324jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2685iobyxmoadg.f109324jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2685iobyxmoadg = new C2685iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2685iobyxmoadg = new C2685iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2685iobyxmoadg.f109326zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2685iobyxmoadg.f109324jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f109323zoijcleaow;
            c2685iobyxmoadg.f109324jyumaefscl = 1;
            if (ppxfxbqfkfVar.agtfadlqog(true, c2685iobyxmoadg) == objGxszxtbevo) {
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
