package vo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.cart.CommentReferences;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iwizpuwonk f117616zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117617iobyxmoadg;

        static {
            int[] iArr = new int[e01.iobyxmoadg.values().length];
            try {
                iArr[e01.iobyxmoadg.CHECKBOX_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f117617iobyxmoadg = iArr;
        }
    }

    public zoijcleaow(iwizpuwonk referenceUiModelMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(referenceUiModelMapper, "referenceUiModelMapper");
        this.f117616zdlpuopuiu = referenceUiModelMapper;
    }

    private final boolean iobyxmoadg(Reference reference) {
        if (iobyxmoadg.f117617iobyxmoadg[reference.getType().ordinal()] == 1) {
            return reference.getChecked() && !mj.kcexrzcfyt.zfvoamnweg(reference.getText());
        }
        return reference.getChecked();
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public wo0.wkgbmnqykc invoke(List comments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comments, "comments");
        ArrayList arrayList = new ArrayList();
        Iterator it = comments.iterator();
        while (it.hasNext()) {
            List items = ((CommentReferences) it.next()).getItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (iobyxmoadg((Reference) obj)) {
                    arrayList2.add(obj);
                }
            }
            iwizpuwonk iwizpuwonkVar = this.f117616zdlpuopuiu;
            ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(iwizpuwonkVar.invoke(it2.next()));
            }
            hg.jyumaefscl.istkbnxepw(arrayList, arrayList3);
        }
        List listIobyxmoadg = q11.zoijcleaow.iobyxmoadg(arrayList);
        if (listIobyxmoadg != null) {
            return new wo0.wkgbmnqykc(listIobyxmoadg);
        }
        return null;
    }
}
