package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c60.nufgyqmvbu;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.e;
import m60.f;
import mo.zoijcleaow;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.legacy.presentation.view.ComboSetView;
import s40.eablkybsjg;
import t40.dxjokdxxww;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u001b\u0010\u0013J'\u0010 \u001a\u00020\r2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\"¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\"¢\u0006\u0004\b%\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R*\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R$\u0010<\u001a\u00020:2\u0006\u0010;\u001a\u00020:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/myspar/legacy/presentation/view/ComboSetView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm60/f;", "Lqu/iobyxmoadg;", "comboSet", "Lgg/wwaezpbzkn;", "draadjrbmk", "(Lm60/f;Lqu/iobyxmoadg;)V", "", "comboSetList", "rgvfuqvkyq", "(Ljava/util/List;)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "titleRes", "setTitleRes", "(I)V", "setComboSetList", "Lkotlin/Function2;", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "Lmo/zoijcleaow;", "action", "setActionClickedCardProduct", "(Ltg/rgvfuqvkyq;)V", "Lkotlin/Function1;", "setActionClickedShowAllCombo", "(Ltg/draadjrbmk;)V", "setActionClickedBtnAddComboToCart", "Lm60/e;", "zdlpuopuiu", "Lm60/e;", "binding", "Lwa0/iobyxmoadg;", "yggfygwlhe", "Lgg/gtknphoqwx;", "getComboSetAdapter", "()Lwa0/iobyxmoadg;", "comboSetAdapter", "jyumaefscl", "Ljava/lang/String;", "iwizpuwonk", "Ltg/rgvfuqvkyq;", "onClickedCardProduct", "cqumvgiudr", "Ltg/draadjrbmk;", "onClickedShowAllCombo", "esjtqupxsv", "onClickedBtnAddComboToCart", "", "value", "isVisible", "()Z", "setVisible", "(Z)V", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComboSetView extends FrameLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onClickedShowAllCombo;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onClickedBtnAddComboToCart;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private rgvfuqvkyq onClickedCardProduct;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx comboSetAdapter;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final e binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComboSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(ComboSetView comboSetView, qu.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = comboSetView.onClickedShowAllCombo;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(ComboSetView comboSetView, qu.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = comboSetView.onClickedShowAllCombo;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void draadjrbmk(f fVar, qu.iobyxmoadg iobyxmoadgVar) {
        fVar.f65500ppxfxbqfkf.setText(this.title);
        ComboSetCardItemView comboSetCardItemView = fVar.f65501zoijcleaow;
        comboSetCardItemView.setComboSetUiModel(iobyxmoadgVar);
        comboSetCardItemView.setActionClickedCardProductCombo(new rgvfuqvkyq() { // from class: ge0.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ComboSetView.wflxmlrfwp(this.f36981zdlpuopuiu, (ComboSetProduct) obj, (mo.zoijcleaow) obj2);
            }
        });
        comboSetCardItemView.setActionClickedBtnShowAllCombo(new draadjrbmk() { // from class: ge0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ComboSetView.agtfadlqog(this.f36976zdlpuopuiu, (qu.iobyxmoadg) obj);
            }
        });
        comboSetCardItemView.setActionClickedBtnAddComboToCart(new draadjrbmk() { // from class: ge0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ComboSetView.ojitshcjhn(this.f36984zdlpuopuiu, (qu.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(ComboSetView comboSetView, ComboSetProduct product, zoijcleaow analyticsData) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        rgvfuqvkyq rgvfuqvkyqVar = comboSetView.onClickedCardProduct;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.invoke(product, analyticsData);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wa0.iobyxmoadg getComboSetAdapter() {
        return (wa0.iobyxmoadg) this.comboSetAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ComboSetView comboSetView, qu.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = comboSetView.onClickedBtnAddComboToCart;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wa0.iobyxmoadg nufgyqmvbu(final ComboSetView comboSetView) {
        return new wa0.iobyxmoadg(new rgvfuqvkyq() { // from class: ge0.draadjrbmk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ComboSetView.dxjokdxxww(this.f36980zdlpuopuiu, (ComboSetProduct) obj, (mo.zoijcleaow) obj2);
            }
        }, new draadjrbmk() { // from class: ge0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ComboSetView.btonecajqb(this.f37008zdlpuopuiu, (qu.iobyxmoadg) obj);
            }
        }, new draadjrbmk() { // from class: ge0.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ComboSetView.gtknphoqwx(this.f36975zdlpuopuiu, (qu.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(ComboSetView comboSetView, qu.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = comboSetView.onClickedBtnAddComboToCart;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void rgvfuqvkyq(List comboSetList) {
        getComboSetAdapter().wkgbmnqykc(comboSetList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(ComboSetView comboSetView, ComboSetProduct product, zoijcleaow analyticsData) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        rgvfuqvkyq rgvfuqvkyqVar = comboSetView.onClickedCardProduct;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.invoke(product, analyticsData);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void setActionClickedBtnAddComboToCart(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onClickedBtnAddComboToCart = action;
    }

    public final void setActionClickedCardProduct(rgvfuqvkyq action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onClickedCardProduct = action;
    }

    public final void setActionClickedShowAllCombo(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onClickedShowAllCombo = action;
    }

    public final void setComboSetList(List<qu.iobyxmoadg> comboSetList) {
        zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        if (comboSetList.isEmpty()) {
            setVisible(false);
            LinearLayout root = this.binding.f65476wkgbmnqykc.getRoot();
            zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
            root.setVisibility(8);
            LinearLayout root2 = this.binding.f65475ppxfxbqfkf.getRoot();
            zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
            root2.setVisibility(8);
            LinearLayout root3 = this.binding.f65477zoijcleaow.getRoot();
            zdlpuopuiu.dxjokdxxww(root3, "getRoot(...)");
            root3.setVisibility(8);
            getComboSetAdapter().wkgbmnqykc(jyumaefscl.wflxmlrfwp());
            return;
        }
        if (comboSetList.size() != 1) {
            rgvfuqvkyq(comboSetList);
            LinearLayout root4 = this.binding.f65476wkgbmnqykc.getRoot();
            zdlpuopuiu.dxjokdxxww(root4, "getRoot(...)");
            root4.setVisibility(8);
            LinearLayout root5 = this.binding.f65475ppxfxbqfkf.getRoot();
            zdlpuopuiu.dxjokdxxww(root5, "getRoot(...)");
            root5.setVisibility(8);
            LinearLayout root6 = this.binding.f65477zoijcleaow.getRoot();
            zdlpuopuiu.dxjokdxxww(root6, "getRoot(...)");
            root6.setVisibility(0);
            return;
        }
        f containerComboSingle = this.binding.f65475ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(containerComboSingle, "containerComboSingle");
        draadjrbmk(containerComboSingle, (qu.iobyxmoadg) jyumaefscl.opjhrmiecq(comboSetList));
        LinearLayout root7 = this.binding.f65476wkgbmnqykc.getRoot();
        zdlpuopuiu.dxjokdxxww(root7, "getRoot(...)");
        root7.setVisibility(8);
        LinearLayout root8 = this.binding.f65475ppxfxbqfkf.getRoot();
        zdlpuopuiu.dxjokdxxww(root8, "getRoot(...)");
        root8.setVisibility(0);
        LinearLayout root9 = this.binding.f65477zoijcleaow.getRoot();
        zdlpuopuiu.dxjokdxxww(root9, "getRoot(...)");
        root9.setVisibility(8);
        getComboSetAdapter().wkgbmnqykc(jyumaefscl.wflxmlrfwp());
    }

    public final void setTitle(String title) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.title = title;
        this.binding.f65477zoijcleaow.f65427ppxfxbqfkf.setText(title);
        this.binding.f65475ppxfxbqfkf.f65500ppxfxbqfkf.setText(title);
    }

    public final void setTitleRes(int titleRes) {
        String string = getContext().getString(titleRes);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        setTitle(string);
    }

    public final void setVisible(boolean z13) {
        FrameLayout root = this.binding.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(z13 ? 0 : 8);
    }

    public /* synthetic */ ComboSetView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboSetView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        e eVarPpxfxbqfkf = e.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(eVarPpxfxbqfkf, "inflate(...)");
        this.binding = eVarPpxfxbqfkf;
        this.comboSetAdapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ge0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ComboSetView.nufgyqmvbu(this.f36999zdlpuopuiu);
            }
        });
        RecyclerView recyclerView = eVarPpxfxbqfkf.f65477zoijcleaow.f65428zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        e60.zoijcleaow.ppxfxbqfkf(recyclerView, getComboSetAdapter(), eVarPpxfxbqfkf);
        new dxjokdxxww(2).attachToRecyclerView(recyclerView);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new t40.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
    }
}
