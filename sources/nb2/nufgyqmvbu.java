package nb2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ int f69595yggfygwlhe = 10;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ List f69596zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(List list) {
        super(0);
        this.f69596zdlpuopuiu = list;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        List list = this.f69596zdlpuopuiu;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new jhduphickx(((btonecajqb) it.next()).f69548iobyxmoadg));
        }
        return "Getting first " + this.f69595yggfygwlhe + " from storage: " + arrayList;
    }
}
