package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends rgvfuqvkyq implements DialogInterface {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final AlertController f2671esjtqupxsv;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AlertController.zoijcleaow f2672iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f2673zoijcleaow;

        public iobyxmoadg(Context context) {
            this(context, ppxfxbqfkf.gtknphoqwx(context, 0));
        }

        public iobyxmoadg btonecajqb(ListAdapter listAdapter, int i13, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2448iwizpuwonk = listAdapter;
            zoijcleaowVar.f2435cqumvgiudr = onClickListener;
            zoijcleaowVar.f2468ylkuphrtab = i13;
            zoijcleaowVar.f2465wwaezpbzkn = true;
            return this;
        }

        public ppxfxbqfkf create() {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f2672iobyxmoadg.f2445iobyxmoadg, this.f2673zoijcleaow);
            this.f2672iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.f2671esjtqupxsv);
            ppxfxbqfkfVar.setCancelable(this.f2672iobyxmoadg.f2457oxmwwwfdhm);
            if (this.f2672iobyxmoadg.f2457oxmwwwfdhm) {
                ppxfxbqfkfVar.setCanceledOnTouchOutside(true);
            }
            ppxfxbqfkfVar.setOnCancelListener(this.f2672iobyxmoadg.f2451kcexrzcfyt);
            ppxfxbqfkfVar.setOnDismissListener(this.f2672iobyxmoadg.f2469zdlpuopuiu);
            DialogInterface.OnKeyListener onKeyListener = this.f2672iobyxmoadg.f2467yggfygwlhe;
            if (onKeyListener != null) {
                ppxfxbqfkfVar.setOnKeyListener(onKeyListener);
            }
            return ppxfxbqfkfVar;
        }

        public ppxfxbqfkf draadjrbmk() {
            ppxfxbqfkf ppxfxbqfkfVarCreate = create();
            ppxfxbqfkfVarCreate.show();
            return ppxfxbqfkfVarCreate;
        }

        public iobyxmoadg dxjokdxxww(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2438dxjokdxxww = charSequence;
            zoijcleaowVar.f2441gtknphoqwx = onClickListener;
            return this;
        }

        public iobyxmoadg eablkybsjg(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2450jyumaefscl = charSequenceArr;
            zoijcleaowVar.f2458pkzmftpjix = onMultiChoiceClickListener;
            zoijcleaowVar.f2446iozdgvuglv = zArr;
            zoijcleaowVar.f2453lmojexxdyd = true;
            return this;
        }

        public Context getContext() {
            return this.f2672iobyxmoadg.f2445iobyxmoadg;
        }

        public iobyxmoadg gtknphoqwx(CharSequence[] charSequenceArr, int i13, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2450jyumaefscl = charSequenceArr;
            zoijcleaowVar.f2435cqumvgiudr = onClickListener;
            zoijcleaowVar.f2468ylkuphrtab = i13;
            zoijcleaowVar.f2465wwaezpbzkn = true;
            return this;
        }

        public iobyxmoadg gxszxtbevo(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2436draadjrbmk = charSequence;
            zoijcleaowVar.f2431agtfadlqog = onClickListener;
            return this;
        }

        public iobyxmoadg iobyxmoadg(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2448iwizpuwonk = listAdapter;
            zoijcleaowVar.f2435cqumvgiudr = onClickListener;
            return this;
        }

        public iobyxmoadg lqeggnwhkg(DialogInterface.OnCancelListener onCancelListener) {
            this.f2672iobyxmoadg.f2451kcexrzcfyt = onCancelListener;
            return this;
        }

        public iobyxmoadg nufgyqmvbu(DialogInterface.OnKeyListener onKeyListener) {
            this.f2672iobyxmoadg.f2467yggfygwlhe = onKeyListener;
            return this;
        }

        public iobyxmoadg ppxfxbqfkf(Drawable drawable) {
            this.f2672iobyxmoadg.f2464wkgbmnqykc = drawable;
            return this;
        }

        public iobyxmoadg setNegativeButton(int i13, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2436draadjrbmk = zoijcleaowVar.f2445iobyxmoadg.getText(i13);
            this.f2672iobyxmoadg.f2431agtfadlqog = onClickListener;
            return this;
        }

        public iobyxmoadg setPositiveButton(int i13, DialogInterface.OnClickListener onClickListener) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2438dxjokdxxww = zoijcleaowVar.f2445iobyxmoadg.getText(i13);
            this.f2672iobyxmoadg.f2441gtknphoqwx = onClickListener;
            return this;
        }

        public iobyxmoadg setTitle(CharSequence charSequence) {
            this.f2672iobyxmoadg.f2442gxszxtbevo = charSequence;
            return this;
        }

        public iobyxmoadg setView(View view) {
            AlertController.zoijcleaow zoijcleaowVar = this.f2672iobyxmoadg;
            zoijcleaowVar.f2452lereixgezr = view;
            zoijcleaowVar.f2440esjtqupxsv = 0;
            zoijcleaowVar.f2466yadqdtsiqt = false;
            return this;
        }

        public iobyxmoadg wkgbmnqykc(CharSequence charSequence) {
            this.f2672iobyxmoadg.f2455nufgyqmvbu = charSequence;
            return this;
        }

        public iobyxmoadg zoijcleaow(View view) {
            this.f2672iobyxmoadg.f2454lqeggnwhkg = view;
            return this;
        }

        public iobyxmoadg(Context context, int i13) {
            this.f2672iobyxmoadg = new AlertController.zoijcleaow(new ContextThemeWrapper(context, ppxfxbqfkf.gtknphoqwx(context, i13)));
            this.f2673zoijcleaow = i13;
        }
    }

    protected ppxfxbqfkf(Context context, int i13) {
        super(context, gtknphoqwx(context, i13));
        this.f2671esjtqupxsv = new AlertController(getContext(), this, getWindow());
    }

    static int gtknphoqwx(Context context, int i13) {
        if (((i13 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i13;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView btonecajqb() {
        return this.f2671esjtqupxsv.wkgbmnqykc();
    }

    @Override // androidx.appcompat.app.rgvfuqvkyq, androidx.activity.draadjrbmk, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2671esjtqupxsv.eablkybsjg();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (this.f2671esjtqupxsv.gxszxtbevo(i13, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i13, KeyEvent keyEvent) {
        if (this.f2671esjtqupxsv.lqeggnwhkg(i13, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i13, keyEvent);
    }

    @Override // androidx.appcompat.app.rgvfuqvkyq, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2671esjtqupxsv.rgvfuqvkyq(charSequence);
    }
}
