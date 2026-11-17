package mj;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zdlpuopuiu {
    public static void iobyxmoadg(Appendable appendable, Object obj, tg.draadjrbmk draadjrbmkVar) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appendable, "<this>");
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
}
