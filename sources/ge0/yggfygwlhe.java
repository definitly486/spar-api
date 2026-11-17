package ge0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import m60.k;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.product.FilterSection;
import ru.myspar.core.domain.models.product.FilterValue;

/* JADX INFO: loaded from: classes4.dex */
public final class yggfygwlhe extends RelativeLayout {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f37012esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f37013lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final k f37014cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f37015iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.draadjrbmk f37016jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.draadjrbmk f37017yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final FilterSection f37018zdlpuopuiu;

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
    public yggfygwlhe(Context context, FilterSection filterSection, tg.draadjrbmk listener, tg.draadjrbmk showAllListener, ColorsUiModel colorsUiModel) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(filterSection, "filterSection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(showAllListener, "showAllListener");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
        this.f37018zdlpuopuiu = filterSection;
        this.f37017yggfygwlhe = listener;
        this.f37016jyumaefscl = showAllListener;
        this.f37015iwizpuwonk = colorsUiModel;
        k kVarPpxfxbqfkf = k.ppxfxbqfkf(c60.nufgyqmvbu.nufgyqmvbu(this), this, true);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kVarPpxfxbqfkf, "inflate(...)");
        this.f37014cqumvgiudr = kVarPpxfxbqfkf;
        hg.jyumaefscl.d(filterSection.getFilterValues(), new zoijcleaow());
        kVarPpxfxbqfkf.f65686wkgbmnqykc.setText(filterSection.getName());
        MaterialTextView btnShowAllFilters = kVarPpxfxbqfkf.f65687zoijcleaow;
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
            setFilters(this.f37018zdlpuopuiu.getFilterValues().subList(0, 8));
        } else {
            setFilters(this.f37018zdlpuopuiu.getFilterValues());
        }
        this.f37014cqumvgiudr.f65687zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ge0.zdlpuopuiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yggfygwlhe.ppxfxbqfkf(this.f37019zdlpuopuiu, view);
            }
        });
        this.f37014cqumvgiudr.f65687zoijcleaow.setTextColor(this.f37015iwizpuwonk.wypolnanlu(context, ColorsUiModel.iobyxmoadg.PRIMARY));
    }

    private final void eablkybsjg(FilterValue filterValue, boolean z13) {
        List<FilterValue> filterValues = this.f37018zdlpuopuiu.getFilterValues();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(filterValues, 10));
        for (FilterValue filterValuePpxfxbqfkf : filterValues) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(filterValuePpxfxbqfkf, filterValue)) {
                filterValuePpxfxbqfkf = FilterValue.ppxfxbqfkf(filterValue, null, null, z13, false, 11, null);
            }
            arrayList.add(filterValuePpxfxbqfkf);
        }
        this.f37017yggfygwlhe.invoke(FilterSection.ppxfxbqfkf(this.f37018zdlpuopuiu, null, null, arrayList, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(ru.myspar.legacy.presentation.view.filter.wkgbmnqykc wkgbmnqykcVar, yggfygwlhe yggfygwlheVar, FilterValue filterValue, View view) {
        wkgbmnqykcVar.setChecked(!wkgbmnqykcVar.isChecked());
        yggfygwlheVar.eablkybsjg(filterValue, wkgbmnqykcVar.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(yggfygwlhe yggfygwlheVar, View view) {
        yggfygwlheVar.f37016jyumaefscl.invoke(yggfygwlheVar.f37018zdlpuopuiu);
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
        this.f37014cqumvgiudr.f65685ppxfxbqfkf.removeAllViews();
        for (final FilterValue filterValue : list) {
            Context context = getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            final ru.myspar.legacy.presentation.view.filter.wkgbmnqykc wkgbmnqykcVar = new ru.myspar.legacy.presentation.view.filter.wkgbmnqykc(context, null, 0, 6, null);
            wkgbmnqykcVar.setColorsModel(this.f37015iwizpuwonk);
            wkgbmnqykcVar.setTitle(filterValue.getName());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 16, 32, 16);
            wkgbmnqykcVar.setLayoutParams(layoutParams);
            wkgbmnqykcVar.setOnClickListener(new View.OnClickListener() { // from class: ge0.kcexrzcfyt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yggfygwlhe.gxszxtbevo(wkgbmnqykcVar, this, filterValue, view);
                }
            });
            wkgbmnqykcVar.setChecked(filterValue.getChecked());
            if (filterValue.getDisabled() && !filterValue.getChecked()) {
                wkgbmnqykcVar.setEnabled(false);
                wkgbmnqykcVar.setAlpha(0.5f);
            }
            this.f37014cqumvgiudr.f65685ppxfxbqfkf.addView(wkgbmnqykcVar);
        }
    }

    private final boolean wkgbmnqykc() {
        return this.f37018zdlpuopuiu.getFilterValues().size() > 8;
    }
}
