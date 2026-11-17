package ph;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk extends nufgyqmvbu implements zh.eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object[] f76569ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(ii.gxszxtbevo gxszxtbevoVar, Object[] values) {
        super(gxszxtbevoVar, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        this.f76569ppxfxbqfkf = values;
    }

    @Override // zh.eablkybsjg
    public List ppxfxbqfkf() {
        Object[] objArr = this.f76569ppxfxbqfkf;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            nufgyqmvbu.iobyxmoadg iobyxmoadgVar = nufgyqmvbu.f76594zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
            arrayList.add(iobyxmoadgVar.iobyxmoadg(obj, null));
        }
        return arrayList;
    }
}
