package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class draadjrbmk extends RecyclerView.nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f22665eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CalendarConstraints f22666iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DayViewDecorator f22667ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final MaterialCalendar.wflxmlrfwp f22668wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DateSelector f22669zoijcleaow;

    class iobyxmoadg implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f22671zdlpuopuiu;

        iobyxmoadg(MaterialCalendarGridView materialCalendarGridView) {
            this.f22671zdlpuopuiu = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
            if (this.f22671zdlpuopuiu.getAdapter().oxmwwwfdhm(i13)) {
                draadjrbmk.this.f22668wkgbmnqykc.iobyxmoadg(this.f22671zdlpuopuiu.getAdapter().getItem(i13).longValue());
            }
        }
    }

    public static class zoijcleaow extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final TextView f22672iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final MaterialCalendarGridView f22673zoijcleaow;

        zoijcleaow(LinearLayout linearLayout, boolean z13) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(da.gxszxtbevo.month_title);
            this.f22672iobyxmoadg = textView;
            jhduphickx.bfopjjpdmp(textView, true);
            this.f22673zoijcleaow = (MaterialCalendarGridView) linearLayout.findViewById(da.gxszxtbevo.month_grid);
            if (z13) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    draadjrbmk(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.wflxmlrfwp wflxmlrfwpVar) {
        Month monthYggfygwlhe = calendarConstraints.yggfygwlhe();
        Month monthBtonecajqb = calendarConstraints.btonecajqb();
        Month monthOxmwwwfdhm = calendarConstraints.oxmwwwfdhm();
        if (monthYggfygwlhe.compareTo(monthOxmwwwfdhm) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthOxmwwwfdhm.compareTo(monthBtonecajqb) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f22665eablkybsjg = (gtknphoqwx.f22686lqeggnwhkg * MaterialCalendar.tzroggbefp(context)) + (MaterialDatePicker.ntlheqmsrt(context) ? MaterialCalendar.tzroggbefp(context) : 0);
        this.f22666iobyxmoadg = calendarConstraints;
        this.f22669zoijcleaow = dateSelector;
        this.f22667ppxfxbqfkf = dayViewDecorator;
        this.f22668wkgbmnqykc = wflxmlrfwpVar;
        setHasStableIds(true);
    }

    CharSequence eablkybsjg(int i13) {
        return wkgbmnqykc(i13).btonecajqb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return this.f22666iobyxmoadg.wflxmlrfwp();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public long getItemId(int i13) {
        return this.f22666iobyxmoadg.yggfygwlhe().wflxmlrfwp(i13).gtknphoqwx();
    }

    int gxszxtbevo(Month month) {
        return this.f22666iobyxmoadg.yggfygwlhe().oxmwwwfdhm(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zoijcleaow zoijcleaowVar, int i13) {
        Month monthWflxmlrfwp = this.f22666iobyxmoadg.yggfygwlhe().wflxmlrfwp(i13);
        zoijcleaowVar.f22672iobyxmoadg.setText(monthWflxmlrfwp.btonecajqb());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) zoijcleaowVar.f22673zoijcleaow.findViewById(da.gxszxtbevo.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthWflxmlrfwp.equals(materialCalendarGridView.getAdapter().f22690iobyxmoadg)) {
            gtknphoqwx gtknphoqwxVar = new gtknphoqwx(monthWflxmlrfwp, this.f22669zoijcleaow, this.f22666iobyxmoadg, this.f22667ppxfxbqfkf);
            materialCalendarGridView.setNumColumns(monthWflxmlrfwp.f22636iwizpuwonk);
            materialCalendarGridView.setAdapter((ListAdapter) gtknphoqwxVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().vdvldrhtss(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new iobyxmoadg(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public zoijcleaow onCreateViewHolder(ViewGroup viewGroup, int i13) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(da.nufgyqmvbu.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.ntlheqmsrt(viewGroup.getContext())) {
            return new zoijcleaow(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.vdvldrhtss(-1, this.f22665eablkybsjg));
        return new zoijcleaow(linearLayout, true);
    }

    Month wkgbmnqykc(int i13) {
        return this.f22666iobyxmoadg.yggfygwlhe().wflxmlrfwp(i13);
    }
}
