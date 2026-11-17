package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private String f12381cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f12382cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f12383cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private int f12384crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f12385dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f12386esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private String f12387hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f12388hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private boolean f12389ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private String f12390iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Drawable f12391istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ppxfxbqfkf f12392iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private boolean f12393jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private zoijcleaow f12394jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private Object f12395jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f12396jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private eablkybsjg f12397jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f12398kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private CharSequence f12399lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private Bundle f12400lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private boolean f12401mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private boolean f12402ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private wkgbmnqykc f12403okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f12404pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private CharSequence f12405pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private List f12406ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private int f12407sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f12408stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f12409tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f12410ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private PreferenceGroup f12411vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f12412wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f12413wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private final View.OnClickListener f12414xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Intent f12415yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private gxszxtbevo f12416yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f12417ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f12418zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f12419zynmafqrjb;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new iobyxmoadg();

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i13) {
                return new BaseSavedState[i13];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface eablkybsjg {
        CharSequence iobyxmoadg(Preference preference);
    }

    class iobyxmoadg implements View.OnClickListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.ntlheqmsrt(view);
        }
    }

    public interface ppxfxbqfkf {
        boolean iobyxmoadg(Preference preference);
    }

    private static class wkgbmnqykc implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Preference f12421zdlpuopuiu;

        wkgbmnqykc(Preference preference) {
            this.f12421zdlpuopuiu = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceIwizpuwonk = this.f12421zdlpuopuiu.iwizpuwonk();
            if (!this.f12421zdlpuopuiu.zynmafqrjb() || TextUtils.isEmpty(charSequenceIwizpuwonk)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceIwizpuwonk);
            contextMenu.add(0, 0, 0, ojitshcjhn.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f12421zdlpuopuiu.lqeggnwhkg().getSystemService("clipboard");
            CharSequence charSequenceIwizpuwonk = this.f12421zdlpuopuiu.iwizpuwonk();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceIwizpuwonk));
            Toast.makeText(this.f12421zdlpuopuiu.lqeggnwhkg(), this.f12421zdlpuopuiu.lqeggnwhkg().getString(ojitshcjhn.preference_copied, charSequenceIwizpuwonk), 0).show();
            return true;
        }
    }

    interface zoijcleaow {
        void iobyxmoadg(Preference preference);

        void zoijcleaow(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f12383cqumvgiudr = Integer.MAX_VALUE;
        this.f12386esjtqupxsv = 0;
        this.f12412wwaezpbzkn = true;
        this.f12417ylkuphrtab = true;
        this.f12404pkzmftpjix = true;
        this.f12388hkdspvbjdz = true;
        this.f12382cllcsxoeiz = true;
        this.f12385dsvhmnatus = true;
        this.f12413wypolnanlu = true;
        this.f12408stevsuqkhv = true;
        this.f12409tzroggbefp = true;
        this.f12410ulzqkzuiru = true;
        this.f12407sopmlzcsov = agtfadlqog.preference;
        this.f12414xrmfcynszj = new iobyxmoadg();
        this.f12418zdlpuopuiu = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.Preference, i13, i14);
        this.f12419zynmafqrjb = i1.gtknphoqwx.draadjrbmk(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_icon, vdvldrhtss.Preference_android_icon, 0);
        this.f12381cdpycssgdh = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_key, vdvldrhtss.Preference_android_key);
        this.f12399lereixgezr = i1.gtknphoqwx.agtfadlqog(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_title, vdvldrhtss.Preference_android_title);
        this.f12405pmvmpeiblj = i1.gtknphoqwx.agtfadlqog(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_summary, vdvldrhtss.Preference_android_summary);
        this.f12383cqumvgiudr = i1.gtknphoqwx.wkgbmnqykc(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_order, vdvldrhtss.Preference_android_order, Integer.MAX_VALUE);
        this.f12390iozdgvuglv = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_fragment, vdvldrhtss.Preference_android_fragment);
        this.f12407sopmlzcsov = i1.gtknphoqwx.draadjrbmk(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_layout, vdvldrhtss.Preference_android_layout, agtfadlqog.preference);
        this.f12384crxdokpmqz = i1.gtknphoqwx.draadjrbmk(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_widgetLayout, vdvldrhtss.Preference_android_widgetLayout, 0);
        this.f12412wwaezpbzkn = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_enabled, vdvldrhtss.Preference_android_enabled, true);
        this.f12417ylkuphrtab = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_selectable, vdvldrhtss.Preference_android_selectable, true);
        this.f12404pkzmftpjix = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_persistent, vdvldrhtss.Preference_android_persistent, true);
        this.f12387hcddaimhww = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_dependency, vdvldrhtss.Preference_android_dependency);
        int i15 = vdvldrhtss.Preference_allowDividerAbove;
        this.f12413wypolnanlu = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i15, i15, this.f12417ylkuphrtab);
        int i16 = vdvldrhtss.Preference_allowDividerBelow;
        this.f12408stevsuqkhv = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i16, i16, this.f12417ylkuphrtab);
        if (typedArrayObtainStyledAttributes.hasValue(vdvldrhtss.Preference_defaultValue)) {
            this.f12395jpowsppfya = dsvhmnatus(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_defaultValue);
        } else if (typedArrayObtainStyledAttributes.hasValue(vdvldrhtss.Preference_android_defaultValue)) {
            this.f12395jpowsppfya = dsvhmnatus(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_android_defaultValue);
        }
        this.f12410ulzqkzuiru = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_shouldDisableView, vdvldrhtss.Preference_android_shouldDisableView, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(vdvldrhtss.Preference_singleLineTitle);
        this.f12398kegysxyocb = zHasValue;
        if (zHasValue) {
            this.f12409tzroggbefp = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_singleLineTitle, vdvldrhtss.Preference_android_singleLineTitle, true);
        }
        this.f12401mbcevpiqjq = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, vdvldrhtss.Preference_iconSpaceReserved, vdvldrhtss.Preference_android_iconSpaceReserved, false);
        int i17 = vdvldrhtss.Preference_isPreferenceVisible;
        this.f12385dsvhmnatus = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i17, i17, true);
        int i18 = vdvldrhtss.Preference_enableCopying;
        this.f12402ntlheqmsrt = i1.gtknphoqwx.zoijcleaow(typedArrayObtainStyledAttributes, i18, i18, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void iyctptxqzt() {
        Preference preferenceGxszxtbevo;
        String str = this.f12387hcddaimhww;
        if (str == null || (preferenceGxszxtbevo = gxszxtbevo(str)) == null) {
            return;
        }
        preferenceGxszxtbevo.weqkydbzbr(this);
    }

    private void okpsazkaxt(View view, boolean z13) {
        view.setEnabled(z13);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                okpsazkaxt(viewGroup.getChildAt(childCount), z13);
            }
        }
    }

    private void opjhrmiecq(SharedPreferences.Editor editor) {
        if (this.f12416yggfygwlhe.agtfadlqog()) {
            editor.apply();
        }
    }

    private void ribwqtqdhb() {
        if (TextUtils.isEmpty(this.f12387hcddaimhww)) {
            return;
        }
        Preference preferenceGxszxtbevo = gxszxtbevo(this.f12387hcddaimhww);
        if (preferenceGxszxtbevo != null) {
            preferenceGxszxtbevo.vipkmwdibw(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f12387hcddaimhww + "\" not found for preference \"" + this.f12381cdpycssgdh + "\" (title: \"" + ((Object) this.f12399lereixgezr) + "\"");
    }

    private void vipkmwdibw(Preference preference) {
        if (this.f12406ribwqtqdhb == null) {
            this.f12406ribwqtqdhb = new ArrayList();
        }
        this.f12406ribwqtqdhb.add(preference);
        preference.hkdspvbjdz(this, oipsdeybqn());
    }

    private void weqkydbzbr(Preference preference) {
        List list = this.f12406ribwqtqdhb;
        if (list != null) {
            list.remove(preference);
        }
    }

    public final int agtfadlqog() {
        return this.f12407sopmlzcsov;
    }

    protected boolean bfopjjpdmp() {
        return this.f12416yggfygwlhe != null && cdpycssgdh() && pmvmpeiblj();
    }

    public String btonecajqb() {
        return this.f12390iozdgvuglv;
    }

    public boolean cdpycssgdh() {
        return this.f12404pkzmftpjix;
    }

    public void cllcsxoeiz() {
        iyctptxqzt();
        this.f12393jhduphickx = true;
    }

    public final eablkybsjg cqumvgiudr() {
        return this.f12397jztzpxfvev;
    }

    protected boolean crxdokpmqz(String str) {
        if (!bfopjjpdmp()) {
            return false;
        }
        if (TextUtils.equals(str, oxmwwwfdhm(null))) {
            return true;
        }
        zdlpuopuiu();
        SharedPreferences.Editor editorPpxfxbqfkf = this.f12416yggfygwlhe.ppxfxbqfkf();
        editorPpxfxbqfkf.putString(this.f12381cdpycssgdh, str);
        opjhrmiecq(editorPpxfxbqfkf);
        return true;
    }

    public void czzsidtyhn(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f12392iwizpuwonk = ppxfxbqfkfVar;
    }

    public Intent draadjrbmk() {
        return this.f12415yadqdtsiqt;
    }

    protected Object dsvhmnatus(TypedArray typedArray, int i13) {
        return null;
    }

    StringBuilder dxjokdxxww() {
        StringBuilder sb3 = new StringBuilder();
        CharSequence charSequenceEsjtqupxsv = esjtqupxsv();
        if (!TextUtils.isEmpty(charSequenceEsjtqupxsv)) {
            sb3.append(charSequenceEsjtqupxsv);
            sb3.append(' ');
        }
        CharSequence charSequenceIwizpuwonk = iwizpuwonk();
        if (!TextUtils.isEmpty(charSequenceIwizpuwonk)) {
            sb3.append(charSequenceIwizpuwonk);
            sb3.append(' ');
        }
        if (sb3.length() > 0) {
            sb3.setLength(sb3.length() - 1);
        }
        return sb3;
    }

    void eablkybsjg(Bundle bundle) {
        if (pmvmpeiblj()) {
            this.f12389ikoacuggdj = false;
            Parcelable parcelableTzroggbefp = tzroggbefp();
            if (!this.f12389ikoacuggdj) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableTzroggbefp != null) {
                bundle.putParcelable(this.f12381cdpycssgdh, parcelableTzroggbefp);
            }
        }
    }

    public CharSequence esjtqupxsv() {
        return this.f12399lereixgezr;
    }

    long gtknphoqwx() {
        return this.f12396jyumaefscl;
    }

    protected Preference gxszxtbevo(String str) {
        gxszxtbevo gxszxtbevoVar = this.f12416yggfygwlhe;
        if (gxszxtbevoVar == null) {
            return null;
        }
        return gxszxtbevoVar.iobyxmoadg(str);
    }

    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        Integer numValueOf;
        View view = nufgyqmvbuVar.itemView;
        view.setOnClickListener(this.f12414xrmfcynszj);
        view.setId(this.f12386esjtqupxsv);
        TextView textView = (TextView) nufgyqmvbuVar.zoijcleaow(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceIwizpuwonk = iwizpuwonk();
            if (TextUtils.isEmpty(charSequenceIwizpuwonk)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceIwizpuwonk);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) nufgyqmvbuVar.zoijcleaow(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceEsjtqupxsv = esjtqupxsv();
            if (TextUtils.isEmpty(charSequenceEsjtqupxsv)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceEsjtqupxsv);
                textView2.setVisibility(0);
                if (this.f12398kegysxyocb) {
                    textView2.setSingleLine(this.f12409tzroggbefp);
                }
                if (!yadqdtsiqt() && istkbnxepw() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) nufgyqmvbuVar.zoijcleaow(R.id.icon);
        if (imageView != null) {
            int i13 = this.f12419zynmafqrjb;
            if (i13 != 0 || this.f12391istkbnxepw != null) {
                if (this.f12391istkbnxepw == null) {
                    this.f12391istkbnxepw = nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f12418zdlpuopuiu, i13);
                }
                Drawable drawable = this.f12391istkbnxepw;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f12391istkbnxepw != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f12401mbcevpiqjq ? 4 : 8);
            }
        }
        View viewZoijcleaow = nufgyqmvbuVar.zoijcleaow(draadjrbmk.icon_frame);
        if (viewZoijcleaow == null) {
            viewZoijcleaow = nufgyqmvbuVar.zoijcleaow(R.id.icon_frame);
        }
        if (viewZoijcleaow != null) {
            if (this.f12391istkbnxepw != null) {
                viewZoijcleaow.setVisibility(0);
            } else {
                viewZoijcleaow.setVisibility(this.f12401mbcevpiqjq ? 4 : 8);
            }
        }
        if (this.f12410ulzqkzuiru) {
            okpsazkaxt(view, istkbnxepw());
        } else {
            okpsazkaxt(view, true);
        }
        boolean zYadqdtsiqt = yadqdtsiqt();
        view.setFocusable(zYadqdtsiqt);
        view.setClickable(zYadqdtsiqt);
        nufgyqmvbuVar.gxszxtbevo(this.f12413wypolnanlu);
        nufgyqmvbuVar.lqeggnwhkg(this.f12408stevsuqkhv);
        boolean zZynmafqrjb = zynmafqrjb();
        if (zZynmafqrjb && this.f12403okpsazkaxt == null) {
            this.f12403okpsazkaxt = new wkgbmnqykc(this);
        }
        view.setOnCreateContextMenuListener(zZynmafqrjb ? this.f12403okpsazkaxt : null);
        view.setLongClickable(zZynmafqrjb);
        if (!zZynmafqrjb || zYadqdtsiqt) {
            return;
        }
        jhduphickx.weqkydbzbr(view, null);
    }

    public void hkdspvbjdz(Preference preference, boolean z13) {
        if (this.f12388hkdspvbjdz == z13) {
            this.f12388hkdspvbjdz = !z13;
            wwaezpbzkn(oipsdeybqn());
            lmojexxdyd();
        }
    }

    public void ikoacuggdj(Bundle bundle) {
        eablkybsjg(bundle);
    }

    public boolean iobyxmoadg(Object obj) {
        return true;
    }

    public final boolean iozdgvuglv() {
        return this.f12385dsvhmnatus;
    }

    public boolean istkbnxepw() {
        return this.f12412wwaezpbzkn && this.f12388hkdspvbjdz && this.f12382cllcsxoeiz;
    }

    public CharSequence iwizpuwonk() {
        return cqumvgiudr() != null ? cqumvgiudr().iobyxmoadg(this) : this.f12405pmvmpeiblj;
    }

    public void jhduphickx(Bundle bundle) {
        wkgbmnqykc(bundle);
    }

    public boolean jlmebxxoox(Set set) {
        if (!bfopjjpdmp()) {
            return false;
        }
        if (set.equals(kcexrzcfyt(null))) {
            return true;
        }
        zdlpuopuiu();
        SharedPreferences.Editor editorPpxfxbqfkf = this.f12416yggfygwlhe.ppxfxbqfkf();
        editorPpxfxbqfkf.putStringSet(this.f12381cdpycssgdh, set);
        opjhrmiecq(editorPpxfxbqfkf);
        return true;
    }

    protected void jpowsppfya() {
    }

    public gxszxtbevo jyumaefscl() {
        return this.f12416yggfygwlhe;
    }

    public void jztzpxfvev(int i13) {
        xrmfcynszj(nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f12418zdlpuopuiu, i13));
        this.f12419zynmafqrjb = i13;
    }

    public Set kcexrzcfyt(Set set) {
        if (!bfopjjpdmp()) {
            return set;
        }
        zdlpuopuiu();
        return this.f12416yggfygwlhe.dxjokdxxww().getStringSet(this.f12381cdpycssgdh, set);
    }

    protected void kegysxyocb(Parcelable parcelable) {
        this.f12389ikoacuggdj = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public final int lereixgezr() {
        return this.f12384crxdokpmqz;
    }

    protected void lmojexxdyd() {
        zoijcleaow zoijcleaowVar = this.f12394jlmebxxoox;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this);
        }
    }

    public Context lqeggnwhkg() {
        return this.f12418zdlpuopuiu;
    }

    public void mbcevpiqjq() {
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg;
        if (istkbnxepw() && yadqdtsiqt()) {
            jpowsppfya();
            ppxfxbqfkf ppxfxbqfkfVar = this.f12392iwizpuwonk;
            if (ppxfxbqfkfVar == null || !ppxfxbqfkfVar.iobyxmoadg(this)) {
                gxszxtbevo gxszxtbevoVarJyumaefscl = jyumaefscl();
                if ((gxszxtbevoVarJyumaefscl == null || (ppxfxbqfkfVarEablkybsjg = gxszxtbevoVarJyumaefscl.eablkybsjg()) == null || !ppxfxbqfkfVarEablkybsjg.zdlpuopuiu(this)) && this.f12415yadqdtsiqt != null) {
                    lqeggnwhkg().startActivity(this.f12415yadqdtsiqt);
                }
            }
        }
    }

    public void metgxyhuhe(int i13) {
        this.f12407sopmlzcsov = i13;
    }

    protected void ntlheqmsrt(View view) {
        mbcevpiqjq();
    }

    public Bundle nufgyqmvbu() {
        if (this.f12400lmojexxdyd == null) {
            this.f12400lmojexxdyd = new Bundle();
        }
        return this.f12400lmojexxdyd;
    }

    public boolean oipsdeybqn() {
        return !istkbnxepw();
    }

    public PreferenceGroup ojitshcjhn() {
        return this.f12411vipkmwdibw;
    }

    protected String oxmwwwfdhm(String str) {
        if (!bfopjjpdmp()) {
            return str;
        }
        zdlpuopuiu();
        return this.f12416yggfygwlhe.dxjokdxxww().getString(this.f12381cdpycssgdh, str);
    }

    public void pkzmftpjix() {
        ribwqtqdhb();
    }

    public boolean pmvmpeiblj() {
        return !TextUtils.isEmpty(this.f12381cdpycssgdh);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i13 = this.f12383cqumvgiudr;
        int i14 = preference.f12383cqumvgiudr;
        if (i13 != i14) {
            return i13 - i14;
        }
        CharSequence charSequence = this.f12399lereixgezr;
        CharSequence charSequence2 = preference.f12399lereixgezr;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f12399lereixgezr.toString());
    }

    protected boolean rgvfuqvkyq(boolean z13) {
        if (!bfopjjpdmp()) {
            return z13;
        }
        zdlpuopuiu();
        return this.f12416yggfygwlhe.dxjokdxxww().getBoolean(this.f12381cdpycssgdh, z13);
    }

    final void rlfsiqarku(zoijcleaow zoijcleaowVar) {
        this.f12394jlmebxxoox = zoijcleaowVar;
    }

    public void sflfametgt(int i13) {
        zfvoamnweg(this.f12418zdlpuopuiu.getString(i13));
    }

    protected boolean sopmlzcsov(int i13) {
        if (!bfopjjpdmp()) {
            return false;
        }
        if (i13 == vdvldrhtss(~i13)) {
            return true;
        }
        zdlpuopuiu();
        SharedPreferences.Editor editorPpxfxbqfkf = this.f12416yggfygwlhe.ppxfxbqfkf();
        editorPpxfxbqfkf.putInt(this.f12381cdpycssgdh, i13);
        opjhrmiecq(editorPpxfxbqfkf);
        return true;
    }

    public void stevsuqkhv(Preference preference, boolean z13) {
        if (this.f12382cllcsxoeiz == z13) {
            this.f12382cllcsxoeiz = !z13;
            wwaezpbzkn(oipsdeybqn());
            lmojexxdyd();
        }
    }

    public String toString() {
        return dxjokdxxww().toString();
    }

    protected Parcelable tzroggbefp() {
        this.f12389ikoacuggdj = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected boolean ulzqkzuiru(boolean z13) {
        if (!bfopjjpdmp()) {
            return false;
        }
        if (z13 == rgvfuqvkyq(!z13)) {
            return true;
        }
        zdlpuopuiu();
        SharedPreferences.Editor editorPpxfxbqfkf = this.f12416yggfygwlhe.ppxfxbqfkf();
        editorPpxfxbqfkf.putBoolean(this.f12381cdpycssgdh, z13);
        opjhrmiecq(editorPpxfxbqfkf);
        return true;
    }

    public void uwvvkdfqfp(int i13) {
        if (i13 != this.f12383cqumvgiudr) {
            this.f12383cqumvgiudr = i13;
            ylkuphrtab();
        }
    }

    protected int vdvldrhtss(int i13) {
        if (!bfopjjpdmp()) {
            return i13;
        }
        zdlpuopuiu();
        return this.f12416yggfygwlhe.dxjokdxxww().getInt(this.f12381cdpycssgdh, i13);
    }

    public String wflxmlrfwp() {
        return this.f12381cdpycssgdh;
    }

    void wkgbmnqykc(Bundle bundle) {
        Parcelable parcelable;
        if (!pmvmpeiblj() || (parcelable = bundle.getParcelable(this.f12381cdpycssgdh)) == null) {
            return;
        }
        this.f12389ikoacuggdj = false;
        kegysxyocb(parcelable);
        if (!this.f12389ikoacuggdj) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void wwaezpbzkn(boolean z13) {
        List list = this.f12406ribwqtqdhb;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((Preference) list.get(i13)).hkdspvbjdz(this, z13);
        }
    }

    public void wypolnanlu(zdlpuopuiu zdlpuopuiuVar) {
    }

    public void xrmfcynszj(Drawable drawable) {
        if (this.f12391istkbnxepw != drawable) {
            this.f12391istkbnxepw = drawable;
            this.f12419zynmafqrjb = 0;
            lmojexxdyd();
        }
    }

    public boolean yadqdtsiqt() {
        return this.f12417ylkuphrtab;
    }

    public final void ydmasvzmpa(eablkybsjg eablkybsjgVar) {
        this.f12397jztzpxfvev = eablkybsjgVar;
        lmojexxdyd();
    }

    public void yfnezrywwk(CharSequence charSequence) {
        if (cqumvgiudr() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f12405pmvmpeiblj, charSequence)) {
            return;
        }
        this.f12405pmvmpeiblj = charSequence;
        lmojexxdyd();
    }

    protected void ylkuphrtab() {
        zoijcleaow zoijcleaowVar = this.f12394jlmebxxoox;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.zoijcleaow(this);
        }
    }

    public androidx.preference.ppxfxbqfkf zdlpuopuiu() {
        gxszxtbevo gxszxtbevoVar = this.f12416yggfygwlhe;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.lqeggnwhkg();
        }
        return null;
    }

    public void zfvoamnweg(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f12399lereixgezr)) {
            return;
        }
        this.f12399lereixgezr = charSequence;
        lmojexxdyd();
    }

    final void zoijcleaow() {
        this.f12393jhduphickx = false;
    }

    public boolean zynmafqrjb() {
        return this.f12402ntlheqmsrt;
    }

    public Preference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.preferenceStyle, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
