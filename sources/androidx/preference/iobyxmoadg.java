package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends Preference {

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private long f12505metgxyhuhe;

    iobyxmoadg(Context context, List list, long j13) {
        super(context);
        lrnfpwlwnk();
        zeieaojujs(list);
        this.f12505metgxyhuhe = j13 + 1000000;
    }

    private void lrnfpwlwnk() {
        metgxyhuhe(agtfadlqog.expand_button);
        jztzpxfvev(gtknphoqwx.ic_arrow_down_24dp);
        sflfametgt(ojitshcjhn.expand_button_title);
        uwvvkdfqfp(999);
    }

    private void zeieaojujs(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequenceEsjtqupxsv = preference.esjtqupxsv();
            boolean z13 = preference instanceof PreferenceGroup;
            if (z13 && !TextUtils.isEmpty(charSequenceEsjtqupxsv)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.ojitshcjhn())) {
                if (z13) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceEsjtqupxsv)) {
                string = string == null ? charSequenceEsjtqupxsv : lqeggnwhkg().getString(ojitshcjhn.summary_collapsed_preference_list, string, charSequenceEsjtqupxsv);
            }
        }
        yfnezrywwk(string);
    }

    @Override // androidx.preference.Preference
    long gtknphoqwx() {
        return this.f12505metgxyhuhe;
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        super.hcddaimhww(nufgyqmvbuVar);
        nufgyqmvbuVar.gxszxtbevo(false);
    }
}
