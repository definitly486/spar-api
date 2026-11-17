package hi0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fi0.iobyxmoadg f40441zoijcleaow;

    /* JADX INFO: renamed from: hi0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0935iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f40442jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f40444zdlpuopuiu;

        C0935iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f40444zdlpuopuiu = obj;
            this.f40442jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(fi0.iobyxmoadg networkItemsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(networkItemsRepository, "networkItemsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f40441zoijcleaow = networkItemsRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C0935iobyxmoadg c0935iobyxmoadg;
        if (gxszxtbevoVar instanceof C0935iobyxmoadg) {
            c0935iobyxmoadg = (C0935iobyxmoadg) gxszxtbevoVar;
            int i13 = c0935iobyxmoadg.f40442jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0935iobyxmoadg.f40442jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0935iobyxmoadg = new C0935iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0935iobyxmoadg = new C0935iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0935iobyxmoadg.f40444zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0935iobyxmoadg.f40442jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            fi0.iobyxmoadg iobyxmoadgVar = this.f40441zoijcleaow;
            c0935iobyxmoadg.f40442jyumaefscl = 1;
            if (iobyxmoadgVar.iobyxmoadg(c0935iobyxmoadg) == objGxszxtbevo) {
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
