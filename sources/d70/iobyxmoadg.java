package d70;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.CommentReferences;
import ru.myspar.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: d70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0501iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f27142iobyxmoadg;

        static {
            int[] iArr = new int[o10.iobyxmoadg.values().length];
            try {
                iArr[o10.iobyxmoadg.RADIO_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o10.iobyxmoadg.CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o10.iobyxmoadg.CHECKBOX_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o10.iobyxmoadg.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27142iobyxmoadg = iArr;
        }
    }

    public static final e70.zoijcleaow iobyxmoadg(CommentReferences commentGroup) {
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
        return new e70.zoijcleaow(code, title, arrayList);
    }

    public static /* synthetic */ e70.iobyxmoadg ppxfxbqfkf(String str, Reference reference, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = reference.getChecked();
        }
        return zoijcleaow(str, reference, z13);
    }

    public static final e70.iobyxmoadg zoijcleaow(String groupCode, Reference reference, boolean z13) {
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(reference, "reference");
        int i13 = C0501iobyxmoadg.f27142iobyxmoadg[reference.getType().ordinal()];
        if (i13 == 1) {
            return new e70.iobyxmoadg.ppxfxbqfkf(reference.getCode(), reference.getName(), z13, groupCode);
        }
        if (i13 == 2) {
            return new e70.iobyxmoadg.C0639iobyxmoadg(reference.getCode(), reference.getName(), z13, groupCode);
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return new e70.iobyxmoadg.C0639iobyxmoadg(reference.getCode(), reference.getName(), z13, groupCode);
            }
            throw new NoWhenBranchMatchedException();
        }
        String code = reference.getCode();
        String name = reference.getName();
        String text = reference.getText();
        String placeholder = reference.getPlaceholder();
        Integer inputLimit = reference.getInputLimit();
        return new e70.iobyxmoadg.zoijcleaow(code, name, z13, groupCode, text, placeholder, inputLimit != null ? inputLimit.intValue() : 2000);
    }
}
