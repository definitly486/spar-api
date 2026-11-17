package kk;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59245zdlpuopuiu;

    public x3(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        x3 x3Var = new x3(gxszxtbevoVar);
        x3Var.f59245zdlpuopuiu = obj;
        return x3Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        x3 x3Var = new x3((lg.gxszxtbevo) obj2);
        x3Var.f59245zdlpuopuiu = (List) obj;
        return x3Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        List list = (List) this.f59245zdlpuopuiu;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        long j13 = 0;
        while (it.hasNext()) {
            j13 += ((eg0) it.next()).f56422zoijcleaow;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(j13);
    }
}
