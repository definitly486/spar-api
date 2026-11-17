package au1;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.story.domain.model.StorySlide;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {
    public static final ppxfxbqfkf iobyxmoadg(StorySlide storySlide) {
        zdlpuopuiu.btonecajqb(storySlide, "<this>");
        String id2 = storySlide.getId();
        String videoUrl = storySlide.getVideoUrl();
        if (kcexrzcfyt.zfvoamnweg(videoUrl)) {
            videoUrl = storySlide.getImageUrl();
        }
        return new ppxfxbqfkf(id2, storySlide.getButtonTitle(), storySlide.getAdv(), videoUrl, kcexrzcfyt.zfvoamnweg(storySlide.getVideoUrl()) ? ppxfxbqfkf.iobyxmoadg.IMAGE : ppxfxbqfkf.iobyxmoadg.VIDEO);
    }
}
