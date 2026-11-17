package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private final Context f12348iyctptxqzt;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private Spinner f12349lrnfpwlwnk;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private final ArrayAdapter f12350weqkydbzbr;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f12351zeieaojujs;

    class iobyxmoadg implements AdapterView.OnItemSelectedListener {
        iobyxmoadg() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i13, long j13) {
            if (i13 >= 0) {
                String string = DropDownPreference.this.skhdrjzrfn()[i13].toString();
                if (string.equals(DropDownPreference.this.igdgnonuha()) || !DropDownPreference.this.iobyxmoadg(string)) {
                    return;
                }
                DropDownPreference.this.wizcaqwiak(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dxjokdxxww.dropdownPreferenceStyle);
    }

    private void ageimvtcrz() {
        this.f12350weqkydbzbr.clear();
        if (iwxlajgraz() != null) {
            for (CharSequence charSequence : iwxlajgraz()) {
                this.f12350weqkydbzbr.add(charSequence.toString());
            }
        }
    }

    private int fiwbwshyhd(String str) {
        CharSequence[] charSequenceArrSkhdrjzrfn = skhdrjzrfn();
        if (str == null || charSequenceArrSkhdrjzrfn == null) {
            return -1;
        }
        for (int length = charSequenceArrSkhdrjzrfn.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArrSkhdrjzrfn[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        Spinner spinner = (Spinner) nufgyqmvbuVar.itemView.findViewById(draadjrbmk.spinner);
        this.f12349lrnfpwlwnk = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f12350weqkydbzbr);
        this.f12349lrnfpwlwnk.setOnItemSelectedListener(this.f12351zeieaojujs);
        this.f12349lrnfpwlwnk.setSelection(fiwbwshyhd(igdgnonuha()));
        super.hcddaimhww(nufgyqmvbuVar);
    }

    protected ArrayAdapter hszhottldk() {
        return new ArrayAdapter(this.f12348iyctptxqzt, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void jpowsppfya() {
        this.f12349lrnfpwlwnk.performClick();
    }

    @Override // androidx.preference.Preference
    protected void lmojexxdyd() {
        super.lmojexxdyd();
        ArrayAdapter arrayAdapter = this.f12350weqkydbzbr;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12351zeieaojujs = new iobyxmoadg();
        this.f12348iyctptxqzt = context;
        this.f12350weqkydbzbr = hszhottldk();
        ageimvtcrz();
    }
}
