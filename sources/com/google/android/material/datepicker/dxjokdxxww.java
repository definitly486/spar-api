package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww extends BaseAdapter {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f22674wkgbmnqykc = 4;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Calendar f22675iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f22676ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f22677zoijcleaow;

    public dxjokdxxww() {
        Calendar calendarWflxmlrfwp = vdvldrhtss.wflxmlrfwp();
        this.f22675iobyxmoadg = calendarWflxmlrfwp;
        this.f22677zoijcleaow = calendarWflxmlrfwp.getMaximum(7);
        this.f22676ppxfxbqfkf = calendarWflxmlrfwp.getFirstDayOfWeek();
    }

    private int zoijcleaow(int i13) {
        int i14 = i13 + this.f22676ppxfxbqfkf;
        int i15 = this.f22677zoijcleaow;
        return i14 > i15 ? i14 - i15 : i14;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22677zoijcleaow;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i13) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i13, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(da.nufgyqmvbu.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f22675iobyxmoadg.set(7, zoijcleaow(i13));
        textView.setText(this.f22675iobyxmoadg.getDisplayName(7, f22674wkgbmnqykc, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(da.btonecajqb.mtrl_picker_day_of_week_column_header), this.f22675iobyxmoadg.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i13) {
        if (i13 >= this.f22677zoijcleaow) {
            return null;
        }
        return Integer.valueOf(zoijcleaow(i13));
    }

    public dxjokdxxww(int i13) {
        Calendar calendarWflxmlrfwp = vdvldrhtss.wflxmlrfwp();
        this.f22675iobyxmoadg = calendarWflxmlrfwp;
        this.f22677zoijcleaow = calendarWflxmlrfwp.getMaximum(7);
        this.f22676ppxfxbqfkf = i13;
    }
}
