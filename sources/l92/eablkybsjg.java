package l92;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.support_service.impl.domain.model.FAQItem;
import ru.myspar.support_service.impl.domain.model.QuestionItem;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {
    public static final wkgbmnqykc iobyxmoadg(FAQItem fAQItem) {
        zdlpuopuiu.btonecajqb(fAQItem, "<this>");
        String title = fAQItem.getTitle();
        List questions = fAQItem.getQuestions();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(questions, 10));
        Iterator it = questions.iterator();
        while (it.hasNext()) {
            arrayList.add(nufgyqmvbu.iobyxmoadg((QuestionItem) it.next()));
        }
        return new wkgbmnqykc(title, new dxjokdxxww(arrayList));
    }
}
