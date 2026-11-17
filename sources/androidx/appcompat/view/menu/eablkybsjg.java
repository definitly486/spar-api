package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import v1.jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg implements m1.iobyxmoadg {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int[] f2814pmvmpeiblj = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    CharSequence f2815agtfadlqog;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private lqeggnwhkg f2817cqumvgiudr;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private iobyxmoadg f2820eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f2824iobyxmoadg;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f2828lereixgezr;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    Drawable f2831ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f2833ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    View f2834rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f2836wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f2837wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Resources f2840zoijcleaow;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f2818draadjrbmk = 0;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f2835vdvldrhtss = false;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f2832oxmwwwfdhm = false;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f2827kcexrzcfyt = false;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f2839zdlpuopuiu = false;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f2838yggfygwlhe = false;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ArrayList f2826jyumaefscl = new ArrayList();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private CopyOnWriteArrayList f2825iwizpuwonk = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f2821esjtqupxsv = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private ArrayList f2823gxszxtbevo = new ArrayList();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private ArrayList f2829lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f2830nufgyqmvbu = true;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ArrayList f2819dxjokdxxww = new ArrayList();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ArrayList f2816btonecajqb = new ArrayList();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f2822gtknphoqwx = true;

    public interface iobyxmoadg {
        boolean iobyxmoadg(eablkybsjg eablkybsjgVar, MenuItem menuItem);

        void zoijcleaow(eablkybsjg eablkybsjgVar);
    }

    public interface zoijcleaow {
        boolean wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar);
    }

    public eablkybsjg(Context context) {
        this.f2824iobyxmoadg = context;
        this.f2840zoijcleaow = context.getResources();
        ikoacuggdj(true);
    }

    private static int agtfadlqog(ArrayList arrayList, int i13) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((lqeggnwhkg) arrayList.get(size)).gxszxtbevo() <= i13) {
                return size + 1;
            }
        }
        return 0;
    }

    private boolean btonecajqb(wflxmlrfwp wflxmlrfwpVar, btonecajqb btonecajqbVar) {
        if (this.f2825iwizpuwonk.isEmpty()) {
            return false;
        }
        boolean zGxszxtbevo = btonecajqbVar != null ? btonecajqbVar.gxszxtbevo(wflxmlrfwpVar) : false;
        for (WeakReference weakReference : this.f2825iwizpuwonk) {
            btonecajqb btonecajqbVar2 = (btonecajqb) weakReference.get();
            if (btonecajqbVar2 == null) {
                this.f2825iwizpuwonk.remove(weakReference);
            } else if (!zGxszxtbevo) {
                zGxszxtbevo = btonecajqbVar2.gxszxtbevo(wflxmlrfwpVar);
            }
        }
        return zGxszxtbevo;
    }

    private void crxdokpmqz(int i13, CharSequence charSequence, int i14, Drawable drawable, View view) {
        Resources resourcesIstkbnxepw = istkbnxepw();
        if (view != null) {
            this.f2834rgvfuqvkyq = view;
            this.f2815agtfadlqog = null;
            this.f2831ojitshcjhn = null;
        } else {
            if (i13 > 0) {
                this.f2815agtfadlqog = resourcesIstkbnxepw.getText(i13);
            } else if (charSequence != null) {
                this.f2815agtfadlqog = charSequence;
            }
            if (i14 > 0) {
                this.f2831ojitshcjhn = androidx.core.content.iobyxmoadg.getDrawable(yggfygwlhe(), i14);
            } else if (drawable != null) {
                this.f2831ojitshcjhn = drawable;
            }
            this.f2834rgvfuqvkyq = null;
        }
        jpowsppfya(false);
    }

    private void dsvhmnatus(int i13, boolean z13) {
        if (i13 < 0 || i13 >= this.f2823gxszxtbevo.size()) {
            return;
        }
        this.f2823gxszxtbevo.remove(i13);
        if (z13) {
            jpowsppfya(true);
        }
    }

    private void dxjokdxxww(boolean z13) {
        if (this.f2825iwizpuwonk.isEmpty()) {
            return;
        }
        jztzpxfvev();
        for (WeakReference weakReference : this.f2825iwizpuwonk) {
            btonecajqb btonecajqbVar = (btonecajqb) weakReference.get();
            if (btonecajqbVar == null) {
                this.f2825iwizpuwonk.remove(weakReference);
            } else {
                btonecajqbVar.lqeggnwhkg(z13);
            }
        }
        okpsazkaxt();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void ikoacuggdj(boolean z13) {
        boolean z14;
        if (z13) {
            z14 = this.f2840zoijcleaow.getConfiguration().keyboard != 1 && jztzpxfvev.btonecajqb(ViewConfiguration.get(this.f2824iobyxmoadg), this.f2824iobyxmoadg);
        }
        this.f2837wkgbmnqykc = z14;
    }

    private lqeggnwhkg lqeggnwhkg(int i13, int i14, int i15, int i16, CharSequence charSequence, int i17) {
        return new lqeggnwhkg(this, i13, i14, i15, i16, charSequence, i17);
    }

    private static int zynmafqrjb(int i13) {
        int i14 = ((-65536) & i13) >> 16;
        if (i14 >= 0) {
            int[] iArr = f2814pmvmpeiblj;
            if (i14 < iArr.length) {
                return (i13 & 65535) | (iArr[i14] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return iobyxmoadg(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i13, int i14, int i15, ComponentName componentName, Intent[] intentArr, Intent intent, int i16, MenuItem[] menuItemArr) {
        int i17;
        PackageManager packageManager = this.f2824iobyxmoadg.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i16 & 1) == 0) {
            removeGroup(i13);
        }
        for (int i18 = 0; i18 < size; i18++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i18);
            int i19 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i19 < 0 ? intent : intentArr[i19]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i13, i14, i15, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i17 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i17] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public eablkybsjg cdpycssgdh() {
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        lqeggnwhkg lqeggnwhkgVar = this.f2817cqumvgiudr;
        if (lqeggnwhkgVar != null) {
            gxszxtbevo(lqeggnwhkgVar);
        }
        this.f2823gxszxtbevo.clear();
        jpowsppfya(true);
    }

    public void clearHeader() {
        this.f2831ojitshcjhn = null;
        this.f2815agtfadlqog = null;
        this.f2834rgvfuqvkyq = null;
        jpowsppfya(false);
    }

    public boolean cllcsxoeiz(MenuItem menuItem, btonecajqb btonecajqbVar, int i13) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) menuItem;
        if (lqeggnwhkgVar == null || !lqeggnwhkgVar.isEnabled()) {
            return false;
        }
        boolean zGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
        v1.zoijcleaow zoijcleaowVarZoijcleaow = lqeggnwhkgVar.zoijcleaow();
        boolean z13 = zoijcleaowVarZoijcleaow != null && zoijcleaowVarZoijcleaow.iobyxmoadg();
        if (lqeggnwhkgVar.btonecajqb()) {
            zGtknphoqwx |= lqeggnwhkgVar.expandActionView();
            if (zGtknphoqwx) {
                eablkybsjg(true);
            }
        } else if (lqeggnwhkgVar.hasSubMenu() || z13) {
            if ((i13 & 4) == 0) {
                eablkybsjg(false);
            }
            if (!lqeggnwhkgVar.hasSubMenu()) {
                lqeggnwhkgVar.cqumvgiudr(new wflxmlrfwp(yggfygwlhe(), this, lqeggnwhkgVar));
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) lqeggnwhkgVar.getSubMenu();
            if (z13) {
                zoijcleaowVarZoijcleaow.eablkybsjg(wflxmlrfwpVar);
            }
            zGtknphoqwx |= btonecajqb(wflxmlrfwpVar, btonecajqbVar);
            if (!zGtknphoqwx) {
                eablkybsjg(true);
            }
        } else if ((i13 & 1) == 0) {
            eablkybsjg(true);
        }
        return zGtknphoqwx;
    }

    @Override // android.view.Menu
    public void close() {
        eablkybsjg(true);
    }

    public CharSequence cqumvgiudr() {
        return this.f2815agtfadlqog;
    }

    public int draadjrbmk(int i13) {
        return wflxmlrfwp(i13, 0);
    }

    public final void eablkybsjg(boolean z13) {
        if (this.f2838yggfygwlhe) {
            return;
        }
        this.f2838yggfygwlhe = true;
        for (WeakReference weakReference : this.f2825iwizpuwonk) {
            btonecajqb btonecajqbVar = (btonecajqb) weakReference.get();
            if (btonecajqbVar == null) {
                this.f2825iwizpuwonk.remove(weakReference);
            } else {
                btonecajqbVar.ppxfxbqfkf(this, z13);
            }
        }
        this.f2838yggfygwlhe = false;
    }

    public View esjtqupxsv() {
        return this.f2834rgvfuqvkyq;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i13) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i14);
            if (lqeggnwhkgVar.getItemId() == i13) {
                return lqeggnwhkgVar;
            }
            if (lqeggnwhkgVar.hasSubMenu() && (menuItemFindItem = lqeggnwhkgVar.getSubMenu().findItem(i13)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i13) {
        return (MenuItem) this.f2823gxszxtbevo.get(i13);
    }

    public boolean gtknphoqwx(lqeggnwhkg lqeggnwhkgVar) {
        boolean zWkgbmnqykc = false;
        if (this.f2825iwizpuwonk.isEmpty()) {
            return false;
        }
        jztzpxfvev();
        for (WeakReference weakReference : this.f2825iwizpuwonk) {
            btonecajqb btonecajqbVar = (btonecajqb) weakReference.get();
            if (btonecajqbVar != null) {
                zWkgbmnqykc = btonecajqbVar.wkgbmnqykc(this, lqeggnwhkgVar);
                if (zWkgbmnqykc) {
                    break;
                }
            } else {
                this.f2825iwizpuwonk.remove(weakReference);
            }
        }
        okpsazkaxt();
        if (zWkgbmnqykc) {
            this.f2817cqumvgiudr = lqeggnwhkgVar;
        }
        return zWkgbmnqykc;
    }

    public boolean gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) {
        boolean zDxjokdxxww = false;
        if (!this.f2825iwizpuwonk.isEmpty() && this.f2817cqumvgiudr == lqeggnwhkgVar) {
            jztzpxfvev();
            for (WeakReference weakReference : this.f2825iwizpuwonk) {
                btonecajqb btonecajqbVar = (btonecajqb) weakReference.get();
                if (btonecajqbVar != null) {
                    zDxjokdxxww = btonecajqbVar.dxjokdxxww(this, lqeggnwhkgVar);
                    if (zDxjokdxxww) {
                        break;
                    }
                } else {
                    this.f2825iwizpuwonk.remove(weakReference);
                }
            }
            okpsazkaxt();
            if (zDxjokdxxww) {
                this.f2817cqumvgiudr = null;
            }
        }
        return zDxjokdxxww;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2828lereixgezr) {
            return true;
        }
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((lqeggnwhkg) this.f2823gxszxtbevo.get(i13)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    void hcddaimhww(lqeggnwhkg lqeggnwhkgVar) {
        this.f2830nufgyqmvbu = true;
        jpowsppfya(true);
    }

    public boolean hkdspvbjdz(MenuItem menuItem, int i13) {
        return cllcsxoeiz(menuItem, null, i13);
    }

    protected MenuItem iobyxmoadg(int i13, int i14, int i15, CharSequence charSequence) {
        int iZynmafqrjb = zynmafqrjb(i15);
        lqeggnwhkg lqeggnwhkgVarLqeggnwhkg = lqeggnwhkg(i13, i14, i15, iZynmafqrjb, charSequence, this.f2818draadjrbmk);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2836wflxmlrfwp;
        if (contextMenuInfo != null) {
            lqeggnwhkgVarLqeggnwhkg.jyumaefscl(contextMenuInfo);
        }
        ArrayList arrayList = this.f2823gxszxtbevo;
        arrayList.add(agtfadlqog(arrayList, iZynmafqrjb), lqeggnwhkgVarLqeggnwhkg);
        jpowsppfya(true);
        return lqeggnwhkgVarLqeggnwhkg;
    }

    public boolean iozdgvuglv() {
        return !this.f2835vdvldrhtss;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i13, KeyEvent keyEvent) {
        return rgvfuqvkyq(i13, keyEvent) != null;
    }

    Resources istkbnxepw() {
        return this.f2840zoijcleaow;
    }

    public Drawable iwizpuwonk() {
        return this.f2831ojitshcjhn;
    }

    public void jhduphickx(boolean z13) {
        this.f2828lereixgezr = z13;
    }

    protected eablkybsjg jlmebxxoox(int i13) {
        crxdokpmqz(i13, null, 0, null, null);
        return this;
    }

    public void jpowsppfya(boolean z13) {
        if (this.f2835vdvldrhtss) {
            this.f2832oxmwwwfdhm = true;
            if (z13) {
                this.f2827kcexrzcfyt = true;
                return;
            }
            return;
        }
        if (z13) {
            this.f2830nufgyqmvbu = true;
            this.f2822gtknphoqwx = true;
        }
        dxjokdxxww(z13);
    }

    public lqeggnwhkg jyumaefscl() {
        return this.f2817cqumvgiudr;
    }

    public void jztzpxfvev() {
        if (this.f2835vdvldrhtss) {
            return;
        }
        this.f2835vdvldrhtss = true;
        this.f2832oxmwwwfdhm = false;
        this.f2827kcexrzcfyt = false;
    }

    public ArrayList kcexrzcfyt() {
        oxmwwwfdhm();
        return this.f2819dxjokdxxww;
    }

    public void kegysxyocb(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = getItem(i13);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((wflxmlrfwp) item.getSubMenu()).kegysxyocb(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(zdlpuopuiu(), sparseArray);
        }
    }

    public ArrayList lereixgezr() {
        oxmwwwfdhm();
        return this.f2816btonecajqb;
    }

    public boolean lmojexxdyd() {
        return this.f2821esjtqupxsv;
    }

    public eablkybsjg mbcevpiqjq(int i13) {
        this.f2818draadjrbmk = i13;
        return this;
    }

    void ntlheqmsrt(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2823gxszxtbevo.size();
        jztzpxfvev();
        for (int i13 = 0; i13 < size; i13++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i13);
            if (lqeggnwhkgVar.getGroupId() == groupId && lqeggnwhkgVar.wflxmlrfwp() && lqeggnwhkgVar.isCheckable()) {
                lqeggnwhkgVar.kcexrzcfyt(lqeggnwhkgVar == menuItem);
            }
        }
        okpsazkaxt();
    }

    boolean nufgyqmvbu(eablkybsjg eablkybsjgVar, MenuItem menuItem) {
        iobyxmoadg iobyxmoadgVar = this.f2820eablkybsjg;
        return iobyxmoadgVar != null && iobyxmoadgVar.iobyxmoadg(eablkybsjgVar, menuItem);
    }

    public int ojitshcjhn(int i13) {
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((lqeggnwhkg) this.f2823gxszxtbevo.get(i14)).getItemId() == i13) {
                return i14;
            }
        }
        return -1;
    }

    public void okpsazkaxt() {
        this.f2835vdvldrhtss = false;
        if (this.f2832oxmwwwfdhm) {
            this.f2832oxmwwwfdhm = false;
            jpowsppfya(this.f2827kcexrzcfyt);
        }
    }

    public void oxmwwwfdhm() {
        ArrayList arrayListYadqdtsiqt = yadqdtsiqt();
        if (this.f2822gtknphoqwx) {
            boolean zNufgyqmvbu = false;
            for (WeakReference weakReference : this.f2825iwizpuwonk) {
                btonecajqb btonecajqbVar = (btonecajqb) weakReference.get();
                if (btonecajqbVar == null) {
                    this.f2825iwizpuwonk.remove(weakReference);
                } else {
                    zNufgyqmvbu |= btonecajqbVar.nufgyqmvbu();
                }
            }
            if (zNufgyqmvbu) {
                this.f2819dxjokdxxww.clear();
                this.f2816btonecajqb.clear();
                int size = arrayListYadqdtsiqt.size();
                for (int i13 = 0; i13 < size; i13++) {
                    lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) arrayListYadqdtsiqt.get(i13);
                    if (lqeggnwhkgVar.draadjrbmk()) {
                        this.f2819dxjokdxxww.add(lqeggnwhkgVar);
                    } else {
                        this.f2816btonecajqb.add(lqeggnwhkgVar);
                    }
                }
            } else {
                this.f2819dxjokdxxww.clear();
                this.f2816btonecajqb.clear();
                this.f2816btonecajqb.addAll(yadqdtsiqt());
            }
            this.f2822gtknphoqwx = false;
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i13, int i14) {
        return hkdspvbjdz(findItem(i13), i14);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i13, KeyEvent keyEvent, int i14) {
        lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(i13, keyEvent);
        boolean zHkdspvbjdz = lqeggnwhkgVarRgvfuqvkyq != null ? hkdspvbjdz(lqeggnwhkgVarRgvfuqvkyq, i14) : false;
        if ((i14 & 2) != 0) {
            eablkybsjg(true);
        }
        return zHkdspvbjdz;
    }

    void pkzmftpjix(lqeggnwhkg lqeggnwhkgVar) {
        this.f2822gtknphoqwx = true;
        jpowsppfya(true);
    }

    boolean pmvmpeiblj() {
        return this.f2839zdlpuopuiu;
    }

    public void ppxfxbqfkf(btonecajqb btonecajqbVar, Context context) {
        this.f2825iwizpuwonk.add(new WeakReference(btonecajqbVar));
        btonecajqbVar.btonecajqb(context, this);
        this.f2822gtknphoqwx = true;
    }

    @Override // android.view.Menu
    public void removeGroup(int i13) {
        int iDraadjrbmk = draadjrbmk(i13);
        if (iDraadjrbmk >= 0) {
            int size = this.f2823gxszxtbevo.size() - iDraadjrbmk;
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                if (i14 >= size || ((lqeggnwhkg) this.f2823gxszxtbevo.get(iDraadjrbmk)).getGroupId() != i13) {
                    break;
                }
                dsvhmnatus(iDraadjrbmk, false);
                i14 = i15;
            }
            jpowsppfya(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i13) {
        dsvhmnatus(ojitshcjhn(i13), true);
    }

    lqeggnwhkg rgvfuqvkyq(int i13, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2826jyumaefscl;
        arrayList.clear();
        vdvldrhtss(arrayList, i13, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (lqeggnwhkg) arrayList.get(0);
        }
        boolean zWwaezpbzkn = wwaezpbzkn();
        for (int i14 = 0; i14 < size; i14++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) arrayList.get(i14);
            char alphabeticShortcut = zWwaezpbzkn ? lqeggnwhkgVar.getAlphabeticShortcut() : lqeggnwhkgVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zWwaezpbzkn && alphabeticShortcut == '\b' && i13 == 67))) {
                return lqeggnwhkgVar;
            }
        }
        return null;
    }

    protected eablkybsjg ribwqtqdhb(CharSequence charSequence) {
        crxdokpmqz(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i13, boolean z13, boolean z14) {
        int size = this.f2823gxszxtbevo.size();
        for (int i14 = 0; i14 < size; i14++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i14);
            if (lqeggnwhkgVar.getGroupId() == i13) {
                lqeggnwhkgVar.zdlpuopuiu(z14);
                lqeggnwhkgVar.setCheckable(z13);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z13) {
        this.f2821esjtqupxsv = z13;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i13, boolean z13) {
        int size = this.f2823gxszxtbevo.size();
        for (int i14 = 0; i14 < size; i14++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i14);
            if (lqeggnwhkgVar.getGroupId() == i13) {
                lqeggnwhkgVar.setEnabled(z13);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i13, boolean z13) {
        int size = this.f2823gxszxtbevo.size();
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i14);
            if (lqeggnwhkgVar.getGroupId() == i13 && lqeggnwhkgVar.esjtqupxsv(z13)) {
                z14 = true;
            }
        }
        if (z14) {
            jpowsppfya(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z13) {
        this.f2833ppxfxbqfkf = z13;
        jpowsppfya(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2823gxszxtbevo.size();
    }

    protected eablkybsjg sopmlzcsov(Drawable drawable) {
        crxdokpmqz(0, null, 0, drawable, null);
        return this;
    }

    public void stevsuqkhv(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(zdlpuopuiu());
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = getItem(i13);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((wflxmlrfwp) item.getSubMenu()).stevsuqkhv(bundle);
            }
        }
        int i14 = bundle.getInt("android:menu:expandedactionview");
        if (i14 <= 0 || (menuItemFindItem = findItem(i14)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void tzroggbefp(iobyxmoadg iobyxmoadgVar) {
        this.f2820eablkybsjg = iobyxmoadgVar;
    }

    protected eablkybsjg ulzqkzuiru(int i13) {
        crxdokpmqz(0, null, i13, null, null);
        return this;
    }

    void vdvldrhtss(List list, int i13, KeyEvent keyEvent) {
        boolean zWwaezpbzkn = wwaezpbzkn();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i13 == 67) {
            int size = this.f2823gxszxtbevo.size();
            for (int i14 = 0; i14 < size; i14++) {
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i14);
                if (lqeggnwhkgVar.hasSubMenu()) {
                    ((eablkybsjg) lqeggnwhkgVar.getSubMenu()).vdvldrhtss(list, i13, keyEvent);
                }
                char alphabeticShortcut = zWwaezpbzkn ? lqeggnwhkgVar.getAlphabeticShortcut() : lqeggnwhkgVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zWwaezpbzkn ? lqeggnwhkgVar.getAlphabeticModifiers() : lqeggnwhkgVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zWwaezpbzkn && alphabeticShortcut == '\b' && i13 == 67)) && lqeggnwhkgVar.isEnabled()) {
                        list.add(lqeggnwhkgVar);
                    }
                }
            }
        }
    }

    protected eablkybsjg vipkmwdibw(View view) {
        crxdokpmqz(0, null, 0, null, view);
        return this;
    }

    public int wflxmlrfwp(int i13, int i14) {
        int size = size();
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < size) {
            if (((lqeggnwhkg) this.f2823gxszxtbevo.get(i14)).getGroupId() == i13) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public void wkgbmnqykc() {
        iobyxmoadg iobyxmoadgVar = this.f2820eablkybsjg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.zoijcleaow(this);
        }
    }

    boolean wwaezpbzkn() {
        return this.f2833ppxfxbqfkf;
    }

    public void wypolnanlu(btonecajqb btonecajqbVar) {
        for (WeakReference weakReference : this.f2825iwizpuwonk) {
            btonecajqb btonecajqbVar2 = (btonecajqb) weakReference.get();
            if (btonecajqbVar2 == null || btonecajqbVar2 == btonecajqbVar) {
                this.f2825iwizpuwonk.remove(weakReference);
            }
        }
    }

    public ArrayList yadqdtsiqt() {
        if (!this.f2830nufgyqmvbu) {
            return this.f2829lqeggnwhkg;
        }
        this.f2829lqeggnwhkg.clear();
        int size = this.f2823gxszxtbevo.size();
        for (int i13 = 0; i13 < size; i13++) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) this.f2823gxszxtbevo.get(i13);
            if (lqeggnwhkgVar.isVisible()) {
                this.f2829lqeggnwhkg.add(lqeggnwhkgVar);
            }
        }
        this.f2830nufgyqmvbu = false;
        this.f2822gtknphoqwx = true;
        return this.f2829lqeggnwhkg;
    }

    public Context yggfygwlhe() {
        return this.f2824iobyxmoadg;
    }

    public boolean ylkuphrtab() {
        return this.f2837wkgbmnqykc;
    }

    protected String zdlpuopuiu() {
        return "android:menu:actionviewstates";
    }

    public void zoijcleaow(btonecajqb btonecajqbVar) {
        ppxfxbqfkf(btonecajqbVar, this.f2824iobyxmoadg);
    }

    @Override // android.view.Menu
    public MenuItem add(int i13) {
        return iobyxmoadg(0, 0, 0, this.f2840zoijcleaow.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13) {
        return addSubMenu(0, 0, 0, this.f2840zoijcleaow.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i13, int i14, int i15, CharSequence charSequence) {
        return iobyxmoadg(i13, i14, i15, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) iobyxmoadg(i13, i14, i15, charSequence);
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(this.f2824iobyxmoadg, this, lqeggnwhkgVar);
        lqeggnwhkgVar.cqumvgiudr(wflxmlrfwpVar);
        return wflxmlrfwpVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i13, int i14, int i15, int i16) {
        return iobyxmoadg(i13, i14, i15, this.f2840zoijcleaow.getString(i16));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13, int i14, int i15, int i16) {
        return addSubMenu(i13, i14, i15, this.f2840zoijcleaow.getString(i16));
    }
}
