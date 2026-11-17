package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.jztzpxfvev;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo extends ActionMode {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Context f2698iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final zoijcleaow f2699zoijcleaow;

    public static class iobyxmoadg implements zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final ActionMode.Callback f2700iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final ArrayList f2701ppxfxbqfkf = new ArrayList();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final jztzpxfvev f2702wkgbmnqykc = new jztzpxfvev();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Context f2703zoijcleaow;

        public iobyxmoadg(Context context, ActionMode.Callback callback) {
            this.f2703zoijcleaow = context;
            this.f2700iobyxmoadg = callback;
        }

        private Menu gxszxtbevo(Menu menu) {
            Menu menu2 = (Menu) this.f2702wkgbmnqykc.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            draadjrbmk.wkgbmnqykc wkgbmnqykcVar = new draadjrbmk.wkgbmnqykc(this.f2703zoijcleaow, (m1.iobyxmoadg) menu);
            this.f2702wkgbmnqykc.put(menu, wkgbmnqykcVar);
            return wkgbmnqykcVar;
        }

        public ActionMode eablkybsjg(zoijcleaow zoijcleaowVar) {
            int size = this.f2701ppxfxbqfkf.size();
            for (int i13 = 0; i13 < size; i13++) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) this.f2701ppxfxbqfkf.get(i13);
                if (gxszxtbevoVar != null && gxszxtbevoVar.f2699zoijcleaow == zoijcleaowVar) {
                    return gxszxtbevoVar;
                }
            }
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(this.f2703zoijcleaow, zoijcleaowVar);
            this.f2701ppxfxbqfkf.add(gxszxtbevoVar2);
            return gxszxtbevoVar2;
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public void iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f2700iobyxmoadg.onDestroyActionMode(eablkybsjg(zoijcleaowVar));
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public boolean ppxfxbqfkf(zoijcleaow zoijcleaowVar, MenuItem menuItem) {
            return this.f2700iobyxmoadg.onActionItemClicked(eablkybsjg(zoijcleaowVar), new draadjrbmk.ppxfxbqfkf(this.f2703zoijcleaow, (m1.zoijcleaow) menuItem));
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public boolean wkgbmnqykc(zoijcleaow zoijcleaowVar, Menu menu) {
            return this.f2700iobyxmoadg.onPrepareActionMode(eablkybsjg(zoijcleaowVar), gxszxtbevo(menu));
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public boolean zoijcleaow(zoijcleaow zoijcleaowVar, Menu menu) {
            return this.f2700iobyxmoadg.onCreateActionMode(eablkybsjg(zoijcleaowVar), gxszxtbevo(menu));
        }
    }

    public gxszxtbevo(Context context, zoijcleaow zoijcleaowVar) {
        this.f2698iobyxmoadg = context;
        this.f2699zoijcleaow = zoijcleaowVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2699zoijcleaow.ppxfxbqfkf();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2699zoijcleaow.wkgbmnqykc();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new draadjrbmk.wkgbmnqykc(this.f2698iobyxmoadg, (m1.iobyxmoadg) this.f2699zoijcleaow.eablkybsjg());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2699zoijcleaow.gxszxtbevo();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2699zoijcleaow.lqeggnwhkg();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2699zoijcleaow.nufgyqmvbu();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2699zoijcleaow.dxjokdxxww();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2699zoijcleaow.btonecajqb();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2699zoijcleaow.gtknphoqwx();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2699zoijcleaow.draadjrbmk();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2699zoijcleaow.wflxmlrfwp(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2699zoijcleaow.ojitshcjhn(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2699zoijcleaow.rgvfuqvkyq(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2699zoijcleaow.oxmwwwfdhm(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z13) {
        this.f2699zoijcleaow.kcexrzcfyt(z13);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i13) {
        this.f2699zoijcleaow.agtfadlqog(i13);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i13) {
        this.f2699zoijcleaow.vdvldrhtss(i13);
    }
}
