package oy;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import zz.HistoryListDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    public static final List iobyxmoadg(HistoryListDto historyListDto) {
        zdlpuopuiu.btonecajqb(historyListDto, "<this>");
        List items = historyListDto.getItems();
        if (items == null) {
            items = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new r10.iobyxmoadg((String) it.next()));
        }
        return arrayList;
    }
}
