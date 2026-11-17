package oc0;

import hg.jyumaefscl;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pc0.zoijcleaow;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final DateTimeFormatter f72592zdlpuopuiu = DateTimeFormatter.ofPattern("dd MMMM HH:mm");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final DateTimeFormatter f72591yggfygwlhe = DateTimeFormatter.ofPattern("dd MMMM");

    private final String iobyxmoadg(l10.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return (z13 ? iobyxmoadgVar.ppxfxbqfkf().format(this.f72592zdlpuopuiu) : iobyxmoadgVar.ppxfxbqfkf().format(this.f72591yggfygwlhe)).toString();
    }

    private final zoijcleaow ppxfxbqfkf(l10.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return new zoijcleaow(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.eablkybsjg(), null, iobyxmoadg(iobyxmoadgVar, z13), 0L, zdlpuopuiu.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), "promocopy"), 160, null);
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return zoijcleaow((List) obj, ((Boolean) obj2).booleanValue());
    }

    public List zoijcleaow(List models, boolean z13) {
        zdlpuopuiu.btonecajqb(models, "models");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(models, 10));
        Iterator it = models.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((l10.iobyxmoadg) it.next(), z13));
        }
        return arrayList;
    }
}
