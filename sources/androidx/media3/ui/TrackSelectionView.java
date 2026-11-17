package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private CheckedTextView[][] f11768cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow f11769cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final List f11770esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private Comparator f11771iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private d5.yadqdtsiqt f11772istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final CheckedTextView f11773iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CheckedTextView f11774jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Map f11775lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f11776pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f11777yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final LayoutInflater f11778yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f11779zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f11780zynmafqrjb;

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final v2.wwaezpbzkn.iobyxmoadg f11781iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f11782zoijcleaow;

        public ppxfxbqfkf(v2.wwaezpbzkn.iobyxmoadg iobyxmoadgVar, int i13) {
            this.f11781iobyxmoadg = iobyxmoadgVar;
            this.f11782zoijcleaow = i13;
        }

        public androidx.media3.common.iobyxmoadg iobyxmoadg() {
            return this.f11781iobyxmoadg.zoijcleaow(this.f11782zoijcleaow);
        }
    }

    private class zoijcleaow implements View.OnClickListener {
        private zoijcleaow() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.ppxfxbqfkf(view);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void btonecajqb() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f11770esjtqupxsv.isEmpty()) {
            this.f11774jyumaefscl.setEnabled(false);
            this.f11773iwizpuwonk.setEnabled(false);
            return;
        }
        this.f11774jyumaefscl.setEnabled(true);
        this.f11773iwizpuwonk.setEnabled(true);
        this.f11768cdpycssgdh = new CheckedTextView[this.f11770esjtqupxsv.size()][];
        boolean zNufgyqmvbu = nufgyqmvbu();
        for (int i13 = 0; i13 < this.f11770esjtqupxsv.size(); i13++) {
            v2.wwaezpbzkn.iobyxmoadg iobyxmoadgVar = (v2.wwaezpbzkn.iobyxmoadg) this.f11770esjtqupxsv.get(i13);
            boolean zLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar);
            CheckedTextView[][] checkedTextViewArr = this.f11768cdpycssgdh;
            int i14 = iobyxmoadgVar.f115698iobyxmoadg;
            checkedTextViewArr[i13] = new CheckedTextView[i14];
            ppxfxbqfkf[] ppxfxbqfkfVarArr = new ppxfxbqfkf[i14];
            for (int i15 = 0; i15 < iobyxmoadgVar.f115698iobyxmoadg; i15++) {
                ppxfxbqfkfVarArr[i15] = new ppxfxbqfkf(iobyxmoadgVar, i15);
            }
            Comparator comparator = this.f11771iozdgvuglv;
            if (comparator != null) {
                Arrays.sort(ppxfxbqfkfVarArr, comparator);
            }
            for (int i16 = 0; i16 < i14; i16++) {
                if (i16 == 0) {
                    addView(this.f11778yggfygwlhe.inflate(d5.lereixgezr.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f11778yggfygwlhe.inflate((zLqeggnwhkg || zNufgyqmvbu) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f11779zdlpuopuiu);
                checkedTextView.setText(this.f11772istkbnxepw.iobyxmoadg(ppxfxbqfkfVarArr[i16].iobyxmoadg()));
                checkedTextView.setTag(ppxfxbqfkfVarArr[i16]);
                if (iobyxmoadgVar.nufgyqmvbu(i16)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f11769cqumvgiudr);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f11768cdpycssgdh[i13][i16] = checkedTextView;
                addView(checkedTextView);
            }
        }
        dxjokdxxww();
    }

    private void dxjokdxxww() {
        this.f11774jyumaefscl.setChecked(this.f11777yadqdtsiqt);
        this.f11773iwizpuwonk.setChecked(!this.f11777yadqdtsiqt && this.f11775lereixgezr.size() == 0);
        for (int i13 = 0; i13 < this.f11768cdpycssgdh.length; i13++) {
            v2.iozdgvuglv iozdgvuglvVar = (v2.iozdgvuglv) this.f11775lereixgezr.get(((v2.wwaezpbzkn.iobyxmoadg) this.f11770esjtqupxsv.get(i13)).iobyxmoadg());
            int i14 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f11768cdpycssgdh[i13];
                if (i14 < checkedTextViewArr.length) {
                    if (iozdgvuglvVar != null) {
                        this.f11768cdpycssgdh[i13][i14].setChecked(iozdgvuglvVar.f115369zoijcleaow.contains(Integer.valueOf(((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(checkedTextViewArr[i14].getTag())).f11782zoijcleaow)));
                    } else {
                        checkedTextViewArr[i14].setChecked(false);
                    }
                    i14++;
                }
            }
        }
    }

    private void eablkybsjg() {
        this.f11777yadqdtsiqt = true;
        this.f11775lereixgezr.clear();
    }

    private void gxszxtbevo(View view) {
        this.f11777yadqdtsiqt = false;
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(view.getTag());
        v2.yadqdtsiqt yadqdtsiqtVarIobyxmoadg = ppxfxbqfkfVar.f11781iobyxmoadg.iobyxmoadg();
        int i13 = ppxfxbqfkfVar.f11782zoijcleaow;
        v2.iozdgvuglv iozdgvuglvVar = (v2.iozdgvuglv) this.f11775lereixgezr.get(yadqdtsiqtVarIobyxmoadg);
        if (iozdgvuglvVar == null) {
            if (!this.f11780zynmafqrjb && this.f11775lereixgezr.size() > 0) {
                this.f11775lereixgezr.clear();
            }
            this.f11775lereixgezr.put(yadqdtsiqtVarIobyxmoadg, new v2.iozdgvuglv(yadqdtsiqtVarIobyxmoadg, com.google.common.collect.zdlpuopuiu.istkbnxepw(Integer.valueOf(i13))));
            return;
        }
        ArrayList arrayList = new ArrayList(iozdgvuglvVar.f115369zoijcleaow);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zLqeggnwhkg = lqeggnwhkg(ppxfxbqfkfVar.f11781iobyxmoadg);
        boolean z13 = zLqeggnwhkg || nufgyqmvbu();
        if (zIsChecked && z13) {
            arrayList.remove(Integer.valueOf(i13));
            if (arrayList.isEmpty()) {
                this.f11775lereixgezr.remove(yadqdtsiqtVarIobyxmoadg);
                return;
            } else {
                this.f11775lereixgezr.put(yadqdtsiqtVarIobyxmoadg, new v2.iozdgvuglv(yadqdtsiqtVarIobyxmoadg, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zLqeggnwhkg) {
            this.f11775lereixgezr.put(yadqdtsiqtVarIobyxmoadg, new v2.iozdgvuglv(yadqdtsiqtVarIobyxmoadg, com.google.common.collect.zdlpuopuiu.istkbnxepw(Integer.valueOf(i13))));
        } else {
            arrayList.add(Integer.valueOf(i13));
            this.f11775lereixgezr.put(yadqdtsiqtVarIobyxmoadg, new v2.iozdgvuglv(yadqdtsiqtVarIobyxmoadg, arrayList));
        }
    }

    private boolean lqeggnwhkg(v2.wwaezpbzkn.iobyxmoadg iobyxmoadgVar) {
        return this.f11776pmvmpeiblj && iobyxmoadgVar.wkgbmnqykc();
    }

    private boolean nufgyqmvbu() {
        return this.f11780zynmafqrjb && this.f11770esjtqupxsv.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ppxfxbqfkf(View view) {
        if (view == this.f11774jyumaefscl) {
            eablkybsjg();
        } else if (view == this.f11773iwizpuwonk) {
            wkgbmnqykc();
        } else {
            gxszxtbevo(view);
        }
        dxjokdxxww();
    }

    private void wkgbmnqykc() {
        this.f11777yadqdtsiqt = false;
        this.f11775lereixgezr.clear();
    }

    public static Map zoijcleaow(Map map, List list, boolean z13) {
        HashMap map2 = new HashMap();
        for (int i13 = 0; i13 < list.size(); i13++) {
            v2.iozdgvuglv iozdgvuglvVar = (v2.iozdgvuglv) map.get(((v2.wwaezpbzkn.iobyxmoadg) list.get(i13)).iobyxmoadg());
            if (iozdgvuglvVar != null && (z13 || map2.isEmpty())) {
                map2.put(iozdgvuglvVar.f115368iobyxmoadg, iozdgvuglvVar);
            }
        }
        return map2;
    }

    public boolean getIsDisabled() {
        return this.f11777yadqdtsiqt;
    }

    public Map<v2.yadqdtsiqt, v2.iozdgvuglv> getOverrides() {
        return this.f11775lereixgezr;
    }

    public void setAllowAdaptiveSelections(boolean z13) {
        if (this.f11776pmvmpeiblj != z13) {
            this.f11776pmvmpeiblj = z13;
            btonecajqb();
        }
    }

    public void setAllowMultipleOverrides(boolean z13) {
        if (this.f11780zynmafqrjb != z13) {
            this.f11780zynmafqrjb = z13;
            if (!z13 && this.f11775lereixgezr.size() > 1) {
                Map mapZoijcleaow = zoijcleaow(this.f11775lereixgezr, this.f11770esjtqupxsv, false);
                this.f11775lereixgezr.clear();
                this.f11775lereixgezr.putAll(mapZoijcleaow);
            }
            btonecajqb();
        }
    }

    public void setShowDisableOption(boolean z13) {
        this.f11774jyumaefscl.setVisibility(z13 ? 0 : 8);
    }

    public void setTrackNameProvider(d5.yadqdtsiqt yadqdtsiqtVar) {
        this.f11772istkbnxepw = (d5.yadqdtsiqt) y2.iobyxmoadg.eablkybsjg(yadqdtsiqtVar);
        btonecajqb();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f11779zdlpuopuiu = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f11778yggfygwlhe = layoutInflaterFrom;
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f11769cqumvgiudr = zoijcleaowVar;
        this.f11772istkbnxepw = new d5.eablkybsjg(getResources());
        this.f11770esjtqupxsv = new ArrayList();
        this.f11775lereixgezr = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f11774jyumaefscl = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(d5.zynmafqrjb.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(zoijcleaowVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(d5.lereixgezr.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f11773iwizpuwonk = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(d5.zynmafqrjb.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(zoijcleaowVar);
        addView(checkedTextView2);
    }
}
