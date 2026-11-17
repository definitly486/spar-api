package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.jyumaefscl;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendar<S> extends agtfadlqog {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private View f22552cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private DayViewDecorator f22553cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Month f22554esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private View f22555iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private RecyclerView f22556istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private CalendarConstraints f22557iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private DateSelector f22558jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private draadjrbmk f22559lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private View f22560lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private com.google.android.material.datepicker.zoijcleaow f22561pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private View f22562yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f22563yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private RecyclerView f22564zynmafqrjb;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final Object f22550wwaezpbzkn = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    static final Object f22551ylkuphrtab = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final Object f22549pkzmftpjix = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    static final Object f22548hcddaimhww = "SELECTOR_TOGGLE_TAG";

    class btonecajqb implements View.OnClickListener {
        btonecajqb() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.vipkmwdibw();
        }
    }

    enum draadjrbmk {
        DAY,
        YEAR
    }

    class dxjokdxxww extends RecyclerView.yggfygwlhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.draadjrbmk f22569iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ MaterialButton f22571zoijcleaow;

        dxjokdxxww(com.google.android.material.datepicker.draadjrbmk draadjrbmkVar, MaterialButton materialButton) {
            this.f22569iobyxmoadg = draadjrbmkVar;
            this.f22571zoijcleaow = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
        public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
            if (i13 == 0) {
                recyclerView.announceForAccessibility(this.f22571zoijcleaow.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
        public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
            int iS0 = i13 < 0 ? MaterialCalendar.this.ntlheqmsrt().s0() : MaterialCalendar.this.ntlheqmsrt().v0();
            MaterialCalendar.this.f22554esjtqupxsv = this.f22569iobyxmoadg.wkgbmnqykc(iS0);
            this.f22571zoijcleaow.setText(this.f22569iobyxmoadg.eablkybsjg(iS0));
        }
    }

    class eablkybsjg implements wflxmlrfwp {
        eablkybsjg() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.wflxmlrfwp
        public void iobyxmoadg(long j13) {
            if (MaterialCalendar.this.f22557iwizpuwonk.dxjokdxxww().nuxfzjnpeb(j13)) {
                MaterialCalendar.this.f22558jyumaefscl.h0(j13);
                Iterator it = MaterialCalendar.this.f22663zdlpuopuiu.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.datepicker.wflxmlrfwp) it.next()).zoijcleaow(MaterialCalendar.this.f22558jyumaefscl.Z());
                }
                MaterialCalendar.this.f22556istkbnxepw.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f22564zynmafqrjb != null) {
                    MaterialCalendar.this.f22564zynmafqrjb.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    class gtknphoqwx implements View.OnClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.draadjrbmk f22574zdlpuopuiu;

        gtknphoqwx(com.google.android.material.datepicker.draadjrbmk draadjrbmkVar) {
            this.f22574zdlpuopuiu = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iS0 = MaterialCalendar.this.ntlheqmsrt().s0() + 1;
            if (iS0 < MaterialCalendar.this.f22556istkbnxepw.getAdapter().getItemCount()) {
                MaterialCalendar.this.crxdokpmqz(this.f22574zdlpuopuiu.wkgbmnqykc(iS0));
            }
        }
    }

    class gxszxtbevo extends v1.iobyxmoadg {
        gxszxtbevo() {
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.mhtqkkgtqm(false);
        }
    }

    class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.draadjrbmk f22577zdlpuopuiu;

        iobyxmoadg(com.google.android.material.datepicker.draadjrbmk draadjrbmkVar) {
            this.f22577zdlpuopuiu = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iV0 = MaterialCalendar.this.ntlheqmsrt().v0() - 1;
            if (iV0 >= 0) {
                MaterialCalendar.this.crxdokpmqz(this.f22577zdlpuopuiu.wkgbmnqykc(iV0));
            }
        }
    }

    class lqeggnwhkg extends RecyclerView.ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Calendar f22578iobyxmoadg = vdvldrhtss.wflxmlrfwp();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Calendar f22580zoijcleaow = vdvldrhtss.wflxmlrfwp();

        lqeggnwhkg() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
            if ((recyclerView.getAdapter() instanceof oxmwwwfdhm) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (u1.ppxfxbqfkf ppxfxbqfkfVar : MaterialCalendar.this.f22558jyumaefscl.q()) {
                    Object obj = ppxfxbqfkfVar.f112467iobyxmoadg;
                    if (obj != null && ppxfxbqfkfVar.f112468zoijcleaow != null) {
                        this.f22578iobyxmoadg.setTimeInMillis(((Long) obj).longValue());
                        this.f22580zoijcleaow.setTimeInMillis(((Long) ppxfxbqfkfVar.f112468zoijcleaow).longValue());
                        int iEablkybsjg = oxmwwwfdhmVar.eablkybsjg(this.f22578iobyxmoadg.get(1));
                        int iEablkybsjg2 = oxmwwwfdhmVar.eablkybsjg(this.f22580zoijcleaow.get(1));
                        View viewMbcevpiqjq = gridLayoutManager.mbcevpiqjq(iEablkybsjg);
                        View viewMbcevpiqjq2 = gridLayoutManager.mbcevpiqjq(iEablkybsjg2);
                        int iQ1 = iEablkybsjg / gridLayoutManager.q1();
                        int iQ2 = iEablkybsjg2 / gridLayoutManager.q1();
                        int i13 = iQ1;
                        while (i13 <= iQ2) {
                            View viewMbcevpiqjq3 = gridLayoutManager.mbcevpiqjq(gridLayoutManager.q1() * i13);
                            if (viewMbcevpiqjq3 != null) {
                                canvas.drawRect((i13 != iQ1 || viewMbcevpiqjq == null) ? 0 : viewMbcevpiqjq.getLeft() + (viewMbcevpiqjq.getWidth() / 2), viewMbcevpiqjq3.getTop() + MaterialCalendar.this.f22561pmvmpeiblj.f22721wkgbmnqykc.ppxfxbqfkf(), (i13 != iQ2 || viewMbcevpiqjq2 == null) ? recyclerView.getWidth() : viewMbcevpiqjq2.getLeft() + (viewMbcevpiqjq2.getWidth() / 2), viewMbcevpiqjq3.getBottom() - MaterialCalendar.this.f22561pmvmpeiblj.f22721wkgbmnqykc.zoijcleaow(), MaterialCalendar.this.f22561pmvmpeiblj.f22719nufgyqmvbu);
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    class nufgyqmvbu extends v1.iobyxmoadg {
        nufgyqmvbu() {
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.roivzttewh(MaterialCalendar.this.f22560lmojexxdyd.getVisibility() == 0 ? MaterialCalendar.this.getString(da.btonecajqb.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(da.btonecajqb.mtrl_picker_toggle_to_day_selection));
        }
    }

    class ppxfxbqfkf extends v1.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.ydmasvzmpa(null);
        }
    }

    interface wflxmlrfwp {
        void iobyxmoadg(long j13);
    }

    class wkgbmnqykc extends ojitshcjhn {

        /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
        final /* synthetic */ int f22584jhduphickx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(Context context, int i13, boolean z13, int i14) {
            super(context, i13, z13);
            this.f22584jhduphickx = i14;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void f0(RecyclerView.zynmafqrjb zynmafqrjbVar, int[] iArr) {
            if (this.f22584jhduphickx == 0) {
                iArr[0] = MaterialCalendar.this.f22556istkbnxepw.getWidth();
                iArr[1] = MaterialCalendar.this.f22556istkbnxepw.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f22556istkbnxepw.getHeight();
                iArr[1] = MaterialCalendar.this.f22556istkbnxepw.getHeight();
            }
        }
    }

    class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f22586zdlpuopuiu;

        zoijcleaow(int i13) {
            this.f22586zdlpuopuiu = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f22556istkbnxepw.J(this.f22586zdlpuopuiu);
        }
    }

    private RecyclerView.ojitshcjhn cllcsxoeiz() {
        return new lqeggnwhkg();
    }

    private void hkdspvbjdz(View view, com.google.android.material.datepicker.draadjrbmk draadjrbmkVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(da.gxszxtbevo.month_navigation_fragment_toggle);
        materialButton.setTag(f22548hcddaimhww);
        jhduphickx.oipsdeybqn(materialButton, new nufgyqmvbu());
        View viewFindViewById = view.findViewById(da.gxszxtbevo.month_navigation_previous);
        this.f22552cdpycssgdh = viewFindViewById;
        viewFindViewById.setTag(f22551ylkuphrtab);
        View viewFindViewById2 = view.findViewById(da.gxszxtbevo.month_navigation_next);
        this.f22562yadqdtsiqt = viewFindViewById2;
        viewFindViewById2.setTag(f22549pkzmftpjix);
        this.f22555iozdgvuglv = view.findViewById(da.gxszxtbevo.mtrl_calendar_year_selector_frame);
        this.f22560lmojexxdyd = view.findViewById(da.gxszxtbevo.mtrl_calendar_day_selector_frame);
        jlmebxxoox(draadjrbmk.DAY);
        materialButton.setText(this.f22554esjtqupxsv.btonecajqb());
        this.f22556istkbnxepw.agtfadlqog(new dxjokdxxww(draadjrbmkVar, materialButton));
        materialButton.setOnClickListener(new btonecajqb());
        this.f22562yadqdtsiqt.setOnClickListener(new gtknphoqwx(draadjrbmkVar));
        this.f22552cdpycssgdh.setOnClickListener(new iobyxmoadg(draadjrbmkVar));
    }

    private static int mbcevpiqjq(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(da.wkgbmnqykc.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(da.wkgbmnqykc.mtrl_calendar_days_of_week_height);
        int i13 = com.google.android.material.datepicker.gtknphoqwx.f22686lqeggnwhkg;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(da.wkgbmnqykc.mtrl_calendar_day_height) * i13) + ((i13 - 1) * resources.getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_bottom_padding);
    }

    private void ribwqtqdhb() {
        jhduphickx.oipsdeybqn(this.f22556istkbnxepw, new gxszxtbevo());
    }

    private void sopmlzcsov(int i13) {
        this.f22556istkbnxepw.post(new zoijcleaow(i13));
    }

    static int tzroggbefp(Context context) {
        return context.getResources().getDimensionPixelSize(da.wkgbmnqykc.mtrl_calendar_day_height);
    }

    public static MaterialCalendar ulzqkzuiru(DateSelector dateSelector, int i13, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i13);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.oxmwwwfdhm());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    @Override // com.google.android.material.datepicker.agtfadlqog
    public boolean cdpycssgdh(com.google.android.material.datepicker.wflxmlrfwp wflxmlrfwpVar) {
        return super.cdpycssgdh(wflxmlrfwpVar);
    }

    void crxdokpmqz(Month month) {
        com.google.android.material.datepicker.draadjrbmk draadjrbmkVar = (com.google.android.material.datepicker.draadjrbmk) this.f22556istkbnxepw.getAdapter();
        int iGxszxtbevo = draadjrbmkVar.gxszxtbevo(month);
        int iGxszxtbevo2 = iGxszxtbevo - draadjrbmkVar.gxszxtbevo(this.f22554esjtqupxsv);
        boolean z13 = Math.abs(iGxszxtbevo2) > 3;
        boolean z14 = iGxszxtbevo2 > 0;
        this.f22554esjtqupxsv = month;
        if (z13 && z14) {
            this.f22556istkbnxepw.A(iGxszxtbevo - 3);
            sopmlzcsov(iGxszxtbevo);
        } else if (!z13) {
            sopmlzcsov(iGxszxtbevo);
        } else {
            this.f22556istkbnxepw.A(iGxszxtbevo + 3);
            sopmlzcsov(iGxszxtbevo);
        }
    }

    CalendarConstraints dsvhmnatus() {
        return this.f22557iwizpuwonk;
    }

    void jlmebxxoox(draadjrbmk draadjrbmkVar) {
        this.f22559lereixgezr = draadjrbmkVar;
        if (draadjrbmkVar == draadjrbmk.YEAR) {
            this.f22564zynmafqrjb.getLayoutManager().Q(((oxmwwwfdhm) this.f22564zynmafqrjb.getAdapter()).eablkybsjg(this.f22554esjtqupxsv.f22637jyumaefscl));
            this.f22555iozdgvuglv.setVisibility(0);
            this.f22560lmojexxdyd.setVisibility(8);
            this.f22552cdpycssgdh.setVisibility(8);
            this.f22562yadqdtsiqt.setVisibility(8);
            return;
        }
        if (draadjrbmkVar == draadjrbmk.DAY) {
            this.f22555iozdgvuglv.setVisibility(8);
            this.f22560lmojexxdyd.setVisibility(0);
            this.f22552cdpycssgdh.setVisibility(0);
            this.f22562yadqdtsiqt.setVisibility(0);
            crxdokpmqz(this.f22554esjtqupxsv);
        }
    }

    public DateSelector kegysxyocb() {
        return this.f22558jyumaefscl;
    }

    LinearLayoutManager ntlheqmsrt() {
        return (LinearLayoutManager) this.f22556istkbnxepw.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22563yggfygwlhe = bundle.getInt("THEME_RES_ID_KEY");
        this.f22558jyumaefscl = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f22557iwizpuwonk = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f22553cqumvgiudr = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f22554esjtqupxsv = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13;
        int i14;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f22563yggfygwlhe);
        this.f22561pmvmpeiblj = new com.google.android.material.datepicker.zoijcleaow(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthYggfygwlhe = this.f22557iwizpuwonk.yggfygwlhe();
        if (MaterialDatePicker.ntlheqmsrt(contextThemeWrapper)) {
            i13 = da.nufgyqmvbu.mtrl_calendar_vertical;
            i14 = 1;
        } else {
            i13 = da.nufgyqmvbu.mtrl_calendar_horizontal;
            i14 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i13, viewGroup, false);
        viewInflate.setMinimumHeight(mbcevpiqjq(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(da.gxszxtbevo.mtrl_calendar_days_of_week);
        jhduphickx.oipsdeybqn(gridView, new ppxfxbqfkf());
        int iGtknphoqwx = this.f22557iwizpuwonk.gtknphoqwx();
        gridView.setAdapter((ListAdapter) (iGtknphoqwx > 0 ? new com.google.android.material.datepicker.dxjokdxxww(iGtknphoqwx) : new com.google.android.material.datepicker.dxjokdxxww()));
        gridView.setNumColumns(monthYggfygwlhe.f22636iwizpuwonk);
        gridView.setEnabled(false);
        this.f22556istkbnxepw = (RecyclerView) viewInflate.findViewById(da.gxszxtbevo.mtrl_calendar_months);
        this.f22556istkbnxepw.setLayoutManager(new wkgbmnqykc(getContext(), i14, false, i14));
        this.f22556istkbnxepw.setTag(f22550wwaezpbzkn);
        com.google.android.material.datepicker.draadjrbmk draadjrbmkVar = new com.google.android.material.datepicker.draadjrbmk(contextThemeWrapper, this.f22558jyumaefscl, this.f22557iwizpuwonk, this.f22553cqumvgiudr, new eablkybsjg());
        this.f22556istkbnxepw.setAdapter(draadjrbmkVar);
        int integer = contextThemeWrapper.getResources().getInteger(da.lqeggnwhkg.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(da.gxszxtbevo.mtrl_calendar_year_selector_frame);
        this.f22564zynmafqrjb = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f22564zynmafqrjb.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f22564zynmafqrjb.setAdapter(new oxmwwwfdhm(this));
            this.f22564zynmafqrjb.btonecajqb(cllcsxoeiz());
        }
        if (viewInflate.findViewById(da.gxszxtbevo.month_navigation_fragment_toggle) != null) {
            hkdspvbjdz(viewInflate, draadjrbmkVar);
        }
        if (!MaterialDatePicker.ntlheqmsrt(contextThemeWrapper)) {
            new jyumaefscl().attachToRecyclerView(this.f22556istkbnxepw);
        }
        this.f22556istkbnxepw.A(draadjrbmkVar.gxszxtbevo(this.f22554esjtqupxsv));
        ribwqtqdhb();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f22563yggfygwlhe);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f22558jyumaefscl);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f22557iwizpuwonk);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f22553cqumvgiudr);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f22554esjtqupxsv);
    }

    Month stevsuqkhv() {
        return this.f22554esjtqupxsv;
    }

    void vipkmwdibw() {
        draadjrbmk draadjrbmkVar = this.f22559lereixgezr;
        draadjrbmk draadjrbmkVar2 = draadjrbmk.YEAR;
        if (draadjrbmkVar == draadjrbmkVar2) {
            jlmebxxoox(draadjrbmk.DAY);
        } else if (draadjrbmkVar == draadjrbmk.DAY) {
            jlmebxxoox(draadjrbmkVar2);
        }
    }

    com.google.android.material.datepicker.zoijcleaow wypolnanlu() {
        return this.f22561pmvmpeiblj;
    }
}
