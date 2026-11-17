package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final int[] f3089zynmafqrjb = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f3090cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private lqeggnwhkg f3091esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private SpinnerAdapter f3092iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private wwaezpbzkn f3093jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    int f3094lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final Rect f3095pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f3096yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.appcompat.widget.wkgbmnqykc f3097zdlpuopuiu;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f3098zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeByte(this.f3098zdlpuopuiu ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3098zdlpuopuiu = parcel.readByte() != 0;
        }
    }

    private static class eablkybsjg implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private SpinnerAdapter f3099iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ListAdapter f3100zoijcleaow;

        public eablkybsjg(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3099iobyxmoadg = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3100zoijcleaow = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            ppxfxbqfkf.iobyxmoadg((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3100zoijcleaow;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i13, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i13, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i13) {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i13);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i13) {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i13);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i13) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i13, View view, ViewGroup viewGroup) {
            return getDropDownView(i13, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i13) {
            ListAdapter listAdapter = this.f3100zoijcleaow;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i13);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3099iobyxmoadg;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class gxszxtbevo extends ylkuphrtab implements lqeggnwhkg {

        /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
        ListAdapter f3101ikoacuggdj;

        /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
        private CharSequence f3102jhduphickx;

        /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
        private int f3103jztzpxfvev;

        /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
        private final Rect f3104okpsazkaxt;

        class iobyxmoadg implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f3107zdlpuopuiu;

            iobyxmoadg(AppCompatSpinner appCompatSpinner) {
                this.f3107zdlpuopuiu = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
                AppCompatSpinner.this.setSelection(i13);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    gxszxtbevo gxszxtbevoVar = gxszxtbevo.this;
                    AppCompatSpinner.this.performItemClick(view, i13, gxszxtbevoVar.f3101ikoacuggdj.getItemId(i13));
                }
                gxszxtbevo.this.dismiss();
            }
        }

        class ppxfxbqfkf implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f3109zdlpuopuiu;

            ppxfxbqfkf(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f3109zdlpuopuiu = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f3109zdlpuopuiu);
                }
            }
        }

        class zoijcleaow implements ViewTreeObserver.OnGlobalLayoutListener {
            zoijcleaow() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                gxszxtbevo gxszxtbevoVar = gxszxtbevo.this;
                if (!gxszxtbevoVar.ulzqkzuiru(AppCompatSpinner.this)) {
                    gxszxtbevo.this.dismiss();
                } else {
                    gxszxtbevo.this.mbcevpiqjq();
                    gxszxtbevo.super.iobyxmoadg();
                }
            }
        }

        public gxszxtbevo(Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13);
            this.f3104okpsazkaxt = new Rect();
            cdpycssgdh(AppCompatSpinner.this);
            pkzmftpjix(true);
            wypolnanlu(0);
            jpowsppfya(new iobyxmoadg(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.ylkuphrtab, androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void agtfadlqog(ListAdapter listAdapter) {
            super.agtfadlqog(listAdapter);
            this.f3101ikoacuggdj = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void draadjrbmk(int i13, int i14) {
            ViewTreeObserver viewTreeObserver;
            boolean zZoijcleaow = zoijcleaow();
            mbcevpiqjq();
            ylkuphrtab(2);
            super.iobyxmoadg();
            ListView listViewRgvfuqvkyq = rgvfuqvkyq();
            listViewRgvfuqvkyq.setChoiceMode(1);
            listViewRgvfuqvkyq.setTextDirection(i13);
            listViewRgvfuqvkyq.setTextAlignment(i14);
            stevsuqkhv(AppCompatSpinner.this.getSelectedItemPosition());
            if (zZoijcleaow || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            zoijcleaow zoijcleaowVar = new zoijcleaow();
            viewTreeObserver.addOnGlobalLayoutListener(zoijcleaowVar);
            hcddaimhww(new ppxfxbqfkf(zoijcleaowVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void dxjokdxxww(CharSequence charSequence) {
            this.f3102jhduphickx = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void gtknphoqwx(int i13) {
            this.f3103jztzpxfvev = i13;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public CharSequence lqeggnwhkg() {
            return this.f3102jhduphickx;
        }

        void mbcevpiqjq() {
            int i13;
            Drawable drawableNufgyqmvbu = nufgyqmvbu();
            if (drawableNufgyqmvbu != null) {
                drawableNufgyqmvbu.getPadding(AppCompatSpinner.this.f3095pmvmpeiblj);
                i13 = vipkmwdibw.zoijcleaow(AppCompatSpinner.this) ? AppCompatSpinner.this.f3095pmvmpeiblj.right : -AppCompatSpinner.this.f3095pmvmpeiblj.left;
            } else {
                Rect rect = AppCompatSpinner.this.f3095pmvmpeiblj;
                rect.right = 0;
                rect.left = 0;
                i13 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i14 = appCompatSpinner.f3094lereixgezr;
            if (i14 == -2) {
                int iIobyxmoadg = appCompatSpinner.iobyxmoadg((SpinnerAdapter) this.f3101ikoacuggdj, nufgyqmvbu());
                int i15 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f3095pmvmpeiblj;
                int i16 = (i15 - rect2.left) - rect2.right;
                if (iIobyxmoadg > i16) {
                    iIobyxmoadg = i16;
                }
                iozdgvuglv(Math.max(iIobyxmoadg, (width - paddingLeft) - paddingRight));
            } else if (i14 == -1) {
                iozdgvuglv((width - paddingLeft) - paddingRight);
            } else {
                iozdgvuglv(i14);
            }
            gxszxtbevo(vipkmwdibw.zoijcleaow(AppCompatSpinner.this) ? i13 + (((width - paddingRight) - lereixgezr()) - ntlheqmsrt()) : i13 + paddingLeft + ntlheqmsrt());
        }

        public int ntlheqmsrt() {
            return this.f3103jztzpxfvev;
        }

        boolean ulzqkzuiru(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f3104okpsazkaxt);
        }
    }

    class iobyxmoadg extends wwaezpbzkn {

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f3112istkbnxepw;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(View view, gxszxtbevo gxszxtbevoVar) {
            super(view);
            this.f3112istkbnxepw = gxszxtbevoVar;
        }

        @Override // androidx.appcompat.widget.wwaezpbzkn
        public boolean ppxfxbqfkf() {
            if (AppCompatSpinner.this.getInternalPopup().zoijcleaow()) {
                return true;
            }
            AppCompatSpinner.this.zoijcleaow();
            return true;
        }

        @Override // androidx.appcompat.widget.wwaezpbzkn
        public draadjrbmk.eablkybsjg zoijcleaow() {
            return this.f3112istkbnxepw;
        }
    }

    interface lqeggnwhkg {
        void agtfadlqog(ListAdapter listAdapter);

        void btonecajqb(int i13);

        void dismiss();

        void draadjrbmk(int i13, int i14);

        void dxjokdxxww(CharSequence charSequence);

        void gtknphoqwx(int i13);

        void gxszxtbevo(int i13);

        CharSequence lqeggnwhkg();

        Drawable nufgyqmvbu();

        void ppxfxbqfkf(Drawable drawable);

        int wflxmlrfwp();

        int wkgbmnqykc();

        boolean zoijcleaow();
    }

    private static final class ppxfxbqfkf {
        static void iobyxmoadg(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (u1.zoijcleaow.iobyxmoadg(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class wkgbmnqykc implements lqeggnwhkg, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private CharSequence f3114jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private ListAdapter f3115yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        androidx.appcompat.app.ppxfxbqfkf f3116zdlpuopuiu;

        wkgbmnqykc() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void agtfadlqog(ListAdapter listAdapter) {
            this.f3115yggfygwlhe = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void btonecajqb(int i13) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void dismiss() {
            androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVar = this.f3116zdlpuopuiu;
            if (ppxfxbqfkfVar != null) {
                ppxfxbqfkfVar.dismiss();
                this.f3116zdlpuopuiu = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void draadjrbmk(int i13, int i14) {
            if (this.f3115yggfygwlhe == null) {
                return;
            }
            androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = new androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f3114jyumaefscl;
            if (charSequence != null) {
                iobyxmoadgVar.setTitle(charSequence);
            }
            androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVarCreate = iobyxmoadgVar.btonecajqb(this.f3115yggfygwlhe, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f3116zdlpuopuiu = ppxfxbqfkfVarCreate;
            ListView listViewBtonecajqb = ppxfxbqfkfVarCreate.btonecajqb();
            listViewBtonecajqb.setTextDirection(i13);
            listViewBtonecajqb.setTextAlignment(i14);
            this.f3116zdlpuopuiu.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void dxjokdxxww(CharSequence charSequence) {
            this.f3114jyumaefscl = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void gtknphoqwx(int i13) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void gxszxtbevo(int i13) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public CharSequence lqeggnwhkg() {
            return this.f3114jyumaefscl;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public Drawable nufgyqmvbu() {
            return null;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i13) {
            AppCompatSpinner.this.setSelection(i13);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i13, this.f3115yggfygwlhe.getItemId(i13));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public void ppxfxbqfkf(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public int wflxmlrfwp() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public int wkgbmnqykc() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.lqeggnwhkg
        public boolean zoijcleaow() {
            androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVar = this.f3116zdlpuopuiu;
            if (ppxfxbqfkfVar != null) {
                return ppxfxbqfkfVar.isShowing();
            }
            return false;
        }
    }

    class zoijcleaow implements ViewTreeObserver.OnGlobalLayoutListener {
        zoijcleaow() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().zoijcleaow()) {
                AppCompatSpinner.this.zoijcleaow();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        return lqeggnwhkgVar != null ? lqeggnwhkgVar.wkgbmnqykc() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        return lqeggnwhkgVar != null ? lqeggnwhkgVar.wflxmlrfwp() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3091esjtqupxsv != null ? this.f3094lereixgezr : super.getDropDownWidth();
    }

    final lqeggnwhkg getInternalPopup() {
        return this.f3091esjtqupxsv;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        return lqeggnwhkgVar != null ? lqeggnwhkgVar.nufgyqmvbu() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3096yggfygwlhe;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        return lqeggnwhkgVar != null ? lqeggnwhkgVar.lqeggnwhkg() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    int iobyxmoadg(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i13 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f3095pmvmpeiblj);
        Rect rect = this.f3095pmvmpeiblj;
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        if (lqeggnwhkgVar == null || !lqeggnwhkgVar.zoijcleaow()) {
            return;
        }
        this.f3091esjtqupxsv.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f3091esjtqupxsv == null || View.MeasureSpec.getMode(i13) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), iobyxmoadg(getAdapter(), getBackground())), View.MeasureSpec.getSize(i13)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f3098zdlpuopuiu || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new zoijcleaow());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        savedState.f3098zdlpuopuiu = lqeggnwhkgVar != null && lqeggnwhkgVar.zoijcleaow();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        wwaezpbzkn wwaezpbzknVar = this.f3093jyumaefscl;
        if (wwaezpbzknVar == null || !wwaezpbzknVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        if (lqeggnwhkgVar == null) {
            return super.performClick();
        }
        if (lqeggnwhkgVar.zoijcleaow()) {
            return true;
        }
        zoijcleaow();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gxszxtbevo(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.lqeggnwhkg(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i13) {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        if (lqeggnwhkgVar == null) {
            super.setDropDownHorizontalOffset(i13);
        } else {
            lqeggnwhkgVar.gtknphoqwx(i13);
            this.f3091esjtqupxsv.gxszxtbevo(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i13) {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.btonecajqb(i13);
        } else {
            super.setDropDownVerticalOffset(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i13) {
        if (this.f3091esjtqupxsv != null) {
            this.f3094lereixgezr = i13;
        } else {
            super.setDropDownWidth(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.ppxfxbqfkf(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i13) {
        setPopupBackgroundDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getPopupContext(), i13));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        lqeggnwhkg lqeggnwhkgVar = this.f3091esjtqupxsv;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.dxjokdxxww(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dxjokdxxww(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.wkgbmnqykc wkgbmnqykcVar = this.f3097zdlpuopuiu;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.btonecajqb(mode);
        }
    }

    void zoijcleaow() {
        this.f3091esjtqupxsv.draadjrbmk(getTextDirection(), getTextAlignment());
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3090cqumvgiudr) {
            this.f3092iwizpuwonk = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3091esjtqupxsv != null) {
            Context context = this.f3096yggfygwlhe;
            if (context == null) {
                context = getContext();
            }
            this.f3091esjtqupxsv.agtfadlqog(new eablkybsjg(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i13, int i14) {
        this(context, attributeSet, i13, i14, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i13, int i14, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrVdvldrhtss;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i13);
        this.f3095pmvmpeiblj = new Rect();
        wypolnanlu.iobyxmoadg(this, getContext());
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.Spinner, i13, 0);
        this.f3097zdlpuopuiu = new androidx.appcompat.widget.wkgbmnqykc(this);
        if (theme != null) {
            this.f3096yggfygwlhe = new androidx.appcompat.view.wkgbmnqykc(context, theme);
        } else {
            int iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.Spinner_popupTheme, 0);
            if (iAgtfadlqog != 0) {
                this.f3096yggfygwlhe = new androidx.appcompat.view.wkgbmnqykc(context, iAgtfadlqog);
            } else {
                this.f3096yggfygwlhe = context;
            }
        }
        ?? r13 = -1;
        ?? r14 = 0;
        try {
            if (i14 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3089zynmafqrjb, i13, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r13 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i14 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r13 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r13 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i14 != 0) {
                            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
                            this.f3091esjtqupxsv = wkgbmnqykcVar;
                            wkgbmnqykcVar.dxjokdxxww(mbcevpiqjqVarJyumaefscl.ojitshcjhn(lqeggnwhkg.btonecajqb.Spinner_android_prompt));
                        } else if (i14 == 1) {
                            gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this.f3096yggfygwlhe, attributeSet, i13);
                            mbcevpiqjq mbcevpiqjqVarJyumaefscl2 = mbcevpiqjq.jyumaefscl(this.f3096yggfygwlhe, attributeSet, lqeggnwhkg.btonecajqb.Spinner, i13, 0);
                            this.f3094lereixgezr = mbcevpiqjqVarJyumaefscl2.wflxmlrfwp(lqeggnwhkg.btonecajqb.Spinner_android_dropDownWidth, -2);
                            gxszxtbevoVar.ppxfxbqfkf(mbcevpiqjqVarJyumaefscl2.lqeggnwhkg(lqeggnwhkg.btonecajqb.Spinner_android_popupBackground));
                            gxszxtbevoVar.dxjokdxxww(mbcevpiqjqVarJyumaefscl.ojitshcjhn(lqeggnwhkg.btonecajqb.Spinner_android_prompt));
                            mbcevpiqjqVarJyumaefscl2.cqumvgiudr();
                            this.f3091esjtqupxsv = gxszxtbevoVar;
                            this.f3093jyumaefscl = new iobyxmoadg(this, gxszxtbevoVar);
                        }
                        charSequenceArrVdvldrhtss = mbcevpiqjqVarJyumaefscl.vdvldrhtss(lqeggnwhkg.btonecajqb.Spinner_android_entries);
                        if (charSequenceArrVdvldrhtss != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrVdvldrhtss);
                            arrayAdapter.setDropDownViewResource(lqeggnwhkg.lqeggnwhkg.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
                        this.f3090cqumvgiudr = true;
                        spinnerAdapter = this.f3092iwizpuwonk;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f3092iwizpuwonk = null;
                        }
                        this.f3097zdlpuopuiu.eablkybsjg(attributeSet, i13);
                    }
                } catch (Exception e14) {
                    e = e14;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r14 != 0) {
                        r14.recycle();
                    }
                    throw th;
                }
                r13.recycle();
            }
            if (i14 != 0) {
                wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc();
                this.f3091esjtqupxsv = wkgbmnqykcVar2;
                wkgbmnqykcVar2.dxjokdxxww(mbcevpiqjqVarJyumaefscl.ojitshcjhn(lqeggnwhkg.btonecajqb.Spinner_android_prompt));
            } else if (i14 == 1) {
                gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(this.f3096yggfygwlhe, attributeSet, i13);
                mbcevpiqjq mbcevpiqjqVarJyumaefscl3 = mbcevpiqjq.jyumaefscl(this.f3096yggfygwlhe, attributeSet, lqeggnwhkg.btonecajqb.Spinner, i13, 0);
                this.f3094lereixgezr = mbcevpiqjqVarJyumaefscl3.wflxmlrfwp(lqeggnwhkg.btonecajqb.Spinner_android_dropDownWidth, -2);
                gxszxtbevoVar2.ppxfxbqfkf(mbcevpiqjqVarJyumaefscl3.lqeggnwhkg(lqeggnwhkg.btonecajqb.Spinner_android_popupBackground));
                gxszxtbevoVar2.dxjokdxxww(mbcevpiqjqVarJyumaefscl.ojitshcjhn(lqeggnwhkg.btonecajqb.Spinner_android_prompt));
                mbcevpiqjqVarJyumaefscl3.cqumvgiudr();
                this.f3091esjtqupxsv = gxszxtbevoVar2;
                this.f3093jyumaefscl = new iobyxmoadg(this, gxszxtbevoVar2);
            }
            charSequenceArrVdvldrhtss = mbcevpiqjqVarJyumaefscl.vdvldrhtss(lqeggnwhkg.btonecajqb.Spinner_android_entries);
            if (charSequenceArrVdvldrhtss != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrVdvldrhtss);
                arrayAdapter2.setDropDownViewResource(lqeggnwhkg.lqeggnwhkg.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter2);
            }
            mbcevpiqjqVarJyumaefscl.cqumvgiudr();
            this.f3090cqumvgiudr = true;
            spinnerAdapter = this.f3092iwizpuwonk;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f3092iwizpuwonk = null;
            }
            this.f3097zdlpuopuiu.eablkybsjg(attributeSet, i13);
        } catch (Throwable th3) {
            th = th3;
            r14 = r13;
        }
    }
}
