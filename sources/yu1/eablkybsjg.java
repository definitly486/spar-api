package yu1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.support_service.impl.domain.model.FAQItem;
import ru.myspar.proloyalty.support_service.impl.domain.model.QuestionItem;
import ru.myspar.proloyalty.support_service.impl.domain.model.SupportAction;
import ru.myspar.proloyalty.support_service.impl.domain.model.SupportInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {
    public static final SupportInfo iobyxmoadg(SupportInfoDto supportInfoDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listWflxmlrfwp;
        SupportAction supportAction;
        zdlpuopuiu.btonecajqb(supportInfoDto, "<this>");
        String pic = supportInfoDto.getPic();
        String str = pic == null ? "" : pic;
        String title = supportInfoDto.getTitle();
        String str2 = title == null ? "" : title;
        String workingHoursText = supportInfoDto.getWorkingHoursText();
        String str3 = workingHoursText == null ? "" : workingHoursText;
        List<ButtonDto> buttons = supportInfoDto.getButtons();
        if (buttons != null) {
            ArrayList arrayList3 = new ArrayList();
            for (ButtonDto buttonDto : buttons) {
                ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(buttonDto.getNavLink());
                ojitshcjhn ojitshcjhnVar = ojitshcjhnVarIobyxmoadg.nufgyqmvbu() ? ojitshcjhnVarIobyxmoadg : null;
                if (ojitshcjhnVar != null) {
                    String icon = buttonDto.getIcon();
                    if (icon == null) {
                        icon = "";
                    }
                    String name = buttonDto.getName();
                    supportAction = new SupportAction(icon, name == null ? "" : name, new NavigationPayload(ojitshcjhnVar, buttonDto.getReference(), null, null, false, null, null, false, 252, null));
                } else {
                    supportAction = null;
                }
                if (supportAction != null) {
                    arrayList3.add(supportAction);
                }
            }
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                if (hashSet.add(((SupportAction) obj).getName())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp2 = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        List<FAQDto> faq = supportInfoDto.getFaq();
        if (faq != null) {
            ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(faq, 10));
            for (FAQDto fAQDto : faq) {
                String title2 = fAQDto.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                List<QuestionDto> questions = fAQDto.getQuestions();
                if (questions != null) {
                    listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(questions, 10));
                    for (QuestionDto questionDto : questions) {
                        String question = questionDto.getQuestion();
                        if (question == null) {
                            question = "";
                        }
                        String answer = questionDto.getAnswer();
                        if (answer == null) {
                            answer = "";
                        }
                        listWflxmlrfwp.add(new QuestionItem(question, answer));
                    }
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                arrayList4.add(new FAQItem(title2, listWflxmlrfwp));
            }
            HashSet hashSet2 = new HashSet();
            arrayList2 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (hashSet2.add(((FAQItem) obj2).getTitle())) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        return new SupportInfo(str, str2, str3, listWflxmlrfwp2, arrayList2 == null ? jyumaefscl.wflxmlrfwp() : arrayList2);
    }
}
