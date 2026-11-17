package skhdrjzrfn;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class uawqvzlxes {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final uawqvzlxes f107621iobyxmoadg = new uawqvzlxes();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f107622iobyxmoadg;

        static {
            int[] iArr = new int[hcddaimhww.values().length];
            try {
                iArr[hcddaimhww.EditableText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hcddaimhww.StaticText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f107622iobyxmoadg = iArr;
        }
    }

    private uawqvzlxes() {
    }

    public final TextClassifier iobyxmoadg(Context context, hcddaimhww hcddaimhwwVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i13 = iobyxmoadg.f107622iobyxmoadg[hcddaimhwwVar.ordinal()];
        if (i13 == 1) {
            str = "edittext";
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "textview";
        }
        nuxfzjnpeb.iobyxmoadg();
        return textClassificationManager.createTextClassificationSession(zeieaojujs.iobyxmoadg(context.getPackageName(), str).build());
    }

    public final LocaleList ppxfxbqfkf(r0.eablkybsjg eablkybsjgVar) {
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(eablkybsjgVar, 10));
        Iterator<E> it = eablkybsjgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0.wkgbmnqykc) it.next()).iobyxmoadg());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final boolean zoijcleaow(TextClassification textClassification) {
        return ((textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) || (textClassification.getIntent() == null && textClassification.getOnClickListener() == null)) ? false : true;
    }
}
