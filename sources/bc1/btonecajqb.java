package bc1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.textview.MaterialTextView;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;
import ru.myspar.proloyalty.core.domain.models.product.FilterValue;
import z41.fyldjkxazc;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb extends RelativeLayout {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f15742esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f15743lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final fyldjkxazc f15744cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f15745iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.draadjrbmk f15746jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.draadjrbmk f15747yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final FilterSection f15748zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(((FilterValue) obj).getName(), ((FilterValue) obj2).getName());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(Context context, FilterSection filterSection, tg.draadjrbmk listener, tg.draadjrbmk showAllListener, ColorsUiModel colorsUiModel) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(filterSection, "filterSection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(showAllListener, "showAllListener");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
        this.f15748zdlpuopuiu = filterSection;
        this.f15747yggfygwlhe = listener;
        this.f15746jyumaefscl = showAllListener;
        this.f15745iwizpuwonk = colorsUiModel;
        fyldjkxazc fyldjkxazcVarPpxfxbqfkf = fyldjkxazc.ppxfxbqfkf(p41.dxjokdxxww.nufgyqmvbu(this), this, true);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fyldjkxazcVarPpxfxbqfkf, "inflate(...)");
        this.f15744cqumvgiudr = fyldjkxazcVarPpxfxbqfkf;
        jyumaefscl.d(filterSection.getFilterValues(), new zoijcleaow());
        fyldjkxazcVarPpxfxbqfkf.f128011wkgbmnqykc.setText(filterSection.getName());
        MaterialTextView btnShowAllFilters = fyldjkxazcVarPpxfxbqfkf.f128012zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnShowAllFilters, "btnShowAllFilters");
        btnShowAllFilters.setVisibility(wkgbmnqykc() ? 0 : 8);
        List filterValues = filterSection.getFilterValues();
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterValues) {
            if (((FilterValue) obj).getChecked()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 8) {
            setFilters(arrayList);
        } else if (wkgbmnqykc()) {
            setFilters(this.f15748zdlpuopuiu.getFilterValues().subList(0, 8));
        } else {
            setFilters(this.f15748zdlpuopuiu.getFilterValues());
        }
        this.f15744cqumvgiudr.f128012zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: bc1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btonecajqb.ppxfxbqfkf(this.f15758zdlpuopuiu, view);
            }
        });
        this.f15744cqumvgiudr.f128012zoijcleaow.setTextColor(this.f15745iwizpuwonk.xrmfcynszj(context, ColorsUiModel.iobyxmoadg.PRIMARY));
    }

    private final void eablkybsjg(FilterValue filterValue, boolean z13) {
        List<FilterValue> filterValues = this.f15748zdlpuopuiu.getFilterValues();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(filterValues, 10));
        for (FilterValue filterValuePpxfxbqfkf : filterValues) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(filterValuePpxfxbqfkf, filterValue)) {
                filterValuePpxfxbqfkf = FilterValue.ppxfxbqfkf(filterValue, null, null, z13, false, 11, null);
            }
            arrayList.add(filterValuePpxfxbqfkf);
        }
        this.f15747yggfygwlhe.invoke(FilterSection.ppxfxbqfkf(this.f15748zdlpuopuiu, null, null, arrayList, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(ru.myspar.proloyalty.legacy.presentation.view.filter.wkgbmnqykc wkgbmnqykcVar, btonecajqb btonecajqbVar, FilterValue filterValue, View view) {
        wkgbmnqykcVar.setChecked(!wkgbmnqykcVar.isChecked());
        btonecajqbVar.eablkybsjg(filterValue, wkgbmnqykcVar.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(btonecajqb btonecajqbVar, View view) {
        btonecajqbVar.f15746jyumaefscl.invoke(btonecajqbVar.f15748zdlpuopuiu);
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
    private final void setFilters(List<FilterValue> list) {
        this.f15744cqumvgiudr.f128010ppxfxbqfkf.removeAllViews();
        for (final FilterValue filterValue : list) {
            Context context = getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            final ru.myspar.proloyalty.legacy.presentation.view.filter.wkgbmnqykc wkgbmnqykcVar = new ru.myspar.proloyalty.legacy.presentation.view.filter.wkgbmnqykc(context, null, 0, 6, null);
            wkgbmnqykcVar.setColorsModel(this.f15745iwizpuwonk);
            wkgbmnqykcVar.setTitle(filterValue.getName());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 16, 32, 16);
            wkgbmnqykcVar.setLayoutParams(layoutParams);
            wkgbmnqykcVar.setOnClickListener(new View.OnClickListener() { // from class: bc1.dxjokdxxww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    btonecajqb.gxszxtbevo(wkgbmnqykcVar, this, filterValue, view);
                }
            });
            wkgbmnqykcVar.setChecked(filterValue.getChecked());
            if (filterValue.getDisabled() && !filterValue.getChecked()) {
                wkgbmnqykcVar.setEnabled(false);
                wkgbmnqykcVar.setAlpha(0.5f);
            }
            this.f15744cqumvgiudr.f128010ppxfxbqfkf.addView(wkgbmnqykcVar);
        }
    }

    private final boolean wkgbmnqykc() {
        return this.f15748zdlpuopuiu.getFilterValues().size() > 8;
    }
}
