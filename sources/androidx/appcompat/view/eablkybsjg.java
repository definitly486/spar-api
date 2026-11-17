package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg extends zoijcleaow implements androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private zoijcleaow.iobyxmoadg f2691cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private WeakReference f2692esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ActionBarContextView f2693iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Context f2694jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f2695lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f2696pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private androidx.appcompat.view.menu.eablkybsjg f2697zynmafqrjb;

    public eablkybsjg(Context context, ActionBarContextView actionBarContextView, zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13) {
        this.f2694jyumaefscl = context;
        this.f2693iwizpuwonk = actionBarContextView;
        this.f2691cqumvgiudr = iobyxmoadgVar;
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarMbcevpiqjq = new androidx.appcompat.view.menu.eablkybsjg(actionBarContextView.getContext()).mbcevpiqjq(1);
        this.f2697zynmafqrjb = eablkybsjgVarMbcevpiqjq;
        eablkybsjgVarMbcevpiqjq.tzroggbefp(this);
        this.f2696pmvmpeiblj = z13;
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void agtfadlqog(int i13) {
        ojitshcjhn(this.f2694jyumaefscl.getString(i13));
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public boolean draadjrbmk() {
        return this.f2693iwizpuwonk.btonecajqb();
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public CharSequence dxjokdxxww() {
        return this.f2693iwizpuwonk.getTitle();
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public Menu eablkybsjg() {
        return this.f2697zynmafqrjb;
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void gtknphoqwx() {
        this.f2691cqumvgiudr.wkgbmnqykc(this, this.f2697zynmafqrjb);
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public MenuInflater gxszxtbevo() {
        return new lqeggnwhkg(this.f2693iwizpuwonk.getContext());
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
    public boolean iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
        return this.f2691cqumvgiudr.ppxfxbqfkf(this, menuItem);
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void kcexrzcfyt(boolean z13) {
        super.kcexrzcfyt(z13);
        this.f2693iwizpuwonk.setTitleOptional(z13);
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public CharSequence lqeggnwhkg() {
        return this.f2693iwizpuwonk.getSubtitle();
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void ojitshcjhn(CharSequence charSequence) {
        this.f2693iwizpuwonk.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void oxmwwwfdhm(CharSequence charSequence) {
        this.f2693iwizpuwonk.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void ppxfxbqfkf() {
        if (this.f2695lereixgezr) {
            return;
        }
        this.f2695lereixgezr = true;
        this.f2691cqumvgiudr.iobyxmoadg(this);
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void vdvldrhtss(int i13) {
        oxmwwwfdhm(this.f2694jyumaefscl.getString(i13));
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public void wflxmlrfwp(View view) {
        this.f2693iwizpuwonk.setCustomView(view);
        this.f2692esjtqupxsv = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.zoijcleaow
    public View wkgbmnqykc() {
        WeakReference weakReference = this.f2692esjtqupxsv;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
    public void zoijcleaow(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
        gtknphoqwx();
        this.f2693iwizpuwonk.draadjrbmk();
    }
}
