package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialTextInputPicker<S> extends agtfadlqog {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private CalendarConstraints f22630iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private DateSelector f22631jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f22632yggfygwlhe;

    class iobyxmoadg extends wflxmlrfwp {
        iobyxmoadg() {
        }

        @Override // com.google.android.material.datepicker.wflxmlrfwp
        public void iobyxmoadg() {
            Iterator it = MaterialTextInputPicker.this.f22663zdlpuopuiu.iterator();
            while (it.hasNext()) {
                ((wflxmlrfwp) it.next()).iobyxmoadg();
            }
        }

        @Override // com.google.android.material.datepicker.wflxmlrfwp
        public void zoijcleaow(Object obj) {
            Iterator it = MaterialTextInputPicker.this.f22663zdlpuopuiu.iterator();
            while (it.hasNext()) {
                ((wflxmlrfwp) it.next()).zoijcleaow(obj);
            }
        }
    }

    static MaterialTextInputPicker iozdgvuglv(DateSelector dateSelector, int i13, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i13);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22632yggfygwlhe = bundle.getInt("THEME_RES_ID_KEY");
        this.f22631jyumaefscl = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f22630iwizpuwonk = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f22631jyumaefscl.D(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f22632yggfygwlhe)), viewGroup, bundle, this.f22630iwizpuwonk, new iobyxmoadg());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f22632yggfygwlhe);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f22631jyumaefscl);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f22630iwizpuwonk);
    }
}
