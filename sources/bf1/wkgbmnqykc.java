package bf1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.story.domain.model.StoryItem;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {
    public static final ppxfxbqfkf iobyxmoadg(StoryItem storyItem) {
        zdlpuopuiu.btonecajqb(storyItem, "<this>");
        return new ppxfxbqfkf(storyItem.getId(), storyItem.getTitle(), storyItem.getImageUrl(), storyItem.dxjokdxxww(), storyItem.getIsAdult());
    }

    public static final List zoijcleaow(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((StoryItem) it.next()));
        }
        return arrayList;
    }
}
