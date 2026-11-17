package s51;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.CommentReferences;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: s51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2567iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f105577iobyxmoadg;

        static {
            int[] iArr = new int[e01.iobyxmoadg.values().length];
            try {
                iArr[e01.iobyxmoadg.RADIO_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e01.iobyxmoadg.CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e01.iobyxmoadg.CHECKBOX_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e01.iobyxmoadg.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105577iobyxmoadg = iArr;
        }
    }

    public static final t51.zoijcleaow iobyxmoadg(CommentReferences commentGroup) {
        zdlpuopuiu.btonecajqb(commentGroup, "commentGroup");
        if (commentGroup.getItems().isEmpty()) {
            commentGroup = null;
        }
        if (commentGroup == null) {
            return null;
        }
        String code = commentGroup.getCode();
        String title = commentGroup.getTitle();
        List items = commentGroup.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf(commentGroup.getCode(), (Reference) it.next(), false, 4, null));
        }
        return new t51.zoijcleaow(code, title, arrayList);
    }

    public static /* synthetic */ t51.iobyxmoadg ppxfxbqfkf(String str, Reference reference, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = reference.getChecked();
        }
        return zoijcleaow(str, reference, z13);
    }

    public static final t51.iobyxmoadg zoijcleaow(String groupCode, Reference reference, boolean z13) {
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(reference, "reference");
        int i13 = C2567iobyxmoadg.f105577iobyxmoadg[reference.getType().ordinal()];
        if (i13 == 1) {
            return new t51.iobyxmoadg.ppxfxbqfkf(reference.getCode(), reference.getName(), z13, groupCode);
        }
        if (i13 == 2) {
            return new t51.iobyxmoadg.C2697iobyxmoadg(reference.getCode(), reference.getName(), z13, groupCode);
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return new t51.iobyxmoadg.C2697iobyxmoadg(reference.getCode(), reference.getName(), z13, groupCode);
            }
            throw new NoWhenBranchMatchedException();
        }
        String code = reference.getCode();
        String name = reference.getName();
        String text = reference.getText();
        String placeholder = reference.getPlaceholder();
        Integer inputLimit = reference.getInputLimit();
        return new t51.iobyxmoadg.zoijcleaow(code, name, z13, groupCode, text, placeholder, inputLimit != null ? inputLimit.intValue() : 2000);
    }
}
