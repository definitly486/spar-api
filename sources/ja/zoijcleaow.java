package ja;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.view.wkgbmnqykc;
import da.draadjrbmk;
import da.gtknphoqwx;
import ra.lqeggnwhkg;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow extends androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f50922eablkybsjg = da.zoijcleaow.alertDialogStyle;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f50923gxszxtbevo = gtknphoqwx.MaterialAlertDialog_MaterialComponents;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f50924lqeggnwhkg = da.zoijcleaow.materialAlertDialogTheme;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Drawable f50925ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rect f50926wkgbmnqykc;

    public zoijcleaow(Context context, int i13) {
        super(wflxmlrfwp(context), ojitshcjhn(context, i13));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i14 = f50922eablkybsjg;
        int i15 = f50923gxszxtbevo;
        this.f50926wkgbmnqykc = ppxfxbqfkf.iobyxmoadg(context2, i14, i15);
        int iPpxfxbqfkf = ia.iobyxmoadg.ppxfxbqfkf(context2, da.zoijcleaow.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, draadjrbmk.MaterialAlertDialog, i14, i15);
        int color = typedArrayObtainStyledAttributes.getColor(draadjrbmk.MaterialAlertDialog_backgroundTint, iPpxfxbqfkf);
        typedArrayObtainStyledAttributes.recycle();
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(context2, null, i14, i15);
        lqeggnwhkgVar.hkdspvbjdz(context2);
        lqeggnwhkgVar.crxdokpmqz(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                lqeggnwhkgVar.ntlheqmsrt(dimension);
            }
        }
        this.f50925ppxfxbqfkf = lqeggnwhkgVar;
    }

    private static int agtfadlqog(Context context) {
        TypedValue typedValueIobyxmoadg = oa.zoijcleaow.iobyxmoadg(context, f50924lqeggnwhkg);
        if (typedValueIobyxmoadg == null) {
            return 0;
        }
        return typedValueIobyxmoadg.data;
    }

    private static int ojitshcjhn(Context context, int i13) {
        return i13 == 0 ? agtfadlqog(context) : i13;
    }

    private static Context wflxmlrfwp(Context context) {
        int iAgtfadlqog = agtfadlqog(context);
        Context contextPpxfxbqfkf = ta.iobyxmoadg.ppxfxbqfkf(context, null, f50922eablkybsjg, f50923gxszxtbevo);
        return iAgtfadlqog == 0 ? contextPpxfxbqfkf : new wkgbmnqykc(contextPpxfxbqfkf, iAgtfadlqog);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public zoijcleaow setView(View view) {
        return (zoijcleaow) super.setView(view);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public zoijcleaow nufgyqmvbu(DialogInterface.OnKeyListener onKeyListener) {
        return (zoijcleaow) super.nufgyqmvbu(onKeyListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    public androidx.appcompat.app.ppxfxbqfkf create() {
        androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVarCreate = super.create();
        Window window = ppxfxbqfkfVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f50925ppxfxbqfkf;
        if (drawable instanceof lqeggnwhkg) {
            ((lqeggnwhkg) drawable).sopmlzcsov(jhduphickx.yggfygwlhe(decorView));
        }
        window.setBackgroundDrawable(ppxfxbqfkf.zoijcleaow(this.f50925ppxfxbqfkf, this.f50926wkgbmnqykc));
        decorView.setOnTouchListener(new iobyxmoadg(ppxfxbqfkfVarCreate, this.f50926wkgbmnqykc));
        return ppxfxbqfkfVarCreate;
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public zoijcleaow setPositiveButton(int i13, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.setPositiveButton(i13, onClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public zoijcleaow setTitle(CharSequence charSequence) {
        return (zoijcleaow) super.setTitle(charSequence);
    }

    public zoijcleaow iwizpuwonk(DialogInterface.OnCancelListener onCancelListener) {
        return (zoijcleaow) super.lqeggnwhkg(onCancelListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public zoijcleaow gxszxtbevo(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.gxszxtbevo(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public zoijcleaow wkgbmnqykc(CharSequence charSequence) {
        return (zoijcleaow) super.wkgbmnqykc(charSequence);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public zoijcleaow dxjokdxxww(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.dxjokdxxww(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public zoijcleaow ppxfxbqfkf(Drawable drawable) {
        return (zoijcleaow) super.ppxfxbqfkf(drawable);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public zoijcleaow btonecajqb(ListAdapter listAdapter, int i13, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.btonecajqb(listAdapter, i13, onClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public zoijcleaow iobyxmoadg(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.iobyxmoadg(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public zoijcleaow zoijcleaow(View view) {
        return (zoijcleaow) super.zoijcleaow(view);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public zoijcleaow setNegativeButton(int i13, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.setNegativeButton(i13, onClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public zoijcleaow eablkybsjg(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (zoijcleaow) super.eablkybsjg(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public zoijcleaow gtknphoqwx(CharSequence[] charSequenceArr, int i13, DialogInterface.OnClickListener onClickListener) {
        return (zoijcleaow) super.gtknphoqwx(charSequenceArr, i13, onClickListener);
    }
}
