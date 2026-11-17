package yzdjzghtvl;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final Set eablkybsjg(List list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            hashSet.add(list.get(i13));
        }
        return hashSet;
    }

    private static final void iobyxmoadg(Appendable appendable, Object obj, tg.draadjrbmk draadjrbmkVar) throws IOException {
        if (draadjrbmkVar != null) {
            appendable.append((CharSequence) draadjrbmkVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final String ppxfxbqfkf(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar) {
        return ((StringBuilder) zoijcleaow(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i13, charSequence4, draadjrbmkVar)).toString();
    }

    public static /* synthetic */ String wkgbmnqykc(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return ppxfxbqfkf(list, charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    private static final Appendable zoijcleaow(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar) throws IOException {
        appendable.append(charSequence2);
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = list.get(i15);
            i14++;
            if (i14 > 1) {
                appendable.append(charSequence);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            iobyxmoadg(appendable, obj, draadjrbmkVar);
        }
        if (i13 >= 0 && i14 > i13) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }
}
