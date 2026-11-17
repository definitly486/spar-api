package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc extends RecyclerView.nufgyqmvbu implements Preference.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PreferenceGroup f12517iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private List f12518ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f12519wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f12520zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Runnable f12516gxszxtbevo = new iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Handler f12515eablkybsjg = new Handler(Looper.getMainLooper());

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wkgbmnqykc.this.btonecajqb();
        }
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f12522iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        String f12523ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f12524zoijcleaow;

        ppxfxbqfkf(Preference preference) {
            this.f12523ppxfxbqfkf = preference.getClass().getName();
            this.f12522iobyxmoadg = preference.agtfadlqog();
            this.f12524zoijcleaow = preference.lereixgezr();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f12522iobyxmoadg == ppxfxbqfkfVar.f12522iobyxmoadg && this.f12524zoijcleaow == ppxfxbqfkfVar.f12524zoijcleaow && TextUtils.equals(this.f12523ppxfxbqfkf, ppxfxbqfkfVar.f12523ppxfxbqfkf);
        }

        public int hashCode() {
            return ((((527 + this.f12522iobyxmoadg) * 31) + this.f12524zoijcleaow) * 31) + this.f12523ppxfxbqfkf.hashCode();
        }
    }

    class zoijcleaow implements Preference.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f12525iobyxmoadg;

        zoijcleaow(PreferenceGroup preferenceGroup) {
            this.f12525iobyxmoadg = preferenceGroup;
        }

        @Override // androidx.preference.Preference.ppxfxbqfkf
        public boolean iobyxmoadg(Preference preference) {
            this.f12525iobyxmoadg.auzgnhcxok(Integer.MAX_VALUE);
            wkgbmnqykc.this.zoijcleaow(preference);
            this.f12525iobyxmoadg.nuxfzjnpeb();
            return true;
        }
    }

    public wkgbmnqykc(PreferenceGroup preferenceGroup) {
        this.f12517iobyxmoadg = preferenceGroup;
        preferenceGroup.rlfsiqarku(this);
        this.f12520zoijcleaow = new ArrayList();
        this.f12518ppxfxbqfkf = new ArrayList();
        this.f12519wkgbmnqykc = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).dvvnrvtcbc());
        } else {
            setHasStableIds(true);
        }
        btonecajqb();
    }

    private void eablkybsjg(List list, PreferenceGroup preferenceGroup) {
        preferenceGroup.iwxlajgraz();
        int iRoivzttewh = preferenceGroup.roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            Preference preferenceTbqsvytpvh = preferenceGroup.tbqsvytpvh(i13);
            list.add(preferenceTbqsvytpvh);
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(preferenceTbqsvytpvh);
            if (!this.f12519wkgbmnqykc.contains(ppxfxbqfkfVar)) {
                this.f12519wkgbmnqykc.add(ppxfxbqfkfVar);
            }
            if (preferenceTbqsvytpvh instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceTbqsvytpvh;
                if (preferenceGroup2.uawqvzlxes()) {
                    eablkybsjg(list, preferenceGroup2);
                }
            }
            preferenceTbqsvytpvh.rlfsiqarku(this);
        }
    }

    private boolean lqeggnwhkg(PreferenceGroup preferenceGroup) {
        return preferenceGroup.zeieaojujs() != Integer.MAX_VALUE;
    }

    private androidx.preference.iobyxmoadg ppxfxbqfkf(PreferenceGroup preferenceGroup, List list) {
        androidx.preference.iobyxmoadg iobyxmoadgVar = new androidx.preference.iobyxmoadg(preferenceGroup.lqeggnwhkg(), list, preferenceGroup.gtknphoqwx());
        iobyxmoadgVar.czzsidtyhn(new zoijcleaow(preferenceGroup));
        return iobyxmoadgVar;
    }

    private List wkgbmnqykc(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRoivzttewh = preferenceGroup.roivzttewh();
        int i13 = 0;
        for (int i14 = 0; i14 < iRoivzttewh; i14++) {
            Preference preferenceTbqsvytpvh = preferenceGroup.tbqsvytpvh(i14);
            if (preferenceTbqsvytpvh.iozdgvuglv()) {
                if (!lqeggnwhkg(preferenceGroup) || i13 < preferenceGroup.zeieaojujs()) {
                    arrayList.add(preferenceTbqsvytpvh);
                } else {
                    arrayList2.add(preferenceTbqsvytpvh);
                }
                if (preferenceTbqsvytpvh instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceTbqsvytpvh;
                    if (!preferenceGroup2.uawqvzlxes()) {
                        continue;
                    } else {
                        if (lqeggnwhkg(preferenceGroup) && lqeggnwhkg(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : wkgbmnqykc(preferenceGroup2)) {
                            if (!lqeggnwhkg(preferenceGroup) || i13 < preferenceGroup.zeieaojujs()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i13++;
                        }
                    }
                } else {
                    i13++;
                }
            }
        }
        if (lqeggnwhkg(preferenceGroup) && i13 > preferenceGroup.zeieaojujs()) {
            arrayList.add(ppxfxbqfkf(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    void btonecajqb() {
        Iterator it = this.f12520zoijcleaow.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).rlfsiqarku(null);
        }
        ArrayList arrayList = new ArrayList(this.f12520zoijcleaow.size());
        this.f12520zoijcleaow = arrayList;
        eablkybsjg(arrayList, this.f12517iobyxmoadg);
        this.f12518ppxfxbqfkf = wkgbmnqykc(this.f12517iobyxmoadg);
        gxszxtbevo gxszxtbevoVarJyumaefscl = this.f12517iobyxmoadg.jyumaefscl();
        if (gxszxtbevoVarJyumaefscl != null) {
            gxszxtbevoVarJyumaefscl.gxszxtbevo();
        }
        notifyDataSetChanged();
        Iterator it2 = this.f12520zoijcleaow.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).zoijcleaow();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu onCreateViewHolder(ViewGroup viewGroup, int i13) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f12519wkgbmnqykc.get(i13);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, vdvldrhtss.BackgroundStyle);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(vdvldrhtss.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = nufgyqmvbu.iobyxmoadg.zoijcleaow(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(ppxfxbqfkfVar.f12522iobyxmoadg, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            jhduphickx.weqkydbzbr(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i14 = ppxfxbqfkfVar.f12524zoijcleaow;
            if (i14 != 0) {
                layoutInflaterFrom.inflate(i14, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new nufgyqmvbu(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return this.f12518ppxfxbqfkf.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public long getItemId(int i13) {
        if (hasStableIds()) {
            return gxszxtbevo(i13).gtknphoqwx();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemViewType(int i13) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevo(i13));
        int iIndexOf = this.f12519wkgbmnqykc.indexOf(ppxfxbqfkfVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f12519wkgbmnqykc.size();
        this.f12519wkgbmnqykc.add(ppxfxbqfkfVar);
        return size;
    }

    public Preference gxszxtbevo(int i13) {
        if (i13 < 0 || i13 >= getItemCount()) {
            return null;
        }
        return (Preference) this.f12518ppxfxbqfkf.get(i13);
    }

    @Override // androidx.preference.Preference.zoijcleaow
    public void iobyxmoadg(Preference preference) {
        int iIndexOf = this.f12518ppxfxbqfkf.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(nufgyqmvbu nufgyqmvbuVar, int i13) {
        Preference preferenceGxszxtbevo = gxszxtbevo(i13);
        nufgyqmvbuVar.eablkybsjg();
        preferenceGxszxtbevo.hcddaimhww(nufgyqmvbuVar);
    }

    @Override // androidx.preference.Preference.zoijcleaow
    public void zoijcleaow(Preference preference) {
        this.f12515eablkybsjg.removeCallbacks(this.f12516gxszxtbevo);
        this.f12515eablkybsjg.post(this.f12516gxszxtbevo);
    }
}
