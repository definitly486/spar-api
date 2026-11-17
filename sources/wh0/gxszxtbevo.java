package wh0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.story.domain.model.StoryItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {
    public static final List iobyxmoadg(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((StoryItem) it.next()));
        }
        return arrayList;
    }

    public static final eablkybsjg zoijcleaow(StoryItem storyItem) {
        zdlpuopuiu.btonecajqb(storyItem, "<this>");
        return new eablkybsjg(storyItem.getId(), storyItem.getTitle(), storyItem.getImageUrl(), storyItem.dxjokdxxww(), storyItem.getIsAdult());
    }
}
