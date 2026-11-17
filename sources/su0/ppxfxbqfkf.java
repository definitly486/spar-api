package su0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ou0.LoyaltyCategoriesResponse;
import ou0.LoyaltyCategoryDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final lu0.iobyxmoadg iobyxmoadg(LoyaltyCategoriesResponse loyaltyCategoriesResponse) {
        zdlpuopuiu.btonecajqb(loyaltyCategoriesResponse, "<this>");
        String month = loyaltyCategoriesResponse.getMonth();
        String text = loyaltyCategoriesResponse.getText();
        int quantityForChoose = loyaltyCategoriesResponse.getQuantityForChoose();
        int quantityChosen = loyaltyCategoriesResponse.getQuantityChosen();
        List categories = loyaltyCategoriesResponse.getCategories();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(categories, 10));
        Iterator it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow.iobyxmoadg((LoyaltyCategoryDto) it.next()));
        }
        return new lu0.iobyxmoadg(month, text, quantityForChoose, quantityChosen, arrayList);
    }
}
