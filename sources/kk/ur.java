package kk;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ur extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ String f58883yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Map f58884zdlpuopuiu;

    public ur(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ur urVar = new ur((lg.gxszxtbevo) obj3);
        urVar.f58884zdlpuopuiu = (Map) obj;
        urVar.f58883yggfygwlhe = (String) obj2;
        return urVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        Map map = this.f58884zdlpuopuiu;
        String str = this.f58883yggfygwlhe;
        if (str == null || map == null) {
            return null;
        }
        return (String) map.get(str);
    }
}
