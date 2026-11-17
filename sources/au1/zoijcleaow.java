package au1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StorySlide;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    public static final iobyxmoadg iobyxmoadg(StoryItem storyItem) {
        zdlpuopuiu.btonecajqb(storyItem, "<this>");
        String id2 = storyItem.getId();
        List slides = storyItem.getSlides();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(slides, 10));
        Iterator it = slides.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc.iobyxmoadg((StorySlide) it.next()));
        }
        Iterator it2 = storyItem.getSlides().iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            }
            if (!((StorySlide) it2.next()).getIsViewed()) {
                break;
            }
            i13++;
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return new iobyxmoadg(id2, arrayList, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
