package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements gtknphoqwx.iobyxmoadg, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f2761cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private CheckBox f2762cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private TextView f2763esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f2764iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Drawable f2765istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private TextView f2766iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private RadioButton f2767jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ImageView f2768lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private Drawable f2769lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f2770pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ImageView f2771pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f2772wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Context f2773yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ImageView f2774yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private LayoutInflater f2775ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private lqeggnwhkg f2776zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private LinearLayout f2777zynmafqrjb;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f2775ylkuphrtab == null) {
            this.f2775ylkuphrtab = LayoutInflater.from(getContext());
        }
        return this.f2775ylkuphrtab;
    }

    private void gxszxtbevo() {
        ImageView imageView = (ImageView) getInflater().inflate(lqeggnwhkg.lqeggnwhkg.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f2774yggfygwlhe = imageView;
        zoijcleaow(imageView, 0);
    }

    private void iobyxmoadg(View view) {
        zoijcleaow(view, -1);
    }

    private void lqeggnwhkg() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(lqeggnwhkg.lqeggnwhkg.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f2767jyumaefscl = radioButton;
        iobyxmoadg(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z13) {
        ImageView imageView = this.f2768lereixgezr;
        if (imageView != null) {
            imageView.setVisibility(z13 ? 0 : 8);
        }
    }

    private void wkgbmnqykc() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(lqeggnwhkg.lqeggnwhkg.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f2762cqumvgiudr = checkBox;
        iobyxmoadg(checkBox);
    }

    private void zoijcleaow(View view, int i13) {
        LinearLayout linearLayout = this.f2777zynmafqrjb;
        if (linearLayout != null) {
            linearLayout.addView(view, i13);
        } else {
            addView(view, i13);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2771pmvmpeiblj;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2771pmvmpeiblj.getLayoutParams();
        rect.top += this.f2771pmvmpeiblj.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public boolean eablkybsjg() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public lqeggnwhkg getItemData() {
        return this.f2776zdlpuopuiu;
    }

    public void nufgyqmvbu(boolean z13, char c13) {
        int i13 = (z13 && this.f2776zdlpuopuiu.pmvmpeiblj()) ? 0 : 8;
        if (i13 == 0) {
            this.f2763esjtqupxsv.setText(this.f2776zdlpuopuiu.nufgyqmvbu());
        }
        if (this.f2763esjtqupxsv.getVisibility() != i13) {
            this.f2763esjtqupxsv.setVisibility(i13);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f2765istkbnxepw);
        TextView textView = (TextView) findViewById(lqeggnwhkg.gxszxtbevo.title);
        this.f2766iwizpuwonk = textView;
        int i13 = this.f2761cdpycssgdh;
        if (i13 != -1) {
            textView.setTextAppearance(this.f2773yadqdtsiqt, i13);
        }
        this.f2763esjtqupxsv = (TextView) findViewById(lqeggnwhkg.gxszxtbevo.shortcut);
        ImageView imageView = (ImageView) findViewById(lqeggnwhkg.gxszxtbevo.submenuarrow);
        this.f2768lereixgezr = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2769lmojexxdyd);
        }
        this.f2771pmvmpeiblj = (ImageView) findViewById(lqeggnwhkg.gxszxtbevo.group_divider);
        this.f2777zynmafqrjb = (LinearLayout) findViewById(lqeggnwhkg.gxszxtbevo.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        if (this.f2774yggfygwlhe != null && this.f2764iozdgvuglv) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2774yggfygwlhe.getLayoutParams();
            int i15 = layoutParams.height;
            if (i15 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i15;
            }
        }
        super.onMeasure(i13, i14);
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public void ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, int i13) {
        this.f2776zdlpuopuiu = lqeggnwhkgVar;
        setVisibility(lqeggnwhkgVar.isVisible() ? 0 : 8);
        setTitle(lqeggnwhkgVar.dxjokdxxww(this));
        setCheckable(lqeggnwhkgVar.isCheckable());
        nufgyqmvbu(lqeggnwhkgVar.pmvmpeiblj(), lqeggnwhkgVar.lqeggnwhkg());
        setIcon(lqeggnwhkgVar.getIcon());
        setEnabled(lqeggnwhkgVar.isEnabled());
        setSubMenuArrowVisible(lqeggnwhkgVar.hasSubMenu());
        setContentDescription(lqeggnwhkgVar.getContentDescription());
    }

    public void setCheckable(boolean z13) {
        CompoundButton compoundButton;
        View view;
        if (!z13 && this.f2767jyumaefscl == null && this.f2762cqumvgiudr == null) {
            return;
        }
        if (this.f2776zdlpuopuiu.wflxmlrfwp()) {
            if (this.f2767jyumaefscl == null) {
                lqeggnwhkg();
            }
            compoundButton = this.f2767jyumaefscl;
            view = this.f2762cqumvgiudr;
        } else {
            if (this.f2762cqumvgiudr == null) {
                wkgbmnqykc();
            }
            compoundButton = this.f2762cqumvgiudr;
            view = this.f2767jyumaefscl;
        }
        if (z13) {
            compoundButton.setChecked(this.f2776zdlpuopuiu.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2762cqumvgiudr;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2767jyumaefscl;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z13) {
        CompoundButton compoundButton;
        if (this.f2776zdlpuopuiu.wflxmlrfwp()) {
            if (this.f2767jyumaefscl == null) {
                lqeggnwhkg();
            }
            compoundButton = this.f2767jyumaefscl;
        } else {
            if (this.f2762cqumvgiudr == null) {
                wkgbmnqykc();
            }
            compoundButton = this.f2762cqumvgiudr;
        }
        compoundButton.setChecked(z13);
    }

    public void setForceShowIcon(boolean z13) {
        this.f2770pkzmftpjix = z13;
        this.f2764iozdgvuglv = z13;
    }

    public void setGroupDividerEnabled(boolean z13) {
        ImageView imageView = this.f2771pmvmpeiblj;
        if (imageView != null) {
            imageView.setVisibility((this.f2772wwaezpbzkn || !z13) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z13 = this.f2776zdlpuopuiu.lereixgezr() || this.f2770pkzmftpjix;
        if (z13 || this.f2764iozdgvuglv) {
            ImageView imageView = this.f2774yggfygwlhe;
            if (imageView == null && drawable == null && !this.f2764iozdgvuglv) {
                return;
            }
            if (imageView == null) {
                gxszxtbevo();
            }
            if (drawable == null && !this.f2764iozdgvuglv) {
                this.f2774yggfygwlhe.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f2774yggfygwlhe;
            if (!z13) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f2774yggfygwlhe.getVisibility() != 0) {
                this.f2774yggfygwlhe.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2766iwizpuwonk.getVisibility() != 8) {
                this.f2766iwizpuwonk.setVisibility(8);
            }
        } else {
            this.f2766iwizpuwonk.setText(charSequence);
            if (this.f2766iwizpuwonk.getVisibility() != 0) {
                this.f2766iwizpuwonk.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(getContext(), attributeSet, lqeggnwhkg.btonecajqb.MenuView, i13, 0);
        this.f2765istkbnxepw = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.MenuView_android_itemBackground);
        this.f2761cdpycssgdh = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.MenuView_android_itemTextAppearance, -1);
        this.f2764iozdgvuglv = mbcevpiqjqVarJyumaefscl.iobyxmoadg(lqeggnwhkg.btonecajqb.MenuView_preserveIconSpacing, false);
        this.f2773yadqdtsiqt = context;
        this.f2769lmojexxdyd = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, lqeggnwhkg.iobyxmoadg.dropDownListViewStyle, 0);
        this.f2772wwaezpbzkn = typedArrayObtainStyledAttributes.hasValue(0);
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        typedArrayObtainStyledAttributes.recycle();
    }
}
