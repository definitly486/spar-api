package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements btonecajqb {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    protected LayoutInflater f2845cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private btonecajqb.iobyxmoadg f2846esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f2847istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected LayoutInflater f2848iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected eablkybsjg f2849jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f2850lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f2851pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected Context f2852yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected Context f2853zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    protected gtknphoqwx f2854zynmafqrjb;

    public iobyxmoadg(Context context, int i13, int i14) {
        this.f2853zdlpuopuiu = context;
        this.f2848iwizpuwonk = LayoutInflater.from(context);
        this.f2850lereixgezr = i13;
        this.f2851pmvmpeiblj = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View agtfadlqog(lqeggnwhkg lqeggnwhkgVar, View view, ViewGroup viewGroup) {
        gtknphoqwx.iobyxmoadg iobyxmoadgVarGtknphoqwx = view instanceof gtknphoqwx.iobyxmoadg ? (gtknphoqwx.iobyxmoadg) view : gtknphoqwx(viewGroup);
        zoijcleaow(lqeggnwhkgVar, iobyxmoadgVarGtknphoqwx);
        return (View) iobyxmoadgVarGtknphoqwx;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void btonecajqb(Context context, eablkybsjg eablkybsjgVar) {
        this.f2852yggfygwlhe = context;
        this.f2845cqumvgiudr = LayoutInflater.from(context);
        this.f2849jyumaefscl = eablkybsjgVar;
    }

    protected boolean draadjrbmk(ViewGroup viewGroup, int i13) {
        viewGroup.removeViewAt(i13);
        return true;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean dxjokdxxww(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void eablkybsjg(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        this.f2846esjtqupxsv = iobyxmoadgVar;
    }

    public gtknphoqwx.iobyxmoadg gtknphoqwx(ViewGroup viewGroup) {
        return (gtknphoqwx.iobyxmoadg) this.f2848iwizpuwonk.inflate(this.f2851pmvmpeiblj, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean gxszxtbevo(wflxmlrfwp wflxmlrfwpVar) {
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2846esjtqupxsv;
        eablkybsjg eablkybsjgVar = wflxmlrfwpVar;
        if (iobyxmoadgVar == null) {
            return false;
        }
        if (wflxmlrfwpVar == null) {
            eablkybsjgVar = this.f2849jyumaefscl;
        }
        return iobyxmoadgVar.wkgbmnqykc(eablkybsjgVar);
    }

    protected void iobyxmoadg(View view, int i13) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2854zynmafqrjb).addView(view, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.btonecajqb
    public void lqeggnwhkg(boolean z13) {
        ViewGroup viewGroup = (ViewGroup) this.f2854zynmafqrjb;
        if (viewGroup == null) {
            return;
        }
        eablkybsjg eablkybsjgVar = this.f2849jyumaefscl;
        int i13 = 0;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.oxmwwwfdhm();
            ArrayList arrayListYadqdtsiqt = this.f2849jyumaefscl.yadqdtsiqt();
            int size = arrayListYadqdtsiqt.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) arrayListYadqdtsiqt.get(i15);
                if (vdvldrhtss(i14, lqeggnwhkgVar)) {
                    View childAt = viewGroup.getChildAt(i14);
                    lqeggnwhkg itemData = childAt instanceof gtknphoqwx.iobyxmoadg ? ((gtknphoqwx.iobyxmoadg) childAt).getItemData() : null;
                    View viewAgtfadlqog = agtfadlqog(lqeggnwhkgVar, childAt, viewGroup);
                    if (lqeggnwhkgVar != itemData) {
                        viewAgtfadlqog.setPressed(false);
                        viewAgtfadlqog.jumpDrawablesToCurrentState();
                    }
                    if (viewAgtfadlqog != childAt) {
                        iobyxmoadg(viewAgtfadlqog, i14);
                    }
                    i14++;
                }
            }
            i13 = i14;
        }
        while (i13 < viewGroup.getChildCount()) {
            if (!draadjrbmk(viewGroup, i13)) {
                i13++;
            }
        }
    }

    public gtknphoqwx ojitshcjhn(ViewGroup viewGroup) {
        if (this.f2854zynmafqrjb == null) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f2848iwizpuwonk.inflate(this.f2850lereixgezr, viewGroup, false);
            this.f2854zynmafqrjb = gtknphoqwxVar;
            gtknphoqwxVar.iobyxmoadg(this.f2849jyumaefscl);
            lqeggnwhkg(true);
        }
        return this.f2854zynmafqrjb;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, boolean z13) {
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2846esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar, z13);
        }
    }

    public void rgvfuqvkyq(int i13) {
        this.f2847istkbnxepw = i13;
    }

    public abstract boolean vdvldrhtss(int i13, lqeggnwhkg lqeggnwhkgVar);

    public btonecajqb.iobyxmoadg wflxmlrfwp() {
        return this.f2846esjtqupxsv;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean wkgbmnqykc(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return false;
    }

    public abstract void zoijcleaow(lqeggnwhkg lqeggnwhkgVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar);
}
