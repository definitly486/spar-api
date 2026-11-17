package d12;

import dt.zoijcleaow;
import g12.ReviewItemDto;
import g12.ReviewSumItemDto;
import g12.ReviewUserDto;
import g12.ReviewsDto;
import hg.jyumaefscl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.review.api.model.ReviewHeaderItem;
import ru.myspar.rate.review.api.model.ReviewItem;
import ru.myspar.rate.review.api.model.ReviewSumItem;
import ru.myspar.rate.review.api.model.ReviewUser;
import ru.myspar.rate.review.api.model.Reviews;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f26695iobyxmoadg;

    public iobyxmoadg(zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f26695iobyxmoadg = dateUtils;
    }

    private final ReviewUser eablkybsjg(ReviewUserDto reviewUserDto) {
        String name = reviewUserDto.getName();
        String str = name == null ? "" : name;
        boolean isCanAdd = reviewUserDto.getIsCanAdd();
        boolean canEdit = reviewUserDto.getCanEdit();
        Integer rating = reviewUserDto.getRating();
        int iIntValue = rating != null ? rating.intValue() : 0;
        boolean active = reviewUserDto.getActive();
        String comment = reviewUserDto.getComment();
        String str2 = comment == null ? "" : comment;
        String answer = reviewUserDto.getAnswer();
        if (answer == null) {
            answer = "";
        }
        return new ReviewUser(str, isCanAdd, canEdit, iIntValue, active, str2, answer);
    }

    private final Reviews gxszxtbevo(ReviewsDto reviewsDto) {
        ReviewHeaderItem reviewHeaderItem;
        List sum = reviewsDto.getSum();
        if (sum == null || (reviewHeaderItem = iobyxmoadg(sum, reviewsDto.getPaging().getItemsAll())) == null) {
            reviewHeaderItem = new ReviewHeaderItem(null, null, 3, null);
        }
        ReviewUser reviewUserEablkybsjg = eablkybsjg(reviewsDto.getUser());
        List items = reviewsDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((ReviewItemDto) it.next()));
        }
        return new Reviews(reviewHeaderItem, reviewUserEablkybsjg, arrayList, y30.zoijcleaow.iobyxmoadg(reviewsDto.getPaging()));
    }

    private final ReviewHeaderItem iobyxmoadg(List list, Integer num) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc((ReviewSumItemDto) it.next()));
        }
        return new ReviewHeaderItem(num, arrayList);
    }

    private final ReviewItem ppxfxbqfkf(ReviewItemDto reviewItemDto) {
        String id2 = reviewItemDto.getId();
        LocalDate localDateIobyxmoadg = this.f26695iobyxmoadg.iobyxmoadg(reviewItemDto.getDate());
        String user = reviewItemDto.getUser();
        String str = user == null ? "" : user;
        Integer rating = reviewItemDto.getRating();
        int iIntValue = rating != null ? rating.intValue() : 0;
        String comment = reviewItemDto.getComment();
        String answer = reviewItemDto.getAnswer();
        return new ReviewItem(id2, localDateIobyxmoadg, str, iIntValue, comment, answer == null ? "" : answer, false, 0.0f, 0.0f, null, false, 1984, null);
    }

    private final ReviewSumItem wkgbmnqykc(ReviewSumItemDto reviewSumItemDto) {
        z02.zoijcleaow.iobyxmoadg iobyxmoadgVar = z02.zoijcleaow.f127536jyumaefscl;
        String ratingName = reviewSumItemDto.getRatingName();
        if (ratingName == null) {
            ratingName = "";
        }
        return new ReviewSumItem(iobyxmoadgVar.iobyxmoadg(ratingName), reviewSumItemDto.getRatingCount());
    }

    public final Reviews zoijcleaow(ReviewsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return gxszxtbevo(dto);
    }
}
