package s72;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;
import ru.myspar.story.domain.model.StorySlide;
import y72.StoryItemDto;
import y72.StorySlideDto;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final StoryItem iobyxmoadg(StoryItemDto storyItemDto) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(storyItemDto, "<this>");
        String id2 = storyItemDto.getId();
        String str = id2 == null ? "" : id2;
        String title = storyItemDto.getTitle();
        String str2 = title == null ? "" : title;
        Boolean isAdult = storyItemDto.getIsAdult();
        boolean zBooleanValue = isAdult != null ? isAdult.booleanValue() : false;
        String imageUrl = storyItemDto.getImageUrl();
        String str3 = imageUrl == null ? "" : imageUrl;
        List slides = storyItemDto.getSlides();
        if (slides != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(slides, 10));
            Iterator it = slides.iterator();
            while (it.hasNext()) {
                arrayList.add(zoijcleaow((StorySlideDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new StoryItem(str, str2, str3, zBooleanValue, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList, storyItemDto.getOnboardingTime());
    }

    public static final StorySlide zoijcleaow(StorySlideDto storySlideDto) {
        zdlpuopuiu.btonecajqb(storySlideDto, "<this>");
        String id2 = storySlideDto.getId();
        String str = id2 == null ? "" : id2;
        String imageUrl = storySlideDto.getImageUrl();
        String str2 = imageUrl == null ? "" : imageUrl;
        String videoUrl = storySlideDto.getVideoUrl();
        String str3 = videoUrl == null ? "" : videoUrl;
        String buttonNavlink = storySlideDto.getButtonNavlink();
        if (buttonNavlink == null) {
            buttonNavlink = "";
        }
        String reference = storySlideDto.getReference();
        if (reference == null) {
            reference = "";
        }
        StoryNavLink storyNavLink = new StoryNavLink(buttonNavlink, reference);
        String button = storySlideDto.getButton();
        String str4 = button == null ? "" : button;
        String adv = storySlideDto.getAdv();
        if (adv == null) {
            adv = "";
        }
        return new StorySlide(str, str2, str3, storyNavLink, str4, adv, false);
    }
}
