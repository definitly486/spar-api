package kk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class metgxyhuhe extends RecyclerView.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f57636iobyxmoadg;

    public metgxyhuhe(List payments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payments, "payments");
        this.f57636iobyxmoadg = payments;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final int getItemCount() {
        return this.f57636iobyxmoadg.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final void onBindViewHolder(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
        yadqdtsiqt holder = (yadqdtsiqt) iozdgvuglvVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(holder, "holder");
        eg0 eg0Var = (eg0) this.f57636iobyxmoadg.get(i13);
        AppCompatTextView appCompatTextView = holder.f59406ppxfxbqfkf;
        vu vuVar = eg0Var.f56419iobyxmoadg;
        Context context = holder.itemView.getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "itemView.context");
        appCompatTextView.setText(zv.iobyxmoadg(vuVar, context));
        AppCompatTextView actvAmount = holder.f59407wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(actvAmount, "actvAmount");
        long j13 = eg0Var.f56422zoijcleaow;
        int i14 = R.string.spay_rub_amount_template;
        String str = eg0Var.f56420ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actvAmount, "<this>");
        Context context2 = actvAmount.getContext();
        String strZoijcleaow = qa0.zoijcleaow(j13);
        if (str == null) {
            str = "";
        }
        actvAmount.setText(context2.getString(i14, strZoijcleaow, str));
        if (eg0Var.f56421wkgbmnqykc) {
            AppCompatTextView actvWriteOffDate = holder.f59406ppxfxbqfkf;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(actvWriteOffDate, "actvWriteOffDate");
            actvWriteOffDate.setTextAppearance(R.style.SpayMainTextStyle);
            actvWriteOffDate.setTextSize(0, actvWriteOffDate.getResources().getDimension(R.dimen.spay_bnpl_graph_bold_text_size));
            actvWriteOffDate.setTypeface(actvWriteOffDate.getTypeface(), 1);
            AppCompatTextView actvAmount2 = holder.f59407wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(actvAmount2, "actvAmount");
            actvAmount2.setTextAppearance(R.style.SpayMainTextStyle);
            actvAmount2.setTextSize(0, actvAmount2.getResources().getDimension(R.dimen.spay_bnpl_graph_bold_text_size));
            actvAmount2.setTypeface(actvAmount2.getTypeface(), 1);
            AppCompatImageView appCompatImageView = holder.f59408zoijcleaow;
            View itemView = holder.itemView;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(itemView, "itemView");
            int i15 = R.color.spay_main_bank_green_color;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemView, "<this>");
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i1.nufgyqmvbu.wkgbmnqykc(itemView.getResources(), i15, null)));
            AppCompatImageView acivBulletBackground = holder.f59405iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(acivBulletBackground, "acivBulletBackground");
            acivBulletBackground.setVisibility(!eg0Var.f56418eablkybsjg ? 0 : 8);
        }
        AppCompatImageView divider = holder.f59404eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(divider, "divider");
        divider.setVisibility(eg0Var.f56418eablkybsjg ? 4 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.spay_payment_in_installments_item, parent, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewInflate, "from(parent.context)\n   …ents_item, parent, false)");
        return new yadqdtsiqt(viewInflate);
    }
}
