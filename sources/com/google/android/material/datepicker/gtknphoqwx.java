package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class gtknphoqwx extends BaseAdapter {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final int f22686lqeggnwhkg = vdvldrhtss.wflxmlrfwp().getMaximum(4);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f22687nufgyqmvbu = (vdvldrhtss.wflxmlrfwp().getMaximum(5) + vdvldrhtss.wflxmlrfwp().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final CalendarConstraints f22688eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final DayViewDecorator f22689gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Month f22690iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Collection f22691ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    zoijcleaow f22692wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final DateSelector f22693zoijcleaow;

    gtknphoqwx(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f22690iobyxmoadg = month;
        this.f22693zoijcleaow = dateSelector;
        this.f22688eablkybsjg = calendarConstraints;
        this.f22689gxszxtbevo = dayViewDecorator;
        this.f22691ppxfxbqfkf = dateSelector.W();
    }

    private boolean btonecajqb(long j13) {
        Iterator it = this.f22693zoijcleaow.W().iterator();
        while (it.hasNext()) {
            if (vdvldrhtss.iobyxmoadg(j13) == vdvldrhtss.iobyxmoadg(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean draadjrbmk(long j13) {
        return vdvldrhtss.gtknphoqwx().getTimeInMillis() == j13;
    }

    private void gxszxtbevo(Context context) {
        if (this.f22692wkgbmnqykc == null) {
            this.f22692wkgbmnqykc = new zoijcleaow(context);
        }
    }

    private void ojitshcjhn(TextView textView, long j13, int i13) {
        boolean z13;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strPpxfxbqfkf = ppxfxbqfkf(context, j13);
        textView.setContentDescription(strPpxfxbqfkf);
        boolean zNuxfzjnpeb = this.f22688eablkybsjg.dxjokdxxww().nuxfzjnpeb(j13);
        if (zNuxfzjnpeb) {
            textView.setEnabled(true);
            boolean zBtonecajqb = btonecajqb(j13);
            textView.setSelected(zBtonecajqb);
            if (zBtonecajqb) {
                iobyxmoadgVar2 = this.f22692wkgbmnqykc.f22722zoijcleaow;
            } else {
                iobyxmoadgVar2 = draadjrbmk(j13) ? this.f22692wkgbmnqykc.f22720ppxfxbqfkf : this.f22692wkgbmnqykc.f22717iobyxmoadg;
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            z13 = zBtonecajqb;
        } else {
            textView.setEnabled(false);
            z13 = false;
            iobyxmoadgVar = this.f22692wkgbmnqykc.f22718lqeggnwhkg;
        }
        DayViewDecorator dayViewDecorator = this.f22689gxszxtbevo;
        if (dayViewDecorator == null || i13 == -1) {
            iobyxmoadgVar.wkgbmnqykc(textView);
            return;
        }
        Month month = this.f22690iobyxmoadg;
        int i14 = month.f22637jyumaefscl;
        int i15 = month.f22639yggfygwlhe;
        ColorStateList colorStateListZoijcleaow = dayViewDecorator.zoijcleaow(context, i14, i15, i13, zNuxfzjnpeb, z13);
        boolean z14 = z13;
        iobyxmoadgVar.eablkybsjg(textView, colorStateListZoijcleaow, this.f22689gxszxtbevo.dxjokdxxww(context, i14, i15, i13, zNuxfzjnpeb, z14));
        Drawable drawableEablkybsjg = this.f22689gxszxtbevo.eablkybsjg(context, i14, i15, i13, zNuxfzjnpeb, z14);
        Drawable drawableLqeggnwhkg = this.f22689gxszxtbevo.lqeggnwhkg(context, i14, i15, i13, zNuxfzjnpeb, z14);
        Drawable drawableGxszxtbevo = this.f22689gxszxtbevo.gxszxtbevo(context, i14, i15, i13, zNuxfzjnpeb, z14);
        boolean z15 = z13;
        textView.setCompoundDrawables(drawableEablkybsjg, drawableLqeggnwhkg, drawableGxszxtbevo, this.f22689gxszxtbevo.ppxfxbqfkf(context, i14, i15, i13, zNuxfzjnpeb, z15));
        textView.setContentDescription(this.f22689gxszxtbevo.nufgyqmvbu(context, i14, i15, i13, zNuxfzjnpeb, z15, strPpxfxbqfkf));
    }

    private String ppxfxbqfkf(Context context, long j13) {
        return nufgyqmvbu.eablkybsjg(context, j13, draadjrbmk(j13), gtknphoqwx(j13), lqeggnwhkg(j13));
    }

    private void rgvfuqvkyq(MaterialCalendarGridView materialCalendarGridView, long j13) {
        if (Month.eablkybsjg(j13).equals(this.f22690iobyxmoadg)) {
            int iDxjokdxxww = this.f22690iobyxmoadg.dxjokdxxww(j13);
            ojitshcjhn((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().iobyxmoadg(iDxjokdxxww) - materialCalendarGridView.getFirstVisiblePosition()), j13, iDxjokdxxww);
        }
    }

    int agtfadlqog(int i13) {
        return (i13 - zoijcleaow()) + 1;
    }

    boolean dxjokdxxww(int i13) {
        return (i13 + 1) % this.f22690iobyxmoadg.f22636iwizpuwonk == 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i13, View view, ViewGroup viewGroup) {
        int i14;
        gxszxtbevo(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(da.nufgyqmvbu.mtrl_calendar_day, viewGroup, false);
        }
        int iZoijcleaow = i13 - zoijcleaow();
        if (iZoijcleaow >= 0) {
            Month month = this.f22690iobyxmoadg;
            if (iZoijcleaow >= month.f22634cqumvgiudr) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i14 = -1;
            } else {
                i14 = iZoijcleaow + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i14)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i14 = -1;
        }
        Long item = getItem(i13);
        if (item == null) {
            return textView;
        }
        ojitshcjhn(textView, item.longValue(), i14);
        return textView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f22687nufgyqmvbu;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i13) {
        return i13 / this.f22690iobyxmoadg.f22636iwizpuwonk;
    }

    boolean gtknphoqwx(long j13) {
        Iterator it = this.f22693zoijcleaow.q().iterator();
        while (it.hasNext()) {
            Object obj = ((u1.ppxfxbqfkf) it.next()).f112467iobyxmoadg;
            if (obj != null && ((Long) obj).longValue() == j13) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int iobyxmoadg(int i13) {
        return zoijcleaow() + (i13 - 1);
    }

    boolean lqeggnwhkg(long j13) {
        Iterator it = this.f22693zoijcleaow.q().iterator();
        while (it.hasNext()) {
            Object obj = ((u1.ppxfxbqfkf) it.next()).f112468zoijcleaow;
            if (obj != null && ((Long) obj).longValue() == j13) {
                return true;
            }
        }
        return false;
    }

    boolean nufgyqmvbu(int i13) {
        return i13 % this.f22690iobyxmoadg.f22636iwizpuwonk == 0;
    }

    boolean oxmwwwfdhm(int i13) {
        return i13 >= zoijcleaow() && i13 <= wflxmlrfwp();
    }

    public void vdvldrhtss(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f22691ppxfxbqfkf.iterator();
        while (it.hasNext()) {
            rgvfuqvkyq(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        DateSelector dateSelector = this.f22693zoijcleaow;
        if (dateSelector != null) {
            Iterator it2 = dateSelector.W().iterator();
            while (it2.hasNext()) {
                rgvfuqvkyq(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f22691ppxfxbqfkf = this.f22693zoijcleaow.W();
        }
    }

    int wflxmlrfwp() {
        return (zoijcleaow() + this.f22690iobyxmoadg.f22634cqumvgiudr) - 1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i13) {
        if (i13 < zoijcleaow() || i13 > wflxmlrfwp()) {
            return null;
        }
        return Long.valueOf(this.f22690iobyxmoadg.nufgyqmvbu(agtfadlqog(i13)));
    }

    int zoijcleaow() {
        return this.f22690iobyxmoadg.lqeggnwhkg(this.f22688eablkybsjg.gtknphoqwx());
    }
}
