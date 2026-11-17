package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class oxmwwwfdhm extends RecyclerView.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCalendar f22703iobyxmoadg;

    class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f22705zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f22705zdlpuopuiu = i13;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            oxmwwwfdhm.this.f22703iobyxmoadg.crxdokpmqz(oxmwwwfdhm.this.f22703iobyxmoadg.dsvhmnatus().nufgyqmvbu(Month.ppxfxbqfkf(this.f22705zdlpuopuiu, oxmwwwfdhm.this.f22703iobyxmoadg.stevsuqkhv().f22639yggfygwlhe)));
            oxmwwwfdhm.this.f22703iobyxmoadg.jlmebxxoox(MaterialCalendar.draadjrbmk.DAY);
        }
    }

    public static class zoijcleaow extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final TextView f22706iobyxmoadg;

        zoijcleaow(TextView textView) {
            super(textView);
            this.f22706iobyxmoadg = textView;
        }
    }

    oxmwwwfdhm(MaterialCalendar materialCalendar) {
        this.f22703iobyxmoadg = materialCalendar;
    }

    private View.OnClickListener wkgbmnqykc(int i13) {
        return new iobyxmoadg(i13);
    }

    int eablkybsjg(int i13) {
        return i13 - this.f22703iobyxmoadg.dsvhmnatus().yggfygwlhe().f22637jyumaefscl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return this.f22703iobyxmoadg.dsvhmnatus().iwizpuwonk();
    }

    int gxszxtbevo(int i13) {
        return this.f22703iobyxmoadg.dsvhmnatus().yggfygwlhe().f22637jyumaefscl + i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zoijcleaow zoijcleaowVar, int i13) {
        int iGxszxtbevo = gxszxtbevo(i13);
        zoijcleaowVar.f22706iobyxmoadg.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iGxszxtbevo)));
        TextView textView = zoijcleaowVar.f22706iobyxmoadg;
        textView.setContentDescription(nufgyqmvbu.gtknphoqwx(textView.getContext(), iGxszxtbevo));
        com.google.android.material.datepicker.zoijcleaow zoijcleaowVarWypolnanlu = this.f22703iobyxmoadg.wypolnanlu();
        Calendar calendarGtknphoqwx = vdvldrhtss.gtknphoqwx();
        com.google.android.material.datepicker.iobyxmoadg iobyxmoadgVar = calendarGtknphoqwx.get(1) == iGxszxtbevo ? zoijcleaowVarWypolnanlu.f22716gxszxtbevo : zoijcleaowVarWypolnanlu.f22721wkgbmnqykc;
        Iterator it = this.f22703iobyxmoadg.kegysxyocb().W().iterator();
        while (it.hasNext()) {
            calendarGtknphoqwx.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarGtknphoqwx.get(1) == iGxszxtbevo) {
                iobyxmoadgVar = zoijcleaowVarWypolnanlu.f22715eablkybsjg;
            }
        }
        iobyxmoadgVar.wkgbmnqykc(zoijcleaowVar.f22706iobyxmoadg);
        zoijcleaowVar.f22706iobyxmoadg.setOnClickListener(wkgbmnqykc(iGxszxtbevo));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public zoijcleaow onCreateViewHolder(ViewGroup viewGroup, int i13) {
        return new zoijcleaow((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(da.nufgyqmvbu.mtrl_calendar_year, viewGroup, false));
    }
}
