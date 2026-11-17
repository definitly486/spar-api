package y30;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final Paging iobyxmoadg(PagingDto pagingDto) {
        zdlpuopuiu.btonecajqb(pagingDto, "<this>");
        Integer itemsAll = pagingDto.getItemsAll();
        int iIntValue = itemsAll != null ? itemsAll.intValue() : 0;
        Integer itemsOnPage = pagingDto.getItemsOnPage();
        int iIntValue2 = itemsOnPage != null ? itemsOnPage.intValue() : 0;
        Integer pages = pagingDto.getPages();
        return new Paging(iIntValue, iIntValue2, pages != null ? pages.intValue() : 0);
    }
}
