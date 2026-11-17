package f8;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements lqeggnwhkg {
    @Override // a8.lqeggnwhkg
    public eablkybsjg iobyxmoadg(String str, boolean z13, Object initialState, a8.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg executorFactory, a8.ppxfxbqfkf reducer) {
        zdlpuopuiu.btonecajqb(initialState, "initialState");
        zdlpuopuiu.btonecajqb(executorFactory, "executorFactory");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zoijcleaow zoijcleaowVar = new zoijcleaow(initialState, iobyxmoadgVar, (a8.zoijcleaow) executorFactory.invoke(), reducer);
        if (z13) {
            zoijcleaowVar.init();
        }
        return zoijcleaowVar;
    }
}
