package androidx.work;

import g6.draadjrbmk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lg6/draadjrbmk;", "<init>", "()V", "", "Landroidx/work/zoijcleaow;", "inputs", "iobyxmoadg", "(Ljava/util/List;)Landroidx/work/zoijcleaow;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OverwritingInputMerger extends draadjrbmk {
    @Override // g6.draadjrbmk
    public zoijcleaow iobyxmoadg(List inputs) {
        zdlpuopuiu.btonecajqb(inputs, "inputs");
        zoijcleaow.iobyxmoadg iobyxmoadgVar = new zoijcleaow.iobyxmoadg();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((zoijcleaow) it.next()).wkgbmnqykc());
        }
        iobyxmoadgVar.wkgbmnqykc(linkedHashMap);
        return iobyxmoadgVar.iobyxmoadg();
    }
}
